package com.vivaaerobus.app.newContentful.domain.usecase.getDarkAppFlags;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: GetDarkAppFlagsResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/usecase/getDarkAppFlags/GetDarkAppFlagsResponse;", "", "enableDarkApp", "", "enableContingencyModeA", "enableContingencyModeB", "hidePromotionsCarousel", "<init>", "(ZZZZ)V", "getEnableDarkApp", "()Z", "getEnableContingencyModeA", "getEnableContingencyModeB", "getHidePromotionsCarousel", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GetDarkAppFlagsResponse {
    private final boolean enableContingencyModeA;
    private final boolean enableContingencyModeB;
    private final boolean enableDarkApp;
    private final boolean hidePromotionsCarousel;

    public GetDarkAppFlagsResponse(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableDarkApp = z;
        this.enableContingencyModeA = z2;
        this.enableContingencyModeB = z3;
        this.hidePromotionsCarousel = z4;
    }

    public static /* synthetic */ GetDarkAppFlagsResponse copy$default(GetDarkAppFlagsResponse getDarkAppFlagsResponse, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getDarkAppFlagsResponse.enableDarkApp;
        }
        if ((i & 2) != 0) {
            z2 = getDarkAppFlagsResponse.enableContingencyModeA;
        }
        if ((i & 4) != 0) {
            z3 = getDarkAppFlagsResponse.enableContingencyModeB;
        }
        if ((i & 8) != 0) {
            z4 = getDarkAppFlagsResponse.hidePromotionsCarousel;
        }
        return getDarkAppFlagsResponse.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableDarkApp() {
        return this.enableDarkApp;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableContingencyModeA() {
        return this.enableContingencyModeA;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableContingencyModeB() {
        return this.enableContingencyModeB;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHidePromotionsCarousel() {
        return this.hidePromotionsCarousel;
    }

    public final GetDarkAppFlagsResponse copy(boolean enableDarkApp, boolean enableContingencyModeA, boolean enableContingencyModeB, boolean hidePromotionsCarousel) {
        return new GetDarkAppFlagsResponse(enableDarkApp, enableContingencyModeA, enableContingencyModeB, hidePromotionsCarousel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDarkAppFlagsResponse)) {
            return false;
        }
        GetDarkAppFlagsResponse getDarkAppFlagsResponse = (GetDarkAppFlagsResponse) other;
        return this.enableDarkApp == getDarkAppFlagsResponse.enableDarkApp && this.enableContingencyModeA == getDarkAppFlagsResponse.enableContingencyModeA && this.enableContingencyModeB == getDarkAppFlagsResponse.enableContingencyModeB && this.hidePromotionsCarousel == getDarkAppFlagsResponse.hidePromotionsCarousel;
    }

    public final boolean getEnableContingencyModeA() {
        return this.enableContingencyModeA;
    }

    public final boolean getEnableContingencyModeB() {
        return this.enableContingencyModeB;
    }

    public final boolean getEnableDarkApp() {
        return this.enableDarkApp;
    }

    public final boolean getHidePromotionsCarousel() {
        return this.hidePromotionsCarousel;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.enableDarkApp) * 31) + Boolean.hashCode(this.enableContingencyModeA)) * 31) + Boolean.hashCode(this.enableContingencyModeB)) * 31) + Boolean.hashCode(this.hidePromotionsCarousel);
    }

    public String toString() {
        return "GetDarkAppFlagsResponse(enableDarkApp=" + this.enableDarkApp + ", enableContingencyModeA=" + this.enableContingencyModeA + ", enableContingencyModeB=" + this.enableContingencyModeB + ", hidePromotionsCarousel=" + this.hidePromotionsCarousel + ")";
    }
}
