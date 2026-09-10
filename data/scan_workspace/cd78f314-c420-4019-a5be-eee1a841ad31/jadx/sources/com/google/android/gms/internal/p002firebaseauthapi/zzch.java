package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes13.dex */
public final class zzch {
    private static final zzch zza = new zzch();

    private zzch() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzch zza() {
        return zza;
    }

    public static zzch zza(@Nullable zzch zzchVar) throws GeneralSecurityException {
        if (zzchVar != null) {
            return zzchVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
