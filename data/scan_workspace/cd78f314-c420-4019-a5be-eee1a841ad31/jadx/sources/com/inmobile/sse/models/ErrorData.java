package com.inmobile.sse.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/inmobile/sse/models/ErrorData;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorData {

    /* renamed from: Л041BЛ041B041B041BЛ, reason: contains not printable characters */
    public static int f2479041B041B041B041B = 2;

    /* renamed from: Л041BЛЛ041B041BЛ, reason: contains not printable characters */
    public static int f2480041B041B041B = 1;

    /* renamed from: ЛЛЛ041B041B041BЛ, reason: contains not printable characters */
    public static int f2481041B041B041B = 0;

    /* renamed from: ЛЛЛЛ041B041BЛ, reason: contains not printable characters */
    public static int f2482041B041B = 32;
    private String type;

    public ErrorData(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    public static /* synthetic */ ErrorData copy$default(ErrorData errorData, String str, int i, Object obj) {
        int i2 = f2482041B041B;
        if ((i2 * (f2480041B041B041B + i2)) % m13331041B041B041B() != 0) {
            f2482041B041B = 3;
            f2480041B041B041B = m13329041B041B041B041B();
        }
        if ((i & 1) != 0) {
            int i3 = f2482041B041B;
            if (((f2480041B041B041B + i3) * i3) % m13331041B041B041B() != f2481041B041B041B) {
                f2482041B041B = m13329041B041B041B041B();
                f2481041B041B041B = 77;
            }
            str = errorData.type;
        }
        return errorData.copy(str);
    }

    /* renamed from: Л041B041BЛ041B041BЛ, reason: contains not printable characters */
    public static int m13329041B041B041B041B() {
        return 93;
    }

    /* renamed from: ЛЛ041B041B041B041BЛ, reason: contains not printable characters */
    public static int m13330041B041B041B041B() {
        return 1;
    }

    /* renamed from: ЛЛ041BЛ041B041BЛ, reason: contains not printable characters */
    public static int m13331041B041B041B() {
        return 2;
    }

    public final String component1() {
        int i = f2482041B041B;
        int i2 = f2480041B041B041B;
        int i3 = f2479041B041B041B041B;
        int i4 = ((i + i2) * i) % i3;
        int i5 = f2481041B041B041B;
        if (i4 != i5) {
            if (((i2 + i) * i) % i3 != i5) {
                f2482041B041B = m13329041B041B041B041B();
                f2481041B041B041B = m13329041B041B041B041B();
            }
            f2482041B041B = 46;
            f2481041B041B041B = 67;
        }
        return this.type;
    }

    public final ErrorData copy(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = f2482041B041B;
        int i2 = f2480041B041B041B;
        int i3 = f2479041B041B041B041B;
        int i4 = ((i + i2) * i) % i3;
        if ((i * (i2 + i)) % i3 != 0) {
            f2482041B041B = 33;
            f2481041B041B041B = 59;
        }
        if (i4 != f2481041B041B041B) {
            f2482041B041B = m13329041B041B041B041B();
            f2481041B041B041B = m13329041B041B041B041B();
        }
        return new ErrorData(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorData)) {
            return false;
        }
        String str = this.type;
        String str2 = ((ErrorData) other).type;
        int i = f2482041B041B;
        if ((i * (f2480041B041B041B + i)) % f2479041B041B041B041B != 0) {
            f2482041B041B = m13329041B041B041B041B();
            f2481041B041B041B = m13329041B041B041B041B();
        }
        return Intrinsics.areEqual(str, str2);
    }

    public final String getType() {
        int i = f2482041B041B;
        int i2 = f2480041B041B041B;
        int i3 = i * (i + i2);
        int i4 = f2479041B041B041B041B;
        if (i3 % i4 != 0) {
            f2482041B041B = 70;
            f2481041B041B041B = 71;
        }
        String str = this.type;
        int i5 = f2482041B041B;
        if (((i2 + i5) * i5) % i4 != f2481041B041B041B) {
            f2482041B041B = m13329041B041B041B041B();
            f2481041B041B041B = m13329041B041B041B041B();
        }
        return str;
    }

    public int hashCode() {
        int i = f2482041B041B;
        if ((i * (f2480041B041B041B + i)) % f2479041B041B041B041B != 0) {
            f2482041B041B = m13329041B041B041B041B();
            f2481041B041B041B = 58;
        }
        int i2 = f2482041B041B;
        if ((i2 * (f2480041B041B041B + i2)) % f2479041B041B041B041B != 0) {
            f2482041B041B = m13329041B041B041B041B();
            f2481041B041B041B = 2;
        }
        return this.type.hashCode();
    }

    public final void setType(String str) {
        int m13330041B041B041B041B = f2482041B041B + m13330041B041B041B041B();
        int i = f2482041B041B;
        if (((f2480041B041B041B + i) * i) % m13331041B041B041B() != f2481041B041B041B) {
            f2482041B041B = 28;
            f2481041B041B041B = m13329041B041B041B041B();
        }
        if ((m13330041B041B041B041B * i) % f2479041B041B041B041B != f2481041B041B041B) {
            f2482041B041B = 34;
            f2481041B041B041B = 47;
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        int i = f2482041B041B;
        if ((i * (f2480041B041B041B + i)) % f2479041B041B041B041B != 0) {
            f2482041B041B = m13329041B041B041B041B();
            f2481041B041B041B = m13329041B041B041B041B();
        }
        return "ErrorData(type=" + this.type + ')';
    }
}
