package org.bouncycastle.crypto;

/* loaded from: classes13.dex */
public interface EncapsulatedSecretExtractor {
    byte[] extractSecret(byte[] bArr);

    int getEncapsulationLength();
}
