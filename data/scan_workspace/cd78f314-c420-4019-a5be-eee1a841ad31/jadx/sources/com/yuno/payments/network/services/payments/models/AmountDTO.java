package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentDTOs.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/AmountDTO;", "Landroid/os/Parcelable;", "currency", "", "value", "", "(Ljava/lang/String;D)V", "getCurrency", "()Ljava/lang/String;", "getValue", "()D", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AmountDTO implements Parcelable {
    public static final Parcelable.Creator<AmountDTO> CREATOR = new Creator();

    @SerializedName("currency")
    private final String currency;

    @SerializedName("value")
    private final double value;

    /* compiled from: PaymentDTOs.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AmountDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmountDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmountDTO(parcel.readString(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmountDTO[] newArray(int i) {
            return new AmountDTO[i];
        }
    }

    public AmountDTO(String currency, double d) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
        this.value = d;
    }

    public static /* synthetic */ AmountDTO copy$default(AmountDTO amountDTO, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amountDTO.currency;
        }
        if ((i & 2) != 0) {
            d = amountDTO.value;
        }
        return amountDTO.copy(str, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public final AmountDTO copy(String currency, double value) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new AmountDTO(currency, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountDTO)) {
            return false;
        }
        AmountDTO amountDTO = (AmountDTO) other;
        return Intrinsics.areEqual(this.currency, amountDTO.currency) && Double.compare(this.value, amountDTO.value) == 0;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.currency.hashCode() * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "AmountDTO(currency=" + this.currency + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.currency);
        parcel.writeDouble(this.value);
    }
}
