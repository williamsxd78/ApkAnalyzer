package com.quantummetric.instrument.internal;

import android.view.View;
import com.quantummetric.instrument.internal.av;

/* loaded from: classes3.dex */
public final class bu extends bs {
    private final av.a b;

    public bu(View view, av.a aVar) {
        super(view);
        this.b = aVar;
    }

    public final boolean a() {
        return this.b.b > 0;
    }

    public final int d() {
        return Math.max(this.b.b, 500);
    }

    public final boolean e() {
        return this.b.c;
    }

    public final boolean f() {
        return this.b.a;
    }
}
