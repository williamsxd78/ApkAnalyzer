package com.braze.models.outgoing;

import android.location.Location;

/* loaded from: classes13.dex */
public final class c {
    public static final Double a(c cVar, Location location) {
        cVar.getClass();
        if (location.hasVerticalAccuracy()) {
            return Double.valueOf(location.getVerticalAccuracyMeters());
        }
        return null;
    }
}
