package com.apollographql.apollo3.cache.normalized.sql.internal.blob2;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Blobs.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/apollographql/apollo3/cache/normalized/sql/internal/blob2/Blobs;", "", i0.a.b, "", "blob", "", "date", "", "(Ljava/lang/String;[BLjava/lang/Long;)V", "getBlob", "()[B", "getDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getKey", "()Ljava/lang/String;", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;[BLjava/lang/Long;)Lcom/apollographql/apollo3/cache/normalized/sql/internal/blob2/Blobs;", "equals", "", "other", "hashCode", "", "toString", "apollo-normalized-cache-sqlite-incubating_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Blobs {
    private final byte[] blob;
    private final Long date;
    private final String key;

    public Blobs(String key, byte[] blob, Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(blob, "blob");
        this.key = key;
        this.blob = blob;
        this.date = l;
    }

    public static /* synthetic */ Blobs copy$default(Blobs blobs, String str, byte[] bArr, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blobs.key;
        }
        if ((i & 2) != 0) {
            bArr = blobs.blob;
        }
        if ((i & 4) != 0) {
            l = blobs.date;
        }
        return blobs.copy(str, bArr, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getBlob() {
        return this.blob;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getDate() {
        return this.date;
    }

    public final Blobs copy(String key, byte[] blob, Long date) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(blob, "blob");
        return new Blobs(key, blob, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Blobs)) {
            return false;
        }
        Blobs blobs = (Blobs) other;
        return Intrinsics.areEqual(this.key, blobs.key) && Intrinsics.areEqual(this.blob, blobs.blob) && Intrinsics.areEqual(this.date, blobs.date);
    }

    public final byte[] getBlob() {
        return this.blob;
    }

    public final Long getDate() {
        return this.date;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int hashCode = ((this.key.hashCode() * 31) + Arrays.hashCode(this.blob)) * 31;
        Long l = this.date;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "Blobs(key=" + this.key + ", blob=" + Arrays.toString(this.blob) + ", date=" + this.date + ')';
    }
}
