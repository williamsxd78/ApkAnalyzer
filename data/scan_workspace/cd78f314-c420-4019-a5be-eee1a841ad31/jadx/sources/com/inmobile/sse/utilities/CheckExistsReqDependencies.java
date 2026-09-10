package com.inmobile.sse.utilities;

import android.util.Log;
import com.inmobile.ErrorConstants;
import com.inmobile.InMobileException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/inmobile/sse/utilities/CheckExistsReqDependencies;", "", "()V", "Ы042BЫЫ042B042B042B", "", "checkSDKDependencies", "", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckExistsReqDependencies {
    public static final CheckExistsReqDependencies INSTANCE = new CheckExistsReqDependencies();
    private static final String Ы042BЫЫ042B042B042B;

    /* renamed from: Ѻ047A047AѺѺѺ047A, reason: contains not printable characters */
    public static int f2806047A047A047A = 1;

    /* renamed from: Ѻ047AѺѺѺѺ047A, reason: contains not printable characters */
    public static int f2807047A047A = 75;

    /* renamed from: ѺѺ047AѺѺѺ047A, reason: contains not printable characters */
    public static int f2808047A047A = 0;

    /* renamed from: ѺѺѺ047AѺѺ047A, reason: contains not printable characters */
    public static int f2809047A047A = 2;

    static {
        int i = f2807047A047A;
        if (((f2806047A047A047A + i) * i) % f2809047A047A != f2808047A047A) {
            f2807047A047A = m13588047A047A047A();
            f2808047A047A = m13588047A047A047A();
        }
        Ы042BЫЫ042B042B042B = "CheckDependencies";
    }

    private CheckExistsReqDependencies() {
    }

    /* renamed from: Ѻ047AѺ047AѺѺ047A, reason: contains not printable characters */
    public static int m13588047A047A047A() {
        return 44;
    }

    public final void checkSDKDependencies() {
        try {
            Class.forName("androidx.biometric.BiometricPrompt");
            try {
                Class.forName("okhttp3.OkHttpClient");
                try {
                    Class.forName("com.google.gson.annotations.SerializedName");
                } catch (Exception e) {
                    String str = Ы042BЫЫ042B042B042B;
                    int i = f2807047A047A;
                    if ((i * (f2806047A047A047A + i)) % f2809047A047A != 0) {
                        f2807047A047A = 21;
                        f2808047A047A = 71;
                    }
                    Log.e(str, ErrorConstants.E9005_CAUSE, e);
                    throw new InMobileException("MISSING_DEPENDENCY_GSON", ErrorConstants.E9005, ErrorConstants.E9005_CAUSE);
                }
            } catch (Exception e2) {
                Log.e(Ы042BЫЫ042B042B042B, ErrorConstants.E9008_CAUSE, e2);
                throw new InMobileException("MISSING_DEPENDENCY_OKHTTP", ErrorConstants.E9008, ErrorConstants.E9008_CAUSE);
            }
        } catch (Exception e3) {
            Log.e(Ы042BЫЫ042B042B042B, ErrorConstants.E9002_CAUSE, e3);
            throw new InMobileException("MISSING_DEPENDENCY_BIOMETRICS", "9002", ErrorConstants.E9002_CAUSE);
        }
    }
}
