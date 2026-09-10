package com.yuno.presentation.extensions;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toDpDimension", "", "toSpDimension", "", "context", "Landroid/content/Context;", "Yuno_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntExtensionsKt {
    public static final int toDpDimension(int i) {
        return i < 0 ? i : (int) ((i * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final int toSpDimension(float f, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
