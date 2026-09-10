package com.quantummetric.instrument.internal;

import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class jp {
    private final int b = 20;
    private final LinkedList<Integer> a = new LinkedList<>();

    public final int a() {
        float f = 0.0f;
        while (this.a.iterator().hasNext()) {
            f += r0.next().intValue();
        }
        return Math.round(f / this.a.size());
    }

    public final void a(int i) {
        if (this.a.size() == this.b) {
            this.a.poll();
        }
        this.a.offer(Integer.valueOf(i));
    }

    public final void b() {
        this.a.clear();
    }

    public final String toString() {
        return this.a.toString();
    }
}
