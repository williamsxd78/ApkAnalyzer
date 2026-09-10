package com.inmobile.sse.core.crypto;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Arrays;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/inmobile/sse/core/crypto/AesEncryptionResult;", "", "iv", "", "aesKey", "Ljavax/crypto/SecretKey;", "encryptedData", "([BLjavax/crypto/SecretKey;[B)V", "getAesKey", "()Ljavax/crypto/SecretKey;", "getEncryptedData", "()[B", "getIv", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AesEncryptionResult {

    /* renamed from: ѥ04650465ѥ04650465ѥ, reason: contains not printable characters */
    public static int f17230465046504650465 = 2;

    /* renamed from: ѥ0465ѥѥ04650465ѥ, reason: contains not printable characters */
    public static int f1724046504650465 = 0;

    /* renamed from: ѥѥ0465ѥ04650465ѥ, reason: contains not printable characters */
    public static int f1725046504650465 = 1;

    /* renamed from: ѥѥѥѥ04650465ѥ, reason: contains not printable characters */
    public static int f172604650465 = 26;

    /* renamed from: ѡ04610461ѡѡѡ0461, reason: contains not printable characters */
    private final byte[] f1727046104610461;

    /* renamed from: ѡ0461ѡѡѡѡ0461, reason: contains not printable characters */
    private final byte[] f172804610461;

    /* renamed from: ѡѡ0461ѡѡѡ0461, reason: contains not printable characters */
    private final SecretKey f172904610461;

    public AesEncryptionResult(byte[] iv, SecretKey aesKey, byte[] encryptedData) {
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(aesKey, "aesKey");
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        this.f172804610461 = iv;
        this.f172904610461 = aesKey;
        this.f1727046104610461 = encryptedData;
    }

    public static /* synthetic */ AesEncryptionResult copy$default(AesEncryptionResult aesEncryptionResult, byte[] bArr, SecretKey secretKey, byte[] bArr2, int i, Object obj) {
        int i2 = f172604650465;
        int i3 = f1725046504650465;
        int i4 = i2 * (i2 + i3);
        int i5 = f17230465046504650465;
        if (i4 % i5 != 0) {
            f172604650465 = 85;
            f1724046504650465 = 7;
        }
        if ((i & 1) != 0) {
            bArr = aesEncryptionResult.f172804610461;
        }
        if ((i & 2) != 0) {
            secretKey = aesEncryptionResult.f172904610461;
        }
        if ((i & 4) != 0) {
            bArr2 = aesEncryptionResult.f1727046104610461;
        }
        int i6 = f172604650465;
        if (((i3 + i6) * i6) % i5 != f1724046504650465) {
            f172604650465 = m12308046504650465();
            f1724046504650465 = m12308046504650465();
        }
        return aesEncryptionResult.copy(bArr, secretKey, bArr2);
    }

    /* renamed from: ѥ0465ѥ046504650465ѥ, reason: contains not printable characters */
    public static int m123060465046504650465() {
        return 2;
    }

    /* renamed from: ѥѥ0465046504650465ѥ, reason: contains not printable characters */
    public static int m123070465046504650465() {
        return 0;
    }

    /* renamed from: ѥѥѥ046504650465ѥ, reason: contains not printable characters */
    public static int m12308046504650465() {
        return 95;
    }

    public final byte[] component1() {
        int i = f172604650465;
        int i2 = (f1725046504650465 + i) * i;
        if (((m12308046504650465() + f1725046504650465) * m12308046504650465()) % f17230465046504650465 != f1724046504650465) {
            f172604650465 = m12308046504650465();
            f1724046504650465 = m12308046504650465();
        }
        if (i2 % f17230465046504650465 != f1724046504650465) {
            f172604650465 = 81;
            f1724046504650465 = m12308046504650465();
        }
        return this.f172804610461;
    }

    public final SecretKey component2() {
        SecretKey secretKey = this.f172904610461;
        int i = f172604650465;
        if (((f1725046504650465 + i) * i) % f17230465046504650465 != m123070465046504650465()) {
            int i2 = f172604650465;
            if ((i2 * (f1725046504650465 + i2)) % f17230465046504650465 != 0) {
                f172604650465 = m12308046504650465();
                f1724046504650465 = m12308046504650465();
            }
            f172604650465 = 10;
            f1724046504650465 = 13;
        }
        return secretKey;
    }

    public final byte[] component3() {
        byte[] bArr = this.f1727046104610461;
        int i = f172604650465;
        int i2 = f1725046504650465;
        if (((i + i2) * i) % f17230465046504650465 != f1724046504650465) {
            if ((i * (i2 + i)) % m123060465046504650465() != 0) {
                f172604650465 = 26;
                f1724046504650465 = 56;
            }
            f172604650465 = m12308046504650465();
            f1724046504650465 = 96;
        }
        return bArr;
    }

    public final AesEncryptionResult copy(byte[] iv, SecretKey aesKey, byte[] encryptedData) {
        int i = f172604650465;
        if ((i * (f1725046504650465 + i)) % f17230465046504650465 != 0) {
            f172604650465 = m12308046504650465();
            f1724046504650465 = 38;
        }
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(aesKey, "aesKey");
        int i2 = f172604650465;
        if (((f1725046504650465 + i2) * i2) % f17230465046504650465 != f1724046504650465) {
            f172604650465 = 9;
            f1724046504650465 = 16;
        }
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        return new AesEncryptionResult(iv, aesKey, encryptedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        int i = f172604650465;
        int i2 = f1725046504650465;
        int i3 = i * (i + i2);
        int i4 = f17230465046504650465;
        if (i3 % i4 != 0) {
            f172604650465 = 72;
            f1724046504650465 = 28;
        }
        if (!(other instanceof AesEncryptionResult)) {
            return false;
        }
        int i5 = f172604650465;
        if ((i5 * (i2 + i5)) % i4 != 0) {
            f172604650465 = 64;
            f1724046504650465 = m12308046504650465();
        }
        AesEncryptionResult aesEncryptionResult = (AesEncryptionResult) other;
        return Intrinsics.areEqual(this.f172804610461, aesEncryptionResult.f172804610461) && Intrinsics.areEqual(this.f172904610461, aesEncryptionResult.f172904610461) && Intrinsics.areEqual(this.f1727046104610461, aesEncryptionResult.f1727046104610461);
    }

    public final SecretKey getAesKey() {
        SecretKey secretKey = this.f172904610461;
        if (((m12308046504650465() + f1725046504650465) * m12308046504650465()) % m123060465046504650465() != f1724046504650465) {
            f172604650465 = m12308046504650465();
            f1724046504650465 = m12308046504650465();
        }
        return secretKey;
    }

    public final byte[] getEncryptedData() {
        int i = f172604650465;
        if (((f1725046504650465 + i) * i) % f17230465046504650465 != f1724046504650465) {
            int m12308046504650465 = m12308046504650465();
            f172604650465 = m12308046504650465;
            f1724046504650465 = 49;
            if (((f1725046504650465 + m12308046504650465) * m12308046504650465) % f17230465046504650465 != 49) {
                f172604650465 = m12308046504650465();
                f1724046504650465 = m12308046504650465();
            }
        }
        return this.f1727046104610461;
    }

    public final byte[] getIv() {
        int i = f172604650465;
        int i2 = f1725046504650465;
        int i3 = f17230465046504650465;
        int i4 = ((i + i2) * i) % i3;
        int i5 = f1724046504650465;
        if (i4 != i5) {
            if (((i2 + i) * i) % i3 != i5) {
                f172604650465 = m12308046504650465();
                f1724046504650465 = 78;
            }
            f172604650465 = m12308046504650465();
            f1724046504650465 = 98;
        }
        return this.f172804610461;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f172804610461) * 31;
        int hashCode2 = this.f172904610461.hashCode();
        int i = f172604650465;
        if ((i * (f1725046504650465 + i)) % f17230465046504650465 != 0) {
            f172604650465 = 46;
            f1724046504650465 = m12308046504650465();
        }
        return ((hashCode + hashCode2) * 31) + Arrays.hashCode(this.f1727046104610461);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AesEncryptionResult(iv=");
        int i = f172604650465;
        if ((i * (f1725046504650465 + i)) % m123060465046504650465() != 0) {
            f172604650465 = m12308046504650465();
            f1724046504650465 = 66;
        }
        sb.append(Arrays.toString(this.f172804610461));
        sb.append(", aesKey=");
        int i2 = f172604650465;
        if (((f1725046504650465 + i2) * i2) % f17230465046504650465 != f1724046504650465) {
            f172604650465 = 87;
            f1724046504650465 = 92;
        }
        sb.append(this.f172904610461);
        sb.append(", encryptedData=");
        sb.append(Arrays.toString(this.f1727046104610461));
        sb.append(')');
        return sb.toString();
    }
}
