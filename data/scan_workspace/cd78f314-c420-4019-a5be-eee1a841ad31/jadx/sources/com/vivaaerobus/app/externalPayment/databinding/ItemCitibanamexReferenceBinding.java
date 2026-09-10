package com.vivaaerobus.app.externalPayment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vivaaerobus.app.externalPayment.R;

/* loaded from: classes4.dex */
public final class ItemCitibanamexReferenceBinding implements ViewBinding {
    public final TextView itemCitibanamexReferenceTvAgreement;
    public final TextView itemCitibanamexReferenceTvFirstInstruction;
    public final TextView itemCitibanamexReferenceTvName;
    public final TextView itemCitibanamexReferenceTvReference;
    public final TextView itemCitibanamexReferenceTvSecondInstruction;
    public final TextView itemCitibanamexReferenceTvThirdInstruction;
    private final LinearLayout rootView;

    private ItemCitibanamexReferenceBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.itemCitibanamexReferenceTvAgreement = textView;
        this.itemCitibanamexReferenceTvFirstInstruction = textView2;
        this.itemCitibanamexReferenceTvName = textView3;
        this.itemCitibanamexReferenceTvReference = textView4;
        this.itemCitibanamexReferenceTvSecondInstruction = textView5;
        this.itemCitibanamexReferenceTvThirdInstruction = textView6;
    }

    public static ItemCitibanamexReferenceBinding bind(View view) {
        int i = R.id.item_citibanamex_reference_tv_agreement;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.item_citibanamex_reference_tv_first_instruction;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.item_citibanamex_reference_tv_name;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.item_citibanamex_reference_tv_reference;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.item_citibanamex_reference_tv_second_instruction;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = R.id.item_citibanamex_reference_tv_third_instruction;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                return new ItemCitibanamexReferenceBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemCitibanamexReferenceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCitibanamexReferenceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_citibanamex_reference, viewGroup, false);
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
