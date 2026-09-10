# APKLens - start both servers (Windows PowerShell). Run setup.ps1 first (once).
$Root = Split-Path -Parent $MyInvocation.MyCommand.Path
Start-Process powershell -ArgumentList "-NoExit","-Command","cd '$Root\backend'; python -m uvicorn server:app --host 0.0.0.0 --port 8001 --reload"
Start-Process powershell -ArgumentList "-NoExit","-Command","cd '$Root\frontend'; yarn start"
Write-Host "APKLens starting -> http://localhost:3000 (backend :8001)" -ForegroundColor Green
