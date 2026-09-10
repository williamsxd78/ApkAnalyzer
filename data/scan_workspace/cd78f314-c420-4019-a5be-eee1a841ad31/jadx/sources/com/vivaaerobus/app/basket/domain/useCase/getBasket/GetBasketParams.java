package com.vivaaerobus.app.basket.domain.useCase.getBasket;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetBasketParams.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/basket/domain/useCase/getBasket/GetBasketParams;", "", "basketId", "", "isAddPassengersFlow", "", "<init>", "(Ljava/lang/String;Z)V", "getBasketId", "()Ljava/lang/String;", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "basket_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetBasketParams {
    private final String basketId;
    private final boolean isAddPassengersFlow;

    public GetBasketParams(String basketId, boolean z) {
        Intrinsics.checkNotNullParameter(basketId, "basketId");
        this.basketId = basketId;
        this.isAddPassengersFlow = z;
    }

    public static /* synthetic */ GetBasketParams copy$default(GetBasketParams getBasketParams, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBasketParams.basketId;
        }
        if ((i & 2) != 0) {
            z = getBasketParams.isAddPassengersFlow;
        }
        return getBasketParams.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBasketId() {
        return this.basketId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAddPassengersFlow() {
        return this.isAddPassengersFlow;
    }

    public final GetBasketParams copy(String basketId, boolean isAddPassengersFlow) {
        Intrinsics.checkNotNullParameter(basketId, "basketId");
        return new GetBasketParams(basketId, isAddPassengersFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetBasketParams)) {
            return false;
        }
        GetBasketParams getBasketParams = (GetBasketParams) other;
        return Intrinsics.areEqual(this.basketId, getBasketParams.basketId) && this.isAddPassengersFlow == getBasketParams.isAddPassengersFlow;
    }

    public final String getBasketId() {
        return this.basketId;
    }

    public int hashCode() {
        return (this.basketId.hashCode() * 31) + Boolean.hashCode(this.isAddPassengersFlow);
    }

    public final boolean isAddPassengersFlow() {
        return this.isAddPassengersFlow;
    }

    public String toString() {
        return "GetBasketParams(basketId=" + this.basketId + ", isAddPassengersFlow=" + this.isAddPassengersFlow + ")";
    }
}
