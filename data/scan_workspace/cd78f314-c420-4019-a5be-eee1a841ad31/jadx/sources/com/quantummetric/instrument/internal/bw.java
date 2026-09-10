package com.quantummetric.instrument.internal;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bw implements il {
    private String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw(JSONObject jSONObject) {
        this.a = jSONObject.optString("case");
    }

    @Override // com.quantummetric.instrument.internal.il
    public final String a(String str) {
        return this.a.equals("u") ? str.toUpperCase() : this.a.equals("l") ? str.toLowerCase() : str;
    }
}
