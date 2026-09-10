"""Seed a demo scan (sample decompiled APK) so the dashboard shows real findings."""
import shutil
import uuid
from datetime import datetime, timezone
from pathlib import Path

import scanner

SAMPLE_ID = "sample-acme-wallet-demo-v3"


def _now():
    return datetime.now(timezone.utc).isoformat()


DEFAULT_RULES = [
    {"name": "Internal .local hosts", "pattern": r"[a-z0-9\-]+\.acme\.local",
     "pattern_type": "regex", "severity": "high", "enabled": True},
    {"name": "TODO / FIXME markers", "pattern": r"(?i)(TODO|FIXME|remove before release)",
     "pattern_type": "regex", "severity": "info", "enabled": True},
]


async def seed(db, workspace: Path, persist_findings, count_summary):
    # default custom rules (once)
    if await db.custom_rules.count_documents({}) == 0:
        for r in DEFAULT_RULES:
            doc = dict(r, id=str(uuid.uuid4()), created_at=_now())
            await db.custom_rules.insert_one(doc)

    if await db.scans.find_one({"id": SAMPLE_ID}):
        return

    # Remove any older/superseded sample scans so only the current one shows.
    async for old in db.scans.find({"is_sample": True, "id": {"$ne": SAMPLE_ID}}, {"id": 1}):
        await db.findings.delete_many({"scan_id": old["id"]})
        await db.scans.delete_one({"id": old["id"]})
        shutil.rmtree(workspace / old["id"], ignore_errors=True)

    src = Path(__file__).parent / "sample_src"
    dest = workspace / SAMPLE_ID
    if dest.exists():
        shutil.rmtree(dest)
    shutil.copytree(src, dest)

    rules = await db.custom_rules.find({"enabled": True}, {"_id": 0}).to_list(500)

    findings = []
    for rel, text in scanner.iter_scan_files(str(dest)):
        findings.extend(scanner.scan_text_file(rel, text))
        for rule in rules:
            findings.extend(scanner.scan_custom_rule(rel, text, rule))
    findings.extend(scanner.audit_manifest(str(dest / "apktool" / "AndroidManifest.xml")))

    scan_doc = {
        "id": SAMPLE_ID,
        "filename": "acme-wallet-4.2.0.apk",
        "size": 18_452_310,
        "status": "complete",
        "stage": "Scan complete",
        "progress": 100,
        "error": None,
        "is_sample": True,
        "counts": {"total": 0, "by_category": {}, "by_severity": {}},
        "created_at": _now(),
        "updated_at": _now(),
        "finished_at": _now(),
    }
    await db.scans.insert_one(scan_doc)
    await persist_findings(SAMPLE_ID, findings)
    counts = await count_summary(SAMPLE_ID)
    await db.scans.update_one({"id": SAMPLE_ID}, {"$set": {"counts": counts}})
