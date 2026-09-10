import { useEffect, useState } from "react";
import { api, Finding } from "@/lib/api";
import { sev } from "@/lib/theme";
import { ShieldAlert } from "lucide-react";

export function ManifestAudit({ scanId, onSelect }: {
  scanId: string; onSelect: (f: Finding) => void;
}) {
  const [items, setItems] = useState<Finding[]>([]);
  useEffect(() => {
    api.findings(scanId, { category: "manifest", limit: 500 }).then((d) => setItems(d.items));
  }, [scanId]);

  return (
    <div className="flex h-full flex-col">
      <div className="flex items-center gap-2 border-b border-[#23283B] bg-[#10121B] px-4 py-2 font-mono text-xs text-slate-400">
        <ShieldAlert className="h-3.5 w-3.5 text-amber-400" />
        AndroidManifest.xml audit — {items.length} issues
      </div>
      <div className="flex-1 overflow-auto p-3">
        <div className="space-y-2">
          {items.map((f) => {
            const s = sev(f.severity);
            return (
              <button
                key={f.id}
                data-testid={`manifest-row-${f.id}`}
                onClick={() => onSelect(f)}
                className="flex w-full items-start gap-3 rounded-sm border border-[#23283B] bg-[#161926] p-3 text-left transition-colors hover:border-[#333A54]"
              >
                <span className={`mt-0.5 rounded border px-2 py-0.5 font-mono text-[10px] font-bold uppercase ${s.badge}`}>
                  {f.severity}
                </span>
                <div className="min-w-0 flex-1">
                  <div className="truncate font-mono text-xs text-slate-100">{f.value}</div>
                  <div className="mt-0.5 font-mono text-[11px] text-slate-500">{f.context}</div>
                </div>
              </button>
            );
          })}
          {items.length === 0 && <div className="p-6 text-center font-mono text-xs text-slate-600">No manifest issues.</div>}
        </div>
      </div>
    </div>
  );
}
