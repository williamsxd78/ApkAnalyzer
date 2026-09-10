package com.yuno.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKInformationBO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/yuno/data/model/PrefixPhoneModel;", "Landroid/os/Parcelable;", "name", "", "regexValidator", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRegexValidator", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrefixPhoneModel implements Parcelable {
    public static final Parcelable.Creator<PrefixPhoneModel> CREATOR = new Creator();

    @SerializedName("prefix")
    private final String name;

    @SerializedName("regex")
    private final String regexValidator;

    /* compiled from: SDKInformationBO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PrefixPhoneModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrefixPhoneModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrefixPhoneModel(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrefixPhoneModel[] newArray(int i) {
            return new PrefixPhoneModel[i];
        }
    }

    public PrefixPhoneModel(String name, String regexValidator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(regexValidator, "regexValidator");
        this.name = name;
        this.regexValidator = regexValidator;
    }

    public static /* synthetic */ PrefixPhoneModel copy$default(PrefixPhoneModel prefixPhoneModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prefixPhoneModel.name;
        }
        if ((i & 2) != 0) {
            str2 = prefixPhoneModel.regexValidator;
        }
        return prefixPhoneModel.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRegexValidator() {
        return this.regexValidator;
    }

    public final PrefixPhoneModel copy(String name, String regexValidator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(regexValidator, "regexValidator");
        return new PrefixPhoneModel(name, regexValidator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrefixPhoneModel)) {
            return false;
        }
        PrefixPhoneModel prefixPhoneModel = (PrefixPhoneModel) other;
        return Intrinsics.areEqual(this.name, prefixPhoneModel.name) && Intrinsics.areEqual(this.regexValidator, prefixPhoneModel.regexValidator);
    }

    public final String getName() {
        return this.name;
    }

    public final String getRegexValidator() {
        return this.regexValidator;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.regexValidator.hashCode();
    }

    public String toString() {
        return "PrefixPhoneModel(name=" + this.name + ", regexValidator=" + this.regexValidator + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.regexValidator);
    }
}
