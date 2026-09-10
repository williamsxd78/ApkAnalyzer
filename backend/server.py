"""APKLens backend — Android APK static analysis API."""
import os
import asyncio
import shutil
import tempfile
import logging
import uuid
from concurrent.futures import ThreadPoolExecutor
from datetime import datetime, timezone
from pathlib import Path
from typing import Optional

from fastapi import FastAPI, APIRouter, UploadFile, File, HTTPException, Query
from dotenv import load_dotenv
from starlette.middleware.cors import CORSMiddleware
from motor.motor_asyncio import AsyncIOMotorClient
from pydantic import BaseModel

import scanner
from engine import check_engines, run_jadx, run_apktool, EngineError
import object_storage

ROOT_DIR = Path(__file__).parent
load_dotenv(ROOT_DIR / ".env")

mongo_url = os.environ["MONGO_URL"]
client = AsyncIOMotorClient(mongo_url)
db = client[os.environ["DB_NAME"]]

WORKSPACE = Path(os.environ.get("SCAN_WORKSPACE", str(ROOT_DIR / "scan_workspace")))
WORKSPACE.mkdir(parents=True, exist_ok=True)
DEFAULT_JADX = os.environ.get("JADX_BIN", "/opt/engines/jadx/bin/jadx")
DEFAULT_APKTOOL = os.environ.get("APKTOOL_BIN", "/opt/engines/apktool")

EXECUTOR = ThreadPoolExecutor(max_workers=2)

logging.basicConfig(level=logging.INFO,
                    format="%(asctime)s - %(name)s - %(levelname)s - %(message)s")
logger = logging.getLogger("apklens")

app = FastAPI(title="APKLens")
api = APIRouter(prefix="/api")


def now_iso():
    return datetime.now(timezone.utc).isoformat()


def new_id():
    return str(uuid.uuid4())


# --------------------------------------------------------------------------
# Models
# --------------------------------------------------------------------------
class SettingsIn(BaseModel):
    jadx_bin: str
    apktool_bin: str


class RuleIn(BaseModel):
    name: str
    pattern: str
    pattern_type: str = "regex"  # regex | string
    severity: str = "medium"
    enabled: bool = True


class TriageIn(BaseModel):
    triage_state: str  # open | confirmed | false_positive | dismissed


class DeobIn(BaseModel):
    text: str
    method: str = "auto"


# --------------------------------------------------------------------------
# Settings
# --------------------------------------------------------------------------
async def get_settings():
    doc = await db.settings.find_one({"_id": "engines"})
    if not doc:
        doc = {"_id": "engines", "jadx_bin": DEFAULT_JADX, "apktool_bin": DEFAULT_APKTOOL}
        await db.settings.insert_one(doc)
    return doc


@api.get("/settings")
async def read_settings():
    s = await get_settings()
    engines = check_engines(s["jadx_bin"], s["apktool_bin"])
    return {"jadx_bin": s["jadx_bin"], "apktool_bin": s["apktool_bin"], "engines": engines}


@api.put("/settings")
async def update_settings(body: SettingsIn):
    await db.settings.update_one(
        {"_id": "engines"},
        {"$set": {"jadx_bin": body.jadx_bin, "apktool_bin": body.apktool_bin}},
        upsert=True,
    )
    return await read_settings()


# --------------------------------------------------------------------------
# Scan job
# --------------------------------------------------------------------------
async def _set(scan_id, **fields):
    fields["updated_at"] = now_iso()
    await db.scans.update_one({"id": scan_id}, {"$set": fields})


def _scan_directory_sync(scan_dir: str, rules: list):
    findings = []
    for rel, text in scanner.iter_scan_files(scan_dir):
        findings.extend(scanner.scan_text_file(rel, text))
        for rule in rules:
            findings.extend(scanner.scan_custom_rule(rel, text, rule))
    manifest = os.path.join(scan_dir, "apktool", "AndroidManifest.xml")
    findings.extend(scanner.audit_manifest(manifest))
    return findings


async def _persist_findings(scan_id, findings):
    if not findings:
        return
    docs = []
    for f in findings:
        f = dict(f)
        f["id"] = new_id()
        f["scan_id"] = scan_id
        f.setdefault("triage_state", "open")
        f.setdefault("tags", [])
        f["created_at"] = now_iso()
        docs.append(f)
    for i in range(0, len(docs), 1000):
        await db.findings.insert_many(docs[i:i + 1000])


TELEMETRY_EXECUTOR = ThreadPoolExecutor(max_workers=1)


