"""APKLens static analysis engine: secrets, endpoints, crypto, manifest, deobfuscation."""
import math
import re
import base64
import binascii
import urllib.parse
import os
import xml.etree.ElementTree as ET

ANDROID_NS = "{http://schemas.android.com/apk/res/android}"

# ---------------------------------------------------------------------------
# Entropy
# ---------------------------------------------------------------------------
def shannon_entropy(data: str) -> float:
    if not data:
        return 0.0
    freq = {}
    for c in data:
        freq[c] = freq.get(c, 0) + 1
    entropy = 0.0
    length = len(data)
    for count in freq.values():
        p = count / length
        entropy -= p * math.log2(p)
    return round(entropy, 3)


# ---------------------------------------------------------------------------
# Secret signatures
# ---------------------------------------------------------------------------
SECRET_SIGNATURES = [
    {"type": "AWS Access Key ID", "severity": "critical",
     "regex": re.compile(r"AKIA[0-9A-Z]{16}")},
    {"type": "AWS Secret Access Key", "severity": "critical",
     "regex": re.compile(r"(?i)aws.{0,20}?['\"][0-9a-zA-Z/+]{40}['\"]")},
    {"type": "Google API Key", "severity": "high",
     "regex": re.compile(r"AIza[0-9A-Za-z\-_]{35}")},
    {"type": "Google OAuth Token", "severity": "high",
     "regex": re.compile(r"ya29\.[0-9A-Za-z\-_]+")},
    {"type": "Firebase Database URL", "severity": "medium",
     "regex": re.compile(r"https://[a-z0-9\-]+\.firebaseio\.com")},
    {"type": "Firebase App / FCM Key", "severity": "high",
     "regex": re.compile(r"AAAA[A-Za-z0-9_\-]{7}:[A-Za-z0-9_\-]{140}")},
    {"type": "GCP Service Account Private Key", "severity": "critical",
     "regex": re.compile(r"\"private_key\"\s*:\s*\"-----BEGIN PRIVATE KEY-----")},
    {"type": "Slack Token", "severity": "high",
     "regex": re.compile(r"xox[baprs]-[0-9A-Za-z\-]{10,48}")},
    {"type": "Stripe Live Secret Key", "severity": "critical",
     "regex": re.compile(r"sk_live_[0-9a-zA-Z]{24}")},
    {"type": "Stripe Publishable Key", "severity": "low",
     "regex": re.compile(r"pk_live_[0-9a-zA-Z]{24}")},
    {"type": "GitHub Personal Access Token", "severity": "high",
     "regex": re.compile(r"ghp_[0-9A-Za-z]{36}")},
    {"type": "Twilio API Key", "severity": "high",
     "regex": re.compile(r"SK[0-9a-fA-F]{32}")},
    {"type": "Twilio Account SID", "severity": "high",
     "regex": re.compile(r"AC[0-9a-fA-F]{32}")},
    {"type": "Twilio Auth Token", "severity": "critical",
     "regex": re.compile(r"(?i)twilio.{0,30}['\"][0-9a-f]{32}['\"]")},
    {"type": "SendGrid API Key", "severity": "critical",
     "regex": re.compile(r"SG\.[A-Za-z0-9_\-]{20,24}\.[A-Za-z0-9_\-]{39,45}")},
    {"type": "Mailgun API Key", "severity": "high",
     "regex": re.compile(r"key-[0-9a-zA-Z]{32}")},
    {"type": "Mailchimp / Mandrill API Key", "severity": "high",
     "regex": re.compile(r"[0-9a-f]{32}-us[0-9]{1,2}")},
    {"type": "Vonage / Nexmo Secret", "severity": "high",
     "regex": re.compile(r"(?i)(nexmo|vonage).{0,30}['\"][0-9a-zA-Z]{12,20}['\"]")},
    {"type": "MessageBird API Key", "severity": "high",
     "regex": re.compile(r"(?i)messagebird.{0,30}['\"][0-9A-Za-z]{25}['\"]")},
    {"type": "Plivo Auth Token", "severity": "high",
     "regex": re.compile(r"(?i)plivo.{0,30}['\"][0-9A-Za-z]{20,40}['\"]")},
    {"type": "Postmark Server Token", "severity": "high",
     "regex": re.compile(r"(?i)postmark.{0,30}['\"][0-9a-f\-]{36}['\"]")},
    {"type": "SMTP Credentials in URL", "severity": "critical",
     "regex": re.compile(r"smtps?://[^\s:'\"/]+:[^\s@'\"]+@[^\s'\"]+")},
    {"type": "SMTP Password", "severity": "critical",
     "regex": re.compile(r"(?i)(smtp[_.]?(pass|password|pwd|secret)|mail[_.]?(pass|password))['\"]?\s*[=:]\s*['\"][^'\"\s]{4,}['\"]")},
    {"type": "SMTP User", "severity": "medium",
     "regex": re.compile(r"(?i)(smtp[_.]?(user|username|login)|mail[_.]?user)['\"]?\s*[=:]\s*['\"][^'\"\s]{3,}['\"]")},
    {"type": "SMTP Host", "severity": "low",
     "regex": re.compile(r"(?i)(smtp[_.]?host|mail[_.]?host|mailhost)['\"]?\s*[=:]\s*['\"][^'\"\s]{3,}['\"]")},
    {"type": "JSON Web Token (JWT)", "severity": "medium",
     "regex": re.compile(r"eyJ[A-Za-z0-9_\-]{10,}\.eyJ[A-Za-z0-9_\-]{10,}\.[A-Za-z0-9_\-]{10,}")},
    {"type": "Private Key Block", "severity": "critical",
     "regex": re.compile(r"-----BEGIN (?:RSA |EC |DSA |OPENSSH )?PRIVATE KEY-----")},
    {"type": "Email Address", "severity": "info",
     "regex": re.compile(r"[A-Za-z0-9._%+\-]+@[A-Za-z0-9.\-]+\.[A-Za-z]{2,}")},
    {"type": "Hardcoded Password", "severity": "high",
     "regex": re.compile(r"(?i)(password|passwd|pwd)\s*[=:]\s*['\"][^'\"\s]{4,}['\"]")},
    {"type": "Generic API Key / Secret", "severity": "medium", "entropy_min": 3.5,
     "regex": re.compile(r"(?i)(api[_\-]?key|secret|token|auth[_\-]?key|access[_\-]?key)['\"]?\s*[=:]\s*['\"]([A-Za-z0-9_\-\.=/+]{12,})['\"]")},
]

