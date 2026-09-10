package com.vivaaerobus.app.components.flightOptions.flightFilter.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlightFilterCopies.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0014\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u000205HÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00067"}, d2 = {"Lcom/vivaaerobus/app/components/flightOptions/flightFilter/model/FlightFilterCopies;", "", "title", "", "orderByLabel", "recommendedLabel", "departureTimeLabel", "bestPriceLabel", "flightTimeLabel", "flightFilterLabel", "promotionsLabel", "atNightLabel", "inTheMorningLabel", "inTheAfternoonLabel", "directFlightsLabel", "clearFiltersLabel", "applyFiltersLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getOrderByLabel", "getRecommendedLabel", "getDepartureTimeLabel", "getBestPriceLabel", "getFlightTimeLabel", "getFlightFilterLabel", "getPromotionsLabel", "getAtNightLabel", "getInTheMorningLabel", "getInTheAfternoonLabel", "getDirectFlightsLabel", "getClearFiltersLabel", "getApplyFiltersLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlightFilterCopies {
    public static final int $stable = 0;
    private final String applyFiltersLabel;
    private final String atNightLabel;
    private final String bestPriceLabel;
    private final String clearFiltersLabel;
    private final String departureTimeLabel;
    private final String directFlightsLabel;
    private final String flightFilterLabel;
    private final String flightTimeLabel;
    private final String inTheAfternoonLabel;
    private final String inTheMorningLabel;
    private final String orderByLabel;
    private final String promotionsLabel;
    private final String recommendedLabel;
    private final String title;

    public FlightFilterCopies(String title, String orderByLabel, String recommendedLabel, String departureTimeLabel, String bestPriceLabel, String flightTimeLabel, String flightFilterLabel, String promotionsLabel, String atNightLabel, String inTheMorningLabel, String inTheAfternoonLabel, String directFlightsLabel, String clearFiltersLabel, String applyFiltersLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(orderByLabel, "orderByLabel");
        Intrinsics.checkNotNullParameter(recommendedLabel, "recommendedLabel");
        Intrinsics.checkNotNullParameter(departureTimeLabel, "departureTimeLabel");
        Intrinsics.checkNotNullParameter(bestPriceLabel, "bestPriceLabel");
        Intrinsics.checkNotNullParameter(flightTimeLabel, "flightTimeLabel");
        Intrinsics.checkNotNullParameter(flightFilterLabel, "flightFilterLabel");
        Intrinsics.checkNotNullParameter(promotionsLabel, "promotionsLabel");
        Intrinsics.checkNotNullParameter(atNightLabel, "atNightLabel");
        Intrinsics.checkNotNullParameter(inTheMorningLabel, "inTheMorningLabel");
        Intrinsics.checkNotNullParameter(inTheAfternoonLabel, "inTheAfternoonLabel");
        Intrinsics.checkNotNullParameter(directFlightsLabel, "directFlightsLabel");
        Intrinsics.checkNotNullParameter(clearFiltersLabel, "clearFiltersLabel");
        Intrinsics.checkNotNullParameter(applyFiltersLabel, "applyFiltersLabel");
        this.title = title;
        this.orderByLabel = orderByLabel;
        this.recommendedLabel = recommendedLabel;
        this.departureTimeLabel = departureTimeLabel;
        this.bestPriceLabel = bestPriceLabel;
        this.flightTimeLabel = flightTimeLabel;
        this.flightFilterLabel = flightFilterLabel;
        this.promotionsLabel = promotionsLabel;
        this.atNightLabel = atNightLabel;
        this.inTheMorningLabel = inTheMorningLabel;
        this.inTheAfternoonLabel = inTheAfternoonLabel;
        this.directFlightsLabel = directFlightsLabel;
        this.clearFiltersLabel = clearFiltersLabel;
        this.applyFiltersLabel = applyFiltersLabel;
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getInTheMorningLabel() {
        return this.inTheMorningLabel;
    }

    /* renamed from: component11, reason: from getter */
    public final String getInTheAfternoonLabel() {
        return this.inTheAfternoonLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDirectFlightsLabel() {
        return this.directFlightsLabel;
    }

    /* renamed from: component13, reason: from getter */
    public final String getClearFiltersLabel() {
        return this.clearFiltersLabel;
    }

    /* renamed from: component14, reason: from getter */
    public final String getApplyFiltersLabel() {
        return this.applyFiltersLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderByLabel() {
        return this.orderByLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRecommendedLabel() {
        return this.recommendedLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDepartureTimeLabel() {
        return this.departureTimeLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBestPriceLabel() {
        return this.bestPriceLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFlightTimeLabel() {
        return this.flightTimeLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFlightFilterLabel() {
        return this.flightFilterLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPromotionsLabel() {
        return this.promotionsLabel;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAtNightLabel() {
        return this.atNightLabel;
    }

    public final FlightFilterCopies copy(String title, String orderByLabel, String recommendedLabel, String departureTimeLabel, String bestPriceLabel, String flightTimeLabel, String flightFilterLabel, String promotionsLabel, String atNightLabel, String inTheMorningLabel, String inTheAfternoonLabel, String directFlightsLabel, String clearFiltersLabel, String applyFiltersLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(orderByLabel, "orderByLabel");
        Intrinsics.checkNotNullParameter(recommendedLabel, "recommendedLabel");
        Intrinsics.checkNotNullParameter(departureTimeLabel, "departureTimeLabel");
        Intrinsics.checkNotNullParameter(bestPriceLabel, "bestPriceLabel");
        Intrinsics.checkNotNullParameter(flightTimeLabel, "flightTimeLabel");
        Intrinsics.checkNotNullParameter(flightFilterLabel, "flightFilterLabel");
        Intrinsics.checkNotNullParameter(promotionsLabel, "promotionsLabel");
        Intrinsics.checkNotNullParameter(atNightLabel, "atNightLabel");
        Intrinsics.checkNotNullParameter(inTheMorningLabel, "inTheMorningLabel");
        Intrinsics.checkNotNullParameter(inTheAfternoonLabel, "inTheAfternoonLabel");
        Intrinsics.checkNotNullParameter(directFlightsLabel, "directFlightsLabel");
        Intrinsics.checkNotNullParameter(clearFiltersLabel, "clearFiltersLabel");
        Intrinsics.checkNotNullParameter(applyFiltersLabel, "applyFiltersLabel");
        return new FlightFilterCopies(title, orderByLabel, recommendedLabel, departureTimeLabel, bestPriceLabel, flightTimeLabel, flightFilterLabel, promotionsLabel, atNightLabel, inTheMorningLabel, inTheAfternoonLabel, directFlightsLabel, clearFiltersLabel, applyFiltersLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightFilterCopies)) {
            return false;
        }
        FlightFilterCopies flightFilterCopies = (FlightFilterCopies) other;
        return Intrinsics.areEqual(this.title, flightFilterCopies.title) && Intrinsics.areEqual(this.orderByLabel, flightFilterCopies.orderByLabel) && Intrinsics.areEqual(this.recommendedLabel, flightFilterCopies.recommendedLabel) && Intrinsics.areEqual(this.departureTimeLabel, flightFilterCopies.departureTimeLabel) && Intrinsics.areEqual(this.bestPriceLabel, flightFilterCopies.bestPriceLabel) && Intrinsics.areEqual(this.flightTimeLabel, flightFilterCopies.flightTimeLabel) && Intrinsics.areEqual(this.flightFilterLabel, flightFilterCopies.flightFilterLabel) && Intrinsics.areEqual(this.promotionsLabel, flightFilterCopies.promotionsLabel) && Intrinsics.areEqual(this.atNightLabel, flightFilterCopies.atNightLabel) && Intrinsics.areEqual(this.inTheMorningLabel, flightFilterCopies.inTheMorningLabel) && Intrinsics.areEqual(this.inTheAfternoonLabel, flightFilterCopies.inTheAfternoonLabel) && Intrinsics.areEqual(this.directFlightsLabel, flightFilterCopies.directFlightsLabel) && Intrinsics.areEqual(this.clearFiltersLabel, flightFilterCopies.clearFiltersLabel) && Intrinsics.areEqual(this.applyFiltersLabel, flightFilterCopies.applyFiltersLabel);
    }

    public final String getApplyFiltersLabel() {
        return this.applyFiltersLabel;
    }

    public final String getAtNightLabel() {
        return this.atNightLabel;
    }

    public final String getBestPriceLabel() {
        return this.bestPriceLabel;
    }

    public final String getClearFiltersLabel() {
        return this.clearFiltersLabel;
    }

    public final String getDepartureTimeLabel() {
        return this.departureTimeLabel;
    }

    public final String getDirectFlightsLabel() {
        return this.directFlightsLabel;
    }

    public final String getFlightFilterLabel() {
        return this.flightFilterLabel;
    }

    public final String getFlightTimeLabel() {
        return this.flightTimeLabel;
    }

    public final String getInTheAfternoonLabel() {
        return this.inTheAfternoonLabel;
    }

    public final String getInTheMorningLabel() {
        return this.inTheMorningLabel;
    }

    public final String getOrderByLabel() {
        return this.orderByLabel;
    }

    public final String getPromotionsLabel() {
        return this.promotionsLabel;
    }

    public final String getRecommendedLabel() {
        return this.recommendedLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.title.hashCode() * 31) + this.orderByLabel.hashCode()) * 31) + this.recommendedLabel.hashCode()) * 31) + this.departureTimeLabel.hashCode()) * 31) + this.bestPriceLabel.hashCode()) * 31) + this.flightTimeLabel.hashCode()) * 31) + this.flightFilterLabel.hashCode()) * 31) + this.promotionsLabel.hashCode()) * 31) + this.atNightLabel.hashCode()) * 31) + this.inTheMorningLabel.hashCode()) * 31) + this.inTheAfternoonLabel.hashCode()) * 31) + this.directFlightsLabel.hashCode()) * 31) + this.clearFiltersLabel.hashCode()) * 31) + this.applyFiltersLabel.hashCode();
    }

    public String toString() {
        return "FlightFilterCopies(title=" + this.title + ", orderByLabel=" + this.orderByLabel + ", recommendedLabel=" + this.recommendedLabel + ", departureTimeLabel=" + this.departureTimeLabel + ", bestPriceLabel=" + this.bestPriceLabel + ", flightTimeLabel=" + this.flightTimeLabel + ", flightFilterLabel=" + this.flightFilterLabel + ", promotionsLabel=" + this.promotionsLabel + ", atNightLabel=" + this.atNightLabel + ", inTheMorningLabel=" + this.inTheMorningLabel + ", inTheAfternoonLabel=" + this.inTheAfternoonLabel + ", directFlightsLabel=" + this.directFlightsLabel + ", clearFiltersLabel=" + this.clearFiltersLabel + ", applyFiltersLabel=" + this.applyFiltersLabel + ")";
    }
}
