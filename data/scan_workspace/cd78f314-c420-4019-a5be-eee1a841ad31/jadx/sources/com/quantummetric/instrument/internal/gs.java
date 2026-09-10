package com.quantummetric.instrument.internal;

/* loaded from: classes3.dex */
public enum gs {
    API_500_ERROR(-3),
    POSSIBLE_FRUSTRATION(-5),
    SLOW_API_CALL(-7),
    API_TIMEOUT(-11),
    API_FORBIDDEN_UNAUTHORIZED(-13),
    API_NOT_FOUND(-14),
    API_40X(-15),
    API_TOO_MANY_REDIRECTS(-16),
    API_30X(-17),
    UNCAUGHT_EXCEPTION(-18),
    FROZEN_UI(-19),
    LONG_RUNNING_SPINNER(-22),
    WINDOW_ALERT(-23),
    LOW_MEMORY(-34),
    MODIFIED_DEVICE(-43),
    MOBILE_APP_CRASH(-44),
    DISABLED_INPUT_CLICKED(-49),
    APPLICATION_NOT_RESPONDING(-52),
    RAGE_SCROLL(-64),
    INTERNAL_ERROR(-20505);

    public final int u;

    gs(int i) {
        this.u = i;
    }
}
