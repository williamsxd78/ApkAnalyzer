package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.chuckerteam.chucker.R;

/* loaded from: classes13.dex */
public final class ChuckerTransactionItemImageBinding implements ViewBinding {
    public final ImageView binaryData;
    private final FrameLayout rootView;

    private ChuckerTransactionItemImageBinding(FrameLayout frameLayout, ImageView imageView) {
        this.rootView = frameLayout;
        this.binaryData = imageView;
    }

    public static ChuckerTransactionItemImageBinding bind(View view) {
        int i = R.id.binaryData;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new ChuckerTransactionItemImageBinding((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChuckerTransactionItemImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChuckerTransactionItemImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_transaction_item_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
