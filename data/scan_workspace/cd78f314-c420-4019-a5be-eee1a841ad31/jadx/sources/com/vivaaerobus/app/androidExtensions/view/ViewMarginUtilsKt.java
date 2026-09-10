package com.vivaaerobus.app.androidExtensions.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewMarginUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"updateMargins", "", "Landroid/view/View;", "top", "", TtmlNode.LEFT, "bottom", TtmlNode.RIGHT, "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "androidExtensions_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewMarginUtilsKt {
    public static final void updateMargins(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (num != null) {
            marginLayoutParams2.topMargin = view.getResources().getDimensionPixelSize(num.intValue());
        }
        if (num2 != null) {
            marginLayoutParams2.leftMargin = view.getResources().getDimensionPixelSize(num2.intValue());
        }
        if (num3 != null) {
            marginLayoutParams2.bottomMargin = view.getResources().getDimensionPixelSize(num3.intValue());
        }
        if (num4 != null) {
            marginLayoutParams2.rightMargin = view.getResources().getDimensionPixelSize(num4.intValue());
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void updateMargins$default(View view, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        updateMargins(view, num, num2, num3, num4);
    }
}
