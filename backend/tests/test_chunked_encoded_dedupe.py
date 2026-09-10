"""Tests for: chunked upload, encoded-secret detection, dedupe."""
import os
import time
import pytest
import requests

BASE_URL = os.environ.get("REACT_APP_BACKEND_URL", "").rstrip("/")
if not BASE_URL:
    with open("/app/frontend/.env") as fh:
        for line in fh:
            if line.startswith("REACT_APP_BACKEND_URL="):
                BASE_URL = line.split("=", 1)[1].strip().rstrip("/")

API = f"{BASE_URL}/api"
SAMPLE_ID = "sample-acme-wallet-demo-v3"
APK_PATH = "/app/data/test/real.apk"


@pytest.fixture(scope="module")
def s():
    return requests.Session()


# ---------------- Chunked upload ----------------
def test_chunked_upload_full_scan(s):
    if not os.path.exists(APK_PATH):
        pytest.skip("real APK missing")
    total_size = os.path.getsize(APK_PATH)
    assert total_size == 11904560, f"unexpected apk size {total_size}"

    # init
    t0 = time.time()
    r = s.post(f"{API}/scans/upload/init", json={"filename": "real.apk"}, timeout=30)
    assert r.status_code == 200, r.text
    init = r.json()
    assert "upload_id" in init and "chunk_size" in init
    upload_id = init["upload_id"]
    print(f"init latency={time.time()-t0:.2f}s upload_id={upload_id}")

    # chunks (5MB)
    chunk = 5 * 1024 * 1024
    sent = 0
    with open(APK_PATH, "rb") as fh:
        while True:
            data = fh.read(chunk)
            if not data:
                break
            t1 = time.time()
            cr = s.put(
                f"{API}/scans/upload/{upload_id}/chunk",
                data=data,
                headers={"Content-Type": "application/octet-stream"},
                timeout=120,
            )
            latency = time.time() - t1
            print(f"chunk bytes={len(data)} latency={latency:.2f}s status={cr.status_code}")
            assert cr.status_code == 200, cr.text
            assert latency < 30, f"chunk took {latency:.2f}s"
            sent += len(data)
            assert cr.json()["total"] == sent

    # complete
    cr = s.post(f"{API}/scans/upload/{upload_id}/complete",
                json={"filename": "real.apk"}, timeout=60)
    assert cr.status_code == 200, cr.text
    scan = cr.json()
    assert scan["size"] == total_size, f"size mismatch {scan['size']} vs {total_size}"
    assert scan["status"] in ("queued", "decompiling", "scanning")
    scan_id = scan["id"]

    # poll until complete
    deadline = time.time() + 300
    final = None
    total_findings = 0
    try:
        while time.time() < deadline:
            try:
                gr = s.get(f"{API}/scans/{scan_id}", timeout=30)
            except requests.exceptions.RequestException as e:
                print(f"poll transient err: {e}; retry in 5s")
                time.sleep(5)
                continue
            if gr.status_code != 200:
                print(f"poll status {gr.status_code}; retry")
                time.sleep(4)
                continue
            d = gr.json()
            final = d["status"]
            if final in ("complete", "failed"):
                total_findings = (d.get("counts") or {}).get("total", 0)
                break
            time.sleep(4)
        assert final == "complete", f"scan ended {final}"
        assert total_findings > 0, f"expected counts.total>0 got {total_findings}"
    finally:
        s.delete(f"{API}/scans/{scan_id}")


# ---------------- Encoded secrets ----------------
def test_encoded_secrets_present(s):
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings",
              params={"category": "secret", "limit": 500}, timeout=30)
    assert r.status_code == 200, r.text
    items = r.json()["items"]
    encoded = [it for it in items if "encoded" in (it.get("tags") or [])]
    assert encoded, f"No encoded-tagged findings among {len(items)} secrets"
    types = {it["type"] for it in encoded}
    print("encoded types:", types)
    # required per review request
    assert any("AWS Access Key ID (base64-encoded)" in t for t in types), \
        f"missing base64 AWS in {types}"
    assert any("Google API Key (hex-encoded)" in t for t in types), \
        f"missing hex Google in {types}"

    # value should be the DECODED secret
    aws = [it for it in encoded if "AWS Access Key ID" in it["type"]][0]
    assert aws["value"].startswith("AKIA"), f"decoded AWS value bad: {aws['value']}"


# ---------------- Dedupe ----------------
def test_dedupe_findings(s):
    raw = s.get(f"{API}/scans/{SAMPLE_ID}/findings",
                params={"limit": 500}, timeout=30).json()
    ded = s.get(f"{API}/scans/{SAMPLE_ID}/findings",
                params={"dedupe": "true", "limit": 500}, timeout=30).json()
    assert ded.get("deduped") is True
    assert ded["total"] <= raw["total"], \
        f"dedupe total {ded['total']} > raw {raw['total']}"
    for it in ded["items"]:
        assert "occurrences" in it and it["occurrences"] >= 1
        assert "files_count" in it and it["files_count"] >= 1
    # at least one item should have collapsed occurrences (>1) given a real sample
    multi = [it for it in ded["items"] if it["occurrences"] > 1]
    print(f"dedupe raw={raw['total']} groups={ded['total']} multi={len(multi)}")
    # not strictly required but expected
    assert multi, "expected at least one grouped finding with occurrences>1"


# ---------------- Old sample gone ----------------
def test_old_v2_sample_removed(s):
    r = s.get(f"{API}/scans/sample-acme-wallet-demo-v2", timeout=15)
    assert r.status_code == 404
    r = s.get(f"{API}/scans/sample-acme-wallet-demo", timeout=15)
    assert r.status_code == 404
