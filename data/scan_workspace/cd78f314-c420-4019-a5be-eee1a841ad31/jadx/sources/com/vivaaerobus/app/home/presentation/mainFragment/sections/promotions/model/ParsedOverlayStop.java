package com.vivaaerobus.app.home.presentation.mainFragment.sections.promotions.model;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: ParsedPromotionOverlay.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/home/presentation/mainFragment/sections/promotions/model/ParsedOverlayStop;", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "", "alpha", "<init>", "(FF)V", "getY", "()F", "getAlpha", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "home_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ParsedOverlayStop {
    public static final int $stable = 0;
    private final float alpha;
    private final float y;

    public ParsedOverlayStop(float f, float f2) {
        this.y = f;
        this.alpha = f2;
    }

    public static /* synthetic */ ParsedOverlayStop copy$default(ParsedOverlayStop parsedOverlayStop, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = parsedOverlayStop.y;
        }
        if ((i & 2) != 0) {
            f2 = parsedOverlayStop.alpha;
        }
        return parsedOverlayStop.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    public final ParsedOverlayStop copy(float y, float alpha) {
        return new ParsedOverlayStop(y, alpha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedOverlayStop)) {
            return false;
        }
        ParsedOverlayStop parsedOverlayStop = (ParsedOverlayStop) other;
        return Float.compare(this.y, parsedOverlayStop.y) == 0 && Float.compare(this.alpha, parsedOverlayStop.alpha) == 0;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return (Float.hashCode(this.y) * 31) + Float.hashCode(this.alpha);
    }

    public String toString() {
        return "ParsedOverlayStop(y=" + this.y + ", alpha=" + this.alpha + ")";
    }
}
