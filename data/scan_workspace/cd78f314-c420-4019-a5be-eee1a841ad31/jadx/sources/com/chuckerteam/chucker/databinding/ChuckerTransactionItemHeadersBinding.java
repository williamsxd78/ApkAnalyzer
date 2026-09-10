package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.chuckerteam.chucker.R;

/* loaded from: classes13.dex */
public final class ChuckerTransactionItemHeadersBinding implements ViewBinding {
    public final TextView responseHeaders;
    private final TextView rootView;

    private ChuckerTransactionItemHeadersBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.responseHeaders = textView2;
    }

    public static ChuckerTransactionItemHeadersBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ChuckerTransactionItemHeadersBinding(textView, textView);
    }

    public static ChuckerTransactionItemHeadersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChuckerTransactionItemHeadersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_transaction_item_headers, viewGroup, false);
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
