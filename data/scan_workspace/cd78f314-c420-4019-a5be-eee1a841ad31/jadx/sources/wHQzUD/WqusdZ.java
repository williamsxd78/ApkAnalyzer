package wHQzUD;

import com.airbnb.paris.R2;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import wHQzUD.LcDBfR;

/* loaded from: classes10.dex */
public class WqusdZ {
    private static final char[] KeIGRw;
    private static String KmzNXU = null;
    public static int NpK = 0;
    private static final Pattern VsSNtm;
    public static int Xvk = 8230;

    @Nullable
    private static final MessageDigest wazmgp;

    static {
        MessageDigest messageDigest;
        LcDBfR.dIf = 6784;
        LcDBfR.dwn = 4146;
        NpK = 3106;
        KmzNXU = LcDBfR.MGbMwZ(WqusdZ.class);
        KeIGRw = LcDBfR.RvP("\t\u0017\f\u0003-\u001c;<:8a\\Ffge").toCharArray();
        VsSNtm = Pattern.compile(LcDBfR.RvP("g}_\u001d\u007fh M2,9c^46~."));
        try {
            messageDigest = MessageDigest.getInstance(LcDBfR.RvP("jn\u007f\u001d+\u001c;"));
        } catch (NoSuchAlgorithmException e) {
            LcDBfR.GVinle.RgMIvb(KmzNXU, LcDBfR.RvP("jn\u007f\u0002,\u001f-okfeMQ\"dbcu}s"), (Throwable) e);
            messageDigest = null;
        }
        wazmgp = messageDigest;
    }

    private WqusdZ() {
    }

