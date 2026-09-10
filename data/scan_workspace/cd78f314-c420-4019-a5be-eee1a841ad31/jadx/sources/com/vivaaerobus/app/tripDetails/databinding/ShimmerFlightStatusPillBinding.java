package com.vivaaerobus.app.tripDetails.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.tripDetails.R;

/* loaded from: classes6.dex */
public final class ShimmerFlightStatusPillBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final View view2;

    private ShimmerFlightStatusPillBinding(LinearLayout linearLayout, View view) {
        this.rootView = linearLayout;
        this.view2 = view;
    }

    public static ShimmerFlightStatusPillBinding bind(View view) {
        int i = R.id.view2;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new ShimmerFlightStatusPillBinding((LinearLayout) view, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ShimmerFlightStatusPillBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShimmerFlightStatusPillBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_flight_status_pill, viewGroup, false);
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
