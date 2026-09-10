package com.quantummetric.instrument.internal;

/* loaded from: classes3.dex */
public enum hx {
    LOW_MEMORY("low_mem", "Replay was disabled due to low device memory"),
    CONFIG_DISABLED("config", "Replay was disabled by configuration"),
    SAMPLING("sampling", "Replay was disabled by sampling"),
    MANUAL_API("api", "Replay was disabled by the app");

    private final String e;
    private final String f;

    hx(String str, String str2) {
        this.e = str;
        this.f = str2;
    }

    public final String a() {
        return this.e;
    }
}
