import { useState, useRef } from "react";
import { api } from "@/lib/api";
import { toast } from "sonner";
import { UploadCloud, X, FileArchive } from "lucide-react";
import { fmtBytes } from "@/lib/theme";

export function UploadDialog({ open, onClose, engines, onUploaded }: {
  open: boolean; onClose: () => void; engines: any; onUploaded: (id: string) => void;
}) {
  const [file, setFile] = useState<File | null>(null);
  const [progress, setProgress] = useState(0);
  const [busy, setBusy] = useState(false);
  const [drag, setDrag] = useState(false);
  const inputRef = useRef<HTMLInputElement>(null);

  if (!open) return null;

  const jadxOk = engines?.jadx?.available && engines?.java?.available;
  const apktoolOk = engines?.apktool?.available && engines?.java?.available;

  const submit = async () => {
    if (!file) return;
    setBusy(true);
    try {
      // Chunked upload avoids the ingress/Cloudflare single-request size limit,
      // so very large APKs (100s of MB) upload reliably.
      const scan = await api.uploadChunked(file, setProgress);
      toast.success("APK uploaded — decompiling in background");
      onUploaded(scan.id);
      onClose();
      setFile(null); setProgress(0);
    } catch (e: any) {
      toast.error(e?.response?.data?.detail || "Upload failed");
    }
    setBusy(false);
  };

  return (
    <div className="fixed inset-0 z-50 flex items-center justify-center bg-[#0A0B10]/80 backdrop-blur-md" onClick={onClose}>
      <div className="w-full max-w-lg rounded-lg border border-[#333A54] bg-[#10121B] p-5 animate-fadein" onClick={(e) => e.stopPropagation()}>
        <div className="mb-4 flex items-center justify-between">
          <h2 className="font-mono text-sm font-bold text-slate-100">[ UPLOAD APK ]</h2>
          <button onClick={onClose} className="text-slate-500 hover:text-slate-200"><X className="h-4 w-4" /></button>
        </div>

        <div
          data-testid="apk-upload-dropzone"
          onDragOver={(e) => { e.preventDefault(); setDrag(true); }}
          onDragLeave={() => setDrag(false)}
          onDrop={(e) => { e.preventDefault(); setDrag(false); const f = e.dataTransfer.files[0]; if (f) setFile(f); }}
          onClick={() => inputRef.current?.click()}
          className={`flex cursor-pointer flex-col items-center gap-2 rounded-md border-2 border-dashed p-8 transition-colors ${
            drag ? "border-[#00E599] bg-[#00E599]/5" : "border-[#333A54] hover:border-[#00E599]/50"
          }`}
        >
          {file ? <FileArchive className="h-8 w-8 text-[#00E599]" /> : <UploadCloud className="h-8 w-8 text-slate-500" />}
          {file ? (
            <div className="text-center">
              <div className="font-mono text-xs text-slate-100">{file.name}</div>
              <div className="font-mono text-[11px] text-slate-500">{fmtBytes(file.size)}</div>
            </div>
          ) : (
            <>
              <p className="font-mono text-xs text-slate-400">drag & drop or click to select .apk</p>
              <p className="font-mono text-[10px] text-slate-600">streamed to disk — never leaves your machine</p>
            </>
          )}
          <input ref={inputRef} type="file" accept=".apk" className="hidden"
            onChange={(e) => setFile(e.target.files?.[0] || null)} data-testid="apk-file-input" />
        </div>

        <div className="mt-3 flex gap-3 font-mono text-[11px]">
          <span className={jadxOk ? "text-[#00E599]" : "text-rose-400"}>● JADX {jadxOk ? "ready" : "unavailable"}</span>
          <span className={apktoolOk ? "text-[#00E599]" : "text-rose-400"}>● apktool {apktoolOk ? "ready" : "unavailable"}</span>
        </div>
        {(!jadxOk || !apktoolOk) && (
          <p className="mt-2 font-mono text-[11px] text-amber-400">Configure engine paths in Settings before scanning real APKs.</p>
        )}

        {busy && (
          <div className="mt-4 h-2 overflow-hidden rounded-full bg-[#0A0B10]">
            <div className="progress-flow h-full bg-[#00E599] transition-all" style={{ width: `${progress}%` }} />
          </div>
        )}

        <button
          data-testid="upload-submit-button"
          onClick={submit}
          disabled={!file || busy}
          className="mt-4 w-full rounded-sm bg-[#00E599] py-2 font-mono text-xs font-bold text-[#04120C] transition-colors hover:bg-[#00C885] disabled:opacity-40"
        >
          {busy ? `Uploading ${progress}%…` : "Upload & Decompile"}
        </button>
      </div>
    </div>
  );
}
