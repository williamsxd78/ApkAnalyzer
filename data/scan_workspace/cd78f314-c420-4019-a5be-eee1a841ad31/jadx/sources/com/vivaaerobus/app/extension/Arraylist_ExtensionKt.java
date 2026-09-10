package com.vivaaerobus.app.extension;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Arraylist+Extension.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0005"}, d2 = {"sum", "", "", "average", "standardDeviation", "extension"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Arraylist_ExtensionKt {
    public static final double average(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size > 0) {
            return sum(list) / size;
        }
        return 0.0d;
    }

    public static final double standardDeviation(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        double average = average(list);
        double d = 0.0d;
        if (average != 0.0d) {
            if (list.size() > 2) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    double doubleValue = ((Number) it.next()).doubleValue() - average;
                    d += doubleValue * doubleValue;
                }
                return Math.sqrt(d / (r4.size() - 1));
            }
        }
        return 0.0d;
    }

    public static final double sum(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((Number) it.next()).doubleValue();
        }
        return d;
    }
}
