package com.apollographql.apollo3.cache.normalized.sql.internal.blob;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Blobs.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/apollographql/apollo3/cache/normalized/sql/internal/blob/Blobs;", "", i0.a.b, "", "blob", "", "(Ljava/lang/String;[B)V", "getBlob", "()[B", "getKey", "()Ljava/lang/String;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "apollo-normalized-cache-sqlite-incubating_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Blobs {
    private final byte[] blob;
    private final String key;

    public Blobs(String key, byte[] blob) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(blob, "blob");
        this.key = key;
        this.blob = blob;
    }

    public static /* synthetic */ Blobs copy$default(Blobs blobs, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blobs.key;
        }
        if ((i & 2) != 0) {
            bArr = blobs.blob;
        }
        return blobs.copy(str, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getBlob() {
        return this.blob;
    }

    public final Blobs copy(String key, byte[] blob) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(blob, "blob");
        return new Blobs(key, blob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Blobs)) {
            return false;
        }
        Blobs blobs = (Blobs) other;
        return Intrinsics.areEqual(this.key, blobs.key) && Intrinsics.areEqual(this.blob, blobs.blob);
    }

    public final byte[] getBlob() {
        return this.blob;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + Arrays.hashCode(this.blob);
    }

    public String toString() {
        return "Blobs(key=" + this.key + ", blob=" + Arrays.toString(this.blob) + ')';
    }
}
