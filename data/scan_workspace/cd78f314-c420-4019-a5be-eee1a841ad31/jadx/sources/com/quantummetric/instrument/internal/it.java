package com.quantummetric.instrument.internal;

import com.braze.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class it {
    public final is a(JSONObject jSONObject) throws JSONException {
        iw a;
        String optString = jSONObject.optString(OperatorName.SAVE);
        Object opt = jSONObject.opt("v");
        if (optString.isEmpty() && opt == null) {
            throw new JSONException("One of 'q' or 'v' is required");
        }
        String optString2 = jSONObject.optString("a");
        String optString3 = jSONObject.optString("a-");
        if (optString2.isEmpty() && optString3.isEmpty()) {
            throw new JSONException("One of 'a' or 'a-' is required");
        }
        String optString4 = jSONObject.optString(Constants.BRAZE_PUSH_TITLE_KEY);
        if (optString4.isEmpty()) {
            throw new JSONException("Field 't' is required");
        }
        try {
            iw a2 = iw.a(optString4);
            ArrayList arrayList = null;
            if (jSONObject.has("p")) {
                try {
                    a = iw.a(jSONObject.getString("p"));
                } catch (IllegalArgumentException e) {
                    throw new JSONException("Invalid type for 'p': " + e.getMessage());
                }
            } else {
                a = null;
            }
            if (jSONObject.has("s")) {
                JSONArray jSONArray = jSONObject.getJSONArray("s");
                arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (!(obj instanceof JSONObject)) {
                        throw new JSONException("Invalid array schema: " + obj.toString());
                    }
                    arrayList.add(a((JSONObject) obj));
                }
            }
            if (a2.equals(iw.ARRAY) && arrayList == null && a == null) {
                throw new JSONException("One of 's' or 'p' is required when type is array");
            }
            return new is(optString, optString2, optString3, a2, opt, arrayList, a);
        } catch (IllegalArgumentException e2) {
            throw new JSONException("Invalid type for 't': " + e2.getMessage());
        }
    }
}
