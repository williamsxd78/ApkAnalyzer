package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentDTOs.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/PaymentCodeDTO;", "Landroid/os/Parcelable;", "code", "", "reference", "expirationTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getExpirationTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReference", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/yuno/payments/network/services/payments/models/PaymentCodeDTO;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentCodeDTO implements Parcelable {
    public static final Parcelable.Creator<PaymentCodeDTO> CREATOR = new Creator();

    @SerializedName("code")
    private final String code;

    @SerializedName("expiration_time")
    private final Integer expirationTime;

    @SerializedName("reference")
    private final String reference;

    /* compiled from: PaymentDTOs.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentCodeDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentCodeDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentCodeDTO(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentCodeDTO[] newArray(int i) {
            return new PaymentCodeDTO[i];
        }
    }

    public PaymentCodeDTO(String str, String str2, Integer num) {
        this.code = str;
        this.reference = str2;
        this.expirationTime = num;
    }

    public static /* synthetic */ PaymentCodeDTO copy$default(PaymentCodeDTO paymentCodeDTO, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentCodeDTO.code;
        }
        if ((i & 2) != 0) {
            str2 = paymentCodeDTO.reference;
        }
        if ((i & 4) != 0) {
            num = paymentCodeDTO.expirationTime;
        }
        return paymentCodeDTO.copy(str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getExpirationTime() {
        return this.expirationTime;
    }

    public final PaymentCodeDTO copy(String code, String reference, Integer expirationTime) {
        return new PaymentCodeDTO(code, reference, expirationTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentCodeDTO)) {
            return false;
        }
        PaymentCodeDTO paymentCodeDTO = (PaymentCodeDTO) other;
        return Intrinsics.areEqual(this.code, paymentCodeDTO.code) && Intrinsics.areEqual(this.reference, paymentCodeDTO.reference) && Intrinsics.areEqual(this.expirationTime, paymentCodeDTO.expirationTime);
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getExpirationTime() {
        return this.expirationTime;
    }

    public final String getReference() {
        return this.reference;
    }

    public int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reference;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.expirationTime;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PaymentCodeDTO(code=" + this.code + ", reference=" + this.reference + ", expirationTime=" + this.expirationTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.code);
        parcel.writeString(this.reference);
        Integer num = this.expirationTime;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
