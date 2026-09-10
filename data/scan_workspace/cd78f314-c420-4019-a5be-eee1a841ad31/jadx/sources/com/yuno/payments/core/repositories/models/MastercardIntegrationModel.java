package com.yuno.payments.core.repositories.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/yuno/payments/core/repositories/models/MastercardIntegrationModel;", "Landroid/os/Parcelable;", "country", "", "allowedCardBrands", "", "(Ljava/lang/String;Ljava/util/List;)V", "getAllowedCardBrands", "()Ljava/util/List;", "getCountry", "()Ljava/lang/String;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MastercardIntegrationModel implements Parcelable {
    public static final Parcelable.Creator<MastercardIntegrationModel> CREATOR = new Creator();
    private final List<String> allowedCardBrands;
    private final String country;

    /* compiled from: CountryModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<MastercardIntegrationModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MastercardIntegrationModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MastercardIntegrationModel(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MastercardIntegrationModel[] newArray(int i) {
            return new MastercardIntegrationModel[i];
        }
    }

    public MastercardIntegrationModel(String country, List<String> allowedCardBrands) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(allowedCardBrands, "allowedCardBrands");
        this.country = country;
        this.allowedCardBrands = allowedCardBrands;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MastercardIntegrationModel copy$default(MastercardIntegrationModel mastercardIntegrationModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mastercardIntegrationModel.country;
        }
        if ((i & 2) != 0) {
            list = mastercardIntegrationModel.allowedCardBrands;
        }
        return mastercardIntegrationModel.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final List<String> component2() {
        return this.allowedCardBrands;
    }

    public final MastercardIntegrationModel copy(String country, List<String> allowedCardBrands) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(allowedCardBrands, "allowedCardBrands");
        return new MastercardIntegrationModel(country, allowedCardBrands);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MastercardIntegrationModel)) {
            return false;
        }
        MastercardIntegrationModel mastercardIntegrationModel = (MastercardIntegrationModel) other;
        return Intrinsics.areEqual(this.country, mastercardIntegrationModel.country) && Intrinsics.areEqual(this.allowedCardBrands, mastercardIntegrationModel.allowedCardBrands);
    }

    public final List<String> getAllowedCardBrands() {
        return this.allowedCardBrands;
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        return (this.country.hashCode() * 31) + this.allowedCardBrands.hashCode();
    }

    public String toString() {
        return "MastercardIntegrationModel(country=" + this.country + ", allowedCardBrands=" + this.allowedCardBrands + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.country);
        parcel.writeStringList(this.allowedCardBrands);
    }
}
