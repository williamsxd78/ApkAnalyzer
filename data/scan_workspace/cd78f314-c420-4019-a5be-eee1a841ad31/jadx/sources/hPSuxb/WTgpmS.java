package hPSuxb;

import com.airbnb.paris.R2;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class WTgpmS {
    public static int EqL = 2652;
    public static int Oeg = 1469;
    static String hDMFnX;

    static {
        rxH(false);
    }

    public static void WBOYlz(float[] fArr) {
        Objects.requireNonNull(fArr);
        int length = fArr.length;
        if (Integer.bitCount(length) != 1) {
            throw new IllegalArgumentException(hDMFnX);
        }
        fArr[0] = fArr[0] / 2.0f;
        WBOYlz(fArr, 0, length, new float[length]);
    }

    private static void WBOYlz(float[] fArr, int i, int i2, float[] fArr2) {
        if (i2 == 1) {
            return;
        }
        int i3 = i2 / 2;
        fArr2[i] = fArr[i];
        int i4 = i + i3;
        fArr2[i4] = fArr[i + 1];
        int i5 = 1;
        while (i5 < i3) {
            int i6 = i + i5;
            int i7 = (i5 * 2) + i;
            fArr2[i6] = fArr[i7];
            fArr2[i6 + i3] = fArr[i7 - 1] + fArr[i7 + 1];
            i5++;
            if ((Oeg ^ R2.styleable.MenuGroup_android_id) != 0) {
                while (true) {
                    int i8 = Oeg;
                    if (i8 + 39 == 64) {
                        Oeg = (i8 * 110) >> 13;
                    }
                }
            }
        }
        WBOYlz(fArr2, i, i3, fArr);
        WBOYlz(fArr2, i4, i3, fArr);
        int i9 = 0;
        while (i9 < i3) {
            int i10 = i + i9;
            float f = fArr2[i10];
            float f2 = fArr2[i10 + i3];
            double d = i9;
            if (Oeg <= 1468) {
                while (true) {
                    int i11 = Oeg;
                    int i12 = i11 + 78;
                    if (i12 == 24) {
                        break;
                    }
                    if (i12 == 108) {
                        Oeg = ((i11 + i11) >> 125) + i11;
                    } else if (i12 == 186) {
                        Oeg = i11 + i11 + i11;
                        break;
                    } else if (i12 == 333) {
                        while (true) {
                            Oeg = ((Oeg >> 37) * 63) % 29;
                        }
                    }
                }
                Oeg = (Oeg ^ 4273) * 77;
            }
            float cos = f2 / (((float) Math.cos(((d + 0.5d) * 3.141592653589793d) / i2)) * 2.0f);
            fArr[i10] = f + cos;
            fArr[((i + i2) - 1) - i9] = f - cos;
            i9++;
            if (Oeg <= 1468) {
                while (true) {
                    int i13 = Oeg;
                    int i14 = i13 + 65;
                    if (i14 == 68) {
                        Oeg = (i13 + i13) % 28;
                    } else if (i14 != 217) {
                        if (i14 == 288) {
                            break;
                        }
                    }
                    Oeg = ((Oeg * 31) >> 14) ^ 3626;
                }
                while (true) {
                    Oeg = (Oeg % 8) >> 97;
                }
            }
        }
    }

    public static /* synthetic */ void rxH(boolean z) {
        if (z) {
            rxH(false);
        }
        hDMFnX = ExvSJH.rhj("Tari^D\tGj{h&@A\u0001RHG@\\\u001bS_\u001a\u001d");
    }

    public static void xnNJW(float[] fArr) {
        Objects.requireNonNull(fArr);
        int length = fArr.length;
        if (Integer.bitCount(length) != 1) {
            throw new IllegalArgumentException(hDMFnX);
        }
        xnNJW(fArr, 0, length, new float[length]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (hPSuxb.WTgpmS.Oeg <= 1468) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r1 = hPSuxb.WTgpmS.Oeg;
        r2 = r1 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        if (r2 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        if (r2 == 130) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r2 == 208) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r2 == 213) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        hPSuxb.WTgpmS.Oeg = ((hPSuxb.WTgpmS.Oeg % 17) % 104) ^ 3161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a6, code lost:
    
        hPSuxb.WTgpmS.Oeg = ((hPSuxb.WTgpmS.Oeg * 34) + r1) % 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b0, code lost:
    
        hPSuxb.WTgpmS.Oeg = ((hPSuxb.WTgpmS.Oeg ^ 3710) + r1) % 75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
    
        hPSuxb.WTgpmS.Oeg = (r1 % 36) % 84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ca, code lost:
    
        r10[r12] = r13[r3 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d1, code lost:
    
        if (hPSuxb.WTgpmS.Oeg > 1468) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        r12 = hPSuxb.WTgpmS.Oeg;
        r1 = r12 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
    
        if (r1 == 49) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dd, code lost:
    
        if (r1 == 111) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e1, code lost:
    
        if (r1 == 160) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e5, code lost:
    
        if (r1 == 245) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
    
        hPSuxb.WTgpmS.Oeg = (hPSuxb.WTgpmS.Oeg >> 125) ^ 5196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e8, code lost:
    
        r12 = (r12 ^ 5439) % 88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f7, code lost:
    
        hPSuxb.WTgpmS.Oeg = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        hPSuxb.WTgpmS.Oeg = r12 ^ 6359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f2, code lost:
    
        r12 = ((r12 % 26) + r12) >> 118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0102, code lost:
    
        r11 = r11 - 1;
        r10[r11] = r13[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0107, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void xnNJW(float[] r10, int r11, int r12, float[] r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hPSuxb.WTgpmS.xnNJW(float[], int, int, float[]):void");
    }
}
