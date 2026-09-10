package com.vivaaerobus.app.resources.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.resources.R;

/* loaded from: classes5.dex */
public final class GenericButtonBinding implements ViewBinding {
    public final Button genericButtonB;
    public final LinearLayout genericButtonLlContainer;
    private final LinearLayout rootView;

    private GenericButtonBinding(LinearLayout linearLayout, Button button, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.genericButtonB = button;
        this.genericButtonLlContainer = linearLayout2;
    }

    public static GenericButtonBinding bind(View view) {
        int i = R.id.generic_button_b;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new GenericButtonBinding(linearLayout, button, linearLayout);
    }

    public static GenericButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GenericButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.generic_button, viewGroup, false);
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
