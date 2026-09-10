package com.inmobile.sse.core.crypto;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.security.PrivateKey;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/inmobile/sse/core/crypto/RsaKeyPair;", "", "publicKey", "Ljava/security/PublicKey;", "privateKey", "Ljava/security/PrivateKey;", "(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V", "getPrivateKey", "()Ljava/security/PrivateKey;", "getPublicKey", "()Ljava/security/PublicKey;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RsaKeyPair {

    /* renamed from: ѥ04650465046504650465ѥ, reason: contains not printable characters */
    public static int f173004650465046504650465 = 37;

    /* renamed from: ѥ0465ѥѥѥѥ0465, reason: contains not printable characters */
    public static int f173104650465 = 1;

    /* renamed from: ѥѥ0465ѥѥѥ0465, reason: contains not printable characters */
    public static int f173204650465 = 2;

    /* renamed from: ѥѥѥ0465ѥѥ0465, reason: contains not printable characters */
    public static int f173304650465;

    /* renamed from: ѡ0461ѡ0461ѡѡ0461, reason: contains not printable characters */
    private final PrivateKey f1734046104610461;

    /* renamed from: ѡѡѡ0461ѡѡ0461, reason: contains not printable characters */
    private final PublicKey f173504610461;

    public RsaKeyPair(PublicKey publicKey, PrivateKey privateKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        this.f173504610461 = publicKey;
        this.f1734046104610461 = privateKey;
    }

    public static /* synthetic */ RsaKeyPair copy$default(RsaKeyPair rsaKeyPair, PublicKey publicKey, PrivateKey privateKey, int i, Object obj) {
        if ((i & 1) != 0) {
            publicKey = rsaKeyPair.f173504610461;
            int i2 = f173004650465046504650465;
            if (((f173104650465 + i2) * i2) % f173204650465 != m123120465()) {
                f173004650465046504650465 = m12309046504650465();
                f173104650465 = 68;
            }
        }
        if ((i & 2) != 0) {
            privateKey = rsaKeyPair.f1734046104610461;
        }
        int i3 = f173004650465046504650465;
        if ((i3 * (f173104650465 + i3)) % f173204650465 != 0) {
            f173004650465046504650465 = 13;
            f173104650465 = 76;
        }
        return rsaKeyPair.copy(publicKey, privateKey);
    }

    /* renamed from: ѥ04650465ѥѥѥ0465, reason: contains not printable characters */
    public static int m12309046504650465() {
        return 34;
    }

    /* renamed from: ѥ0465ѥ0465ѥѥ0465, reason: contains not printable characters */
    public static int m12310046504650465() {
        return 2;
    }

    /* renamed from: ѥѥ04650465ѥѥ0465, reason: contains not printable characters */
    public static int m12311046504650465() {
        return 1;
    }

    /* renamed from: ѥѥѥѥѥѥ0465, reason: contains not printable characters */
    public static int m123120465() {
        return 0;
    }

    public final PublicKey component1() {
        PublicKey publicKey = this.f173504610461;
        int i = f173004650465046504650465;
        if (((f173104650465 + i) * i) % f173204650465 != f173304650465) {
            f173004650465046504650465 = m12309046504650465();
            f173304650465 = 0;
        }
        return publicKey;
    }

    public final PrivateKey component2() {
        int i = f173004650465046504650465;
        int i2 = f173104650465;
        int i3 = f173204650465;
        int i4 = ((i + i2) * i) % i3;
        if ((i * (i2 + i)) % i3 != 0) {
            f173004650465046504650465 = m12309046504650465();
            f173304650465 = 70;
        }
        if (i4 != f173304650465) {
            f173004650465046504650465 = 43;
            f173304650465 = m12309046504650465();
        }
        return this.f1734046104610461;
    }

    public final RsaKeyPair copy(PublicKey publicKey, PrivateKey privateKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        int i = f173004650465046504650465;
        if (((f173104650465 + i) * i) % m12310046504650465() != f173304650465) {
            f173004650465046504650465 = 82;
            f173304650465 = m12309046504650465();
        }
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        RsaKeyPair rsaKeyPair = new RsaKeyPair(publicKey, privateKey);
        int i2 = f173004650465046504650465;
        if (((f173104650465 + i2) * i2) % f173204650465 != f173304650465) {
            f173004650465046504650465 = 34;
            f173304650465 = 88;
        }
        return rsaKeyPair;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RsaKeyPair)) {
            return false;
        }
        int i = f173004650465046504650465;
        if (((f173104650465 + i) * i) % f173204650465 != f173304650465) {
            f173004650465046504650465 = m12309046504650465();
            f173304650465 = m12309046504650465();
        }
        RsaKeyPair rsaKeyPair = (RsaKeyPair) other;
        if (!Intrinsics.areEqual(this.f173504610461, rsaKeyPair.f173504610461)) {
            return false;
        }
        int i2 = f173004650465046504650465;
        if ((i2 * (f173104650465 + i2)) % f173204650465 != 0) {
            f173004650465046504650465 = m12309046504650465();
            f173304650465 = 33;
        }
        return Intrinsics.areEqual(this.f1734046104610461, rsaKeyPair.f1734046104610461);
    }

    public final PrivateKey getPrivateKey() {
        int i = f173004650465046504650465;
        if ((i * (f173104650465 + i)) % f173204650465 != 0) {
            f173004650465046504650465 = 15;
            f173104650465 = m12309046504650465();
        }
        return this.f1734046104610461;
    }

    public final PublicKey getPublicKey() {
        int i = f173004650465046504650465;
        if (((f173104650465 + i) * i) % f173204650465 != m123120465()) {
            f173004650465046504650465 = m12309046504650465();
            f173104650465 = 69;
        }
        return this.f173504610461;
    }

    public int hashCode() {
        int hashCode = this.f173504610461.hashCode() * 31;
        int hashCode2 = this.f1734046104610461.hashCode();
        int m12311046504650465 = f173004650465046504650465 + m12311046504650465();
        int i = f173004650465046504650465;
        if (((f173104650465 + i) * i) % f173204650465 != f173304650465) {
            f173004650465046504650465 = 50;
            f173304650465 = m12309046504650465();
        }
        if ((m12311046504650465 * f173004650465046504650465) % f173204650465 != f173304650465) {
            f173004650465046504650465 = m12309046504650465();
            f173304650465 = 69;
        }
        return hashCode + hashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RsaKeyPair(publicKey=");
        sb.append(this.f173504610461);
        int i = f173004650465046504650465;
        if ((i * (f173104650465 + i)) % f173204650465 != 0) {
            f173004650465046504650465 = 14;
            f173304650465 = 90;
        }
        sb.append(", privateKey=");
        sb.append(this.f1734046104610461);
        sb.append(')');
        String sb2 = sb.toString();
        int i2 = f173004650465046504650465;
        if (((f173104650465 + i2) * i2) % f173204650465 != f173304650465) {
            f173004650465046504650465 = 2;
            f173304650465 = m12309046504650465();
        }
        return sb2;
    }
}
