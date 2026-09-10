package jslYAf;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.accessibility.AccessibilityManager;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.paris.R2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class RjOFDR {
    static int GdMwrg = null;
    static int KuekgD = null;
    static int MSrWmS = null;
    static int RvUsGa = null;
    static int VbOMzt = null;
    public static int dhJ = 0;
    public static int ijb = 9131;
    static int waeBrY;
    private final AccessibilityManager RSxVLC;
    private final PackageManager RXkORT;

    static {
        WsUBUm.dVg = 9721;
        dhJ = 8087;
        WsUBUm.dwn = 4146;
        pO(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RjOFDR(Context context) {
        int i;
        Object systemService = context.getSystemService((String) KuekgD);
        if (ijb > 9130) {
            this.RSxVLC = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            this.RXkORT = context.getPackageManager();
            return;
        }
        while (true) {
            int i2 = ijb;
            int i3 = i2 + 13;
            if (i3 == 78) {
                ijb = ((i2 ^ 3468) >> 77) % 82;
            } else if (i3 == 274) {
                i = (i2 ^ 4949) >> 96;
                ijb = i;
            } else if (i3 != 357) {
            }
            i = (ijb ^ 2332) % 52;
            ijb = i;
        }
    }

    private void Gwqdfd(List<AccessibilityServiceInfo> list) {
        AccessibilityManager accessibilityManager = this.RSxVLC;
        if (accessibilityManager == null || this.RXkORT == null) {
            return;
        }
        lmhmkg(accessibilityManager.getEnabledAccessibilityServiceList(26), list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x010c, code lost:
    
        r0 = jslYAf.RjOFDR.dhJ;
        r2 = jslYAf.RjOFDR.ijb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0112, code lost:
    
        if ((r2 ^ 9131) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012e, code lost:
    
        r0 = (r0 ^ 3647) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0131, code lost:
    
        if (r2 > 9130) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x015a, code lost:
    
        jslYAf.RjOFDR.dhJ = r0 >> 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0160, code lost:
    
        if ((r2 ^ 9131) == 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0162, code lost:
    
        r0 = jslYAf.RjOFDR.ijb;
        r2 = r0 + 156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0168, code lost:
    
        if (r2 == 61) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x016c, code lost:
    
        if (r2 == 165) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0170, code lost:
    
        if (r2 == 222) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0173, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb % 3) >> 55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017b, code lost:
    
        jslYAf.RjOFDR.ijb = (r0 * 2) ^ 2653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0181, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb ^ com.airbnb.paris.R2.styleable.GradientColor_android_centerColor) % 18) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0133, code lost:
    
        r10 = jslYAf.RjOFDR.ijb;
        r0 = r10 + com.airbnb.paris.R2.attr.textAppearanceSearchResultTitle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0139, code lost:
    
        if (r0 == 63) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x013d, code lost:
    
        if (r0 == 260) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0141, code lost:
    
        if (r0 == 380) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0144, code lost:
    
        jslYAf.RjOFDR.ijb = ((r10 % 93) * 55) % 97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0153, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb + r10) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x014c, code lost:
    
        jslYAf.RjOFDR.ijb ^= com.airbnb.paris.R2.styleable.AppCompatSeekBar_tickMarkTint;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0114, code lost:
    
        r10 = jslYAf.RjOFDR.ijb;
        r11 = r10 + 169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0118, code lost:
    
        if (r11 == 14) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x011c, code lost:
    
        if (r11 == 57) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x011f, code lost:
    
        jslYAf.RjOFDR.ijb = ((r10 % 113) + r10) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0125, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb ^ 51) >> 103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
    
        r10 = jslYAf.RjOFDR.ijb;
        r0 = r10 + 143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b1, code lost:
    
        if (r0 == 97) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b5, code lost:
    
        if (r0 == 135) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b9, code lost:
    
        if (r0 == 333) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb >> 51) * 50) >> 25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00bc, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb + r10) >> 45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c8, code lost:
    
        jslYAf.RjOFDR.ijb = r10 * 5760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d1, code lost:
    
        r10 = jslYAf.RjOFDR.dhJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d7, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d9, code lost:
    
        r0 = jslYAf.RjOFDR.ijb;
        r2 = r0 + 247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00df, code lost:
    
        if (r2 == 99) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e3, code lost:
    
        if (r2 == 142) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e7, code lost:
    
        if (r2 == 205) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00fc, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb % 76) + r0) ^ 4620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ea, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb + r0) * 2) % 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f4, code lost:
    
        jslYAf.RjOFDR.ijb = ((r0 + r0) % 84) ^ 2737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0109, code lost:
    
        if ((r10 + 117) == 28) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean KIhhCF(android.accessibilityservice.AccessibilityServiceInfo r11) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.RjOFDR.KIhhCF(android.accessibilityservice.AccessibilityServiceInfo):boolean");
    }

    private List<String> MYYUAG() {
        int i;
        ArrayList arrayList = new ArrayList();
        RJHBJj(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<AccessibilityServiceInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(VFlmLL(it.next()));
            if ((dhJ ^ 8087) != 0) {
                if ((ijb ^ 9131) != 0) {
                    while (true) {
                        int i2 = ijb;
                        int i3 = i2 + 39;
                        if (i3 != 78) {
                            if (i3 == 135) {
                                ijb = ((i2 + i2) ^ R2.styleable.AppCompatTheme_spinnerStyle) + i2;
                            }
                        }
                        ijb = (ijb ^ 1726) * 21;
                    }
                } else {
                    while (true) {
                        i = dhJ;
                        int i4 = i + 26;
                        if (i4 == 95) {
                            break;
                        }
                        if (i4 == 260) {
                            dhJ = ((i + i) >> 71) >> 26;
                        }
                    }
                    loop3: while (true) {
                        dhJ = ((dhJ >> 4) + i) % 49;
                        if (ijb <= 9130) {
                            while (true) {
                                int i5 = ijb;
                                int i6 = i5 + 52;
                                if (i6 == 30) {
                                    ijb = ((i5 + i5) >> 80) + i5;
                                    break loop3;
                                }
                                if (i6 == 94) {
                                    ijb = (i5 >> 111) + i5;
                                    break;
                                }
                                if (i6 == 280) {
                                    break loop3;
                                }
                            }
                        }
                    }
                    while (true) {
                        ijb = (ijb >> 10) % 84;
                    }
                }
            }
        }
        return arrayList2;
    }

    private void RJHBJj(List<AccessibilityServiceInfo> list) {
        AccessibilityManager accessibilityManager = this.RSxVLC;
        if (accessibilityManager == null || this.RXkORT == null) {
            return;
        }
        lmhmkg(accessibilityManager.getInstalledAccessibilityServiceList(), list);
    }

    private String VFlmLL(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getId().split(DomExceptionUtils.SEPARATOR)[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (jslYAf.RjOFDR.ijb <= 9130) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        r5 = jslYAf.RjOFDR.dhJ;
        r0 = r5 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r0 == 52) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r0 == 203) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        jslYAf.RjOFDR.dhJ = (r5 * 71) % 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (jslYAf.RjOFDR.ijb > 9130) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        if (r0 == 352) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005a, code lost:
    
        jslYAf.RjOFDR.dhJ = ((jslYAf.RjOFDR.dhJ >> 66) + r5) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0066, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0068, code lost:
    
        r5 = jslYAf.RjOFDR.ijb;
        r6 = r5 + 169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r6 == 54) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        if (r6 == 164) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0075, code lost:
    
        jslYAf.RjOFDR.ijb = ((r5 ^ 2372) + r5) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb * 67) >> 46) >> 86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
    
        jslYAf.RjOFDR.dhJ = ((jslYAf.RjOFDR.dhJ * 43) ^ 2250) % 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ae, code lost:
    
        if (jslYAf.RjOFDR.ijb > 9130) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        r5 = jslYAf.RjOFDR.ijb;
        r6 = r5 + 143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
    
        if (r6 == 82) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
    
        if (r6 == 256) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bc, code lost:
    
        if (r6 == 352) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
    
        jslYAf.RjOFDR.ijb = ((r5 + r5) + r5) * 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d4, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb + r5) * 66) >> 73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d4, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb * 96) >> 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0091, code lost:
    
        r5 = jslYAf.RjOFDR.ijb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0097, code lost:
    
        if ((r5 + 130) == 38) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009a, code lost:
    
        jslYAf.RjOFDR.ijb = ((r5 + r5) + r5) ^ 4785;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009a -> B:28:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean XjtaUR(android.accessibilityservice.AccessibilityServiceInfo r6) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.RjOFDR.XjtaUR(android.accessibilityservice.AccessibilityServiceInfo):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0135, code lost:
    
        if (r5 == 283) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0138, code lost:
    
        r5 = r3 >> 53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x013e, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0150, code lost:
    
        jslYAf.RjOFDR.dhJ = (r5 + r3) * 38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0144, code lost:
    
        if ((jslYAf.RjOFDR.ijb + 143) == 45) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0147, code lost:
    
        jslYAf.RjOFDR.ijb *= 763268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00eb, code lost:
    
        r8 = jslYAf.RjOFDR.ijb;
        r9 = r8 + com.airbnb.paris.R2.attr.textAppearanceSearchResultTitle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f1, code lost:
    
        if (r9 == 30) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0101, code lost:
    
        jslYAf.RjOFDR.ijb = (r8 % 72) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f5, code lost:
    
        if (r9 == 85) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00f8, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb ^ 3384) * 119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00a4, code lost:
    
        r8 = jslYAf.RjOFDR.ijb;
        r9 = r8 + 234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00aa, code lost:
    
        if (r9 == 26) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00ae, code lost:
    
        if (r9 == 218) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00c9, code lost:
    
        jslYAf.RjOFDR.ijb = (r8 * 11760) % 45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00b2, code lost:
    
        if (r9 == 412) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00b6, code lost:
    
        if (r9 == 533) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00d5, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb % 40) % 24) * 115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00d5, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb >> 108) % 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x00b9, code lost:
    
        jslYAf.RjOFDR.ijb = ((r8 * 107) >> 39) % 89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0085, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
    
        r3 = jslYAf.RjOFDR.ijb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
    
        if ((r3 + 182) == 81) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
    
        jslYAf.RjOFDR.ijb = ((r3 ^ com.airbnb.paris.R2.styleable.ActionBar_customNavigationLayout) % 71) * 44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
    
        if (r0 >= r2) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009a, code lost:
    
        r3 = r8[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a2, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00de, code lost:
    
        if (r3.equals(jslYAf.RjOFDR.MSrWmS) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        r10.add(r9.packageName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
    
        r0 = r0 + 1;
        r3 = jslYAf.RjOFDR.ijb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        if (r3 > 9130) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010b, code lost:
    
        if ((jslYAf.RjOFDR.dhJ ^ 8087) == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010d, code lost:
    
        if (r3 > 9130) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010f, code lost:
    
        r3 = jslYAf.RjOFDR.ijb;
        r5 = r3 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        if (r5 == 59) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        if (r5 == 136) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0120, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb ^ com.airbnb.paris.R2.styleable.LinearLayoutCompat_Layout_android_layout_height) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011c, code lost:
    
        jslYAf.RjOFDR.ijb = r3 ^ com.airbnb.paris.R2.styleable.GradientColor_android_endY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0127, code lost:
    
        r3 = jslYAf.RjOFDR.dhJ;
        r5 = r3 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012d, code lost:
    
        if (r5 == 60) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
    
        if (r5 == 114) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0157, code lost:
    
        jslYAf.RjOFDR.dhJ = (r3 * 34) % 114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015e, code lost:
    
        if (jslYAf.RjOFDR.ijb > 9130) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0180, code lost:
    
        jslYAf.RjOFDR.dhJ = (jslYAf.RjOFDR.dhJ + r3) >> 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0160, code lost:
    
        r5 = jslYAf.RjOFDR.ijb;
        r8 = r5 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        if (r8 == 12) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
    
        if (r8 == 65) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:
    
        jslYAf.RjOFDR.ijb = ((r5 ^ 1803) >> 89) >> 51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0176, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb ^ com.airbnb.paris.R2.styleable.MenuView_subMenuArrow) + r5) ^ 3800;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void XmxiGe(android.content.pm.PackageInfo r9, java.util.Set<java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.RjOFDR.XmxiGe(android.content.pm.PackageInfo, java.util.Set):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
    
        jslYAf.RjOFDR.dhJ = (jslYAf.RjOFDR.dhJ >> 56) ^ 2137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0082, code lost:
    
        if (jslYAf.RjOFDR.ijb > 9130) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
    
        r5 = jslYAf.RjOFDR.ijb;
        r6 = r5 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (r6 == 75) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        jslYAf.RjOFDR.ijb = ((r5 * 29) % 23) % 77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008c, code lost:
    
        if (r6 == 250) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008f, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb ^ 3513) + r5) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0078, code lost:
    
        jslYAf.RjOFDR.dhJ = ((jslYAf.RjOFDR.dhJ >> 119) * 45) ^ 3984;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lmhmkg(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> r6, java.util.List<android.accessibilityservice.AccessibilityServiceInfo> r7) {
        /*
            r5 = this;
            android.content.pm.PackageManager r0 = r5.RXkORT
            if (r0 == 0) goto Lc0
            if (r6 != 0) goto L8
            goto Lc0
        L8:
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r6.next()
            android.accessibilityservice.AccessibilityServiceInfo r0 = (android.accessibilityservice.AccessibilityServiceInfo) r0
            android.content.pm.PackageManager r1 = r5.RXkORT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            java.lang.String r2 = r5.VFlmLL(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto Lc
            android.content.pm.ApplicationInfo r2 = r1.applicationInfo
            r3 = 75
            r4 = 9130(0x23aa, float:1.2794E-41)
            if (r2 != 0) goto La1
            int r0 = jslYAf.RjOFDR.dhJ
            r1 = 8086(0x1f96, float:1.1331E-41)
            if (r0 > r1) goto Lc
            int r0 = jslYAf.RjOFDR.ijb
            r0 = r0 ^ 9131(0x23ab, float:1.2795E-41)
            if (r0 == 0) goto L52
        L3b:
            int r5 = jslYAf.RjOFDR.ijb
            int r6 = r5 + 91
            r7 = 98
            if (r6 == r7) goto L4d
            r7 = 209(0xd1, float:2.93E-43)
            if (r6 == r7) goto L48
            goto L3b
        L48:
            int r5 = r5 >> 89
            int r5 = r5 * 81
            goto L4f
        L4d:
            int r5 = r5 * 868
        L4f:
            jslYAf.RjOFDR.ijb = r5
            goto L3b
        L52:
            int r0 = jslYAf.RjOFDR.dhJ
            int r1 = r0 + 65
            r2 = 9
            if (r1 == r2) goto L6e
            r2 = 120(0x78, float:1.68E-43)
            if (r1 == r2) goto L63
            r0 = 226(0xe2, float:3.17E-43)
            if (r1 == r0) goto L78
            goto L52
        L63:
            int r0 = r0 >> 17
            int r0 = r0 * 20
            jslYAf.RjOFDR.dhJ = r0
            int r0 = jslYAf.RjOFDR.ijb
            if (r0 > r4) goto Lc
            goto Lb0
        L6e:
            int r5 = jslYAf.RjOFDR.dhJ
            int r5 = r5 >> 119
            int r5 = r5 * 45
            r5 = r5 ^ 3984(0xf90, float:5.583E-42)
            jslYAf.RjOFDR.dhJ = r5
        L78:
            int r5 = jslYAf.RjOFDR.dhJ
            int r5 = r5 >> 56
            r5 = r5 ^ 2137(0x859, float:2.995E-42)
            jslYAf.RjOFDR.dhJ = r5
            int r5 = jslYAf.RjOFDR.ijb
            if (r5 > r4) goto L6e
        L84:
            int r5 = jslYAf.RjOFDR.ijb
            int r6 = r5 + 117
            if (r6 == r3) goto L98
            r7 = 250(0xfa, float:3.5E-43)
            if (r6 == r7) goto L8f
            goto L84
        L8f:
            int r6 = jslYAf.RjOFDR.ijb
            r6 = r6 ^ 3513(0xdb9, float:4.923E-42)
            int r6 = r6 + r5
            int r6 = r6 + r5
            jslYAf.RjOFDR.ijb = r6
            goto L8f
        L98:
            int r5 = r5 * 29
            int r5 = r5 % 23
            int r5 = r5 % 77
            jslYAf.RjOFDR.ijb = r5
            goto L84
        La1:
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo
            int r1 = r1.flags
            r1 = r1 & 129(0x81, float:1.81E-43)
            if (r1 != 0) goto Lac
            r7.add(r0)
        Lac:
            int r0 = jslYAf.RjOFDR.ijb
            if (r0 > r4) goto Lc
        Lb0:
            int r5 = jslYAf.RjOFDR.ijb
            int r5 = r5 + 65
            if (r5 == r3) goto Lb7
            goto Lb0
        Lb7:
            int r5 = jslYAf.RjOFDR.ijb
            int r5 = r5 >> 37
            int r5 = r5 % 65
            jslYAf.RjOFDR.ijb = r5
            goto Lb7
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.RjOFDR.lmhmkg(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0168, code lost:
    
        jslYAf.RjOFDR.dhJ = (r3 ^ 4667) >> 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0158, code lost:
    
        jslYAf.RjOFDR.ijb = (r0 >> 25) % 122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x015f, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb * 13) ^ 2542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01b4, code lost:
    
        if (jslYAf.RjOFDR.ijb <= 9130) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01b6, code lost:
    
        r3 = jslYAf.RjOFDR.ijb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01bc, code lost:
    
        if ((r3 + 39) == 77) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01bf, code lost:
    
        jslYAf.RjOFDR.ijb = (r3 * 7) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01c4, code lost:
    
        jslYAf.RjOFDR.GdMwrg = jslYAf.WsUBUm.RvP("VP[BuHt");
        jslYAf.RjOFDR.VbOMzt = jslYAf.WsUBUm.RvP("xE]UjZdikmiJ\\Qgq|p{r}");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01d4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cb, code lost:
    
        if (r1 <= 9130) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d3, code lost:
    
        if ((jslYAf.RjOFDR.ijb + 78) == 42) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d6, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb >> 110) ^ 3020;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0137, code lost:
    
        r3 = jslYAf.RjOFDR.dhJ % 98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013f, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0141, code lost:
    
        r0 = jslYAf.RjOFDR.ijb;
        r1 = r0 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0147, code lost:
    
        if (r1 == 12) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014b, code lost:
    
        if (r1 == 69) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014f, code lost:
    
        if (r1 == 180) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0152, code lost:
    
        jslYAf.RjOFDR.ijb = (r0 >> 6) + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void pO(boolean r3) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.RjOFDR.pO(boolean):void");
    }

    Set<String> KBCman() {
        int i;
        ArrayList arrayList = new ArrayList();
        Gwqdfd(arrayList);
        HashSet hashSet = new HashSet();
        Iterator<AccessibilityServiceInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(VFlmLL(it.next()));
            if ((ijb ^ 9131) != 0) {
                while (true) {
                    int i2 = ijb;
                    int i3 = i2 + 26;
                    if (i3 == 34) {
                        i = (i2 >> 70) ^ 3921;
                    } else if (i3 == 192) {
                        i = ((i2 + i2) + i2) >> 102;
                    }
                    ijb = i;
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONArray KeqCCn() throws JSONException {
        return new JSONArray().put(VbOMzt).put(new JSONObject().put((String) waeBrY, (Object) KBCman())).put(new JSONObject().put((String) RvUsGa, (Object) XwnpaY())).put(new JSONObject().put((String) GdMwrg, (Object) dGTcGx()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (jslYAf.RjOFDR.ijb <= 9130) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r4 = jslYAf.RjOFDR.ijb;
        r1 = r4 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r1 == 28) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r1 == 58) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r1 == 252) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r1 == 315) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb >> 26) * 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb ^ 2173) >> 13) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb >> 7) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb * 71) >> 59) % 101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb >> 7) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r4 = jslYAf.RjOFDR.dhJ;
        r1 = r4 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r1 == 60) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r1 == 101) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r1 == 276) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r1 == 352) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        jslYAf.RjOFDR.dhJ = (jslYAf.RjOFDR.dhJ ^ 3154) >> 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        jslYAf.RjOFDR.dhJ = ((jslYAf.RjOFDR.dhJ % 126) % 103) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        jslYAf.RjOFDR.dhJ = (jslYAf.RjOFDR.dhJ ^ 3154) >> 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        r0 = jslYAf.RjOFDR.ijb;
        r4 = r0 + 143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r4 == 41) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        if (r4 == 226) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
    
        if (r4 == 393) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb ^ 6465) >> 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        r4 = (jslYAf.RjOFDR.ijb * com.airbnb.paris.R2.string.abc_activitychooserview_choose_application) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b6, code lost:
    
        jslYAf.RjOFDR.ijb = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb ^ 6465) >> 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        r4 = ((r0 * 119) % 50) ^ 3454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        jslYAf.RjOFDR.dhJ = (jslYAf.RjOFDR.dhJ >> 68) % 76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e1, code lost:
    
        if (jslYAf.RjOFDR.ijb > 9130) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        r4 = jslYAf.RjOFDR.ijb;
        r0 = r4 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e9, code lost:
    
        if (r0 == 49) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
    
        if (r0 == 119) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
    
        if (r0 == 165) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        jslYAf.RjOFDR.ijb = (jslYAf.RjOFDR.ijb >> 67) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb >> 108) + r4) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0105, code lost:
    
        jslYAf.RjOFDR.ijb = ((jslYAf.RjOFDR.ijb + r4) * 38) % 73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ca, code lost:
    
        jslYAf.RjOFDR.dhJ = (r4 >> 75) % 114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d4, code lost:
    
        if ((jslYAf.RjOFDR.ijb ^ 9131) == 0) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.Set<java.lang.String> XwnpaY() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.RjOFDR.XwnpaY():java.util.Set");
    }

    Set<String> dGTcGx() {
        int i;
        HashSet hashSet = new HashSet();
        for (String str : MYYUAG()) {
            PackageInfo packageInfo = null;
            try {
                PackageManager packageManager = this.RXkORT;
                if (packageManager != null) {
                    packageInfo = packageManager.getPackageInfo(str, 4096);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                if ((packageInfo.applicationInfo.flags & 1) == 0) {
                    XmxiGe(packageInfo, hashSet);
                    if (ijb <= 9130) {
                        do {
                        } while (ijb + 52 != 63);
                        while (true) {
                            ijb = (ijb % 54) % 49;
                        }
                    }
                } else if ((dhJ ^ 8087) != 0) {
                    do {
                        i = dhJ;
                    } while (i + 52 != 41);
                    dhJ = ((i + i) % 117) * 32;
                    if (ijb <= 9130) {
                        do {
                        } while (ijb + 52 != 63);
                        while (true) {
                            ijb = (ijb % 54) % 49;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return hashSet;
    }
}
