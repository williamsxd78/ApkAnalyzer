package com.vivaaerobus.app.tripDetails.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.tripDetails.R;

/* loaded from: classes6.dex */
public final class ItemExtraOnlyDescriptionBinding implements ViewBinding {
    public final TextView itemExtraOnlyDescriptionTv;
    private final LinearLayout rootView;

    private ItemExtraOnlyDescriptionBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.itemExtraOnlyDescriptionTv = textView;
    }

    public static ItemExtraOnlyDescriptionBinding bind(View view) {
        int i = R.id.item_extra_only_description_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new ItemExtraOnlyDescriptionBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemExtraOnlyDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemExtraOnlyDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_extra_only_description, viewGroup, false);
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
