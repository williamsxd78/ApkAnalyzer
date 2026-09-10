package com.braze.storage;

import com.braze.enums.DataStoreValueType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DataStoreValueType.values().length];
        try {
            iArr[DataStoreValueType.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataStoreValueType.DOUBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataStoreValueType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DataStoreValueType.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DataStoreValueType.FLOAT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DataStoreValueType.LONG.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DataStoreValueType.MAP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DataStoreValueType.LIST.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
