#!/usr/bin/env bash
# APKLens - start both servers (macOS/Linux/WSL). Run setup.sh first (once).
set -e
ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
( cd "$ROOT/backend" && python3 -m uvicorn server:app --host 0.0.0.0 --port 8001 --reload ) &
( cd "$ROOT/frontend" && yarn start ) &
echo "APKLens starting -> http://localhost:3000 (backend :8001). Ctrl+C to stop."
wait
