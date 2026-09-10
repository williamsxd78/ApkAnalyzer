package com.vivaaerobus.app.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.components.R;

/* loaded from: classes4.dex */
public final class GenericIconWithTextBinding implements ViewBinding {
    public final ImageView genericIconWithTextIvIcon;
    public final LinearLayout genericIconWithTextLlContainer;
    public final TextView genericIconWithTextTvText;
    private final LinearLayout rootView;

    private GenericIconWithTextBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.genericIconWithTextIvIcon = imageView;
        this.genericIconWithTextLlContainer = linearLayout2;
        this.genericIconWithTextTvText = textView;
    }

    public static GenericIconWithTextBinding bind(View view) {
        int i = R.id.generic_icon_with_text_iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = R.id.generic_icon_with_text_tv_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new GenericIconWithTextBinding(linearLayout, imageView, linearLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GenericIconWithTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GenericIconWithTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.generic_icon_with_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
