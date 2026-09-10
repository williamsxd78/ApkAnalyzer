package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentDTOs.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/RenderHtmlDTO;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CONTENT, "", "redirectUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getRedirectUrl", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RenderHtmlDTO implements Parcelable {
    public static final Parcelable.Creator<RenderHtmlDTO> CREATOR = new Creator();

    @SerializedName(FirebaseAnalytics.Param.CONTENT)
    private final String content;

    @SerializedName("redirect_url")
    private final String redirectUrl;

    /* compiled from: PaymentDTOs.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<RenderHtmlDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RenderHtmlDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RenderHtmlDTO(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RenderHtmlDTO[] newArray(int i) {
            return new RenderHtmlDTO[i];
        }
    }

    public RenderHtmlDTO(String str, String str2) {
        this.content = str;
        this.redirectUrl = str2;
    }

    public static /* synthetic */ RenderHtmlDTO copy$default(RenderHtmlDTO renderHtmlDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renderHtmlDTO.content;
        }
        if ((i & 2) != 0) {
            str2 = renderHtmlDTO.redirectUrl;
        }
        return renderHtmlDTO.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final RenderHtmlDTO copy(String content, String redirectUrl) {
        return new RenderHtmlDTO(content, redirectUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderHtmlDTO)) {
            return false;
        }
        RenderHtmlDTO renderHtmlDTO = (RenderHtmlDTO) other;
        return Intrinsics.areEqual(this.content, renderHtmlDTO.content) && Intrinsics.areEqual(this.redirectUrl, renderHtmlDTO.redirectUrl);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RenderHtmlDTO(content=" + this.content + ", redirectUrl=" + this.redirectUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.content);
        parcel.writeString(this.redirectUrl);
    }
}
