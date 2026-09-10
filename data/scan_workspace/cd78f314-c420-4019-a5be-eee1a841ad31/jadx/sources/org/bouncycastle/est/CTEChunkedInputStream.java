package org.bouncycastle.est;

import java.io.InputStream;

/* loaded from: classes9.dex */
public class CTEChunkedInputStream extends InputStream {
    int chunkLen = 0;
    private InputStream src;

    public CTEChunkedInputStream(InputStream inputStream) {
        this.src = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        return r0.toString().trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String readEOL() throws java.io.IOException {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
        L5:
            java.io.InputStream r1 = r3.src
            int r1 = r1.read()
            r2 = -1
            if (r1 != r2) goto L1f
            int r3 = r0.size()
            if (r3 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r3.trim()
            return r3
        L1f:
            r2 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r2)
            r2 = 10
            if (r1 != r2) goto L5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.est.CTEChunkedInputStream.readEOL():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        r0 = java.lang.Integer.parseInt(r0.trim(), 16);
        r4.chunkLen = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r0 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        readEOL();
        r4.chunkLen = Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r4.chunkLen--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        return r4.src.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        if (r0 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        r0 = readEOL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0.length() == 0) goto L20;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read() throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.chunkLen
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L8
            return r1
        L8:
            if (r0 != 0) goto L2d
        La:
            java.lang.String r0 = r4.readEOL()
            if (r0 == 0) goto L16
            int r3 = r0.length()
            if (r3 == 0) goto La
        L16:
            if (r0 != 0) goto L19
            return r1
        L19:
            java.lang.String r0 = r0.trim()
            r3 = 16
            int r0 = java.lang.Integer.parseInt(r0, r3)
            r4.chunkLen = r0
            if (r0 != 0) goto L2d
            r4.readEOL()
            r4.chunkLen = r2
            return r1
        L2d:
            java.io.InputStream r0 = r4.src
            int r0 = r0.read()
            int r1 = r4.chunkLen
            int r1 = r1 + (-1)
            r4.chunkLen = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.est.CTEChunkedInputStream.read():int");
    }
}
