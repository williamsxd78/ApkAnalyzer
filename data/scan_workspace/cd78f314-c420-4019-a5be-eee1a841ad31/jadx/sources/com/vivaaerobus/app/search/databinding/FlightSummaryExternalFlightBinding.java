package com.vivaaerobus.app.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.search.R;

/* loaded from: classes5.dex */
public final class FlightSummaryExternalFlightBinding implements ViewBinding {
    public final LinearLayout flightSummaryExternalFlightHeader;
    public final ImageView flightSummaryExternalFlightHeaderImage;
    public final TextView flightSummaryExternalFlightTvAllegiant;
    public final TextView flightSummaryExternalFlightTvDescription;
    public final TextView flightSummaryExternalFlightTvKnowMore;
    public final TextView flightSummaryExternalFlightTvMore;
    public final TextView flightSummaryExternalFlightTvTitle;
    private final LinearLayout rootView;

    private FlightSummaryExternalFlightBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.flightSummaryExternalFlightHeader = linearLayout2;
        this.flightSummaryExternalFlightHeaderImage = imageView;
        this.flightSummaryExternalFlightTvAllegiant = textView;
        this.flightSummaryExternalFlightTvDescription = textView2;
        this.flightSummaryExternalFlightTvKnowMore = textView3;
        this.flightSummaryExternalFlightTvMore = textView4;
        this.flightSummaryExternalFlightTvTitle = textView5;
    }

    public static FlightSummaryExternalFlightBinding bind(View view) {
        int i = R.id.flight_summary_external_flight_header;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.flight_summary_external_flight_header_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.flight_summary_external_flight_tv_allegiant;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.flight_summary_external_flight_tv_description;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.flight_summary_external_flight_tv_know_more;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.flight_summary_external_flight_tv_more;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.flight_summary_external_flight_tv_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    return new FlightSummaryExternalFlightBinding((LinearLayout) view, linearLayout, imageView, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FlightSummaryExternalFlightBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FlightSummaryExternalFlightBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.flight_summary_external_flight, viewGroup, false);
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
