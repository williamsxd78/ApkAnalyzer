package com.vivaaerobus.app.shared.booking.domain.entity.getAvailableInsurances;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: InsurancePrice.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/getAvailableInsurances/InsurancePrice;", "", "amount", "", "taxAmount", "cashBackValue", "earnedPoints", "", "pointAmount", "<init>", "(DDDII)V", "getAmount", "()D", "getTaxAmount", "getCashBackValue", "getEarnedPoints", "()I", "getPointAmount", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "Companion", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InsurancePrice {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double amount;
    private final double cashBackValue;
    private final int earnedPoints;
    private final int pointAmount;
    private final double taxAmount;

    /* compiled from: InsurancePrice.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/getAvailableInsurances/InsurancePrice$Companion;", "", "<init>", "()V", "emptyPrice", "Lcom/vivaaerobus/app/shared/booking/domain/entity/getAvailableInsurances/InsurancePrice;", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InsurancePrice emptyPrice() {
            return new InsurancePrice(0.0d, 0.0d, 0.0d, 0, 0);
        }
    }

    public InsurancePrice(double d, double d2, double d3, int i, int i2) {
        this.amount = d;
        this.taxAmount = d2;
        this.cashBackValue = d3;
        this.earnedPoints = i;
        this.pointAmount = i2;
    }

    public static /* synthetic */ InsurancePrice copy$default(InsurancePrice insurancePrice, double d, double d2, double d3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d = insurancePrice.amount;
        }
        double d4 = d;
        if ((i3 & 2) != 0) {
            d2 = insurancePrice.taxAmount;
        }
        double d5 = d2;
        if ((i3 & 4) != 0) {
            d3 = insurancePrice.cashBackValue;
        }
        return insurancePrice.copy(d4, d5, d3, (i3 & 8) != 0 ? insurancePrice.earnedPoints : i, (i3 & 16) != 0 ? insurancePrice.pointAmount : i2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTaxAmount() {
        return this.taxAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final double getCashBackValue() {
        return this.cashBackValue;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEarnedPoints() {
        return this.earnedPoints;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPointAmount() {
        return this.pointAmount;
    }

    public final InsurancePrice copy(double amount, double taxAmount, double cashBackValue, int earnedPoints, int pointAmount) {
        return new InsurancePrice(amount, taxAmount, cashBackValue, earnedPoints, pointAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsurancePrice)) {
            return false;
        }
        InsurancePrice insurancePrice = (InsurancePrice) other;
        return Double.compare(this.amount, insurancePrice.amount) == 0 && Double.compare(this.taxAmount, insurancePrice.taxAmount) == 0 && Double.compare(this.cashBackValue, insurancePrice.cashBackValue) == 0 && this.earnedPoints == insurancePrice.earnedPoints && this.pointAmount == insurancePrice.pointAmount;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getCashBackValue() {
        return this.cashBackValue;
    }

    public final int getEarnedPoints() {
        return this.earnedPoints;
    }

    public final int getPointAmount() {
        return this.pointAmount;
    }

    public final double getTaxAmount() {
        return this.taxAmount;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.amount) * 31) + Double.hashCode(this.taxAmount)) * 31) + Double.hashCode(this.cashBackValue)) * 31) + Integer.hashCode(this.earnedPoints)) * 31) + Integer.hashCode(this.pointAmount);
    }

    public String toString() {
        return "InsurancePrice(amount=" + this.amount + ", taxAmount=" + this.taxAmount + ", cashBackValue=" + this.cashBackValue + ", earnedPoints=" + this.earnedPoints + ", pointAmount=" + this.pointAmount + ")";
    }
}
