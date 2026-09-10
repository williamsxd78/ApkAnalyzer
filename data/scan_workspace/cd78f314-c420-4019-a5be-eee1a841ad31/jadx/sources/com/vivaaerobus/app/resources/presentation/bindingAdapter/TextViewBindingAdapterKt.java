package com.vivaaerobus.app.resources.presentation.bindingAdapter;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViewBindingAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"setTextOrGone", "", "textView", "Landroid/widget/TextView;", "text", "", "setDrawableStart", "iconStart", "Landroid/graphics/drawable/Drawable;", "resources_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextViewBindingAdapterKt {
    @BindingAdapter({"setDrawableStart"})
    public static final void setDrawableStart(TextView textView, Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @BindingAdapter({"setTextOrGone"})
    public static final void setTextOrGone(TextView textView, String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(textView, "textView");
        TextView textView2 = textView;
        if (str != null) {
            textView.setText(str);
            z = true;
        } else {
            z = false;
        }
        textView2.setVisibility(z ? 0 : 8);
    }
}