async def _telemetry_monitor(scan_id: str, out_dir: str, stop: asyncio.Event):
    """Periodically record how many files JADX has produced (off the event loop)."""
    loop = asyncio.get_event_loop()
    while not stop.is_set():
        try:
            n = await loop.run_in_executor(TELEMETRY_EXECUTOR, _count_files, os.path.join(out_dir, "jadx"))
            await db.scans.update_one({"id": scan_id}, {"$set": {"decompiled_files": n}})
        except Exception:  # noqa
            pass
        try:
            await asyncio.wait_for(stop.wait(), timeout=2.0)
        except asyncio.TimeoutError:
            pass


def _count_files(base: str) -> int:
    if not os.path.isdir(base):
        return 0
    n = 0
    for _root, _dirs, files in os.walk(base):
        n += len(files)
        if n > 200000:
            break
    return n


async def run_scan_job(scan_id: str, tmp_apk: str, out_dir: str, storage_path: str):
    loop = asyncio.get_event_loop()
    s = await get_settings()
    stop = asyncio.Event()
    monitor = asyncio.create_task(_telemetry_monitor(scan_id, out_dir, stop))
    try:
        # Persist the APK blob to object storage (streamed from disk, best-effort, non-fatal).
        await _set(scan_id, status="decompiling", stage="Storing APK", progress=8, decompiled_files=0)
        try:
            await loop.run_in_executor(EXECUTOR, object_storage.put_object_file, storage_path, tmp_apk)
        except Exception as exc:  # noqa
            logger.warning("object storage upload failed (continuing with local copy): %s", exc)

        await _set(scan_id, status="decompiling", stage="Running JADX decompiler", progress=15)
        await loop.run_in_executor(EXECUTOR, run_jadx, s["jadx_bin"], tmp_apk, out_dir)

        await _set(scan_id, status="decompiling", stage="Running apktool (manifest/resources)", progress=45)
        await loop.run_in_executor(EXECUTOR, run_apktool, s["apktool_bin"], tmp_apk, out_dir)

        await _set(scan_id, status="scanning", stage="Scanning for secrets, endpoints & vulns", progress=70)
        rules = await db.custom_rules.find({"enabled": True}, {"_id": 0}).to_list(500)
        findings = await loop.run_in_executor(EXECUTOR, _scan_directory_sync, out_dir, rules)
        await _persist_findings(scan_id, findings)

        counts = await _count_summary(scan_id)
        await _set(scan_id, status="complete", stage="Scan complete", progress=100,
                   counts=counts, finished_at=now_iso())
    except EngineError as exc:
        logger.exception("engine failure")
        await _set(scan_id, status="failed", stage="Failed", error=str(exc))
    except Exception as exc:  # noqa
        logger.exception("scan failure")
        await _set(scan_id, status="failed", stage="Failed", error=f"Unexpected error: {exc}")
    finally:
        stop.set()
        try:
            await monitor
        except Exception:  # noqa
            pass
        if os.path.exists(tmp_apk):
            os.unlink(tmp_apk)


async def _count_summary(scan_id):
    pipeline = [{"$match": {"scan_id": scan_id}},
                {"$group": {"_id": {"c": "$category", "s": "$severity"}, "n": {"$sum": 1}}}]
    by_cat, by_sev, total = {}, {}, 0
    async for row in db.findings.aggregate(pipeline):
        cat, sev, n = row["_id"]["c"], row["_id"]["s"], row["n"]
        by_cat[cat] = by_cat.get(cat, 0) + n
        by_sev[sev] = by_sev.get(sev, 0) + n
        total += n
    return {"total": total, "by_category": by_cat, "by_severity": by_sev}


# --------------------------------------------------------------------------
# Upload & scans
# --------------------------------------------------------------------------
@api.post("/scans/upload")
async def upload_apk(file: UploadFile = File(...)):
    if not file.filename.lower().endswith(".apk"):
        raise HTTPException(400, "Only .apk files are supported.")
    scan_id = new_id()
    out_dir = WORKSPACE / scan_id
    out_dir.mkdir(parents=True, exist_ok=True)

    # Stream multipart body to a temp file on disk (never fully in memory).
    tmp = tempfile.NamedTemporaryFile(delete=False, suffix=".apk")
    size = 0
    try:
        while chunk := await file.read(1024 * 1024):
            tmp.write(chunk)
            size += len(chunk)
    finally:
        tmp.close()

    storage_path = f"{object_storage.APP_NAME}/uploads/{scan_id}.apk"
    doc = {
        "id": scan_id, "filename": file.filename, "size": size,
        "storage_path": storage_path,
        "status": "queued", "stage": "Queued", "progress": 0,
        "error": None, "counts": {"total": 0, "by_category": {}, "by_severity": {}},
        "is_sample": False, "created_at": now_iso(), "updated_at": now_iso(),
    }
    await db.scans.insert_one(doc)
    # Heavy work (object-storage upload + decompile + scan) runs in the background
    # so the HTTP response returns immediately and the UI never blocks.
    asyncio.create_task(run_scan_job(scan_id, tmp.name, str(out_dir), storage_path))
    doc.pop("_id", None)
    return doc


