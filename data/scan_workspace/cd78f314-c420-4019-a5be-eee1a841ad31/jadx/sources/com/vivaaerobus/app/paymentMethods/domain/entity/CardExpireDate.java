package com.vivaaerobus.app.paymentMethods.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.resources.presentation.conditional_date_picker_view.VivaDatePicker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardExpireDate.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/paymentMethods/domain/entity/CardExpireDate;", "Landroid/os/Parcelable;", VivaDatePicker.RESULT_MONTH, "", VivaDatePicker.RESULT_YEAR, "<init>", "(II)V", "getMonth", "()I", "getYear", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "payment_methods_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CardExpireDate implements Parcelable {
    public static final Parcelable.Creator<CardExpireDate> CREATOR = new Creator();
    private final int month;
    private final int year;

    /* compiled from: CardExpireDate.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<CardExpireDate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardExpireDate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardExpireDate(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardExpireDate[] newArray(int i) {
            return new CardExpireDate[i];
        }
    }

    public CardExpireDate(int i, int i2) {
        this.month = i;
        this.year = i2;
    }

    public static /* synthetic */ CardExpireDate copy$default(CardExpireDate cardExpireDate, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardExpireDate.month;
        }
        if ((i3 & 2) != 0) {
            i2 = cardExpireDate.year;
        }
        return cardExpireDate.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* renamed from: component2, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public final CardExpireDate copy(int month, int year) {
        return new CardExpireDate(month, year);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardExpireDate)) {
            return false;
        }
        CardExpireDate cardExpireDate = (CardExpireDate) other;
        return this.month == cardExpireDate.month && this.year == cardExpireDate.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (Integer.hashCode(this.month) * 31) + Integer.hashCode(this.year);
    }

    public String toString() {
        return "CardExpireDate(month=" + this.month + ", year=" + this.year + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.month);
        dest.writeInt(this.year);
    }
}
