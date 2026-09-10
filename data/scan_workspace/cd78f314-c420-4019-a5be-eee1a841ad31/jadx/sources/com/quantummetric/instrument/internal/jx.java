package com.quantummetric.instrument.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class jx<K, V> {
    private final Map<K, Set<V>> a = new HashMap();

    public final Set<K> a() {
        return this.a.keySet();
    }

    public final Set<V> a(K k) {
        Set<V> set = this.a.get(k);
        return set == null ? Collections.EMPTY_SET : set;
    }

    public final void a(jx<K, V> jxVar) {
        for (K k : jxVar.a.keySet()) {
            Set<V> set = jxVar.a.get(k);
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Iterator<V> it = set.iterator();
            while (it.hasNext()) {
                a(k, it.next());
            }
        }
    }

    public final void a(K k, V v) {
        if (v == null) {
            return;
        }
        Set<V> set = this.a.get(k);
        if (set == null) {
            set = new HashSet<>();
            this.a.put(k, set);
        }
        set.add(v);
    }
}
