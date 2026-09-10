package MCOFeQ;

import android.security.keystore.KeyGenParameterSpec;

/* loaded from: classes.dex */
class LNzfBr {
    private LNzfBr() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeyGenParameterSpec.Builder dFQHnP(KeyGenParameterSpec.Builder builder, byte[] bArr) {
        return builder.setAttestationChallenge(bArr);
    }
}
