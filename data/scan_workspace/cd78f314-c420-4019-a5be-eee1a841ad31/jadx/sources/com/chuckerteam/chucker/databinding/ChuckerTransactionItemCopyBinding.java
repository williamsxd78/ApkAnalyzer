package com.chuckerteam.chucker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.chuckerteam.chucker.R;

/* loaded from: classes13.dex */
public final class ChuckerTransactionItemCopyBinding implements ViewBinding {
    public final ImageButton responseCopy;
    private final LinearLayout rootView;

    private ChuckerTransactionItemCopyBinding(LinearLayout linearLayout, ImageButton imageButton) {
        this.rootView = linearLayout;
        this.responseCopy = imageButton;
    }

    public static ChuckerTransactionItemCopyBinding bind(View view) {
        int i = R.id.responseCopy;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            return new ChuckerTransactionItemCopyBinding((LinearLayout) view, imageButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChuckerTransactionItemCopyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChuckerTransactionItemCopyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chucker_transaction_item_copy, viewGroup, false);
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
