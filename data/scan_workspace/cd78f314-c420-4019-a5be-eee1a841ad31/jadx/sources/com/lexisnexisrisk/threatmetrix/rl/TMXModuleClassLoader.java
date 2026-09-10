package com.lexisnexisrisk.threatmetrix.rl;

/* loaded from: classes3.dex */
public class TMXModuleClassLoader extends ClassLoader {
    private static boolean RvZYgQ = false;
    public static int WEL = 7978;
    public static int dVk = 7021;
    private final ClassLoader XifRLm;

    public TMXModuleClassLoader(ClassLoader classLoader) {
        this.XifRLm = classLoader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL ^ 7978) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL + 26) == 26) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL % 77) % 123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r1 = com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.dVk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if ((com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL ^ 7978) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r2 = com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL;
        r4 = r2 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r4 == 97) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r4 == 278) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r4 == 360) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = ((r2 * 78) + r2) >> 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000c, code lost:
    
        if (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL <= 7977) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r4 == 417) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = ((r2 >> 27) * 111) % 54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL >> 69) % 41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = ((com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL >> 96) * 53) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        r2 = com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        if (r1 > 7020) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        r1 = com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.dVk;
        r6 = r1 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r6 == 74) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        if (r6 == 271) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.dVk = (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.dVk * 60) >> 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
    
        if (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL > 7977) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if ((r2 + 104) == 75) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        r6 = com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL;
        r7 = r6 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
    
        if (r7 == 45) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
    
        if (r7 == 104) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a7, code lost:
    
        if (r7 == 287) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00aa, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = (r6 + r6) ^ 1031;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b0, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = ((com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL % 107) >> 59) * 92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bb, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL ^ 2862) * 70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = (r2 + r2) % 120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c4, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.dVk = (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.dVk + r1) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
    
        if ((com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL ^ 7978) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
    
        r6 = com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d6, code lost:
    
        if ((r6 + 65) == 17) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d9, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL + r6) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e0, code lost:
    
        r7 = r7.replace(MCOFeQ.WqusdZ.RvP("tcjq4`CM-reLSkafy"), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ec, code lost:
    
        if (com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL > 7977) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ee, code lost:
    
        r6 = com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f4, code lost:
    
        if ((r6 + 39) == 35) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f7, code lost:
    
        com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.WEL = ((r6 % 60) * 15) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0105, code lost:
    
        return r6.XifRLm.getResources(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = MCOFeQ.WqusdZ.RvP("XUMUmZ\"\u007fgrtm@ptji|k");
     */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader.getResources(java.lang.String):java.util.Enumeration");
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        return this.XifRLm.loadClass(str);
    }
}
