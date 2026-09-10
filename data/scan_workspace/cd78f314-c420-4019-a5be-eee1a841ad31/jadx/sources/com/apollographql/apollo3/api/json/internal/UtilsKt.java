package com.apollographql.apollo3.api.json.internal;

import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0001¢\u0006\u0002\b\u0006\u001a\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0001¢\u0006\u0002\b\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0001H\u0001¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"toDoubleExact", "", "", "-LongToDoubleExact", "toIntExact", "", "-DoubleToIntExact", "-LongToIntExact", "toLongExact", "-DoubleToLongExact", "apollo-api"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UtilsKt {
    /* renamed from: -DoubleToIntExact, reason: not valid java name */
    public static final int m10175DoubleToIntExact(double d) {
        int i = (int) d;
        if (i == d) {
            return i;
        }
        throw new IllegalStateException((d + " cannot be converted to Int").toString());
    }

    /* renamed from: -DoubleToLongExact, reason: not valid java name */
    public static final long m10176DoubleToLongExact(double d) {
        long j = (long) d;
        if (j == d) {
            return j;
        }
        throw new IllegalStateException((d + " cannot be converted to Long").toString());
    }

    /* renamed from: -LongToDoubleExact, reason: not valid java name */
    public static final double m10177LongToDoubleExact(long j) {
        double d = j;
        if (((long) d) == j) {
            return d;
        }
        throw new IllegalStateException((j + " cannot be converted to Double").toString());
    }

    /* renamed from: -LongToIntExact, reason: not valid java name */
    public static final int m10178LongToIntExact(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalStateException((j + " cannot be converted to Int").toString());
    }
}