# ---------------------------------------------------------------------------
# Endpoints
# ---------------------------------------------------------------------------
URL_RE = re.compile(r"https?://[^\s\"'<>)\\]+")
IP_RE = re.compile(r"\b(?:(?:25[0-5]|2[0-4]\d|[01]?\d?\d)\.){3}(?:25[0-5]|2[0-4]\d|[01]?\d?\d)\b")
ADMIN_KEYWORDS = ("admin", "administrator", "adminpanel", "admin-panel", "admin_area",
                  "adminarea", "dashboard", "wp-admin", "wp-login", "manage", "management",
                  "console", "backend", "cpanel", "superuser", "sysadmin", "controlpanel",
                  "control-panel", "phpmyadmin", "webadmin")
ADMIN_RE = re.compile(
    r"""['"](/(?:%s)[A-Za-z0-9_/\-.]*)['"]""" % "|".join(ADMIN_KEYWORDS), re.I)


def _is_admin_url(url: str) -> bool:
    low = url.lower()
    return any(("/" + k) in low or ("." + k) in low for k in ADMIN_KEYWORDS)

def is_private_ip(ip: str) -> bool:
    parts = ip.split(".")
    try:
        a, b = int(parts[0]), int(parts[1])
    except (ValueError, IndexError):
        return False
    if a == 10 or a == 127:
        return True
    if a == 192 and b == 168:
        return True
    if a == 172 and 16 <= b <= 31:
        return True
    if a == 169 and b == 254:
        return True
    return False

