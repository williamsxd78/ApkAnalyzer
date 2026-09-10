package com.vivaaerobus.app.shared.booking.domain.entity.bookingFull;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Price.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bookingFull/Price;", "", "amount", "", "<init>", "(Ljava/lang/Double;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Double;)Lcom/vivaaerobus/app/shared/booking/domain/entity/bookingFull/Price;", "equals", "", "other", "hashCode", "", "toString", "", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Price {
    private final Double amount;

    public Price(Double d) {
        this.amount = d;
    }

    public static /* synthetic */ Price copy$default(Price price, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = price.amount;
        }
        return price.copy(d);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    public final Price copy(Double amount) {
        return new Price(amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Price) && Intrinsics.areEqual((Object) this.amount, (Object) ((Price) other).amount);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public int hashCode() {
        Double d = this.amount;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public String toString() {
        return "Price(amount=" + this.amount + ")";
    }
}
