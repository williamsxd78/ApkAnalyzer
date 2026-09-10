package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class y0 {
    public boolean a;
    public Long b;
    public String c;
    public long d;
    public long e;
    public long f;

    public /* synthetic */ y0() {
        this(false, null, null, 0L, 0L, 0L);
    }

    public y0(boolean z, Long l, String str, long j, long j2, long j3) {
        this.a = z;
        this.b = l;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public final String a() {
        return this.c;
    }

    public final Long b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a == y0Var.a && Intrinsics.areEqual(this.b, y0Var.b) && Intrinsics.areEqual(this.c, y0Var.c) && this.d == y0Var.d && this.e == y0Var.e && this.f == y0Var.f;
    }

    public final boolean f() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return Long.hashCode(this.f) + ((Long.hashCode(this.e) + ((Long.hashCode(this.d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.a + ", sdkDebuggerExpirationTime=" + this.b + ", sdkDebuggerAuthCode=" + this.c + ", sdkDebuggerFlushIntervalBytes=" + this.d + ", sdkDebuggerFlushIntervalSeconds=" + this.e + ", sdkDebuggerMaxPayloadBytes=" + this.f + ")";
    }
}
