package com.vivaaerobus.app.extras.extraDetail.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExtraDetailVivaBusJourneyDetail.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/extras/extraDetail/model/ExtraDetailVivaBusRouteDetail;", "", "navigationCode", "", "title", "hasInstructions", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getNavigationCode", "()Ljava/lang/String;", "getTitle", "getHasInstructions", "()Z", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "extras_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExtraDetailVivaBusRouteDetail {
    public static final int $stable = 0;
    private final boolean hasInstructions;
    private final String navigationCode;
    private final String title;

    public ExtraDetailVivaBusRouteDetail(String navigationCode, String title, boolean z) {
        Intrinsics.checkNotNullParameter(navigationCode, "navigationCode");
        Intrinsics.checkNotNullParameter(title, "title");
        this.navigationCode = navigationCode;
        this.title = title;
        this.hasInstructions = z;
    }

    public static /* synthetic */ ExtraDetailVivaBusRouteDetail copy$default(ExtraDetailVivaBusRouteDetail extraDetailVivaBusRouteDetail, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extraDetailVivaBusRouteDetail.navigationCode;
        }
        if ((i & 2) != 0) {
            str2 = extraDetailVivaBusRouteDetail.title;
        }
        if ((i & 4) != 0) {
            z = extraDetailVivaBusRouteDetail.hasInstructions;
        }
        return extraDetailVivaBusRouteDetail.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNavigationCode() {
        return this.navigationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasInstructions() {
        return this.hasInstructions;
    }

    public final ExtraDetailVivaBusRouteDetail copy(String navigationCode, String title, boolean hasInstructions) {
        Intrinsics.checkNotNullParameter(navigationCode, "navigationCode");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ExtraDetailVivaBusRouteDetail(navigationCode, title, hasInstructions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraDetailVivaBusRouteDetail)) {
            return false;
        }
        ExtraDetailVivaBusRouteDetail extraDetailVivaBusRouteDetail = (ExtraDetailVivaBusRouteDetail) other;
        return Intrinsics.areEqual(this.navigationCode, extraDetailVivaBusRouteDetail.navigationCode) && Intrinsics.areEqual(this.title, extraDetailVivaBusRouteDetail.title) && this.hasInstructions == extraDetailVivaBusRouteDetail.hasInstructions;
    }

    public final boolean getHasInstructions() {
        return this.hasInstructions;
    }

    public final String getNavigationCode() {
        return this.navigationCode;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.navigationCode.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.hasInstructions);
    }

    public String toString() {
        return "ExtraDetailVivaBusRouteDetail(navigationCode=" + this.navigationCode + ", title=" + this.title + ", hasInstructions=" + this.hasInstructions + ")";
    }
}
