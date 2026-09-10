package com.tealium.core.persistence;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/tealium/core/persistence/Serialization;", "", "", "a", "I", "getCode", "()I", "code", "Ljava/lang/Class;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/String;IILjava/lang/Class;)V", "STRING", "INT", "DOUBLE", "LONG", "BOOLEAN", "STRING_ARRAY", "INT_ARRAY", "DOUBLE_ARRAY", "LONG_ARRAY", "BOOLEAN_ARRAY", "JSON_OBJECT", "JSON_ARRAY", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public enum Serialization {
    STRING(0, String.class),
    INT(1, Integer.TYPE),
    DOUBLE(2, Double.TYPE),
    LONG(3, Long.TYPE),
    BOOLEAN(4, Boolean.TYPE),
    STRING_ARRAY(5, String[].class),
    INT_ARRAY(6, int[].class),
    DOUBLE_ARRAY(7, double[].class),
    LONG_ARRAY(8, long[].class),
    BOOLEAN_ARRAY(9, boolean[].class),
    JSON_OBJECT(10, JSONObject.class),
    JSON_ARRAY(11, JSONArray.class);


    /* renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* renamed from: b, reason: from kotlin metadata */
    private final Class<?> clazz;

    Serialization(int i, Class cls) {
        this.code = i;
        this.clazz = cls;
    }

    public final Class<?> getClazz() {
        return this.clazz;
    }

    public final int getCode() {
        return this.code;
    }
}
