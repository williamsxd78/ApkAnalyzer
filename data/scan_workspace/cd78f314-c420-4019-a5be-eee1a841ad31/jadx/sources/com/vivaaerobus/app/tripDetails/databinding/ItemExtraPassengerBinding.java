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
public final class ItemExtraPassengerBinding implements ViewBinding {
    public final TextView itemExtraPassengerTvName;
    private final LinearLayout rootView;

    private ItemExtraPassengerBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.itemExtraPassengerTvName = textView;
    }

    public static ItemExtraPassengerBinding bind(View view) {
        int i = R.id.item_extra_passenger_tv_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new ItemExtraPassengerBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemExtraPassengerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemExtraPassengerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_extra_passenger, viewGroup, false);
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
