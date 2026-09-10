package com.google.android.recaptcha.internal;

import com.airbnb.paris.R2;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes14.dex */
public final class zznl {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i = zzli.zzd;
        zzli.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        return z ? R2.styleable.AlertDialog_showTitle : R2.styleable.AnimatedStateListDrawableCompat_android_variablePadding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
