package com.vivaaerobus.app.extension;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteArray+Extension.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"decodeBase64", "", "extension"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ByteArray_ExtensionKt {
    public static final byte[] decodeBase64(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int[] iArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 0;
        while (i5 < bArr.length) {
            int i6 = iArr[bArr[i5]];
            if (i6 != -1) {
                int i7 = (i6 & 255) << 18;
                int i8 = i5 + 1;
                if (i8 >= bArr.length || (i4 = iArr[bArr[i8]]) == -1) {
                    i = 0;
                } else {
                    i7 |= (i4 & 255) << 12;
                    i = 1;
                }
                int i9 = i5 + 2;
                if (i9 < bArr.length && (i3 = iArr[bArr[i9]]) != -1) {
                    i7 |= (i3 & 255) << 6;
                    i++;
                }
                int i10 = i5 + 3;
                if (i10 < bArr.length && (i2 = iArr[bArr[i10]]) != -1) {
                    i7 |= i2 & 255;
                    i++;
                }
                while (i > 0) {
                    byteArrayOutputStream.write((char) ((16711680 & i7) >> 16));
                    i7 <<= 8;
                    i--;
                }
                i5 += 4;
            } else {
                i5++;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
