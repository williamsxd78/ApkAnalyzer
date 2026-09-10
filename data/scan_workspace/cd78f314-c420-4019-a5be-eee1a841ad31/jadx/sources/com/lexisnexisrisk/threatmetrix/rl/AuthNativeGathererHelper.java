package com.lexisnexisrisk.threatmetrix.rl;

import android.content.ContentResolver;
import android.content.Context;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class AuthNativeGathererHelper {
    @Nonnull
    public native String[] attestStrongID(String str, String str2, Context context, int i);

    public boolean bIYQgQ(String str, String str2) throws UnsatisfiedLinkError {
        System.loadLibrary(str);
        return init(str2);
    }

    public native int cancel();

    public native long getTamperCode(int i);

    native boolean init(String str);

    @Nullable
    public native String sha256HexEncode(byte[] bArr);

    @Nullable
    public native byte[] sign(byte[] bArr, ContentResolver contentResolver);
}
