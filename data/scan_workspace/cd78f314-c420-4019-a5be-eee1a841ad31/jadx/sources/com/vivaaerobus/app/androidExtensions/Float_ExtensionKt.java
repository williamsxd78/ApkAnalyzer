package com.vivaaerobus.app.androidExtensions;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Float+Extension.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"convertDpToPixels", "", "", "context", "Landroid/content/Context;", "androidExtensions_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Float_ExtensionKt {
    public static final int convertDpToPixels(float f, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }
}
