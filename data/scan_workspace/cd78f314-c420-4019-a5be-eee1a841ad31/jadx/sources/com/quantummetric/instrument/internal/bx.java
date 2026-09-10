package com.quantummetric.instrument.internal;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bx implements il {
    private String a;
    private String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bx(JSONObject jSONObject) {
        this.a = jSONObject.optString("regex");
        this.b = jSONObject.optString("replacement");
    }

    @Override // com.quantummetric.instrument.internal.il
    public final String a(String str) {
        return str.replaceAll(this.a, this.b);
    }
}
