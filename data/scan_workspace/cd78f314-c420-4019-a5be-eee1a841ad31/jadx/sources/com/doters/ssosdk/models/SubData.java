package com.doters.ssosdk.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/doters/ssosdk/models/SubData;", "", "()V", "customerId", "", "user", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerId", "()Ljava/lang/String;", "getUser", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SubData {
    private final String customerId;
    private final String user;

    public SubData() {
        this("", "");
    }

    public SubData(String customerId, String user) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(user, "user");
        this.customerId = customerId;
        this.user = user;
    }

    public static /* synthetic */ SubData copy$default(SubData subData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subData.customerId;
        }
        if ((i & 2) != 0) {
            str2 = subData.user;
        }
        return subData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    public final SubData copy(String customerId, String user) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(user, "user");
        return new SubData(customerId, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubData)) {
            return false;
        }
        SubData subData = (SubData) other;
        return Intrinsics.areEqual(this.customerId, subData.customerId) && Intrinsics.areEqual(this.user, subData.user);
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return (this.customerId.hashCode() * 31) + this.user.hashCode();
    }

    public String toString() {
        return "SubData(customerId=" + this.customerId + ", user=" + this.user + ")";
    }
}
