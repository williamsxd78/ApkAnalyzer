package com.tom_roush.fontbox.cmap;

/* loaded from: classes3.dex */
public class CodespaceRange {
    private int codeLength;
    private int[] end;
    private byte[] endBytes;
    private int[] start;
    private byte[] startBytes;

    public CodespaceRange() {
        this.codeLength = 0;
    }

    public CodespaceRange(byte[] bArr, byte[] bArr2) {
        this.codeLength = 0;
        if (bArr.length != bArr2.length && bArr.length == 1 && bArr[0] == 0) {
            bArr = new byte[bArr2.length];
        } else if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("The start and the end values must not have different lengths.");
        }
        this.start = new int[bArr.length];
        this.end = new int[bArr2.length];
        for (int i = 0; i < bArr.length; i++) {
            this.start[i] = bArr[i] & 255;
            this.end[i] = bArr2[i] & 255;
        }
        this.codeLength = bArr2.length;
    }

    public int getCodeLength() {
        return this.codeLength;
    }

    public byte[] getEnd() {
        return this.endBytes;
    }

    public byte[] getStart() {
        return this.startBytes;
    }

    public boolean isFullMatch(byte[] bArr, int i) {
        if (this.codeLength != i) {
            return false;
        }
        for (int i2 = 0; i2 < this.codeLength; i2++) {
            int i3 = bArr[i2] & 255;
            if (i3 < this.start[i2] || i3 > this.end[i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean matches(byte[] bArr) {
        return isFullMatch(bArr, bArr.length);
    }

    void setEnd(byte[] bArr) {
        this.endBytes = bArr;
        this.end = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            this.end[i] = bArr[i] & 255;
        }
    }

    void setStart(byte[] bArr) {
        this.startBytes = bArr;
        this.start = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            this.start[i] = bArr[i] & 255;
        }
        this.codeLength = bArr.length;
    }
}
