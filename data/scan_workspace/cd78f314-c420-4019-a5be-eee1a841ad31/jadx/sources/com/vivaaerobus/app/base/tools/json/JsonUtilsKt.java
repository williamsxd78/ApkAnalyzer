package com.vivaaerobus.app.base.tools.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"isFormatJSON", "", "jsonString", "", "base_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonUtilsKt {
    public static final boolean isFormatJSON(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            new JSONObject(jsonString);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
