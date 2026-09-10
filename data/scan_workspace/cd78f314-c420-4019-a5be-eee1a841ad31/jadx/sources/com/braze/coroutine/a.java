package com.braze.coroutine;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
public final class a implements Function0 {
    public final /* synthetic */ Throwable a;

    public a(Throwable th) {
        this.a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Child job of BrazeCoroutineScope got exception: " + this.a;
    }
}
