package com.quantummetric.instrument.internal;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
final class aj {
    private final ConcurrentHashMap<String, WeakReference<Method>> a = new ConcurrentHashMap<>();
    private final Set<String> b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Method a(String str, Class<?> cls) {
        WeakReference<Method> weakReference;
        String str2 = cls.getName() + ":" + str;
        if (this.b.contains(str2) || (weakReference = this.a.get(str2)) == null) {
            return null;
        }
        Method method = weakReference.get();
        if (method == null) {
            this.a.remove(str2);
        }
        return method;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, Class<?> cls, Method method) {
        String str2 = cls.getName() + ":" + str;
        if (method == null) {
            this.b.add(str2);
        } else {
            this.a.put(str2, new WeakReference<>(method));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str, Class<?> cls) {
        return this.b.contains(cls.getName() + ":" + str);
    }
}
