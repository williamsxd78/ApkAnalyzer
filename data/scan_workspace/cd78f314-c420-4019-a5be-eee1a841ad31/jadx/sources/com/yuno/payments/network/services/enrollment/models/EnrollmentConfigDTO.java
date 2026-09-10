package com.yuno.payments.network.services.enrollment.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentMethodResponse.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/yuno/payments/network/services/enrollment/models/EnrollmentConfigDTO;", "Landroid/os/Parcelable;", "mercadoPagoWalletExternalBrowserEnabled", "", "mercadoPagoWalletDeeplinkEnabled", "validateCpf", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getMercadoPagoWalletDeeplinkEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMercadoPagoWalletExternalBrowserEnabled", "getValidateCpf", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/yuno/payments/network/services/enrollment/models/EnrollmentConfigDTO;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EnrollmentConfigDTO implements Parcelable {
    public static final Parcelable.Creator<EnrollmentConfigDTO> CREATOR = new Creator();

    @SerializedName("mp_wallet_deep_link_enabled")
    private final Boolean mercadoPagoWalletDeeplinkEnabled;

    @SerializedName("mp_wallet_external_browser_enabled")
    private final Boolean mercadoPagoWalletExternalBrowserEnabled;

    @SerializedName("validate_cpf")
    private final Boolean validateCpf;

    /* compiled from: EnrollmentMethodResponse.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<EnrollmentConfigDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnrollmentConfigDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EnrollmentConfigDTO(valueOf, valueOf2, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnrollmentConfigDTO[] newArray(int i) {
            return new EnrollmentConfigDTO[i];
        }
    }

    public EnrollmentConfigDTO(Boolean bool, Boolean bool2, Boolean bool3) {
        this.mercadoPagoWalletExternalBrowserEnabled = bool;
        this.mercadoPagoWalletDeeplinkEnabled = bool2;
        this.validateCpf = bool3;
    }

    public static /* synthetic */ EnrollmentConfigDTO copy$default(EnrollmentConfigDTO enrollmentConfigDTO, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = enrollmentConfigDTO.mercadoPagoWalletExternalBrowserEnabled;
        }
        if ((i & 2) != 0) {
            bool2 = enrollmentConfigDTO.mercadoPagoWalletDeeplinkEnabled;
        }
        if ((i & 4) != 0) {
            bool3 = enrollmentConfigDTO.validateCpf;
        }
        return enrollmentConfigDTO.copy(bool, bool2, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getMercadoPagoWalletExternalBrowserEnabled() {
        return this.mercadoPagoWalletExternalBrowserEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getMercadoPagoWalletDeeplinkEnabled() {
        return this.mercadoPagoWalletDeeplinkEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getValidateCpf() {
        return this.validateCpf;
    }

    public final EnrollmentConfigDTO copy(Boolean mercadoPagoWalletExternalBrowserEnabled, Boolean mercadoPagoWalletDeeplinkEnabled, Boolean validateCpf) {
        return new EnrollmentConfigDTO(mercadoPagoWalletExternalBrowserEnabled, mercadoPagoWalletDeeplinkEnabled, validateCpf);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollmentConfigDTO)) {
            return false;
        }
        EnrollmentConfigDTO enrollmentConfigDTO = (EnrollmentConfigDTO) other;
        return Intrinsics.areEqual(this.mercadoPagoWalletExternalBrowserEnabled, enrollmentConfigDTO.mercadoPagoWalletExternalBrowserEnabled) && Intrinsics.areEqual(this.mercadoPagoWalletDeeplinkEnabled, enrollmentConfigDTO.mercadoPagoWalletDeeplinkEnabled) && Intrinsics.areEqual(this.validateCpf, enrollmentConfigDTO.validateCpf);
    }

    public final Boolean getMercadoPagoWalletDeeplinkEnabled() {
        return this.mercadoPagoWalletDeeplinkEnabled;
    }

    public final Boolean getMercadoPagoWalletExternalBrowserEnabled() {
        return this.mercadoPagoWalletExternalBrowserEnabled;
    }

    public final Boolean getValidateCpf() {
        return this.validateCpf;
    }

    public int hashCode() {
        Boolean bool = this.mercadoPagoWalletExternalBrowserEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.mercadoPagoWalletDeeplinkEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.validateCpf;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "EnrollmentConfigDTO(mercadoPagoWalletExternalBrowserEnabled=" + this.mercadoPagoWalletExternalBrowserEnabled + ", mercadoPagoWalletDeeplinkEnabled=" + this.mercadoPagoWalletDeeplinkEnabled + ", validateCpf=" + this.validateCpf + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Boolean bool = this.mercadoPagoWalletExternalBrowserEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.mercadoPagoWalletDeeplinkEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.validateCpf;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }
}
