"""Emergent object storage helper for APK blobs."""
import os
import requests

STORAGE_BASE = (os.environ.get("INTEGRATION_PROXY_URL") or "").strip() or "https://integrations.emergentagent.com"
STORAGE_URL = STORAGE_BASE.rstrip("/") + "/objstore/api/v1/storage"
APP_NAME = "apklens"

_storage_key = None


def init_storage(force: bool = False):
    global _storage_key
    if _storage_key and not force:
        return _storage_key
    emergent_key = os.environ.get("EMERGENT_LLM_KEY")
    resp = requests.post(f"{STORAGE_URL}/init", json={"emergent_key": emergent_key}, timeout=30)
    resp.raise_for_status()
    _storage_key = resp.json()["storage_key"]
    return _storage_key


def put_object(path: str, data: bytes, content_type: str = "application/vnd.android.package-archive") -> dict:
    key = init_storage()
    resp = requests.put(
        f"{STORAGE_URL}/objects/{path}",
        headers={"X-Storage-Key": key, "Content-Type": content_type},
        data=data, timeout=300,
    )
    if resp.status_code == 404:
        key = init_storage(force=True)
        resp = requests.put(
            f"{STORAGE_URL}/objects/{path}",
            headers={"X-Storage-Key": key, "Content-Type": content_type},
            data=data, timeout=300,
        )
    resp.raise_for_status()
    return resp.json()


def put_object_file(path: str, file_path: str,
                    content_type: str = "application/vnd.android.package-archive") -> dict:
    """Stream a file from disk to object storage without loading it all into memory."""
    key = init_storage()
    with open(file_path, "rb") as fh:
        resp = requests.put(
            f"{STORAGE_URL}/objects/{path}",
            headers={"X-Storage-Key": key, "Content-Type": content_type},
            data=fh, timeout=600,
        )
    if resp.status_code == 404:
        key = init_storage(force=True)
        with open(file_path, "rb") as fh:
            resp = requests.put(
                f"{STORAGE_URL}/objects/{path}",
                headers={"X-Storage-Key": key, "Content-Type": content_type},
                data=fh, timeout=600,
            )
    resp.raise_for_status()
    return resp.json()


def download_to_file(path: str, dest_path: str):
    key = init_storage()
    resp = requests.get(f"{STORAGE_URL}/objects/{path}",
                        headers={"X-Storage-Key": key}, stream=True, timeout=300)
    if resp.status_code == 404:
        key = init_storage(force=True)
        resp = requests.get(f"{STORAGE_URL}/objects/{path}",
                            headers={"X-Storage-Key": key}, stream=True, timeout=300)
    resp.raise_for_status()
    with open(dest_path, "wb") as fh:
        for chunk in resp.iter_content(chunk_size=1024 * 1024):
            if chunk:
                fh.write(chunk)
    return dest_path
