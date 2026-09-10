package com.quantummetric.instrument.internal;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* loaded from: classes3.dex */
public final class hy {
    public final String a;
    private final String b;
    private final String c;

    public hy(String str, String str2, String str3) {
        this.b = str;
        this.a = a(str2);
        this.c = a(str3);
    }

    private static String a(String str) {
        if (ka.a(str) || str.endsWith(DomExceptionUtils.SEPARATOR)) {
            return str;
        }
        return str + DomExceptionUtils.SEPARATOR;
    }

    private String b() {
        if (!ka.a(this.a)) {
            return this.a;
        }
        return "https://rl.quantummetric.com/" + this.b + DomExceptionUtils.SEPARATOR;
    }

    public final String a() {
        String b = b();
        if (!ka.a(this.a, this.c)) {
            b = this.c;
        }
        return b + "hash-check";
    }

    public final String a(Long l) {
        return (l == null || l.longValue() == 0) ? "" : b() + l;
    }
}
