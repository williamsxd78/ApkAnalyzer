package com.vivaaerobus.app.myTrips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.myTrips.R;

/* loaded from: classes5.dex */
public final class ItemLastTripYearBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvYear;

    private ItemLastTripYearBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.tvYear = textView;
    }

    public static ItemLastTripYearBinding bind(View view) {
        int i = R.id.tv_year;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new ItemLastTripYearBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemLastTripYearBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemLastTripYearBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_last_trip_year, viewGroup, false);
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
