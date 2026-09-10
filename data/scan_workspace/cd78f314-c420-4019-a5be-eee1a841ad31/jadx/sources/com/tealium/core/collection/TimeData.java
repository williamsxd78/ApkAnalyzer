package com.tealium.core.collection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tealium/core/collection/TimeData;", "", "timestamp", "", "getTimestamp", "()Ljava/lang/String;", "timestampEpoch", "", "getTimestampEpoch", "()J", "timestampLocal", "getTimestampLocal", "timestampOffset", "getTimestampOffset", "timestampUnix", "getTimestampUnix", "timestampUnixMilliseconds", "getTimestampUnixMilliseconds", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TimeData {
    String getTimestamp();

    long getTimestampEpoch();

    String getTimestampLocal();

    String getTimestampOffset();

    long getTimestampUnix();

    long getTimestampUnixMilliseconds();
}
