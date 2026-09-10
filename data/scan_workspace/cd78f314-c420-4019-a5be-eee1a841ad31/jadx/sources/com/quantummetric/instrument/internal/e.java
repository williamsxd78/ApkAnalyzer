package com.quantummetric.instrument.internal;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e<T> extends ArrayList<T> {
    private a<T> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface a<T> {
        void a();

        void a(T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(a<T> aVar) {
        this.a = aVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(T t) {
        boolean add = super.add(t);
        a<T> aVar = this.a;
        if (aVar != null) {
            aVar.a(t);
        }
        return add;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final T remove(int i) {
        T t = (T) super.remove(i);
        a<T> aVar = this.a;
        if (aVar != null && t != null) {
            aVar.a();
        }
        return t;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        try {
            a<T> aVar = this.a;
            if (aVar != null && remove) {
                aVar.a();
            }
        } catch (Throwable unused) {
        }
        return remove;
    }
}
