package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes13.dex */
final class zzgc {
    private static final zzgb zza;
    private static final zzgb zzb;

    static {
        zzgb zzgbVar = null;
        try {
            zzgbVar = (zzgb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzgbVar;
        zzb = new zzgb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgb zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgb zzb() {
        return zzb;
    }
}
