package com.quantummetric.instrument.internal;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes3.dex */
final class bo extends ga {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bo(Drawable drawable) {
        Paint paint = ((ShapeDrawable) drawable).getPaint();
        if (paint != null) {
            this.a = paint.getColor();
        }
    }
}
