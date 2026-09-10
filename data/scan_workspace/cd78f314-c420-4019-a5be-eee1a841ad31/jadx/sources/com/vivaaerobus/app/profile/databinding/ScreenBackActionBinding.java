package com.vivaaerobus.app.profile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.profile.R;

/* loaded from: classes5.dex */
public final class ScreenBackActionBinding implements ViewBinding {
    public final LinearLayout mmbToolbarLlBack;
    private final LinearLayout rootView;
    public final TextView screenBackActionTvBack;

    private ScreenBackActionBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.mmbToolbarLlBack = linearLayout2;
        this.screenBackActionTvBack = textView;
    }

    public static ScreenBackActionBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.screen_back_action_tv_back;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new ScreenBackActionBinding(linearLayout, linearLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ScreenBackActionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenBackActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_back_action, viewGroup, false);
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
