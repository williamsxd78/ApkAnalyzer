package com.vivaaerobus.app.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.components.R;

/* loaded from: classes4.dex */
public final class GenericCardHeaderBinding implements ViewBinding {
    public final ImageView genericCardHeaderIvImage;
    public final LinearLayout genericCardHeaderLlContainer;
    private final LinearLayout rootView;

    private GenericCardHeaderBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.genericCardHeaderIvImage = imageView;
        this.genericCardHeaderLlContainer = linearLayout2;
    }

    public static GenericCardHeaderBinding bind(View view) {
        int i = R.id.generic_card_header_iv_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new GenericCardHeaderBinding(linearLayout, imageView, linearLayout);
    }

    public static GenericCardHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GenericCardHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.generic_card_header, viewGroup, false);
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
