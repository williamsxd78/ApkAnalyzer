package jslYAf;

import android.hardware.SensorEvent;

/* loaded from: classes9.dex */
class KVeceb {
    public static int ICw = 2405;
    public static int vFK = 7496;
    float[] KGuUnd;
    long RHTCcS;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    KVeceb(long r1, float[] r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.RHTCcS = r1
            int r1 = jslYAf.KVeceb.ICw
            r2 = 2404(0x964, float:3.369E-42)
            if (r1 > r2) goto L72
        Lb:
            int r0 = jslYAf.KVeceb.ICw
            int r1 = r0 + 13
            r2 = 68
            if (r1 == r2) goto L38
            r0 = 74
            if (r1 == r0) goto L18
            goto Lb
        L18:
            int r0 = jslYAf.KVeceb.ICw
            int r0 = r0 >> 98
            int r0 = r0 * 41
            int r0 = r0 % 63
            jslYAf.KVeceb.ICw = r0
            int r0 = jslYAf.KVeceb.vFK
            r0 = r0 ^ 7496(0x1d48, float:1.0504E-41)
            if (r0 == 0) goto L18
        L28:
            int r0 = jslYAf.KVeceb.vFK
            int r1 = r0 + 52
            r2 = 14
            if (r1 == r2) goto L31
            goto L28
        L31:
            int r0 = r0 >> 40
            int r0 = r0 >> 30
            jslYAf.KVeceb.vFK = r0
            goto L18
        L38:
            int r0 = r0 * 124
            r0 = r0 ^ 2664(0xa68, float:3.733E-42)
            jslYAf.KVeceb.ICw = r0
            int r0 = jslYAf.KVeceb.vFK
            r0 = r0 ^ 7496(0x1d48, float:1.0504E-41)
            if (r0 == 0) goto Lb
        L44:
            int r0 = jslYAf.KVeceb.vFK
            int r1 = r0 + 26
            r2 = 46
            if (r1 == r2) goto L5d
            r2 = 80
            if (r1 == r2) goto L59
            r2 = 225(0xe1, float:3.15E-43)
            if (r1 == r2) goto L62
            r2 = 357(0x165, float:5.0E-43)
            if (r1 == r2) goto L6a
            goto L44
        L59:
            int r1 = r0 % 80
            int r1 = r1 + r0
            goto L68
        L5d:
            int r1 = r0 + r0
            int r1 = r1 >> 18
            goto L6f
        L62:
            int r1 = jslYAf.KVeceb.vFK
            int r1 = r1 % 119
            int r1 = r1 >> 120
        L68:
            jslYAf.KVeceb.vFK = r1
        L6a:
            int r1 = jslYAf.KVeceb.vFK
            int r1 = r1 * 12971
            int r1 = r1 + r0
        L6f:
            jslYAf.KVeceb.vFK = r1
            goto L62
        L72:
            java.lang.Object r1 = r3.clone()
            float[] r1 = (float[]) r1
            r0.KGuUnd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.KVeceb.<init>(long, float[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KVeceb(SensorEvent sensorEvent) {
        this(sensorEvent.timestamp, sensorEvent.values);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long KcfKZn() {
        return this.RHTCcS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double[] dVRxgg() {
        double[] dArr = new double[this.KGuUnd.length];
        dArr[0] = wFZYVZ();
        if (this.KGuUnd.length > 1) {
            dArr[1] = wHmYMH();
        }
        if (this.KGuUnd.length > 2) {
            dArr[2] = lJONgm();
        }
        return dArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x011f, code lost:
    
        r7 = jslYAf.KVeceb.vFK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0123, code lost:
    
        if ((r7 + 39) == 94) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0126, code lost:
    
        jslYAf.KVeceb.vFK = ((jslYAf.KVeceb.vFK ^ 2832) + r7) ^ 2780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0134, code lost:
    
        if ((jslYAf.KVeceb.ICw ^ 2405) == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0138, code lost:
    
        if (r9 > 7495) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r3 == 310) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x013a, code lost:
    
        r9 = jslYAf.KVeceb.vFK;
        r0 = r9 + 156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x013e, code lost:
    
        if (r0 == 19) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0142, code lost:
    
        if (r0 == 213) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0146, code lost:
    
        if (r0 == 369) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x014a, code lost:
    
        if (r0 == 431) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x014d, code lost:
    
        jslYAf.KVeceb.vFK = (r9 ^ 4190) >> 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0153, code lost:
    
        jslYAf.KVeceb.vFK = ((jslYAf.KVeceb.vFK + r9) + r9) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x015a, code lost:
    
        jslYAf.KVeceb.vFK = ((jslYAf.KVeceb.vFK + r9) % 70) % 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0163, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK % 16) ^ 2791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016b, code lost:
    
        r9 = jslYAf.KVeceb.ICw;
        r0 = jslYAf.KVeceb.vFK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0171, code lost:
    
        if ((r0 ^ 7496) == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        jslYAf.KVeceb.vFK = ((jslYAf.KVeceb.vFK ^ 5445) % 23) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x018e, code lost:
    
        r1 = r9 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0192, code lost:
    
        if (r1 == 65) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r1 == 132) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x019b, code lost:
    
        if ((r0 ^ 7496) == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x019d, code lost:
    
        r0 = jslYAf.KVeceb.vFK;
        r1 = r0 + 247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a1, code lost:
    
        if (r1 == 19) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a5, code lost:
    
        if (r1 == 195) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a9, code lost:
    
        if (r1 == 240) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ad, code lost:
    
        if (r1 == 284) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b0, code lost:
    
        r1 = ((r0 + r0) >> 48) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ba, code lost:
    
        jslYAf.KVeceb.vFK = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c3, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK % 49) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01b6, code lost:
    
        r1 = (r0 + r0) >> 113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01bd, code lost:
    
        jslYAf.KVeceb.vFK = (r0 + r0) ^ 2801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01cb, code lost:
    
        jslYAf.KVeceb.ICw = (r9 * 11900) >> 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01d1, code lost:
    
        r9 = jslYAf.KVeceb.ICw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01d5, code lost:
    
        if (jslYAf.KVeceb.vFK > 7495) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01d7, code lost:
    
        r0 = jslYAf.KVeceb.vFK;
        r1 = r0 + 195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01dd, code lost:
    
        if (r1 == 40) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01e1, code lost:
    
        if (r1 == 165) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01e4, code lost:
    
        jslYAf.KVeceb.vFK = (r0 % 23) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ea, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK + r0) % 57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r0 = r0 >> 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01f2, code lost:
    
        r9 = (r9 % 60) ^ 3494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01f8, code lost:
    
        if (jslYAf.KVeceb.vFK > 7495) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x020b, code lost:
    
        jslYAf.KVeceb.ICw = r9 >> 103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0200, code lost:
    
        if ((jslYAf.KVeceb.vFK + com.airbnb.paris.R2.attr.textAppearanceSearchResultTitle) == 87) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0203, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK * 44) >> 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        jslYAf.KVeceb.vFK = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0173, code lost:
    
        r9 = jslYAf.KVeceb.vFK;
        r0 = r9 + 234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0177, code lost:
    
        if (r0 == 15) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0185, code lost:
    
        jslYAf.KVeceb.vFK = ((r9 * 124) ^ 2880) * 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x017b, code lost:
    
        if (r0 == 196) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x017e, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK >> 92) * 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0211, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r0 = ((r0 + r0) % 44) * 89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if ((jslYAf.KVeceb.ICw ^ 2405) == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        r0 = jslYAf.KVeceb.ICw;
        r5 = r0 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r5 == 15) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r5 == 22) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r5 == 64) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r5 == 161) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        r9 = jslYAf.KVeceb.ICw ^ 4134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if ((jslYAf.KVeceb.vFK ^ 7496) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        r1 = jslYAf.KVeceb.vFK;
        r2 = r1 + 143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r2 == 45) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r2 == 228) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r2 == 261) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        jslYAf.KVeceb.vFK = ((jslYAf.KVeceb.vFK ^ 5209) >> 60) ^ com.airbnb.paris.R2.styleable.Paris_View_android_layout_marginEnd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        jslYAf.KVeceb.vFK = ((r1 >> 124) + r1) ^ 5457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0078, code lost:
    
        jslYAf.KVeceb.vFK = ((r1 * 6) + r1) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
    
        jslYAf.KVeceb.ICw = (r9 * 15) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        if ((jslYAf.KVeceb.vFK ^ 7496) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if ((jslYAf.KVeceb.vFK ^ 7496) != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008b, code lost:
    
        r9 = jslYAf.KVeceb.vFK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
    
        if ((r9 + 104) == 24) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
    
        jslYAf.KVeceb.vFK = ((r9 * 41) >> 25) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r0 = jslYAf.KVeceb.vFK;
        r3 = r0 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009c, code lost:
    
        r0 = r0 % 97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a2, code lost:
    
        if ((jslYAf.KVeceb.vFK ^ 7496) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a4, code lost:
    
        r9 = jslYAf.KVeceb.vFK;
        r0 = r9 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00aa, code lost:
    
        if (r0 == 17) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
    
        if (r0 == 35) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK * 80) + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r3 == 92) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK * 198) >> 58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c0, code lost:
    
        jslYAf.KVeceb.ICw = (r0 * 38) % 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ef, code lost:
    
        jslYAf.KVeceb.ICw = ((jslYAf.KVeceb.ICw + r0) * 28) >> 57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fc, code lost:
    
        if ((jslYAf.KVeceb.vFK ^ 7496) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c7, code lost:
    
        jslYAf.KVeceb.ICw = (jslYAf.KVeceb.ICw * 39) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d2, code lost:
    
        if ((jslYAf.KVeceb.vFK ^ 7496) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d4, code lost:
    
        r9 = jslYAf.KVeceb.vFK;
        r0 = r9 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d8, code lost:
    
        if (r0 == 35) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00dc, code lost:
    
        if (r0 == 160) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e6, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK ^ 6023) >> 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00df, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK + r9) % 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e6, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK ^ 6023) >> 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3 == 276) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fe, code lost:
    
        r9 = jslYAf.KVeceb.vFK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0104, code lost:
    
        if ((r9 + 65) == 99) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0107, code lost:
    
        jslYAf.KVeceb.vFK = (r9 * 32) ^ 3167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010e, code lost:
    
        r0 = jslYAf.NPUAiZ.VeIwUw(r9.KGuUnd[2]);
        r9 = jslYAf.KVeceb.vFK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011d, code lost:
    
        if (r9 > 7495) goto L76;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00d2 -> B:49:0x00ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    double lJONgm() {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.KVeceb.lJONgm():double");
    }

    double wFZYVZ() {
        return NPUAiZ.VeIwUw(this.KGuUnd[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r4 == 214) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = (r0 ^ com.airbnb.paris.R2.styleable.TextAppearance_fontFamily) >> 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        jslYAf.KVeceb.vFK = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r0 = (jslYAf.KVeceb.vFK >> 20) % 110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        jslYAf.KVeceb.vFK = ((r0 ^ 3807) >> 51) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r0 = jslYAf.NPUAiZ.VeIwUw(r6.KGuUnd[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if ((jslYAf.KVeceb.ICw ^ 2405) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        r6 = jslYAf.KVeceb.ICw;
        r4 = r6 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r4 == 81) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r4 == 275) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r4 == 361) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        jslYAf.KVeceb.ICw ^= com.airbnb.paris.R2.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (jslYAf.KVeceb.vFK > 7495) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        r6 = jslYAf.KVeceb.vFK;
        r0 = r6 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r0 == 22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if (r0 == 116) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        jslYAf.KVeceb.vFK = (jslYAf.KVeceb.vFK + r6) * 10406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        jslYAf.KVeceb.vFK = ((jslYAf.KVeceb.vFK >> 58) >> 118) ^ 3766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        jslYAf.KVeceb.ICw = (r6 % 25) >> 45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        if (jslYAf.KVeceb.vFK > 7495) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        r6 = jslYAf.KVeceb.vFK;
        r4 = r6 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006d, code lost:
    
        if (r4 == 50) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0071, code lost:
    
        if (r4 == 205) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (jslYAf.KVeceb.vFK <= 7495) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r4 == 297) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0078, code lost:
    
        r6 = (r6 % 65) ^ 2919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        jslYAf.KVeceb.vFK = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007d, code lost:
    
        jslYAf.KVeceb.vFK = (r6 >> 109) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0083, code lost:
    
        r6 = (r6 ^ com.airbnb.paris.R2.style.Widget_AppCompat_Light_ActionBar_TabView_Inverse) % 51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r0 = jslYAf.KVeceb.vFK;
        r4 = r0 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x005d, code lost:
    
        jslYAf.KVeceb.ICw = (r6 ^ 5572) >> 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0065, code lost:
    
        if (jslYAf.KVeceb.vFK > 7495) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r4 == 22) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r4 == 144) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    double wHmYMH() {
        /*
            r6 = this;
            float[] r0 = r6.KGuUnd
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto Lb2
            int r0 = jslYAf.KVeceb.vFK
            r2 = 22
            r3 = 7495(0x1d47, float:1.0503E-41)
            if (r0 > r3) goto L32
        Le:
            int r0 = jslYAf.KVeceb.vFK
            int r4 = r0 + 26
            if (r4 == r2) goto L24
            r5 = 144(0x90, float:2.02E-43)
            if (r4 == r5) goto L2b
            r5 = 214(0xd6, float:3.0E-43)
            if (r4 == r5) goto L1d
            goto Le
        L1d:
            r0 = r0 ^ 1642(0x66a, float:2.301E-42)
            int r0 = r0 >> 23
        L21:
            jslYAf.KVeceb.vFK = r0
            goto L32
        L24:
            r4 = r0 ^ 3807(0xedf, float:5.335E-42)
            int r4 = r4 >> 51
            int r4 = r4 + r0
            jslYAf.KVeceb.vFK = r4
        L2b:
            int r0 = jslYAf.KVeceb.vFK
            int r0 = r0 >> 20
            int r0 = r0 % 110
            goto L21
        L32:
            float[] r6 = r6.KGuUnd
            r6 = r6[r1]
            double r0 = (double) r6
            double r0 = jslYAf.NPUAiZ.VeIwUw(r0)
            int r6 = jslYAf.KVeceb.ICw
            r6 = r6 ^ 2405(0x965, float:3.37E-42)
            if (r6 == 0) goto Lb1
        L41:
            int r6 = jslYAf.KVeceb.ICw
            int r4 = r6 + 26
            r5 = 81
            if (r4 == r5) goto L5d
            r5 = 275(0x113, float:3.85E-43)
            if (r4 == r5) goto L52
            r6 = 361(0x169, float:5.06E-43)
            if (r4 == r6) goto L89
            goto L41
        L52:
            int r6 = r6 % 25
            int r6 = r6 >> 45
            jslYAf.KVeceb.ICw = r6
            int r6 = jslYAf.KVeceb.vFK
            if (r6 > r3) goto L89
            goto L67
        L5d:
            r6 = r6 ^ 5572(0x15c4, float:7.808E-42)
            int r6 = r6 >> 63
            jslYAf.KVeceb.ICw = r6
            int r6 = jslYAf.KVeceb.vFK
            if (r6 > r3) goto L89
        L67:
            int r6 = jslYAf.KVeceb.vFK
            int r4 = r6 + 91
            r5 = 50
            if (r4 == r5) goto L83
            r5 = 205(0xcd, float:2.87E-43)
            if (r4 == r5) goto L7d
            r5 = 297(0x129, float:4.16E-43)
            if (r4 == r5) goto L78
            goto L67
        L78:
            int r6 = r6 % 65
            r6 = r6 ^ 2919(0xb67, float:4.09E-42)
            goto L87
        L7d:
            int r4 = r6 >> 109
            int r4 = r4 + r6
            jslYAf.KVeceb.vFK = r4
            goto L89
        L83:
            r6 = r6 ^ 1145(0x479, float:1.604E-42)
            int r6 = r6 % 51
        L87:
            jslYAf.KVeceb.vFK = r6
        L89:
            int r6 = jslYAf.KVeceb.ICw
            r6 = r6 ^ 1388(0x56c, float:1.945E-42)
            jslYAf.KVeceb.ICw = r6
            int r6 = jslYAf.KVeceb.vFK
            if (r6 > r3) goto Lb1
        L93:
            int r6 = jslYAf.KVeceb.vFK
            int r0 = r6 + 39
            if (r0 == r2) goto La6
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L9e
            goto L93
        L9e:
            int r0 = jslYAf.KVeceb.vFK
            int r0 = r0 + r6
            int r0 = r0 * 10406
            jslYAf.KVeceb.vFK = r0
            goto L9e
        La6:
            int r6 = jslYAf.KVeceb.vFK
            int r6 = r6 >> 58
            int r6 = r6 >> 118
            r6 = r6 ^ 3766(0xeb6, float:5.277E-42)
            jslYAf.KVeceb.vFK = r6
            goto La6
        Lb1:
            return r0
        Lb2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.KVeceb.wHmYMH():double");
    }
}
