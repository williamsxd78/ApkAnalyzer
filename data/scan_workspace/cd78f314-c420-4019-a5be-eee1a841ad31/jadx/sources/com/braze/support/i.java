package com.braze.support;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
public final class i implements Function0 {
    public final /* synthetic */ String a;

    public i(String str) {
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to create valid enum from string: " + this.a;
    }
}
