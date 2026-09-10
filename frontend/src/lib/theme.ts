export const SEVERITY_ORDER = ["critical", "high", "medium", "low", "info"];

export const SEV: Record<string, { badge: string; dot: string; text: string; bar: string }> = {
  critical: { badge: "bg-rose-500/10 text-rose-400 border-rose-500/40", dot: "bg-rose-500", text: "text-rose-400", bar: "bg-rose-500" },
  high: { badge: "bg-amber-500/10 text-amber-400 border-amber-500/40", dot: "bg-amber-500", text: "text-amber-400", bar: "bg-amber-500" },
  medium: { badge: "bg-yellow-500/10 text-yellow-300 border-yellow-500/40", dot: "bg-yellow-400", text: "text-yellow-300", bar: "bg-yellow-400" },
  low: { badge: "bg-sky-500/10 text-sky-400 border-sky-500/40", dot: "bg-sky-500", text: "text-sky-400", bar: "bg-sky-500" },
  info: { badge: "bg-slate-500/10 text-slate-400 border-slate-500/40", dot: "bg-slate-500", text: "text-slate-400", bar: "bg-slate-500" },
};

export const sev = (s: string) => SEV[s] || SEV.info;

export const CATEGORIES: { key: string; label: string; icon: string }[] = [
  { key: "secret", label: "Secrets", icon: "key" },
  { key: "endpoint", label: "Endpoints", icon: "globe" },
  { key: "manifest", label: "Manifest", icon: "file-cog" },
  { key: "crypto", label: "Crypto & Storage", icon: "shield-alert" },
  { key: "custom", label: "Custom Rules", icon: "crosshair" },
];

export const TRIAGE: Record<string, string> = {
  open: "text-slate-400 border-slate-600/50 bg-slate-500/5",
  confirmed: "text-emerald-400 border-emerald-500/40 bg-emerald-500/10",
  false_positive: "text-slate-400 border-slate-500/30 bg-slate-500/10 line-through opacity-60",
  dismissed: "text-rose-400/80 border-rose-500/20 bg-rose-500/10 opacity-50",
};

export const fmtBytes = (n: number) => {
  if (!n) return "0 B";
  const u = ["B", "KB", "MB", "GB"];
  const i = Math.floor(Math.log(n) / Math.log(1024));
  return `${(n / Math.pow(1024, i)).toFixed(1)} ${u[i]}`;
};
