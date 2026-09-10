package MCOFeQ;

import android.util.Log;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BpQCue {
    private static final int Kdxpcc = 23;
    private static final Pattern KqYtTp;
    public static int TUH = 0;
    private static final boolean bwahiK = false;
    public static int cHu;
    private static boolean jfIZur;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class bpQCue {
        public static int TiF;
        static int XPcwvX;
        public static int dcu;

        static {
            WNhGqf.iin = 7514;
            dcu = 9541;
            TiF = 1825;
            WNhGqf.TEa = 7576;
            GcH(false);
        }

        private bpQCue() {
        }

        public static /* synthetic */ void GcH(boolean z) {
            if (z) {
                GcH(false);
            }
            XPcwvX = WNhGqf.RvP("\u0017b{f");
        }

        @Nonnull
        private static String NWFVYN(String str) {
            return str + ((String) XPcwvX);
        }

        static void TjAjed(String str, String str2) {
            if (!BpQCue.devzac(str, 4)) {
                return;
            }
            if ((dcu ^ 9541) == 0) {
                Log.i(str, str2);
            } else {
                while (true) {
                    int i = dcu;
                    if (i + 26 == 11) {
                        dcu = ((i + i) >> 1) % 65;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void TjAjed(String str, String str2, String... strArr) {
        }

        public static void d(String str, String str2) {
        }

        public static void e(String str, String str2) {
        }

        public static void e(String str, String str2, Object obj) {
        }

        public static void e(String str, String str2, Object obj, Object obj2) {
        }

        public static void e(String str, String str2, Throwable th) {
        }
    }

    static {
        WNhGqf.iin = 7514;
        TUH = 6670;
        WNhGqf.TEa = 7576;
        cHu = 6085;
        if (TUH > 6669) {
            KqYtTp = Pattern.compile(WNhGqf.RvP("e]bM"));
            jfIZur = false;
            return;
        }
        while (true) {
            int i = TUH;
            int i2 = i + 13;
            if (i2 == 48) {
                TUH = ((i % 39) % 40) + i;
            } else if (i2 == 135) {
                break;
            }
        }
        while (true) {
            TUH = (TUH >> 85) >> 76;
        }
    }

    private BpQCue() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nonnull
    public static String MGbMwZ(@Nonnull Class cls) {
        String str = WNhGqf.RvP("Z\bJ\u001emM`%") + cls.getSimpleName();
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    static boolean checkNonFatalLoggingStatus() {
        return !jfIZur;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00fd, code lost:
    
        r5 = MCOFeQ.BpQCue.TUH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0101, code lost:
    
        if ((r5 + 52) == 67) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0104, code lost:
    
        MCOFeQ.BpQCue.TUH = ((MCOFeQ.BpQCue.TUH % 123) + r5) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c9, code lost:
    
        if (MCOFeQ.BpQCue.TUH <= 6669) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cb, code lost:
    
        r5 = MCOFeQ.BpQCue.TUH;
        r0 = r5 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00cf, code lost:
    
        if (r0 == 15) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d3, code lost:
    
        if (r0 == 95) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d7, code lost:
    
        if (r0 == 219) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e3, code lost:
    
        r6 = ((MCOFeQ.BpQCue.TUH * 111) + r5) % 126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e1, code lost:
    
        MCOFeQ.BpQCue.TUH = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00da, code lost:
    
        r6 = r5 >> 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00dd, code lost:
    
        r6 = (r5 >> 75) % 114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00eb, code lost:
    
        r5 = MCOFeQ.BpQCue.cHu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f1, code lost:
    
        if ((r5 + 26) == 22) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f4, code lost:
    
        MCOFeQ.BpQCue.cHu = (r5 ^ 3453) * 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fb, code lost:
    
        if (MCOFeQ.BpQCue.TUH > 6669) goto L121;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00e1 -> B:57:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean devzac(java.lang.String r5, int r6) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.BpQCue.devzac(java.lang.String, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        android.util.Log.e(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if ((MCOFeQ.BpQCue.TUH ^ 6670) != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r0 = MCOFeQ.BpQCue.TUH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if ((r0 + 26) == 62) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        MCOFeQ.BpQCue.TUH = (r0 * 63) % 22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L1f
            int r0 = MCOFeQ.BpQCue.TUH
            r0 = r0 ^ 6670(0x1a0e, float:9.347E-42)
            if (r0 == 0) goto L1c
        Ld:
            int r0 = MCOFeQ.BpQCue.TUH
            int r1 = r0 + 26
            r2 = 62
            if (r1 == r2) goto L16
            goto Ld
        L16:
            int r0 = r0 * 63
            int r0 = r0 % 22
            MCOFeQ.BpQCue.TUH = r0
        L1c:
            android.util.Log.e(r3, r4)
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.BpQCue.e(java.lang.String, java.lang.String):void");
    }

    public static void e(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public static void e(String str, String str2, String... strArr) {
        e(str, lQTZVg(str2, strArr));
    }

    public static void i(String str, String str2) {
        if (devzac(str, 4)) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (devzac(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    public static void i(String str, String str2, String... strArr) {
        i(str, lQTZVg(str2, strArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x008b, code lost:
    
        if (r11 == 326) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x008e, code lost:
    
        MCOFeQ.BpQCue.TUH = (r10 % 108) ^ 1872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0094, code lost:
    
        MCOFeQ.BpQCue.TUH = (MCOFeQ.BpQCue.TUH % 93) % 71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x009b, code lost:
    
        MCOFeQ.BpQCue.TUH = ((MCOFeQ.BpQCue.TUH * 34) % 122) >> 126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
    
        MCOFeQ.BpQCue.cHu = (MCOFeQ.BpQCue.cHu ^ 4162) >> 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0043, code lost:
    
        if ((MCOFeQ.BpQCue.TUH ^ 6670) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0045, code lost:
    
        r10 = MCOFeQ.BpQCue.TUH;
        r11 = r10 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x004b, code lost:
    
        if (r11 == 18) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x004d, code lost:
    
        if (r11 == 57) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x004f, code lost:
    
        if (r11 == 71) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0064, code lost:
    
        MCOFeQ.BpQCue.TUH = (r10 ^ 4387) >> 120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0064, code lost:
    
        MCOFeQ.BpQCue.TUH = ((MCOFeQ.BpQCue.TUH * 124) >> 7) ^ 4654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0057, code lost:
    
        MCOFeQ.BpQCue.TUH = (r10 >> 120) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0067, code lost:
    
        r9 = MCOFeQ.BpQCue.cHu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x006d, code lost:
    
        if ((r9 + 78) == 10) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0070, code lost:
    
        MCOFeQ.BpQCue.cHu = ((MCOFeQ.BpQCue.cHu >> 84) + r9) % 72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x007b, code lost:
    
        if (MCOFeQ.BpQCue.TUH > 6669) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x007d, code lost:
    
        r10 = MCOFeQ.BpQCue.TUH;
        r11 = r10 + 182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0083, code lost:
    
        if (r11 == 28) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0087, code lost:
    
        if (r11 == 201) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String lQTZVg(@javax.annotation.Nullable java.lang.String r10, @javax.annotation.Nullable java.lang.Object... r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.BpQCue.lQTZVg(java.lang.String, java.lang.Object[]):java.lang.String");
    }

    static void setSuppressNonFatalLog(boolean z) {
        jfIZur = z;
    }
}
