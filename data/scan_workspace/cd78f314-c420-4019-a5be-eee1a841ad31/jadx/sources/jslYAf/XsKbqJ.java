package jslYAf;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
class XsKbqJ {
    public static int Vam = 0;
    public static int aer = 4877;
    static int dWNNwi;
    private boolean MZlSRh;
    private boolean KpxVNZ = true;
    private boolean ZdKhM = true;
    private boolean TewqMa = false;
    private boolean lfLJmn = false;
    private boolean qWYA = false;
    private boolean dnlTiM = false;
    private boolean TzXgdp = false;
    private int jcWpZC = Integer.MAX_VALUE;
    private boolean TgQKAZ = false;
    private int jaqIuw = 2;
    private boolean TMBsdw = false;
    private Set<String> RFfpBF = new HashSet();
    private Set<String> ROgFzk = new HashSet();
    private Set<String> TgXeJF = new HashSet();
    private Set<String> lLuLwE = new HashSet();
    private Set<String> wBZVsA = new HashSet();
    private Set<String> lIIpAt = new HashSet();
    private TifYXe MCzPqU = null;
    private long XCnvlh = -1;
    private long XlctrB = -1;
    private long dwuxHx = -1;
    private long TfbCNz = -1;
    private boolean lRRRAV = false;
    private boolean TtGtmx = false;
    private String wrZgag = dWNNwi;
    private boolean NDJKSI = false;

