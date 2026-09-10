package com.quantummetric.instrument.internal;

/* loaded from: classes3.dex */
public final class hz extends hb {
    long e;
    int f;
    int g;

    public hz(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i + i5, i2 + i6, i3 + i5, i4 + i6);
        this.e = System.currentTimeMillis();
        this.f = i7;
        this.g = i8;
    }

    @Override // com.quantummetric.instrument.internal.hb
    public final String toString() {
        return super.toString() + " | sW=" + this.f + ", sH=" + this.g;
    }
}
