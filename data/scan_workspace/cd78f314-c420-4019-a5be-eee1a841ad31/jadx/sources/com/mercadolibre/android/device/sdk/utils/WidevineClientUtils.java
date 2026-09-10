package com.mercadolibre.android.device.sdk.utils;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import java.util.UUID;

/* loaded from: classes3.dex */
public class WidevineClientUtils {
    private static final String TAG = "WidevineClientUtils";
    private static final UUID WIDEVINE_UUID = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");

    private void closeDrmApi(MediaDrm mediaDrm) {
        mediaDrm.close();
    }

    MediaDrm getMediaDrm() throws UnsupportedSchemeException {
        return new MediaDrm(WIDEVINE_UUID);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0023: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:25:0x0023 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getWidevineClientId() {
        /*
            r6 = this;
            java.lang.String r0 = "Error getting widevine id: "
            java.lang.String r1 = "Error when trying to get widevine id: "
            r2 = 0
            android.media.MediaDrm r3 = r6.getMediaDrm()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b android.media.UnsupportedSchemeException -> L45
            java.lang.String r4 = "deviceUniqueId"
            byte[] r4 = r3.getPropertyByteArray(r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25 android.media.UnsupportedSchemeException -> L27
            if (r4 == 0) goto L1c
            r5 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r5)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25 android.media.UnsupportedSchemeException -> L27
            if (r3 == 0) goto L1b
            r6.closeDrmApi(r3)
        L1b:
            return r0
        L1c:
            if (r3 == 0) goto L5f
        L1e:
            r6.closeDrmApi(r3)
            goto L5f
        L22:
            r0 = move-exception
            r2 = r3
            goto L60
        L25:
            r1 = move-exception
            goto L2d
        L27:
            r0 = move-exception
            goto L47
        L29:
            r0 = move-exception
            goto L60
        L2b:
            r1 = move-exception
            r3 = r2
        L2d:
            java.lang.String r4 = com.mercadolibre.android.device.sdk.utils.WidevineClientUtils.TAG     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L22
            r5.append(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L22
            android.util.Log.w(r4, r0)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L5f
            goto L1e
        L45:
            r0 = move-exception
            r3 = r2
        L47:
            java.lang.String r4 = com.mercadolibre.android.device.sdk.utils.WidevineClientUtils.TAG     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L22
            r5.append(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L22
            android.util.Log.w(r4, r0)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L5f
            goto L1e
        L5f:
            return r2
        L60:
            if (r2 == 0) goto L65
            r6.closeDrmApi(r2)
        L65:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mercadolibre.android.device.sdk.utils.WidevineClientUtils.getWidevineClientId():java.lang.String");
    }
}
