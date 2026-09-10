package com.yuno.presentation.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsonExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0006"}, d2 = {"getCardDetails", "", "Lorg/json/JSONObject;", "getCardNetwork", "getProtocolVersion", "getToken", "Yuno_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonExtensionsKt {
    public static final String getCardDetails(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = jSONObject.getJSONObject("paymentMethodData").getJSONObject("info").getString("cardDetails");
        Intrinsics.checkNotNullExpressionValue(string, "this.getJSONObject(\"paym….getString(\"cardDetails\")");
        return string;
    }

    public static final String getCardNetwork(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = jSONObject.getJSONObject("paymentMethodData").getJSONObject("info").getString("cardNetwork");
        Intrinsics.checkNotNullExpressionValue(string, "this.getJSONObject(\"paym….getString(\"cardNetwork\")");
        return string;
    }

    public static final String getProtocolVersion(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = new JSONObject(getToken(jSONObject)).getString("protocolVersion");
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(this.getToken…String(\"protocolVersion\")");
        return string;
    }

    public static final String getToken(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = jSONObject.getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token");
        Intrinsics.checkNotNullExpressionValue(string, "this.getJSONObject(\"paym…      .getString(\"token\")");
        return string;
    }
}
