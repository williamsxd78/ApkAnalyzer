package com.vivaaerobus.app.seats.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Amount.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/vivaaerobus/app/seats/domain/model/Amount;", "Landroid/os/Parcelable;", "amount", "", "earnedPoints", "<init>", "(DD)V", "getAmount", "()D", "getEarnedPoints", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "seats_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Amount implements Parcelable {
    public static final Parcelable.Creator<Amount> CREATOR = new Creator();
    private final double amount;
    private final double earnedPoints;

    /* compiled from: Amount.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<Amount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Amount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Amount(parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Amount[] newArray(int i) {
            return new Amount[i];
        }
    }

    public Amount(double d, double d2) {
        this.amount = d;
        this.earnedPoints = d2;
    }

    public static /* synthetic */ Amount copy$default(Amount amount, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = amount.amount;
        }
        if ((i & 2) != 0) {
            d2 = amount.earnedPoints;
        }
        return amount.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getEarnedPoints() {
        return this.earnedPoints;
    }

    public final Amount copy(double amount, double earnedPoints) {
        return new Amount(amount, earnedPoints);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) other;
        return Double.compare(this.amount, amount.amount) == 0 && Double.compare(this.earnedPoints, amount.earnedPoints) == 0;
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
        return "Amount(amount=" + this.amount + ", earnedPoints=" + this.earnedPoints + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.amount);
        dest.writeDouble(this.earnedPoints);
    }
}
