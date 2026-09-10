package com.vivaaerobus.app.flightStatus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.flightStatus.R;

/* loaded from: classes5.dex */
public final class HeaderFlightStatusSubscriptionBinding implements ViewBinding {
    public final TextView headerFlightStatusSubscriptionTvDate;
    private final LinearLayout rootView;

    private HeaderFlightStatusSubscriptionBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.headerFlightStatusSubscriptionTvDate = textView;
    }

    public static HeaderFlightStatusSubscriptionBinding bind(View view) {
        int i = R.id.header_flight_status_subscription_tv_date;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new HeaderFlightStatusSubscriptionBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static HeaderFlightStatusSubscriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HeaderFlightStatusSubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.header_flight_status_subscription, viewGroup, false);
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
