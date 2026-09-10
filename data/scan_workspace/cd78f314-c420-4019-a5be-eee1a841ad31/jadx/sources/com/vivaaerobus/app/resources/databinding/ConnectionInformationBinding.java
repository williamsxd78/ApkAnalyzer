package com.vivaaerobus.app.resources.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.resources.R;

/* loaded from: classes5.dex */
public final class ConnectionInformationBinding implements ViewBinding {
    public final ImageView connectionInformationIvIcon;
    public final LinearLayout connectionInformationLlContainer;
    public final TextView connectionInformationTvConnectionType;
    public final TextView connectionInformationTvDescription;
    private final LinearLayout rootView;

    private ConnectionInformationBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.connectionInformationIvIcon = imageView;
        this.connectionInformationLlContainer = linearLayout2;
        this.connectionInformationTvConnectionType = textView;
        this.connectionInformationTvDescription = textView2;
    }

    public static ConnectionInformationBinding bind(View view) {
        int i = R.id.connection_information_iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.connection_information_tv_connection_type;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.connection_information_tv_description;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ConnectionInformationBinding(linearLayout, imageView, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ConnectionInformationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ConnectionInformationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.connection_information, viewGroup, false);
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
