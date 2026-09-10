# APKLens - one-command local setup & run (Windows PowerShell)
# Usage:  Right-click -> Run with PowerShell   OR   in a terminal:  powershell -ExecutionPolicy Bypass -File .\setup.ps1
# Prereqs it will CHECK for (and tell you how to install): Python 3.11+, Node 18+, Yarn, Java 17+, MongoDB.
# It auto-downloads JADX + apktool, writes the .env files, installs deps, then starts backend + frontend.

$ErrorActionPreference = "Stop"
$Root = Split-Path -Parent $MyInvocation.MyCommand.Path
Set-Location $Root

function Have($cmd) { return [bool](Get-Command $cmd -ErrorAction SilentlyContinue) }
function Info($m) { Write-Host "==> $m" -ForegroundColor Green }
function Warn($m) { Write-Host "!!  $m" -ForegroundColor Yellow }

Info "APKLens local setup starting in $Root"

# ---------- prerequisite checks ----------
$missing = @()
if (-not (Have python))  { $missing += "Python 3.11+  (https://www.python.org/downloads/)" }
if (-not (Have node))    { $missing += "Node.js 18+   (https://nodejs.org/)" }
if (-not (Have java))    { $missing += "Java 17+ JDK  (https://adoptium.net/)" }
if ($missing.Count -gt 0) {
    Warn "Please install these first, then re-run:"
    $missing | ForEach-Object { Write-Host "    - $_" }
    exit 1
}
if (-not (Have yarn)) { Info "Installing Yarn..."; npm install -g yarn | Out-Null }

# ---------- download engines (JADX + apktool) ----------
$Engines = Join-Path $Root "engines"
New-Item -ItemType Directory -Force -Path $Engines | Out-Null

$JadxDir = Join-Path $Engines "jadx"
if (-not (Test-Path (Join-Path $JadxDir "bin\jadx.bat"))) {
    Info "Downloading JADX 1.5.0..."
    $zip = Join-Path $Engines "jadx.zip"
    Invoke-WebRequest "https://github.com/skylot/jadx/releases/download/v1.5.0/jadx-1.5.0.zip" -OutFile $zip
    New-Item -ItemType Directory -Force -Path $JadxDir | Out-Null
    Expand-Archive -Path $zip -DestinationPath $JadxDir -Force
    Remove-Item $zip
}
$ApktoolBat = Join-Path $Engines "apktool.bat"
if (-not (Test-Path $ApktoolBat)) {
    Info "Downloading apktool 2.10.0..."
    Invoke-WebRequest "https://raw.githubusercontent.com/iBotPeaches/Apktool/master/scripts/windows/apktool.bat" -OutFile $ApktoolBat
    Invoke-WebRequest "https://github.com/iBotPeaches/Apktool/releases/download/v2.10.0/apktool_2.10.0.jar" -OutFile (Join-Path $Engines "apktool.jar")
}

# ---------- write .env files ----------
$JadxBin    = (Join-Path $JadxDir "bin\jadx.bat")    -replace '\\','/'
$ApktoolBin = $ApktoolBat                            -replace '\\','/'
$Workspace  = (Join-Path $Root "data\scan_workspace") -replace '\\','/'
$JavaHome   = if ($env:JAVA_HOME) { $env:JAVA_HOME -replace '\\','/' } else { "" }

$BackendEnv = Join-Path $Root "backend\.env"
@"
MONGO_URL="mongodb://localhost:27017"
DB_NAME="apklens"
CORS_ORIGINS="*"
SCAN_WORKSPACE="$Workspace"
JADX_BIN="$JadxBin"
APKTOOL_BIN="$ApktoolBin"
JAVA_HOME="$JavaHome"
ENGINE_JAVA_OPTS="-Xmx8g"
DISABLE_OBJECT_STORAGE="true"
"@ | Set-Content -Path $BackendEnv -Encoding ascii
Info "Wrote backend\.env (engines wired, JADX heap 8GB, object storage disabled for local)"

$FrontendEnv = Join-Path $Root "frontend\.env"
"REACT_APP_BACKEND_URL=http://localhost:8001" | Set-Content -Path $FrontendEnv -Encoding ascii
Info "Wrote frontend\.env"

# ---------- install dependencies ----------
Info "Installing backend Python deps..."
Push-Location (Join-Path $Root "backend")
python -m pip install --upgrade pip | Out-Null
python -m pip install -r requirements.txt
Pop-Location

Info "Installing frontend deps (yarn)..."
Push-Location (Join-Path $Root "frontend")
yarn install
Pop-Location

# ---------- MongoDB check ----------
$mongoUp = Test-NetConnection -ComputerName localhost -Port 27017 -InformationLevel Quiet -WarningAction SilentlyContinue
if (-not $mongoUp) {
    Warn "MongoDB is NOT running on localhost:27017."
    Warn "Install MongoDB Community (https://www.mongodb.com/try/download/community) and start it,"
    Warn "or with Docker:  docker run -d -p 27017:27017 --name apklens-mongo mongo:7"
    Warn "Then re-run this script (or just run .\start.ps1)."
    exit 1
}

# ---------- start both servers ----------
Info "Starting backend (http://localhost:8001) and frontend (http://localhost:3000)..."
Start-Process powershell -ArgumentList "-NoExit","-Command","cd '$Root\backend'; python -m uvicorn server:app --host 0.0.0.0 --port 8001 --reload"
Start-Process powershell -ArgumentList "-NoExit","-Command","cd '$Root\frontend'; yarn start"
Info "Done! The app will open at http://localhost:3000 (backend on :8001)."
