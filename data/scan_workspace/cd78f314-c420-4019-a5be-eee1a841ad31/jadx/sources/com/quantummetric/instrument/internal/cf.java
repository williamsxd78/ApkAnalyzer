package com.quantummetric.instrument.internal;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class cf {
    private cd a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cf() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cf(cd cdVar) {
        this.a = cdVar;
    }

    protected abstract List<StackTraceElement> a(List<StackTraceElement> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<StackTraceElement> b(List<StackTraceElement> list) {
        cd cdVar = this.a;
        if (cdVar != null) {
            list = cdVar.b(list);
        }
        return a(list);
    }
}
