package com.vivaaerobus.app.newContentful.domain.usecase.fetchCallToAction;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchCallToActionParams.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/usecase/fetchCallToAction/FetchCallToActionParams;", "", "callToActionIds", "", "", "withNetworkConnection", "", "<init>", "(Ljava/util/List;Z)V", "getCallToActionIds", "()Ljava/util/List;", "getWithNetworkConnection", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FetchCallToActionParams {
    private final List<String> callToActionIds;
    private final boolean withNetworkConnection;

    public FetchCallToActionParams(List<String> callToActionIds, boolean z) {
        Intrinsics.checkNotNullParameter(callToActionIds, "callToActionIds");
        this.callToActionIds = callToActionIds;
        this.withNetworkConnection = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchCallToActionParams copy$default(FetchCallToActionParams fetchCallToActionParams, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fetchCallToActionParams.callToActionIds;
        }
        if ((i & 2) != 0) {
            z = fetchCallToActionParams.withNetworkConnection;
        }
        return fetchCallToActionParams.copy(list, z);
    }

    public final List<String> component1() {
        return this.callToActionIds;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWithNetworkConnection() {
        return this.withNetworkConnection;
    }

    public final FetchCallToActionParams copy(List<String> callToActionIds, boolean withNetworkConnection) {
        Intrinsics.checkNotNullParameter(callToActionIds, "callToActionIds");
        return new FetchCallToActionParams(callToActionIds, withNetworkConnection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchCallToActionParams)) {
            return false;
        }
        FetchCallToActionParams fetchCallToActionParams = (FetchCallToActionParams) other;
        return Intrinsics.areEqual(this.callToActionIds, fetchCallToActionParams.callToActionIds) && this.withNetworkConnection == fetchCallToActionParams.withNetworkConnection;
    }

    public final List<String> getCallToActionIds() {
        return this.callToActionIds;
    }

    public final boolean getWithNetworkConnection() {
        return this.withNetworkConnection;
    }

    public int hashCode() {
        return (this.callToActionIds.hashCode() * 31) + Boolean.hashCode(this.withNetworkConnection);
    }

    public String toString() {
        return "FetchCallToActionParams(callToActionIds=" + this.callToActionIds + ", withNetworkConnection=" + this.withNetworkConnection + ")";
    }
}
