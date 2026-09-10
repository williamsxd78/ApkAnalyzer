import { useEffect, useState } from "react";
import { api } from "@/lib/api";
import { toast } from "sonner";
import { X } from "lucide-react";

export function SettingsDialog({ open, onClose, onSaved }: {
  open: boolean; onClose: () => void; onSaved: () => void;
}) {
  const [jadx, setJadx] = useState("");
  const [apktool, setApktool] = useState("");
  const [engines, setEngines] = useState<any>(null);

  useEffect(() => {
    if (open) api.getSettings().then((s) => { setJadx(s.jadx_bin); setApktool(s.apktool_bin); setEngines(s.engines); });
  }, [open]);

  if (!open) return null;

  const save = async () => {
    const s = await api.updateSettings(jadx, apktool);
    setEngines(s.engines);
    toast.success("Engine paths saved");
    onSaved();
  };

  const row = (label: string, ok: boolean) => (
    <span className={`font-mono text-[11px] ${ok ? "text-[#00E599]" : "text-rose-400"}`}>● {label} {ok ? "ok" : "missing"}</span>
  );

  return (
    <div className="fixed inset-0 z-50 flex items-center justify-center bg-[#0A0B10]/80 backdrop-blur-md" onClick={onClose}>
      <div className="w-full max-w-lg rounded-lg border border-[#333A54] bg-[#10121B] p-5 animate-fadein" onClick={(e) => e.stopPropagation()}>
        <div className="mb-4 flex items-center justify-between">
          <h2 className="font-mono text-sm font-bold text-slate-100">[ ENGINE SETTINGS ]</h2>
          <button onClick={onClose} className="text-slate-500 hover:text-slate-200"><X className="h-4 w-4" /></button>
        </div>
        <p className="mb-4 font-mono text-[11px] text-slate-500">Local CLI binary paths. On your own machine, point these at your JADX & apktool installs.</p>

        <label className="mb-1 block font-mono text-[10px] uppercase tracking-widest text-slate-500">JADX binary</label>
        <input data-testid="settings-jadx-input" value={jadx} onChange={(e) => setJadx(e.target.value)}
          className="mb-3 w-full rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1.5 font-mono text-xs text-slate-200 outline-none focus:border-[#00E599]/50" />

        <label className="mb-1 block font-mono text-[10px] uppercase tracking-widest text-slate-500">apktool binary</label>
        <input data-testid="settings-apktool-input" value={apktool} onChange={(e) => setApktool(e.target.value)}
          className="mb-3 w-full rounded-sm border border-[#23283B] bg-[#0A0B10] px-2 py-1.5 font-mono text-xs text-slate-200 outline-none focus:border-[#00E599]/50" />

        {engines && (
          <div className="mb-4 flex flex-wrap gap-3">
            {row("java", engines.java?.available)}
            {row("jadx", engines.jadx?.available)}
            {row("apktool", engines.apktool?.available)}
          </div>
        )}

        <button data-testid="settings-save-button" onClick={save}
          className="w-full rounded-sm bg-[#00E599] py-2 font-mono text-xs font-bold text-[#04120C] hover:bg-[#00C885]">
          Save & Verify
        </button>
      </div>
    </div>
  );
}
