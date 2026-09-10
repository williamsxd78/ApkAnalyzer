import { useState } from "react";
import { api } from "@/lib/api";
import { Binary, ArrowDownUp } from "lucide-react";

export function Deobfuscator() {
  const [input, setInput] = useState("aHR0cDovL2FkbWluLmFjbWUtd2FsbGV0LmxvY2FsL2RlYnVn");
  const [method, setMethod] = useState("auto");
  const [results, setResults] = useState<Record<string, string>>({});

  const run = async () => {
    const d = await api.deobfuscate(input, method);
    setResults(d.results || {});
  };

  return (
    <div className="flex h-full flex-col overflow-y-auto p-4">
      <div className="rounded-sm border border-[#23283B] bg-[#161926] p-4">
        <h3 className="mb-3 flex items-center gap-2 font-mono text-sm font-bold text-slate-100">
          <Binary className="h-4 w-4 text-[#00E599]" /> Deobfuscation Helper
        </h3>
        <textarea
          data-testid="deobfuscator-input-field"
          value={input}
          onChange={(e) => setInput(e.target.value)}
          rows={4}
          placeholder="paste encoded string (Base64 / hex / URL / ROT)…"
          className="w-full rounded-sm border border-[#23283B] bg-[#0A0B10] p-2.5 font-mono text-xs text-[#00E599] outline-none focus:border-[#00E599]/50"
        />
        <div className="mt-3 flex gap-2">
          <select value={method} onChange={(e) => setMethod(e.target.value)}
            className="rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1.5 font-mono text-xs text-slate-200">
            {["auto", "base64", "hex", "url", "rot13"].map((m) => <option key={m} value={m}>{m}</option>)}
          </select>
          <button data-testid="deobfuscator-run" onClick={run}
            className="flex items-center gap-1.5 rounded-sm bg-[#00E599] px-3 py-1.5 font-mono text-xs font-bold text-[#04120C] hover:bg-[#00C885]">
            <ArrowDownUp className="h-3.5 w-3.5" /> Decode
          </button>
        </div>
      </div>

      <div className="mt-4 space-y-2" data-testid="deobfuscator-results">
        {Object.entries(results).map(([k, v]) => (
          <div key={k} className="rounded-sm border border-[#23283B] bg-[#0A0B10] p-3">
            <div className="mb-1 font-mono text-[10px] uppercase tracking-widest text-slate-500">{k}</div>
            <code className="block break-all font-mono text-xs text-[#38BDF8]">{v}</code>
          </div>
        ))}
        {Object.keys(results).length === 0 && (
          <p className="p-4 text-center font-mono text-xs text-slate-600">Best-effort decode. ProGuard name recovery is heuristic only.</p>
        )}
      </div>
    </div>
  );
}
