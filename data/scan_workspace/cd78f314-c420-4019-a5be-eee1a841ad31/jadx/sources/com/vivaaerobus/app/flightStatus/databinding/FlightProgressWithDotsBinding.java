package com.vivaaerobus.app.flightStatus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.flightStatus.R;

/* loaded from: classes5.dex */
public final class FlightProgressWithDotsBinding implements ViewBinding {
    public final LinearLayout flightProgressWithDotsLlArrived;
    public final LinearLayout flightProgressWithDotsLlInFlight;
    public final LinearLayout flightProgressWithDotsLlOnTime;
    private final LinearLayout rootView;

    private FlightProgressWithDotsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.rootView = linearLayout;
        this.flightProgressWithDotsLlArrived = linearLayout2;
        this.flightProgressWithDotsLlInFlight = linearLayout3;
        this.flightProgressWithDotsLlOnTime = linearLayout4;
    }

    public static FlightProgressWithDotsBinding bind(View view) {
        int i = R.id.flight_progress_with_dots_ll_arrived;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.flight_progress_with_dots_ll_in_flight;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.flight_progress_with_dots_ll_on_time;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    return new FlightProgressWithDotsBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FlightProgressWithDotsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FlightProgressWithDotsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.flight_progress_with_dots, viewGroup, false);
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
