import axios from "axios";

const BACKEND_URL = process.env.REACT_APP_BACKEND_URL;
export const API = `${BACKEND_URL}/api`;

const http = axios.create({ baseURL: API });

export type Scan = {
  id: string;
  filename: string;
  size: number;
  status: string;
  stage: string;
  progress: number;
  error?: string | null;
  is_sample?: boolean;
  decompiled_files?: number;
  counts: { total: number; by_category: Record<string, number>; by_severity: Record<string, number> };
  created_at: string;
};

export type Finding = {
  id: string;
  scan_id: string;
  category: string;
  type: string;
  severity: string;
  file: string;
  line: number;
  value: string;
  masked_value: string;
  context: string;
  entropy: number;
  tags: string[];
  triage_state: string;
  rule_id?: string;
  occurrences?: number;
  files_count?: number;
};

export type Rule = {
  id: string;
  name: string;
  pattern: string;
  pattern_type: string;
  severity: string;
  enabled: boolean;
};

export const api = {
  listScans: () => http.get<Scan[]>("/scans").then((r) => r.data),
  getScan: (id: string) => http.get<Scan>(`/scans/${id}`).then((r) => r.data),
  upload: (file: File, onProgress?: (p: number) => void) => {
    const fd = new FormData();
    fd.append("file", file);
    return http
      .post<Scan>("/scans/upload", fd, {
        headers: { "Content-Type": "multipart/form-data" },
        onUploadProgress: (e) => {
          if (onProgress && e.total) onProgress(Math.round((e.loaded / e.total) * 100));
        },
      })
      .then((r) => r.data);
  },
  uploadChunked: async (file: File, onProgress?: (p: number) => void) => {
    const init = await http.post("/scans/upload/init", { filename: file.name }).then((r) => r.data);
    const uploadId: string = init.upload_id;
    const chunkSize: number = init.chunk_size || 5 * 1024 * 1024;
    let offset = 0;
    while (offset < file.size) {
      const blob = file.slice(offset, offset + chunkSize);
      const buf = await blob.arrayBuffer();
      await http.put(`/scans/upload/${uploadId}/chunk`, buf, {
        headers: { "Content-Type": "application/octet-stream" },
      });
      offset += blob.size;
      if (onProgress) onProgress(Math.round((offset / file.size) * 100));
    }
    return http
      .post<Scan>(`/scans/upload/${uploadId}/complete`, { filename: file.name })
      .then((r) => r.data);
  },
  deleteScan: (id: string) => http.delete(`/scans/${id}`).then((r) => r.data),
  rescan: (id: string) => http.post(`/scans/${id}/rescan`).then((r) => r.data),
  summary: (id: string) => http.get(`/scans/${id}/summary`).then((r) => r.data),
  tree: (id: string) => http.get(`/scans/${id}/tree`).then((r) => r.data),
  file: (id: string, path: string, start = 0, limit = 2000) =>
    http.get(`/scans/${id}/file`, { params: { path, start, limit } }).then((r) => r.data),
  findings: (id: string, params: Record<string, any>) =>
    http
      .get<{ total: number; items: Finding[] }>(`/scans/${id}/findings`, { params })
      .then((r) => r.data),
  triage: (fid: string, state: string) =>
    http.patch<Finding>(`/findings/${fid}/triage`, { triage_state: state }).then((r) => r.data),
  listRules: () => http.get<Rule[]>("/rules").then((r) => r.data),
  createRule: (r: Partial<Rule>) => http.post<Rule>("/rules", r).then((res) => res.data),
  updateRule: (id: string, r: Partial<Rule>) => http.put<Rule>(`/rules/${id}`, r).then((res) => res.data),
  deleteRule: (id: string) => http.delete(`/rules/${id}`).then((r) => r.data),
  deobfuscate: (text: string, method: string) =>
    http.post(`/deobfuscate`, { text, method }).then((r) => r.data),
  getSettings: () => http.get(`/settings`).then((r) => r.data),
  updateSettings: (jadx_bin: string, apktool_bin: string) =>
    http.put(`/settings`, { jadx_bin, apktool_bin }).then((r) => r.data),
};
