package com.quantummetric.instrument.internal;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class fy {
    private final int a;
    private final Object b;
    private final Object c;
    private final boolean d;

    public fy(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = z;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.d;
    }

    public final String toString() {
        return "{" + this.b + " -> " + this.c + ", node=" + this.a + AbstractJsonLexerKt.END_OBJ;
    }
}
