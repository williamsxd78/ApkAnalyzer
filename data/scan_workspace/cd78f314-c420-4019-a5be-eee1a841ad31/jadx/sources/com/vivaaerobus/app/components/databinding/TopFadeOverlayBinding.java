package com.vivaaerobus.app.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.components.R;

/* loaded from: classes4.dex */
public final class TopFadeOverlayBinding implements ViewBinding {
    private final View rootView;

    private TopFadeOverlayBinding(View view) {
        this.rootView = view;
    }

    public static TopFadeOverlayBinding bind(View view) {
        if (view != null) {
            return new TopFadeOverlayBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    public static TopFadeOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TopFadeOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.top_fade_overlay, viewGroup, false);
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
