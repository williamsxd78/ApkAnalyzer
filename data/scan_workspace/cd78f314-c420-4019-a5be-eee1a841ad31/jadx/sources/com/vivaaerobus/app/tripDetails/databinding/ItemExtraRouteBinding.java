package com.vivaaerobus.app.tripDetails.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.tripDetails.R;

/* loaded from: classes6.dex */
public final class ItemExtraRouteBinding implements ViewBinding {
    public final ImageView itemExtraRouteIvIcon;
    public final TextView itemExtraRouteTvRoute;
    public final TextView itemExtraRouteTvType;
    private final LinearLayout rootView;

    private ItemExtraRouteBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.itemExtraRouteIvIcon = imageView;
        this.itemExtraRouteTvRoute = textView;
        this.itemExtraRouteTvType = textView2;
    }

    public static ItemExtraRouteBinding bind(View view) {
        int i = R.id.item_extra_route_iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.item_extra_route_tv_route;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.item_extra_route_tv_type;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ItemExtraRouteBinding((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemExtraRouteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemExtraRouteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_extra_route, viewGroup, false);
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
