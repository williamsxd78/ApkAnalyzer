package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.cms.CMSAttributeTableGenerator;

/* compiled from: PaymentDTOs.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/headersDTO;", "Landroid/os/Parcelable;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "(Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class headersDTO implements Parcelable {
    public static final Parcelable.Creator<headersDTO> CREATOR = new Creator();

    @SerializedName("Content-Type")
    private final String contentType;

    /* compiled from: PaymentDTOs.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<headersDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final headersDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new headersDTO(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final headersDTO[] newArray(int i) {
            return new headersDTO[i];
        }
    }

    public headersDTO(String contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.contentType = contentType;
    }

    public static /* synthetic */ headersDTO copy$default(headersDTO headersdto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headersdto.contentType;
        }
        return headersdto.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    public final headersDTO copy(String contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new headersDTO(contentType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof headersDTO) && Intrinsics.areEqual(this.contentType, ((headersDTO) other).contentType);
    }

    public final String getContentType() {
        return this.contentType;
    }

    public int hashCode() {
        return this.contentType.hashCode();
    }

    public String toString() {
        return "headersDTO(contentType=" + this.contentType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.contentType);
    }
}
