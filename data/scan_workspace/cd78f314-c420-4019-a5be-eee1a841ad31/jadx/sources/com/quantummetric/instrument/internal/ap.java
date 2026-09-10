package com.quantummetric.instrument.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class ap implements Iterable<Integer> {
    private final List<Integer> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return this.a.remove(i).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(View view) {
        this.a.add(Integer.valueOf(view.hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List<Integer> list) {
        this.a.clear();
        this.a.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i) {
        return this.a.contains(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(View view) {
        return this.a.contains(Integer.valueOf(view.hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(int i) {
        return this.a.indexOf(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Integer> it = this.a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (!z) {
                sb.append(", ");
            }
            sb.append(Integer.toHexString(intValue));
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
