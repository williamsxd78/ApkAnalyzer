package com.vivaaerobus.app.basket.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Price.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/basket/domain/entity/Price;", "", "amount", "", "pointAmount", "", "<init>", "(DLjava/lang/Integer;)V", "getAmount", "()D", "getPointAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "(DLjava/lang/Integer;)Lcom/vivaaerobus/app/basket/domain/entity/Price;", "equals", "", "other", "hashCode", "toString", "", "basket_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Price {
    private final double amount;
    private final Integer pointAmount;

    public Price(double d, Integer num) {
        this.amount = d;
        this.pointAmount = num;
    }

    public static /* synthetic */ Price copy$default(Price price, double d, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            d = price.amount;
        }
        if ((i & 2) != 0) {
            num = price.pointAmount;
        }
        return price.copy(d, num);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPointAmount() {
        return this.pointAmount;
    }

    public final Price copy(double amount, Integer pointAmount) {
        return new Price(amount, pointAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return Double.compare(this.amount, price.amount) == 0 && Intrinsics.areEqual(this.pointAmount, price.pointAmount);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Integer getPointAmount() {
        return this.pointAmount;
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.amount) * 31;
        Integer num = this.pointAmount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Price(amount=" + this.amount + ", pointAmount=" + this.pointAmount + ")";
    }
}
