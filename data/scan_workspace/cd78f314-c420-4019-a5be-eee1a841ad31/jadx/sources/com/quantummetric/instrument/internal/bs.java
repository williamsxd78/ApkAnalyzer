package com.quantummetric.instrument.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class bs extends Drawable {
    protected int a;
    private final WeakReference<View> b;

    public bs(View view) {
        this.b = new WeakReference<>(view);
        a(view);
    }

    public static boolean a(Drawable drawable) {
        return drawable instanceof bu;
    }

    public void a(View view) {
        setBounds(0, 0, view.getWidth(), view.getHeight());
    }

    public final View b() {
        return this.b.get();
    }

    public final int c() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        try {
            View view = this.b.get();
            if (view == null || view.getWidth() * view.getHeight() <= 0) {
                return;
            }
            view.draw(canvas);
        } catch (Throwable unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
