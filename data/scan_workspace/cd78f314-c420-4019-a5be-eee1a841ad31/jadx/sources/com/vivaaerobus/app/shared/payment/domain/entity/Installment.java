package com.vivaaerobus.app.shared.payment.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Installment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0003J\u0014\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/Installment;", "Landroid/os/Parcelable;", "months", "", "fee", "Lcom/vivaaerobus/app/shared/payment/domain/entity/Fee;", "<init>", "(ILcom/vivaaerobus/app/shared/payment/domain/entity/Fee;)V", "getMonths", "()I", "getFee", "()Lcom/vivaaerobus/app/shared/payment/domain/entity/Fee;", "isSelected", "", "isSelected$annotations", "()V", "()Z", "setSelected", "(Z)V", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Installment implements Parcelable {
    public static final Parcelable.Creator<Installment> CREATOR = new Creator();
    private final Fee fee;
    private boolean isSelected;
    private final int months;

    /* compiled from: Installment.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Installment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Installment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Installment(parcel.readInt(), Fee.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Installment[] newArray(int i) {
            return new Installment[i];
        }
    }

    public Installment(int i, Fee fee) {
        Intrinsics.checkNotNullParameter(fee, "fee");
        this.months = i;
        this.fee = fee;
    }

    public static /* synthetic */ Installment copy$default(Installment installment, int i, Fee fee, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = installment.months;
        }
        if ((i2 & 2) != 0) {
            fee = installment.fee;
        }
        return installment.copy(i, fee);
    }

    public static /* synthetic */ void isSelected$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getMonths() {
        return this.months;
    }

    /* renamed from: component2, reason: from getter */
    public final Fee getFee() {
        return this.fee;
    }

    public final Installment copy(int months, Fee fee) {
        Intrinsics.checkNotNullParameter(fee, "fee");
        return new Installment(months, fee);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Installment)) {
            return false;
        }
        Installment installment = (Installment) other;
        return this.months == installment.months && Intrinsics.areEqual(this.fee, installment.fee);
    }

    public final Fee getFee() {
        return this.fee;
    }

    public final int getMonths() {
        return this.months;
    }

    public int hashCode() {
        return (Integer.hashCode(this.months) * 31) + this.fee.hashCode();
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return "Installment(months=" + this.months + ", fee=" + this.fee + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.months);
        this.fee.writeToParcel(dest, flags);
    }
}
