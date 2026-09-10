package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class r0 {
    public final String a;
    public final long b;

    public r0(String id, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.a = id;
        this.b = j;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.areEqual(this.a, r0Var.a) && this.b == r0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CampaignData(id=" + this.a + ", timestamp=" + this.b + ")";
    }
}
