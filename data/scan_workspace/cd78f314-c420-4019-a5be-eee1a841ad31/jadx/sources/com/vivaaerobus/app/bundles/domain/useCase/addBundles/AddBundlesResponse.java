package com.vivaaerobus.app.bundles.domain.useCase.addBundles;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AddBundlesResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/bundles/domain/useCase/addBundles/AddBundlesResponse;", "", "requiredProcessPayment", "", "<init>", "(Z)V", "getRequiredProcessPayment", "()Z", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "bundles_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddBundlesResponse {
    private final boolean requiredProcessPayment;

    public AddBundlesResponse() {
        this(false, 1, null);
    }

    public AddBundlesResponse(boolean z) {
        this.requiredProcessPayment = z;
    }

    public /* synthetic */ AddBundlesResponse(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ AddBundlesResponse copy$default(AddBundlesResponse addBundlesResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = addBundlesResponse.requiredProcessPayment;
        }
        return addBundlesResponse.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRequiredProcessPayment() {
        return this.requiredProcessPayment;
    }

    public final AddBundlesResponse copy(boolean requiredProcessPayment) {
        return new AddBundlesResponse(requiredProcessPayment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddBundlesResponse) && this.requiredProcessPayment == ((AddBundlesResponse) other).requiredProcessPayment;
    }

    public final boolean getRequiredProcessPayment() {
        return this.requiredProcessPayment;
    }

    public int hashCode() {
        return Boolean.hashCode(this.requiredProcessPayment);
    }

    public String toString() {
        return "AddBundlesResponse(requiredProcessPayment=" + this.requiredProcessPayment + ")";
    }
}
