package com.vivaaerobus.app.components.flightOptions.flightFilter.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlightFilterAssets.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/vivaaerobus/app/components/flightOptions/flightFilter/model/FlightFilterAssets;", "", "recommendedIconUrl", "", "departureTimeIconUrl", "bestPriceIconUrl", "flightTimeIconUrl", "promotionsIconUrl", "atNightIconUrl", "inTheMorningIconUrl", "inTheAfternoonIconUrl", "directFlightsIconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRecommendedIconUrl", "()Ljava/lang/String;", "getDepartureTimeIconUrl", "getBestPriceIconUrl", "getFlightTimeIconUrl", "getPromotionsIconUrl", "getAtNightIconUrl", "getInTheMorningIconUrl", "getInTheAfternoonIconUrl", "getDirectFlightsIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlightFilterAssets {
    public static final int $stable = 0;
    private final String atNightIconUrl;
    private final String bestPriceIconUrl;
    private final String departureTimeIconUrl;
    private final String directFlightsIconUrl;
    private final String flightTimeIconUrl;
    private final String inTheAfternoonIconUrl;
    private final String inTheMorningIconUrl;
    private final String promotionsIconUrl;
    private final String recommendedIconUrl;

    public FlightFilterAssets(String recommendedIconUrl, String departureTimeIconUrl, String bestPriceIconUrl, String flightTimeIconUrl, String promotionsIconUrl, String atNightIconUrl, String inTheMorningIconUrl, String inTheAfternoonIconUrl, String directFlightsIconUrl) {
        Intrinsics.checkNotNullParameter(recommendedIconUrl, "recommendedIconUrl");
        Intrinsics.checkNotNullParameter(departureTimeIconUrl, "departureTimeIconUrl");
        Intrinsics.checkNotNullParameter(bestPriceIconUrl, "bestPriceIconUrl");
        Intrinsics.checkNotNullParameter(flightTimeIconUrl, "flightTimeIconUrl");
        Intrinsics.checkNotNullParameter(promotionsIconUrl, "promotionsIconUrl");
        Intrinsics.checkNotNullParameter(atNightIconUrl, "atNightIconUrl");
        Intrinsics.checkNotNullParameter(inTheMorningIconUrl, "inTheMorningIconUrl");
        Intrinsics.checkNotNullParameter(inTheAfternoonIconUrl, "inTheAfternoonIconUrl");
        Intrinsics.checkNotNullParameter(directFlightsIconUrl, "directFlightsIconUrl");
        this.recommendedIconUrl = recommendedIconUrl;
        this.departureTimeIconUrl = departureTimeIconUrl;
        this.bestPriceIconUrl = bestPriceIconUrl;
        this.flightTimeIconUrl = flightTimeIconUrl;
        this.promotionsIconUrl = promotionsIconUrl;
        this.atNightIconUrl = atNightIconUrl;
        this.inTheMorningIconUrl = inTheMorningIconUrl;
        this.inTheAfternoonIconUrl = inTheAfternoonIconUrl;
        this.directFlightsIconUrl = directFlightsIconUrl;
    }

    public static /* synthetic */ FlightFilterAssets copy$default(FlightFilterAssets flightFilterAssets, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightFilterAssets.recommendedIconUrl;
        }
        if ((i & 2) != 0) {
            str2 = flightFilterAssets.departureTimeIconUrl;
        }
        if ((i & 4) != 0) {
            str3 = flightFilterAssets.bestPriceIconUrl;
        }
        if ((i & 8) != 0) {
            str4 = flightFilterAssets.flightTimeIconUrl;
        }
        if ((i & 16) != 0) {
            str5 = flightFilterAssets.promotionsIconUrl;
        }
        if ((i & 32) != 0) {
            str6 = flightFilterAssets.atNightIconUrl;
        }
        if ((i & 64) != 0) {
            str7 = flightFilterAssets.inTheMorningIconUrl;
        }
        if ((i & 128) != 0) {
            str8 = flightFilterAssets.inTheAfternoonIconUrl;
        }
        if ((i & 256) != 0) {
            str9 = flightFilterAssets.directFlightsIconUrl;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return flightFilterAssets.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRecommendedIconUrl() {
        return this.recommendedIconUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDepartureTimeIconUrl() {
        return this.departureTimeIconUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBestPriceIconUrl() {
        return this.bestPriceIconUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFlightTimeIconUrl() {
        return this.flightTimeIconUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPromotionsIconUrl() {
        return this.promotionsIconUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAtNightIconUrl() {
        return this.atNightIconUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getInTheMorningIconUrl() {
        return this.inTheMorningIconUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInTheAfternoonIconUrl() {
        return this.inTheAfternoonIconUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDirectFlightsIconUrl() {
        return this.directFlightsIconUrl;
    }

    public final FlightFilterAssets copy(String recommendedIconUrl, String departureTimeIconUrl, String bestPriceIconUrl, String flightTimeIconUrl, String promotionsIconUrl, String atNightIconUrl, String inTheMorningIconUrl, String inTheAfternoonIconUrl, String directFlightsIconUrl) {
        Intrinsics.checkNotNullParameter(recommendedIconUrl, "recommendedIconUrl");
        Intrinsics.checkNotNullParameter(departureTimeIconUrl, "departureTimeIconUrl");
        Intrinsics.checkNotNullParameter(bestPriceIconUrl, "bestPriceIconUrl");
        Intrinsics.checkNotNullParameter(flightTimeIconUrl, "flightTimeIconUrl");
        Intrinsics.checkNotNullParameter(promotionsIconUrl, "promotionsIconUrl");
        Intrinsics.checkNotNullParameter(atNightIconUrl, "atNightIconUrl");
        Intrinsics.checkNotNullParameter(inTheMorningIconUrl, "inTheMorningIconUrl");
        Intrinsics.checkNotNullParameter(inTheAfternoonIconUrl, "inTheAfternoonIconUrl");
        Intrinsics.checkNotNullParameter(directFlightsIconUrl, "directFlightsIconUrl");
        return new FlightFilterAssets(recommendedIconUrl, departureTimeIconUrl, bestPriceIconUrl, flightTimeIconUrl, promotionsIconUrl, atNightIconUrl, inTheMorningIconUrl, inTheAfternoonIconUrl, directFlightsIconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightFilterAssets)) {
            return false;
        }
        FlightFilterAssets flightFilterAssets = (FlightFilterAssets) other;
        return Intrinsics.areEqual(this.recommendedIconUrl, flightFilterAssets.recommendedIconUrl) && Intrinsics.areEqual(this.departureTimeIconUrl, flightFilterAssets.departureTimeIconUrl) && Intrinsics.areEqual(this.bestPriceIconUrl, flightFilterAssets.bestPriceIconUrl) && Intrinsics.areEqual(this.flightTimeIconUrl, flightFilterAssets.flightTimeIconUrl) && Intrinsics.areEqual(this.promotionsIconUrl, flightFilterAssets.promotionsIconUrl) && Intrinsics.areEqual(this.atNightIconUrl, flightFilterAssets.atNightIconUrl) && Intrinsics.areEqual(this.inTheMorningIconUrl, flightFilterAssets.inTheMorningIconUrl) && Intrinsics.areEqual(this.inTheAfternoonIconUrl, flightFilterAssets.inTheAfternoonIconUrl) && Intrinsics.areEqual(this.directFlightsIconUrl, flightFilterAssets.directFlightsIconUrl);
    }

    public final String getAtNightIconUrl() {
        return this.atNightIconUrl;
    }

    public final String getBestPriceIconUrl() {
        return this.bestPriceIconUrl;
    }

    public final String getDepartureTimeIconUrl() {
        return this.departureTimeIconUrl;
    }

    public final String getDirectFlightsIconUrl() {
        return this.directFlightsIconUrl;
    }

    public final String getFlightTimeIconUrl() {
        return this.flightTimeIconUrl;
    }

    public final String getInTheAfternoonIconUrl() {
        return this.inTheAfternoonIconUrl;
    }

    public final String getInTheMorningIconUrl() {
        return this.inTheMorningIconUrl;
    }

    public final String getPromotionsIconUrl() {
        return this.promotionsIconUrl;
    }

    public final String getRecommendedIconUrl() {
        return this.recommendedIconUrl;
    }

    public int hashCode() {
        return (((((((((((((((this.recommendedIconUrl.hashCode() * 31) + this.departureTimeIconUrl.hashCode()) * 31) + this.bestPriceIconUrl.hashCode()) * 31) + this.flightTimeIconUrl.hashCode()) * 31) + this.promotionsIconUrl.hashCode()) * 31) + this.atNightIconUrl.hashCode()) * 31) + this.inTheMorningIconUrl.hashCode()) * 31) + this.inTheAfternoonIconUrl.hashCode()) * 31) + this.directFlightsIconUrl.hashCode();
    }

    public String toString() {
        return "FlightFilterAssets(recommendedIconUrl=" + this.recommendedIconUrl + ", departureTimeIconUrl=" + this.departureTimeIconUrl + ", bestPriceIconUrl=" + this.bestPriceIconUrl + ", flightTimeIconUrl=" + this.flightTimeIconUrl + ", promotionsIconUrl=" + this.promotionsIconUrl + ", atNightIconUrl=" + this.atNightIconUrl + ", inTheMorningIconUrl=" + this.inTheMorningIconUrl + ", inTheAfternoonIconUrl=" + this.inTheAfternoonIconUrl + ", directFlightsIconUrl=" + this.directFlightsIconUrl + ")";
    }
}
