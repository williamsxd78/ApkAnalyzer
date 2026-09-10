package jslYAf;

import android.widget.EditText;

/* loaded from: classes9.dex */
public interface TifYXe {
    public static final String MASKED_COLLECTION = "fm";
    public static final String NORMAL_COLLECTION = "f";

    String getFieldName(EditText editText);

    String getFieldType(EditText editText);

    Boolean shouldBeMonitored(EditText editText);
}
