package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: PointPaymentOptions.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/PointPaymentOptions;", "", "id", "", "amount", "", "pointAmount", "exchangeRate", "<init>", "(IDID)V", "getId", "()I", "getAmount", "()D", "getPointAmount", "getExchangeRate", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PointPaymentOptions {
    private final double amount;
    private final double exchangeRate;
    private final int id;
    private final int pointAmount;

    public PointPaymentOptions(int i, double d, int i2, double d2) {
        this.id = i;
        this.amount = d;
        this.pointAmount = i2;
        this.exchangeRate = d2;
    }

    public static /* synthetic */ PointPaymentOptions copy$default(PointPaymentOptions pointPaymentOptions, int i, double d, int i2, double d2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = pointPaymentOptions.id;
        }
        if ((i3 & 2) != 0) {
            d = pointPaymentOptions.amount;
        }
        if ((i3 & 4) != 0) {
            i2 = pointPaymentOptions.pointAmount;
        }
        if ((i3 & 8) != 0) {
            d2 = pointPaymentOptions.exchangeRate;
        }
        int i4 = i2;
        return pointPaymentOptions.copy(i, d, i4, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPointAmount() {
        return this.pointAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final double getExchangeRate() {
        return this.exchangeRate;
    }

    public final PointPaymentOptions copy(int id, double amount, int pointAmount, double exchangeRate) {
        return new PointPaymentOptions(id, amount, pointAmount, exchangeRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointPaymentOptions)) {
            return false;
        }
        PointPaymentOptions pointPaymentOptions = (PointPaymentOptions) other;
        return this.id == pointPaymentOptions.id && Double.compare(this.amount, pointPaymentOptions.amount) == 0 && this.pointAmount == pointPaymentOptions.pointAmount && Double.compare(this.exchangeRate, pointPaymentOptions.exchangeRate) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getExchangeRate() {
        return this.exchangeRate;
    }

    public final int getId() {
        return this.id;
    }

    public final int getPointAmount() {
        return this.pointAmount;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + Double.hashCode(this.amount)) * 31) + Integer.hashCode(this.pointAmount)) * 31) + Double.hashCode(this.exchangeRate);
    }

    public String toString() {
        return "PointPaymentOptions(id=" + this.id + ", amount=" + this.amount + ", pointAmount=" + this.pointAmount + ", exchangeRate=" + this.exchangeRate + ")";
    }
}
