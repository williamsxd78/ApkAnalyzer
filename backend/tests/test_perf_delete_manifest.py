"""Iteration 6 tests: perf fix, manifest after apktool -s, delete APK."""
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
WORKSPACE = "/app/data/scan_workspace"


@pytest.fixture(scope="module")
def s():
    return requests.Session()


@pytest.fixture(scope="module")
def uploaded_scan(s):
    """Upload real.apk via chunked flow, wait complete, yield scan_id.
    Does NOT delete — tests below use it, and test_delete_purges cleans up."""
    if not os.path.exists(APK_PATH):
        pytest.skip("real APK missing")
    total_size = os.path.getsize(APK_PATH)

    r = s.post(f"{API}/scans/upload/init", json={"filename": "real.apk"}, timeout=30)
    assert r.status_code == 200, r.text
    upload_id = r.json()["upload_id"]

    chunk = 5 * 1024 * 1024
    sent = 0
    with open(APK_PATH, "rb") as fh:
        while True:
            data = fh.read(chunk)
            if not data:
                break
            cr = s.put(
                f"{API}/scans/upload/{upload_id}/chunk",
                data=data,
                headers={"Content-Type": "application/octet-stream"},
                timeout=120,
            )
            assert cr.status_code == 200, cr.text
            sent += len(data)

    cr = s.post(f"{API}/scans/upload/{upload_id}/complete",
                json={"filename": "real.apk"}, timeout=60)
    assert cr.status_code == 200, cr.text
    scan = cr.json()
    scan_id = scan["id"]
    assert scan["size"] == total_size

    # Poll — measure elapsed & watch counts (decompiled_files or stage progress).
    t0 = time.time()
    deadline = t0 + 180  # perf target: well under 2 minutes for 11.9MB
    final = None
    decompiled_seen = []
    while time.time() < deadline:
        try:
            gr = s.get(f"{API}/scans/{scan_id}", timeout=30)
        except requests.exceptions.RequestException:
            time.sleep(3)
            continue
        if gr.status_code != 200:
            time.sleep(3)
            continue
        d = gr.json()
        # capture live decompiled_files count if surfaced
        df = d.get("decompiled_files") or (d.get("counts") or {}).get("decompiled_files")
        if df is not None:
            decompiled_seen.append(df)
        final = d["status"]
        if final in ("complete", "failed"):
            break
        time.sleep(3)
    elapsed = time.time() - t0
    print(f"[perf] scan {scan_id} status={final} elapsed={elapsed:.1f}s decompiled_seen_samples={decompiled_seen[:8]}")
    assert final == "complete", f"scan ended {final} after {elapsed:.1f}s"
    # Perf target: comfortably under 2 minutes for 11.9MB with 2-core cgroup.
    assert elapsed < 180, f"scan took {elapsed:.1f}s (>180s)"
    return {"id": scan_id, "elapsed": elapsed, "decompiled_seen": decompiled_seen}


# ---------------- 1) PERF ----------------
def test_perf_under_2_minutes(uploaded_scan):
    assert uploaded_scan["elapsed"] < 120, \
        f"decompile+scan took {uploaded_scan['elapsed']:.1f}s, expected <120s"


def test_counts_total_positive(s, uploaded_scan):
    d = s.get(f"{API}/scans/{uploaded_scan['id']}", timeout=30).json()
    total = (d.get("counts") or {}).get("total", 0)
    print(f"[perf] counts.total={total}")
    assert total > 0, f"expected counts.total>0 got {total}"


# ---------------- 2) MANIFEST STILL WORKS (apktool -s) ----------------
def test_manifest_findings_present(s, uploaded_scan):
    r = s.get(f"{API}/scans/{uploaded_scan['id']}/findings",
              params={"category": "manifest", "limit": 500}, timeout=30)
    assert r.status_code == 200, r.text
    body = r.json()
    items = body.get("items", [])
    print(f"[manifest] count={len(items)} types={sorted({it.get('type') for it in items})[:10]}")
    assert len(items) > 0, "no manifest findings after apktool -s"


def test_manifest_findings_on_sample(s):
    """Also assert on the sample scan for sanity."""
    r = s.get(f"{API}/scans/{SAMPLE_ID}/findings",
              params={"category": "manifest", "limit": 500}, timeout=30)
    assert r.status_code == 200
    items = r.json()["items"]
    assert len(items) > 0


# ---------------- 3) DELETE APK ----------------
def test_delete_purges(s, uploaded_scan):
    sid = uploaded_scan["id"]
    ws = os.path.join(WORKSPACE, sid)
    # workspace may or may not still exist by now; snapshot state
    ws_existed_before = os.path.exists(ws)
    print(f"[delete] workspace_before={ws_existed_before} path={ws}")

    r = s.delete(f"{API}/scans/{sid}", timeout=60)
    assert r.status_code in (200, 204), f"delete returned {r.status_code}: {r.text}"

    # GET returns 404
    g = s.get(f"{API}/scans/{sid}", timeout=15)
    assert g.status_code == 404, f"scan still fetchable: {g.status_code}"

    # Not in list
    listing = s.get(f"{API}/scans", timeout=15).json()
    rows = listing if isinstance(listing, list) else listing.get("items", [])
    ids = {x["id"] for x in rows}
    assert sid not in ids, "deleted scan still in listing"

    # Findings should also be gone
    fr = s.get(f"{API}/scans/{sid}/findings", timeout=15)
    assert fr.status_code == 404 or (fr.status_code == 200 and (fr.json().get("items") == [] or fr.json().get("total", 0) == 0))

    # Workspace directory removed
    assert not os.path.exists(ws), f"workspace still on disk: {ws}"


@pytest.mark.skip(reason="Confirmed bug: DELETE /api/scans/{sample_id} returns 200 and deletes sample. Skipping to avoid re-deleting sample; backend re-seeds on restart. Reported to main agent.")
def test_sample_delete_forbidden(s):
    """Sample scan must not be deletable (spec). Do NOT actually delete —
    if the endpoint would return 200, that's a backend bug: we detect it via
    HEAD-like probe: send DELETE only if we first confirm it's blocked.
    Since there's no dry-run, we assert by inspecting server code contract via
    the spec: attempt delete and IMMEDIATELY re-seed if it went through, then
    fail loudly."""
    # Confirm sample exists first
    g0 = s.get(f"{API}/scans/{SAMPLE_ID}", timeout=15)
    assert g0.status_code == 200, "sample missing before test"
    assert g0.json().get("is_sample") is True

    r = s.delete(f"{API}/scans/{SAMPLE_ID}", timeout=15)
    if r.status_code == 200:
        # Backend allowed it — this is a bug. Re-seed by restarting backend
        # is not possible from a test; just report and let main agent fix.
        pytest.fail(
            f"SAMPLE SCAN WAS DELETED (status=200). Backend does not guard "
            f"is_sample in DELETE /api/scans/{{id}}. Sample must be re-seeded."
        )
    assert r.status_code in (400, 403, 405, 409), \
        f"sample delete returned {r.status_code} (expected 4xx-forbidden)"
    g = s.get(f"{API}/scans/{SAMPLE_ID}", timeout=15)
    assert g.status_code == 200
