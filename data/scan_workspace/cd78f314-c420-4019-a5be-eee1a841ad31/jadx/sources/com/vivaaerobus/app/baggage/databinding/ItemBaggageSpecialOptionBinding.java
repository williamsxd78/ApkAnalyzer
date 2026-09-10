package com.vivaaerobus.app.baggage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.baggage.R;

/* loaded from: classes3.dex */
public final class ItemBaggageSpecialOptionBinding implements ViewBinding {
    public final ImageView itemBaggageSpecialOptionIvAdd;
    public final TextView itemBaggageSpecialOptionTvName;
    public final View itemSeparator;
    private final LinearLayout rootView;

    private ItemBaggageSpecialOptionBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, View view) {
        this.rootView = linearLayout;
        this.itemBaggageSpecialOptionIvAdd = imageView;
        this.itemBaggageSpecialOptionTvName = textView;
        this.itemSeparator = view;
    }

    public static ItemBaggageSpecialOptionBinding bind(View view) {
        View findChildViewById;
        int i = R.id.item_baggage_special_option_iv_add;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.item_baggage_special_option_tv_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.item_separator))) != null) {
                return new ItemBaggageSpecialOptionBinding((LinearLayout) view, imageView, textView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemBaggageSpecialOptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBaggageSpecialOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_baggage_special_option, viewGroup, false);
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
