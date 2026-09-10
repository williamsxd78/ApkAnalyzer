package com.google.android.gms.common.util;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes13.dex */
public class MapUtils {
    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                sb.append(str2);
                sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            z = false;
        }
        sb.append("}");
    }
}
