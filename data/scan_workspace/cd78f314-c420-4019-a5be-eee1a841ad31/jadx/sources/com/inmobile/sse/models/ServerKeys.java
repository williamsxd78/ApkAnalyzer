package com.inmobile.sse.models;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/inmobile/sse/models/ServerKeys;", "", "encryptionPubKey", "", "encryptionPubKeyType", "signature", "signatureType", "signingPubKey", "signingPubKeyType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEncryptionPubKey", "()Ljava/lang/String;", "getEncryptionPubKeyType", "getSignature", "getSignatureType", "getSigningPubKey", "getSigningPubKeyType", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerKeys {

    /* renamed from: Ѩ046804680468ѨѨ0468, reason: contains not printable characters */
    public static int f25790468046804680468 = 0;

    /* renamed from: Ѩ04680468ѨѨѨ0468, reason: contains not printable characters */
    public static int f2580046804680468 = 2;

    /* renamed from: ѨѨ0468ѨѨѨ0468, reason: contains not printable characters */
    public static int f258104680468 = 1;

    /* renamed from: ѨѨѨ0468ѨѨ0468, reason: contains not printable characters */
    public static int f258204680468 = 88;

    @SerializedName("encryptionPubKey")
    private final String encryptionPubKey;

    @SerializedName("encryptionPubKeyType")
    private final String encryptionPubKeyType;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("signatureType")
    private final String signatureType;

    @SerializedName("signingPubKey")
    private final String signingPubKey;

    @SerializedName("signingPubKeyType")
    private final String signingPubKeyType;

    public ServerKeys(String encryptionPubKey, String encryptionPubKeyType, String signature, String signatureType, String signingPubKey, String signingPubKeyType) {
        Intrinsics.checkNotNullParameter(encryptionPubKey, "encryptionPubKey");
        Intrinsics.checkNotNullParameter(encryptionPubKeyType, "encryptionPubKeyType");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(signatureType, "signatureType");
        Intrinsics.checkNotNullParameter(signingPubKey, "signingPubKey");
        Intrinsics.checkNotNullParameter(signingPubKeyType, "signingPubKeyType");
        this.encryptionPubKey = encryptionPubKey;
        this.encryptionPubKeyType = encryptionPubKeyType;
        this.signature = signature;
        this.signatureType = signatureType;
        this.signingPubKey = signingPubKey;
        this.signingPubKeyType = signingPubKeyType;
    }

    public static /* synthetic */ ServerKeys copy$default(ServerKeys serverKeys, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverKeys.encryptionPubKey;
        }
        if ((i & 2) != 0) {
            str2 = serverKeys.encryptionPubKeyType;
        }
        if ((i & 4) != 0) {
            str3 = serverKeys.signature;
            int i2 = f258204680468;
            if ((i2 * (f258104680468 + i2)) % m13423046804680468() != 0) {
                f258204680468 = m134260468();
                f258104680468 = 21;
            }
        }
        if ((i & 8) != 0) {
            str4 = serverKeys.signatureType;
        }
        if ((i & 16) != 0) {
            str5 = serverKeys.signingPubKey;
        }
        if ((i & 32) != 0) {
            str6 = serverKeys.signingPubKeyType;
        }
        String str7 = str6;
        if (((m134260468() + f258104680468) * m134260468()) % f2580046804680468 != m1342404680468()) {
            f258104680468 = 93;
        }
        String str8 = str5;
        String str9 = str3;
        return serverKeys.copy(str, str2, str9, str4, str8, str7);
    }

    /* renamed from: Ѩ0468Ѩ0468ѨѨ0468, reason: contains not printable characters */
    public static int m13423046804680468() {
        return 2;
    }

    /* renamed from: Ѩ0468ѨѨѨѨ0468, reason: contains not printable characters */
    public static int m1342404680468() {
        return 0;
    }

    /* renamed from: ѨѨ04680468ѨѨ0468, reason: contains not printable characters */
    public static int m13425046804680468() {
        return 1;
    }

    /* renamed from: ѨѨѨѨѨѨ0468, reason: contains not printable characters */
    public static int m134260468() {
        return 38;
    }

    public final String component1() {
        int i = f258204680468;
        if (((f258104680468 + i) * i) % f2580046804680468 != m1342404680468()) {
            int i2 = f258204680468;
            if ((i2 * (f258104680468 + i2)) % f2580046804680468 != 0) {
                f258204680468 = m134260468();
                f25790468046804680468 = 35;
            }
            f258204680468 = 76;
            f25790468046804680468 = 18;
        }
        return this.encryptionPubKey;
    }

    public final String component2() {
        int i = f258204680468;
        int i2 = f258104680468;
        if (((i + i2) * i) % f2580046804680468 != f25790468046804680468) {
            if ((i * (i2 + i)) % m13423046804680468() != 0) {
                f258204680468 = m134260468();
                f25790468046804680468 = m134260468();
            }
            f258204680468 = 27;
            f25790468046804680468 = m134260468();
        }
        return this.encryptionPubKeyType;
    }

    public final String component3() {
        int i = f258204680468;
        int i2 = f258104680468;
        int i3 = i + i2;
        if (((i2 + i) * i) % f2580046804680468 != 0) {
            f258204680468 = m134260468();
            f25790468046804680468 = m134260468();
        }
        if ((i * i3) % f2580046804680468 != 0) {
            f258204680468 = 40;
            f25790468046804680468 = 95;
        }
        return this.signature;
    }

    public final String component4() {
        if (((m134260468() + f258104680468) * m134260468()) % f2580046804680468 != m1342404680468()) {
            f258204680468 = 78;
            f25790468046804680468 = m134260468();
            int i = f258204680468;
            if ((i * (f258104680468 + i)) % f2580046804680468 != 0) {
                f258204680468 = m134260468();
                f25790468046804680468 = m134260468();
            }
        }
        return this.signatureType;
    }

    public final String component5() {
        int i = f258204680468;
        if ((i * (m13425046804680468() + i)) % f2580046804680468 != 0) {
            f258204680468 = 8;
            f25790468046804680468 = m134260468();
        }
        return this.signingPubKey;
    }

    public final String component6() {
        String str = this.signingPubKeyType;
        int i = f258204680468;
        int i2 = (f258104680468 + i) * i;
        int m13425046804680468 = i * (m13425046804680468() + i);
        int i3 = f2580046804680468;
        if (m13425046804680468 % i3 != 0) {
            f258204680468 = 16;
            f25790468046804680468 = 97;
        }
        if (i2 % i3 != 0) {
            f258204680468 = 72;
            f25790468046804680468 = 21;
        }
        return str;
    }

    public final ServerKeys copy(String encryptionPubKey, String encryptionPubKeyType, String signature, String signatureType, String signingPubKey, String signingPubKeyType) {
        int i = f258204680468;
        if (((f258104680468 + i) * i) % f2580046804680468 != f25790468046804680468) {
            if (((i + m13425046804680468()) * f258204680468) % m13423046804680468() != m1342404680468()) {
                f258204680468 = m134260468();
                f25790468046804680468 = 89;
            }
            f258204680468 = 93;
            f25790468046804680468 = 13;
        }
        Intrinsics.checkNotNullParameter(encryptionPubKey, "encryptionPubKey");
        Intrinsics.checkNotNullParameter(encryptionPubKeyType, "encryptionPubKeyType");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(signatureType, "signatureType");
        Intrinsics.checkNotNullParameter(signingPubKey, "signingPubKey");
        Intrinsics.checkNotNullParameter(signingPubKeyType, "signingPubKeyType");
        return new ServerKeys(encryptionPubKey, encryptionPubKeyType, signature, signatureType, signingPubKey, signingPubKeyType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerKeys)) {
            return false;
        }
        ServerKeys serverKeys = (ServerKeys) other;
        if (!Intrinsics.areEqual(this.encryptionPubKey, serverKeys.encryptionPubKey) || !Intrinsics.areEqual(this.encryptionPubKeyType, serverKeys.encryptionPubKeyType) || !Intrinsics.areEqual(this.signature, serverKeys.signature) || !Intrinsics.areEqual(this.signatureType, serverKeys.signatureType)) {
            return false;
        }
        int m13425046804680468 = f258204680468 + m13425046804680468();
        int i = f258204680468;
        int i2 = f2580046804680468;
        int i3 = (m13425046804680468 * i) % i2;
        int i4 = f25790468046804680468;
        if (i3 != i4) {
            if (((f258104680468 + i) * i) % i2 != i4) {
                f258204680468 = m134260468();
                f25790468046804680468 = m134260468();
            }
            f258204680468 = 23;
            f25790468046804680468 = m134260468();
        }
        return Intrinsics.areEqual(this.signingPubKey, serverKeys.signingPubKey) && Intrinsics.areEqual(this.signingPubKeyType, serverKeys.signingPubKeyType);
    }

    public final String getEncryptionPubKey() {
        return this.encryptionPubKey;
    }

    public final String getEncryptionPubKeyType() {
        String str = this.encryptionPubKeyType;
        int i = f258204680468;
        int i2 = f258104680468;
        if (((i + i2) * i) % f2580046804680468 != 0) {
            if (((i2 + i) * i) % m13423046804680468() != f25790468046804680468) {
                f258204680468 = m134260468();
                f25790468046804680468 = 19;
            }
            f258204680468 = 21;
            f25790468046804680468 = m134260468();
        }
        return str;
    }

    public final String getSignature() {
        int i = f258204680468;
        if (((f258104680468 + i) * i) % f2580046804680468 != f25790468046804680468) {
            f258204680468 = 75;
            f25790468046804680468 = m134260468();
        }
        return this.signature;
    }

    public final String getSignatureType() {
        int i = f258204680468;
        if ((i * (m13425046804680468() + i)) % f2580046804680468 != 0) {
            f258204680468 = m134260468();
            f25790468046804680468 = m134260468();
        }
        return this.signatureType;
    }

    public final String getSigningPubKey() {
        int i = f258204680468;
        if (((f258104680468 + i) * i) % f2580046804680468 != m1342404680468()) {
            f258204680468 = 30;
            f25790468046804680468 = 77;
        }
        String str = this.signingPubKey;
        int i2 = f258204680468;
        if ((i2 * (f258104680468 + i2)) % f2580046804680468 != 0) {
            f258204680468 = 54;
            f25790468046804680468 = m134260468();
        }
        return str;
    }

    public final String getSigningPubKeyType() {
        int i = f258204680468;
        if ((i * (f258104680468 + i)) % f2580046804680468 != 0) {
            if (((m134260468() + f258104680468) * m134260468()) % m13423046804680468() != f25790468046804680468) {
                f258204680468 = 10;
                f25790468046804680468 = 2;
            }
            f258204680468 = 36;
            f25790468046804680468 = m134260468();
        }
        return this.signingPubKeyType;
    }

    public int hashCode() {
        int hashCode = ((((((this.encryptionPubKey.hashCode() * 31) + this.encryptionPubKeyType.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.signatureType.hashCode()) * 31;
        String str = this.signingPubKey;
        int i = f258204680468;
        int i2 = f258104680468;
        int i3 = i + i2;
        if (((i2 + i) * i) % m13423046804680468() != f25790468046804680468) {
            f258204680468 = m134260468();
            f25790468046804680468 = 36;
        }
        if ((i3 * i) % f2580046804680468 != f25790468046804680468) {
            f258204680468 = m134260468();
            f25790468046804680468 = m134260468();
        }
        return ((hashCode + str.hashCode()) * 31) + this.signingPubKeyType.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServerKeys(encryptionPubKey=");
        sb.append(this.encryptionPubKey);
        sb.append(", encryptionPubKeyType=");
        int i = f258204680468;
        int i2 = f258104680468;
        int i3 = f2580046804680468;
        if (((i + i2) * i) % i3 != 0) {
            if ((i * (i2 + i)) % i3 != 0) {
                f258204680468 = 83;
                f25790468046804680468 = 11;
            }
            f258204680468 = m134260468();
            f25790468046804680468 = 6;
        }
        sb.append(this.encryptionPubKeyType);
        sb.append(", signature=");
        sb.append(this.signature);
        sb.append(", signatureType=");
        sb.append(this.signatureType);
        sb.append(", signingPubKey=");
        sb.append(this.signingPubKey);
        sb.append(", signingPubKeyType=");
        sb.append(this.signingPubKeyType);
        sb.append(')');
        return sb.toString();
    }
}
