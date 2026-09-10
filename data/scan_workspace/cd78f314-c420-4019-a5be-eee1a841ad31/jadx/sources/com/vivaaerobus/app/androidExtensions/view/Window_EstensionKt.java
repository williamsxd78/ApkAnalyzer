package com.vivaaerobus.app.androidExtensions.view;

import android.view.Window;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Window+Estension.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"customBrightness", "", "raiseBrightnessFull", "", "Landroid/view/Window;", "restoreBrightness", "androidExtensions_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Window_EstensionKt {
    private static float customBrightness = 0.5f;

    public static final void raiseBrightnessFull(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        WindowManager.LayoutParams attributes = window.getAttributes();
        customBrightness = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
    }

    public static final void restoreBrightness(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = customBrightness;
        window.setAttributes(attributes);
    }
}