# ---------------------------------------------------------------------------
# Crypto / insecure storage
# ---------------------------------------------------------------------------
CRYPTO_SIGNATURES = [
    {"type": "Weak Hash: MD5", "severity": "medium",
     "regex": re.compile(r"(?i)(MessageDigest\.getInstance\(\s*['\"]MD5['\"]|['\"]MD5['\"])")},
    {"type": "Weak Hash: SHA-1", "severity": "medium",
     "regex": re.compile(r"(?i)MessageDigest\.getInstance\(\s*['\"]SHA-?1['\"]")},
    {"type": "Weak Cipher: DES", "severity": "high",
     "regex": re.compile(r"(?i)Cipher\.getInstance\(\s*['\"]DES")},
    {"type": "Insecure Cipher Mode: ECB", "severity": "high",
     "regex": re.compile(r"(?i)Cipher\.getInstance\(\s*['\"][A-Z0-9]+/ECB")},
    {"type": "Hardcoded IV", "severity": "medium",
     "regex": re.compile(r"(?i)new\s+IvParameterSpec\s*\(")},
    {"type": "Hardcoded Crypto Key (SecretKeySpec)", "severity": "high",
     "regex": re.compile(r"(?i)new\s+SecretKeySpec\s*\(")},
    {"type": "Insecure Storage: World Readable", "severity": "high",
     "regex": re.compile(r"MODE_WORLD_READABLE")},
    {"type": "Insecure Storage: World Writeable", "severity": "high",
     "regex": re.compile(r"MODE_WORLD_WRITEABLE")},
    {"type": "External Storage Write", "severity": "low",
     "regex": re.compile(r"getExternalStorage(?:Directory|PublicDirectory)?\s*\(")},
    {"type": "TrustManager Bypass (Insecure TLS)", "severity": "critical",
     "regex": re.compile(r"(?i)(checkServerTrusted|X509TrustManager|ALLOW_ALL_HOSTNAME_VERIFIER)")},
]

DANGEROUS_PERMISSIONS = {
    "android.permission.READ_SMS", "android.permission.SEND_SMS",
    "android.permission.RECEIVE_SMS", "android.permission.READ_CONTACTS",
    "android.permission.WRITE_CONTACTS", "android.permission.ACCESS_FINE_LOCATION",
    "android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.RECORD_AUDIO",
    "android.permission.CAMERA", "android.permission.READ_CALL_LOG",
    "android.permission.WRITE_CALL_LOG", "android.permission.READ_EXTERNAL_STORAGE",
    "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE",
    "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.REQUEST_INSTALL_PACKAGES",
    "android.permission.QUERY_ALL_PACKAGES", "android.permission.GET_ACCOUNTS",
}

TEXT_EXTS = {".java", ".kt", ".smali", ".xml", ".json", ".txt", ".properties",
             ".js", ".html", ".gradle", ".cfg", ".conf", ".yml", ".yaml"}
MAX_FILE_BYTES = 3 * 1024 * 1024


def _context(lines, idx, span=2):
    start = max(0, idx - span)
    end = min(len(lines), idx + span + 1)
    return "\n".join(lines[start:end])


def mask(value: str) -> str:
    if len(value) <= 8:
        return value[0] + "*" * (len(value) - 1) if value else value
    return value[:4] + "*" * (len(value) - 8) + value[-4:]


