# APKLens — Product Requirements Document

## Original Problem Statement
Local, self-hosted web app for Android APK static analysis for a solo bug-bounty pentester. Decompiles an APK (JADX + apktool local CLIs), auto-extracts security findings (secrets, endpoints, misconfigurations), and provides a fast, searchable dark terminal-style dashboard. Must handle large APKs without freezing (background jobs, on-demand file serving, indexed findings). No auth, single-user, APKs never leave the local machine.

## Architecture
- **Frontend**: React + TypeScript (CRA + craco), Tailwind, shadcn/ui, lucide-react, sonner. 3-panel IDE dashboard.
- **Backend**: FastAPI + Motor (async Mongo). Background scan jobs via `asyncio.create_task` + ThreadPoolExecutor for blocking decompile/scan. Polling-based live progress.
- **DB**: MongoDB collections — `scans`, `findings` (indexed on scan_id/category/severity/triage), `custom_rules`, `settings`.
- **Engines**: JADX (`/opt/engines/jadx/bin/jadx`) + apktool (`/opt/engines/apktool`) + Java 17. Paths configurable via Settings.
- **Workspace**: `/app/data/scan_workspace/<scan_id>/` (outside backend to avoid uvicorn --reload storms).

## User Persona
Solo penetration tester / bug-bounty hunter running the tool locally.

## Core Requirements (static)
1. APK upload (streamed to disk) + async job management with live progress (queued→decompiling→scanning→complete/failed).
2. Decompilation wrapper (JADX + apktool) with graceful failure messages.
3. Secret detection: regex signature library + Shannon entropy scoring.
4. User-defined custom search rules (regex/string), reusable, re-runnable without re-decompiling.
5. Endpoint/URL/IP extraction; flag internal IPs & cleartext HTTP.
6. Manifest audit (exported components, debuggable, allowBackup, cleartext, dangerous perms, deep links).
7. Crypto & insecure-storage checks (MD5/SHA1/DES/ECB, hardcoded IV/keys, world-readable storage, TLS bypass).
8. Deobfuscation helper (Base64/hex/URL/ROT13); ProGuard recovery labeled heuristic only.
9. Interactive dashboard: file tree + categories, code viewer with highlighted finding lines & jump-to-line, finding inspector, global search (Cmd+K), type/severity/triage filters, triage persistence.

## Implemented (2026-06)
- ✅ All 9 modules end-to-end. Full secret values shown (no masking).
- ✅ Preseeded sample `sample-acme-wallet-demo-v3` (~88 findings) incl. SMTP/SMS keys, admin panels, encoded secrets.
- ✅ Real JADX + apktool + JDK17 (arm64) persistently installed at `/app/engines`; heap capped via `ENGINE_JAVA_OPTS` (default -Xmx4g).
- ✅ APK blobs via Emergent object storage (streamed from disk).
- ✅ Stability: upload returns immediately; decompile/scan in background; live `decompiled_files` counter written by a monitor task (no event-loop blocking). Verified no 502 / no OOM under load.
- ✅ Large APK support: chunked upload (init/chunk/complete, 5MB chunks) — handles 100s of MB past the Cloudflare single-request limit. 1GB cap via `MAX_UPLOAD_BYTES`.
- ✅ Encoded-secret detection: decodes base64/hex/url in code and re-runs secret signatures (findings tagged `encoded`).
- ✅ Admin/management panel & URL detection.
- ✅ SMTP + SMS API secret signatures (SendGrid, Mailgun, Twilio, Vonage/Nexmo, MessageBird, Plivo, Postmark, SMTP creds/URLs).
- ✅ Noise controls: `dedupe=true` collapses duplicate findings (Mongo aggregation, sorted+paginated), UI `dedup` toggle + ×N badges.

## Remaining / Backlog
- **P1**: WebSocket live progress (currently polling every 1.5s).
- **P2**: Findings pagination UI when >100 in a category (backend supports skip/limit).
- **P2**: Syntax token coloring in code viewer (currently plain monospace + hit highlight).
- **P2**: Export report (JSON/Markdown) of findings.
- **P2**: file_tree silent truncation at 8000 nodes — add a "truncated" indicator.

## Notes
- Uploaded APKs & decompiled sources are stored on local disk by design (tool is local-only; object storage would violate "APKs never leave the local system" and cannot be decompiled by local CLIs).
