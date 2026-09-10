import { useEffect, useState } from "react";
import { api, Rule } from "@/lib/api";
import { toast } from "sonner";
import { Plus, Trash2, Play, Power } from "lucide-react";

export function CustomRules({ scanId, onRescan }: {
  scanId: string; onRescan: () => void;
}) {
  const [rules, setRules] = useState<Rule[]>([]);
  const [name, setName] = useState("");
  const [pattern, setPattern] = useState("");
  const [type, setType] = useState("regex");
  const [severity, setSeverity] = useState("medium");
  const [busy, setBusy] = useState(false);

  const load = () => api.listRules().then(setRules);
  useEffect(() => { load(); }, []);

  const save = async () => {
    if (!name.trim() || !pattern.trim()) { toast.error("Name and pattern required"); return; }
    await api.createRule({ name, pattern, pattern_type: type, severity, enabled: true });
    setName(""); setPattern("");
    toast.success("Rule saved");
    load();
  };

  const toggle = async (r: Rule) => { await api.updateRule(r.id, { ...r, enabled: !r.enabled }); load(); };
  const del = async (id: string) => { await api.deleteRule(id); load(); };

  const rescan = async () => {
    setBusy(true);
    try {
      const res = await api.rescan(scanId);
      toast.success(`Re-scan complete — ${res.added} custom hits`);
      onRescan();
    } catch { toast.error("Re-scan failed (sources unavailable)"); }
    setBusy(false);
  };

  return (
    <div className="flex h-full flex-col overflow-y-auto p-4">
      <div className="mb-4 rounded-sm border border-[#23283B] bg-[#161926] p-4">
        <h3 className="mb-3 font-mono text-sm font-bold text-slate-100">New Hunt Rule</h3>
        <div className="grid grid-cols-2 gap-3">
          <input data-testid="rule-name-input" value={name} onChange={(e) => setName(e.target.value)}
            placeholder="rule name" className="rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1.5 font-mono text-xs text-slate-200 outline-none focus:border-[#00E599]/50" />
          <div className="flex gap-2">
            <select value={type} onChange={(e) => setType(e.target.value)} className="flex-1 rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1.5 font-mono text-xs text-slate-200">
              <option value="regex">regex</option>
              <option value="string">string</option>
            </select>
            <select value={severity} onChange={(e) => setSeverity(e.target.value)} className="flex-1 rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1.5 font-mono text-xs text-slate-200">
              {["critical", "high", "medium", "low", "info"].map((s) => <option key={s} value={s}>{s}</option>)}
            </select>
          </div>
        </div>
        <input data-testid="rule-pattern-input" value={pattern} onChange={(e) => setPattern(e.target.value)}
          placeholder="pattern e.g. (?i)internal-secret-\\w+"
          className="mt-3 w-full rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1.5 font-mono text-xs text-[#00E599] outline-none focus:border-[#00E599]/50" />
        <div className="mt-3 flex gap-2">
          <button data-testid="custom-rule-save-button" onClick={save}
            className="flex items-center gap-1.5 rounded-sm bg-[#00E599] px-3 py-1.5 font-mono text-xs font-bold text-[#04120C] hover:bg-[#00C885]">
            <Plus className="h-3.5 w-3.5" /> Save Rule
          </button>
          <button data-testid="rescan-button" onClick={rescan} disabled={busy}
            className="flex items-center gap-1.5 rounded-sm border border-[#38BDF8]/40 bg-[#38BDF8]/10 px-3 py-1.5 font-mono text-xs text-[#38BDF8] hover:bg-[#38BDF8]/20 disabled:opacity-50">
            <Play className="h-3.5 w-3.5" /> {busy ? "Scanning…" : "Re-scan (no re-decompile)"}
          </button>
        </div>
      </div>

      <div className="space-y-2">
        {rules.map((r) => (
          <div key={r.id} data-testid={`rule-item-${r.id}`}
            className={`flex items-center gap-3 rounded-sm border border-[#23283B] bg-[#161926] p-3 ${r.enabled ? "" : "opacity-50"}`}>
            <button onClick={() => toggle(r)} className={`${r.enabled ? "text-[#00E599]" : "text-slate-600"}`}>
              <Power className="h-4 w-4" />
            </button>
            <div className="min-w-0 flex-1">
              <div className="font-mono text-xs font-semibold text-slate-100">{r.name} <span className="text-slate-600">· {r.pattern_type} · {r.severity}</span></div>
              <code className="block truncate font-mono text-[11px] text-[#38BDF8]">{r.pattern}</code>
            </div>
            <button data-testid={`rule-delete-${r.id}`} onClick={() => del(r.id)} className="text-slate-500 hover:text-rose-400">
              <Trash2 className="h-3.5 w-3.5" />
            </button>
          </div>
        ))}
        {rules.length === 0 && <div className="p-6 text-center font-mono text-xs text-slate-600">No custom rules yet.</div>}
      </div>
    </div>
  );
}
