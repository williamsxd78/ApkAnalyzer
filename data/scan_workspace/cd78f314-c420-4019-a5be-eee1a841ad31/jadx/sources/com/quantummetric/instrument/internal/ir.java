package com.quantummetric.instrument.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ir {
    private final ArrayDeque<a> b = new ArrayDeque<>();
    private final Object c = new Object();
    private final int a = 1000;

    /* loaded from: classes3.dex */
    public static class a {
        public final Map<String, Object> a;
        public final int b;
        public final String c;

        public a(Map<String, Object> map, int i, String str) {
            this.a = map;
            this.b = i;
            this.c = str;
        }
    }

    public final List<a> a() {
        ArrayList arrayList;
        synchronized (this.c) {
            arrayList = new ArrayList(this.b);
            this.b.clear();
        }
        return arrayList;
    }

    public final void a(a aVar) {
        synchronized (this.c) {
            if (this.b.size() >= this.a) {
                this.b.removeFirst();
            }
            this.b.addLast(aVar);
        }
    }
}
