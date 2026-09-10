package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: Conditions.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/Conditions;", "", "minimumAmount", "", "minutesToPay", "", "<init>", "(DI)V", "getMinimumAmount", "()D", "getMinutesToPay", "()I", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Conditions {
    private final double minimumAmount;
    private final int minutesToPay;

    public Conditions(double d, int i) {
        this.minimumAmount = d;
        this.minutesToPay = i;
    }

    public static /* synthetic */ Conditions copy$default(Conditions conditions, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = conditions.minimumAmount;
        }
        if ((i2 & 2) != 0) {
            i = conditions.minutesToPay;
        }
        return conditions.copy(d, i);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMinimumAmount() {
        return this.minimumAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutesToPay() {
        return this.minutesToPay;
    }

    public final Conditions copy(double minimumAmount, int minutesToPay) {
        return new Conditions(minimumAmount, minutesToPay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Conditions)) {
            return false;
        }
        Conditions conditions = (Conditions) other;
        return Double.compare(this.minimumAmount, conditions.minimumAmount) == 0 && this.minutesToPay == conditions.minutesToPay;
    }

    public final double getMinimumAmount() {
        return this.minimumAmount;
    }

    public final int getMinutesToPay() {
        return this.minutesToPay;
    }

    public int hashCode() {
        return (Double.hashCode(this.minimumAmount) * 31) + Integer.hashCode(this.minutesToPay);
    }

    public String toString() {
        return "Conditions(minimumAmount=" + this.minimumAmount + ", minutesToPay=" + this.minutesToPay + ")";
    }
}
