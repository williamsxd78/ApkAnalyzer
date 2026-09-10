package com.vivaaerobus.app.selectBundles.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.selectBundles.R;

/* loaded from: classes5.dex */
public final class ItemDisclaimerBinding implements ViewBinding {
    private final TextView rootView;

    private ItemDisclaimerBinding(TextView textView) {
        this.rootView = textView;
    }

    public static ItemDisclaimerBinding bind(View view) {
        if (view != null) {
            return new ItemDisclaimerBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ItemDisclaimerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDisclaimerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_disclaimer, viewGroup, false);
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
