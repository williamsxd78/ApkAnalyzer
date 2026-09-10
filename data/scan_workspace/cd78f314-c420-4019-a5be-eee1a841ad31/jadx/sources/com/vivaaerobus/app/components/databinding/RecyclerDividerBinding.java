package com.vivaaerobus.app.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.components.R;

/* loaded from: classes4.dex */
public final class RecyclerDividerBinding implements ViewBinding {
    public final View recyclerDividerVDivider;
    private final LinearLayout rootView;

    private RecyclerDividerBinding(LinearLayout linearLayout, View view) {
        this.rootView = linearLayout;
        this.recyclerDividerVDivider = view;
    }

    public static RecyclerDividerBinding bind(View view) {
        int i = R.id.recycler_divider_v_divider;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new RecyclerDividerBinding((LinearLayout) view, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RecyclerDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RecyclerDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.recycler_divider, viewGroup, false);
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
