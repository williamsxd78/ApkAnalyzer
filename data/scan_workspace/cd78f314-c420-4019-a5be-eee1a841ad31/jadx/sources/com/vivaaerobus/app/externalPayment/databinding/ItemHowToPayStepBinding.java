package com.vivaaerobus.app.externalPayment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.externalPayment.R;

/* loaded from: classes4.dex */
public final class ItemHowToPayStepBinding implements ViewBinding {
    public final TextView itemHowToPayStepTvDescription;
    public final TextView itemHowToPayStepTvNumber;
    private final LinearLayout rootView;

    private ItemHowToPayStepBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.itemHowToPayStepTvDescription = textView;
        this.itemHowToPayStepTvNumber = textView2;
    }

    public static ItemHowToPayStepBinding bind(View view) {
        int i = R.id.item_how_to_pay_step_tv_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.item_how_to_pay_step_tv_number;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new ItemHowToPayStepBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemHowToPayStepBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHowToPayStepBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_how_to_pay_step, viewGroup, false);
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
