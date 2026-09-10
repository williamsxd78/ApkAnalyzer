package com.quantummetric.instrument.internal;

import android.os.Handler;
import com.quantummetric.instrument.internal.ay;

/* loaded from: classes3.dex */
public final class jq {
    private final int a;
    private final Handler b;
    private ay.a c;

    public jq(Handler handler, int i) {
        this.b = handler;
        this.a = i;
    }

    public final void a() {
        ay.a aVar = this.c;
        if (aVar != null) {
            this.b.removeCallbacks(aVar);
        }
    }

    public final void a(Runnable runnable) {
        ay.a aVar = this.c;
        if (aVar != null) {
            this.b.removeCallbacks(aVar);
        }
        ay.a aVar2 = new ay.a(runnable);
        this.c = aVar2;
        this.b.postDelayed(aVar2, this.a);
    }
}
