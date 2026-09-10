"""APKLens bug-fix regression: upload should not 502 and backend must stay
responsive while a scan is in progress.

Bug fix summary from main agent:
 - JADX/apktool JVM heap capped (-Xmx3g)
 - Upload streams to object storage from disk (no full read into memory)
 - decompiled_files count written to Mongo by background monitor; GET /api/scans/{id}
   no longer walks file tree on event loop

We validate:
 1. POST /api/scans/upload returns HTTP 200 within a few seconds for the 11.9MB APK.
 2. While the scan is decompiling/scanning, every GET /api/scans and
    GET /api/scans/{id} call returns quickly (< 2s) with 200 (no 502).
 3. decompiled_files grows 0 -> thousands.
 4. Scan reaches status 'complete' with counts.total > 0 (expect thousands).
"""
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
APK_PATH = "/app/data/test/real.apk"


@pytest.fixture(scope="module")
def s():
    return requests.Session()


@pytest.mark.skipif(not os.path.exists(APK_PATH), reason="real APK not available")
def test_upload_no_502_and_responsive_during_scan(s):
    # ---- 1. Upload ----------------------------------------------------------
    assert os.path.getsize(APK_PATH) > 5 * 1024 * 1024, "APK smaller than expected"

    up_start = time.time()
    with open(APK_PATH, "rb") as fh:
        r = s.post(
            f"{API}/scans/upload",
            files={"file": ("real.apk", fh, "application/vnd.android.package-archive")},
            timeout=60,
        )
    up_dur = time.time() - up_start
    assert r.status_code == 200, f"Upload failed: {r.status_code} body={r.text[:400]}"
    assert up_dur < 15, f"Upload took too long: {up_dur:.2f}s (indicates blocking)"
    scan_id = r.json()["id"]
    print(f"[upload] scan_id={scan_id} in {up_dur:.2f}s")

    slow_list = []
    slow_get = []
    non200 = []
    max_files = 0
    saw_progress = False
    poll_count = 0
    final_status = None

    try:
        deadline = time.time() + 300  # 5 min budget
        while time.time() < deadline:
            poll_count += 1

            # GET /api/scans (list)
            t0 = time.time()
            lr = s.get(f"{API}/scans", timeout=10)
            d_list = time.time() - t0
            if lr.status_code != 200:
                non200.append(("list", lr.status_code, d_list))
            if d_list > 2.0:
                slow_list.append(d_list)

            # GET /api/scans/{id}
            t0 = time.time()
            gr = s.get(f"{API}/scans/{scan_id}", timeout=10)
            d_get = time.time() - t0
            if gr.status_code != 200:
                non200.append(("get", gr.status_code, d_get))
                time.sleep(1)
                continue
            if d_get > 2.0:
                slow_get.append(d_get)

            d = gr.json()
            final_status = d.get("status")
            if final_status in ("decompiling", "scanning"):
                df = d.get("decompiled_files")
                if isinstance(df, int):
                    max_files = max(max_files, df)
                    if df > 0:
                        saw_progress = True

            if poll_count % 5 == 0:
                print(f"[poll {poll_count}] status={final_status} "
                      f"decompiled={max_files} list={d_list:.2f}s get={d_get:.2f}s")

            if final_status in ("complete", "failed"):
                break
            time.sleep(1.5)

        # final fetch
        gr = s.get(f"{API}/scans/{scan_id}", timeout=15)
        assert gr.status_code == 200
        final = gr.json()
        final_status = final.get("status")

        # ---- Assertions ----------------------------------------------------
        assert not non200, f"Non-200 responses during scan (possible 502): {non200}"
        assert not slow_list, f"GET /api/scans slower than 2s: {slow_list}"
        assert not slow_get, f"GET /api/scans/{{id}} slower than 2s: {slow_get}"
        assert saw_progress, f"decompiled_files never grew (max={max_files})"
        assert max_files > 100, f"decompiled_files max={max_files} suspiciously low"
        assert final_status == "complete", f"scan status={final_status}"
        total = (final.get("counts") or {}).get("total", 0)
        assert total > 0, f"counts.total={total}, expected >0"
        print(f"[done] status=complete polls={poll_count} max_decompiled={max_files} "
              f"findings={total}")
    finally:
        # cleanup
        try:
            s.delete(f"{API}/scans/{scan_id}", timeout=10)
        except Exception:
            pass
