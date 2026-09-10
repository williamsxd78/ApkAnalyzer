package com.vivaaerobus.app.basket.presentation.getBasket;

import com.vivaaerobus.app.analytics.presentation.AnalyticsConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetBasketAnalyticsData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/basket/presentation/getBasket/GetBasketAnalyticsData;", "", "ruteList", "", "passengerTypeList", "tripType", AnalyticsConstants.MODALITY_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRuteList", "()Ljava/lang/String;", "getPassengerTypeList", "getTripType", "getModality", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "basket_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetBasketAnalyticsData {
    private final String modality;
    private final String passengerTypeList;
    private final String ruteList;
    private final String tripType;

    public GetBasketAnalyticsData(String ruteList, String passengerTypeList, String tripType, String modality) {
        Intrinsics.checkNotNullParameter(ruteList, "ruteList");
        Intrinsics.checkNotNullParameter(passengerTypeList, "passengerTypeList");
        Intrinsics.checkNotNullParameter(tripType, "tripType");
        Intrinsics.checkNotNullParameter(modality, "modality");
        this.ruteList = ruteList;
        this.passengerTypeList = passengerTypeList;
        this.tripType = tripType;
        this.modality = modality;
    }

    public static /* synthetic */ GetBasketAnalyticsData copy$default(GetBasketAnalyticsData getBasketAnalyticsData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBasketAnalyticsData.ruteList;
        }
        if ((i & 2) != 0) {
            str2 = getBasketAnalyticsData.passengerTypeList;
        }
        if ((i & 4) != 0) {
            str3 = getBasketAnalyticsData.tripType;
        }
        if ((i & 8) != 0) {
            str4 = getBasketAnalyticsData.modality;
        }
        return getBasketAnalyticsData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRuteList() {
        return this.ruteList;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassengerTypeList() {
        return this.passengerTypeList;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTripType() {
        return this.tripType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getModality() {
        return this.modality;
    }

    public final GetBasketAnalyticsData copy(String ruteList, String passengerTypeList, String tripType, String modality) {
        Intrinsics.checkNotNullParameter(ruteList, "ruteList");
        Intrinsics.checkNotNullParameter(passengerTypeList, "passengerTypeList");
        Intrinsics.checkNotNullParameter(tripType, "tripType");
        Intrinsics.checkNotNullParameter(modality, "modality");
        return new GetBasketAnalyticsData(ruteList, passengerTypeList, tripType, modality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetBasketAnalyticsData)) {
            return false;
        }
        GetBasketAnalyticsData getBasketAnalyticsData = (GetBasketAnalyticsData) other;
        return Intrinsics.areEqual(this.ruteList, getBasketAnalyticsData.ruteList) && Intrinsics.areEqual(this.passengerTypeList, getBasketAnalyticsData.passengerTypeList) && Intrinsics.areEqual(this.tripType, getBasketAnalyticsData.tripType) && Intrinsics.areEqual(this.modality, getBasketAnalyticsData.modality);
    }

    public final String getModality() {
        return this.modality;
    }

    public final String getPassengerTypeList() {
        return this.passengerTypeList;
    }

    public final String getRuteList() {
        return this.ruteList;
    }

    public final String getTripType() {
        return this.tripType;
    }

    public int hashCode() {
        return (((((this.ruteList.hashCode() * 31) + this.passengerTypeList.hashCode()) * 31) + this.tripType.hashCode()) * 31) + this.modality.hashCode();
    }

    public String toString() {
        return "GetBasketAnalyticsData(ruteList=" + this.ruteList + ", passengerTypeList=" + this.passengerTypeList + ", tripType=" + this.tripType + ", modality=" + this.modality + ")";
    }
}
