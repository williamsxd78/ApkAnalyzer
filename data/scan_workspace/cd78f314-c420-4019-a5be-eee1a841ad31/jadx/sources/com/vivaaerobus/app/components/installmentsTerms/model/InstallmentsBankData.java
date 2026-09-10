package com.vivaaerobus.app.components.installmentsTerms.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstallmentsBankData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/components/installmentsTerms/model/InstallmentsBankData;", "", "imageUrl", "", "months", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getMonths", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InstallmentsBankData {
    public static final int $stable = 0;
    private final String imageUrl;
    private final String months;

    public InstallmentsBankData(String imageUrl, String months) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(months, "months");
        this.imageUrl = imageUrl;
        this.months = months;
    }

    public static /* synthetic */ InstallmentsBankData copy$default(InstallmentsBankData installmentsBankData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installmentsBankData.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = installmentsBankData.months;
        }
        return installmentsBankData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMonths() {
        return this.months;
    }

    public final InstallmentsBankData copy(String imageUrl, String months) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(months, "months");
        return new InstallmentsBankData(imageUrl, months);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsBankData)) {
            return false;
        }
        InstallmentsBankData installmentsBankData = (InstallmentsBankData) other;
        return Intrinsics.areEqual(this.imageUrl, installmentsBankData.imageUrl) && Intrinsics.areEqual(this.months, installmentsBankData.months);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMonths() {
        return this.months;
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + this.months.hashCode();
    }

    public String toString() {
        return "InstallmentsBankData(imageUrl=" + this.imageUrl + ", months=" + this.months + ")";
    }
}
