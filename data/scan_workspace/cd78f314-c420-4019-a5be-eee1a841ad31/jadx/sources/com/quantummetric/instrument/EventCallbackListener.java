package com.quantummetric.instrument;

/* loaded from: classes3.dex */
public abstract class EventCallbackListener {
    public final void onComplete(Integer num, String str) {
        onEvent(num, str);
    }

    protected abstract void onEvent(Integer num, String str);
}
