package com.vivaaerobus.app.resources.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.resources.R;

/* loaded from: classes5.dex */
public final class PricePerPersonBinding implements ViewBinding {
    public final ImageView pricePerPersonIvIcon;
    public final TextView pricePerPersonTvAmount;
    public final TextView pricePerPersonTvCurrency;
    public final TextView pricePerPersonTvCurrencySymbol;
    public final TextView pricePerPersonTvDiagonal;
    public final TextView pricePerPersonTvFrom;
    public final TextView pricePerPersonTvHyphen;
    private final LinearLayout rootView;

    private PricePerPersonBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.pricePerPersonIvIcon = imageView;
        this.pricePerPersonTvAmount = textView;
        this.pricePerPersonTvCurrency = textView2;
        this.pricePerPersonTvCurrencySymbol = textView3;
        this.pricePerPersonTvDiagonal = textView4;
        this.pricePerPersonTvFrom = textView5;
        this.pricePerPersonTvHyphen = textView6;
    }

    public static PricePerPersonBinding bind(View view) {
        int i = R.id.price_per_person_iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.price_per_person_tv_amount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.price_per_person_tv_currency;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.price_per_person_tv_currency_symbol;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.price_per_person_tv_diagonal;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.price_per_person_tv_from;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.price_per_person_tv_hyphen;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    return new PricePerPersonBinding((LinearLayout) view, imageView, textView, textView2, textView3, textView4, textView5, textView6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PricePerPersonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PricePerPersonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.price_per_person, viewGroup, false);
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
