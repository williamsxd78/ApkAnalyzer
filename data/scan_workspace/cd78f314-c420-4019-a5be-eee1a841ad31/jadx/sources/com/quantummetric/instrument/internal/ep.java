package com.quantummetric.instrument.internal;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ep {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Boolean g;
    private final String h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ep(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4 == null ? "{}" : str4;
        this.e = str5;
        this.f = str6;
        this.g = bool;
        this.h = str7;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.h;
    }

    public final boolean h() {
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean i() {
        try {
            return new JSONObject(this.d).getBoolean("ack");
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("messageId", this.a);
            jSONObject.putOpt("method", this.b);
            jSONObject.putOpt("url", this.c);
            jSONObject.putOpt(TtmlNode.TAG_BODY, new JSONObject(this.d));
            jSONObject.putOpt("namespace", this.e);
            jSONObject.putOpt("scope", this.f);
            jSONObject.putOpt("response", this.g);
            jSONObject.putOpt(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.h);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String toString() {
        return String.format("id=%.4s..., method=%s, url=%s, body=%s, namespace=%s, scope=%s, response=%b, error=%s", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
