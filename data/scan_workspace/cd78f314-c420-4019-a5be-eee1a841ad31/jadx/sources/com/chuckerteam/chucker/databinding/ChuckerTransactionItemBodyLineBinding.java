package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.chuckerteam.chucker.R;

/* loaded from: classes13.dex */
public final class ChuckerTransactionItemBodyLineBinding implements ViewBinding {
    public final TextView bodyLine;
    private final TextView rootView;

    private ChuckerTransactionItemBodyLineBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.bodyLine = textView2;
    }

    public static ChuckerTransactionItemBodyLineBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ChuckerTransactionItemBodyLineBinding(textView, textView);
    }

    public static ChuckerTransactionItemBodyLineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChuckerTransactionItemBodyLineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_transaction_item_body_line, viewGroup, false);
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