    static {
        WsUBUm.dVg = 9721;
        Vam = 3896;
        if (aer > 4876) {
            WsUBUm.dwn = 4146;
            GQf(false);
            return;
        }
        do {
        } while (aer + 13 != 86);
        while (true) {
            aer = (aer >> 28) ^ 3095;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public XsKbqJ(boolean z) {
        this.MZlSRh = z;
    }

    public static /* synthetic */ void GQf(boolean z) {
        if (z) {
            GQf(false);
        }
        dWNNwi = WsUBUm.RvP("PB");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long Glgru() {
        return this.XCnvlh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set<String> GvjrcP() {
        return this.TgXeJF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void KDsGnr(long j) {
        this.XCnvlh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void KDsGnr(long j, long j2) {
        this.XlctrB = j;
        this.dwuxHx = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void KbkgIc() {
        this.NDJKSI = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void KcDBeC() {
        this.TewqMa = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void KfSWFK() {
        this.TgQKAZ = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int MnwWUv() {
        return this.jcWpZC;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean NDJKSI() {
        return this.NDJKSI;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long NNMdvf() {
        return this.TfbCNz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void NPKDhZ() {
        this.ZdKhM = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set<String> NXaXjB() {
        return this.lLuLwE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void NsDmwH(Set<String> set) {
        this.TgXeJF = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void RATMRj(Set<String> set) {
        this.lLuLwE = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void RBiXNs() {
        this.KpxVNZ = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void RFfpBF(Set<String> set) {
        this.RFfpBF = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ROgFzk(Set<String> set) {
        this.ROgFzk = set;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set<String> TBHJqs() {
        return this.ROgFzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void TbITxC() {
        this.TzXgdp = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean TtGtmx() {
        return this.TtGtmx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void VaYGXe() {
        this.qWYA = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set<String> VhHWNb() {
        return this.lIIpAt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set<String> WGKEH() {
        return this.RFfpBF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void XWkegu() {
        this.dnlTiM = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bKVqkI(int i) {
        this.jaqIuw = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bqsKcZ(int i) {
        this.jcWpZC = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bxqfmd() {
        this.TMBsdw = true;
    }

    protected boolean collectContextData() {
        return this.dnlTiM;
    }

    protected boolean collectDeviceData() {
        return this.lfLJmn;
    }

    protected boolean collectKeyboardData() {
        return this.KpxVNZ;
    }

    protected boolean collectLegacyTouchData() {
        return this.TewqMa;
    }

    protected boolean collectLocationData() {
        return this.qWYA;
    }

    protected int collectPiiDataMode() {
        return this.jaqIuw;
    }

    protected boolean collectTouchData() {
        return this.ZdKhM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean dpqbAD() {
        return this.TzXgdp;
    }

    protected boolean getExcludeData() {
        return this.lRRRAV;
    }

    protected TifYXe getFieldCallback() {
        return this.MCzPqU;
    }

    protected long getKeystrokesFrequency() {
        return this.XlctrB;
    }

    protected Set<String> getNoSendingActivities() {
        return this.wBZVsA;
    }

    protected long getTouchFrequency() {
        return this.dwuxHx;
    }

    protected boolean isAnonymousMaskedCollection() {
        return this.TMBsdw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void jUcpxt(Set<String> set) {
        this.lIIpAt = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void jUxlDj(String str) {
        this.wrZgag = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void lJagWq() {
        this.lfLJmn = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void lYHLId(TifYXe tifYXe) {
        this.MCzPqU = tifYXe;
    }

    protected boolean listenHierarchyChanges() {
        return this.MZlSRh;
    }

    protected boolean removeSuffix() {
        return this.TgQKAZ;
    }

    protected boolean sendInChunks() {
        if (this.XCnvlh > 0) {
            return true;
        }
        long j = this.XlctrB;
        int i = aer;
        if ((i ^ 4877) != 0) {
            while (true) {
                int i2 = aer;
                int i3 = i2 + 26;
                if (i3 == 61) {
                    while (true) {
                        aer = (aer % 25) % 61;
                    }
                } else if (i3 == 107) {
                    aer = i2 + i2 + i2;
                } else if (i3 == 253) {
                    while (true) {
                        aer = (aer * 112) >> 87;
                    }
                } else if (i3 == 352) {
                    while (true) {
                        aer = ((aer * 110) ^ 3196) % 36;
                    }
                }
            }
        } else {
            if (j <= 0) {
                return false;
            }
            long j2 = this.dwuxHx;
            if (i > 4876) {
                return j2 > 0;
            }
            while (true) {
                int i4 = aer;
                if (i4 + 78 == 42) {
                    aer = (i4 >> 98) ^ 5150;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 ^ 4877) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        r2 = r7 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r2 == 30) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r2 == 117) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r2 == 193) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r2 == 381) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        jslYAf.XsKbqJ.Vam = (jslYAf.XsKbqJ.Vam >> 19) % 55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r1 > 4876) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r7 = jslYAf.XsKbqJ.aer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if ((r7 + 26) == 65) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        jslYAf.XsKbqJ.aer = (r7 >> 70) * 107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r0 = jslYAf.XsKbqJ.Vam + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (jslYAf.XsKbqJ.aer > 4876) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        r1 = jslYAf.XsKbqJ.aer;
        r2 = r1 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (r2 == 54) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r2 == 103) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r2 == 128) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (r2 == 314) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r1 = ((jslYAf.XsKbqJ.aer + r1) >> 40) % 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        jslYAf.XsKbqJ.aer = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
    
        jslYAf.XsKbqJ.aer = (r1 + r1) ^ 3965;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        r1 = (jslYAf.XsKbqJ.aer ^ 2158) % 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
    
        jslYAf.XsKbqJ.aer = ((r1 % 103) * 86) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
    
        jslYAf.XsKbqJ.Vam = r0 >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        if (jslYAf.XsKbqJ.aer > 4876) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        r7 = jslYAf.XsKbqJ.aer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
    
        if ((r7 + 78) == 17) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        jslYAf.XsKbqJ.aer = ((r7 % 25) + r7) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006f, code lost:
    
        jslYAf.XsKbqJ.Vam = (r7 + r7) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008e, code lost:
    
        r0 = r7 ^ 2871;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0090, code lost:
    
        if (r1 > 4876) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0092, code lost:
    
        r1 = jslYAf.XsKbqJ.aer;
        r7 = r1 + 143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0096, code lost:
    
        if (r7 == 17) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009a, code lost:
    
        if (r7 == 195) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009d, code lost:
    
        jslYAf.XsKbqJ.aer = (jslYAf.XsKbqJ.aer + r1) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a4, code lost:
    
        jslYAf.XsKbqJ.aer = (jslYAf.XsKbqJ.aer + r1) * 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ac, code lost:
    
        jslYAf.XsKbqJ.Vam = r0 >> 75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0025, code lost:
    
        r7 = jslYAf.XsKbqJ.aer;
        r0 = r7 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x002b, code lost:
    
        if (r0 == 45) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x002f, code lost:
    
        if (r0 == 153) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0033, code lost:
    
        if (r0 == 347) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0037, code lost:
    
        if (r0 == 478) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((jslYAf.XsKbqJ.Vam ^ 3896) != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x003a, code lost:
    
        jslYAf.XsKbqJ.aer = (r7 % 24) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x003f, code lost:
    
        jslYAf.XsKbqJ.aer = ((jslYAf.XsKbqJ.aer >> 29) + r7) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0047, code lost:
    
        jslYAf.XsKbqJ.aer = ((jslYAf.XsKbqJ.aer % 39) ^ 4698) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0051, code lost:
    
        jslYAf.XsKbqJ.aer ^= 6936;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r7 = jslYAf.XsKbqJ.Vam;
        r1 = jslYAf.XsKbqJ.aer;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean sendSeparateChunks() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.XsKbqJ.sendSeparateChunks():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void wBZVsA(Set<String> set) {
        this.wBZVsA = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void wMkKWr() {
        this.TtGtmx = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void wNHjht(long j, boolean z) {
        this.TfbCNz = j;
        this.lRRRAV = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String wTkGdx() {
        return this.wrZgag;
    }
}
