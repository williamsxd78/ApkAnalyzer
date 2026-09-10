package com.braze.managers;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class c {
    public final String a;
    public final WeakReference b;
    public boolean c;

    public c(String placementId, WeakReference view, boolean z) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = placementId;
        this.b = view;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }
}
