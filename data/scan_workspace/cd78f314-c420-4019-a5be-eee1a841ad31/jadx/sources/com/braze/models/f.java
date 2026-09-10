package com.braze.models;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public final class f implements Function1 {
    public final /* synthetic */ JSONArray a;

    public f(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.a.opt(((Number) obj).intValue()) instanceof Object);
    }
}
