package com.vivaaerobus.app.upliftUtils.presentation.utils;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpliftSpannable+Extension.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"setUpliftStyle", "Landroid/text/SpannableString;", TtmlNode.START, "", TtmlNode.END, "upliftUtils_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpliftSpannable_ExtensionKt {
    public static final SpannableString setUpliftStyle(SpannableString spannableString, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannableString, "<this>");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#0E680E")), i, i2, 33);
        spannableString.setSpan(new StyleSpan(1), 0, i2, 33);
        return spannableString;
    }
}
