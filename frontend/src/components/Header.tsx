import { Search, Upload, Settings, ScanLine, Zap } from "lucide-react";
import { Scan } from "@/lib/api";

export function Header({
  scans, activeScan, onSelectScan, onUpload, onSearch, onSettings,
}: {
  scans: Scan[];
  activeScan: Scan | null;
  onSelectScan: (id: string) => void;
  onUpload: () => void;
  onSearch: () => void;
  onSettings: () => void;
}) {
  const c = activeScan?.counts;
  const stat = (label: string, val: number, color: string) => (
    <div className="flex flex-col items-end leading-none">
      <span className={`font-mono text-base font-bold ${color}`}>{val}</span>
      <span className="text-[10px] uppercase tracking-widest text-slate-500">{label}</span>
    </div>
  );

  return (
    <header className="flex h-14 items-center gap-4 border-b border-[#23283B] bg-[#10121B] px-4">
      <div className="flex items-center gap-2 pr-3">
        <div className="flex h-8 w-8 items-center justify-center rounded-sm bg-[#00E599]/10 ring-1 ring-[#00E599]/40">
          <ScanLine className="h-4 w-4 text-[#00E599]" />
        </div>
        <div className="leading-none">
          <div className="font-mono text-sm font-extrabold tracking-tight text-slate-100">APKLens</div>
          <div className="text-[9px] uppercase tracking-[0.2em] text-slate-500">static apk recon</div>
        </div>
      </div>

      <select
        data-testid="scan-selector"
        value={activeScan?.id || ""}
        onChange={(e) => onSelectScan(e.target.value)}
        className="max-w-[280px] truncate rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1.5 font-mono text-xs text-slate-300 outline-none focus:border-[#00E599]/50"
      >
        {scans.length === 0 && <option value="">no scans</option>}
        {scans.map((s) => (
          <option key={s.id} value={s.id}>
            {`${s.filename}${s.is_sample ? " (sample)" : ""} — ${s.status}`}
          </option>
        ))}
      </select>

      <button
        data-testid="global-search-trigger"
        onClick={onSearch}
        className="group flex flex-1 items-center gap-2 rounded-sm border border-[#23283B] bg-[#0A0B10] px-3 py-1.5 text-left text-slate-500 transition-colors hover:border-[#00E599]/40"
      >
        <Search className="h-3.5 w-3.5" />
        <span className="text-xs">Search findings & source…</span>
        <kbd className="ml-auto rounded border border-[#23283B] bg-[#161926] px-1.5 py-0.5 font-mono text-[10px] text-slate-400">⌘K</kbd>
      </button>

      {c && (
        <div className="hidden items-center gap-5 border-l border-[#23283B] pl-5 md:flex">
          {stat("secrets", c.by_category?.secret || 0, "text-[#00E599]")}
          {stat("endpoints", c.by_category?.endpoint || 0, "text-[#38BDF8]")}
          {stat("critical", c.by_severity?.critical || 0, "text-rose-400")}
        </div>
      )}

      <button
        data-testid="upload-button"
        onClick={onUpload}
        className="flex items-center gap-1.5 rounded-sm bg-[#00E599] px-3 py-1.5 font-mono text-xs font-bold text-[#04120C] transition-colors hover:bg-[#00C885]"
      >
        <Upload className="h-3.5 w-3.5" /> Upload APK
      </button>
      <button
        data-testid="settings-button"
        onClick={onSettings}
        className="rounded-sm border border-[#23283B] p-1.5 text-slate-400 transition-colors hover:text-[#00E599]"
      >
        <Settings className="h-4 w-4" />
      </button>
    </header>
  );
}
