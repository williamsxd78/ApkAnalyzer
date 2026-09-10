package com.vivaaerobus.app.resources.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.resources.R;

/* loaded from: classes5.dex */
public final class ItemSimpleSpinnerDropdownBinding implements ViewBinding {
    private final TextView rootView;

    private ItemSimpleSpinnerDropdownBinding(TextView textView) {
        this.rootView = textView;
    }

    public static ItemSimpleSpinnerDropdownBinding bind(View view) {
        if (view != null) {
            return new ItemSimpleSpinnerDropdownBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ItemSimpleSpinnerDropdownBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSimpleSpinnerDropdownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_simple_spinner_dropdown, viewGroup, false);
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
