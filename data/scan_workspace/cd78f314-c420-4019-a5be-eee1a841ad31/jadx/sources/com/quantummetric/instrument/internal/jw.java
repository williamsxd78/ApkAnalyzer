package com.quantummetric.instrument.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class jw<K, V> extends LinkedHashMap<K, V> {
    private final int a = 1000;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (size() >= this.a) {
            int round = Math.round(size() * 0.2f);
            if (round <= 0) {
                round = 1;
            }
            Iterator<K> it = keySet().iterator();
            while (it.hasNext() && round > 0) {
                remove(it.next());
                round--;
            }
        }
        return (V) super.put(k, v);
    }
}
