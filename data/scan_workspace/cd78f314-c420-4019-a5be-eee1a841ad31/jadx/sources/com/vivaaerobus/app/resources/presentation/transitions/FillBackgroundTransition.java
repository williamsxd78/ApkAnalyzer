package com.vivaaerobus.app.resources.presentation.transitions;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FillBackgroundTransition.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/resources/presentation/transitions/FillBackgroundTransition;", "Landroid/graphics/drawable/Drawable;", "startColor", "", "endColor", "<init>", "(II)V", "paint", "Landroid/graphics/Paint;", "progress", "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "getOpacity", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setProgress", "interpolateColor", "colorStart", "colorEnd", "ratio", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FillBackgroundTransition extends Drawable {
    public static final int $stable = 8;
    private final int endColor;
    private final Paint paint = new Paint();
    private float progress;
    private final int startColor;

    public FillBackgroundTransition(int i, int i2) {
        this.startColor = i;
        this.endColor = i2;
    }

    private final int interpolateColor(int colorStart, int colorEnd, float ratio) {
        float f = 1.0f - ratio;
        return Color.argb((int) ((Color.alpha(colorStart) * f) + (Color.alpha(colorEnd) * ratio)), (int) ((Color.red(colorStart) * f) + (Color.red(colorEnd) * ratio)), (int) ((Color.green(colorStart) * f) + (Color.green(colorEnd) * ratio)), (int) ((Color.blue(colorStart) * f) + (Color.blue(colorEnd) * ratio)));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        this.paint.setColor(interpolateColor(this.startColor, this.endColor, this.progress));
        canvas.drawRect(0.0f, 0.0f, width * this.progress, height, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setProgress(float progress) {
        this.progress = progress;
        invalidateSelf();
    }
}
