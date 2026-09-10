package com.vivaaerobus.app.newContentful.domain.usecase.getVivaBusInstructions;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GetVivaBusInstructionsParams.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/usecase/getVivaBusInstructions/GetVivaBusInstructionsParams;", "", "withNetworkConnection", "", "<init>", "(Z)V", "getWithNetworkConnection", "()Z", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GetVivaBusInstructionsParams {
    private final boolean withNetworkConnection;

    public GetVivaBusInstructionsParams() {
        this(false, 1, null);
    }

    public GetVivaBusInstructionsParams(boolean z) {
        this.withNetworkConnection = z;
    }

    public /* synthetic */ GetVivaBusInstructionsParams(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public static /* synthetic */ GetVivaBusInstructionsParams copy$default(GetVivaBusInstructionsParams getVivaBusInstructionsParams, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getVivaBusInstructionsParams.withNetworkConnection;
        }
        return getVivaBusInstructionsParams.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getWithNetworkConnection() {
        return this.withNetworkConnection;
    }

    public final GetVivaBusInstructionsParams copy(boolean withNetworkConnection) {
        return new GetVivaBusInstructionsParams(withNetworkConnection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetVivaBusInstructionsParams) && this.withNetworkConnection == ((GetVivaBusInstructionsParams) other).withNetworkConnection;
    }

    public final boolean getWithNetworkConnection() {
        return this.withNetworkConnection;
    }

    public int hashCode() {
        return Boolean.hashCode(this.withNetworkConnection);
    }

    public String toString() {
        return "GetVivaBusInstructionsParams(withNetworkConnection=" + this.withNetworkConnection + ")";
    }
}
