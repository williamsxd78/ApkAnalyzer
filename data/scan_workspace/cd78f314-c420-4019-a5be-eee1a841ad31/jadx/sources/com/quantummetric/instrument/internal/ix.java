package com.quantummetric.instrument.internal;

/* loaded from: classes3.dex */
public final class ix {
    private jb a;
    private final String b;
    private final double c;
    private final boolean d;
    private long e = 0;
    private long f = 0;
    private int g = 0;
    private long h = 0;
    private int i = 0;

    public ix(jb jbVar, String str, double d, boolean z) {
        this.a = jbVar;
        this.b = str;
        this.c = d;
        this.d = z;
    }

    public final jb a() {
        return this.a;
    }

    public final void a(long j) {
        this.e += j;
    }

    public final void a(jb jbVar) {
        this.a = jbVar;
    }

    public final String b() {
        return this.b;
    }

    public final void b(long j) {
        this.h = j;
    }

    public final double c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final long f() {
        return this.h;
    }

    public final void g() {
        this.f = this.e;
        this.g = this.i;
    }

    public final boolean h() {
        return (this.f == this.e && this.g == this.i) ? false : true;
    }

    public final void i() {
        this.i++;
    }

    public final int j() {
        return this.i;
    }
}
