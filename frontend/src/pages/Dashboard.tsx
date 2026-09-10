import { useCallback, useEffect, useState } from "react";
import { api, Scan, Finding } from "@/lib/api";
import { CATEGORIES, SEVERITY_ORDER, sev } from "@/lib/theme";
import { Header } from "@/components/Header";
import { FileTree } from "@/components/FileTree";
import { FindingRow } from "@/components/FindingRow";
import { CodeViewer } from "@/components/CodeViewer";
import { FindingInspector } from "@/components/FindingInspector";
import { EndpointsTable } from "@/components/EndpointsTable";
import { ManifestAudit } from "@/components/ManifestAudit";
import { CustomRules } from "@/components/CustomRules";
import { Deobfuscator } from "@/components/Deobfuscator";
import { GlobalSearch } from "@/components/GlobalSearch";
import { UploadDialog } from "@/components/UploadDialog";
import { SettingsDialog } from "@/components/SettingsDialog";
import { Key, Globe, FileCog, ShieldAlert, Crosshair, Code2, Binary, ListFilter, Files, Loader2, AlertTriangle, Trash2, Layers } from "lucide-react";
import { toast } from "sonner";

const ICONS: Record<string, any> = { secret: Key, endpoint: Globe, manifest: FileCog, crypto: ShieldAlert, custom: Crosshair };
const TABS = [
  { key: "source", label: "Source", icon: Code2 },
  { key: "endpoints", label: "Endpoints", icon: Globe },
  { key: "manifest", label: "Manifest", icon: FileCog },
  { key: "rules", label: "Custom Rules", icon: Crosshair },
  { key: "deob", label: "Deobfuscator", icon: Binary },
];

