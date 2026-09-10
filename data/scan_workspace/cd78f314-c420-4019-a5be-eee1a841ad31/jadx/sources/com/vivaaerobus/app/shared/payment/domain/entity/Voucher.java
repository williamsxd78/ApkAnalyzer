package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: Voucher.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/Voucher;", "", "redeemedAmount", "", "remainingAmount", "<init>", "(DD)V", "getRedeemedAmount", "()D", "getRemainingAmount", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Voucher {
    private final double redeemedAmount;
    private final double remainingAmount;

    public Voucher(double d, double d2) {
        this.redeemedAmount = d;
        this.remainingAmount = d2;
    }

    public static /* synthetic */ Voucher copy$default(Voucher voucher, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = voucher.redeemedAmount;
        }
        if ((i & 2) != 0) {
            d2 = voucher.remainingAmount;
        }
        return voucher.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getRedeemedAmount() {
        return this.redeemedAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getRemainingAmount() {
        return this.remainingAmount;
    }

    public final Voucher copy(double redeemedAmount, double remainingAmount) {
        return new Voucher(redeemedAmount, remainingAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Voucher)) {
            return false;
        }
        Voucher voucher = (Voucher) other;
        return Double.compare(this.redeemedAmount, voucher.redeemedAmount) == 0 && Double.compare(this.remainingAmount, voucher.remainingAmount) == 0;
    }

    public final double getRedeemedAmount() {
        return this.redeemedAmount;
    }

    public final double getRemainingAmount() {
        return this.remainingAmount;
    }

    public int hashCode() {
        return (Double.hashCode(this.redeemedAmount) * 31) + Double.hashCode(this.remainingAmount);
    }

    public String toString() {
        return "Voucher(redeemedAmount=" + this.redeemedAmount + ", remainingAmount=" + this.remainingAmount + ")";
    }
}
