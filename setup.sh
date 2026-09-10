#!/usr/bin/env bash
# APKLens - one-command local setup & run (macOS / Linux / WSL)
# Usage:  bash setup.sh
# Checks: Python 3.11+, Node 18+, Yarn, Java 17+, MongoDB. Auto-downloads JADX + apktool,
# writes .env files, installs deps, then starts backend + frontend.
set -euo pipefail
ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT"
info(){ printf "\033[32m==> %s\033[0m\n" "$1"; }
warn(){ printf "\033[33m!!  %s\033[0m\n" "$1"; }
have(){ command -v "$1" >/dev/null 2>&1; }

info "APKLens local setup in $ROOT"

missing=()
have python3 || missing+=("Python 3.11+  https://www.python.org/downloads/")
have node    || missing+=("Node.js 18+   https://nodejs.org/")
have java    || missing+=("Java 17+ JDK  https://adoptium.net/")
if [ ${#missing[@]} -gt 0 ]; then
  warn "Install these first, then re-run:"; printf '    - %s\n' "${missing[@]}"; exit 1
fi
have yarn || { info "Installing yarn..."; npm install -g yarn >/dev/null; }

ENGINES="$ROOT/engines"; mkdir -p "$ENGINES"
OS="$(uname -s)"

if [ ! -f "$ENGINES/jadx/bin/jadx" ]; then
  info "Downloading JADX 1.5.0..."
  curl -fsSL "https://github.com/skylot/jadx/releases/download/v1.5.0/jadx-1.5.0.zip" -o "$ENGINES/jadx.zip"
  mkdir -p "$ENGINES/jadx"; unzip -oq "$ENGINES/jadx.zip" -d "$ENGINES/jadx"; rm -f "$ENGINES/jadx.zip"
  chmod +x "$ENGINES/jadx/bin/jadx"
fi
if [ ! -f "$ENGINES/apktool" ]; then
  info "Downloading apktool 2.10.0..."
  curl -fsSL "https://raw.githubusercontent.com/iBotPeaches/Apktool/master/scripts/linux/apktool" -o "$ENGINES/apktool"
  curl -fsSL "https://github.com/iBotPeaches/Apktool/releases/download/v2.10.0/apktool_2.10.0.jar" -o "$ENGINES/apktool.jar"
  chmod +x "$ENGINES/apktool"
fi

JAVA_HOME_GUESS="${JAVA_HOME:-$(dirname "$(dirname "$(readlink -f "$(command -v java)")")")}"

cat > "$ROOT/backend/.env" <<EOF
MONGO_URL="mongodb://localhost:27017"
DB_NAME="apklens"
CORS_ORIGINS="*"
SCAN_WORKSPACE="$ROOT/data/scan_workspace"
JADX_BIN="$ENGINES/jadx/bin/jadx"
APKTOOL_BIN="$ENGINES/apktool"
JAVA_HOME="$JAVA_HOME_GUESS"
ENGINE_JAVA_OPTS="-Xmx8g"
ENGINE_JADX_TIMEOUT="1800"
DISABLE_OBJECT_STORAGE="true"
EOF
info "Wrote backend/.env (JADX heap 8GB, 30-min budget, object storage off for local)"

echo 'REACT_APP_BACKEND_URL=http://localhost:8001' > "$ROOT/frontend/.env"
info "Wrote frontend/.env"

info "Installing backend deps..."; ( cd "$ROOT/backend" && python3 -m pip install --upgrade pip >/dev/null && python3 -m pip install -r requirements.txt )
info "Installing frontend deps..."; ( cd "$ROOT/frontend" && yarn install )

if ! (exec 3<>/dev/tcp/localhost/27017) 2>/dev/null; then
  warn "MongoDB not running on localhost:27017."
  warn "Start it, or with Docker:  docker run -d -p 27017:27017 --name apklens-mongo mongo:7"
  warn "Then run: bash start.sh"
  exit 1
fi

info "Starting backend :8001 and frontend :3000 ..."
( cd "$ROOT/backend" && python3 -m uvicorn server:app --host 0.0.0.0 --port 8001 --reload ) &
( cd "$ROOT/frontend" && yarn start ) &
info "APKLens running -> http://localhost:3000  (Ctrl+C to stop)"
wait
