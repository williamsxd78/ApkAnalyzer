package com.vivaaerobus.app.bookingPayment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.bookingPayment.R;

/* loaded from: classes4.dex */
public final class ReservationSummaryItemBinding implements ViewBinding {
    public final ImageView reservationSummaryItemIvIcon;
    public final TextView reservationSummaryItemTvTitle;
    private final LinearLayout rootView;

    private ReservationSummaryItemBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.reservationSummaryItemIvIcon = imageView;
        this.reservationSummaryItemTvTitle = textView;
    }

    public static ReservationSummaryItemBinding bind(View view) {
        int i = R.id.reservation_summary_item_iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.reservation_summary_item_tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ReservationSummaryItemBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ReservationSummaryItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReservationSummaryItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.reservation_summary_item, viewGroup, false);
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
