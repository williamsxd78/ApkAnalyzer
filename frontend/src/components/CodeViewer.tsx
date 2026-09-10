import { useEffect, useRef, useState } from "react";
import { api, Finding } from "@/lib/api";
import { sev } from "@/lib/theme";
import { toast } from "sonner";
import { FileCode } from "lucide-react";

export function CodeViewer({ scanId, path, jumpLine }: {
  scanId: string; path: string | null; jumpLine: number | null;
}) {
  const [lines, setLines] = useState<string[]>([]);
  const [hits, setHits] = useState<Record<number, string>>({});
  const [loading, setLoading] = useState(false);
  const lineRefs = useRef<Record<number, HTMLDivElement | null>>({});

  useEffect(() => {
    if (!path) return;
    setLoading(true);
    Promise.all([
      api.file(scanId, path),
      api.findings(scanId, { file: path, limit: 500 }),
    ]).then(([f, fnd]) => {
      setLines(f.lines || []);
      const map: Record<number, string> = {};
      (fnd.items || []).forEach((x: Finding) => {
        const cur = map[x.line];
        map[x.line] = cur || x.severity;
      });
      setHits(map);
      setLoading(false);
    }).catch(() => setLoading(false));
  }, [scanId, path]);

  useEffect(() => {
    if (jumpLine && lineRefs.current[jumpLine]) {
      const el = lineRefs.current[jumpLine];
      el?.scrollIntoView({ block: "center", behavior: "smooth" });
      el?.classList.remove("line-jump");
      void el?.offsetWidth;
      el?.classList.add("line-jump");
    }
  }, [jumpLine, lines]);

  if (!path) {
    return (
      <div className="flex h-full flex-col items-center justify-center gap-3 text-slate-600">
        <FileCode className="h-10 w-10" />
        <p className="font-mono text-sm">Select a finding or file to view source</p>
      </div>
    );
  }

  const copyRef = (n: number) => {
    navigator.clipboard.writeText(`${path}:${n}`);
    toast.success(`Copied ${path.split("/").pop()}:${n}`);
  };

  return (
    <div className="flex h-full flex-col">
      <div className="flex items-center gap-2 border-b border-[#23283B] bg-[#10121B] px-3 py-1.5 font-mono text-xs text-slate-400">
        <FileCode className="h-3.5 w-3.5 text-[#00E599]" />
        <span className="truncate">{path}</span>
        <span className="ml-auto text-slate-600">{lines.length} lines</span>
      </div>
      <div className="flex-1 overflow-auto bg-[#0A0B10]" data-testid="code-viewer">
        {loading ? (
          <div className="p-4 font-mono text-xs text-slate-500">Loading source…</div>
        ) : (
          <div className="min-w-max font-mono text-[12.5px] leading-5">
            {lines.map((ln, i) => {
              const n = i + 1;
              const hit = hits[n];
              return (
                <div
                  key={n}
                  ref={(el) => { lineRefs.current[n] = el; }}
                  data-testid={`code-line-${n}`}
                  onClick={() => copyRef(n)}
                  className={`group flex cursor-pointer ${hit ? "bg-white/[0.02]" : ""}`}
                  style={hit ? { borderLeft: `2px solid` } : { borderLeft: "2px solid transparent" }}
                >
                  <span className="sticky left-0 w-12 select-none border-r border-[#23283B] bg-[#0A0B10] px-2 text-right text-slate-600 group-hover:text-slate-400">
                    {n}
                  </span>
                  {hit && <span className={`w-1 ${sev(hit).bar}`} />}
                  <span className={`whitespace-pre px-3 ${hit ? "text-slate-100" : "text-slate-400"}`}>
                    {ln || " "}
                  </span>
                </div>
              );
            })}
          </div>
        )}
      </div>
    </div>
  );
}
