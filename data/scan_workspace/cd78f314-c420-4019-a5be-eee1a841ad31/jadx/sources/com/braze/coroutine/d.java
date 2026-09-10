package com.braze.coroutine;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
public final class d implements Function0 {
    public final /* synthetic */ Throwable a;

    public d(Throwable th) {
        this.a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Child job of SerialCoroutineScope got exception: " + this.a;
    }
}
