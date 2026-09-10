package com.vivaaerobus.app.resources.presentation.message.toast;

import android.content.Context;
import android.widget.Toast;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Context+Extension.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"showToast", "", "Landroid/content/Context;", "message", "", "duration", "", "resources_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Context_ExtensionKt {
    public static final void showToast(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Toast.makeText(context, i, i2).show();
    }

    public static final void showToast(Context context, String message, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Toast.makeText(context, message, i).show();
    }

    public static /* synthetic */ void showToast$default(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        showToast(context, i, i2);
    }

    public static /* synthetic */ void showToast$default(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        showToast(context, str, i);
    }
}
