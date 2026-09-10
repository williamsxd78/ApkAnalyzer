package jslYAf;

import com.airbnb.paris.R2;

/* loaded from: classes9.dex */
class JPiGtr {
    public static int MUn = 4539;
    private static final int NeqWes = 2;
    private static final int RCrwcM = 3;
    public static int WxG = 8675;
    private final jPiGtr GqixwP;
    private final float TOHhBZ;
    private final float[] XEGTzq;
    private final float XTvQcI;
    private final float lXkFEI;
    private final float[] dqSNlM = new float[3];
    private final float[] MXbHeP = new float[2];
    private final float[] bcLhgP = new float[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public enum jPiGtr {
        LOW_PASS,
        HIGH_PASS;

        public static int Ids = 0;
        public static int TrA = 3950;

        static {
            WsUBUm.dVg = 9721;
            WsUBUm.dwn = 4146;
            Ids = R2.styleable.Paris_ViewGroup_android_clipToPadding;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r1 <= 4538) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r4 = jslYAf.JPiGtr.MUn;
        r5 = r4 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r5 == 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r5 == 36) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r5 == 221) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r5 == 385) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r4 = (r4 % 65) % 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        jslYAf.JPiGtr.MUn = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r4 = (r4 ^ 4645) % 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        jslYAf.JPiGtr.MUn = ((jslYAf.JPiGtr.MUn + r4) >> 125) >> 89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r4 = ((r4 >> 38) * 48) >> 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        r3.XTvQcI = r6;
        r3.TOHhBZ = r7;
        bEfQqm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JPiGtr(jslYAf.JPiGtr.jPiGtr r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 3
            float[] r1 = new float[r0]
            r3.dqSNlM = r1
            r1 = 2
            float[] r2 = new float[r1]
            r3.MXbHeP = r2
            float[] r1 = new float[r1]
            r3.bcLhgP = r1
            int r1 = jslYAf.JPiGtr.MUn
            r2 = r1 ^ 4539(0x11bb, float:6.36E-42)
            if (r2 == 0) goto L36
        L17:
            int r2 = jslYAf.JPiGtr.MUn
            int r3 = r2 + 13
            r4 = 41
            if (r3 == r4) goto L24
            r4 = 139(0x8b, float:1.95E-43)
            if (r3 == r4) goto L2b
            goto L17
        L24:
            int r3 = jslYAf.JPiGtr.MUn
            int r3 = r3 + r2
            int r3 = r3 + r2
            int r3 = r3 + r2
            jslYAf.JPiGtr.MUn = r3
        L2b:
            int r3 = jslYAf.JPiGtr.MUn
            int r3 = r3 >> 31
            r3 = r3 ^ 3777(0xec1, float:5.293E-42)
            int r3 = r3 >> 29
            jslYAf.JPiGtr.MUn = r3
            goto L24
        L36:
            float[] r0 = new float[r0]
            r3.XEGTzq = r0
            r3.GqixwP = r4
            r3.lXkFEI = r5
            r4 = 4538(0x11ba, float:6.359E-42)
            if (r1 > r4) goto L73
        L42:
            int r4 = jslYAf.JPiGtr.MUn
            int r5 = r4 + 26
            r0 = 1
            if (r5 == r0) goto L6c
            r0 = 36
            if (r5 == r0) goto L62
            r0 = 221(0xdd, float:3.1E-43)
            if (r5 == r0) goto L5b
            r0 = 385(0x181, float:5.4E-43)
            if (r5 == r0) goto L56
            goto L42
        L56:
            int r4 = r4 % 65
            int r4 = r4 % 16
            goto L5f
        L5b:
            r4 = r4 ^ 4645(0x1225, float:6.509E-42)
            int r4 = r4 % 66
        L5f:
            jslYAf.JPiGtr.MUn = r4
            goto L73
        L62:
            int r3 = jslYAf.JPiGtr.MUn
            int r3 = r3 + r4
            int r3 = r3 >> 125
            int r3 = r3 >> 89
            jslYAf.JPiGtr.MUn = r3
            goto L62
        L6c:
            int r4 = r4 >> 38
            int r4 = r4 * 48
            int r4 = r4 >> 63
            goto L5f
        L73:
            r3.XTvQcI = r6
            r3.TOHhBZ = r7
            r3.bEfQqm()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.JPiGtr.<init>(jslYAf.JPiGtr$jPiGtr, float, float, float):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0152, code lost:
    
        r0 = (r0 % 89) * 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0159, code lost:
    
        jslYAf.JPiGtr.WxG = ((jslYAf.JPiGtr.WxG >> 63) * 71) % 76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0178, code lost:
    
        if ((jslYAf.JPiGtr.MUn ^ 4539) != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x017a, code lost:
    
        r6 = jslYAf.JPiGtr.MUn;
        r8 = r6 + com.airbnb.paris.R2.attr.windowFixedHeightMajor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x017e, code lost:
    
        if (r8 == 26) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0182, code lost:
    
        if (r8 == 155) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0186, code lost:
    
        if (r8 == 211) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r8 == 362) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x018d, code lost:
    
        jslYAf.JPiGtr.MUn = (r6 * 1020) ^ 3986;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0193, code lost:
    
        jslYAf.JPiGtr.MUn = ((jslYAf.JPiGtr.MUn % 10) * 23) ^ 3979;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a6, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn >> 27) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01a1, code lost:
    
        jslYAf.JPiGtr.MUn = (r6 + r6) % 75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01a9, code lost:
    
        r1 = (float) java.lang.Math.tan(r1);
        r2 = r20.dqSNlM;
        r4 = (r20.TOHhBZ * r1) + 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b6, code lost:
    
        if (jslYAf.JPiGtr.MUn > 4538) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b8, code lost:
    
        r5 = jslYAf.JPiGtr.MUn;
        r6 = r5 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01be, code lost:
    
        if (r6 == 41) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c2, code lost:
    
        if (r6 == 234) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c6, code lost:
    
        if (r6 == 333) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c9, code lost:
    
        jslYAf.JPiGtr.MUn = (r5 ^ 5028) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01cf, code lost:
    
        jslYAf.JPiGtr.MUn = ((r5 % 51) >> 55) * 95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d7, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn % 17) ^ 2933;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e0, code lost:
    
        r3 = r1 * r1;
        r2[0] = 1.0f / (r4 + r3);
        r2 = r20.dqSNlM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01eb, code lost:
    
        if (jslYAf.JPiGtr.MUn > 4538) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01ed, code lost:
    
        r4 = jslYAf.JPiGtr.MUn;
        r5 = r4 + com.airbnb.paris.R2.color.error_color_material_dark;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01f3, code lost:
    
        if (r5 == 9) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01f7, code lost:
    
        if (r5 == 13) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0200, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn >> 87) % 115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01fa, code lost:
    
        jslYAf.JPiGtr.MUn = (r4 ^ 2019) >> 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0208, code lost:
    
        r2[1] = (-2.0f) * r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0211, code lost:
    
        if (jslYAf.JPiGtr.WxG > 8674) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0215, code lost:
    
        if (jslYAf.JPiGtr.MUn > 4538) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0217, code lost:
    
        r0 = jslYAf.JPiGtr.MUn;
        r1 = r0 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x021d, code lost:
    
        if (r1 == 64) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0221, code lost:
    
        if (r1 == 142) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0225, code lost:
    
        if (r1 == 253) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0236, code lost:
    
        jslYAf.JPiGtr.MUn = ((jslYAf.JPiGtr.MUn ^ 2672) >> 100) * 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0228, code lost:
    
        jslYAf.JPiGtr.MUn ^= 6125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x022f, code lost:
    
        jslYAf.JPiGtr.MUn = ((r0 % 25) * 45) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0241, code lost:
    
        r0 = jslYAf.JPiGtr.WxG;
        r1 = r0 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0247, code lost:
    
        if (r1 == 97) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x024b, code lost:
    
        if (r1 == 184) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x024f, code lost:
    
        if (r1 == 246) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0253, code lost:
    
        if (r1 == 394) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0256, code lost:
    
        jslYAf.JPiGtr.WxG = (jslYAf.JPiGtr.WxG % 99) >> 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0260, code lost:
    
        if (jslYAf.JPiGtr.MUn > 4538) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0262, code lost:
    
        r0 = jslYAf.JPiGtr.MUn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0268, code lost:
    
        if ((r0 + 182) == 31) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x026b, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn + r0) * 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02f5, code lost:
    
        r0 = (jslYAf.JPiGtr.WxG >> 98) ^ 4506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0302, code lost:
    
        jslYAf.JPiGtr.WxG = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02fc, code lost:
    
        r0 = (jslYAf.JPiGtr.WxG >> 85) >> 76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0302, code lost:
    
        r0 = (jslYAf.JPiGtr.WxG >> 85) >> 76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0273, code lost:
    
        r1 = jslYAf.JPiGtr.MUn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0275, code lost:
    
        if (r1 > 4538) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0277, code lost:
    
        r2 = jslYAf.JPiGtr.MUn;
        r0 = r2 + 195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x027d, code lost:
    
        if (r0 == 40) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0281, code lost:
    
        if (r0 == 139) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x029a, code lost:
    
        jslYAf.JPiGtr.MUn = ((r2 % 16) % 93) % 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0285, code lost:
    
        if (r0 == 257) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0289, code lost:
    
        if (r0 == 428) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x028c, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn * 93) >> 89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02a7, code lost:
    
        jslYAf.JPiGtr.MUn = (r2 >> 21) * 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02a7, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn + r2) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02aa, code lost:
    
        r2 = (r0 % 39) % 40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02b0, code lost:
    
        if ((r1 ^ 4539) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02b2, code lost:
    
        r3 = jslYAf.JPiGtr.MUn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02b8, code lost:
    
        if ((r3 + com.airbnb.paris.R2.color.material_grey_50) == 21) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x02bb, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn >> 91) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02c3, code lost:
    
        jslYAf.JPiGtr.WxG = r2 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02c6, code lost:
    
        if (r1 > 4538) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x02c8, code lost:
    
        r0 = jslYAf.JPiGtr.MUn;
        r1 = r0 + 169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02ce, code lost:
    
        if (r1 == 71) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02d2, code lost:
    
        if (r1 == 122) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02d6, code lost:
    
        if (r1 == 152) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x02d9, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn >> 50) * 126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02e2, code lost:
    
        jslYAf.JPiGtr.MUn = ((jslYAf.JPiGtr.MUn * 114) >> 82) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02ec, code lost:
    
        jslYAf.JPiGtr.MUn = ((jslYAf.JPiGtr.MUn * 72) + r0) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0305, code lost:
    
        r2 = r20.dqSNlM;
        r4 = r2[0];
        r2[2] = r4;
        r5 = r20.MXbHeP;
        r5[0] = ((r3 - 1.0f) * 2.0f) * r4;
        r5[1] = ((1.0f - (r20.TOHhBZ * r1)) + r3) * r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x031d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (r8 <= 4538) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r3 = jslYAf.JPiGtr.MUn;
        r6 = r3 + 312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        if (r6 == 37) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        if (r6 == 183) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        jslYAf.JPiGtr.MUn = ((jslYAf.JPiGtr.MUn * 98) >> 69) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        jslYAf.JPiGtr.MUn = ((r3 >> 109) * 77) % 87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        r3 = ((1.0f - r17) * 2.0f) * r20.dqSNlM[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        if (jslYAf.JPiGtr.MUn > 4538) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
    
        r6 = jslYAf.JPiGtr.MUn;
        r8 = r6 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
    
        if (r8 == 10) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        jslYAf.JPiGtr.MUn = (r6 * 49) % 92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r8 == 190) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00da, code lost:
    
        if (r8 == 343) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
    
        if (r8 == 438) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e1, code lost:
    
        r6 = ((r6 % 18) * 93) % 119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ea, code lost:
    
        jslYAf.JPiGtr.MUn = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ec, code lost:
    
        jslYAf.JPiGtr.MUn = (jslYAf.JPiGtr.MUn % 76) >> 79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e8, code lost:
    
        r6 = r6 * 3248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fc, code lost:
    
        r2[0] = r3;
        r20.MXbHeP[1] = ((1.0f - (r20.TOHhBZ * r1)) + r17) * r20.dqSNlM[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010f, code lost:
    
        if (jslYAf.JPiGtr.WxG > 8674) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0115, code lost:
    
        if ((jslYAf.JPiGtr.MUn ^ 4539) == 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0117, code lost:
    
        r0 = jslYAf.JPiGtr.MUn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011b, code lost:
    
        if ((r0 + 208) == 75) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011e, code lost:
    
        jslYAf.JPiGtr.MUn = (r0 ^ 5425) >> 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0124, code lost:
    
        r0 = jslYAf.JPiGtr.WxG + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0129, code lost:
    
        if (r0 == 14) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012d, code lost:
    
        if (r0 == 129) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0130, code lost:
    
        jslYAf.JPiGtr.WxG = ((jslYAf.JPiGtr.WxG >> 48) % 27) * 98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013e, code lost:
    
        if ((jslYAf.JPiGtr.MUn ^ 4539) == 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0140, code lost:
    
        r0 = jslYAf.JPiGtr.MUn;
        r1 = r0 + 234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0146, code lost:
    
        if (r1 == 49) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x014a, code lost:
    
        if (r1 == 132) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014d, code lost:
    
        r0 = (r0 * 30) >> 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0156, code lost:
    
        jslYAf.JPiGtr.MUn = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bEfQqm() {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.JPiGtr.bEfQqm():void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    float lFaqAb(float r14) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jslYAf.JPiGtr.lFaqAb(float):float");
    }
}
