"""APKLens backend regression tests."""
import io
import os
import time
import pytest
import requests

BASE_URL = os.environ.get("REACT_APP_BACKEND_URL", "").rstrip("/")
if not BASE_URL:
    # fallback for local
    with open("/app/frontend/.env") as fh:
        for line in fh:
            if line.startswith("REACT_APP_BACKEND_URL="):
                BASE_URL = line.split("=", 1)[1].strip().rstrip("/")

API = f"{BASE_URL}/api"
SAMPLE_ID = "sample-acme-wallet-demo-v2"
OLD_SAMPLE_ID = "sample-acme-wallet-demo"


@pytest.fixture(scope="module")
def s():
    return requests.Session()


# --- Scans ------------------------------------------------------------------
def test_list_scans_contains_sample(s):
    r = s.get(f"{API}/scans", timeout=60)
    assert r.status_code == 200
    scans = r.json()
    sample = next((x for x in scans if x["id"] == SAMPLE_ID), None)
    assert sample is not None, "Seeded sample scan missing"
    assert sample["status"] == "complete"
    total = sample["counts"]["total"]
    assert 60 <= total <= 120, f"Expected ~80 findings total, got {total}"


def test_summary_categories_and_severities(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/summary", timeout=15)
    assert r.status_code == 200
    d = r.json()
    for cat in ("secret", "endpoint", "manifest", "crypto", "custom"):
        assert cat in d["by_category"], f"Missing category {cat}"
    assert any(sev in d["by_severity"] for sev in ("critical", "high", "medium"))


@pytest.mark.parametrize("cat,min_count", [
    ("secret", 10), ("endpoint", 1), ("manifest", 1), ("crypto", 1)
])
def test_findings_category_filter(s, cat, min_count):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings", params={"category": cat, "limit": 500}, timeout=15)
    assert r.status_code == 200
    body = r.json()
    assert body["total"] >= min_count, f"{cat} count {body['total']} < {min_count}"
    for it in body["items"]:
        assert it["category"] == cat


def test_findings_secret_min(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings", params={"category": "secret", "limit": 500})
    assert r.status_code == 200
    assert r.json()["total"] >= 15


def test_findings_severity_filter(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings", params={"severity": "critical", "limit": 500})
    assert r.status_code == 200
    for it in r.json()["items"]:
        assert it["severity"] == "critical"


def test_findings_search_q(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings", params={"q": "aws", "limit": 500})
    assert r.status_code == 200
    assert r.json()["total"] >= 1


def test_findings_triage_filter(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings", params={"triage": "open", "limit": 500})
    assert r.status_code == 200
    for it in r.json()["items"]:
        assert it["triage_state"] == "open"


# --- Tree & File -----------------------------------------------------------
def test_file_tree(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/tree", timeout=20)
    assert r.status_code == 200
    tree = r.json()
    assert tree["type"] == "dir"
    assert isinstance(tree["children"], list) and len(tree["children"]) > 0


def test_get_file_content(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/file",
              params={"path": "jadx/com/acme/wallet/ApiClient.java"}, timeout=15)
    assert r.status_code == 200
    d = r.json()
    assert d["total_lines"] > 0
    assert isinstance(d["lines"], list)


# --- Triage ----------------------------------------------------------------
def test_triage_flow(s):
    fr = s.get(f"{API}/scans/{SAMPLE_ID}/findings", params={"category": "secret", "limit": 1}).json()
    fid = fr["items"][0]["id"]
    r = s.patch(f"{API}/findings/{fid}/triage", json={"triage_state": "confirmed"})
    assert r.status_code == 200
    assert r.json()["triage_state"] == "confirmed"
    # persist
    r2 = s.get(f"{API}/scans/{SAMPLE_ID}/findings", params={"q": r.json()["value"][:20], "limit": 5})
    # revert
    s.patch(f"{API}/findings/{fid}/triage", json={"triage_state": "open"})


# --- Custom rules ----------------------------------------------------------
def test_rules_crud_and_rescan(s):
    # create
    r = s.post(f"{API}/rules", json={
        "name": "TEST_secret_word", "pattern": "supersecret",
        "pattern_type": "string", "severity": "high", "enabled": True})
    assert r.status_code == 200
    rule = r.json()
    rid = rule["id"]
    # list
    lst = s.get(f"{API}/rules").json()
    assert any(x["id"] == rid for x in lst)
    # update
    r = s.put(f"{API}/rules/{rid}", json={
        "name": "TEST_secret_word", "pattern": "supersecret",
        "pattern_type": "string", "severity": "medium", "enabled": True})
    assert r.status_code == 200 and r.json()["severity"] == "medium"
    # rescan
    r = s.post(f"{API}/scans/{SAMPLE_ID}/rescan", timeout=30)
    assert r.status_code == 200
    body = r.json()
    assert "added" in body and "counts" in body
    # delete
    r = s.delete(f"{API}/rules/{rid}")
    assert r.status_code == 200


# --- Deobfuscate -----------------------------------------------------------
def test_deobfuscate_base64(s):
    r = s.post(f"{API}/deobfuscate", json={"text": "SGVsbG8gV29ybGQ=", "method": "base64"})
    assert r.status_code == 200
    assert r.json()["results"].get("base64") == "Hello World"


def test_deobfuscate_auto(s):
    r = s.post(f"{API}/deobfuscate", json={"text": "SGVsbG8=", "method": "auto"})
    assert r.status_code == 200
    res = r.json()["results"]
    assert "base64" in res
    # auto should attempt multiple methods
    assert len(res) >= 2


# --- Settings --------------------------------------------------------------
def test_settings(s):
    r = s.get(f"{API}/settings")
    assert r.status_code == 200
    d = r.json()
    assert "jadx_bin" in d and "apktool_bin" in d and "engines" in d
    eng = d["engines"]
    # engines dict must have java/jadx/apktool availability
    for k in ("java", "jadx", "apktool"):
        assert k in eng


# --- Upload rejects non-apk ------------------------------------------------
def test_upload_rejects_non_apk(s):
    files = {"file": ("test.txt", io.BytesIO(b"not an apk"), "text/plain")}
    r = s.post(f"{API}/scans/upload", files=files)
    assert r.status_code == 400


# --- NEW: v2 sample regression ---------------------------------------------
def test_old_sample_removed(s):
    r = s.get(f"{API}/scans/{OLD_SAMPLE_ID}", timeout=15)
    assert r.status_code == 404, f"Old sample should not exist, got {r.status_code}"


def test_new_secret_types_present(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings",
              params={"category": "secret", "limit": 500}, timeout=15)
    assert r.status_code == 200
    types = {it["type"] for it in r.json()["items"]}
    required = {"SendGrid API Key", "Mailgun API Key", "SMTP Password",
                "SMTP Credentials in URL", "Twilio Account SID"}
    missing = required - types
    assert not missing, f"Missing SMTP/SMS secret types: {missing}. Present: {types}"


def test_admin_endpoints_detected(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings",
              params={"category": "endpoint", "limit": 500}, timeout=15)
    assert r.status_code == 200
    items = r.json()["items"]
    admin_ep = [it for it in items if it["type"] == "Admin / Management Endpoint"]
    admin_url = [it for it in items if it["type"] == "Admin / Management URL"]
    assert len(admin_ep) + len(admin_url) >= 3, \
        f"Expected several admin findings, got endpoint={len(admin_ep)} url={len(admin_url)}"
    # tag check
    tagged = [it for it in admin_ep + admin_url if "admin" in (it.get("tags") or [])]
    assert tagged, "Admin findings should be tagged 'admin'"


# --- NEW: decompile progress on live scan ----------------------------------
def test_decompiled_files_progress_live_upload(s):
    apk_path = "/app/data/test/real.apk"
    if not os.path.exists(apk_path):
        pytest.skip("real APK not available")
    with open(apk_path, "rb") as fh:
        r = s.post(f"{API}/scans/upload",
                   files={"file": ("real.apk", fh, "application/vnd.android.package-archive")},
                   timeout=120)
    assert r.status_code == 200, r.text
    scan_id = r.json()["id"]

    saw_progress = False
    max_files = 0
    final_status = None
    deadline = time.time() + 240  # 4 min budget
    while time.time() < deadline:
        gr = s.get(f"{API}/scans/{scan_id}", timeout=30)
        assert gr.status_code == 200
        d = gr.json()
        final_status = d["status"]
        if final_status in ("decompiling", "scanning"):
            assert "decompiled_files" in d, \
                f"decompiled_files must be present while status={final_status}"
            df = d["decompiled_files"]
            assert isinstance(df, int)
            max_files = max(max_files, df)
            if df > 0:
                saw_progress = True
        if final_status in ("complete", "failed"):
            break
        time.sleep(4)

    # cleanup
    s.delete(f"{API}/scans/{scan_id}")
    assert final_status == "complete", f"scan ended in status={final_status}"
    assert saw_progress, f"decompiled_files never grew >0 (max seen={max_files})"

