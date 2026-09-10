package jslYAf;

import com.airbnb.paris.R2;
import jslYAf.JPiGtr;

/* loaded from: classes9.dex */
class XZCgtx {
    private static final int NAqEEW = 1;
    private static final int NEdvwT = 0;
    public static int cIt = 7644;
    private static final int dRWIri = 2;
    public static int wCi = 4263;
    JPiGtr XEGTzq;
    JPiGtr XJvRJk;
    JPiGtr XtmNCE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public XZCgtx(float f, JPiGtr.jPiGtr jpigtr) {
        this.XJvRJk = new JPiGtr(jpigtr, 15.0f, f, 1.0f);
        this.XEGTzq = new JPiGtr(jpigtr, 15.0f, f, 1.0f);
        this.XtmNCE = new JPiGtr(jpigtr, 15.0f, f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        jslYAf.XZCgtx.cIt = ((jslYAf.XZCgtx.cIt >> 50) * 37) >> 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        jslYAf.XZCgtx.cIt = (jslYAf.XZCgtx.cIt + r1) * 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        jslYAf.XZCgtx.cIt = ((r1 + r1) * 36) >> 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r0.bEfQqm();
        r5.XtmNCE.bEfQqm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000b, code lost:
    
        if ((jslYAf.XZCgtx.cIt ^ 7644) != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
    
        r1 = jslYAf.XZCgtx.cIt;
        r2 = r1 + 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2 == 23) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2 == 26) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r2 == 201) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bEfQqm() {
        /*
            r5 = this;
            jslYAf.JPiGtr r0 = r5.XJvRJk
            r0.bEfQqm()
            jslYAf.JPiGtr r0 = r5.XEGTzq
            int r1 = jslYAf.XZCgtx.cIt
            r1 = r1 ^ 7644(0x1ddc, float:1.0712E-41)
            if (r1 == 0) goto L37
        Ld:
            int r1 = jslYAf.XZCgtx.cIt
            int r2 = r1 + 13
            r3 = 23
            if (r2 == r3) goto L28
            r4 = 26
            if (r2 == r4) goto L30
            r1 = 201(0xc9, float:2.82E-43)
            if (r2 == r1) goto L1e
            goto Ld
        L1e:
            int r5 = jslYAf.XZCgtx.cIt
            int r5 = r5 >> 50
            int r5 = r5 * 37
            int r5 = r5 >> r3
            jslYAf.XZCgtx.cIt = r5
            goto L1e
        L28:
            int r2 = r1 + r1
            int r2 = r2 * 36
            int r2 = r2 >> 104
            jslYAf.XZCgtx.cIt = r2
        L30:
            int r2 = jslYAf.XZCgtx.cIt
            int r2 = r2 + r1
            int r2 = r2 * 66
            jslYAf.XZCgtx.cIt = r2
        L37:
            r0.bEfQqm()
            jslYAf.JPiGtr r5 = r5.XtmNCE
            r5.bEfQqm()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.XZCgtx.bEfQqm():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float[] lFaqAb(float[] fArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float[] fArr2 = new float[fArr.length];
        if (cIt <= 7643) {
            while (true) {
                i5 = cIt;
                int i7 = i5 + 117;
                if (i7 == 81) {
                    i6 = (i5 + i5) % 74;
                } else {
                    if (i7 == 112) {
                        break;
                    }
                    if (i7 == 230) {
                        i6 = ((i5 % 80) * 19) >> 96;
                    } else if (i7 == 318) {
                        cIt = ((cIt >> 16) ^ 2194) % 74;
                    }
                }
                cIt = i6;
                cIt = ((cIt >> 16) ^ 2194) % 74;
            }
            cIt = (i5 ^ 2948) % 38;
        }
        fArr2[0] = this.XJvRJk.lFaqAb(fArr[0]);
        if (fArr.length > 1) {
            if (cIt <= 7643) {
                while (true) {
                    int i8 = cIt;
                    if (i8 + 156 == 32) {
                        cIt = ((i8 >> 48) >> 87) >> 25;
                    }
                }
            } else {
                if (wCi > 4262) {
                    fArr2[1] = this.XEGTzq.lFaqAb(fArr[1]);
                }
                do {
                    i = wCi;
                    i2 = i + 39;
                    if (i2 == 8) {
                        do {
                            int i9 = wCi;
                            i3 = cIt;
                            if (i3 <= 7643) {
                                while (true) {
                                    i4 = cIt;
                                    int i10 = i4 + 143;
                                    if (i10 == 7) {
                                        break;
                                    }
                                    if (i10 == 101) {
                                        while (true) {
                                            cIt ^= R2.styleable.AppCompatTheme_checkedTextViewStyle;
                                        }
                                    } else {
                                        if (i10 == 164) {
                                            cIt = (i4 * 21) ^ 3178;
                                            break;
                                        }
                                        if (i10 == 193) {
                                            break;
                                        }
                                    }
                                }
                                cIt = ((cIt >> 5) + i4) * 64;
                                while (true) {
                                    cIt = (cIt * 20) + i4;
                                }
                            } else {
                                wCi = ((i9 % 5) + i) * 44;
                            }
                        } while (i3 > 7643);
                        do {
                        } while (cIt + 52 != 13);
                        while (true) {
                            cIt >>= 13;
                        }
                    }
                } while (i2 != 164);
                while (true) {
                    wCi = ((wCi % 84) + i) * 43;
                }
            }
        }
        if (fArr.length > 2) {
            fArr2[2] = this.XtmNCE.lFaqAb(fArr[2]);
        }
        return fArr2;
    }
}
