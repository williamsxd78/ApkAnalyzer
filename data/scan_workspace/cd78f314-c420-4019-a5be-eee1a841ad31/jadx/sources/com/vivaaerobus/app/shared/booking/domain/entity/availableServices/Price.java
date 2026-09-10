package com.vivaaerobus.app.shared.booking.domain.entity.availableServices;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: Price.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/availableServices/Price;", "", "amount", "", "earnedPoints", "<init>", "(DD)V", "getAmount", "()D", "getEarnedPoints", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Price {
    private final double amount;
    private final double earnedPoints;

    public Price(double d, double d2) {
        this.amount = d;
        this.earnedPoints = d2;
    }

    public static /* synthetic */ Price copy$default(Price price, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = price.amount;
        }
        if ((i & 2) != 0) {
            d2 = price.earnedPoints;
        }
        return price.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getEarnedPoints() {
        return this.earnedPoints;
    }

    public final Price copy(double amount, double earnedPoints) {
        return new Price(amount, earnedPoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return Double.compare(this.amount, price.amount) == 0 && Double.compare(this.earnedPoints, price.earnedPoints) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getEarnedPoints() {
        return this.earnedPoints;
    }

    public int hashCode() {
        return (Double.hashCode(this.amount) * 31) + Double.hashCode(this.earnedPoints);
    }

    public String toString() {
        return "Price(amount=" + this.amount + ", earnedPoints=" + this.earnedPoints + ")";
    }
}
