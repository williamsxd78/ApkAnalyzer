package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes13.dex */
final class zzagp extends zzaid {
    private final String zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagp(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaid) {
            zzaid zzaidVar = (zzaid) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzaidVar.zzb()) : zzaidVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzaidVar.zza()) : zzaidVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaid
    final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaid
    final String zzb() {
        return this.zza;
    }
}
