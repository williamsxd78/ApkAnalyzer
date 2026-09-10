package com.inmobile.sse.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/inmobile/sse/models/BiometricResult;", "", "result", "", "date", "(Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getResult", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BiometricResult {

    /* renamed from: д04340434дд0434д, reason: contains not printable characters */
    public static int f2451043404340434 = 2;

    /* renamed from: д0434ддд0434д, reason: contains not printable characters */
    public static int f245204340434 = 0;

    /* renamed from: дд0434дд0434д, reason: contains not printable characters */
    public static int f245304340434 = 1;

    /* renamed from: ддддд0434д, reason: contains not printable characters */
    public static int f24540434 = 66;
    private final String date;
    private final String result;

    public BiometricResult(String str, String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.result = str;
        this.date = date;
    }

    public static /* synthetic */ BiometricResult copy$default(BiometricResult biometricResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = biometricResult.result;
        }
        int i2 = f24540434;
        if (((f245304340434 + i2) * i2) % f2451043404340434 != f245204340434) {
            f24540434 = 30;
            f245204340434 = 32;
        }
        if ((i & 2) != 0) {
            str2 = biometricResult.date;
        }
        return biometricResult.copy(str, str2);
    }

    /* renamed from: д043404340434д0434д, reason: contains not printable characters */
    public static int m132870434043404340434() {
        return 1;
    }

    /* renamed from: д0434д0434д0434д, reason: contains not printable characters */
    public static int m13288043404340434() {
        return 0;
    }

    /* renamed from: дд04340434д0434д, reason: contains not printable characters */
    public static int m13289043404340434() {
        return 2;
    }

    /* renamed from: ддд0434д0434д, reason: contains not printable characters */
    public static int m1329004340434() {
        return 3;
    }

    public final String component1() {
        int i = f24540434;
        if (((f245304340434 + i) * i) % f2451043404340434 != f245204340434) {
            f24540434 = 48;
            f245204340434 = 35;
        }
        return this.result;
    }

    public final String component2() {
        int i = f24540434;
        if ((i * (f245304340434 + i)) % f2451043404340434 != 0) {
            f24540434 = m1329004340434();
            f245204340434 = 38;
        }
        return this.date;
    }

    public final BiometricResult copy(String result, String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        BiometricResult biometricResult = new BiometricResult(result, date);
        if (((f24540434 + m132870434043404340434()) * f24540434) % f2451043404340434 != f245204340434) {
            f24540434 = m1329004340434();
            f245204340434 = m1329004340434();
        }
        return biometricResult;
    }

    public boolean equals(Object other) {
        int i = f24540434;
        if ((i * (f245304340434 + i)) % f2451043404340434 != 0) {
            f24540434 = 57;
            f245204340434 = m1329004340434();
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricResult)) {
            return false;
        }
        BiometricResult biometricResult = (BiometricResult) other;
        if (Intrinsics.areEqual(this.result, biometricResult.result)) {
            return Intrinsics.areEqual(this.date, biometricResult.date);
        }
        int i2 = f24540434;
        if ((i2 * (f245304340434 + i2)) % f2451043404340434 != 0) {
            f24540434 = m1329004340434();
            f245204340434 = 30;
        }
        return false;
    }

    public final String getDate() {
        int i = f24540434;
        int i2 = (f245304340434 + i) * i;
        int m1329004340434 = m1329004340434();
        if ((m1329004340434 * (m132870434043404340434() + m1329004340434)) % f2451043404340434 != 0) {
            f24540434 = m1329004340434();
            f245204340434 = m1329004340434();
        }
        if (i2 % m13289043404340434() != f245204340434) {
            f24540434 = m1329004340434();
            f245204340434 = m1329004340434();
        }
        return this.date;
    }

    public final String getResult() {
        String str = this.result;
        int i = f24540434;
        if (((f245304340434 + i) * i) % f2451043404340434 != m13288043404340434()) {
            int i2 = f24540434;
            if (((f245304340434 + i2) * i2) % f2451043404340434 != f245204340434) {
                f24540434 = m1329004340434();
                f245204340434 = 45;
            }
            f24540434 = 49;
            f245204340434 = 68;
        }
        return str;
    }

    public int hashCode() {
        int hashCode;
        String str = this.result;
        if (str == null) {
            int i = f24540434;
            if (((f245304340434 + i) * i) % f2451043404340434 != f245204340434) {
                f24540434 = 97;
                f245204340434 = m1329004340434();
            }
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = f24540434;
        if ((i3 * (f245304340434 + i3)) % f2451043404340434 != 0) {
            f24540434 = 68;
            f245204340434 = 77;
        }
        return i2 + this.date.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = f24540434;
        int i2 = f245304340434;
        if (((i + i2) * i) % f2451043404340434 != f245204340434) {
            if (((i2 + i) * i) % m13289043404340434() != m13288043404340434()) {
                f24540434 = m1329004340434();
                f245204340434 = 92;
            }
            f24540434 = m1329004340434();
            f245204340434 = 79;
        }
        sb.append("BiometricResult(result=");
        sb.append(this.result);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(')');
        return sb.toString();
    }
}
