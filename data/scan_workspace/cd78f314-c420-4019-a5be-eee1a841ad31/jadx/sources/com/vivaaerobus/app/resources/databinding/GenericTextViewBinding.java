package com.vivaaerobus.app.resources.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.resources.R;

/* loaded from: classes5.dex */
public final class GenericTextViewBinding implements ViewBinding {
    public final TextView genericCardBodyTvBody;
    private final TextView rootView;

    private GenericTextViewBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.genericCardBodyTvBody = textView2;
    }

    public static GenericTextViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new GenericTextViewBinding(textView, textView);
    }

    public static GenericTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GenericTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.generic_text_view, viewGroup, false);
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
