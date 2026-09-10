package com.uplift.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uplift.sdk.R;

/* compiled from: FragmentUlOfferBinding.java */
/* loaded from: classes3.dex */
public final class b implements ViewBinding {
    private final RelativeLayout a;
    public final RelativeLayout b;
    public final ImageView c;
    public final ProgressBar d;
    public final RelativeLayout e;

    private b(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, ProgressBar progressBar, RelativeLayout relativeLayout3) {
        this.a = relativeLayout;
        this.b = relativeLayout2;
        this.c = imageView;
        this.d = progressBar;
        this.e = relativeLayout3;
    }

    public static b a(LayoutInflater layoutInflater) {
        return a(layoutInflater, null, false);
    }

    public static b a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ul_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static b a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.imageViewClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = R.id.webViewContainer;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout2 != null) {
                    return new b(relativeLayout, relativeLayout, imageView, progressBar, relativeLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.a;
    }
}
