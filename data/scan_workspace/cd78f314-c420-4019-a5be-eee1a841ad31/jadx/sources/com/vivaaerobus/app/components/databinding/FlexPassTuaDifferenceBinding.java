package com.vivaaerobus.app.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.components.R;

/* loaded from: classes4.dex */
public final class FlexPassTuaDifferenceBinding implements ViewBinding {
    public final LinearLayout flexPassTuaDifferenceLlContent;
    public final TextView flexPassTuaDifferenceTvTuaLabel;
    public final TextView flexPassTuaDifferenceTvTuaPrice;
    public final TextView flexPassTuaDifferenceTvTuaPriceCurrency;
    private final LinearLayout rootView;

    private FlexPassTuaDifferenceBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.flexPassTuaDifferenceLlContent = linearLayout2;
        this.flexPassTuaDifferenceTvTuaLabel = textView;
        this.flexPassTuaDifferenceTvTuaPrice = textView2;
        this.flexPassTuaDifferenceTvTuaPriceCurrency = textView3;
    }

    public static FlexPassTuaDifferenceBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.flex_pass_tua_difference_tv_tua_label;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.flex_pass_tua_difference_tv_tua_price;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.flex_pass_tua_difference_tv_tua_price_currency;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new FlexPassTuaDifferenceBinding(linearLayout, linearLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FlexPassTuaDifferenceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FlexPassTuaDifferenceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.flex_pass_tua_difference, viewGroup, false);
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
