package com.inmobile;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J&\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&¨\u0006\u000b"}, d2 = {"Lcom/inmobile/MMENetworking;", "", "sendPayloadMultipart", "Ljava/util/concurrent/Future;", "", "data", "serverUrl", "", "", "callback", "Lcom/inmobile/InMobileCallback;", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface MMENetworking {
    Future<byte[]> sendPayloadMultipart(byte[] data, String serverUrl);

    void sendPayloadMultipart(byte[] data, String serverUrl, InMobileCallback<byte[]> callback);
}
