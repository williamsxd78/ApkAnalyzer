package com.quantummetric.instrument.internal;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ff {
    final boolean a;
    private final JSONObject b;
    private final hy c;

    public ff(JSONObject jSONObject, hy hyVar) {
        this.b = b(jSONObject);
        this.c = hyVar;
        this.a = !jSONObject.equals(r0);
    }

    private JSONObject a(String str, long j, @Nullable String str2, @Nullable Integer num, @Nullable String str3) throws JSONException {
        JSONObject a = a(str, Long.valueOf(j), num, str3);
        if (a != null) {
            return a;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TtmlNode.ATTR_TTS_FONT_FAMILY, str);
        jSONObject.put("fontHash", j);
        if (str2 == null) {
            str2 = "opentype";
        }
        jSONObject.put("fontFormat", str2);
        if (num != null) {
            jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, num.intValue());
        }
        if (str3 != null) {
            jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, str3);
        }
        d().put(jSONObject);
        return jSONObject;
    }

    private JSONObject a(String str, @Nullable Long l, @Nullable Integer num, @Nullable String str2) throws JSONException {
        JSONArray d = d();
        int i = 0;
        while (true) {
            if (i >= d.length()) {
                return null;
            }
            JSONObject jSONObject = d.getJSONObject(i);
            Long valueOf = jSONObject.has("fontHash") ? Long.valueOf(jSONObject.getLong("fontHash")) : null;
            if (l == null || l.equals(valueOf)) {
                String string = jSONObject.has(TtmlNode.ATTR_TTS_FONT_STYLE) ? jSONObject.getString(TtmlNode.ATTR_TTS_FONT_STYLE) : null;
                if ((str2 == null || str2.equals(string)) && (str2 != null || string == null)) {
                    Integer valueOf2 = jSONObject.has(TtmlNode.ATTR_TTS_FONT_WEIGHT) ? Integer.valueOf(jSONObject.getInt(TtmlNode.ATTR_TTS_FONT_WEIGHT)) : null;
                    if ((num == null || num.equals(valueOf2)) && ((num != null || valueOf2 == null) && jSONObject.getString(TtmlNode.ATTR_TTS_FONT_FAMILY).equals(str))) {
                        return jSONObject;
                    }
                }
            }
            i++;
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            if (keys.hasNext() && "fontsArray".equals(keys.next())) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next = keys2.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TtmlNode.ATTR_TTS_FONT_FAMILY, next);
                jSONObject3.put("fontHash", jSONObject.getLong(next));
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put("fontsArray", jSONArray);
            return jSONObject2;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    private JSONArray d() throws JSONException {
        if (!this.b.has("fontsArray")) {
            this.b.put("fontsArray", new JSONArray());
        }
        return this.b.getJSONArray("fontsArray");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(JSONObject jSONObject) throws JSONException {
        StringBuilder sb = new StringBuilder("@font-face { font-family: \"");
        sb.append(jSONObject.getString(TtmlNode.ATTR_TTS_FONT_FAMILY));
        sb.append("\"; src: url(\"");
        sb.append(this.c.a(Long.valueOf(jSONObject.getLong("fontHash"))));
        sb.append("\") format(\"");
        sb.append(jSONObject.optString("fontFormat", "opentype"));
        sb.append("\"); ");
        if (jSONObject.has(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
            sb.append("font-weight: ");
            sb.append(jSONObject.getInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
            sb.append(";");
        }
        if (jSONObject.has(TtmlNode.ATTR_TTS_FONT_STYLE)) {
            sb.append("font-style: ");
            sb.append(jSONObject.getString(TtmlNode.ATTR_TTS_FONT_STYLE));
            sb.append(";");
        }
        sb.append("}");
        return sb.toString();
    }

    public final JSONObject a() {
        return this.b;
    }

    public final JSONObject a(String str, long j) throws JSONException {
        return a(str, j, null, null, null);
    }

    public final boolean a(String str) throws JSONException {
        return a(str, null, null, null) != null;
    }

    public final StringBuilder b() throws JSONException {
        StringBuilder sb = new StringBuilder();
        JSONArray d = d();
        for (int i = 0; i < d.length(); i++) {
            sb.append(a(d.getJSONObject(i)));
            sb.append("\n");
        }
        return sb;
    }

    public final void b(String str) throws JSONException, NumberFormatException {
        JSONObject jSONObject = new JSONObject(str);
        a(jSONObject.getString(TtmlNode.ATTR_TTS_FONT_FAMILY), jSONObject.getLong("fontHash"), jSONObject.has("fontFormat") ? jSONObject.getString("fontFormat") : null, jSONObject.has(TtmlNode.ATTR_TTS_FONT_WEIGHT) ? Integer.valueOf(jSONObject.getInt(TtmlNode.ATTR_TTS_FONT_WEIGHT)) : null, jSONObject.has(TtmlNode.ATTR_TTS_FONT_STYLE) ? jSONObject.getString(TtmlNode.ATTR_TTS_FONT_STYLE) : null);
    }

    public final int c() {
        try {
            return d().length();
        } catch (JSONException unused) {
            return 0;
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
