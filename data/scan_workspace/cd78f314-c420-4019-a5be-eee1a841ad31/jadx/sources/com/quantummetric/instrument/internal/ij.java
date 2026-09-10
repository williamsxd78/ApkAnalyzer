package com.quantummetric.instrument.internal;

import java.util.List;

/* loaded from: classes3.dex */
public interface ij {
    String a();

    void a(u uVar);

    boolean a(List<String> list, List<String> list2);

    String b();

    String c();

    String d();

    String e();

    String f();

    String g();

    int h();

    int i();

    boolean j();

    boolean k();

    Object l();

    String m();

    default String r() {
        String b = b();
        return !ka.a(b) ? b : a();
    }

    default Boolean s() {
        return Boolean.valueOf((ka.a(m()) || m().equals(a())) ? false : true);
    }
}