def scan_text_file(rel_path: str, text: str):
    """Return list of finding dicts (without scan_id) for one file."""
    findings = []
    lines = text.split("\n")
    for idx, line in enumerate(lines):
        # --- secrets ---
        for sig in SECRET_SIGNATURES:
            for m in sig["regex"].finditer(line):
                value = m.group(0)
                ent = shannon_entropy(value)
                if "entropy_min" in sig and ent < sig["entropy_min"]:
                    continue
                findings.append({
                    "category": "secret",
                    "type": sig["type"],
                    "severity": sig["severity"],
                    "file": rel_path,
                    "line": idx + 1,
                    "value": value[:400],
                    "masked_value": mask(value[:400]),
                    "context": _context(lines, idx),
                    "entropy": ent,
                })
        # --- crypto / storage ---
        for sig in CRYPTO_SIGNATURES:
            if sig["regex"].search(line):
                findings.append({
                    "category": "crypto",
                    "type": sig["type"],
                    "severity": sig["severity"],
                    "file": rel_path,
                    "line": idx + 1,
                    "value": line.strip()[:400],
                    "masked_value": line.strip()[:400],
                    "context": _context(lines, idx),
                    "entropy": 0.0,
                })
        # --- endpoints: URLs ---
        for m in URL_RE.finditer(line):
            url = m.group(0).rstrip(".,;")
            is_http = url.lower().startswith("http://")
            admin = _is_admin_url(url)
            if admin:
                etype, esev, etags = "Admin / Management URL", "high", ["admin"]
            elif is_http:
                etype, esev, etags = "Cleartext URL (HTTP)", "medium", ["cleartext"]
            else:
                etype, esev, etags = "URL", "info", []
            if is_http and admin:
                etags = etags + ["cleartext"]
            findings.append({
                "category": "endpoint",
                "type": etype,
                "severity": esev,
                "file": rel_path,
                "line": idx + 1,
                "value": url[:400],
                "masked_value": url[:400],
                "context": _context(lines, idx),
                "entropy": 0.0,
                "tags": etags,
            })
        # --- endpoints: admin / management paths (string literals) ---
        for m in ADMIN_RE.finditer(line):
            path = m.group(1)
            findings.append({
                "category": "endpoint",
                "type": "Admin / Management Endpoint",
                "severity": "high",
                "file": rel_path,
                "line": idx + 1,
                "value": path[:400],
                "masked_value": path[:400],
                "context": _context(lines, idx),
                "entropy": 0.0,
                "tags": ["admin"],
            })
        # --- endpoints: IPs ---
        for m in IP_RE.finditer(line):
            ip = m.group(0)
            if ip.startswith("0.") or ip == "255.255.255.255":
                continue
            priv = is_private_ip(ip)
            findings.append({
                "category": "endpoint",
                "type": "Private / Internal IP" if priv else "IP Address",
                "severity": "high" if priv else "info",
                "file": rel_path,
                "line": idx + 1,
                "value": ip,
                "masked_value": ip,
                "context": _context(lines, idx),
                "entropy": 0.0,
                "tags": ["internal"] if priv else [],
            })
    return findings


def scan_custom_rule(rel_path: str, text: str, rule: dict):
    findings = []
    lines = text.split("\n")
    if rule.get("pattern_type") == "regex":
        try:
            rx = re.compile(rule["pattern"])
        except re.error:
            return findings
        matcher = lambda l: [m.group(0) for m in rx.finditer(l)]
    else:
        needle = rule["pattern"]
        matcher = lambda l: [needle] if needle in l else []
    for idx, line in enumerate(lines):
        for val in matcher(line):
            findings.append({
                "category": "custom",
                "type": rule["name"],
                "severity": rule.get("severity", "medium"),
                "file": rel_path,
                "line": idx + 1,
                "value": val[:400],
                "masked_value": val[:400],
                "context": _context(lines, idx),
                "entropy": shannon_entropy(val),
                "rule_id": rule.get("id"),
            })
    return findings


def iter_scan_files(scan_dir: str):
    for root, _dirs, files in os.walk(scan_dir):
        for fn in files:
            ext = os.path.splitext(fn)[1].lower()
            if ext and ext not in TEXT_EXTS:
                continue
            full = os.path.join(root, fn)
            try:
                if os.path.getsize(full) > MAX_FILE_BYTES:
                    continue
            except OSError:
                continue
            rel = os.path.relpath(full, scan_dir)
            try:
                with open(full, "r", encoding="utf-8", errors="ignore") as fh:
                    yield rel, fh.read()
            except OSError:
                continue


