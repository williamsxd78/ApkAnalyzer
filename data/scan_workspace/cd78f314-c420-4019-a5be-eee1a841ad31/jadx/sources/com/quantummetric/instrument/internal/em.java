package com.quantummetric.instrument.internal;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class em {
    private final Map<String, Map<String, a>> a = new HashMap();

    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface a {
        b invoke(String str) throws JSONException;
    }

    /* loaded from: classes3.dex */
    public static class b {
        private final String a;
        private final String b;

        public b() {
            this(null);
        }

        public b(String str) {
            this.a = null;
            this.b = str;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }
    }

    public final a a(String str, String str2) {
        Map<String, a> map = this.a.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final void a(String str, String str2, a aVar) {
        Map<String, a> map = this.a.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.a.put(str, map);
        }
        map.put(str2, aVar);
    }
}
