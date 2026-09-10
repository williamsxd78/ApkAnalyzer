package androidx.media3.decoder;

/* loaded from: classes12.dex */
public abstract class DecoderOutputBuffer extends Buffer {
    public boolean shouldBeSkipped;
    public int skippedOutputBufferCount;
    public long timeUs;

    /* loaded from: classes12.dex */
    public interface Owner<S extends DecoderOutputBuffer> {
        void releaseOutputBuffer(S s);
    }

    @Override // androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.timeUs = 0L;
        this.skippedOutputBufferCount = 0;
        this.shouldBeSkipped = false;
    }

    public abstract void release();
}
