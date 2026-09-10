package com.vivaaerobus.app.baggage.presentation.common.utils;

import com.vivaaerobus.app.extension.Double_ExtensionKt;
import kotlin.Metadata;

/* compiled from: PromotionRule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"getRoundPriceBaggagePromotion", "", "(Ljava/lang/Double;)D", "baggage_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromotionRuleKt {
    public static final double getRoundPriceBaggagePromotion(Double d) {
        Double valueOf = Double.valueOf(Double_ExtensionKt.orZero(d));
        double doubleValue = valueOf.doubleValue();
        if (0.0d > doubleValue || doubleValue > 1.0d) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.doubleValue() : Math.ceil(Double_ExtensionKt.orZero(d));
    }
}