    @Nullable
    public static byte[][] GQNJXL(@Nullable List<String> list) {
        int i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        byte[][] bArr = new byte[list.size()];
        int i2 = 0;
        do {
            int size = list.size();
            if (Xvk <= 8229) {
                do {
                } while (Xvk + 26 != 98);
                while (true) {
                    Xvk = (Xvk ^ 4706) * 115;
                }
            } else {
                if (i2 >= size) {
                    return bArr;
                }
                bArr[i2] = TpZrnd(list.get(i2));
                i2++;
            }
        } while (NpK > 3105);
        if ((Xvk ^ 8230) == 0) {
            while (true) {
                int i3 = NpK;
                int i4 = i3 + 26;
                if (i4 == 76) {
                    NpK = (i3 ^ 2074) * 122;
                    if ((Xvk ^ 8230) != 0) {
                        break;
                    }
                } else if (i4 == 132) {
                    do {
                        NpK *= 3920;
                    } while ((Xvk ^ 8230) == 0);
                    while (true) {
                        int i5 = Xvk;
                        int i6 = i5 + 65;
                        if (i6 == 68) {
                            break;
                        }
                        if (i6 == 211) {
                            while (true) {
                                Xvk = ((Xvk + i5) % 62) + i5;
                            }
                        } else {
                            if (i6 == 319) {
                                i = ((i5 + i5) % 55) ^ 3717;
                                break;
                            }
                            if (i6 == 344) {
                                i = (i5 ^ 4933) * 103;
                                break;
                            }
                        }
                    }
                    Xvk = i;
                    while (true) {
                        Xvk = (Xvk * 36) % 94;
                    }
                }
            }
        }
        do {
        } while (Xvk + 39 != 40);
        while (true) {
            Xvk = ((Xvk >> 78) % 89) * 50;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0092, code lost:
    
        if (r0 == 144) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0095, code lost:
    
        wHQzUD.WqusdZ.Xvk = ((r9 * 99) + r9) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x009c, code lost:
    
        wHQzUD.WqusdZ.Xvk = (wHQzUD.WqusdZ.Xvk >> 1) ^ 3117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00ab, code lost:
    
        wHQzUD.WqusdZ.Xvk = ((wHQzUD.WqusdZ.Xvk + r9) * 117) % 45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a5, code lost:
    
        wHQzUD.WqusdZ.Xvk = (r9 % 61) >> 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x003d, code lost:
    
        wHQzUD.WqusdZ.Xvk = ((wHQzUD.WqusdZ.Xvk + r9) * 117) % 45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cd, code lost:
    
        if (r2 <= 8229) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cf, code lost:
    
        r9 = wHQzUD.WqusdZ.Xvk;
        r0 = r9 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d5, code lost:
    
        if (r0 == 21) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d9, code lost:
    
        if (r0 == 102) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dd, code lost:
    
        if (r0 == 148) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f1, code lost:
    
        wHQzUD.WqusdZ.Xvk = (wHQzUD.WqusdZ.Xvk ^ 4978) >> 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e0, code lost:
    
        wHQzUD.WqusdZ.Xvk = (r9 >> 75) * 77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        wHQzUD.WqusdZ.Xvk = (r9 + r9) ^ 5443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
    
        r9 = wHQzUD.WqusdZ.NpK;
        r0 = r9 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fa, code lost:
    
        if (r0 == 59) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fe, code lost:
    
        if (r0 == 224) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0102, code lost:
    
        if (r0 == 299) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        wHQzUD.WqusdZ.NpK ^= 5589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0122, code lost:
    
        if ((wHQzUD.WqusdZ.Xvk ^ 8230) == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
    
        r9 = wHQzUD.WqusdZ.Xvk;
        r0 = r9 + 156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
    
        if (r0 == 66) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0139, code lost:
    
        wHQzUD.WqusdZ.Xvk = (r9 ^ 2605) * 123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        if (r0 == 216) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        wHQzUD.WqusdZ.Xvk = ((r9 >> 89) * 99) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
    
        wHQzUD.WqusdZ.NpK = ((wHQzUD.WqusdZ.NpK % 60) ^ 1907) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (wHQzUD.WqusdZ.Xvk > 8229) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0105, code lost:
    
        wHQzUD.WqusdZ.NpK = (r9 ^ 4023) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x003a, code lost:
    
        if (r2 <= 8229) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x003d, code lost:
    
        r9 = wHQzUD.WqusdZ.NpK;
        r0 = r9 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0043, code lost:
    
        if (r0 == 67) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0074, code lost:
    
        wHQzUD.WqusdZ.NpK = ((r9 % 104) >> 48) * 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x007e, code lost:
    
        if (wHQzUD.WqusdZ.Xvk > 8229) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0047, code lost:
    
        if (r0 == 246) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x004b, code lost:
    
        if (r0 == 335) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x005e, code lost:
    
        wHQzUD.WqusdZ.NpK = ((r9 ^ com.airbnb.paris.R2.styleable.AppCompatTheme_popupWindowStyle) + r9) ^ 4208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0065, code lost:
    
        wHQzUD.WqusdZ.NpK = (wHQzUD.WqusdZ.NpK >> 126) >> 122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0071, code lost:
    
        if ((wHQzUD.WqusdZ.Xvk ^ 8230) == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x004f, code lost:
    
        if (r0 == 527) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0052, code lost:
    
        wHQzUD.WqusdZ.NpK = ((r9 ^ 1886) + r9) * 38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x005b, code lost:
    
        if (wHQzUD.WqusdZ.Xvk > 8229) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0080, code lost:
    
        r9 = wHQzUD.WqusdZ.Xvk;
        r0 = r9 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0086, code lost:
    
        if (r0 == 18) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x008a, code lost:
    
        if (r0 == 42) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x008e, code lost:
    
        if (r0 == 128) goto L130;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0131 -> B:61:0x0118). Please report as a decompilation issue!!! */
    @javax.annotation.Nonnull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String KgiMSP(@javax.annotation.Nonnull byte[] r9) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wHQzUD.WqusdZ.KgiMSP(byte[]):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static byte[] Kvebpx(@Nullable byte[] bArr) {
        MessageDigest messageDigest;
        byte[] digest;
        if (bArr == null || bArr.length == 0 || (messageDigest = wazmgp) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            digest = messageDigest.digest();
            messageDigest.reset();
        }
        return digest;
    }

    @Nullable
    static byte[] TpZrnd(@Nullable String str) {
        if (jUDvml(str)) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        while (i < length) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
                i++;
                if (NpK <= 3105) {
                    while (true) {
                        int i3 = NpK + 52;
                        if (i3 != 95) {
                            if (i3 == 151) {
                                NpK = (NpK * 126) % 83;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        NpK = ((NpK * 20) ^ 2272) % 59;
                        NpK = (NpK * 126) % 83;
                    }
                }
            } catch (NumberFormatException unused) {
                LcDBfR.GVinle.RgMIvb(LcDBfR.RvP("PJRU~Ha+jdx\u001eVvpjd~\"7u`"), str);
                return null;
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean bhhGTX(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if ((Xvk ^ 8230) == 0) {
            return true;
        }
        while (true) {
            int i = Xvk;
            int i2 = i + 26;
            if (i2 == 37) {
                Xvk = ((i >> 105) >> 122) + i;
            } else if (i2 == 98) {
                Xvk = ((i % 12) ^ 3367) % 100;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0059, code lost:
    
        if ((wHQzUD.WqusdZ.Xvk ^ 8230) != 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean jUDvml(@javax.annotation.Nullable java.lang.String r2) {
        /*
            if (r2 == 0) goto Lb
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            int r2 = wHQzUD.WqusdZ.NpK
            r2 = r2 ^ 3106(0xc22, float:4.352E-42)
            if (r2 == 0) goto L88
            int r2 = wHQzUD.WqusdZ.Xvk
            r2 = r2 ^ 8230(0x2026, float:1.1533E-41)
            if (r2 == 0) goto L34
        L17:
            int r2 = wHQzUD.WqusdZ.Xvk
            int r0 = r2 + 52
            r1 = 77
            if (r0 == r1) goto L2d
            r2 = 93
            if (r0 == r2) goto L24
            goto L17
        L24:
            int r2 = wHQzUD.WqusdZ.Xvk
            r2 = r2 ^ 3923(0xf53, float:5.497E-42)
            int r2 = r2 * 102
            wHQzUD.WqusdZ.Xvk = r2
            goto L24
        L2d:
            int r2 = r2 % 56
            int r2 = r2 * 115
            wHQzUD.WqusdZ.Xvk = r2
            goto L17
        L34:
            int r2 = wHQzUD.WqusdZ.NpK
            int r0 = r2 + 39
            r1 = 36
            if (r0 == r1) goto L4c
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 == r1) goto L45
            r2 = 209(0xd1, float:2.93E-43)
            if (r0 == r2) goto L5c
            goto L34
        L45:
            int r0 = r2 * 85
            int r0 = r0 >> 113
            int r0 = r0 + r2
            wHQzUD.WqusdZ.NpK = r0
        L4c:
            int r0 = wHQzUD.WqusdZ.NpK
            r0 = r0 ^ 4229(0x1085, float:5.926E-42)
            int r0 = r0 % 88
            int r0 = r0 + r2
            wHQzUD.WqusdZ.NpK = r0
            int r2 = wHQzUD.WqusdZ.Xvk
            r2 = r2 ^ 8230(0x2026, float:1.1533E-41)
            if (r2 == 0) goto L5c
            goto L6a
        L5c:
            int r2 = wHQzUD.WqusdZ.NpK
            int r2 = r2 >> 80
            int r2 = r2 * 42
            wHQzUD.WqusdZ.NpK = r2
            int r2 = wHQzUD.WqusdZ.Xvk
            r0 = 8229(0x2025, float:1.1531E-41)
            if (r2 > r0) goto L5c
        L6a:
            int r2 = wHQzUD.WqusdZ.Xvk
            int r0 = r2 + 91
            r1 = 2
            if (r0 == r1) goto L81
            r2 = 127(0x7f, float:1.78E-43)
            if (r0 == r2) goto L76
            goto L6a
        L76:
            int r2 = wHQzUD.WqusdZ.Xvk
            r2 = r2 ^ 1299(0x513, float:1.82E-42)
            int r2 = r2 % 73
            r2 = r2 ^ 2302(0x8fe, float:3.226E-42)
            wHQzUD.WqusdZ.Xvk = r2
            goto L76
        L81:
            int r2 = r2 >> 98
            int r2 = r2 >> 30
            wHQzUD.WqusdZ.Xvk = r2
            goto L6a
        L88:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wHQzUD.WqusdZ.jUDvml(java.lang.String):boolean");
    }

    public static boolean wqdlmN(@Nullable String str) {
        if (!bhhGTX(str) || !VsSNtm.matcher(str).find()) {
            return false;
        }
        if ((Xvk ^ 8230) == 0) {
            return true;
        }
        while (true) {
            int i = Xvk;
            if (i + 39 == 83) {
                Xvk = (i * 38) ^ R2.id.accessibility_custom_action_15;
            }
        }
    }
}
