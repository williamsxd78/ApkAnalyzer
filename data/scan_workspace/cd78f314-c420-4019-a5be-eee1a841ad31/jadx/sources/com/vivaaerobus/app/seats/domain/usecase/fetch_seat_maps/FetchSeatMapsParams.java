package com.vivaaerobus.app.seats.domain.usecase.fetch_seat_maps;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchSeatMapsParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/seats/domain/usecase/fetch_seat_maps/FetchSeatMapsParams;", "", "basketId", "", "journeyKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBasketId", "()Ljava/lang/String;", "getJourneyKey", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "seats_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FetchSeatMapsParams {
    private final String basketId;
    private final String journeyKey;

    public FetchSeatMapsParams(String basketId, String str) {
        Intrinsics.checkNotNullParameter(basketId, "basketId");
        this.basketId = basketId;
        this.journeyKey = str;
    }

    public static /* synthetic */ FetchSeatMapsParams copy$default(FetchSeatMapsParams fetchSeatMapsParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchSeatMapsParams.basketId;
        }
        if ((i & 2) != 0) {
            str2 = fetchSeatMapsParams.journeyKey;
        }
        return fetchSeatMapsParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBasketId() {
        return this.basketId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public final FetchSeatMapsParams copy(String basketId, String journeyKey) {
        Intrinsics.checkNotNullParameter(basketId, "basketId");
        return new FetchSeatMapsParams(basketId, journeyKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchSeatMapsParams)) {
            return false;
        }
        FetchSeatMapsParams fetchSeatMapsParams = (FetchSeatMapsParams) other;
        return Intrinsics.areEqual(this.basketId, fetchSeatMapsParams.basketId) && Intrinsics.areEqual(this.journeyKey, fetchSeatMapsParams.journeyKey);
    }

    public final String getBasketId() {
        return this.basketId;
    }

    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public int hashCode() {
        int hashCode = this.basketId.hashCode() * 31;
        String str = this.journeyKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FetchSeatMapsParams(basketId=" + this.basketId + ", journeyKey=" + this.journeyKey + ")";
    }
}
