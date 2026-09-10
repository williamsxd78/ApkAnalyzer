package com.vivaaerobus.app.tripDetails.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.tripDetails.R;

/* loaded from: classes6.dex */
public final class ItemExtraDividerBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ItemExtraDividerBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ItemExtraDividerBinding bind(View view) {
        if (view != null) {
            return new ItemExtraDividerBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ItemExtraDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemExtraDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_extra_divider, viewGroup, false);
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
