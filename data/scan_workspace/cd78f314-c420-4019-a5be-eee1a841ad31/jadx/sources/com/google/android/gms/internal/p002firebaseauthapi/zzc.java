package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes13.dex */
final class zzc extends zza {
    private zzc() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zza
    public final URLConnection zza(URL url, String str) throws IOException {
        return url.openConnection();
    }
}
