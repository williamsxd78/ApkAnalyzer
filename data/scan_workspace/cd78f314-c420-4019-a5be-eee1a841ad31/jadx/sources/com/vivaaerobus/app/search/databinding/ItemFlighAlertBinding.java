package com.vivaaerobus.app.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.search.R;

/* loaded from: classes5.dex */
public final class ItemFlighAlertBinding implements ViewBinding {
    public final ImageButton itemFlightAlertBtnArrowDown;
    public final ImageButton itemFlightAlertBtnArrowUp;
    public final ImageButton itemFlightAlertBtnClose;
    public final ImageView itemFlightAlertIv;
    public final TextView itemFlightAlertTvDescription;
    public final TextView itemFlightAlertTvTitle;
    private final LinearLayout rootView;

    private ItemFlighAlertBinding(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.itemFlightAlertBtnArrowDown = imageButton;
        this.itemFlightAlertBtnArrowUp = imageButton2;
        this.itemFlightAlertBtnClose = imageButton3;
        this.itemFlightAlertIv = imageView;
        this.itemFlightAlertTvDescription = textView;
        this.itemFlightAlertTvTitle = textView2;
    }

    public static ItemFlighAlertBinding bind(View view) {
        int i = R.id.item_flight_alert_btn_arrow_down;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.item_flight_alert_btn_arrow_up;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton2 != null) {
                i = R.id.item_flight_alert_btn_close;
                ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton3 != null) {
                    i = R.id.item_flight_alert_iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.item_flight_alert_tv_description;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.item_flight_alert_tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new ItemFlighAlertBinding((LinearLayout) view, imageButton, imageButton2, imageButton3, imageView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemFlighAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFlighAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fligh_alert, viewGroup, false);
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
