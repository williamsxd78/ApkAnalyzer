# Running APKLens locally (fast decompilation)

The hosted preview is CPU-throttled to ~2 cores, so large APKs decompile slowly.
On your own machine (e.g. 16GB RAM, multi-core) it's much faster.

## One-command setup

**Windows (PowerShell)**
```powershell
powershell -ExecutionPolicy Bypass -File .\setup.ps1
```

**macOS / Linux / WSL**
```bash
bash setup.sh
```

The script will:
1. Check for Python 3.11+, Node 18+, Yarn, Java 17+ (tells you what's missing).
2. Download JADX + apktool into `./engines`.
3. Write `backend/.env` and `frontend/.env` (JADX heap 8GB, object storage disabled locally).
4. Install backend (`pip`) and frontend (`yarn`) dependencies.
5. Start the backend (http://localhost:8001) and frontend (http://localhost:3000).

## Prerequisite you must install yourself
- **MongoDB** on `localhost:27017`. Install MongoDB Community, or run via Docker:
  ```bash
  docker run -d -p 27017:27017 --name apklens-mongo mongo:7
  ```

## Start again later (after first setup)
- Windows: `powershell -ExecutionPolicy Bypass -File .\start.ps1`
- macOS/Linux/WSL: `bash start.sh`

## Tuning knobs (in `backend/.env`)
- `ENGINE_JAVA_OPTS="-Xmx8g"` — JADX heap. More RAM = fewer GC stalls on big APKs.
- `ENGINE_JADX_TIMEOUT="1800"` — seconds JADX may run before results are treated as partial.
  Locally you can raise this (e.g. 3600) since you have more CPU; the scan will fully complete.
- `DISABLE_OBJECT_STORAGE="true"` — keep APKs 100% local (no cloud upload).

That's it — open http://localhost:3000 and upload an APK.
