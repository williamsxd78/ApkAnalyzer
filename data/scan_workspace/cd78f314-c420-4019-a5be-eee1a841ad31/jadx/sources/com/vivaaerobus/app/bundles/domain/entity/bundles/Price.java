package com.vivaaerobus.app.bundles.domain.entity.bundles;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Price.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/bundles/domain/entity/bundles/Price;", "", "amount", "", "taxAmount", "earnedPoints", "cashBackValue", "pointAmount", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTaxAmount", "getEarnedPoints", "getCashBackValue", "getPointAmount", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/vivaaerobus/app/bundles/domain/entity/bundles/Price;", "equals", "", "other", "hashCode", "", "toString", "", "bundles_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Price {
    private final Double amount;
    private final Double cashBackValue;
    private final Double earnedPoints;
    private final Double pointAmount;
    private final Double taxAmount;

    public Price(Double d, Double d2, Double d3, Double d4, Double d5) {
        this.amount = d;
        this.taxAmount = d2;
        this.earnedPoints = d3;
        this.cashBackValue = d4;
        this.pointAmount = d5;
    }

    public static /* synthetic */ Price copy$default(Price price, Double d, Double d2, Double d3, Double d4, Double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            d = price.amount;
        }
        if ((i & 2) != 0) {
            d2 = price.taxAmount;
        }
        if ((i & 4) != 0) {
            d3 = price.earnedPoints;
        }
        if ((i & 8) != 0) {
            d4 = price.cashBackValue;
        }
        if ((i & 16) != 0) {
            d5 = price.pointAmount;
        }
        Double d6 = d5;
        Double d7 = d3;
        return price.copy(d, d2, d7, d4, d6);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getTaxAmount() {
        return this.taxAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getEarnedPoints() {
        return this.earnedPoints;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getCashBackValue() {
        return this.cashBackValue;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getPointAmount() {
        return this.pointAmount;
    }

    public final Price copy(Double amount, Double taxAmount, Double earnedPoints, Double cashBackValue, Double pointAmount) {
        return new Price(amount, taxAmount, earnedPoints, cashBackValue, pointAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return Intrinsics.areEqual((Object) this.amount, (Object) price.amount) && Intrinsics.areEqual((Object) this.taxAmount, (Object) price.taxAmount) && Intrinsics.areEqual((Object) this.earnedPoints, (Object) price.earnedPoints) && Intrinsics.areEqual((Object) this.cashBackValue, (Object) price.cashBackValue) && Intrinsics.areEqual((Object) this.pointAmount, (Object) price.pointAmount);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final Double getCashBackValue() {
        return this.cashBackValue;
    }

    public final Double getEarnedPoints() {
        return this.earnedPoints;
    }

    public final Double getPointAmount() {
        return this.pointAmount;
    }

    public final Double getTaxAmount() {
        return this.taxAmount;
    }

    public int hashCode() {
        Double d = this.amount;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.taxAmount;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.earnedPoints;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.cashBackValue;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.pointAmount;
        return hashCode4 + (d5 != null ? d5.hashCode() : 0);
    }

    public String toString() {
        return "Price(amount=" + this.amount + ", taxAmount=" + this.taxAmount + ", earnedPoints=" + this.earnedPoints + ", cashBackValue=" + this.cashBackValue + ", pointAmount=" + this.pointAmount + ")";
    }
}
