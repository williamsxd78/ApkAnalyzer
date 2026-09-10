package com.vivaaerobus.app.tripDetails.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.tripDetails.R;

/* loaded from: classes6.dex */
public final class TripDetailsCustomTitleBinding implements ViewBinding {
    private final TextView rootView;

    private TripDetailsCustomTitleBinding(TextView textView) {
        this.rootView = textView;
    }

    public static TripDetailsCustomTitleBinding bind(View view) {
        if (view != null) {
            return new TripDetailsCustomTitleBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static TripDetailsCustomTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TripDetailsCustomTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.trip_details_custom_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }
}
