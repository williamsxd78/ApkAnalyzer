package com.vivaaerobus.app.selectSeats.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.selectSeats.R;

/* loaded from: classes5.dex */
public final class ItemEmergencyExitRuleBinding implements ViewBinding {
    public final ImageView itemEmergencyExitIv;
    public final TextView itemEmergencyExitTv;
    private final LinearLayout rootView;

    private ItemEmergencyExitRuleBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.itemEmergencyExitIv = imageView;
        this.itemEmergencyExitTv = textView;
    }

    public static ItemEmergencyExitRuleBinding bind(View view) {
        int i = R.id.item_emergency_exit_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.item_emergency_exit_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ItemEmergencyExitRuleBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemEmergencyExitRuleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemEmergencyExitRuleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_emergency_exit_rule, viewGroup, false);
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
