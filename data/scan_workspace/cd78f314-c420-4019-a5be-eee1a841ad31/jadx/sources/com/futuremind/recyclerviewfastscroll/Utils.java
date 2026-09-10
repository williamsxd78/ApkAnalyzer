package com.futuremind.recyclerviewfastscroll;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes13.dex */
public class Utils {
    public static float getValueInRange(float f, float f2, float f3) {
        return Math.min(Math.max(f, f3), f2);
    }

    public static float getViewRawX(View view) {
        ((View) view.getParent()).getLocationInWindow(new int[]{(int) view.getX(), 0});
        return r0[0];
    }

    public static float getViewRawY(View view) {
        ((View) view.getParent()).getLocationInWindow(new int[]{0, (int) view.getY()});
        return r0[1];
    }

    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
