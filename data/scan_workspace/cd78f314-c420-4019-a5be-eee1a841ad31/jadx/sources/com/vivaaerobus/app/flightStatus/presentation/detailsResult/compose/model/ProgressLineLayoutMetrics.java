package com.vivaaerobus.app.flightStatus.presentation.detailsResult.compose.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: ProgressLineLayoutMetrics.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/flightStatus/presentation/detailsResult/compose/model/ProgressLineLayoutMetrics;", "", "canvasWidth", "", "centerY", "strokeWidth", "gapRadius", "<init>", "(FFFF)V", "getCanvasWidth", "()F", "getCenterY", "getStrokeWidth", "getGapRadius", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "flightStatus_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProgressLineLayoutMetrics {
    public static final int $stable = 0;
    private final float canvasWidth;
    private final float centerY;
    private final float gapRadius;
    private final float strokeWidth;

    public ProgressLineLayoutMetrics(float f, float f2, float f3, float f4) {
        this.canvasWidth = f;
        this.centerY = f2;
        this.strokeWidth = f3;
        this.gapRadius = f4;
    }

    public static /* synthetic */ ProgressLineLayoutMetrics copy$default(ProgressLineLayoutMetrics progressLineLayoutMetrics, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = progressLineLayoutMetrics.canvasWidth;
        }
        if ((i & 2) != 0) {
            f2 = progressLineLayoutMetrics.centerY;
        }
        if ((i & 4) != 0) {
            f3 = progressLineLayoutMetrics.strokeWidth;
        }
        if ((i & 8) != 0) {
            f4 = progressLineLayoutMetrics.gapRadius;
        }
        return progressLineLayoutMetrics.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCanvasWidth() {
        return this.canvasWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCenterY() {
        return this.centerY;
    }

    /* renamed from: component3, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: component4, reason: from getter */
    public final float getGapRadius() {
        return this.gapRadius;
    }

    public final ProgressLineLayoutMetrics copy(float canvasWidth, float centerY, float strokeWidth, float gapRadius) {
        return new ProgressLineLayoutMetrics(canvasWidth, centerY, strokeWidth, gapRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressLineLayoutMetrics)) {
            return false;
        }
        ProgressLineLayoutMetrics progressLineLayoutMetrics = (ProgressLineLayoutMetrics) other;
        return Float.compare(this.canvasWidth, progressLineLayoutMetrics.canvasWidth) == 0 && Float.compare(this.centerY, progressLineLayoutMetrics.centerY) == 0 && Float.compare(this.strokeWidth, progressLineLayoutMetrics.strokeWidth) == 0 && Float.compare(this.gapRadius, progressLineLayoutMetrics.gapRadius) == 0;
    }

    public final float getCanvasWidth() {
        return this.canvasWidth;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final float getGapRadius() {
        return this.gapRadius;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.canvasWidth) * 31) + Float.hashCode(this.centerY)) * 31) + Float.hashCode(this.strokeWidth)) * 31) + Float.hashCode(this.gapRadius);
    }

    public String toString() {
        return "ProgressLineLayoutMetrics(canvasWidth=" + this.canvasWidth + ", centerY=" + this.centerY + ", strokeWidth=" + this.strokeWidth + ", gapRadius=" + this.gapRadius + ")";
    }
}
