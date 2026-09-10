package com.vivaaerobus.app.tripDetails.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.tripDetails.R;

/* loaded from: classes6.dex */
public final class ItemSeatTypeBinding implements ViewBinding {
    public final TextView itemSeatTypeTvBrand;
    public final TextView itemSeatTypeTvSeatType;
    private final LinearLayout rootView;

    private ItemSeatTypeBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.itemSeatTypeTvBrand = textView;
        this.itemSeatTypeTvSeatType = textView2;
    }

    public static ItemSeatTypeBinding bind(View view) {
        int i = R.id.item_seat_type_tv_brand;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.item_seat_type_tv_seat_type;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new ItemSeatTypeBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemSeatTypeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSeatTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_seat_type, viewGroup, false);
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
