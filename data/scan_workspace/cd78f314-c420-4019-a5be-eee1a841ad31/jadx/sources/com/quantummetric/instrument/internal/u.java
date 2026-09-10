package com.quantummetric.instrument.internal;

import android.view.View;
import com.quantummetric.instrument.EventListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class u {
    private final Set<EventListener<View>> a = new CopyOnWriteArraySet();
    private final Set<EventListener<?>> b = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        try {
            Iterator<EventListener<?>> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onEvent(null);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(View view) {
        try {
            Iterator<EventListener<View>> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onEvent(view);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(EventListener<View> eventListener) {
        this.a.add(eventListener);
    }

    public final void b() {
        this.a.clear();
        this.b.clear();
    }

    public final void b(EventListener<?> eventListener) {
        this.b.add(eventListener);
    }
}
