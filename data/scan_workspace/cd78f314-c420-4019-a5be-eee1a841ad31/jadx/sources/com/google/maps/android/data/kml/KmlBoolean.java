package com.google.maps.android.data.kml;

import com.vivaaerobus.app.analytics.presentation.AnalyticsConstants;

/* loaded from: classes14.dex */
public class KmlBoolean {
    public static boolean parseBoolean(String str) {
        return "1".equals(str) || AnalyticsConstants.TRUE_VALUE.equals(str);
    }
}
