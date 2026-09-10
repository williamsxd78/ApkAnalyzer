"""Decompilation engine wrapper (JADX + apktool) invoked as local CLIs."""
import os
import subprocess


class EngineError(Exception):
    pass


def cpu_budget() -> int:
    """Effective CPU cores available to this container (respects cgroup quota)."""
    try:
        with open("/sys/fs/cgroup/cpu.max") as fh:
            quota, period = fh.read().split()
            if quota != "max":
                return max(1, int(int(quota) / int(period)))
    except (OSError, ValueError):
        pass
    return os.cpu_count() or 2


def _engine_env():
    """Subprocess env: JAVA on PATH + a bounded JVM heap (avoids OOM-killing the worker)."""
    env = dict(os.environ)
    java_home = os.environ.get("JAVA_HOME")
    if java_home:
        env["JAVA_HOME"] = java_home
        env["PATH"] = os.path.join(java_home, "bin") + os.pathsep + env.get("PATH", "")
    heap = os.environ.get("ENGINE_JAVA_OPTS", "-Xmx5g")
    env["JAVA_OPTS"] = (env.get("JAVA_OPTS", "") + " " + heap).strip()
    env.pop("JADX_OPTS", None)
    return env


def check_engines(jadx_bin: str, apktool_bin: str):
    return {
        "jadx": {"path": jadx_bin, "available": _runnable(jadx_bin)},
        "apktool": {"path": apktool_bin, "available": _runnable(apktool_bin)},
        "java": {"available": _java_available()},
    }


def _runnable(path: str) -> bool:
    return bool(path) and os.path.isfile(path) and os.access(path, os.X_OK)


def _java_available() -> bool:
    java_home = os.environ.get("JAVA_HOME")
    java_cmd = os.path.join(java_home, "bin", "java") if java_home else "java"
    try:
        subprocess.run([java_cmd, "-version"], capture_output=True, timeout=15, env=_engine_env())
        return True
    except (OSError, subprocess.SubprocessError):
        return False


def run_jadx(jadx_bin: str, apk_path: str, out_dir: str):
    sources = os.path.join(out_dir, "jadx")
    os.makedirs(sources, exist_ok=True)
    threads = str(cpu_budget())
    cmd = [jadx_bin, "-d", sources, "--no-res", "--no-debug-info",
           "--threads-count", threads, apk_path]
    timeout = int(os.environ.get("ENGINE_JADX_TIMEOUT", "600"))
    # Soft timeout: very large APKs on a CPU-limited host can grind for a long time.
    # JADX writes files progressively, so if we hit the budget we keep what was produced
    # and continue the scan with partial (but substantial) coverage instead of hanging.
    partial = _run(cmd, "JADX", timeout, soft_timeout=True)
    return {"sources": sources, "partial": partial}


def run_apktool(apktool_bin: str, apk_path: str, out_dir: str):
    decoded = os.path.join(out_dir, "apktool")
    cmd = [apktool_bin, "d", "-s", "-f", "-o", decoded, apk_path]
    _run(cmd, "apktool", timeout=1800)
    return decoded


def _run(cmd, name, timeout, soft_timeout=False):
    try:
        proc = subprocess.run(cmd, capture_output=True, text=True, timeout=timeout, env=_engine_env())
    except FileNotFoundError:
        raise EngineError(f"{name} binary not found at '{cmd[0]}'. Configure the path in Settings.")
    except subprocess.TimeoutExpired:
        if soft_timeout:
            return True  # timed out -> partial results, caller continues
        raise EngineError(f"{name} timed out while decompiling the APK.")
    except OSError as exc:
        raise EngineError(f"{name} failed to start: {exc}")
    if proc.returncode != 0:
        tail = (proc.stderr or proc.stdout or "").strip()[-600:]
        raise EngineError(f"{name} exited with code {proc.returncode}: {tail}")
    return False
