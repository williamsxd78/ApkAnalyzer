package com.vivaaerobus.app.bookingPayment.presentation.common.companiesAdapter;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/bookingPayment/presentation/common/companiesAdapter/ImageData;", "", "iconRes", "", "iconUrl", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconUrl", "()Ljava/lang/String;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/vivaaerobus/app/bookingPayment/presentation/common/companiesAdapter/ImageData;", "equals", "", "other", "hashCode", "toString", "bookingPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ImageData {
    public static final int $stable = 0;
    private final Integer iconRes;
    private final String iconUrl;

    public ImageData(Integer num, String str) {
        this.iconRes = num;
        this.iconUrl = str;
    }

    public static /* synthetic */ ImageData copy$default(ImageData imageData, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = imageData.iconRes;
        }
        if ((i & 2) != 0) {
            str = imageData.iconUrl;
        }
        return imageData.copy(num, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final ImageData copy(Integer iconRes, String iconUrl) {
        return new ImageData(iconRes, iconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageData)) {
            return false;
        }
        ImageData imageData = (ImageData) other;
        return Intrinsics.areEqual(this.iconRes, imageData.iconRes) && Intrinsics.areEqual(this.iconUrl, imageData.iconUrl);
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        Integer num = this.iconRes;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.iconUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ImageData(iconRes=" + this.iconRes + ", iconUrl=" + this.iconUrl + ")";
    }
}
