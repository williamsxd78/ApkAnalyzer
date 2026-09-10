package com.quantummetric.instrument.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class jn {
    private final jx<String, jk> a = new jx<>();
    private final jx<String, jk> b = new jx<>();
    private final jx<String, jk> c = new jx<>();
    private final List<jk> d = new ArrayList();

    public final List<jk> a() {
        return this.d;
    }

    public final Set<jk> a(String str) {
        return this.a.a((jx<String, jk>) str);
    }

    public final void a(jk jkVar) {
        String d = jkVar.d();
        if (!d.isEmpty()) {
            this.a.a(d, jkVar);
        }
        String b = jkVar.b();
        if (!b.isEmpty()) {
            this.b.a(b, jkVar);
        }
        String f = jkVar.f();
        if (!f.isEmpty()) {
            this.c.a(f, jkVar);
        }
        if (d.isEmpty() && b.isEmpty() && f.isEmpty()) {
            this.d.add(jkVar);
        }
    }

    public final Set<jk> b(String str) {
        return this.b.a((jx<String, jk>) str);
    }

    public final Set<jk> c(String str) {
        return this.c.a((jx<String, jk>) str);
    }
}
