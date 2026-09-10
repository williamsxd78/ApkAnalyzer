package com.tooltip;

import android.content.res.Resources;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes3.dex */
final class Utils {
    Utils() {
    }

    public static RectF calculateRectInWindow(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new RectF(iArr[0], iArr[1], r2 + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }

    public static RectF calculateRectOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], r2 + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }

    public static float dpToPx(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static float pxToDp(float f) {
        return f / Resources.getSystem().getDisplayMetrics().density;
    }
}
