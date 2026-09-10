package com.quantummetric.instrument.internal;

/* loaded from: classes3.dex */
public final class hr {
    public static gb[] a(gb[] gbVarArr, gb gbVar) {
        int length = gbVarArr != null ? 1 + gbVarArr.length : 1;
        gb[] gbVarArr2 = new gb[length];
        int i = length - 1;
        if (gbVarArr != null) {
            System.arraycopy(gbVarArr, 0, gbVarArr2, 0, i);
        }
        gbVarArr2[i] = gbVar;
        return gbVarArr2;
    }
}
