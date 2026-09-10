package com.vivaaerobus.app.home.presentation.mainFragment.sections.promotions.detail;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: PromotionDetailHeaderAnimValues.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/home/presentation/mainFragment/sections/promotions/detail/PromotionDetailHeaderAnimValues;", "", "alpha", "", "expandedTitleAlpha", "compactTitleAlpha", "<init>", "(FFF)V", "getAlpha", "()F", "getExpandedTitleAlpha", "getCompactTitleAlpha", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "home_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PromotionDetailHeaderAnimValues {
    public static final int $stable = 0;
    private final float alpha;
    private final float compactTitleAlpha;
    private final float expandedTitleAlpha;

    public PromotionDetailHeaderAnimValues(float f, float f2, float f3) {
        this.alpha = f;
        this.expandedTitleAlpha = f2;
        this.compactTitleAlpha = f3;
    }

    public static /* synthetic */ PromotionDetailHeaderAnimValues copy$default(PromotionDetailHeaderAnimValues promotionDetailHeaderAnimValues, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = promotionDetailHeaderAnimValues.alpha;
        }
        if ((i & 2) != 0) {
            f2 = promotionDetailHeaderAnimValues.expandedTitleAlpha;
        }
        if ((i & 4) != 0) {
            f3 = promotionDetailHeaderAnimValues.compactTitleAlpha;
        }
        return promotionDetailHeaderAnimValues.copy(f, f2, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component2, reason: from getter */
    public final float getExpandedTitleAlpha() {
        return this.expandedTitleAlpha;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCompactTitleAlpha() {
        return this.compactTitleAlpha;
    }

    public final PromotionDetailHeaderAnimValues copy(float alpha, float expandedTitleAlpha, float compactTitleAlpha) {
        return new PromotionDetailHeaderAnimValues(alpha, expandedTitleAlpha, compactTitleAlpha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionDetailHeaderAnimValues)) {
            return false;
        }
        PromotionDetailHeaderAnimValues promotionDetailHeaderAnimValues = (PromotionDetailHeaderAnimValues) other;
        return Float.compare(this.alpha, promotionDetailHeaderAnimValues.alpha) == 0 && Float.compare(this.expandedTitleAlpha, promotionDetailHeaderAnimValues.expandedTitleAlpha) == 0 && Float.compare(this.compactTitleAlpha, promotionDetailHeaderAnimValues.compactTitleAlpha) == 0;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getCompactTitleAlpha() {
        return this.compactTitleAlpha;
    }

    public final float getExpandedTitleAlpha() {
        return this.expandedTitleAlpha;
    }

    public int hashCode() {
        return (((Float.hashCode(this.alpha) * 31) + Float.hashCode(this.expandedTitleAlpha)) * 31) + Float.hashCode(this.compactTitleAlpha);
    }

    public String toString() {
        return "PromotionDetailHeaderAnimValues(alpha=" + this.alpha + ", expandedTitleAlpha=" + this.expandedTitleAlpha + ", compactTitleAlpha=" + this.compactTitleAlpha + ")";
    }
}
