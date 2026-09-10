package com.vivaaerobus.app.selectBundles.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.selectBundles.R;

/* loaded from: classes5.dex */
public final class ItemBundlePriceBinding implements ViewBinding {
    public final LinearLayout itemBundleIDetailsPrice;
    public final ImageView itemBundlePriceIvHeartVivaFan;
    public final TextView itemBundlePriceTvAmount;
    public final TextView itemBundlePriceTvCurrencyCode;
    public final TextView itemBundlePriceTvCurrencySymbol;
    public final TextView itemBundlePriceTvPlusSign;
    private final LinearLayout rootView;

    private ItemBundlePriceBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.itemBundleIDetailsPrice = linearLayout2;
        this.itemBundlePriceIvHeartVivaFan = imageView;
        this.itemBundlePriceTvAmount = textView;
        this.itemBundlePriceTvCurrencyCode = textView2;
        this.itemBundlePriceTvCurrencySymbol = textView3;
        this.itemBundlePriceTvPlusSign = textView4;
    }

    public static ItemBundlePriceBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.item_bundle_price_iv_heart_viva_fan;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.item_bundle_price_tv_amount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.item_bundle_price_tv_currency_code;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.item_bundle_price_tv_currency_symbol;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.item_bundle_price_tv_plus_sign;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            return new ItemBundlePriceBinding(linearLayout, linearLayout, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemBundlePriceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBundlePriceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_bundle_price, viewGroup, false);
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
