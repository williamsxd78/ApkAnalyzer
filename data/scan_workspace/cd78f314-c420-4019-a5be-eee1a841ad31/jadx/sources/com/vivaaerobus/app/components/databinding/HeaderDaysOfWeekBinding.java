package com.vivaaerobus.app.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.components.R;

/* loaded from: classes4.dex */
public final class HeaderDaysOfWeekBinding implements ViewBinding {
    public final TextView headerDaysOfWeekTvD;
    public final TextView headerDaysOfWeekTvJ;
    public final TextView headerDaysOfWeekTvL;
    public final TextView headerDaysOfWeekTvMa;
    public final TextView headerDaysOfWeekTvMi;
    public final TextView headerDaysOfWeekTvS;
    public final TextView headerDaysOfWeekTvV;
    private final LinearLayout rootView;

    private HeaderDaysOfWeekBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = linearLayout;
        this.headerDaysOfWeekTvD = textView;
        this.headerDaysOfWeekTvJ = textView2;
        this.headerDaysOfWeekTvL = textView3;
        this.headerDaysOfWeekTvMa = textView4;
        this.headerDaysOfWeekTvMi = textView5;
        this.headerDaysOfWeekTvS = textView6;
        this.headerDaysOfWeekTvV = textView7;
    }

    public static HeaderDaysOfWeekBinding bind(View view) {
        int i = R.id.header_days_of_week_tv_d;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.header_days_of_week_tv_j;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.header_days_of_week_tv_l;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.header_days_of_week_tv_ma;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.header_days_of_week_tv_mi;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = R.id.header_days_of_week_tv_s;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                i = R.id.header_days_of_week_tv_v;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView7 != null) {
                                    return new HeaderDaysOfWeekBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static HeaderDaysOfWeekBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HeaderDaysOfWeekBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.header_days_of_week, viewGroup, false);
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
