package com.vivaaerobus.app.resources.presentation.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewExtensions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"ZERO", "", "ONE", "TIME_DURATION", "", "enterAnimation", "", "Landroid/view/View;", "exitAnimation", "resources_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewExtensionsKt {
    public static final float ONE = 1.0f;
    public static final long TIME_DURATION = 300;
    public static final float ZERO = 0.0f;

    public static final void enterAnimation(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(300L).start();
    }

    public static final void exitAnimation(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(1.0f);
        view.animate().alpha(0.0f).setDuration(300L).start();
    }
}
