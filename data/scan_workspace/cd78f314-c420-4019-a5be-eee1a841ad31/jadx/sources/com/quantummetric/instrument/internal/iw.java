package com.quantummetric.instrument.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes3.dex */
public enum iw {
    ARRAY("a"),
    NUMERIC("n"),
    INTEGER("i"),
    STRING("s"),
    BOOLEAN(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE),
    DATE("d"),
    DATETIME("dt");

    private final String h;

    iw(String str) {
        this.h = str;
    }

    public static iw a(String str) {
        for (iw iwVar : values()) {
            if (iwVar.h.equals(str)) {
                return iwVar;
            }
        }
        throw new IllegalArgumentException("Unknown type code: ".concat(String.valueOf(str)));
    }
}
