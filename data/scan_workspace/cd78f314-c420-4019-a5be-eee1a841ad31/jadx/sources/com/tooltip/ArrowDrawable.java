package com.tooltip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;

/* loaded from: classes3.dex */
final class ArrowDrawable extends ColorDrawable {
    private final int mBackgroundColor;
    private final int mGravity;
    private final Paint mPaint;
    private Path mPath;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrowDrawable(int i, int i2) {
        Paint paint = new Paint(1);
        this.mPaint = paint;
        this.mGravity = i2;
        this.mBackgroundColor = 0;
        paint.setColor(i);
    }

    private synchronized void updatePath(Rect rect) {
        this.mPath = new Path();
        float width = (rect.width() * 5) / 100;
        float height = (rect.height() * 5) / 100;
        int i = this.mGravity;
        if (i == 3) {
            float f = height * 2.5f;
            float f2 = width * 10.0f;
            float f3 = f * 3.0f;
            float f4 = width / 4.0f;
            float f5 = f * 2.0f;
            this.mPath.moveTo(0.0f, 0.0f);
            this.mPath.cubicTo(0.0f, 0.0f, f4, f5, f2, f3);
            this.mPath.cubicTo(f2, f3, rect.width() * 1.5f, rect.height() / 2, f2, rect.height() - f3);
            this.mPath.cubicTo(f2, rect.height() - f3, f4, rect.height() - f5, 0.0f, rect.height());
        } else if (i == 5) {
            float f6 = height * 2.5f;
            float f7 = f6 * 3.0f;
            float f8 = f6 * 2.0f;
            float width2 = rect.width() - (width / 4.0f);
            float width3 = rect.width() - (10.0f * width);
            this.mPath.moveTo(rect.width(), 0.0f);
            this.mPath.cubicTo(rect.width(), 0.0f, width2, f8, width3, f7);
            this.mPath.cubicTo(width3, f7, -width3, rect.height() / 2, width3, rect.height() - f7);
            this.mPath.cubicTo(width3, rect.height() - f7, width2, rect.height() - f8, rect.width(), rect.height());
        } else if (i == 48) {
            float f9 = width * 2.5f;
            float f10 = f9 * 3.0f;
            float f11 = height * 10.0f;
            float f12 = f9 * 2.0f;
            float f13 = height / 4.0f;
            this.mPath.moveTo(0.0f, 0.0f);
            this.mPath.cubicTo(0.0f, 0.0f, f12, f13, f10, f11);
            this.mPath.cubicTo(f10, f11, rect.width() / 2, rect.height() * 1.5f, rect.width() - f10, f11);
            this.mPath.cubicTo(rect.width() - f10, f11, rect.width() - f12, f13, rect.width(), 0.0f);
        } else if (i == 80) {
            float f14 = width * 2.5f;
            float f15 = f14 * 3.0f;
            float f16 = f14 * 2.0f;
            float height2 = rect.height() - (height / 4.0f);
            float height3 = rect.height() - (10.0f * height);
            this.mPath.moveTo(0.0f, rect.height());
            this.mPath.cubicTo(0.0f, rect.height(), f16, height2, f15, height3);
            this.mPath.cubicTo(f15, height3, rect.width() / 2, -height3, rect.width() - f15, height3);
            this.mPath.cubicTo(rect.width() - f15, height3, rect.width() - f16, height2, rect.width(), rect.height());
        }
        this.mPath.close();
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawColor(this.mBackgroundColor);
        if (this.mPath == null) {
            updatePath(getBounds());
        }
        canvas.drawPath(this.mPath, this.mPaint);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.mPaint.getColorFilter() != null) {
            return -3;
        }
        int color = this.mPaint.getColor() >>> 24;
        if (color != 0) {
            return color != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updatePath(rect);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.ColorDrawable
    public void setColor(int i) {
        this.mPaint.setColor(i);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }
}
