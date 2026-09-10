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
SAMPLE_ID = "sample-acme-wallet-demo"


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
    assert 50 <= total <= 90, f"Expected ~65 findings total, got {total}"


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


def test_findings_secret_is_15(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings", params={"category": "secret", "limit": 500})
    assert r.status_code == 200
    assert r.json()["total"] == 15


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
