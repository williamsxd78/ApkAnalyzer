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
public final class FlightOptionsCurrencyAdviceBinding implements ViewBinding {
    public final TextView flightOptionsCurrencyAdviceTvCurrencyAdvice;
    private final LinearLayout rootView;

    private FlightOptionsCurrencyAdviceBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.flightOptionsCurrencyAdviceTvCurrencyAdvice = textView;
    }

    public static FlightOptionsCurrencyAdviceBinding bind(View view) {
        int i = R.id.flight_options_currency_advice_tv_currency_advice;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new FlightOptionsCurrencyAdviceBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FlightOptionsCurrencyAdviceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FlightOptionsCurrencyAdviceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.flight_options_currency_advice, viewGroup, false);
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