# ---------------------------------------------------------------------------
# Manifest audit
# ---------------------------------------------------------------------------
def audit_manifest(manifest_path: str):
    findings = []
    if not os.path.exists(manifest_path):
        return findings
    try:
        tree = ET.parse(manifest_path)
        root = tree.getroot()
    except ET.ParseError:
        return findings
    rel = os.path.relpath(manifest_path, os.path.dirname(os.path.dirname(manifest_path)))

    app = root.find("application")
    if app is not None:
        if app.get(ANDROID_NS + "debuggable") == "true":
            findings.append(_mf("android:debuggable=\"true\"", "critical",
                                "Application is debuggable in production", rel))
        if app.get(ANDROID_NS + "allowBackup") == "true":
            findings.append(_mf("android:allowBackup=\"true\"", "medium",
                                "Application data can be backed up via ADB", rel))
        if app.get(ANDROID_NS + "usesCleartextTraffic") == "true":
            findings.append(_mf("android:usesCleartextTraffic=\"true\"", "high",
                                "Cleartext (HTTP) network traffic is permitted", rel))

        for tag, label in [("activity", "Activity"), ("service", "Service"),
                           ("receiver", "Receiver"), ("provider", "Provider")]:
            for comp in app.iter(tag):
                name = comp.get(ANDROID_NS + "name", "?")
                exported = comp.get(ANDROID_NS + "exported")
                has_filter = comp.find("intent-filter") is not None
                if exported == "true" or (exported is None and has_filter):
                    findings.append(_mf(
                        f"Exported {label}: {name}", "high",
                        f"{label} is exported and reachable by other apps", rel))
                # deep links
                for intent in comp.findall("intent-filter"):
                    for data in intent.findall("data"):
                        scheme = data.get(ANDROID_NS + "scheme")
                        host = data.get(ANDROID_NS + "host")
                        if scheme:
                            hijackable = scheme not in ("https", "http")
                            findings.append(_mf(
                                f"Deep link: {scheme}://{host or '*'} ({name})",
                                "medium" if hijackable else "low",
                                "Custom-scheme deep link may be hijackable" if hijackable
                                else "Deep link surface", rel, category="manifest", tags=["deeplink"]))

    for perm in root.iter("uses-permission"):
        name = perm.get(ANDROID_NS + "name", "")
        if name in DANGEROUS_PERMISSIONS:
            findings.append(_mf(f"Dangerous permission: {name}", "medium",
                                "App requests a sensitive runtime permission", rel,
                                tags=["permission"]))
    return findings


def _mf(value, severity, context, rel, category="manifest", tags=None):
    return {
        "category": category,
        "type": value.split(":")[0] if ":" in value else value,
        "severity": severity,
        "file": rel,
        "line": 1,
        "value": value,
        "masked_value": value,
        "context": context,
        "entropy": 0.0,
        "tags": tags or [],
    }


# ---------------------------------------------------------------------------
# Deobfuscation helper
# ---------------------------------------------------------------------------
def deobfuscate(text: str, method: str):
    results = {}
    text = text.strip()
    if method in ("auto", "base64"):
        try:
            padded = text + "=" * (-len(text) % 4)
            decoded = base64.b64decode(padded, validate=False).decode("utf-8", "replace")
            if decoded and any(32 <= ord(c) < 127 for c in decoded):
                results["base64"] = decoded
        except (binascii.Error, ValueError):
            pass
    if method in ("auto", "hex"):
        try:
            cleaned = text.replace("0x", "").replace(" ", "")
            results["hex"] = bytes.fromhex(cleaned).decode("utf-8", "replace")
        except ValueError:
            pass
    if method in ("auto", "url"):
        dec = urllib.parse.unquote(text)
        if dec != text:
            results["url"] = dec
    if method in ("auto", "rot13"):
        results["rot13"] = text.encode("latin-1", "ignore").decode("latin-1").translate(_ROT13)
    return results


_ROT13 = str.maketrans(
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz",
    "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm")
