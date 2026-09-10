package com.vivaaerobus.app.selectSeats.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.vivaaerobus.app.selectSeats.R;

/* loaded from: classes5.dex */
public final class ItemSeatDotersIncludedBinding implements ViewBinding {
    public final TextView itemSeatDotersIncludedTv;
    private final TextView rootView;

    private ItemSeatDotersIncludedBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.itemSeatDotersIncludedTv = textView2;
    }

    public static ItemSeatDotersIncludedBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemSeatDotersIncludedBinding(textView, textView);
    }

    public static ItemSeatDotersIncludedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSeatDotersIncludedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_seat_doters_included, viewGroup, false);
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
