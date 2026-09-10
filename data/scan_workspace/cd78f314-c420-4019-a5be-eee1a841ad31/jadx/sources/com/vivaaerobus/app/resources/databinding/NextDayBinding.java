package com.vivaaerobus.app.resources.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.resources.R;

/* loaded from: classes5.dex */
public final class NextDayBinding implements ViewBinding {
    public final TextView nextDayTvNextDayArrival;
    public final TextView nextDayTvPlusOneDay;
    private final LinearLayout rootView;
    public final LinearLayout segmentDetailsLlNextDayArrival;

    private NextDayBinding(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.nextDayTvNextDayArrival = textView;
        this.nextDayTvPlusOneDay = textView2;
        this.segmentDetailsLlNextDayArrival = linearLayout2;
    }

    public static NextDayBinding bind(View view) {
        int i = R.id.next_day_tv_next_day_arrival;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.next_day_tv_plus_one_day;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new NextDayBinding(linearLayout, textView, textView2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static NextDayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NextDayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.next_day, viewGroup, false);
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
