package com.quantummetric.instrument.internal;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class dz implements id {
    private final Set<Integer> a = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // com.quantummetric.instrument.internal.id
    public final void a() {
        this.a.clear();
    }

    public final void a(int i) {
        this.a.add(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i) {
        return this.a.contains(Integer.valueOf(i));
    }
}
