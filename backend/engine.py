"""Decompilation engine wrapper (JADX + apktool) invoked as local CLIs."""
import os
import subprocess


class EngineError(Exception):
    pass


def check_engines(jadx_bin: str, apktool_bin: str):
    """Return availability dict for configured engine binaries."""
    return {
        "jadx": {"path": jadx_bin, "available": _runnable(jadx_bin)},
        "apktool": {"path": apktool_bin, "available": _runnable(apktool_bin)},
        "java": {"available": _java_available()},
    }


def _runnable(path: str) -> bool:
    return bool(path) and os.path.isfile(path) and os.access(path, os.X_OK)


def _java_available() -> bool:
    try:
        subprocess.run(["java", "-version"], capture_output=True, timeout=15)
        return True
    except (OSError, subprocess.SubprocessError):
        return False


def run_jadx(jadx_bin: str, apk_path: str, out_dir: str):
    sources = os.path.join(out_dir, "jadx")
    os.makedirs(sources, exist_ok=True)
    cmd = [jadx_bin, "-d", sources, "--no-res", "--show-bad-code", apk_path]
    _run(cmd, "JADX", timeout=1800)
    return sources


def run_apktool(apktool_bin: str, apk_path: str, out_dir: str):
    decoded = os.path.join(out_dir, "apktool")
    cmd = [apktool_bin, "d", "-f", "-o", decoded, apk_path]
    _run(cmd, "apktool", timeout=1800)
    return decoded


def _run(cmd, name, timeout):
    try:
        proc = subprocess.run(cmd, capture_output=True, text=True, timeout=timeout)
    except FileNotFoundError:
        raise EngineError(f"{name} binary not found at '{cmd[0]}'. Configure the path in Settings.")
    except subprocess.TimeoutExpired:
        raise EngineError(f"{name} timed out while decompiling the APK.")
    except OSError as exc:
        raise EngineError(f"{name} failed to start: {exc}")
    if proc.returncode != 0:
        tail = (proc.stderr or proc.stdout or "").strip()[-600:]
        raise EngineError(f"{name} exited with code {proc.returncode}: {tail}")
    return proc
