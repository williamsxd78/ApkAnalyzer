package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class COSFilterInputStream extends FilterInputStream {
    private long position;
    private int range;
    private int[][] ranges;

    public COSFilterInputStream(InputStream inputStream, int[] iArr) {
        super(inputStream);
        this.position = 0L;
        calculateRanges(iArr);
    }

    public COSFilterInputStream(byte[] bArr, int[] iArr) {
        this(new ByteArrayInputStream(bArr), iArr);
    }

    private void calculateRanges(int[] iArr) {
        this.ranges = new int[iArr.length / 2];
        for (int i = 0; i < iArr.length / 2; i++) {
            int[][] iArr2 = this.ranges;
            int i2 = i * 2;
            int i3 = iArr[i2];
            iArr2[i] = new int[]{i3, iArr[i2 + 1] + i3};
        }
        this.range = -1;
    }

    private long getRemaining() {
        return this.ranges[this.range][1] - this.position;
    }

    private boolean nextRange() throws IOException {
        int i = this.range;
        if (i + 1 >= this.ranges.length) {
            return false;
        }
        this.range = i + 1;
        while (true) {
            long j = this.position;
            int i2 = this.ranges[this.range][0];
            if (j >= i2) {
                return true;
            }
            long skip = super.skip(i2 - j);
            if (skip == 0) {
                throw new IOException("FilterInputStream.skip() returns 0, range: " + Arrays.toString(this.ranges[this.range]));
            }
            this.position += skip;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if ((this.range == -1 || getRemaining() <= 0) && !nextRange()) {
            return -1;
        }
        int read = super.read();
        this.position++;
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if ((this.range == -1 || getRemaining() <= 0) && !nextRange()) {
            return -1;
        }
        int read = super.read(bArr, i, (int) Math.min(i2, getRemaining()));
        this.position += read;
        return read;
    }

    public byte[] toByteArray() throws IOException {
        return IOUtils.toByteArray(this);
    }
}
