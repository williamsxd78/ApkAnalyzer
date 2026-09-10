package com.inmobile.sse.networking;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/inmobile/sse/networking/NetworkResponse;", "", "code", "", "data", "", "(I[B)V", "getCode", "()I", "getData", "()[B", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NetworkResponse {

    /* renamed from: ћ045B045B045B045Bћћ, reason: contains not printable characters */
    public static int f2679045B045B045B045B = 0;

    /* renamed from: ћ045Bћћћ045Bћ, reason: contains not printable characters */
    public static int f2680045B045B = 2;

    /* renamed from: ћћ045B045B045Bћћ, reason: contains not printable characters */
    public static int f2681045B045B045B = 98;

    /* renamed from: ћћћћћ045Bћ, reason: contains not printable characters */
    public static int f2682045B = 1;

    /* renamed from: с0441с0441с04410441, reason: contains not printable characters */
    private final int f26830441044104410441;

    /* renamed from: сс04410441с04410441, reason: contains not printable characters */
    private final byte[] f26840441044104410441;

    public NetworkResponse(int i, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f26830441044104410441 = i;
        this.f26840441044104410441 = data;
    }

    public static /* synthetic */ NetworkResponse copy$default(NetworkResponse networkResponse, int i, byte[] bArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkResponse.f26830441044104410441;
            int i3 = f2681045B045B045B;
            if (((f2682045B + i3) * i3) % f2680045B045B != f2679045B045B045B045B) {
                f2681045B045B045B = m13505045B045B();
                f2679045B045B045B045B = 94;
            }
        }
        if ((i2 & 2) != 0) {
            bArr = networkResponse.f26840441044104410441;
        }
        return networkResponse.copy(i, bArr);
    }

    /* renamed from: ћ045B045Bћћ045Bћ, reason: contains not printable characters */
    public static int m13504045B045B045B() {
        return 1;
    }

    /* renamed from: ћћ045Bћћ045Bћ, reason: contains not printable characters */
    public static int m13505045B045B() {
        return 37;
    }

    /* renamed from: ћћћ045Bћ045Bћ, reason: contains not printable characters */
    public static int m13506045B045B() {
        return 2;
    }

    public final int component1() {
        int i = f2681045B045B045B;
        if ((i * (f2682045B + i)) % f2680045B045B != 0) {
            f2681045B045B045B = 84;
            f2679045B045B045B045B = m13505045B045B();
        }
        return this.f26830441044104410441;
    }

    public final byte[] component2() {
        int i = f2681045B045B045B;
        int i2 = f2682045B;
        int i3 = f2680045B045B;
        int i4 = ((i + i2) * i) % i3;
        if ((i * (i2 + i)) % i3 != 0) {
            f2681045B045B045B = 46;
            f2679045B045B045B045B = 68;
        }
        if (i4 != f2679045B045B045B045B) {
            f2681045B045B045B = m13505045B045B();
            f2679045B045B045B045B = m13505045B045B();
        }
        return this.f26840441044104410441;
    }

    public final NetworkResponse copy(int code, byte[] data) {
        int i = f2681045B045B045B;
        if (((f2682045B + i) * i) % f2680045B045B != f2679045B045B045B045B) {
            if ((i * (m13504045B045B045B() + i)) % f2680045B045B != 0) {
                f2681045B045B045B = 9;
                f2679045B045B045B045B = m13505045B045B();
            }
            f2681045B045B045B = 47;
            f2679045B045B045B045B = 13;
        }
        Intrinsics.checkNotNullParameter(data, "data");
        return new NetworkResponse(code, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        int i = f2681045B045B045B;
        if ((i * (f2682045B + i)) % f2680045B045B != 0) {
            f2681045B045B045B = m13505045B045B();
            f2679045B045B045B045B = m13505045B045B();
        }
        if (!(other instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) other;
        if (this.f26830441044104410441 != networkResponse.f26830441044104410441) {
            return false;
        }
        byte[] bArr = this.f26840441044104410441;
        if (((m13505045B045B() + f2682045B) * m13505045B045B()) % f2680045B045B != f2679045B045B045B045B) {
            f2681045B045B045B = 68;
            f2679045B045B045B045B = 67;
        }
        return Intrinsics.areEqual(bArr, networkResponse.f26840441044104410441);
    }

    public final int getCode() {
        int i = this.f26830441044104410441;
        int m13505045B045B = ((m13505045B045B() + f2682045B) * m13505045B045B()) % f2680045B045B;
        if (((m13505045B045B() + f2682045B) * m13505045B045B()) % f2680045B045B != f2679045B045B045B045B) {
            f2681045B045B045B = 60;
            f2679045B045B045B045B = 13;
        }
        if (m13505045B045B != f2679045B045B045B045B) {
            f2681045B045B045B = 62;
            f2679045B045B045B045B = 30;
        }
        return i;
    }

    public final byte[] getData() {
        if (((f2681045B045B045B + m13504045B045B045B()) * f2681045B045B045B) % f2680045B045B != f2679045B045B045B045B) {
            f2681045B045B045B = m13505045B045B();
            f2679045B045B045B045B = 78;
        }
        return this.f26840441044104410441;
    }

    public int hashCode() {
        int hashCode = (Integer.hashCode(this.f26830441044104410441) * 31) + Arrays.hashCode(this.f26840441044104410441);
        int i = f2681045B045B045B;
        int i2 = f2682045B;
        if ((i * (i + i2)) % f2680045B045B != 0) {
            f2681045B045B045B = 39;
            f2679045B045B045B045B = 64;
            if ((39 * (i2 + 39)) % m13506045B045B() != 0) {
                f2681045B045B045B = 90;
                f2679045B045B045B045B = 96;
            }
        }
        return hashCode;
    }

    public String toString() {
        int m13505045B045B = (m13505045B045B() + m13504045B045B045B()) * m13505045B045B();
        int i = f2680045B045B;
        if (m13505045B045B % i != f2679045B045B045B045B) {
            int i2 = f2681045B045B045B;
            if ((i2 * (f2682045B + i2)) % i != 0) {
                f2681045B045B045B = m13505045B045B();
                f2679045B045B045B045B = m13505045B045B();
            }
            f2681045B045B045B = 14;
            f2679045B045B045B045B = m13505045B045B();
        }
        return "NetworkResponse(code=" + this.f26830441044104410441 + ", data=" + Arrays.toString(this.f26840441044104410441) + ')';
    }
}
