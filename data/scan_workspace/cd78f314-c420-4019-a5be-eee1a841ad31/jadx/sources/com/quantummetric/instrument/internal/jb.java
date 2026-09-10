package com.quantummetric.instrument.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class jb {
    private final WeakReference<Object> a;
    private String b;

    public jb(Object obj) {
        this.a = new WeakReference<>(obj);
        this.b = "";
    }

    public jb(String str) {
        this.a = new WeakReference<>(null);
        this.b = str;
    }

    public final Object a() {
        return this.a.get();
    }

    public final void a(String str) {
        this.b = str;
    }

    public final String b() {
        return this.b;
    }
}
