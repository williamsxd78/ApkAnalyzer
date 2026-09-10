package com.vivaaerobus.app.externalPayment.presentation.paymentLocations.adapter.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentLocation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/externalPayment/presentation/paymentLocations/adapter/model/PaymentLocation;", "", "imageUrl", "", "locationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getLocationCode", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "externalPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentLocation {
    public static final int $stable = 0;
    private final String imageUrl;
    private final String locationCode;

    public PaymentLocation(String imageUrl, String locationCode) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        this.imageUrl = imageUrl;
        this.locationCode = locationCode;
    }

    public static /* synthetic */ PaymentLocation copy$default(PaymentLocation paymentLocation, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentLocation.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = paymentLocation.locationCode;
        }
        return paymentLocation.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLocationCode() {
        return this.locationCode;
    }

    public final PaymentLocation copy(String imageUrl, String locationCode) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        return new PaymentLocation(imageUrl, locationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentLocation)) {
            return false;
        }
        PaymentLocation paymentLocation = (PaymentLocation) other;
        return Intrinsics.areEqual(this.imageUrl, paymentLocation.imageUrl) && Intrinsics.areEqual(this.locationCode, paymentLocation.locationCode);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLocationCode() {
        return this.locationCode;
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + this.locationCode.hashCode();
    }

    public String toString() {
        return "PaymentLocation(imageUrl=" + this.imageUrl + ", locationCode=" + this.locationCode + ")";
    }
}
