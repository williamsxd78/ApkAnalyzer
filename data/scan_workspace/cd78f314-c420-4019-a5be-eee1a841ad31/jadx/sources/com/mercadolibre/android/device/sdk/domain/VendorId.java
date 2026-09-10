package com.mercadolibre.android.device.sdk.domain;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class VendorId implements Serializable {
    private static final long serialVersionUID = 1;
    private final String name;
    private final String value;

    public VendorId(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }
}
