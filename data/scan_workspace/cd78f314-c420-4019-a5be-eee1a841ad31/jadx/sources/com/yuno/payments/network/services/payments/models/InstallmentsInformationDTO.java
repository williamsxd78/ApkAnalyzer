package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsDTO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/InstallmentsInformationDTO;", "Landroid/os/Parcelable;", "id", "", "value", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/yuno/payments/network/services/payments/models/InstallmentsInformationDTO;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InstallmentsInformationDTO implements Parcelable {
    public static final Parcelable.Creator<InstallmentsInformationDTO> CREATOR = new Creator();

    @SerializedName("id")
    private final String id;

    @SerializedName("value")
    private final Integer value;

    /* compiled from: PaymentMethodsDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<InstallmentsInformationDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstallmentsInformationDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstallmentsInformationDTO(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstallmentsInformationDTO[] newArray(int i) {
            return new InstallmentsInformationDTO[i];
        }
    }

    public InstallmentsInformationDTO(String id, Integer num) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.value = num;
    }

    public static /* synthetic */ InstallmentsInformationDTO copy$default(InstallmentsInformationDTO installmentsInformationDTO, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installmentsInformationDTO.id;
        }
        if ((i & 2) != 0) {
            num = installmentsInformationDTO.value;
        }
        return installmentsInformationDTO.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public final InstallmentsInformationDTO copy(String id, Integer value) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new InstallmentsInformationDTO(id, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsInformationDTO)) {
            return false;
        }
        InstallmentsInformationDTO installmentsInformationDTO = (InstallmentsInformationDTO) other;
        return Intrinsics.areEqual(this.id, installmentsInformationDTO.id) && Intrinsics.areEqual(this.value, installmentsInformationDTO.value);
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Integer num = this.value;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "InstallmentsInformationDTO(id=" + this.id + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        Integer num = this.value;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
