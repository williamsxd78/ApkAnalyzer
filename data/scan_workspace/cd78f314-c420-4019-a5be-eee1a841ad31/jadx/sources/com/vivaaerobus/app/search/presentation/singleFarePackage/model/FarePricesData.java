package com.vivaaerobus.app.search.presentation.singleFarePackage.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: FarePricesData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/search/presentation/singleFarePackage/model/FarePricesData;", "", "priceUpsellTo", "", "priceVivaFanUpsellTo", "isSelectVivaFanFare", "", "<init>", "(DDZ)V", "getPriceUpsellTo", "()D", "getPriceVivaFanUpsellTo", "()Z", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "search_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FarePricesData {
    public static final int $stable = 0;
    private final boolean isSelectVivaFanFare;
    private final double priceUpsellTo;
    private final double priceVivaFanUpsellTo;

    public FarePricesData(double d, double d2, boolean z) {
        this.priceUpsellTo = d;
        this.priceVivaFanUpsellTo = d2;
        this.isSelectVivaFanFare = z;
    }

    public static /* synthetic */ FarePricesData copy$default(FarePricesData farePricesData, double d, double d2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = farePricesData.priceUpsellTo;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = farePricesData.priceVivaFanUpsellTo;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            z = farePricesData.isSelectVivaFanFare;
        }
        return farePricesData.copy(d3, d4, z);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPriceUpsellTo() {
        return this.priceUpsellTo;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPriceVivaFanUpsellTo() {
        return this.priceVivaFanUpsellTo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelectVivaFanFare() {
        return this.isSelectVivaFanFare;
    }

    public final FarePricesData copy(double priceUpsellTo, double priceVivaFanUpsellTo, boolean isSelectVivaFanFare) {
        return new FarePricesData(priceUpsellTo, priceVivaFanUpsellTo, isSelectVivaFanFare);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FarePricesData)) {
            return false;
        }
        FarePricesData farePricesData = (FarePricesData) other;
        return Double.compare(this.priceUpsellTo, farePricesData.priceUpsellTo) == 0 && Double.compare(this.priceVivaFanUpsellTo, farePricesData.priceVivaFanUpsellTo) == 0 && this.isSelectVivaFanFare == farePricesData.isSelectVivaFanFare;
    }

    public final double getPriceUpsellTo() {
        return this.priceUpsellTo;
    }

    public final double getPriceVivaFanUpsellTo() {
        return this.priceVivaFanUpsellTo;
    }

    public int hashCode() {
        return (((Double.hashCode(this.priceUpsellTo) * 31) + Double.hashCode(this.priceVivaFanUpsellTo)) * 31) + Boolean.hashCode(this.isSelectVivaFanFare);
    }

    public final boolean isSelectVivaFanFare() {
        return this.isSelectVivaFanFare;
    }

    public String toString() {
        return "FarePricesData(priceUpsellTo=" + this.priceUpsellTo + ", priceVivaFanUpsellTo=" + this.priceVivaFanUpsellTo + ", isSelectVivaFanFare=" + this.isSelectVivaFanFare + ")";
    }
}
