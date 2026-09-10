package jslYAf;

import android.content.Context;
import com.airbnb.paris.R2;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class NXaMWb {
    private static boolean KkkOtq = false;
    private static boolean NYcTpX = false;
    private static NXaMWb RIRhfU = new NXaMWb(null);
    private static boolean RqYKaw = false;
    public static int XLb = 4489;
    private static final boolean bwahiK = false;
    public static int cpl = 7837;
    private static boolean jUHVVL = false;
    private static boolean wIqYiP = false;
    private static final boolean wgIemC = false;
    private OutputStream bfzWp = null;
    private final WeakReference<Context> jrGknK;

    private NXaMWb(Context context) {
        this.jrGknK = new WeakReference<>(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if ((jslYAf.NXaMWb.XLb ^ 4489) != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r4 = jslYAf.NXaMWb.XLb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if ((r4 + 26) == 77) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        jslYAf.NXaMWb.XLb = ((r4 * 23) ^ 1766) % 115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.File KNHLzt(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "xHZBv@i$f`t_\n"
            java.lang.String r1 = jslYAf.WsUBUm.RvP(r1)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "\u0016@W\\|Z"
            java.lang.String r3 = jslYAf.WsUBUm.RvP(r3)
            r0.append(r3)
            if (r4 == 0) goto L42
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "/"
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r4 = jslYAf.NXaMWb.XLb
            r4 = r4 ^ 4489(0x1189, float:6.29E-42)
            if (r4 == 0) goto L44
        L30:
            int r4 = jslYAf.NXaMWb.XLb
            int r1 = r4 + 26
            r2 = 77
            if (r1 == r2) goto L39
            goto L30
        L39:
            int r4 = r4 * 23
            r4 = r4 ^ 1766(0x6e6, float:2.475E-42)
            int r4 = r4 % 115
            jslYAf.NXaMWb.XLb = r4
            goto L44
        L42:
            java.lang.String r3 = ""
        L44:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.io.File r4 = new java.io.File
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r4.<init>(r0, r3)
            boolean r3 = r4.exists()
            if (r3 != 0) goto L6f
            boolean r3 = r4.mkdirs()
            if (r3 != 0) goto L6f
            java.lang.String r3 = r4.getAbsolutePath()
            java.lang.String r4 = "_GW\\|M-\u007fm!cL@cvf*}qek~ht`h"
            java.lang.String r4 = jslYAf.WsUBUm.RvP(r4)
            android.util.Log.w(r3, r4)
            r3 = 0
            return r3
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.NXaMWb.KNHLzt(java.lang.String, java.lang.String):java.io.File");
    }

    private void XsdNAX(int i, String str, String str2) {
        XsdNAX(i, str, str2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        r1 = jslYAf.NXaMWb.XLb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if ((r1 + 130) == 39) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        jslYAf.NXaMWb.XLb = ((r1 % 119) % 37) * 92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        r1 = r0 + 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r1 == 52) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r1 == 78) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r1 == 232) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        jslYAf.NXaMWb.cpl = (jslYAf.NXaMWb.cpl + r0) >> 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        jslYAf.NXaMWb.cpl = ((jslYAf.NXaMWb.cpl + r0) >> 95) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006b, code lost:
    
        if (r1 == 304) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        r0 = (jslYAf.NXaMWb.cpl >> 98) >> 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0087, code lost:
    
        r0 = (jslYAf.NXaMWb.cpl >> 79) * 82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        if (jslYAf.NXaMWb.XLb > 4488) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        r1 = jslYAf.NXaMWb.XLb;
        r7 = r1 + 143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
    
        if (r7 == 91) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
    
        if (r7 == 255) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a1, code lost:
    
        jslYAf.NXaMWb.XLb = ((jslYAf.NXaMWb.XLb + r1) * 17) % 123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a3, code lost:
    
        jslYAf.NXaMWb.XLb = (r1 + r1) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        r0 = r0 % 62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void XsdNAX(int r8, java.lang.String r9, java.lang.String r10, java.lang.Throwable r11) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.NXaMWb.XsdNAX(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x00ad, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00f8, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0105, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0118, code lost:
    
        if ((jslYAf.NXaMWb.XLb ^ 4489) != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x011a, code lost:
    
        r5 = jslYAf.NXaMWb.XLb;
        r6 = r5 + com.airbnb.paris.R2.dimen.notification_main_column_padding_top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x011e, code lost:
    
        if (r6 == 93) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0122, code lost:
    
        if (r6 == 216) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0126, code lost:
    
        if (r6 == 282) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x012a, code lost:
    
        if (r6 == 359) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x013c, code lost:
    
        r4 = (jslYAf.NXaMWb.XLb % 14) ^ com.airbnb.paris.R2.styleable.Toolbar_collapseIcon;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0149, code lost:
    
        jslYAf.NXaMWb.XLb = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0143, code lost:
    
        r4 = (jslYAf.NXaMWb.XLb >> 126) * 77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0149, code lost:
    
        r4 = (jslYAf.NXaMWb.XLb >> 126) * 77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x012d, code lost:
    
        jslYAf.NXaMWb.XLb = ((r5 >> 91) * 110) % 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0136, code lost:
    
        jslYAf.NXaMWb.XLb = (r5 * 3822) % 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((jslYAf.NXaMWb.XLb + com.airbnb.paris.R2.color.primary_text_default_material_light) == 97) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0150, code lost:
    
        if ((jslYAf.NXaMWb.cpl ^ 7837) == 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0158, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x015a, code lost:
    
        r5 = jslYAf.NXaMWb.XLb;
        r6 = r5 + com.airbnb.paris.R2.dimen.abc_text_size_body_2_material;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0160, code lost:
    
        if (r6 == 66) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0164, code lost:
    
        if (r6 == 138) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0166, code lost:
    
        if (r6 == 233) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x016f, code lost:
    
        jslYAf.NXaMWb.XLb = (jslYAf.NXaMWb.XLb % 29) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0169, code lost:
    
        jslYAf.NXaMWb.XLb = 189244 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0177, code lost:
    
        jslYAf.NXaMWb.XLb = ((jslYAf.NXaMWb.XLb % 39) % 93) * 29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0185, code lost:
    
        if ((jslYAf.NXaMWb.cpl ^ 7837) == 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        jslYAf.NXaMWb.XLb = (jslYAf.NXaMWb.XLb % 20) * 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0189, code lost:
    
        if (jslYAf.NXaMWb.XLb > 4488) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a6, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a8, code lost:
    
        r5 = jslYAf.NXaMWb.XLb;
        r6 = r5 + com.airbnb.paris.R2.color.material_grey_50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ae, code lost:
    
        if (r6 == 8) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b2, code lost:
    
        if (r6 == 172) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b5, code lost:
    
        jslYAf.NXaMWb.XLb = ((r5 + r5) + r5) % 73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bd, code lost:
    
        jslYAf.NXaMWb.XLb = (jslYAf.NXaMWb.XLb + r5) ^ 2783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        jslYAf.NXaMWb.cpl = r4 >> 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cb, code lost:
    
        if (jslYAf.NXaMWb.XLb > 4488) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cd, code lost:
    
        r4 = jslYAf.NXaMWb.XLb;
        r5 = r4 + com.airbnb.paris.R2.attr.windowFixedHeightMajor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d3, code lost:
    
        if (r5 == 19) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d7, code lost:
    
        if (r5 == 184) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01db, code lost:
    
        if (r5 == 312) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01df, code lost:
    
        if (r5 == 450) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e2, code lost:
    
        jslYAf.NXaMWb.XLb = ((r4 + r4) ^ 2122) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ea, code lost:
    
        jslYAf.NXaMWb.XLb = (jslYAf.NXaMWb.XLb + r4) ^ 4475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f2, code lost:
    
        jslYAf.NXaMWb.XLb = ((jslYAf.NXaMWb.XLb % 65) >> 13) ^ 3129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fd, code lost:
    
        jslYAf.NXaMWb.XLb = ((jslYAf.NXaMWb.XLb + r4) * 63) + r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void XsdNAX(int r5, java.lang.String r6, java.lang.String r7, java.lang.Throwable r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.NXaMWb.XsdNAX(int, java.lang.String, java.lang.String, java.lang.Throwable, boolean):void");
    }

    public static void d(String str, String str2) {
        if (NYcTpX) {
            RIRhfU.XsdNAX(3, str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (RqYKaw) {
            RIRhfU.XsdNAX(6, str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        jslYAf.NXaMWb.XLb = (jslYAf.NXaMWb.XLb + r1) ^ 2631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        jslYAf.NXaMWb.XLb = (r1 ^ 2176) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r0.XsdNAX(6, r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = jslYAf.NXaMWb.XLb;
        r2 = r1 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r2 == 48) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r2 == 108) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r4, java.lang.String r5, java.lang.Throwable r6) {
        /*
            boolean r0 = jslYAf.NXaMWb.RqYKaw
            if (r0 == 0) goto L2a
            jslYAf.NXaMWb r0 = jslYAf.NXaMWb.RIRhfU
            int r1 = jslYAf.NXaMWb.XLb
            r2 = 4488(0x1188, float:6.289E-42)
            if (r1 > r2) goto L26
        Lc:
            int r1 = jslYAf.NXaMWb.XLb
            int r2 = r1 + 26
            r3 = 48
            if (r2 == r3) goto L21
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == r3) goto L19
            goto Lc
        L19:
            int r4 = jslYAf.NXaMWb.XLb
            int r4 = r4 + r1
            r4 = r4 ^ 2631(0xa47, float:3.687E-42)
            jslYAf.NXaMWb.XLb = r4
            goto L19
        L21:
            r2 = r1 ^ 2176(0x880, float:3.049E-42)
            int r2 = r2 + r1
            jslYAf.NXaMWb.XLb = r2
        L26:
            r1 = 6
            r0.XsdNAX(r1, r4, r5, r6)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.NXaMWb.e(java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    public static boolean getInfoLog() {
        return KkkOtq;
    }

    public static void i(String str, String str2) {
        int i;
        if (!KkkOtq) {
            return;
        }
        NXaMWb nXaMWb = RIRhfU;
        if ((XLb ^ 4489) == 0) {
            nXaMWb.XsdNAX(4, str, str2);
            return;
        }
        do {
            i = XLb + 26;
            if (i == 87) {
                while (true) {
                    XLb = (XLb >> 92) ^ R2.style.Widget_AppCompat_EditText;
                }
            }
        } while (i != 242);
        while (true) {
            XLb = (XLb >> 103) ^ R2.style.Theme_AppCompat_DayNight_DialogWhenLarge;
        }
    }

    public static void init(Context context) {
        RIRhfU = new NXaMWb(context);
        wIqYiP = true;
        RqYKaw = true;
    }

    public static void init(Context context, int i) {
        RIRhfU = new NXaMWb(context);
        RqYKaw = true;
        wIqYiP = true;
        KkkOtq = false;
        NYcTpX = false;
        jUHVVL = false;
    }

    public static void v(String str, String str2) {
        if (jUHVVL) {
            RIRhfU.XsdNAX(2, str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r2 == 176) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        jslYAf.NXaMWb.XLb = (jslYAf.NXaMWb.XLb % 26) ^ 2744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        jslYAf.NXaMWb.XLb = ((r1 * 55) ^ 2880) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        jslYAf.NXaMWb.XLb = (jslYAf.NXaMWb.XLb * 103) >> 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r0.XsdNAX(5, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (jslYAf.NXaMWb.XLb <= 4488) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = jslYAf.NXaMWb.XLb;
        r2 = r1 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r2 == 16) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r2 == 124) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = jslYAf.NXaMWb.wIqYiP
            if (r0 == 0) goto L3a
            jslYAf.NXaMWb r0 = jslYAf.NXaMWb.RIRhfU
            int r1 = jslYAf.NXaMWb.XLb
            r2 = 4488(0x1188, float:6.289E-42)
            if (r1 > r2) goto L36
        Lc:
            int r1 = jslYAf.NXaMWb.XLb
            int r2 = r1 + 26
            r3 = 16
            if (r2 == r3) goto L2d
            r3 = 124(0x7c, float:1.74E-43)
            if (r2 == r3) goto L1d
            r1 = 176(0xb0, float:2.47E-43)
            if (r2 == r1) goto L24
            goto Lc
        L1d:
            int r2 = r1 * 55
            r2 = r2 ^ 2880(0xb40, float:4.036E-42)
            int r2 = r2 + r1
            jslYAf.NXaMWb.XLb = r2
        L24:
            int r1 = jslYAf.NXaMWb.XLb
            int r1 = r1 % 26
            r1 = r1 ^ 2744(0xab8, float:3.845E-42)
            jslYAf.NXaMWb.XLb = r1
            goto L36
        L2d:
            int r4 = jslYAf.NXaMWb.XLb
            int r4 = r4 * 103
            int r4 = r4 >> 91
            jslYAf.NXaMWb.XLb = r4
            goto L2d
        L36:
            r1 = 5
            r0.XsdNAX(r1, r4, r5)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.NXaMWb.w(java.lang.String, java.lang.String):void");
    }

    public static void w(String str, String str2, Throwable th) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!wIqYiP) {
            return;
        }
        NXaMWb nXaMWb = RIRhfU;
        if ((cpl ^ 7837) == 0) {
            nXaMWb.XsdNAX(5, str, str2, th);
            return;
        }
        if ((XLb ^ 4489) == 0) {
            while (true) {
                int i5 = cpl;
                int i6 = XLb;
                if ((i6 ^ 4489) != 0) {
                    while (true) {
                        int i7 = XLb;
                        int i8 = i7 + 143;
                        if (i8 == 98) {
                            i = (i7 * 59) % 23;
                        } else if (i8 == 205) {
                            i = (i7 + i7) % 126;
                        } else if (i8 == 337) {
                            XLb = i7 + i7 + i7;
                        }
                        XLb = i;
                    }
                } else {
                    int i9 = i5 + 26;
                    if (i9 != 46) {
                        if (i9 == 202) {
                            cpl = ((i5 ^ 5443) + i5) ^ 4631;
                            if (i6 <= 4488) {
                                while (true) {
                                    int i10 = XLb;
                                    int i11 = i10 + 78;
                                    if (i11 == 52) {
                                        while (true) {
                                            XLb = ((XLb >> 54) >> 17) * 41;
                                        }
                                    } else if (i11 == 133) {
                                        while (true) {
                                            XLb = (XLb >> 20) * 36;
                                        }
                                    } else if (i11 == 288) {
                                        XLb = ((i10 >> 49) * 120) ^ 2382;
                                        break;
                                    } else if (i11 == 486) {
                                        break;
                                    }
                                }
                                while (true) {
                                    XLb = (XLb >> 17) * 4902;
                                }
                            }
                        } else if (i9 != 321) {
                            continue;
                        }
                        int i12 = cpl;
                        if (i6 <= 4488) {
                            while (true) {
                                i4 = XLb;
                                int i13 = i4 + 117;
                                if (i13 == 95) {
                                    XLb = (i4 + i4) * 119;
                                } else if (i13 == 188) {
                                    XLb = (i4 >> 30) + i4 + i4;
                                    break;
                                } else if (i13 == 240) {
                                    break;
                                }
                            }
                            while (true) {
                                XLb = ((XLb ^ 2363) + i4) % 72;
                            }
                        } else {
                            cpl = (i12 * R2.styleable.Toolbar_collapseIcon) ^ 4978;
                            if (i6 <= 4488) {
                                break;
                            }
                        }
                    } else {
                        do {
                            int i14 = cpl;
                            i2 = XLb;
                            if (i2 <= 4488) {
                                do {
                                } while (XLb + 91 != 46);
                                while (true) {
                                    XLb = (XLb ^ 6374) % 34;
                                }
                            } else {
                                cpl = (i14 * 1200) + i5;
                            }
                        } while (i2 > 4488);
                        while (true) {
                            int i15 = XLb;
                            int i16 = i15 + 52;
                            if (i16 != 55) {
                                if (i16 == 161) {
                                    XLb = ((i15 * 25) >> 41) ^ 3931;
                                } else if (i16 == 277) {
                                    XLb = (i15 * 17) % 57;
                                } else if (i16 != 427) {
                                }
                                i3 = ((XLb % 95) + i15) * 88;
                                XLb = i3;
                            }
                            i3 = (XLb >> 95) + i15;
                            XLb = i3;
                        }
                    }
                }
            }
        }
        while (true) {
            int i17 = XLb;
            if (i17 + 39 == 15) {
                XLb = (i17 * 59) ^ R2.styleable.ActionBar_subtitleTextStyle;
            }
        }
    }

    public static void w(String str, Throwable th) {
        if (!wIqYiP) {
            return;
        }
        NXaMWb nXaMWb = RIRhfU;
        if ((cpl ^ 7837) == 0) {
            nXaMWb.XsdNAX(5, str, null, th);
            return;
        }
        do {
        } while (cpl + 26 != 41);
        while (true) {
            cpl = (cpl ^ 3117) * 10;
        }
    }

    protected void finalize() throws Throwable {
        OutputStream outputStream = this.bfzWp;
        if (outputStream != null) {
            outputStream.close();
        }
        super.finalize();
    }
}
