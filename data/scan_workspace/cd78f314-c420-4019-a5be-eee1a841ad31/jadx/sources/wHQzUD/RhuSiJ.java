package wHQzUD;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import wHQzUD.LcDBfR;

/* loaded from: classes10.dex */
class RhuSiJ extends SSLSocketFactory {
    private static String KmzNXU = null;
    public static int Tfr = 0;
    public static int Vci = 9874;
    private SSLSocketFactory XvBqpx;

    static {
        LcDBfR.dIf = 6784;
        Tfr = 8793;
        LcDBfR.dwn = 4146;
        if (Vci > 9873) {
            KmzNXU = LcDBfR.MGbMwZ(RhuSiJ.class);
            return;
        }
        do {
        } while (Vci + 13 != 77);
        while (true) {
            Vci = (Vci >> 103) ^ 3208;
        }
    }

    public RhuSiJ() {
        try {
            SSLContext sSLContext = SSLContext.getInstance(LcDBfR.RvP("mjm"));
            sSLContext.init(null, null, null);
            this.XvBqpx = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            LcDBfR.GVinle.RgMIvb(KmzNXU, LcDBfR.RvP("j_MD|D-ccr PJ\"VOY"));
        }
    }

    @Nullable
    private Socket dQNXCm(@Nullable Socket socket) {
        if (socket instanceof SSLSocket) {
            try {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{LcDBfR.RvP("mjmF(\u0007?")});
                return socket;
            } catch (IllegalArgumentException unused) {
                LcDBfR.GVinle.KpugJ(KmzNXU, LcDBfR.RvP("mjmF(\u0007<'\"ULmS3,1*xjr.sso2be\u007ffzfg_n"));
            }
        }
        return socket;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r4 = wHQzUD.RhuSiJ.Vci;
        r5 = r4 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r5 == 99) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 == 231) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r5 == 368) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        wHQzUD.RhuSiJ.Vci = (r4 % 55) >> 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((r4 * 99) >> 78) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        r4 = (r3 % 61) + r3;
        r3 = wHQzUD.RhuSiJ.Vci;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r3 > 9873) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        wHQzUD.RhuSiJ.Tfr = r4 >> 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r3 > 9873) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        r5 = wHQzUD.RhuSiJ.Vci;
        r3 = r5 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        if (r3 == 13) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        if (r3 == 114) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((r5 >> 81) + r5) >> 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005d, code lost:
    
        wHQzUD.RhuSiJ.Vci = (wHQzUD.RhuSiJ.Vci % 11) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (wHQzUD.RhuSiJ.Vci <= 9873) goto L12;
     */
    @Override // javax.net.SocketFactory
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.net.Socket createSocket(java.lang.String r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            javax.net.ssl.SSLSocketFactory r0 = r3.XvBqpx
            int r1 = wHQzUD.RhuSiJ.Tfr
            r2 = 8792(0x2258, float:1.232E-41)
            if (r1 > r2) goto L7f
            int r3 = wHQzUD.RhuSiJ.Vci
            r1 = 9873(0x2691, float:1.3835E-41)
            if (r3 > r1) goto Lf
            goto L6b
        Lf:
            int r3 = wHQzUD.RhuSiJ.Tfr
            int r4 = r3 + 13
            r5 = 93
            if (r4 == r5) goto L18
            goto Lf
        L18:
            int r4 = wHQzUD.RhuSiJ.Vci
            if (r4 > r1) goto L41
        L1c:
            int r4 = wHQzUD.RhuSiJ.Vci
            int r5 = r4 + 52
            r0 = 99
            if (r5 == r0) goto L3a
            r0 = 231(0xe7, float:3.24E-43)
            if (r5 == r0) goto L2d
            r0 = 368(0x170, float:5.16E-43)
            if (r5 == r0) goto L32
            goto L1c
        L2d:
            int r3 = r4 % 55
            int r3 = r3 >> 1
            goto L37
        L32:
            int r3 = wHQzUD.RhuSiJ.Vci
            int r3 = r3 * 112
            int r3 = r3 + r4
        L37:
            wHQzUD.RhuSiJ.Vci = r3
            goto L32
        L3a:
            int r5 = r4 * 99
            int r5 = r5 >> 78
            int r5 = r5 + r4
            wHQzUD.RhuSiJ.Vci = r5
        L41:
            int r4 = r3 % 61
            int r4 = r4 + r3
            int r3 = wHQzUD.RhuSiJ.Vci
            if (r3 > r1) goto L65
        L48:
            int r5 = wHQzUD.RhuSiJ.Vci
            int r3 = r5 + 65
            r4 = 13
            if (r3 == r4) goto L5d
            r4 = 114(0x72, float:1.6E-43)
            if (r3 == r4) goto L55
            goto L48
        L55:
            int r3 = r5 >> 81
            int r3 = r3 + r5
            int r3 = r3 >> 125
            wHQzUD.RhuSiJ.Vci = r3
            goto L48
        L5d:
            int r3 = wHQzUD.RhuSiJ.Vci
            int r3 = r3 % 11
            int r3 = r3 + r5
            wHQzUD.RhuSiJ.Vci = r3
            goto L5d
        L65:
            int r4 = r4 >> 66
            wHQzUD.RhuSiJ.Tfr = r4
            if (r3 > r1) goto Lf
        L6b:
            int r3 = wHQzUD.RhuSiJ.Vci
            int r3 = r3 + 26
            r4 = 97
            if (r3 == r4) goto L74
            goto L6b
        L74:
            int r3 = wHQzUD.RhuSiJ.Vci
            int r3 = r3 >> 92
            int r3 = r3 % 65
            int r3 = r3 * 19
            wHQzUD.RhuSiJ.Vci = r3
            goto L74
        L7f:
            java.net.Socket r4 = r0.createSocket(r4, r5)
            java.net.Socket r3 = r3.dQNXCm(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wHQzUD.RhuSiJ.createSocket(java.lang.String, int):java.net.Socket");
    }

    @Override // javax.net.SocketFactory
    @Nullable
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        SSLSocketFactory sSLSocketFactory = this.XvBqpx;
        if (Tfr <= 8792) {
            if ((Vci ^ 9874) != 0) {
                while (true) {
                    int i6 = Vci;
                    int i7 = i6 + 26;
                    if (i7 == 71) {
                        Vci = ((i6 >> 73) + i6) ^ 4311;
                    } else {
                        if (i7 == 186) {
                            Vci = ((i6 + i6) % 116) * 81;
                            break;
                        }
                        if (i7 == 201) {
                            while (true) {
                                Vci = (Vci * 72) ^ 2956;
                            }
                        }
                    }
                }
            }
            do {
                int i8 = Tfr;
                i3 = i8 + 13;
                if (i3 != 20) {
                    if (i3 == 27) {
                        int i9 = i8 >> 20;
                        if ((Vci ^ 9874) == 0) {
                            Tfr = (i9 % 94) * 32;
                        }
                        do {
                        } while (Vci + 91 != 5);
                        while (true) {
                            Vci = ((Vci >> 54) % 25) >> 74;
                        }
                    } else if (i3 != 124) {
                    }
                    do {
                        Tfr = (Tfr >> 56) % 23;
                    } while ((Vci ^ 9874) == 0);
                    do {
                        i4 = Vci;
                    } while (i4 + 65 != 26);
                    while (true) {
                        Vci = ((Vci * 126) + i4) ^ 2268;
                    }
                } else {
                    Tfr = ((i8 % 76) * 73) ^ 3848;
                    if (Vci <= 9873) {
                        while (true) {
                            int i10 = Vci;
                            int i11 = i10 + 13;
                            if (i11 == 76) {
                                break;
                            }
                            if (i11 == 154) {
                                Vci = ((i10 * 85) % 103) * 15;
                            }
                        }
                        while (true) {
                            Vci ^= 2952;
                        }
                    }
                }
            } while (i3 != 322);
            while (true) {
                Tfr = (Tfr % 83) % 14;
                if (Vci <= 9873) {
                    do {
                        int i12 = Vci;
                        i5 = i12 + 78;
                        if (i5 == 46) {
                            while (true) {
                                Vci = (Vci ^ 6070) >> 102;
                            }
                        } else if (i5 == 60) {
                            Vci = i12 * 136;
                        }
                    } while (i5 != 253);
                    while (true) {
                        Vci = ((Vci >> 72) % 51) ^ 4593;
                    }
                }
            }
        }
        return dQNXCm(sSLSocketFactory.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    @Nullable
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return dQNXCm(this.XvBqpx.createSocket(inetAddress, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0103, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((wHQzUD.RhuSiJ.Vci + r1) + r1) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0103, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((wHQzUD.RhuSiJ.Vci * 27) + r1) >> 95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f0, code lost:
    
        wHQzUD.RhuSiJ.Vci = (r1 + r1) ^ 3189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r4 == 204) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0140, code lost:
    
        return dQNXCm(r0.createSocket(r9, r10, r11, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((wHQzUD.RhuSiJ.Vci >> 48) * 67) ^ 3912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((wHQzUD.RhuSiJ.Vci >> 35) ^ 2857) * 67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        wHQzUD.RhuSiJ.Vci = (r1 + r1) >> 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        wHQzUD.RhuSiJ.Vci = (r1 ^ 3801) >> 50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (wHQzUD.RhuSiJ.Tfr > 8792) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if ((wHQzUD.RhuSiJ.Vci ^ 9874) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if ((wHQzUD.RhuSiJ.Vci + 26) == 20) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if ((wHQzUD.RhuSiJ.Vci ^ 9874) != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        wHQzUD.RhuSiJ.Vci *= 9408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r1 = wHQzUD.RhuSiJ.Tfr;
        r5 = r1 + 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r5 == 96) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r5 == 213) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0068, code lost:
    
        if (r5 == 312) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r1 = wHQzUD.RhuSiJ.Vci;
        r4 = r1 + 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
    
        r8 = wHQzUD.RhuSiJ.Tfr >> 93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (wHQzUD.RhuSiJ.Vci > 9873) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        r9 = wHQzUD.RhuSiJ.Vci;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
    
        if ((r9 + 104) == 23) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        wHQzUD.RhuSiJ.Vci = (r9 * 7380) ^ 3848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        wHQzUD.RhuSiJ.Tfr = (r8 % 54) >> 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008a, code lost:
    
        if (wHQzUD.RhuSiJ.Vci > 9873) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4 == 74) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        r8 = wHQzUD.RhuSiJ.Vci;
        r9 = r8 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
    
        if (r9 == 24) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        if (r9 == 35) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0098, code lost:
    
        if (r9 == 146) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        if (r9 == 165) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b0, code lost:
    
        wHQzUD.RhuSiJ.Vci = (wHQzUD.RhuSiJ.Vci ^ 3296) % 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((wHQzUD.RhuSiJ.Vci >> 116) % 89) % 60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a9, code lost:
    
        wHQzUD.RhuSiJ.Vci = (wHQzUD.RhuSiJ.Vci + r8) % 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b0, code lost:
    
        wHQzUD.RhuSiJ.Vci = (wHQzUD.RhuSiJ.Vci ^ 3296) % 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b8, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((wHQzUD.RhuSiJ.Vci ^ 1723) * 101) >> 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r4 == 119) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0106, code lost:
    
        wHQzUD.RhuSiJ.Tfr = (wHQzUD.RhuSiJ.Tfr * 20) ^ 4211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        if ((wHQzUD.RhuSiJ.Vci ^ 9874) == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
    
        r8 = wHQzUD.RhuSiJ.Vci;
        r9 = r8 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0119, code lost:
    
        if (r9 == 49) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011d, code lost:
    
        if (r9 == 53) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0121, code lost:
    
        if (r9 == 207) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        r8 = ((wHQzUD.RhuSiJ.Vci * 84) % 30) >> 103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0135, code lost:
    
        wHQzUD.RhuSiJ.Vci = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0124, code lost:
    
        r8 = ((r8 ^ 5245) + r8) >> 36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012a, code lost:
    
        r8 = (r8 + r8) * 74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c3, code lost:
    
        wHQzUD.RhuSiJ.Tfr = ((r1 >> 48) * 60) % 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ce, code lost:
    
        if ((wHQzUD.RhuSiJ.Vci ^ 9874) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r4 == 157) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d0, code lost:
    
        r1 = wHQzUD.RhuSiJ.Vci;
        r8 = r1 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d6, code lost:
    
        if (r8 == 71) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00da, code lost:
    
        if (r8 == 110) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00de, code lost:
    
        if (r8 == 214) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e2, code lost:
    
        if (r8 == 248) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e5, code lost:
    
        wHQzUD.RhuSiJ.Vci = ((wHQzUD.RhuSiJ.Vci * 46) % 14) % 60;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0135 -> B:55:0x012d). Please report as a decompilation issue!!! */
    @Override // javax.net.SocketFactory
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.net.Socket createSocket(java.net.InetAddress r9, int r10, java.net.InetAddress r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wHQzUD.RhuSiJ.createSocket(java.net.InetAddress, int, java.net.InetAddress, int):java.net.Socket");
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @Nullable
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        int i2;
        SSLSocketFactory sSLSocketFactory = this.XvBqpx;
        if ((Vci ^ 9874) != 0) {
            while (true) {
                i2 = Vci;
                int i3 = i2 + 52;
                if (i3 == 26) {
                    break;
                }
                if (i3 != 62) {
                    if (i3 == 170) {
                        Vci = i2 ^ 6936;
                    }
                }
                Vci = (Vci * 103) + i2 + i2;
            }
            while (true) {
                Vci = (Vci ^ 5367) + i2 + i2;
            }
        } else {
            if (Tfr > 8792) {
                return dQNXCm(sSLSocketFactory.createSocket(socket, str, i, z));
            }
            do {
            } while (Tfr + 13 != 68);
            while (true) {
                Tfr = (Tfr % 80) % 8;
            }
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.XvBqpx.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.XvBqpx.getSupportedCipherSuites();
    }
}