@api.get("/scans")
async def list_scans():
    return await db.scans.find({}, {"_id": 0}).sort("created_at", -1).to_list(200)


@api.get("/scans/{scan_id}")
async def get_scan(scan_id: str):
    doc = await db.scans.find_one({"id": scan_id}, {"_id": 0})
    if not doc:
        raise HTTPException(404, "Scan not found")
    doc["counts"] = await _count_summary(scan_id)
    return doc


@api.delete("/scans/{scan_id}")
async def delete_scan(scan_id: str):
    await db.findings.delete_many({"scan_id": scan_id})
    await db.scans.delete_one({"id": scan_id})
    shutil.rmtree(WORKSPACE / scan_id, ignore_errors=True)
    return {"deleted": scan_id}


@api.post("/scans/{scan_id}/rescan")
async def rescan_custom(scan_id: str):
    scan = await db.scans.find_one({"id": scan_id}, {"_id": 0})
    if not scan:
        raise HTTPException(404, "Scan not found")
    out_dir = WORKSPACE / scan_id
    if not out_dir.exists():
        raise HTTPException(400, "Decompiled sources are no longer available.")
    rules = await db.custom_rules.find({"enabled": True}, {"_id": 0}).to_list(500)
    await db.findings.delete_many({"scan_id": scan_id, "category": "custom"})
    loop = asyncio.get_event_loop()

    def _run():
        out = []
        for rel, text in scanner.iter_scan_files(str(out_dir)):
            for rule in rules:
                out.extend(scanner.scan_custom_rule(rel, text, rule))
        return out

    findings = await loop.run_in_executor(EXECUTOR, _run)
    await _persist_findings(scan_id, findings)
    counts = await _count_summary(scan_id)
    await _set(scan_id, counts=counts)
    return {"added": len(findings), "counts": counts}


# --------------------------------------------------------------------------
# File tree & source serving
# --------------------------------------------------------------------------
def _safe_join(scan_id: str, rel: str) -> Path:
    base = (WORKSPACE / scan_id).resolve()
    target = (base / rel).resolve()
    if not str(target).startswith(str(base)):
        raise HTTPException(400, "Invalid path")
    return target


@api.get("/scans/{scan_id}/tree")
async def file_tree(scan_id: str):
    base = WORKSPACE / scan_id
    if not base.exists():
        raise HTTPException(404, "Sources not found")
    root = {"name": scan_id, "path": "", "type": "dir", "children": {}}
    count = 0
    for dirpath, _dirs, files in os.walk(base):
        for fn in files:
            if fn == "upload.apk":
                continue
            count += 1
            if count > 8000:
                break
            full = Path(dirpath) / fn
            rel = full.relative_to(base)
            node = root
            parts = rel.parts
            for i, part in enumerate(parts):
                is_file = i == len(parts) - 1
                if is_file:
                    node["children"][part] = {"name": part, "path": str(rel), "type": "file"}
                else:
                    if part not in node["children"]:
                        node["children"][part] = {
                            "name": part, "path": str(Path(*parts[:i + 1])),
                            "type": "dir", "children": {}}
                    node = node["children"][part]

    def to_list(n):
        if n["type"] == "file":
            return n
        kids = sorted(n["children"].values(),
                      key=lambda x: (x["type"] == "file", x["name"].lower()))
        return {"name": n["name"], "path": n["path"], "type": "dir",
                "children": [to_list(k) for k in kids]}

    return to_list(root)


@api.get("/scans/{scan_id}/file")
async def get_file(scan_id: str, path: str = Query(...), start: int = 0, limit: int = 2000):
    target = _safe_join(scan_id, path)
    if not target.is_file():
        raise HTTPException(404, "File not found")
    if target.stat().st_size > scanner.MAX_FILE_BYTES:
        raise HTTPException(413, "File too large to preview")
    with open(target, "r", encoding="utf-8", errors="ignore") as fh:
        lines = fh.read().split("\n")
    total = len(lines)
    chunk = lines[start:start + limit]
    return {"path": path, "start": start, "total_lines": total,
            "lines": chunk, "eof": start + limit >= total}


