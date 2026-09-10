package com.quantummetric.instrument.internal;

/* loaded from: classes3.dex */
public final class hw implements hg {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;

    public hw(int i, int i2, int i3, int i4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    @Override // com.quantummetric.instrument.internal.hg
    public final int a() {
        return this.c;
    }

    @Override // com.quantummetric.instrument.internal.hg
    public final boolean b() {
        return this.e;
    }

    @Override // com.quantummetric.instrument.internal.hg
    public final int c() {
        return (this.c / this.d) * (this.e ? this.b : this.a);
    }
}
