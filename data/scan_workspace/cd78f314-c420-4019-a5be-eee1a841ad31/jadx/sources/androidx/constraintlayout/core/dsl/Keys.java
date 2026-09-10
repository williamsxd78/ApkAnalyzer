package androidx.constraintlayout.core.dsl;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class Keys {
    /* JADX INFO: Access modifiers changed from: protected */
    public void append(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f);
        sb.append(",\n");
    }

    protected void append(StringBuilder sb, String str, int i) {
        if (i != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i);
            sb.append("',\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void append(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void append(StringBuilder sb, String str, float[] fArr) {
        if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(Arrays.toString(fArr));
            sb.append(",\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void append(StringBuilder sb, String str, String[] strArr) {
        if (strArr != null) {
            sb.append(str);
            sb.append(":");
            sb.append(unpack(strArr));
            sb.append(",\n");
        }
    }

    protected String unpack(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (i < strArr.length) {
            sb.append(i == 0 ? OperatorName.SHOW_TEXT_LINE : ",'");
            sb.append(strArr[i]);
            sb.append(OperatorName.SHOW_TEXT_LINE);
            i++;
        }
        sb.append("]");
        return sb.toString();
    }
}
