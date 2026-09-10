package MCOFeQ;

import MCOFeQ.BpQCue;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class WNhGqf {
    private static String KmzNXU;
    public static char[] RRY;
    public static int TEa;
    public static int iin;

    static {
        BpQCue.TUH = 6670;
        iin = 7514;
        BpQCue.cHu = 6085;
        TEa = 7576;
        KmzNXU = BpQCue.MGbMwZ(WNhGqf.class);
    }

    private WNhGqf() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TMXStrongAuth.AuthenticationStatus KiVDmx(Context context, String str, String str2, @Nullable TMXStrongAuth.StrongAuthCallback strongAuthCallback) {
        if (strongAuthCallback == null) {
            BpQCue.bpQCue.d(KmzNXU, RvP("xSJX|Gyba`tWJl\"ekptb|x&;sddgUtx\u007fxkEt/D_\u000bLTLs+\u0005VF^LJYGS[\u001bf|hpeaf|RiOY|_ESKISWQMPWD\\Se"));
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE;
        }
        Object systemService = context.getSystemService(RvP("RCGWlH\u007fo"));
        if (!(systemService instanceof KeyguardManager)) {
            BpQCue.bpQCue.d(KmzNXU, RvP("xSJX|Gyba`tWJl\"ekptb|x&;{\u007ffnz|p3Qo_xzL^O\u0002REmqLGF\u0006\u0019JRZHNU[_W\u000fbxllOzBWgLRMPROWOMW[]QLsC\\WY"));
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE;
        }
        Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) systemService).createConfirmDeviceCredentialIntent(str, str2);
        if (createConfirmDeviceCredentialIntent == null) {
            BpQCue.bpQCue.d(KmzNXU, RvP("xSJX|Gyba`tWJl\"ekptb|x&;tpycsq4gU*EmjLXN\u0002`Uko@JWCZYCGRRr\\EUAB\u0015FVh[bv@ej,QK_WRVQKCY@a_JSC[YCGA]@GtM}}"));
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE;
        }
        try {
            int callIntent = strongAuthCallback.callIntent(createConfirmDeviceCredentialIntent);
            if (callIntent == -1) {
                return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_OK;
            }
            if (callIntent == 0) {
                BpQCue.bpQCue.d(KmzNXU, RvP("xSJX|Gyba`tWJl\"ekptb|x&;gbu}6vu}YoJsjI\fJWUHziQM@KMQX@"));
                return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_CANCELLED;
            }
            BpQCue.bpQCue.d(KmzNXU, RvP("xSJX|Gyba`tWJl\"ekptb|x&;aeu\u007fCe4`NkRj|\rEX\u0002") + callIntent);
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_FAILED;
        } catch (Throwable th) {
            BpQCue.e(KmzNXU, RvP("lH[HiLn\u007fge []ags~pwy.r\u007fxgcbjr5c{_d\u0006|nA@BLF\u0000|fIHjDM]YZ\u001dQ^FY_K\u0016") + th.toString());
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_FAILED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0119, code lost:
    
        MCOFeQ.WNhGqf.TEa = ((r8 % 46) ^ 3045) >> 93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0123, code lost:
    
        if (MCOFeQ.WNhGqf.iin > 7513) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ea, code lost:
    
        r13 = MCOFeQ.WNhGqf.iin;
        r0 = r13 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f0, code lost:
    
        if (r0 == 67) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00f4, code lost:
    
        if (r0 == 118) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f8, code lost:
    
        if (r0 == 200) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r11 == 278) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00fc, code lost:
    
        if (r0 == 223) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ff, code lost:
    
        r0 = ((r13 * 33) >> 89) ^ 1782;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0116, code lost:
    
        MCOFeQ.WNhGqf.iin = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0110, code lost:
    
        r0 = ((MCOFeQ.WNhGqf.iin ^ 1027) + r13) + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0106, code lost:
    
        r0 = (r13 * 40) % 114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0116, code lost:
    
        r0 = ((MCOFeQ.WNhGqf.iin ^ 1027) + r13) + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x010b, code lost:
    
        r0 = (r13 ^ 5252) >> 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r11 == 372) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r11 == 390) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        MCOFeQ.WNhGqf.TEa = (MCOFeQ.WNhGqf.TEa >> 63) % 69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        MCOFeQ.WNhGqf.TEa = ((MCOFeQ.WNhGqf.TEa >> 43) >> 125) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01cc, code lost:
    
        if ((MCOFeQ.WNhGqf.iin ^ 7514) != 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01cf, code lost:
    
        MCOFeQ.WNhGqf.TEa = (MCOFeQ.WNhGqf.TEa + r8) ^ 7090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x01da, code lost:
    
        if ((MCOFeQ.WNhGqf.iin ^ 7514) == 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (MCOFeQ.WNhGqf.iin > 7513) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r13 = MCOFeQ.WNhGqf.iin;
        r0 = r13 + com.airbnb.paris.R2.attr.windowFixedHeightMajor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r0 == 23) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r0 == 60) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        MCOFeQ.WNhGqf.iin = (r13 + r13) * 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        MCOFeQ.WNhGqf.iin = ((MCOFeQ.WNhGqf.iin * 42) ^ 1738) % 126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        MCOFeQ.WNhGqf.TEa = (r8 ^ 2440) >> 70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (MCOFeQ.WNhGqf.iin > 7513) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if ((MCOFeQ.WNhGqf.iin + 39) == 47) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        MCOFeQ.WNhGqf.iin = (MCOFeQ.WNhGqf.iin * 13542) % 87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        MCOFeQ.WNhGqf.TEa = ((r8 * 119) % 86) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007b, code lost:
    
        if ((MCOFeQ.WNhGqf.iin ^ 7514) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
    
        r6 = ((r6 + (r6 ^ r7)) + 51) % 63;
        MCOFeQ.WNhGqf.RRY[r7] = (char) r6;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        if (MCOFeQ.WNhGqf.TEa > 7575) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        if (MCOFeQ.WNhGqf.iin > 7513) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a5, code lost:
    
        r8 = MCOFeQ.WNhGqf.TEa;
        r13 = r8 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        if (r13 == 43) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ad, code lost:
    
        if (r13 == 113) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
    
        MCOFeQ.WNhGqf.TEa = (r8 + r8) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e8, code lost:
    
        if (MCOFeQ.WNhGqf.iin > 7513) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b1, code lost:
    
        if (r13 == 204) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b5, code lost:
    
        if (r13 == 306) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (MCOFeQ.WNhGqf.TEa <= 7575) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0126, code lost:
    
        MCOFeQ.WNhGqf.TEa = ((MCOFeQ.WNhGqf.TEa ^ 3881) % 71) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0133, code lost:
    
        if ((MCOFeQ.WNhGqf.iin ^ 7514) == 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013b, code lost:
    
        if ((MCOFeQ.WNhGqf.iin + 208) == 31) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013e, code lost:
    
        MCOFeQ.WNhGqf.iin = (MCOFeQ.WNhGqf.iin * 80) >> 54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r8 = MCOFeQ.WNhGqf.TEa;
        r11 = r8 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b8, code lost:
    
        MCOFeQ.WNhGqf.TEa = ((MCOFeQ.WNhGqf.TEa * 21) + r8) >> 86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c2, code lost:
    
        if (MCOFeQ.WNhGqf.iin > 7513) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c4, code lost:
    
        r13 = MCOFeQ.WNhGqf.iin;
        r0 = r13 + 195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ca, code lost:
    
        if (r0 == 29) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r11 == 96) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ce, code lost:
    
        if (r0 == 198) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00d1, code lost:
    
        MCOFeQ.WNhGqf.iin = ((r13 + r13) * 72) % 97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d8, code lost:
    
        MCOFeQ.WNhGqf.iin = (MCOFeQ.WNhGqf.iin >> 55) * 28;
     */
    /* JADX WARN: Incorrect return type in method signature: ()V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String RvP(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WNhGqf.RvP(java.lang.String):java.lang.String");
    }
}
