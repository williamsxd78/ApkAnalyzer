import { useEffect, useState } from "react";
import { api, Finding } from "@/lib/api";
import { sev } from "@/lib/theme";
import { Globe, Lock, ShieldAlert, ArrowRight } from "lucide-react";

export function EndpointsTable({ scanId, onSelect }: {
  scanId: string; onSelect: (f: Finding) => void;
}) {
  const [items, setItems] = useState<Finding[]>([]);
  const [q, setQ] = useState("");

  useEffect(() => {
    api.findings(scanId, { category: "endpoint", limit: 500 }).then((d) => setItems(d.items));
  }, [scanId]);

  const filtered = items.filter((i) => i.value.toLowerCase().includes(q.toLowerCase()));
  const flagged = filtered.filter((i) => i.tags?.includes("cleartext") || i.tags?.includes("internal"));

  return (
    <div className="flex h-full flex-col">
      <div className="flex items-center gap-3 border-b border-[#23283B] bg-[#10121B] px-4 py-2">
        <input
          data-testid="endpoints-filter"
          value={q}
          onChange={(e) => setQ(e.target.value)}
          placeholder="filter endpoints…"
          className="flex-1 rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1 font-mono text-xs text-slate-200 outline-none focus:border-[#00E599]/50"
        />
        <span className="font-mono text-xs text-slate-500">{filtered.length} urls / ips</span>
        <span className="font-mono text-xs text-rose-400">{flagged.length} flagged</span>
      </div>
      <div className="flex-1 overflow-auto">
        <table className="w-full border-collapse font-mono text-xs">
          <thead className="sticky top-0 bg-[#10121B] text-[10px] uppercase tracking-widest text-slate-500">
            <tr>
              <th className="px-4 py-2 text-left">Type</th>
              <th className="px-4 py-2 text-left">Value</th>
              <th className="px-4 py-2 text-left">Location</th>
              <th className="px-2 py-2"></th>
            </tr>
          </thead>
          <tbody>
            {filtered.map((f) => {
              const cleartext = f.tags?.includes("cleartext");
              const internal = f.tags?.includes("internal");
              return (
                <tr
                  key={f.id}
                  data-testid={`endpoint-row-${f.id}`}
                  className="cursor-pointer border-b border-[#161926] hover:bg-[#1E2235]"
                  onClick={() => onSelect(f)}
                >
                  <td className="px-4 py-2 whitespace-nowrap">
                    <span className={`inline-flex items-center gap-1 ${sev(f.severity).text}`}>
                      {internal ? <ShieldAlert className="h-3 w-3" /> : cleartext ? <Lock className="h-3 w-3" /> : <Globe className="h-3 w-3" />}
                      {f.type}
                    </span>
                  </td>
                  <td className="max-w-[420px] truncate px-4 py-2 text-[#38BDF8]">{f.value}</td>
                  <td className="px-4 py-2 text-slate-500">{f.file.split("/").pop()}:{f.line}</td>
                  <td className="px-2 py-2 text-slate-600"><ArrowRight className="h-3 w-3" /></td>
                </tr>
              );
            })}
          </tbody>
        </table>
        {filtered.length === 0 && <div className="p-6 text-center font-mono text-xs text-slate-600">No endpoints extracted.</div>}
      </div>
    </div>
  );
}
