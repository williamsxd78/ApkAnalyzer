package cUtTpE;

import android.util.Base64;

/* loaded from: classes13.dex */
public class RxizFn {
    public static String decodeBase64(String str) {
        return new String(Base64.decode(str, 0));
    }

    public static String encodeBase64(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }
}