export default function Dashboard() {
  const [scans, setScans] = useState<Scan[]>([]);
  const [activeId, setActiveId] = useState<string>("");
  const [activeScan, setActiveScan] = useState<Scan | null>(null);
  const [engines, setEngines] = useState<any>(null);

  const [leftMode, setLeftMode] = useState<"findings" | "files">("findings");
  const [category, setCategory] = useState("secret");
  const [severity, setSeverity] = useState("");
  const [triage, setTriage] = useState("");
  const [dedupe, setDedupe] = useState(true);
  const [findings, setFindings] = useState<Finding[]>([]);
  const [selected, setSelected] = useState<Finding | null>(null);

  const [centerTab, setCenterTab] = useState("source");
  const [openPath, setOpenPath] = useState<string | null>(null);
  const [jumpLine, setJumpLine] = useState<number | null>(null);
  const [tree, setTree] = useState<any>(null);

  const [searchOpen, setSearchOpen] = useState(false);
  const [uploadOpen, setUploadOpen] = useState(false);
  const [settingsOpen, setSettingsOpen] = useState(false);

  const loadScans = useCallback(async (selectId?: string) => {
    const list = await api.listScans();
    setScans(list);
    const id = selectId || activeId || (list[0]?.id ?? "");
    if (id && id !== activeId) setActiveId(id);
    return list;
  }, [activeId]);

  useEffect(() => {
    loadScans();
    api.getSettings().then((s) => setEngines(s.engines));
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  useEffect(() => {
    const onKey = (e: KeyboardEvent) => {
      if ((e.metaKey || e.ctrlKey) && e.key.toLowerCase() === "k") { e.preventDefault(); setSearchOpen(true); }
    };
    window.addEventListener("keydown", onKey);
    return () => window.removeEventListener("keydown", onKey);
  }, []);

  // load active scan + poll while running
  useEffect(() => {
    if (!activeId) return;
    let timer: any;
    const tick = async () => {
      const s = await api.getScan(activeId);
      setActiveScan(s);
      if (["queued", "decompiling", "scanning"].includes(s.status)) {
        timer = setTimeout(tick, 1500);
      } else {
        loadScans();
      }
    };
    tick();
    return () => clearTimeout(timer);
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [activeId]);

  const loadFindings = useCallback(() => {
    if (!activeId) return;
    const params: any = { category, limit: 300 };
    if (severity) params.severity = severity;
    if (triage) params.triage = triage;
    if (dedupe) params.dedupe = true;
    api.findings(activeId, params).then((d) => setFindings(d.items));
  }, [activeId, category, severity, triage, dedupe]);

  useEffect(() => { loadFindings(); }, [loadFindings, activeScan?.status]);

  useEffect(() => {
    if (leftMode === "files" && activeId) api.tree(activeId).then(setTree).catch(() => setTree(null));
  }, [leftMode, activeId]);

  const selectFinding = (f: Finding) => {
    setSelected(f);
    setOpenPath(f.file);
    setJumpLine(f.line);
    setCenterTab("source");
  };

  const openFile = (path: string) => { setOpenPath(path); setJumpLine(null); setCenterTab("source"); };

  const onTriage = async (state: string) => {
    if (!selected) return;
    const next = selected.triage_state === state ? "open" : state;
    const updated = await api.triage(selected.id, next);
    setSelected(updated);
    setFindings((prev) => prev.map((x) => (x.id === updated.id ? updated : x)));
    toast.success(`Marked ${next.replace("_", " ")}`);
  };

  const pickCategory = (key: string) => {
    setCategory(key);
    setLeftMode("findings");
    if (key === "endpoint") setCenterTab("endpoints");
    else if (key === "manifest") setCenterTab("manifest");
    else if (key === "custom") setCenterTab("rules");
    else setCenterTab("source");
  };

  const deleteScan = async () => {
    if (!activeScan || activeScan.is_sample) { toast.error("Cannot delete the sample scan"); return; }
    if (!window.confirm(`Remove "${activeScan.filename}" and its decompiled data + uploaded APK? This cannot be undone.`)) return;
    await api.deleteScan(activeScan.id);
    setActiveId(""); setActiveScan(null); setSelected(null); setOpenPath(null);
    const list = await loadScans();
    if (list[0]) setActiveId(list[0].id);
    toast.success("APK & scan removed");
  };

  const counts = activeScan?.counts?.by_category || {};
  const running = activeScan && ["queued", "decompiling", "scanning"].includes(activeScan.status);
  const failed = activeScan?.status === "failed";

  return (
    <div className="flex h-screen flex-col bg-[#0A0B10]">
      <Header
        scans={scans}
        activeScan={activeScan}
        onSelectScan={(id) => { setActiveId(id); setSelected(null); setOpenPath(null); }}
        onUpload={() => setUploadOpen(true)}
        onSearch={() => setSearchOpen(true)}
        onSettings={() => setSettingsOpen(true)}
      />

      <div className="flex flex-1 overflow-hidden">
        {/* LEFT */}
        <aside className="flex w-[320px] shrink-0 flex-col border-r border-[#23283B] bg-[#10121B]">
          <div className="flex border-b border-[#23283B]">
            <button data-testid="left-tab-findings" onClick={() => setLeftMode("findings")}
              className={`flex flex-1 items-center justify-center gap-1.5 py-2 font-mono text-xs ${leftMode === "findings" ? "bg-[#161926] text-[#00E599]" : "text-slate-500 hover:text-slate-300"}`}>
              <ListFilter className="h-3.5 w-3.5" /> Findings
            </button>
            <button data-testid="left-tab-files" onClick={() => setLeftMode("files")}
              className={`flex flex-1 items-center justify-center gap-1.5 py-2 font-mono text-xs ${leftMode === "files" ? "bg-[#161926] text-[#00E599]" : "text-slate-500 hover:text-slate-300"}`}>
              <Files className="h-3.5 w-3.5" /> Files
            </button>
          </div>

          {leftMode === "files" ? (
            <div className="flex-1 overflow-auto">
              <FileTree tree={tree} onOpen={openFile} activePath={openPath || ""} />
            </div>
          ) : (
            <>
              <div className="border-b border-[#23283B] p-2">
                {CATEGORIES.map((c) => {
                  const Icon = ICONS[c.key];
                  const active = category === c.key;
                  return (
                    <button
                      key={c.key}
                      data-testid={`finding-category-${c.key}`}
                      onClick={() => pickCategory(c.key)}
                      className={`flex w-full items-center gap-2 rounded-sm px-2 py-1.5 text-left font-mono text-xs transition-colors ${active ? "bg-[#00E599]/10 text-[#00E599]" : "text-slate-400 hover:bg-[#1E2235]"}`}
                    >
                      <Icon className="h-3.5 w-3.5" />
                      <span className="flex-1">{c.label}</span>
                      <span className={`rounded px-1.5 font-mono text-[10px] ${active ? "bg-[#00E599]/20 text-[#00E599]" : "bg-[#1E2235] text-slate-500"}`}>
                        {counts[c.key] || 0}
                      </span>
                    </button>
                  );
                })}
              </div>

              <div className="flex items-center gap-2 border-b border-[#23283B] px-2 py-1.5">
                <select data-testid="filter-severity" value={severity} onChange={(e) => setSeverity(e.target.value)}
                  className="flex-1 rounded-sm border border-[#23283B] bg-[#0A0B10] px-1.5 py-1 font-mono text-[11px] text-slate-300">
                  <option value="">all severity</option>
                  {SEVERITY_ORDER.map((s) => <option key={s} value={s}>{s}</option>)}
                </select>
                <select data-testid="filter-triage" value={triage} onChange={(e) => setTriage(e.target.value)}
                  className="flex-1 rounded-sm border border-[#23283B] bg-[#0A0B10] px-1.5 py-1 font-mono text-[11px] text-slate-300">
                  <option value="">all triage</option>
                  {["open", "confirmed", "false_positive", "dismissed"].map((s) => <option key={s} value={s}>{s.replace("_", " ")}</option>)}
                </select>
                <button
                  data-testid="toggle-dedupe"
                  onClick={() => setDedupe((v) => !v)}
                  title="Collapse near-duplicate findings"
                  className={`shrink-0 rounded-sm border px-2 py-1 font-mono text-[11px] transition-colors ${
                    dedupe ? "border-[#00E599]/40 bg-[#00E599]/10 text-[#00E599]" : "border-[#23283B] text-slate-400 hover:text-slate-200"
                  }`}
                >
                  <Layers className="mr-1 inline h-3 w-3" />dedup
                </button>
              </div>

              <div className="flex-1 overflow-y-auto" data-testid="findings-list">
                {findings.map((f) => (
                  <FindingRow key={f.id} f={f} active={selected?.id === f.id} onClick={() => selectFinding(f)} />
                ))}
                {findings.length === 0 && <div className="p-4 font-mono text-xs text-slate-600">No findings in this category.</div>}
              </div>
            </>
          )}
        </aside>

        {/* CENTER */}
        <main className="flex flex-1 flex-col overflow-hidden">
          <div className="flex items-center border-b border-[#23283B] bg-[#10121B]">
            {TABS.map((t) => {
              const Icon = t.icon;
              return (
                <button key={t.key} data-testid={`center-tab-${t.key}`} onClick={() => setCenterTab(t.key)}
                  className={`flex items-center gap-1.5 border-r border-[#23283B] px-4 py-2 font-mono text-xs transition-colors ${centerTab === t.key ? "bg-[#0A0B10] text-[#00E599]" : "text-slate-500 hover:text-slate-300"}`}>
                  <Icon className="h-3.5 w-3.5" /> {t.label}
                </button>
              );
            })}
            {activeScan && !activeScan.is_sample && (
              <button data-testid="delete-scan-button" onClick={deleteScan}
                className="ml-auto flex items-center gap-1.5 px-4 font-mono text-xs text-slate-400 transition-colors hover:text-rose-400">
                <Trash2 className="h-4 w-4" /> Delete APK
              </button>
            )}
          </div>

          <div className="relative flex-1 overflow-hidden">
            {running ? (
              <StatusPanel scan={activeScan!} />
            ) : failed ? (
              <div className="flex h-full flex-col items-center justify-center gap-3 p-8 text-center">
                <AlertTriangle className="h-10 w-10 text-rose-400" />
                <div className="font-mono text-sm text-rose-400">Scan failed</div>
                <div className="max-w-lg font-mono text-xs text-slate-500">{activeScan?.error}</div>
              </div>
            ) : (
              <>
                {centerTab === "source" && <CodeViewer scanId={activeId} path={openPath} jumpLine={jumpLine} />}
                {centerTab === "endpoints" && <EndpointsTable scanId={activeId} onSelect={selectFinding} />}
                {centerTab === "manifest" && <ManifestAudit scanId={activeId} onSelect={selectFinding} />}
                {centerTab === "rules" && <CustomRules scanId={activeId} onRescan={() => { loadFindings(); api.getScan(activeId).then(setActiveScan); }} />}
                {centerTab === "deob" && <Deobfuscator />}
              </>
            )}
          </div>
        </main>

        {/* RIGHT */}
        <aside className="flex w-[360px] shrink-0 flex-col border-l border-[#23283B] bg-[#10121B]">
          <FindingInspector finding={selected} onTriage={onTriage} onJump={() => selected && selectFinding(selected)} />
        </aside>
      </div>

      <GlobalSearch scanId={activeId} open={searchOpen} onClose={() => setSearchOpen(false)} onSelect={selectFinding} />
      <UploadDialog open={uploadOpen} onClose={() => setUploadOpen(false)} engines={engines}
        onUploaded={(id) => { loadScans(id); setActiveId(id); setSelected(null); }} />
      <SettingsDialog open={settingsOpen} onClose={() => setSettingsOpen(false)} onSaved={() => api.getSettings().then((s) => setEngines(s.engines))} />
    </div>
  );
}

function StatusPanel({ scan }: { scan: Scan }) {
  const steps = ["queued", "decompiling", "scanning", "complete"];
  const idx = steps.indexOf(scan.status);
  const decompiling = scan.status === "decompiling";
  const files = scan.decompiled_files || 0;
  const elapsed = scan.created_at ? Math.max(0, Math.floor((Date.now() - Date.parse(scan.created_at)) / 1000)) : 0;
  const mm = String(Math.floor(elapsed / 60)).padStart(2, "0");
  const ss = String(elapsed % 60).padStart(2, "0");
  return (
    <div className="scanlines relative flex h-full flex-col items-center justify-center gap-6 p-8">
      <Loader2 className="h-10 w-10 animate-spin text-[#00E599]" />
      <div className="text-center">
        <div className="font-mono text-sm text-slate-100">{scan.stage}</div>
        <div className="mt-1 font-mono text-xs text-slate-500">{scan.filename}</div>
      </div>
      <div className="w-full max-w-md">
        <div className="mb-2 flex justify-between font-mono text-[11px] text-slate-500">
          {steps.map((s, i) => <span key={s} className={i <= idx ? "text-[#00E599]" : ""}>{s}</span>)}
        </div>
        <div className="h-2 overflow-hidden rounded-full bg-[#0A0B10] ring-1 ring-[#23283B]">
          <div className="progress-flow h-full bg-[#00E599] transition-all duration-500" style={{ width: `${scan.progress}%` }} />
        </div>
        <div className="mt-2 flex justify-between font-mono text-[11px]">
          <span className="text-slate-500" data-testid="scan-elapsed">elapsed {mm}:{ss}</span>
          {(decompiling || scan.status === "scanning") && (
            <span className="text-[#38BDF8]" data-testid="decompiled-file-count">
              {files.toLocaleString()} files extracted
            </span>
          )}
        </div>
        {decompiling && (
          <p className="mt-3 text-center font-mono text-[11px] text-slate-600">
            JADX writes all files at the very end, so the count jumps near completion.
            On this CPU-limited host, large APKs can take several minutes.
          </p>
        )}
      </div>
    </div>
  );
}
