package jslYAf;

import android.hardware.SensorEvent;

/* loaded from: classes9.dex */
class KAVsPW {
    private static final int NAqEEW = 1;
    private static final int NEdvwT = 0;
    private static final int RIZwFg = 3;
    private static final int dRWIri = 2;
    public static int dVj = 3382;
    public static int dnp = 5087;
    final TtnbYl[] TlTRmw;
    long bzTreD;

    /* JADX INFO: Access modifiers changed from: package-private */
    public KAVsPW(long j) {
        this.TlTRmw = r0;
        this.bzTreD = j;
        TtnbYl[] ttnbYlArr = {new TtnbYl(), new TtnbYl(), new TtnbYl()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (jslYAf.KAVsPW.dVj <= 3381) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r5 = jslYAf.KAVsPW.dVj;
        r6 = r5 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r6 == 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r6 == 29) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r5 = (r5 % 120) * 56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        jslYAf.KAVsPW.dVj = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        r5 = ((r5 >> 124) % 116) % 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        r4[1] = r7;
        r3.TlTRmw[2] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    KAVsPW(long r4, jslYAf.TtnbYl r6, jslYAf.TtnbYl r7, jslYAf.TtnbYl r8) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 3
            jslYAf.TtnbYl[] r0 = new jslYAf.TtnbYl[r0]
            r3.TlTRmw = r0
            r3.bzTreD = r4
            int r4 = jslYAf.KAVsPW.dVj
            r5 = 3381(0xd35, float:4.738E-42)
            if (r4 > r5) goto L46
        L10:
            int r4 = jslYAf.KAVsPW.dVj
            int r1 = r4 + 13
            r2 = 53
            if (r1 == r2) goto L3d
            r2 = 169(0xa9, float:2.37E-43)
            if (r1 == r2) goto L35
            r2 = 358(0x166, float:5.02E-43)
            if (r1 == r2) goto L2a
            r2 = 410(0x19a, float:5.75E-43)
            if (r1 == r2) goto L25
            goto L10
        L25:
            r4 = r4 ^ 3210(0xc8a, float:4.498E-42)
            jslYAf.KAVsPW.dVj = r4
            goto L3d
        L2a:
            int r3 = jslYAf.KAVsPW.dVj
            int r3 = r3 >> 32
            int r3 = r3 * 115
            r3 = r3 ^ 3545(0xdd9, float:4.968E-42)
            jslYAf.KAVsPW.dVj = r3
            goto L2a
        L35:
            int r1 = r4 % 94
            int r1 = r1 + r4
            int r1 = r1 * 21
            jslYAf.KAVsPW.dVj = r1
            goto L46
        L3d:
            int r4 = jslYAf.KAVsPW.dVj
            int r4 = r4 % 124
            int r4 = r4 % 10
            jslYAf.KAVsPW.dVj = r4
            goto L10
        L46:
            r4 = 0
            r0[r4] = r6
            jslYAf.TtnbYl[] r4 = r3.TlTRmw
            int r6 = jslYAf.KAVsPW.dVj
            if (r6 > r5) goto L6a
        L4f:
            int r5 = jslYAf.KAVsPW.dVj
            int r6 = r5 + 26
            r0 = 26
            if (r6 == r0) goto L63
            r0 = 29
            if (r6 == r0) goto L5c
            goto L4f
        L5c:
            int r5 = r5 % 120
            int r5 = r5 * 56
        L60:
            jslYAf.KAVsPW.dVj = r5
            goto L6a
        L63:
            int r5 = r5 >> 124
            int r5 = r5 % 116
            int r5 = r5 % 9
            goto L60
        L6a:
            r5 = 1
            r4[r5] = r7
            jslYAf.TtnbYl[] r3 = r3.TlTRmw
            r4 = 2
            r3[r4] = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.KAVsPW.<init>(long, jslYAf.TtnbYl, jslYAf.TtnbYl, jslYAf.TtnbYl):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KAVsPW KCMqYY() {
        KAVsPW jFXGgd = jFXGgd();
        bEfQqm();
        return jFXGgd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void KNfXgi(SensorEvent sensorEvent) {
        KNfXgi(sensorEvent.values);
    }

    synchronized void KNfXgi(float[] fArr) {
        int i;
        float f = fArr[0];
        TtnbYl[] ttnbYlArr = this.TlTRmw;
        if ((dVj ^ 3382) != 0) {
            while (true) {
                i = dVj;
                int i2 = i + 26;
                if (i2 != 35) {
                    if (i2 != 176) {
                        if (i2 == 358) {
                            dVj = (i >> 76) % 36;
                            break;
                        } else if (i2 == 482) {
                            dVj = (i + i) * 61;
                        }
                    } else {
                        break;
                    }
                }
                dVj = (dVj + i) >> 115;
            }
            dVj = (dVj + i) * 123;
        }
        ReNEqt(f, ttnbYlArr[0]);
        float f2 = fArr[1];
        if (dVj <= 3381) {
            do {
            } while (dVj + 13 != 42);
            while (true) {
                dVj = ((dVj >> 84) ^ 3975) >> 95;
            }
        } else {
            ReNEqt(f2, this.TlTRmw[1]);
            if ((dVj ^ 3382) != 0) {
                while (true) {
                    int i3 = dVj;
                    int i4 = i3 + 39;
                    if (i4 != 41) {
                        if (i4 == 232) {
                            while (true) {
                                dVj = (dVj % 1) + i3;
                            }
                        } else if (i4 == 426) {
                            dVj = (i3 + i3) * 4982;
                        } else if (i4 == 563) {
                            while (true) {
                                dVj = (dVj >> 38) % 3;
                            }
                        }
                    }
                    dVj = (dVj ^ 3666) >> 75;
                }
            } else {
                ReNEqt(fArr[2], this.TlTRmw[2]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((jslYAf.KAVsPW.dVj + 39) == 80) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        jslYAf.KAVsPW.dVj = ((jslYAf.KAVsPW.dVj ^ 4168) >> 56) ^ 2074;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((jslYAf.KAVsPW.dnp + 26) == 83) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        jslYAf.KAVsPW.dnp = (jslYAf.KAVsPW.dnp % 6) % 38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (jslYAf.KAVsPW.dVj > 3381) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r2 = jslYAf.KAVsPW.dVj;
        r3 = r2 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 72) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r3 == 200) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r3 == 305) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        jslYAf.KAVsPW.dVj = ((r2 >> 41) * 97) ^ 4880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        jslYAf.KAVsPW.dVj = (r2 ^ com.airbnb.paris.R2.styleable.SearchView_voiceIcon) >> 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        jslYAf.KAVsPW.dVj = ((jslYAf.KAVsPW.dVj + r2) + r2) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if ((jslYAf.KAVsPW.dVj ^ 3382) != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void ReNEqt(float r3, jslYAf.TtnbYl r4) {
        /*
            r2 = this;
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L75
            boolean r0 = java.lang.Float.isInfinite(r3)
            if (r0 != 0) goto L75
            int r0 = jslYAf.KAVsPW.dnp
            r1 = 5086(0x13de, float:7.127E-42)
            if (r0 > r1) goto L6b
            int r2 = jslYAf.KAVsPW.dVj
            r2 = r2 ^ 3382(0xd36, float:4.739E-42)
            if (r2 == 0) goto L2c
        L18:
            int r2 = jslYAf.KAVsPW.dVj
            int r2 = r2 + 39
            r3 = 80
            if (r2 == r3) goto L21
            goto L18
        L21:
            int r2 = jslYAf.KAVsPW.dVj
            r2 = r2 ^ 4168(0x1048, float:5.84E-42)
            int r2 = r2 >> 56
            r2 = r2 ^ 2074(0x81a, float:2.906E-42)
            jslYAf.KAVsPW.dVj = r2
            goto L21
        L2c:
            int r2 = jslYAf.KAVsPW.dnp
            int r2 = r2 + 26
            r3 = 83
            if (r2 == r3) goto L35
            goto L2c
        L35:
            int r2 = jslYAf.KAVsPW.dnp
            int r2 = r2 % 6
            int r2 = r2 % 38
            jslYAf.KAVsPW.dnp = r2
            int r2 = jslYAf.KAVsPW.dVj
            r3 = 3381(0xd35, float:4.738E-42)
            if (r2 > r3) goto L35
        L43:
            int r2 = jslYAf.KAVsPW.dVj
            int r3 = r2 + 52
            r4 = 72
            if (r3 == r4) goto L63
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == r4) goto L5d
            r4 = 305(0x131, float:4.27E-43)
            if (r3 == r4) goto L54
            goto L43
        L54:
            int r2 = r2 >> 41
            int r2 = r2 * 97
            r2 = r2 ^ 4880(0x1310, float:6.838E-42)
            jslYAf.KAVsPW.dVj = r2
            goto L35
        L5d:
            r3 = r2 ^ 1603(0x643, float:2.246E-42)
            int r3 = r3 >> 99
            jslYAf.KAVsPW.dVj = r3
        L63:
            int r3 = jslYAf.KAVsPW.dVj
            int r3 = r3 + r2
            int r3 = r3 + r2
            int r3 = r3 + r2
            jslYAf.KAVsPW.dVj = r3
            goto L35
        L6b:
            float r3 = java.lang.Math.abs(r3)
            double r0 = (double) r3
            long r2 = r2.bzTreD
            r4.KNfXgi(r0, r2)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.KAVsPW.ReNEqt(float, jslYAf.TtnbYl):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 177
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    synchronized void bEfQqm() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.KAVsPW.bEfQqm():void");
    }

    synchronized KAVsPW jFXGgd() {
        return new KAVsPW(this.bzTreD, wFZYVZ().jFXGgd(), wHmYMH().jFXGgd(), lJONgm().jFXGgd());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized TtnbYl lJONgm() {
        return this.TlTRmw[2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized TtnbYl wFZYVZ() {
        return this.TlTRmw[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized TtnbYl wHmYMH() {
        return this.TlTRmw[1];
    }
}