# --------------------------------------------------------------------------
# Findings
# --------------------------------------------------------------------------
@api.get("/scans/{scan_id}/findings")
async def list_findings(scan_id: str,
                        category: Optional[str] = None,
                        severity: Optional[str] = None,
                        triage: Optional[str] = None,
                        q: Optional[str] = None,
                        file: Optional[str] = None,
                        skip: int = 0, limit: int = 100):
    query = {"scan_id": scan_id}
    if category:
        query["category"] = category
    if severity:
        query["severity"] = severity
    if triage:
        query["triage_state"] = triage
    if file:
        query["file"] = file
    if q:
        rx = {"$regex": q, "$options": "i"}
        query["$or"] = [{"value": rx}, {"type": rx}, {"file": rx}, {"context": rx}]
    total = await db.findings.count_documents(query)
    sev_order = {"critical": 0, "high": 1, "medium": 2, "low": 3, "info": 4}
    items = await db.findings.find(query, {"_id": 0}).skip(skip).limit(min(limit, 500)).to_list(min(limit, 500))
    items.sort(key=lambda f: sev_order.get(f.get("severity"), 9))
    return {"total": total, "skip": skip, "limit": limit, "items": items}


@api.get("/scans/{scan_id}/summary")
async def scan_summary(scan_id: str):
    return await _count_summary(scan_id)


@api.patch("/findings/{finding_id}/triage")
async def set_triage(finding_id: str, body: TriageIn):
    res = await db.findings.update_one(
        {"id": finding_id}, {"$set": {"triage_state": body.triage_state}})
    if res.matched_count == 0:
        raise HTTPException(404, "Finding not found")
    return await db.findings.find_one({"id": finding_id}, {"_id": 0})


# --------------------------------------------------------------------------
# Custom rules
# --------------------------------------------------------------------------
@api.get("/rules")
async def list_rules():
    return await db.custom_rules.find({}, {"_id": 0}).sort("created_at", -1).to_list(500)


@api.post("/rules")
async def create_rule(body: RuleIn):
    doc = body.model_dump()
    doc["id"] = new_id()
    doc["created_at"] = now_iso()
    await db.custom_rules.insert_one(doc)
    doc.pop("_id", None)
    return doc


@api.put("/rules/{rule_id}")
async def update_rule(rule_id: str, body: RuleIn):
    res = await db.custom_rules.update_one({"id": rule_id}, {"$set": body.model_dump()})
    if res.matched_count == 0:
        raise HTTPException(404, "Rule not found")
    return await db.custom_rules.find_one({"id": rule_id}, {"_id": 0})


@api.delete("/rules/{rule_id}")
async def delete_rule(rule_id: str):
    await db.custom_rules.delete_one({"id": rule_id})
    return {"deleted": rule_id}


# --------------------------------------------------------------------------
# Deobfuscation
# --------------------------------------------------------------------------
@api.post("/deobfuscate")
async def deob(body: DeobIn):
    return {"input": body.text, "results": scanner.deobfuscate(body.text, body.method)}


@api.get("/")
async def root():
    return {"app": "APKLens", "status": "ok"}


app.include_router(api)
app.add_middleware(
    CORSMiddleware,
    allow_credentials=True,
    allow_origins=os.environ.get("CORS_ORIGINS", "*").split(","),
    allow_methods=["*"],
    allow_headers=["*"],
)


@app.on_event("startup")
async def startup():
    try:
        object_storage.init_storage()
        logger.info("object storage initialized")
    except Exception as exc:  # noqa
        logger.warning("object storage init failed (uploads will error until fixed): %s", exc)
    await db.findings.create_index("scan_id")
    await db.findings.create_index([("scan_id", 1), ("category", 1)])
    await db.findings.create_index([("scan_id", 1), ("severity", 1)])
    await db.findings.create_index([("scan_id", 1), ("triage_state", 1)])
    await db.findings.create_index("id")
    await db.scans.create_index("id")
    await db.custom_rules.create_index("id")
    try:
        from seed_sample import seed
        await seed(db, WORKSPACE, _persist_findings, _count_summary)
    except Exception:  # noqa
        logger.exception("sample seed failed")


@app.on_event("shutdown")
async def shutdown():
    client.close()
