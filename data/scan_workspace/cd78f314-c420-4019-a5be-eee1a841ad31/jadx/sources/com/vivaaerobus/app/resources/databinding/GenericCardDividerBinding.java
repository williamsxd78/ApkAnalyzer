package com.vivaaerobus.app.resources.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.resources.R;

/* loaded from: classes5.dex */
public final class GenericCardDividerBinding implements ViewBinding {
    private final View rootView;

    private GenericCardDividerBinding(View view) {
        this.rootView = view;
    }

    public static GenericCardDividerBinding bind(View view) {
        if (view != null) {
            return new GenericCardDividerBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    public static GenericCardDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GenericCardDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.generic_card_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
