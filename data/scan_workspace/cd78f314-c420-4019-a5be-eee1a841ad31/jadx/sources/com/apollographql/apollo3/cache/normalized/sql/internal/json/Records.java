package com.apollographql.apollo3.cache.normalized.sql.internal.json;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Records.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/apollographql/apollo3/cache/normalized/sql/internal/json/Records;", "", "_id", "", i0.a.b, "", "record", "(JLjava/lang/String;Ljava/lang/String;)V", "get_id", "()J", "getKey", "()Ljava/lang/String;", "getRecord", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "apollo-normalized-cache-sqlite-incubating_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Records {
    private final long _id;
    private final String key;
    private final String record;

    public Records(long j, String key, String record) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(record, "record");
        this._id = j;
        this.key = key;
        this.record = record;
    }

    public static /* synthetic */ Records copy$default(Records records, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = records._id;
        }
        if ((i & 2) != 0) {
            str = records.key;
        }
        if ((i & 4) != 0) {
            str2 = records.record;
        }
        return records.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRecord() {
        return this.record;
    }

    public final Records copy(long _id, String key, String record) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(record, "record");
        return new Records(_id, key, record);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Records)) {
            return false;
        }
        Records records = (Records) other;
        return this._id == records._id && Intrinsics.areEqual(this.key, records.key) && Intrinsics.areEqual(this.record, records.record);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getRecord() {
        return this.record;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        return (((Long.hashCode(this._id) * 31) + this.key.hashCode()) * 31) + this.record.hashCode();
    }

    public String toString() {
        return "Records(_id=" + this._id + ", key=" + this.key + ", record=" + this.record + ')';
    }
}
