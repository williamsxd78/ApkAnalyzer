package com.quantummetric.instrument.internal;

/* loaded from: classes3.dex */
public enum gy {
    APP_SUSPEND(-20),
    APP_RESUME(-21),
    BACK_BUTTON_USED(-30),
    APP_SUB_PAGE(-35),
    ROTATION_EVENT(-41),
    OFFLINE_SESSION(-50),
    ACCESSIBILITY_MODE_ENABLED(-51),
    NATIVE_NETWORK_STATUS(-53),
    ACCESSIBILITY_FONT_SIZE(-54),
    APP_TYPE(-9997),
    QM_VERSION(-9998),
    APP_VERSION(-9999);

    public final int m;

    gy(int i) {
        this.m = i;
    }
}
