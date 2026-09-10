package com.yuno.payments.features.payment.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.models.Banner;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentActionModels.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/yuno/payments/features/payment/models/PaymentActionHtmlRender;", "Landroid/os/Parcelable;", Banner.HTML, "", "redirectUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "getRedirectUrl", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentActionHtmlRender implements Parcelable {
    public static final Parcelable.Creator<PaymentActionHtmlRender> CREATOR = new Creator();
    private final String html;
    private final String redirectUrl;

    /* compiled from: PaymentActionModels.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentActionHtmlRender> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentActionHtmlRender createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentActionHtmlRender(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentActionHtmlRender[] newArray(int i) {
            return new PaymentActionHtmlRender[i];
        }
    }

    public PaymentActionHtmlRender(String html, String redirectUrl) {
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.html = html;
        this.redirectUrl = redirectUrl;
    }

    public static /* synthetic */ PaymentActionHtmlRender copy$default(PaymentActionHtmlRender paymentActionHtmlRender, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentActionHtmlRender.html;
        }
        if ((i & 2) != 0) {
            str2 = paymentActionHtmlRender.redirectUrl;
        }
        return paymentActionHtmlRender.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final PaymentActionHtmlRender copy(String html, String redirectUrl) {
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        return new PaymentActionHtmlRender(html, redirectUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentActionHtmlRender)) {
            return false;
        }
        PaymentActionHtmlRender paymentActionHtmlRender = (PaymentActionHtmlRender) other;
        return Intrinsics.areEqual(this.html, paymentActionHtmlRender.html) && Intrinsics.areEqual(this.redirectUrl, paymentActionHtmlRender.redirectUrl);
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        return (this.html.hashCode() * 31) + this.redirectUrl.hashCode();
    }

    public String toString() {
        return "PaymentActionHtmlRender(html=" + this.html + ", redirectUrl=" + this.redirectUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.html);
        parcel.writeString(this.redirectUrl);
    }
}
