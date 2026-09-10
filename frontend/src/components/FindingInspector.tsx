import { Finding } from "@/lib/api";
import { sev, TRIAGE } from "@/lib/theme";
import { CheckCircle2, XCircle, Ban, ArrowRightToLine, Copy, Fingerprint } from "lucide-react";
import { toast } from "sonner";

export function FindingInspector({ finding, onTriage, onJump }: {
  finding: Finding | null;
  onTriage: (state: string) => void;
  onJump: () => void;
}) {
  if (!finding) {
    return (
      <div className="flex h-full flex-col items-center justify-center gap-3 p-6 text-center text-slate-600">
        <Fingerprint className="h-9 w-9" />
        <p className="font-mono text-xs">Select a finding to inspect details, entropy & context</p>
      </div>
    );
  }
  const s = sev(finding.severity);
  const copy = (t: string) => { navigator.clipboard.writeText(t); toast.success("Copied to clipboard"); };

  const triageBtn = (state: string, label: string, Icon: any, cls: string, tid: string) => (
    <button
      data-testid={tid}
      onClick={() => onTriage(state)}
      className={`flex flex-1 items-center justify-center gap-1 rounded-sm border px-2 py-1.5 font-mono text-[11px] transition-colors ${
        finding.triage_state === state ? cls : "border-[#23283B] text-slate-400 hover:border-slate-500"
      }`}
    >
      <Icon className="h-3.5 w-3.5" /> {label}
    </button>
  );

  return (
    <div className="flex h-full flex-col overflow-y-auto" data-testid="finding-inspector">
      <div className="border-b border-[#23283B] p-4">
        <div className="mb-2 flex items-center gap-2">
          <span className={`rounded border px-2 py-0.5 font-mono text-[10px] font-bold uppercase ${s.badge}`}>
            {finding.severity}
          </span>
          <span className="rounded border border-[#23283B] px-2 py-0.5 font-mono text-[10px] uppercase text-slate-400">
            {finding.category}
          </span>
        </div>
        <h3 className={`font-mono text-sm font-bold ${s.text}`}>{finding.type}</h3>
      </div>

      <div className="space-y-4 p-4">
        <div>
          <div className="mb-1 text-[10px] uppercase tracking-widest text-slate-500">Matched Value</div>
          <div className="group relative rounded-sm border border-[#23283B] bg-[#0A0B10] p-2.5">
            <code data-testid="finding-value" className="block break-all pr-6 font-mono text-xs text-[#00E599]">
              {finding.value}
            </code>
            <button onClick={() => copy(finding.value)} className="absolute right-2 top-2 text-slate-500 hover:text-slate-200">
              <Copy className="h-3.5 w-3.5" />
            </button>
          </div>
        </div>

        <div className="grid grid-cols-2 gap-3">
          <div>
            <div className="mb-1 text-[10px] uppercase tracking-widest text-slate-500">Entropy</div>
            <div className="font-mono text-sm text-slate-200">{finding.entropy?.toFixed(3)}</div>
          </div>
          <div>
            <div className="mb-1 text-[10px] uppercase tracking-widest text-slate-500">Location</div>
            <button onClick={onJump} className="flex items-center gap-1 font-mono text-xs text-[#38BDF8] hover:underline">
              <ArrowRightToLine className="h-3 w-3" /> line {finding.line}
            </button>
          </div>
        </div>

        <div>
          <div className="mb-1 text-[10px] uppercase tracking-widest text-slate-500">File</div>
          <code className="block break-all font-mono text-[11px] text-slate-400">{finding.file}</code>
        </div>

        {finding.tags?.length > 0 && (
          <div className="flex flex-wrap gap-1">
            {finding.tags.map((t) => (
              <span key={t} className="rounded border border-[#23283B] bg-[#161926] px-1.5 py-0.5 font-mono text-[10px] text-slate-400">#{t}</span>
            ))}
          </div>
        )}

        <div>
          <div className="mb-1 text-[10px] uppercase tracking-widest text-slate-500">Context</div>
          <pre className="max-h-52 overflow-auto rounded-sm border border-[#23283B] bg-[#0A0B10] p-2.5 font-mono text-[11px] leading-5 text-slate-300">
{finding.context}
          </pre>
        </div>

        <button
          data-testid="inspector-jump-source"
          onClick={onJump}
          className="flex w-full items-center justify-center gap-2 rounded-sm border border-[#38BDF8]/40 bg-[#38BDF8]/10 py-2 font-mono text-xs text-[#38BDF8] transition-colors hover:bg-[#38BDF8]/20"
        >
          <ArrowRightToLine className="h-4 w-4" /> Jump to source
        </button>
      </div>

      <div className="mt-auto border-t border-[#23283B] p-4">
        <div className="mb-2 text-[10px] uppercase tracking-widest text-slate-500">Triage</div>
        <div className="flex gap-2">
          {triageBtn("confirmed", "Confirm", CheckCircle2, TRIAGE.confirmed, "triage-confirm-button")}
          {triageBtn("false_positive", "False+", XCircle, "border-slate-500/40 text-slate-300 bg-slate-500/10", "triage-false-positive-button")}
          {triageBtn("dismissed", "Dismiss", Ban, "border-rose-500/40 text-rose-400 bg-rose-500/10", "triage-dismiss-button")}
        </div>
      </div>
    </div>
  );
}
