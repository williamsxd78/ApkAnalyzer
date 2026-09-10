import { Finding } from "@/lib/api";
import { sev, TRIAGE } from "@/lib/theme";

export function FindingRow({ f, active, onClick }: {
  f: Finding; active: boolean; onClick: () => void;
}) {
  const s = sev(f.severity);
  return (
    <button
      data-testid={`finding-row-${f.id}`}
      onClick={onClick}
      className={`flex w-full flex-col gap-1 border-l-2 px-3 py-2 text-left transition-colors ${
        active ? "border-[#00E599] bg-[#00E599]/5" : "border-transparent hover:bg-[#1E2235]"
      } ${f.triage_state === "false_positive" || f.triage_state === "dismissed" ? "opacity-50" : ""}`}
    >
      <div className="flex items-center gap-2">
        <span className={`h-1.5 w-1.5 shrink-0 rounded-full ${s.dot}`} />
        <span className={`truncate font-mono text-xs font-medium ${s.text}`}>{f.type}</span>
        {(f.occurrences || 0) > 1 && (
          <span className="shrink-0 rounded border border-[#333A54] bg-[#1E2235] px-1 font-mono text-[9px] text-slate-300"
            title={`${f.occurrences} occurrences across ${f.files_count} file(s)`}>
            ×{f.occurrences}
          </span>
        )}
        {f.triage_state !== "open" && (
          <span className={`ml-auto rounded border px-1 text-[9px] uppercase ${TRIAGE[f.triage_state]}`}>
            {f.triage_state.replace("_", " ")}
          </span>
        )}
      </div>
      <div className="truncate font-mono text-[11px] text-slate-500">
        {f.value}
      </div>
      <div className="truncate font-mono text-[10px] text-slate-600">
        {f.file}:{f.line}
      </div>
    </button>
  );
}
