package com.yuno.payments.base.extensions;

import android.content.Context;
import android.util.TypedValue;
import com.yuno.payments.base.annotations.Generated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntExtensions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007¨\u0006\b"}, d2 = {"dpToPixels", "", "context", "Landroid/content/Context;", "orZero", "(Ljava/lang/Integer;)I", "toMinutes", "", "Yuno_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntExtensionsKt {
    @Generated
    public static final int dpToPixels(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final int orZero(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toMinutes(float f) {
        return (int) (f / 60000);
    }
}
