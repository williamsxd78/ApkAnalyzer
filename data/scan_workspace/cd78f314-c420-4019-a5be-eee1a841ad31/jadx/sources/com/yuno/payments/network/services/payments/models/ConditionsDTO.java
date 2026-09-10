package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsDTO.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/ConditionsDTO;", "Landroid/os/Parcelable;", "enabled", "", "(Ljava/lang/Boolean;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Boolean;)Lcom/yuno/payments/network/services/payments/models/ConditionsDTO;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConditionsDTO implements Parcelable {
    public static final Parcelable.Creator<ConditionsDTO> CREATOR = new Creator();

    @SerializedName("enabled")
    private final Boolean enabled;

    /* compiled from: PaymentMethodsDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ConditionsDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConditionsDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConditionsDTO(valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConditionsDTO[] newArray(int i) {
            return new ConditionsDTO[i];
        }
    }

    public ConditionsDTO(Boolean bool) {
        this.enabled = bool;
    }

    public static /* synthetic */ ConditionsDTO copy$default(ConditionsDTO conditionsDTO, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = conditionsDTO.enabled;
        }
        return conditionsDTO.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final ConditionsDTO copy(Boolean enabled) {
        return new ConditionsDTO(enabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConditionsDTO) && Intrinsics.areEqual(this.enabled, ((ConditionsDTO) other).enabled);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ConditionsDTO(enabled=" + this.enabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i;
        Intrinsics.checkNotNullParameter(parcel, "out");
        Boolean bool = this.enabled;
        if (bool == null) {
            i = 0;
        } else {
            parcel.writeInt(1);
            i = bool.booleanValue();
        }
        parcel.writeInt(i);
    }
}
