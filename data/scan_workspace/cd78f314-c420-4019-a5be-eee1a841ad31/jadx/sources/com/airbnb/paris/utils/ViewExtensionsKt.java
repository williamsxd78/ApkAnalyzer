package com.airbnb.paris.utils;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewExtensions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\f"}, d2 = {"setPaddingBottom", "", "Landroid/view/View;", "px", "", "setPaddingEnd", "setPaddingHorizontal", "setPaddingLeft", "setPaddingRight", "setPaddingStart", "setPaddingTop", "setPaddingVertical", "paris_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes13.dex */
public final class ViewExtensionsKt {
    public static final void setPaddingBottom(View setPaddingBottom, int i) {
        Intrinsics.checkNotNullParameter(setPaddingBottom, "$this$setPaddingBottom");
        setPaddingBottom.setPadding(setPaddingBottom.getPaddingLeft(), setPaddingBottom.getPaddingTop(), setPaddingBottom.getPaddingRight(), i);
    }

    public static final void setPaddingEnd(View setPaddingEnd, int i) {
        Intrinsics.checkNotNullParameter(setPaddingEnd, "$this$setPaddingEnd");
        setPaddingEnd.setPaddingRelative(setPaddingEnd.getPaddingStart(), setPaddingEnd.getPaddingTop(), i, setPaddingEnd.getPaddingBottom());
    }

    public static final void setPaddingHorizontal(View setPaddingHorizontal, int i) {
        Intrinsics.checkNotNullParameter(setPaddingHorizontal, "$this$setPaddingHorizontal");
        setPaddingHorizontal.setPadding(i, setPaddingHorizontal.getPaddingTop(), i, setPaddingHorizontal.getPaddingBottom());
    }

    public static final void setPaddingLeft(View setPaddingLeft, int i) {
        Intrinsics.checkNotNullParameter(setPaddingLeft, "$this$setPaddingLeft");
        setPaddingLeft.setPadding(i, setPaddingLeft.getPaddingTop(), setPaddingLeft.getPaddingRight(), setPaddingLeft.getPaddingBottom());
    }

    public static final void setPaddingRight(View setPaddingRight, int i) {
        Intrinsics.checkNotNullParameter(setPaddingRight, "$this$setPaddingRight");
        setPaddingRight.setPadding(setPaddingRight.getPaddingLeft(), setPaddingRight.getPaddingTop(), i, setPaddingRight.getPaddingBottom());
    }

    public static final void setPaddingStart(View setPaddingStart, int i) {
        Intrinsics.checkNotNullParameter(setPaddingStart, "$this$setPaddingStart");
        setPaddingStart.setPaddingRelative(i, setPaddingStart.getPaddingTop(), setPaddingStart.getPaddingEnd(), setPaddingStart.getPaddingBottom());
    }

    public static final void setPaddingTop(View setPaddingTop, int i) {
        Intrinsics.checkNotNullParameter(setPaddingTop, "$this$setPaddingTop");
        setPaddingTop.setPadding(setPaddingTop.getPaddingLeft(), i, setPaddingTop.getPaddingRight(), setPaddingTop.getPaddingBottom());
    }

    public static final void setPaddingVertical(View setPaddingVertical, int i) {
        Intrinsics.checkNotNullParameter(setPaddingVertical, "$this$setPaddingVertical");
        setPaddingVertical.setPadding(setPaddingVertical.getPaddingLeft(), i, setPaddingVertical.getPaddingRight(), i);
    }
}
