package lib.android.paypal.com.magnessdk;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class MagnesResult {
    private JSONObject deviceInfo;
    private String paypalclientmetadataid;

    public JSONObject getDeviceInfo() {
        return this.deviceInfo;
    }

    public String getPaypalClientMetaDataId() {
        return this.paypalclientmetadataid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MagnesResult setDeviceInfo(JSONObject jSONObject) {
        this.deviceInfo = jSONObject;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MagnesResult setPaypalClientMetaDataId(String str) {
        this.paypalclientmetadataid = str;
        return this;
    }
}
