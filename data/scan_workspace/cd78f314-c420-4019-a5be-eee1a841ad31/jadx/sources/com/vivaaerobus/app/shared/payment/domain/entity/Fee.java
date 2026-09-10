package com.vivaaerobus.app.shared.payment.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fee.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006!"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/Fee;", "Landroid/os/Parcelable;", "amount", "", "pointAmount", "taxAmount", "cashBackValue", "<init>", "(DDDD)V", "getAmount", "()D", "getPointAmount", "getTaxAmount", "getCashBackValue", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Fee implements Parcelable {
    public static final Parcelable.Creator<Fee> CREATOR = new Creator();
    private final double amount;
    private final double cashBackValue;
    private final double pointAmount;
    private final double taxAmount;

    /* compiled from: Fee.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Fee> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Fee(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fee[] newArray(int i) {
            return new Fee[i];
        }
    }

    public Fee(double d, double d2, double d3, double d4) {
        this.amount = d;
        this.pointAmount = d2;
        this.taxAmount = d3;
        this.cashBackValue = d4;
    }

    public static /* synthetic */ Fee copy$default(Fee fee, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fee.amount;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = fee.pointAmount;
        }
        double d6 = d2;
        if ((i & 4) != 0) {
            d3 = fee.taxAmount;
        }
        return fee.copy(d5, d6, d3, (i & 8) != 0 ? fee.cashBackValue : d4);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPointAmount() {
        return this.pointAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTaxAmount() {
        return this.taxAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final double getCashBackValue() {
        return this.cashBackValue;
    }

    public final Fee copy(double amount, double pointAmount, double taxAmount, double cashBackValue) {
        return new Fee(amount, pointAmount, taxAmount, cashBackValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fee)) {
            return false;
        }
        Fee fee = (Fee) other;
        return Double.compare(this.amount, fee.amount) == 0 && Double.compare(this.pointAmount, fee.pointAmount) == 0 && Double.compare(this.taxAmount, fee.taxAmount) == 0 && Double.compare(this.cashBackValue, fee.cashBackValue) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getCashBackValue() {
        return this.cashBackValue;
    }

    public final double getPointAmount() {
        return this.pointAmount;
    }

    public final double getTaxAmount() {
        return this.taxAmount;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.amount) * 31) + Double.hashCode(this.pointAmount)) * 31) + Double.hashCode(this.taxAmount)) * 31) + Double.hashCode(this.cashBackValue);
    }

    public String toString() {
        return "Fee(amount=" + this.amount + ", pointAmount=" + this.pointAmount + ", taxAmount=" + this.taxAmount + ", cashBackValue=" + this.cashBackValue + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.amount);
        dest.writeDouble(this.pointAmount);
        dest.writeDouble(this.taxAmount);
        dest.writeDouble(this.cashBackValue);
    }
}
