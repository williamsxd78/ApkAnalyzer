package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsDTO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/GeolocationDTO;", "Landroid/os/Parcelable;", "latitude", "", "longitude", "(Ljava/lang/String;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/String;", "getLongitude", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GeolocationDTO implements Parcelable {
    public static final Parcelable.Creator<GeolocationDTO> CREATOR = new Creator();

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName("longitude")
    private final String longitude;

    /* compiled from: PaymentMethodsDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<GeolocationDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GeolocationDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GeolocationDTO(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GeolocationDTO[] newArray(int i) {
            return new GeolocationDTO[i];
        }
    }

    public GeolocationDTO(String str, String str2) {
        this.latitude = str;
        this.longitude = str2;
    }

    public static /* synthetic */ GeolocationDTO copy$default(GeolocationDTO geolocationDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geolocationDTO.latitude;
        }
        if ((i & 2) != 0) {
            str2 = geolocationDTO.longitude;
        }
        return geolocationDTO.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    public final GeolocationDTO copy(String latitude, String longitude) {
        return new GeolocationDTO(latitude, longitude);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeolocationDTO)) {
            return false;
        }
        GeolocationDTO geolocationDTO = (GeolocationDTO) other;
        return Intrinsics.areEqual(this.latitude, geolocationDTO.latitude) && Intrinsics.areEqual(this.longitude, geolocationDTO.longitude);
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        String str = this.latitude;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.longitude;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GeolocationDTO(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.latitude);
        parcel.writeString(this.longitude);
    }
}
