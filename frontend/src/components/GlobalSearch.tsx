import { useEffect, useState, useRef } from "react";
import { api, Finding } from "@/lib/api";
import { sev } from "@/lib/theme";
import { Search, CornerDownLeft } from "lucide-react";

export function GlobalSearch({ scanId, open, onClose, onSelect }: {
  scanId: string; open: boolean; onClose: () => void; onSelect: (f: Finding) => void;
}) {
  const [q, setQ] = useState("");
  const [items, setItems] = useState<Finding[]>([]);
  const [loading, setLoading] = useState(false);
  const inputRef = useRef<HTMLInputElement>(null);

  useEffect(() => {
    if (open) setTimeout(() => inputRef.current?.focus(), 30);
  }, [open]);

  useEffect(() => {
    if (!open) return;
    const h = setTimeout(() => {
      if (!q.trim()) { setItems([]); return; }
      setLoading(true);
      api.findings(scanId, { q, limit: 40 }).then((d) => { setItems(d.items); setLoading(false); });
    }, 180);
    return () => clearTimeout(h);
  }, [q, open, scanId]);

  useEffect(() => {
    const onKey = (e: KeyboardEvent) => { if (e.key === "Escape") onClose(); };
    if (open) window.addEventListener("keydown", onKey);
    return () => window.removeEventListener("keydown", onKey);
  }, [open, onClose]);

  if (!open) return null;

  return (
    <div className="fixed inset-0 z-50 flex items-start justify-center bg-[#0A0B10]/80 pt-24 backdrop-blur-md" onClick={onClose}>
      <div
        className="w-full max-w-2xl overflow-hidden rounded-lg border border-[#333A54] bg-[#10121B] shadow-2xl animate-fadein"
        onClick={(e) => e.stopPropagation()}
      >
        <div className="flex items-center gap-3 border-b border-[#23283B] px-4 py-3">
          <Search className="h-4 w-4 text-[#00E599]" />
          <input
            ref={inputRef}
            data-testid="global-search-input"
            value={q}
            onChange={(e) => setQ(e.target.value)}
            placeholder="Search secrets, endpoints, source & manifest…"
            className="flex-1 bg-transparent font-mono text-sm text-slate-100 outline-none placeholder:text-slate-600"
          />
          <kbd className="rounded border border-[#23283B] bg-[#161926] px-1.5 py-0.5 font-mono text-[10px] text-slate-500">ESC</kbd>
        </div>
        <div className="max-h-[50vh] overflow-y-auto">
          {loading && <div className="p-4 font-mono text-xs text-slate-500">searching…</div>}
          {!loading && q && items.length === 0 && <div className="p-4 font-mono text-xs text-slate-600">No matches.</div>}
          {items.map((f) => {
            const s = sev(f.severity);
            return (
              <button
                key={f.id}
                data-testid={`search-result-${f.id}`}
                onClick={() => { onSelect(f); onClose(); }}
                className="flex w-full items-center gap-3 border-b border-[#161926] px-4 py-2.5 text-left hover:bg-[#1E2235]"
              >
                <span className={`h-1.5 w-1.5 rounded-full ${s.dot}`} />
                <div className="min-w-0 flex-1">
                  <div className={`truncate font-mono text-xs ${s.text}`}>{f.type}</div>
                  <div className="truncate font-mono text-[11px] text-slate-500">{f.value}</div>
                </div>
                <span className="font-mono text-[10px] text-slate-600">{f.file.split("/").pop()}:{f.line}</span>
                <CornerDownLeft className="h-3 w-3 text-slate-600" />
              </button>
            );
          })}
        </div>
      </div>
    </div>
  );
}
