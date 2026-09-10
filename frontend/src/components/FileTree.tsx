import { useEffect, useMemo, useState } from "react";
import { ChevronRight, ChevronDown, File, Folder, FolderOpen } from "lucide-react";

type Node = { name: string; path: string; type: string; children?: Node[] };
type Row = { node: Node; depth: number };

function flatten(nodes: Node[], depth: number, expanded: Record<string, boolean>, out: Row[]) {
  const sorted = [...nodes].sort((a, b) => {
    if (a.type !== b.type) return a.type === "dir" ? -1 : 1;
    return a.name.toLowerCase().localeCompare(b.name.toLowerCase());
  });
  for (const n of sorted) {
    out.push({ node: n, depth });
    if (n.type === "dir" && expanded[n.path] && n.children) {
      flatten(n.children, depth + 1, expanded, out);
    }
  }
}

function collectDefault(nodes: Node[], depth: number, acc: Record<string, boolean>) {
  if (depth >= 2) return;
  for (const n of nodes) {
    if (n.type === "dir") {
      acc[n.path] = true;
      if (n.children) collectDefault(n.children, depth + 1, acc);
    }
  }
}

export function FileTree({ tree, onOpen, activePath }: {
  tree: Node | null; onOpen: (p: string) => void; activePath: string;
}) {
  const [expanded, setExpanded] = useState<Record<string, boolean>>({});

  useEffect(() => {
    if (tree?.children) {
      const acc: Record<string, boolean> = {};
      collectDefault(tree.children, 0, acc);
      setExpanded(acc);
    }
  }, [tree]);

  const rows = useMemo(() => {
    if (!tree?.children) return [];
    const out: Row[] = [];
    flatten(tree.children, 0, expanded, out);
    return out;
  }, [tree, expanded]);

  if (!tree) return <div className="p-4 font-mono text-xs text-slate-500">Loading tree…</div>;

  const toggle = (p: string) => setExpanded((e) => ({ ...e, [p]: !e[p] }));

  return (
    <div className="py-1">
      {rows.map(({ node, depth }) => {
        const pad = depth * 12 + 8;
        if (node.type === "file") {
          const active = node.path === activePath;
          return (
            <button
              key={node.path}
              data-testid={`file-tree-item-${node.name}`}
              onClick={() => onOpen(node.path)}
              style={{ paddingLeft: pad }}
              className={`flex w-full items-center gap-1.5 py-1 pr-2 text-left font-mono text-xs transition-colors hover:bg-[#1E2235] ${active ? "bg-[#00E599]/10 text-[#00E599]" : "text-slate-400"}`}
            >
              <File className="h-3.5 w-3.5 shrink-0 opacity-70" />
              <span className="truncate">{node.name}</span>
            </button>
          );
        }
        const open = !!expanded[node.path];
        return (
          <button
            key={node.path}
            data-testid={`file-tree-dir-${node.name}`}
            onClick={() => toggle(node.path)}
            style={{ paddingLeft: pad }}
            className="flex w-full items-center gap-1 py-1 pr-2 text-left font-mono text-xs text-slate-300 transition-colors hover:bg-[#1E2235]"
          >
            {open ? <ChevronDown className="h-3 w-3" /> : <ChevronRight className="h-3 w-3" />}
            {open ? <FolderOpen className="h-3.5 w-3.5 text-[#38BDF8]" /> : <Folder className="h-3.5 w-3.5 text-[#38BDF8]" />}
            <span className="truncate">{node.name}</span>
          </button>
        );
      })}
    </div>
  );
}
