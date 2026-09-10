package com.yuno.payments.features.payment.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentActionModels.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006%"}, d2 = {"Lcom/yuno/payments/features/payment/models/ImageDynamicModel;", "Landroid/os/Parcelable;", "additionalData", "", "expirationTime", "", "reference", "type", "value", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalData", "()Ljava/lang/String;", "getExpirationTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReference", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yuno/payments/features/payment/models/ImageDynamicModel;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ImageDynamicModel implements Parcelable {
    public static final Parcelable.Creator<ImageDynamicModel> CREATOR = new Creator();
    private final String additionalData;
    private final Integer expirationTime;
    private final String reference;
    private final String type;
    private final String value;

    /* compiled from: PaymentActionModels.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ImageDynamicModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageDynamicModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageDynamicModel(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageDynamicModel[] newArray(int i) {
            return new ImageDynamicModel[i];
        }
    }

    public ImageDynamicModel(String str, Integer num, String str2, String str3, String str4) {
        this.additionalData = str;
        this.expirationTime = num;
        this.reference = str2;
        this.type = str3;
        this.value = str4;
    }

    public static /* synthetic */ ImageDynamicModel copy$default(ImageDynamicModel imageDynamicModel, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageDynamicModel.additionalData;
        }
        if ((i & 2) != 0) {
            num = imageDynamicModel.expirationTime;
        }
        if ((i & 4) != 0) {
            str2 = imageDynamicModel.reference;
        }
        if ((i & 8) != 0) {
            str3 = imageDynamicModel.type;
        }
        if ((i & 16) != 0) {
            str4 = imageDynamicModel.value;
        }
        String str5 = str4;
        String str6 = str2;
        return imageDynamicModel.copy(str, num, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAdditionalData() {
        return this.additionalData;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getExpirationTime() {
        return this.expirationTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final ImageDynamicModel copy(String additionalData, Integer expirationTime, String reference, String type, String value) {
        return new ImageDynamicModel(additionalData, expirationTime, reference, type, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDynamicModel)) {
            return false;
        }
        ImageDynamicModel imageDynamicModel = (ImageDynamicModel) other;
        return Intrinsics.areEqual(this.additionalData, imageDynamicModel.additionalData) && Intrinsics.areEqual(this.expirationTime, imageDynamicModel.expirationTime) && Intrinsics.areEqual(this.reference, imageDynamicModel.reference) && Intrinsics.areEqual(this.type, imageDynamicModel.type) && Intrinsics.areEqual(this.value, imageDynamicModel.value);
    }

    public final String getAdditionalData() {
        return this.additionalData;
    }

    public final Integer getExpirationTime() {
        return this.expirationTime;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.additionalData;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.expirationTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.reference;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.value;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ImageDynamicModel(additionalData=" + this.additionalData + ", expirationTime=" + this.expirationTime + ", reference=" + this.reference + ", type=" + this.type + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.additionalData);
        Integer num = this.expirationTime;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.reference);
        parcel.writeString(this.type);
        parcel.writeString(this.value);
    }
}
