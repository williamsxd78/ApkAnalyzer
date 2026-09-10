package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.util.Charsets;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public class DataInput {
    private int bufferPosition = 0;
    private final byte[] inputBuffer;

    public DataInput(byte[] bArr) {
        this.inputBuffer = bArr;
    }

    private int peek(int i) {
        try {
            return this.inputBuffer[this.bufferPosition + i] & 255;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    private int read() {
        try {
            byte[] bArr = this.inputBuffer;
            int i = this.bufferPosition;
            int i2 = bArr[i] & 255;
            this.bufferPosition = i + 1;
            return i2;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public int getPosition() {
        return this.bufferPosition;
    }

    public String getString() throws IOException {
        return new String(this.inputBuffer, Charsets.ISO_8859_1);
    }

    public boolean hasRemaining() {
        return this.bufferPosition < this.inputBuffer.length;
    }

    public int length() {
        return this.inputBuffer.length;
    }

    public int peekUnsignedByte(int i) throws IOException {
        int peek = peek(i);
        if (peek >= 0) {
            return peek;
        }
        throw new EOFException();
    }

    public byte readByte() throws IOException {
        try {
            byte[] bArr = this.inputBuffer;
            int i = this.bufferPosition;
            byte b = bArr[i];
            this.bufferPosition = i + 1;
            return b;
        } catch (RuntimeException unused) {
            return (byte) -1;
        }
    }

    public byte[] readBytes(int i) throws IOException {
        if (i < 0) {
            throw new IOException("length is negative");
        }
        byte[] bArr = this.inputBuffer;
        int length = bArr.length;
        int i2 = this.bufferPosition;
        if (length - i2 < i) {
            throw new EOFException();
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, i2, bArr2, 0, i);
        this.bufferPosition += i;
        return bArr2;
    }

    public int readInt() throws IOException {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return read4 | (read << 24) | (read2 << 16) | (read3 << 8);
        }
        throw new EOFException();
    }

    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    public int readUnsignedByte() throws IOException {
        int read = read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public int readUnsignedShort() throws IOException {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public void setPosition(int i) {
        this.bufferPosition = i;
    }
}
