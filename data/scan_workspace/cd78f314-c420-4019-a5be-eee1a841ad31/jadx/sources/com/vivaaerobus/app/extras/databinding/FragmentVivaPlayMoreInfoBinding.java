package com.vivaaerobus.app.extras.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.extras.R;

/* loaded from: classes4.dex */
public final class FragmentVivaPlayMoreInfoBinding implements ViewBinding {
    public final ImageView fragmentVivaPlayMoreInfoIvClose;
    public final TextView fragmentVivaPlayMoreInfoTvMessage;
    private final LinearLayout rootView;

    private FragmentVivaPlayMoreInfoBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.fragmentVivaPlayMoreInfoIvClose = imageView;
        this.fragmentVivaPlayMoreInfoTvMessage = textView;
    }

    public static FragmentVivaPlayMoreInfoBinding bind(View view) {
        int i = R.id.fragment_viva_play_more_info_iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.fragment_viva_play_more_info_tv_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new FragmentVivaPlayMoreInfoBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentVivaPlayMoreInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVivaPlayMoreInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_viva_play_more_info, viewGroup, false);
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
