package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class i implements IPutIntoJson, m {
    public final long a;
    public final boolean b;

    public i(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.a);
        return jSONObject;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return !this.b;
    }
}
