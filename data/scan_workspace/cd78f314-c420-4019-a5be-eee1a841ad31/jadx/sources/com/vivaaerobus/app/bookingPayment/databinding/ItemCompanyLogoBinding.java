package com.vivaaerobus.app.bookingPayment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.bookingPayment.R;

/* loaded from: classes4.dex */
public final class ItemCompanyLogoBinding implements ViewBinding {
    public final ImageView itemCompanyLogoIv;
    private final ImageView rootView;

    private ItemCompanyLogoBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.itemCompanyLogoIv = imageView2;
    }

    public static ItemCompanyLogoBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new ItemCompanyLogoBinding(imageView, imageView);
    }

    public static ItemCompanyLogoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCompanyLogoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_company_logo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageView getRoot() {
        return this.rootView;
    }
}
