package MCOFeQ;

import MCOFeQ.GVinle;
import com.airbnb.paris.R2;
import com.google.common.base.Ascii;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class WqusdZ {
    private static final char[] GRHiNR;
    private static final int GrmQsR = 128;
    private static final char[] KeIGRw;
    private static String KmzNXU = null;
    static final int MAX_ATTR_LEN = 255;
    static final int MAX_LONG_BYTE_INDEX = 8;
    private static final int NvLzMe = 262144;
    private static final int RHQlUn = 5;
    public static char[] RRY = null;
    private static final Pattern TgVMtB;
    static final int UNLIMITED_ATTR_LEN = -1;
    private static String VlWrlO = null;
    private static final Pattern VsSNtm;
    private static final Pattern XllRbf;

    @Nullable
    private static final SecureRandom bflgPv;

    @Nullable
    private static final MessageDigest dVhPuC;
    private static final int dkEgtc = 8;
    public static int dwn;
    private static final Pattern jDvHvX;

    @Nullable
    private static final MessageDigest lGCWLs;
    public static int wQp;

    @Nullable
    private static final MessageDigest wazmgp;

    static {
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        TXfDQv.MFY = 9274;
        GVinle.C0001GVinle.Ffd = 2277;
        GVinle.VcN = 3963;
        wQp = 8268;
        dwn = 4146;
        GVinle.cfO = 3616;
        TXfDQv.drG = 2156;
        VlWrlO = RvP("JV[SpHa+rsoSJvkld");
        KmzNXU = GVinle.MGbMwZ(WqusdZ.class);
        KeIGRw = RvP("\t\u0017\f\u0003-\u001c;<:8a\\Ffge").toCharArray();
        VsSNtm = Pattern.compile(RvP("g}_\u001d\u007fh M2,9c^46~."));
        TgVMtB = Pattern.compile(RvP("g\u000ee\u00004\u0010L&D`-Xxy0~00c'\"(a3I!=6W8Rr\u0017l{d=P\u0005\u000f"));
        jDvHvX = Pattern.compile(RvP("g\u000e\u000eK(\u0005?v8({\u000e\t7\u007f+:b);<`5?"));
        XllRbf = Pattern.compile(RvP("g}\u000e\u001dD\u0002)"));
        bflgPv = new SecureRandom();
        GVinle.TjAjed(KmzNXU, RvP("~CJDpGj+QIA\u000f\u0005fkdojl"));
        MessageDigest messageDigest3 = null;
        try {
            messageDigest = MessageDigest.getInstance(RvP("jn\u007f\u0001"));
        } catch (NoSuchAlgorithmException e) {
            GVinle.C0001GVinle.RgMIvb(KmzNXU, RvP("jn\u007f\u00019Mdlgrt\u001eCckoo}"), (Throwable) e);
            TXfDQv.PdIzv().RWPiNO(e);
            messageDigest = null;
        }
        dVhPuC = messageDigest;
        GVinle.TjAjed(KmzNXU, RvP("~CJDpGj+OE5\u001eAkefym"));
        try {
            messageDigest2 = MessageDigest.getInstance(RvP("tb\u000b"));
        } catch (NoSuchAlgorithmException e2) {
            GVinle.C0001GVinle.RgMIvb(KmzNXU, RvP("tb\u000b\u0010}@jnqu XDknfn"), (Throwable) e2);
            TXfDQv.PdIzv().RWPiNO(e2);
            messageDigest2 = null;
        }
        lGCWLs = messageDigest2;
        GVinle.TjAjed(KmzNXU, RvP("~CJDpGj+QIA\f\u00104\"gc~}dz"));
        try {
            messageDigest3 = MessageDigest.getInstance(RvP("jn\u007f\u001d+\u001c;"));
        } catch (NoSuchAlgorithmException e3) {
            GVinle.C0001GVinle.RgMIvb(KmzNXU, RvP("jn\u007f\u0002,\u001f-okfeMQ\"dbcu}s"), (Throwable) e3);
            TXfDQv.PdIzv().RWPiNO(e3);
        }
        wazmgp = messageDigest3;
        GRHiNR = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7', '='};
    }

    private WqusdZ() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long GOISGl(long j, int i) {
        if (i >= 0 && i <= 7) {
            int i2 = i * 8;
            j &= ~(255 << i2);
            try {
                return j | ((255 & VGlFBC(j)) << i2);
            } catch (Exception e) {
                TXfDQv.PdIzv().RWPiNO(e);
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nonnull
    public static String GTusfT(@Nonnull byte[] bArr) {
        int i;
        int i2;
        int i3;
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i4 = 0;
        while (i4 < bArr.length) {
            int i5 = wQp;
            if ((i5 ^ 8268) != 0) {
                while (true) {
                    i = wQp;
                    int i6 = i + 26;
                    if (i6 == 64) {
                        wQp = (i >> 77) ^ 3735;
                    } else if (i6 == 165) {
                        break;
                    }
                }
                while (true) {
                    wQp = ((wQp + i) * 113) >> 83;
                }
            } else {
                byte b = bArr[i4];
                int i7 = i4 * 3;
                char[] cArr2 = KeIGRw;
                char c = cArr2[(b & 255) >>> 4];
                if (i5 <= 8267) {
                    do {
                        i2 = wQp;
                    } while (i2 + 65 != 9);
                    while (true) {
                        wQp = (wQp + i2) ^ 2686;
                    }
                } else {
                    cArr[i7] = c;
                    cArr[i7 + 1] = cArr2[b & Ascii.SI];
                    if (i4 < bArr.length - 1) {
                        cArr[i7 + 2] = AbstractJsonLexerKt.COLON;
                    }
                    i4++;
                    if (i5 <= 8267) {
                        do {
                            i3 = wQp;
                        } while (i3 + 52 != 7);
                        wQp = (i3 * 112) % 97;
                    }
                }
            }
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String GgVNTr(@Nullable byte[] bArr) {
        String KgiMSP;
        if (bArr != null && bArr.length != 0) {
            if (NCRFOs.PdIzv().lEggzI()) {
                return NCRFOs.PdIzv().GgVNTr(bArr);
            }
            MessageDigest messageDigest = wazmgp;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] digest = messageDigest.digest();
                    messageDigest.reset();
                    KgiMSP = KgiMSP(digest);
                }
                return KgiMSP;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String GmcSpS(@Nullable byte[] bArr) {
        String KgiMSP;
        if (bArr != null && bArr.length != 0) {
            if (NCRFOs.PdIzv().lEggzI()) {
                return NCRFOs.PdIzv().GmcSpS(bArr);
            }
            MessageDigest messageDigest = dVhPuC;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] digest = messageDigest.digest();
                    messageDigest.reset();
                    KgiMSP = KgiMSP(digest);
                }
                return KgiMSP;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        r6 = MCOFeQ.WqusdZ.wQp;
        r1 = r6 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (r1 == 35) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r1 == 90) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
    
        if (r1 == 248) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r1 == 399) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        r6 = (r6 + r6) ^ 5066;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0090, code lost:
    
        MCOFeQ.WqusdZ.wQp = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
    
        r6 = ((r6 >> 61) * 36) ^ 4198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009f, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp ^ 3700) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009a, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r6 % 119) >> 23) % 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
    
        if (r5 == (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a8, code lost:
    
        return r3.substring(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
    
        return r3.substring(r4);
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String KKCTlh(@javax.annotation.Nonnull java.lang.String r3, @javax.annotation.Nonnull java.lang.String r4, @javax.annotation.Nonnull java.lang.String r5, boolean r6) {
        /*
            boolean r0 = jUDvml(r3)
            int r1 = MCOFeQ.WqusdZ.wQp
            r1 = r1 ^ 8268(0x204c, float:1.1586E-41)
            if (r1 == 0) goto L40
        La:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r4 = r3 + 104
            r5 = 43
            if (r4 == r5) goto L35
            r5 = 197(0xc5, float:2.76E-43)
            if (r4 == r5) goto L26
            r5 = 337(0x151, float:4.72E-43)
            if (r4 == r5) goto L2e
            r5 = 396(0x18c, float:5.55E-43)
            if (r4 == r5) goto L1f
            goto La
        L1f:
            int r4 = r3 * 37
            int r4 = r4 + r3
            int r3 = r4 >> 112
            MCOFeQ.WqusdZ.wQp = r3
        L26:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r3 = r3 >> 3
            int r3 = r3 * 9416
            MCOFeQ.WqusdZ.wQp = r3
        L2e:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r3 = r3 * 1620
            MCOFeQ.WqusdZ.wQp = r3
            goto La
        L35:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r3 = r3 % 18
            int r3 = r3 >> 120
            int r3 = r3 >> 123
            MCOFeQ.WqusdZ.wQp = r3
            goto L35
        L40:
            r1 = 0
            if (r0 != 0) goto Lae
            boolean r0 = jUDvml(r5)
            if (r0 == 0) goto L4a
            goto Lae
        L4a:
            boolean r0 = jUDvml(r4)
            if (r0 == 0) goto L51
            return r3
        L51:
            if (r6 == 0) goto L5c
            java.lang.String r6 = r3.toLowerCase()
            java.lang.String r4 = r4.toLowerCase()
            goto L5d
        L5c:
            r6 = r3
        L5d:
            int r4 = r6.indexOf(r4)
            r0 = -1
            if (r4 != r0) goto L65
            return r1
        L65:
            int r1 = r4 + 1
            int r5 = r6.indexOf(r5, r1)
            int r6 = MCOFeQ.WqusdZ.wQp
            r1 = 8267(0x204b, float:1.1585E-41)
            if (r6 > r1) goto La2
        L71:
            int r6 = MCOFeQ.WqusdZ.wQp
            int r1 = r6 + 78
            r2 = 35
            if (r1 == r2) goto L93
            r2 = 90
            if (r1 == r2) goto L9a
            r2 = 248(0xf8, float:3.48E-43)
            if (r1 == r2) goto L8a
            r2 = 399(0x18f, float:5.59E-43)
            if (r1 == r2) goto L86
            goto L71
        L86:
            int r6 = r6 + r6
            r6 = r6 ^ 5066(0x13ca, float:7.099E-42)
            goto L90
        L8a:
            int r6 = r6 >> 61
            int r6 = r6 * 36
            r6 = r6 ^ 4198(0x1066, float:5.883E-42)
        L90:
            MCOFeQ.WqusdZ.wQp = r6
            goto La2
        L93:
            int r3 = r6 % 119
            int r3 = r3 >> 23
            int r3 = r3 % 31
            goto L9f
        L9a:
            int r3 = MCOFeQ.WqusdZ.wQp
            r3 = r3 ^ 3700(0xe74, float:5.185E-42)
            int r3 = r3 + r6
        L9f:
            MCOFeQ.WqusdZ.wQp = r3
            goto L9a
        La2:
            if (r5 == r0) goto La9
            java.lang.String r3 = r3.substring(r4, r5)
            return r3
        La9:
            java.lang.String r3 = r3.substring(r4)
            return r3
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.KKCTlh(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
    
        MCOFeQ.WqusdZ.wQp = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp % 71) >> 101) * 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0086, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L80;
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String KXPsJs(@javax.annotation.Nullable java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.KXPsJs(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        r3 = MCOFeQ.WqusdZ.wQp;
        r4 = r3 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r4 == 18) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r4 == 65) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r4 == 208) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r3 * 91) ^ 5995;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp >> 20) * 70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 100) >> 24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String KXSdwP(@javax.annotation.Nonnull java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.KXSdwP(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nonnull
    public static String KgiMSP(@Nonnull byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        char[] cArr = new char[bArr.length * 2];
        int i5 = 0;
        while (i5 < bArr.length) {
            if ((wQp ^ 8268) != 0) {
                do {
                    i = wQp;
                    i2 = i + 26;
                    if (i2 == 86) {
                        while (true) {
                            wQp = (wQp ^ 3474) % 93;
                        }
                    }
                } while (i2 != 229);
                while (true) {
                    wQp = (wQp + i) * 21;
                }
            } else {
                byte b = bArr[i5];
                int i6 = b & 255;
                if (dwn <= 4145) {
                    while (true) {
                        int i7 = dwn;
                        int i8 = i7 + 39;
                        if (i8 == 11) {
                            dwn = (i7 + i7) * 39;
                        } else {
                            if (i8 == 124) {
                                dwn = (i7 >> 61) * 76;
                                break;
                            }
                            if (i8 == 232) {
                                dwn = (i7 * 21) + i7;
                            } else if (i8 == 246) {
                                dwn = ((i7 * 119) % 86) + i7;
                                if ((wQp ^ 8268) != 0) {
                                    while (true) {
                                        i4 = wQp;
                                        int i9 = i4 + 130;
                                        if (i9 == 60) {
                                            wQp = ((i4 * 10) ^ 5234) % 77;
                                        } else if (i9 != 212) {
                                            if (i9 == 282) {
                                                break;
                                            }
                                        }
                                        wQp = ((wQp * 31) >> 48) ^ 3571;
                                    }
                                    wQp = (i4 ^ 1942) >> 3;
                                }
                            }
                        }
                    }
                }
                int i10 = i5 * 2;
                char[] cArr2 = KeIGRw;
                cArr[i10] = cArr2[i6 >>> 4];
                cArr[i10 + 1] = cArr2[b & Ascii.SI];
                i5++;
                if (dwn <= 4145) {
                    while (true) {
                        int i11 = dwn;
                        int i12 = i11 + 26;
                        if (i12 == 38) {
                            dwn = (i11 ^ 2440) >> 70;
                            if ((wQp ^ 8268) != 0) {
                                while (true) {
                                    i3 = wQp;
                                    int i13 = i3 + 52;
                                    if (i13 == 83) {
                                        break;
                                    }
                                    if (i13 == 95) {
                                        while (true) {
                                            wQp = (wQp % 84) ^ 1984;
                                        }
                                    } else {
                                        if (i13 == 198) {
                                            wQp = ((i3 >> 20) >> 114) * 92;
                                            break;
                                        }
                                        if (i13 == 331) {
                                            break;
                                        }
                                    }
                                }
                                wQp = (wQp ^ 2318) % 110;
                                wQp = (wQp % 50) + i3;
                            } else {
                                continue;
                            }
                        } else if (i12 == 132) {
                            while (true) {
                                dwn = ((dwn >> 43) >> 125) + i11;
                            }
                        }
                    }
                }
            }
        }
        return new String(cArr);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String MefsKW(Map<String, Object> map) {
        return MefsKW(map, false);
    }

    static String MefsKW(Map<String, Object> map, boolean z) {
        return MefsKW(map, z, 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0091, code lost:
    
        if ((MCOFeQ.WqusdZ.dwn ^ 4146) != 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a9, code lost:
    
        r0.replace(0, 1, "{").append("}");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bb, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0104, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0106, code lost:
    
        r9 = MCOFeQ.WqusdZ.wQp;
        r10 = r9 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        if (r10 == 5) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010f, code lost:
    
        if (r10 == 14) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011e, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp ^ 4688) % 75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0118, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r9 * 6) + r9) ^ 2678;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String MefsKW(java.util.Map<java.lang.String, java.lang.Object> r9, boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.MefsKW(java.util.Map, boolean, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r0 % 2) <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r0 = new java.lang.StringBuilder(RvP("B\u0004"));
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r1 >= (r6.length - 1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r2 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (bhhGTX(r6[r2]) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r1 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r0.append(RvP("\u001b\n\u001c"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r0.append(r6[r1]);
        r0.append(RvP("\u001b\u001c\u001c"));
        r0.append(r6[r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r1 = r1 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if ((MCOFeQ.WqusdZ.dwn ^ 4146) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r2 = MCOFeQ.WqusdZ.dwn;
        r3 = r2 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r3 == 33) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r3 == 45) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        MCOFeQ.WqusdZ.dwn = (r2 + r2) ^ 2353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r2 = MCOFeQ.WqusdZ.wQp;
        r3 = r2 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r3 == 98) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r3 == 246) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r3 == 435) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r2) * 4968;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r2 ^ 4637) % 68) % 98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp * 2522) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        MCOFeQ.WqusdZ.dwn = r2 * 93702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        r1 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        r0.append(RvP("\u001b["));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b4, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if ((r1 + 26) == 84) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r1 + r1) * 99) % 46;
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String MefsKW(java.lang.String... r6) {
        /*
            if (r6 == 0) goto Lb5
            int r0 = r6.length
            int r1 = MCOFeQ.WqusdZ.wQp
            r1 = r1 ^ 8268(0x204c, float:1.1586E-41)
            if (r1 == 0) goto L19
        L9:
            int r1 = MCOFeQ.WqusdZ.wQp
            int r2 = r1 + 26
            r3 = 84
            if (r2 == r3) goto L12
            goto L9
        L12:
            int r1 = r1 + r1
            int r1 = r1 * 99
            int r1 = r1 % 46
            MCOFeQ.WqusdZ.wQp = r1
        L19:
            int r0 = r0 % 2
            if (r0 <= 0) goto L1f
            goto Lb5
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "B\u0004"
            java.lang.String r1 = RvP(r1)
            r0.<init>(r1)
            r1 = 0
        L2b:
            int r2 = r6.length
            int r2 = r2 + (-1)
            if (r1 >= r2) goto La7
            int r2 = r1 + 1
            r3 = r6[r2]
            boolean r3 = bhhGTX(r3)
            if (r3 == 0) goto L58
            if (r1 <= 0) goto L45
            java.lang.String r3 = "\u001b\n\u001c"
            java.lang.String r3 = RvP(r3)
            r0.append(r3)
        L45:
            r3 = r6[r1]
            r0.append(r3)
            java.lang.String r3 = "\u001b\u001c\u001c"
            java.lang.String r3 = RvP(r3)
            r0.append(r3)
            r2 = r6[r2]
            r0.append(r2)
        L58:
            int r1 = r1 + 2
            int r2 = MCOFeQ.WqusdZ.dwn
            r2 = r2 ^ 4146(0x1032, float:5.81E-42)
            if (r2 == 0) goto L2b
        L60:
            int r2 = MCOFeQ.WqusdZ.dwn
            int r3 = r2 + 78
            r4 = 33
            if (r3 == r4) goto La0
            r4 = 45
            if (r3 == r4) goto L6d
            goto L60
        L6d:
            int r2 = r2 + r2
            r2 = r2 ^ 2353(0x931, float:3.297E-42)
            MCOFeQ.WqusdZ.dwn = r2
            int r2 = MCOFeQ.WqusdZ.wQp
            r2 = r2 ^ 8268(0x204c, float:1.1586E-41)
            if (r2 == 0) goto L60
        L78:
            int r2 = MCOFeQ.WqusdZ.wQp
            int r3 = r2 + 91
            r4 = 98
            if (r3 == r4) goto L98
            r5 = 246(0xf6, float:3.45E-43)
            if (r3 == r5) goto L91
            r4 = 435(0x1b3, float:6.1E-43)
            if (r3 == r4) goto L89
            goto L78
        L89:
            int r6 = MCOFeQ.WqusdZ.wQp
            int r6 = r6 + r2
            int r6 = r6 * 4968
            MCOFeQ.WqusdZ.wQp = r6
            goto L89
        L91:
            r3 = r2 ^ 4637(0x121d, float:6.498E-42)
            int r3 = r3 % 68
            int r3 = r3 % r4
            MCOFeQ.WqusdZ.wQp = r3
        L98:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r3 = r3 * 2522
            int r3 = r3 + r2
            MCOFeQ.WqusdZ.wQp = r3
            goto L60
        La0:
            r3 = 93702(0x16e06, float:1.31304E-40)
            int r2 = r2 * r3
            MCOFeQ.WqusdZ.dwn = r2
            goto L2b
        La7:
            java.lang.String r6 = "\u001b["
            java.lang.String r6 = RvP(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        Lb5:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.MefsKW(java.lang.String[]):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String MwGcOg(String str) {
        if (jUDvml(str)) {
            return null;
        }
        if (NCRFOs.PdIzv().lEggzI()) {
            return NCRFOs.PdIzv().MwGcOg(str);
        }
        try {
            return URLEncoder.encode(str, RvP("lrx\u001d!"));
        } catch (UnsupportedEncodingException e) {
            GVinle.C0001GVinle.RgMIvb(KmzNXU, RvP("\u007fGW\\|M-~pm [Kamgcw\u007f"), (Throwable) e);
            TXfDQv.PdIzv().RWPiNO(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if ((r1 ^ 8268) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        MCOFeQ.WqusdZ.dwn = ((MCOFeQ.WqusdZ.dwn >> 109) % 48) * 60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp + 91) == 89) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp % 17) ^ 3138) * 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        r0 = MCOFeQ.WqusdZ.wQp;
        r1 = r0 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r1 == 82) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        if (r1 == 134) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r1 == 315) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        if (r1 == 382) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp + r0) + r0) % 95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r0 ^ 4501) * 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp + r0) % 59) * 54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp ^ 5217) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c0, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L85;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0047 -> B:17:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean NMfIUQ(@javax.annotation.Nullable java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.NMfIUQ(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r8 = MCOFeQ.WqusdZ.wQp;
        r9 = r8 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r9 == 9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r9 == 130) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp ^ 5357) >> 57) >> 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r8 * 93) % 124) % 111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r8 != 4) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc A[LOOP:2: B:36:0x00fc->B:46:0x00fc, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String NUbvYU(byte[] r18) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.NUbvYU(byte[]):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0126, code lost:
    
        MCOFeQ.WqusdZ.dwn *= 6664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r6 == 212) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r5 + r5) % 125) * 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r5) >> 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r3 = ((r3 + (r3 ^ r4)) + 51) % 63;
        MCOFeQ.WqusdZ.RRY[r4] = (char) r3;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (MCOFeQ.WqusdZ.dwn > 4145) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r8 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if ((r8 + 52) == 19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r8 % 15) ^ 4216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r5 = MCOFeQ.WqusdZ.dwn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if ((r5 + 39) == 54) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn ^ 1933) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        r8 = MCOFeQ.WqusdZ.wQp;
        r0 = r8 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r0 == 79) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r0 == 138) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r0 == 174) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r8 * 125) >> 25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r8) % 87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008f, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp >> 36) % 81) % 119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ae, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b0, code lost:
    
        r4 = MCOFeQ.WqusdZ.wQp;
        r5 = r4 + 156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
    
        if (r5 == 57) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ba, code lost:
    
        if (r5 == 99) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
    
        if (r5 == 128) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d2, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r4 >> 88) ^ 2946;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d2, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp ^ 3469) % 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r4 ^ 3617) * 79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d5, code lost:
    
        r0[r2] = (char) (r0[r2] + ((char) (r3[r2] ^ MCOFeQ.WqusdZ.RRY[r2])));
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
    
        if ((MCOFeQ.WqusdZ.dwn ^ 4146) == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r5 = MCOFeQ.WqusdZ.wQp;
        r6 = r5 + 169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ef, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f1, code lost:
    
        r4 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f7, code lost:
    
        if ((r4 + 91) == 64) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fa, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r4 >> 72) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ff, code lost:
    
        r4 = MCOFeQ.WqusdZ.dwn;
        r5 = r4 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0105, code lost:
    
        if (r5 == 65) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r6 == 33) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0109, code lost:
    
        if (r5 == 101) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010c, code lost:
    
        MCOFeQ.WqusdZ.dwn = r4 >> 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0114, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0116, code lost:
    
        r4 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011c, code lost:
    
        if ((r4 + 78) == 80) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011f, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r4 ^ 5146) + r4;
     */
    /* JADX WARN: Incorrect return type in method signature: ()V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String RvP(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.RvP(java.lang.String):java.lang.String");
    }

    private static byte TRKbeG(char c) throws IllegalArgumentException {
        switch (c) {
            case '0':
                return (byte) 0;
            case '1':
                return (byte) 1;
            case '2':
                return (byte) 2;
            case '3':
                return (byte) 3;
            case '4':
                return (byte) 4;
            case '5':
                return (byte) 5;
            case '6':
                return (byte) 6;
            case '7':
                return (byte) 7;
            case '8':
                return (byte) 8;
            case '9':
                return (byte) 9;
            default:
                switch (c) {
                    case 'A':
                        return (byte) 10;
                    case 'B':
                        return Ascii.VT;
                    case 'C':
                        return Ascii.FF;
                    case 'D':
                        return Ascii.CR;
                    case 'E':
                        return Ascii.SO;
                    case 'F':
                        return Ascii.SI;
                    default:
                        switch (c) {
                            case 'a':
                                return (byte) 10;
                            case 'b':
                                return Ascii.VT;
                            case 'c':
                                return Ascii.FF;
                            case 'd':
                                return Ascii.CR;
                            case 'e':
                                return Ascii.SO;
                            case 'f':
                                return Ascii.SI;
                            default:
                                throw new IllegalArgumentException(OperatorName.SHOW_TEXT_LINE_AND_SPACE + c + RvP("\u001b\u0006WC9Gb\u007f\"` HDnkg*q}ogyyx{|qc6v|rHkEkj_"));
                        }
                }
        }
    }

    @Nullable
    static byte[] ThFpNO(@Nullable String str) {
        MessageDigest messageDigest;
        byte[] digest;
        if (jUDvml(str) || (messageDigest = lGCWLs) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(str.getBytes());
            digest = messageDigest.digest();
            messageDigest.reset();
        }
        return digest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r4 <= 8267) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        r4 = MCOFeQ.WqusdZ.wQp;
        r1 = r4 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r1 == 34) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r1 == 62) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r1 == 191) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp * 33) >> 2) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp + r4) % 89) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r4 * 55) ^ 5106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        r4 = MCOFeQ.WqusdZ.dwn;
        r1 = r4 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r1 == 50) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r1 == 152) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008f, code lost:
    
        if (r1 == 168) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn * 115) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        MCOFeQ.WqusdZ.dwn = ((MCOFeQ.WqusdZ.dwn ^ 3881) % 71) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
    
        if (MCOFeQ.WqusdZ.wQp > 8267) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
    
        r4 = MCOFeQ.WqusdZ.wQp;
        r0 = r4 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r0 == 29) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        if (r0 == 125) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp >> 13) + r4) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00dd, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp % 73) >> 70) * 70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009a, code lost:
    
        r1 = (r4 * 21) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a3, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a9, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp + 182) == 86) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ac, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp % 85) >> 118) * 123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b7, code lost:
    
        MCOFeQ.WqusdZ.dwn = r1 >> 86;
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] VGRrjp(@javax.annotation.Nullable java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.VGRrjp(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if ((r9 ^ 8268) != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = MCOFeQ.WqusdZ.dwn;
        r11 = r10 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r11 == 57) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r11 == 211) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r11 == 330) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        r10 = r10 ^ 3275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (MCOFeQ.WqusdZ.wQp > 8267) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        r11 = MCOFeQ.WqusdZ.wQp;
        r0 = r11 + 156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r0 == 90) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (r0 == 247) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r11 ^ 4012) >> 88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r11 + r11) + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        MCOFeQ.WqusdZ.dwn = (r10 * 62) % 123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn ^ 5000) >> 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (MCOFeQ.WqusdZ.wQp > 8267) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r11 == 442) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
    
        MCOFeQ.WqusdZ.dwn = (r10 % 104) >> 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r10 = MCOFeQ.WqusdZ.wQp;
        r11 = r10 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008f, code lost:
    
        if (r11 == 67) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        if (r11 == 193) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0097, code lost:
    
        if (r11 == 196) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp * 56) >> 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009a, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r10 * 3) >> 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r10 >> 51) * 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn % 69) * 98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        if (MCOFeQ.WqusdZ.wQp > 8267) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
    
        r10 = MCOFeQ.WqusdZ.wQp;
        r11 = r10 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f0, code lost:
    
        if (r11 == 96) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f4, code lost:
    
        if (r11 == 115) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f8, code lost:
    
        if (r11 == 134) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0101, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 13) ^ 3788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0109, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r10) * 110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0068, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r10) * 110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fb, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r10 % 111) ^ 4680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int VGlFBC(long r10) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.VGlFBC(long):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean VJUtEx(@Nullable String str) {
        if (jUDvml(str)) {
            return true;
        }
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t' && charAt != '\n' && charAt != '\r') {
                return false;
            }
            i++;
            if ((wQp ^ 8268) != 0) {
                while (true) {
                    int i2 = wQp;
                    int i3 = i2 + 52;
                    if (i3 == 47) {
                        wQp = (i2 >> 62) >> 66;
                    } else if (i3 != 194) {
                    }
                    wQp = (wQp ^ 4596) * 25;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String VacJlC(@Nullable byte[] bArr) {
        String NUbvYU;
        if (bArr != null && bArr.length != 0) {
            if (NCRFOs.PdIzv().lEggzI()) {
                return NCRFOs.PdIzv().VacJlC(bArr);
            }
            MessageDigest messageDigest = dVhPuC;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] digest = messageDigest.digest();
                    messageDigest.reset();
                    NUbvYU = NUbvYU(digest);
                }
                return NUbvYU;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x010b, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x010d, code lost:
    
        r1 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0113, code lost:
    
        if ((r1 + 52) == 15) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0116, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r1 ^ 3809) * 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0120, code lost:
    
        if (r0.length() > r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0122, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0128, code lost:
    
        return r0.substring(0, r8);
     */
    @javax.annotation.Nonnull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String VuWYef(int r8) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.VuWYef(int):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean XONmSG(@Nullable String str) {
        return bhhGTX(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String XlNVdQ(String str, int i) {
        return (str == null || i < 0 || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r3 == 21) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r3 == 124) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 32) * 54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r2 % 68) * 36) ^ 4111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (MCOFeQ.WqusdZ.dwn > 4145) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r12 = MCOFeQ.WqusdZ.wQp;
        r13 = r12 + 156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r13 == 66) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r13 == 72) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r13 == 183) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (r13 == 217) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r12 ^ 3773) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp * 68) + r12) * 123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r12) ^ com.airbnb.paris.R2.style.Widget_AppCompat_ButtonBar;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r12 >> 114) + r12) >> 67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if ((MCOFeQ.WqusdZ.dwn + 130) == 8) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn ^ 5235) * 54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
    
        return r0.bCnhfB(r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0137, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x013a, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn >> 122) % 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0146, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r2 = MCOFeQ.WqusdZ.wQp;
        r3 = r2 + 52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String bCnhfB(@javax.annotation.Nullable java.lang.String r12, @javax.annotation.Nullable java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.bCnhfB(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nonnull
    public static String bbMlir() {
        GVinle.C0001GVinle.RzQaKl(KmzNXU, RvP("^CJDpGj+WTIz"));
        return VuWYef(32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r0 == 187) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r0 == 220) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r0 == 384) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp ^ 3109) + r2) >> 59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r0 = ((MCOFeQ.WqusdZ.wQp ^ 4713) % 20) ^ 4929;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        MCOFeQ.WqusdZ.wQp = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r0 = (r2 * 39) >> 50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        r0 = ((r2 + r2) * 123) >> 56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r2 = MCOFeQ.WqusdZ.dwn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if ((r2 + 26) == 33) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        MCOFeQ.WqusdZ.dwn = ((MCOFeQ.WqusdZ.dwn + r2) % 119) % 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (MCOFeQ.WqusdZ.wQp > 8267) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        r2 = MCOFeQ.WqusdZ.wQp;
        r0 = r2 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (r0 == 70) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r0 == 269) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r2 + r2) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp + r2) + r2) >> 50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0057, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp + 91) == 65) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005a, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp * 80) >> 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        r2 = MCOFeQ.WqusdZ.wQp;
        r0 = r2 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0 == 37) goto L47;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0046 -> B:16:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean bhhGTX(@javax.annotation.Nullable java.lang.String r2) {
        /*
            if (r2 == 0) goto L96
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L96
            int r2 = MCOFeQ.WqusdZ.dwn
            r0 = 4145(0x1031, float:5.808E-42)
            if (r2 > r0) goto L94
            int r2 = MCOFeQ.WqusdZ.wQp
            r2 = r2 ^ 8268(0x204c, float:1.1586E-41)
            if (r2 == 0) goto L49
        L14:
            int r2 = MCOFeQ.WqusdZ.wQp
            int r0 = r2 + 39
            r1 = 37
            if (r0 == r1) goto L2e
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 == r1) goto L3e
            r1 = 220(0xdc, float:3.08E-43)
            if (r0 == r1) goto L29
            r1 = 384(0x180, float:5.38E-43)
            if (r0 == r1) goto L35
            goto L14
        L29:
            int r0 = r2 * 39
            int r0 = r0 >> 50
            goto L46
        L2e:
            int r0 = r2 + r2
            int r0 = r0 * 123
            int r0 = r0 >> 56
            goto L46
        L35:
            int r0 = MCOFeQ.WqusdZ.wQp
            r0 = r0 ^ 3109(0xc25, float:4.357E-42)
            int r0 = r0 + r2
            int r0 = r0 >> 59
            MCOFeQ.WqusdZ.wQp = r0
        L3e:
            int r0 = MCOFeQ.WqusdZ.wQp
            r0 = r0 ^ 4713(0x1269, float:6.604E-42)
            int r0 = r0 % 20
            r0 = r0 ^ 4929(0x1341, float:6.907E-42)
        L46:
            MCOFeQ.WqusdZ.wQp = r0
            goto L35
        L49:
            int r2 = MCOFeQ.WqusdZ.dwn
            int r0 = MCOFeQ.WqusdZ.wQp
            r0 = r0 ^ 8268(0x204c, float:1.1586E-41)
            if (r0 == 0) goto L63
        L51:
            int r2 = MCOFeQ.WqusdZ.wQp
            int r2 = r2 + 91
            r0 = 65
            if (r2 == r0) goto L5a
            goto L51
        L5a:
            int r2 = MCOFeQ.WqusdZ.wQp
            int r2 = r2 * 80
            int r2 = r2 >> 64
            MCOFeQ.WqusdZ.wQp = r2
            goto L5a
        L63:
            int r0 = r2 + 26
            r1 = 33
            if (r0 == r1) goto L6a
            goto L49
        L6a:
            int r0 = MCOFeQ.WqusdZ.dwn
            int r0 = r0 + r2
            int r0 = r0 % 119
            int r0 = r0 % 23
            MCOFeQ.WqusdZ.dwn = r0
            int r0 = MCOFeQ.WqusdZ.wQp
            r1 = 8267(0x204b, float:1.1585E-41)
            if (r0 > r1) goto L6a
        L79:
            int r2 = MCOFeQ.WqusdZ.wQp
            int r0 = r2 + 52
            r1 = 70
            if (r0 == r1) goto L8b
            r1 = 269(0x10d, float:3.77E-43)
            if (r0 == r1) goto L86
            goto L79
        L86:
            int r0 = r2 + r2
            int r0 = r0 + r2
            MCOFeQ.WqusdZ.wQp = r0
        L8b:
            int r0 = MCOFeQ.WqusdZ.wQp
            int r0 = r0 + r2
            int r0 = r0 + r2
            int r2 = r0 >> 50
            MCOFeQ.WqusdZ.wQp = r2
            goto L79
        L94:
            r2 = 1
            return r2
        L96:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.bhhGTX(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0125, code lost:
    
        r0 = r6 + r6;
        r3 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0129, code lost:
    
        if (r3 > 8267) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0131, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp + 195) == 89) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0134, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 20) ^ 3784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x013d, code lost:
    
        MCOFeQ.WqusdZ.dwn = (r0 * 25) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r3 == 106) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0144, code lost:
    
        if ((r3 ^ 8268) == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0146, code lost:
    
        r6 = MCOFeQ.WqusdZ.wQp;
        r0 = r6 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x014c, code lost:
    
        if (r0 == 72) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0150, code lost:
    
        if (r0 == 228) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0154, code lost:
    
        if (r0 == 330) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0158, code lost:
    
        if (r0 == 484) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x015b, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r6 + r6) + r6) ^ com.airbnb.paris.R2.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0163, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp ^ 4923) >> 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016c, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r6 * 11) >> 92) ^ 2496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0174, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp ^ 4010) >> 92) ^ 5286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r3 == 125) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x017e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x017f, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn + r6) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0186, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp % 1) + r0) >> 51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp >> 73) ^ 3548) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r0 >> 30) >> 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp >> 77) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r0 = RvP("\t\u0014\u0004\u0000)\u0013=;810\u0004\u0015283:").equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r3 = MCOFeQ.WqusdZ.wQp;
        r4 = r3 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r4 == 59) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r4 == 165) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp >> 58) + r3) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r3 >> 14) * 57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r0 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        r0 = MCOFeQ.WqusdZ.jDvHvX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (MCOFeQ.WqusdZ.dwn > 4145) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp + 65) == 68) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp % 13) >> 39) * 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        r6 = MCOFeQ.WqusdZ.dwn;
        r0 = r6 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
    
        if (r0 == 8) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        if (r0 == 71) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        MCOFeQ.WqusdZ.dwn = ((r6 % 61) + r6) >> 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
    
        if (MCOFeQ.WqusdZ.wQp > 8267) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn * 17) % 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r6 = MCOFeQ.WqusdZ.wQp;
        r0 = r6 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r0 = MCOFeQ.WqusdZ.wQp;
        r3 = r0 + 182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        if (r0 == 98) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r6 + r6) ^ com.airbnb.paris.R2.styleable.ActionBar_popupTheme) * 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c2, code lost:
    
        if (r0 == 291) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c6, code lost:
    
        if (r0 == 373) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r3 == 73) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ca, code lost:
    
        if (r0 == 417) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cd, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp >> 30) * 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp >> 23) % 84) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d6, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r6) >> 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00dd, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp >> 23) % 84) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f7, code lost:
    
        if (r0.matcher(r6).find() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0103, code lost:
    
        if (MCOFeQ.WqusdZ.TgVMtB.matcher(r6).find() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0109, code lost:
    
        if ((MCOFeQ.WqusdZ.dwn ^ 4146) == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3 == 80) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010b, code lost:
    
        r6 = MCOFeQ.WqusdZ.dwn;
        r0 = r6 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0111, code lost:
    
        if (r0 == 46) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0115, code lost:
    
        if (r0 == 201) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0119, code lost:
    
        if (r0 == 322) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011c, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn ^ 3848) >> 26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean bqNQOG(@javax.annotation.Nullable java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.bqNQOG(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nonnull
    public static byte[] dWwFCf(@Nonnull String str) throws IllegalArgumentException {
        int i;
        int length = str.length() / 2;
        if (length * 2 != str.length()) {
            throw new IllegalArgumentException(OperatorName.SHOW_TEXT_LINE_AND_SPACE + str + RvP("\u001b\u0006VQj\tle\"ndZ\u0005lwnh|j7a{<xzpbnuaqaI"));
        }
        byte[] bArr = new byte[length];
        int i2 = 0;
        loop0: while (i2 < length) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (TRKbeG(str.charAt(i3 + 1)) | (TRKbeG(str.charAt(i3)) << 4));
            i2++;
            if (dwn <= 4145) {
                while (true) {
                    i = dwn;
                    int i4 = i + 39;
                    if (i4 == 71) {
                        dwn = (i % 81) * 14;
                        if (wQp <= 8267) {
                            while (true) {
                                int i5 = wQp;
                                int i6 = i5 + 39;
                                if (i6 == 14) {
                                    break;
                                }
                                if (i6 == 132) {
                                    while (true) {
                                        wQp = (wQp ^ 1717) + i5 + i5;
                                    }
                                } else if (i6 != 262) {
                                    if (i6 == 314) {
                                        wQp = (i5 % 72) + i5 + i5;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            wQp = ((wQp * 103) >> 64) % 36;
                            while (true) {
                                wQp = (wQp % 63) ^ R2.style.Theme_AppCompat_Light_Dialog;
                            }
                        }
                    } else if (i4 != 254) {
                        if (i4 == 371) {
                            dwn = (i * 43) ^ 4745;
                            break loop0;
                        }
                    } else {
                        break loop0;
                    }
                }
                do {
                    dwn = (dwn + i) % 31;
                } while ((wQp ^ 8268) == 0);
                while (true) {
                    int i7 = wQp;
                    int i8 = i7 + 78;
                    if (i8 == 90) {
                        wQp = (i7 ^ 4991) >> 95;
                    } else if (i8 == 253) {
                        while (true) {
                            wQp = (wQp ^ 5105) % 122;
                        }
                    } else if (i8 == 263) {
                        while (true) {
                            wQp = (wQp ^ 3462) * 102;
                        }
                    }
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nonnull
    public static String dwSHvw(@Nonnull List<String> list, @Nonnull String str) {
        return dwSHvw(list, str, false);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @javax.annotation.Nonnull
    static java.lang.String dwSHvw(@javax.annotation.Nonnull java.util.List<java.lang.String> r3, @javax.annotation.Nonnull java.lang.String r4, boolean r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L27
            int r2 = r0.length()
            if (r2 <= 0) goto L24
            r0.append(r4)
        L24:
            r0.append(r1)
        L27:
            int r1 = MCOFeQ.WqusdZ.dwn
            r2 = 4145(0x1031, float:5.808E-42)
            if (r1 > r2) goto L9
            int r3 = MCOFeQ.WqusdZ.wQp
            r3 = r3 ^ 8268(0x204c, float:1.1586E-41)
            if (r3 == 0) goto L6d
        L33:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r4 = r3 + 65
            r5 = 55
            if (r4 == r5) goto L52
            r5 = 192(0xc0, float:2.69E-43)
            if (r4 == r5) goto L48
            r3 = 299(0x12b, float:4.19E-43)
            if (r4 == r3) goto L64
            r3 = 371(0x173, float:5.2E-43)
            if (r4 == r3) goto L5a
            goto L33
        L48:
            int r4 = MCOFeQ.WqusdZ.wQp
            r4 = r4 ^ 5116(0x13fc, float:7.169E-42)
            int r4 = r4 >> 67
            int r4 = r4 + r3
            MCOFeQ.WqusdZ.wQp = r4
            goto L48
        L52:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r3 = r3 * 95
            int r3 = r3 >> 101
            MCOFeQ.WqusdZ.wQp = r3
        L5a:
            int r3 = MCOFeQ.WqusdZ.wQp
            r3 = r3 ^ 2567(0xa07, float:3.597E-42)
            int r3 = r3 % 8
            int r3 = r3 * 11
            MCOFeQ.WqusdZ.wQp = r3
        L64:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r3 = r3 * 83
            r3 = r3 ^ 3680(0xe60, float:5.157E-42)
            MCOFeQ.WqusdZ.wQp = r3
            goto L52
        L6d:
            int r3 = MCOFeQ.WqusdZ.dwn
            int r4 = r3 + 52
            r5 = 78
            if (r4 == r5) goto L76
            goto L6d
        L76:
            int r4 = r3 * 62
            r4 = r4 ^ 1194(0x4aa, float:1.673E-42)
            int r4 = r4 + r3
            MCOFeQ.WqusdZ.dwn = r4
            goto L6d
        L7e:
            if (r5 == 0) goto L89
            int r3 = r0.length()
            if (r3 <= 0) goto L89
            r0.append(r4)
        L89:
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.dwSHvw(java.util.List, java.lang.String, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r3 = MCOFeQ.WqusdZ.wQp;
        r0 = r3 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r0 == 67) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0 == 123) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 89) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 83) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r1 = MCOFeQ.WqusdZ.dwn;
        r3 = r1 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r3 == 62) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r3 == 136) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r3 == 331) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn % 123) * 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r3 = MCOFeQ.WqusdZ.wQp;
        r1 = r3 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r1 == 62) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r1 == 78) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r1 == 209) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp ^ 1009) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r3) ^ 5478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r3 * 31) % 6) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn ^ 6687) * 123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        MCOFeQ.WqusdZ.dwn = ((MCOFeQ.WqusdZ.dwn + r1) >> 26) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ac, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        r3 = MCOFeQ.WqusdZ.wQp;
        r4 = r3 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b4, code lost:
    
        if (r4 == 46) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b8, code lost:
    
        if (r4 == 52) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
    
        if (r4 == 120) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cc, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp + r3) >> 3) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c6, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r3 % 66) % 87) >> 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cf, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r3 >> 5) + r3;
     */
    @javax.annotation.Nonnull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> fReZK(@javax.annotation.Nonnull java.lang.String r3, @javax.annotation.Nonnull java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.fReZK(java.lang.String, java.lang.String):java.util.List");
    }

    @Nonnull
    static List<URI> getUriFromString(@Nonnull List<String> list) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                URI uri = new URI(it.next());
                if (uri.getScheme() != null) {
                    arrayList.add(uri);
                } else {
                    GVinle.C0001GVinle.RzQaKl(KmzNXU, RvP("\u007fGW\\|M-\u007fm!g[Q\"wqf9ktfxq~2wb`{/4") + uri);
                }
            } catch (URISyntaxException e) {
                GVinle.C0001GVinle.RgMIvb(KmzNXU, RvP("TGRVv[`nf!cV@ai#\u007fkt"), (Throwable) e);
                TXfDQv.PdIzv().RWPiNO(e);
            }
            if (dwn <= 4145) {
                do {
                    i = dwn;
                    i2 = i + 65;
                    if (i2 == 43) {
                        dwn = i + i + i;
                    } else if (i2 != 167) {
                        if (i2 == 273) {
                            while (true) {
                                dwn = (dwn ^ R2.style.Theme_AppCompat_Dialog_MinWidth) * 107;
                            }
                        }
                    }
                    while (true) {
                        dwn = ((dwn ^ 1812) + i) % 85;
                        if ((wQp ^ 8268) != 0) {
                            while (true) {
                                i3 = wQp;
                                int i4 = i3 + 104;
                                if (i4 == 44) {
                                    wQp = (i3 >> 14) * 33;
                                } else {
                                    if (i4 == 51) {
                                        wQp = (i3 % 55) % 72;
                                        break;
                                    }
                                    if (i4 == 71) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        wQp = ((wQp + i3) % 96) + i3;
                    }
                } while (i2 != 294);
                dwn = (i >> 103) ^ R2.styleable.AppCompatTheme_dropDownListViewStyle;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean jUDvml(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        if ((wQp ^ 8268) == 0) {
            return true;
        }
        do {
        } while (wQp + 39 != 77);
        while (true) {
            wQp = ((wQp * 95) % 105) >> 107;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String jhfahj(String str) {
        return str != null ? str.toLowerCase(Locale.US) : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int jmPeHT(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (wQp > 8267) {
            int i2 = 0;
            while (i < length) {
                i2 += bytes[i];
                i++;
                if (wQp <= 8267) {
                    while (true) {
                        int i3 = wQp;
                        int i4 = i3 + 52;
                        if (i4 != 12) {
                            if (i4 == 157) {
                                wQp = (i3 + i3) ^ 5038;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        wQp *= 2346;
                    }
                }
            }
            return i2;
        }
        while (true) {
            int i5 = wQp;
            int i6 = i5 + 26;
            if (i6 == 44) {
                break;
            }
            if (i6 == 219) {
                break;
            }
            if (i6 == 234) {
                while (true) {
                    wQp = (wQp >> 5) % 39;
                }
            } else if (i6 == 411) {
                wQp = (i5 * 111) ^ R2.style.Theme_AppCompat_Light_DarkActionBar;
                break;
            }
        }
        wQp ^= R2.style.Base_Widget_AppCompat_CompoundButton_RadioButton;
        while (true) {
            wQp = (wQp * 7) ^ 2997;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r5 = MCOFeQ.WqusdZ.dwn;
        r0 = r5 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r0 == 97) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r0 == 180) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn * 105) >> 67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        MCOFeQ.WqusdZ.dwn = ((r5 + r5) * 111) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r5 = MCOFeQ.WqusdZ.wQp;
        r0 = r5 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r0 == 83) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r0 == 127) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r0 == 282) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (r0 == 440) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 11) * 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        r5 = (MCOFeQ.WqusdZ.wQp ^ 1709) >> 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        MCOFeQ.WqusdZ.wQp = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 11) * 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0078, code lost:
    
        MCOFeQ.WqusdZ.wQp *= com.airbnb.paris.R2.styleable.AppCompatTheme_alertDialogCenterButtons;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
    
        r5 = (r5 % 78) * 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        r5 = MCOFeQ.WqusdZ.wQp;
        r0 = r5 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        if (r0 == 34) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r0 == 154) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r5 >> 85) % 71) * 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b9, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp + r5) * 50) + r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b0 -> B:14:0x0049). Please report as a decompilation issue!!! */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String jteltz(@javax.annotation.Nullable java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.jteltz(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (MCOFeQ.WqusdZ.wQp <= 8267) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r6 = MCOFeQ.WqusdZ.wQp;
        r0 = r6 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r0 == 19) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r0 == 132) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r6 * 64) % 51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp + r6) + r6) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r6 = MCOFeQ.WqusdZ.dwn;
        r0 = r6 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r0 == 50) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r0 == 153) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r0 == 161) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        MCOFeQ.WqusdZ.dwn = (r6 * 68) >> 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        MCOFeQ.WqusdZ.dwn *= 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        r6 = MCOFeQ.WqusdZ.wQp;
        r0 = r6 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        if (r0 == 8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if (r0 == 105) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp >> 21) >> 77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r6 ^ 3128) * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn % 113) * 6901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b3, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        r6 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bb, code lost:
    
        if ((r6 + 117) == 39) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00be, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r6 + r6) >> 111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String sanitizeSessionIdIgnoreCase(@javax.annotation.Nonnull java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.sanitizeSessionIdIgnoreCase(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r1 == 419) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r1 == 554) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        MCOFeQ.WqusdZ.wQp = r0 ^ com.airbnb.paris.R2.drawable.abc_text_select_handle_left_mtrl_dark;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r0) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r0 * 101) % 101) >> 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp + r0) % 38) ^ 1958;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r5.put(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r0 = MCOFeQ.WqusdZ.wQp;
        r1 = r0 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1 == 56) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r1 == 232) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void validateAndPutInMap(java.lang.String r3, java.lang.String r4, @javax.annotation.Nonnull java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            boolean r0 = bhhGTX(r3)
            if (r0 == 0) goto L42
            int r0 = MCOFeQ.WqusdZ.wQp
            r0 = r0 ^ 8268(0x204c, float:1.1586E-41)
            if (r0 == 0) goto L3f
        Lc:
            int r0 = MCOFeQ.WqusdZ.wQp
            int r1 = r0 + 26
            r2 = 56
            if (r1 == r2) goto L35
            r2 = 232(0xe8, float:3.25E-43)
            if (r1 == r2) goto L2c
            r2 = 419(0x1a3, float:5.87E-43)
            if (r1 == r2) goto L25
            r2 = 554(0x22a, float:7.76E-43)
            if (r1 == r2) goto L21
            goto Lc
        L21:
            r1 = r0 ^ 585(0x249, float:8.2E-43)
            MCOFeQ.WqusdZ.wQp = r1
        L25:
            int r1 = MCOFeQ.WqusdZ.wQp
            int r1 = r1 + r0
            int r1 = r1 + r0
            MCOFeQ.WqusdZ.wQp = r1
            goto L3f
        L2c:
            int r0 = r0 * 101
            int r0 = r0 % 101
            int r0 = r0 >> 2
            MCOFeQ.WqusdZ.wQp = r0
            goto L3f
        L35:
            int r3 = MCOFeQ.WqusdZ.wQp
            int r3 = r3 + r0
            int r3 = r3 % 38
            r3 = r3 ^ 1958(0x7a6, float:2.744E-42)
            MCOFeQ.WqusdZ.wQp = r3
            goto L35
        L3f:
            r5.put(r4, r3)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.validateAndPutInMap(java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f5, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((MCOFeQ.WqusdZ.wQp ^ 5302) + r0) % 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f7, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r0 % 115) ^ 1910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r1 ^ 2693) % 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r1 = MCOFeQ.WqusdZ.dwn;
        r2 = r1 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r2 == 59) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r2 == 124) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r2 == 297) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        MCOFeQ.WqusdZ.dwn = (MCOFeQ.WqusdZ.dwn % 102) * 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        r5 = MCOFeQ.WqusdZ.wQp;
        r0 = r5 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r0 == 49) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r0 == 69) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r0 == 82) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r5) % 93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r5 * com.airbnb.paris.R2.styleable.MenuItem_android_id) >> 126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        MCOFeQ.WqusdZ.wQp ^= 8076;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        r2 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003a, code lost:
    
        if ((r2 ^ 8268) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x003c, code lost:
    
        r5 = MCOFeQ.WqusdZ.wQp;
        r0 = r5 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
    
        if (r0 == 51) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0046, code lost:
    
        if (r0 == 108) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004c, code lost:
    
        if (r0 == 110) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004e, code lost:
    
        if (r0 == 117) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0051, code lost:
    
        MCOFeQ.WqusdZ.wQp = ((r5 * 8) ^ 2622) % 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006c, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp % 20) % 123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006c, code lost:
    
        MCOFeQ.WqusdZ.wQp *= com.airbnb.paris.R2.styleable.MenuGroup_android_menuCategory;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005a, code lost:
    
        MCOFeQ.WqusdZ.wQp = (MCOFeQ.WqusdZ.wQp + r5) * 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006f, code lost:
    
        MCOFeQ.WqusdZ.dwn = (r1 ^ 3086) * 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0077, code lost:
    
        if ((r2 ^ 8268) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0079, code lost:
    
        r1 = MCOFeQ.WqusdZ.wQp;
        r2 = r1 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x007f, code lost:
    
        if (r2 == 85) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008c, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r1 % 106) ^ 2336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0083, code lost:
    
        if (r2 == 144) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0086, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r1 >> 25) % 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c6, code lost:
    
        r5 = MCOFeQ.WqusdZ.dwn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cc, code lost:
    
        if ((MCOFeQ.WqusdZ.wQp ^ 8268) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        r1 = MCOFeQ.WqusdZ.wQp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ff, code lost:
    
        MCOFeQ.WqusdZ.dwn = (r5 * com.airbnb.paris.R2.id.accessibility_custom_action_24) >> 45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ce, code lost:
    
        r0 = MCOFeQ.WqusdZ.wQp;
        r5 = r0 + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d4, code lost:
    
        if (r5 == 68) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d8, code lost:
    
        if (r5 == 152) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00dc, code lost:
    
        if (r5 == 220) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e0, code lost:
    
        if (r5 == 409) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r1 + 52) == 39) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e3, code lost:
    
        MCOFeQ.WqusdZ.wQp = (r0 % 15) % 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ea, code lost:
    
        MCOFeQ.WqusdZ.wQp *= 6784;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean validateSHA256(@javax.annotation.Nullable java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.WqusdZ.validateSHA256(java.lang.String):boolean");
    }
}
