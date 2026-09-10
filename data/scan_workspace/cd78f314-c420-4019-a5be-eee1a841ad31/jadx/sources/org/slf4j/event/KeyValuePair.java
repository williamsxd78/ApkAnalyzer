package org.slf4j.event;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes10.dex */
public class KeyValuePair {
    public final String key;
    public final Object value;

    public KeyValuePair(String str, Object obj) {
        this.key = str;
        this.value = obj;
    }

    public String toString() {
        return String.valueOf(this.key) + "=\"" + String.valueOf(this.value) + OperatorName.SHOW_TEXT_LINE_AND_SPACE;
    }
}
