package androidx.media3.exoplayer;

/* loaded from: classes12.dex */
public interface RendererCapabilitiesList {

    /* loaded from: classes12.dex */
    public interface Factory {
        RendererCapabilitiesList createRendererCapabilitiesList();
    }

    RendererCapabilities[] getRendererCapabilities();

    void release();

    int size();
}
