package com.quantummetric.instrument.internal;

import com.vivaaerobus.app.search.presentation.addPassenger.AddPassengerFragment;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ip {
    public final String a;
    public final Map<String, List<is>> b;
    private String c;
    private String d;

    public ip(String str, String str2, String str3, Map<String, List<is>> map) {
        if (!str.isEmpty() && !str.startsWith(AddPassengerFragment.BLANK_SPACE)) {
            str = AddPassengerFragment.BLANK_SPACE.concat(String.valueOf(str));
        }
        this.c = str;
        this.d = str2;
        this.a = str3;
        this.b = map;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!this.d.isEmpty()) {
            sb.insert(0, ".");
            sb.insert(0, this.d);
        }
        if (!this.c.isEmpty()) {
            sb.insert(0, ".");
            sb.insert(0, this.c);
        }
        return sb.toString();
    }
}
