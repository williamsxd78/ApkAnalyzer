package com.yuno.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKInformationBO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/yuno/data/model/LinkResourcesBO;", "Landroid/os/Parcelable;", "paymentTermsAndConditions", "", "paymentPrivacy", "paymentDataPrivacyPolicy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentDataPrivacyPolicy", "()Ljava/lang/String;", "getPaymentPrivacy", "getPaymentTermsAndConditions", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LinkResourcesBO implements Parcelable {
    public static final Parcelable.Creator<LinkResourcesBO> CREATOR = new Creator();
    private final String paymentDataPrivacyPolicy;
    private final String paymentPrivacy;
    private final String paymentTermsAndConditions;

    /* compiled from: SDKInformationBO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<LinkResourcesBO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkResourcesBO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkResourcesBO(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkResourcesBO[] newArray(int i) {
            return new LinkResourcesBO[i];
        }
    }

    public LinkResourcesBO(String paymentTermsAndConditions, String paymentPrivacy, String paymentDataPrivacyPolicy) {
        Intrinsics.checkNotNullParameter(paymentTermsAndConditions, "paymentTermsAndConditions");
        Intrinsics.checkNotNullParameter(paymentPrivacy, "paymentPrivacy");
        Intrinsics.checkNotNullParameter(paymentDataPrivacyPolicy, "paymentDataPrivacyPolicy");
        this.paymentTermsAndConditions = paymentTermsAndConditions;
        this.paymentPrivacy = paymentPrivacy;
        this.paymentDataPrivacyPolicy = paymentDataPrivacyPolicy;
    }

    public static /* synthetic */ LinkResourcesBO copy$default(LinkResourcesBO linkResourcesBO, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkResourcesBO.paymentTermsAndConditions;
        }
        if ((i & 2) != 0) {
            str2 = linkResourcesBO.paymentPrivacy;
        }
        if ((i & 4) != 0) {
            str3 = linkResourcesBO.paymentDataPrivacyPolicy;
        }
        return linkResourcesBO.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentTermsAndConditions() {
        return this.paymentTermsAndConditions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentPrivacy() {
        return this.paymentPrivacy;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentDataPrivacyPolicy() {
        return this.paymentDataPrivacyPolicy;
    }

    public final LinkResourcesBO copy(String paymentTermsAndConditions, String paymentPrivacy, String paymentDataPrivacyPolicy) {
        Intrinsics.checkNotNullParameter(paymentTermsAndConditions, "paymentTermsAndConditions");
        Intrinsics.checkNotNullParameter(paymentPrivacy, "paymentPrivacy");
        Intrinsics.checkNotNullParameter(paymentDataPrivacyPolicy, "paymentDataPrivacyPolicy");
        return new LinkResourcesBO(paymentTermsAndConditions, paymentPrivacy, paymentDataPrivacyPolicy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkResourcesBO)) {
            return false;
        }
        LinkResourcesBO linkResourcesBO = (LinkResourcesBO) other;
        return Intrinsics.areEqual(this.paymentTermsAndConditions, linkResourcesBO.paymentTermsAndConditions) && Intrinsics.areEqual(this.paymentPrivacy, linkResourcesBO.paymentPrivacy) && Intrinsics.areEqual(this.paymentDataPrivacyPolicy, linkResourcesBO.paymentDataPrivacyPolicy);
    }

    public final String getPaymentDataPrivacyPolicy() {
        return this.paymentDataPrivacyPolicy;
    }

    public final String getPaymentPrivacy() {
        return this.paymentPrivacy;
    }

    public final String getPaymentTermsAndConditions() {
        return this.paymentTermsAndConditions;
    }

    public int hashCode() {
        return (((this.paymentTermsAndConditions.hashCode() * 31) + this.paymentPrivacy.hashCode()) * 31) + this.paymentDataPrivacyPolicy.hashCode();
    }

    public String toString() {
        return "LinkResourcesBO(paymentTermsAndConditions=" + this.paymentTermsAndConditions + ", paymentPrivacy=" + this.paymentPrivacy + ", paymentDataPrivacyPolicy=" + this.paymentDataPrivacyPolicy + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.paymentTermsAndConditions);
        parcel.writeString(this.paymentPrivacy);
        parcel.writeString(this.paymentDataPrivacyPolicy);
    }
}
