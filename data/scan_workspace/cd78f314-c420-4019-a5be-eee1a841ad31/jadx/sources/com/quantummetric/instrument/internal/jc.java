package com.quantummetric.instrument.internal;

import java.util.Collection;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class jc {
    private final WeakHashMap<Object, ix> a = new WeakHashMap<>();
    private final ConcurrentHashMap<String, ix> b = new ConcurrentHashMap<>();

    public final ix a(Object obj) {
        return this.a.get(obj);
    }

    public final ix a(String str) {
        return this.b.get(str);
    }

    public final Collection<ix> a() {
        return this.b.values();
    }

    public final void a(ix ixVar) {
        Object a = ixVar.a().a();
        if (a != null) {
            this.a.put(a, ixVar);
            this.b.put(ixVar.b(), ixVar);
        }
    }

    public final void a(String str, jb jbVar) {
        ix ixVar = this.b.get(str);
        if (ixVar != null) {
            Object a = ixVar.a().a();
            ixVar.a(jbVar);
            this.a.put(jbVar.a(), ixVar);
            this.a.remove(a);
        }
    }

    public final void b() {
        this.a.clear();
        this.b.clear();
    }

    public final void b(ix ixVar) {
        Object a = ixVar.a().a();
        String b = ixVar.b();
        this.a.remove(a);
        this.b.remove(b);
    }

    public final void c(ix ixVar) {
        Object a = ixVar.a().a();
        String b = ixVar.a().b();
        this.a.remove(a);
        ixVar.a(new jb(b));
    }

    public final boolean c() {
        return this.b.isEmpty();
    }
}
