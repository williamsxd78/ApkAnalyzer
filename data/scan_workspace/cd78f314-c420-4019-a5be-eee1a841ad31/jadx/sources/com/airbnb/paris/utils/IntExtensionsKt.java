package com.airbnb.paris.utils;

import android.content.res.ColorStateList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntExtensions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toColorStateList", "Landroid/content/res/ColorStateList;", "", "paris_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes13.dex */
public final class IntExtensionsKt {
    public static final ColorStateList toColorStateList(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(valueOf, "ColorStateList.valueOf(this)");
        return valueOf;
    }
}
