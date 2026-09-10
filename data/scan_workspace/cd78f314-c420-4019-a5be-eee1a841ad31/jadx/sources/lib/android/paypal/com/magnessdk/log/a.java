package lib.android.paypal.com.magnessdk.log;

import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public final class a {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private static final String e = "****MAGNES DEBUGGING MESSAGE****";
    private static boolean f = Boolean.valueOf(System.getProperty("magnes.debug.mode", Boolean.FALSE.toString())).booleanValue();

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: lib.android.paypal.com.magnessdk.log.a$a, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    @interface InterfaceC0452a {
    }

    private a() {
    }

    public static void a(Class<?> cls, int i, String str) {
        boolean z = f;
        if (z) {
            if (i == 0) {
                Log.d(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            if (i == 1) {
                Log.i(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            if (i == 2) {
                Log.w(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            if (i == 3 && z) {
                Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
            }
        }
    }

    public static void a(Class<?> cls, int i, Throwable th) {
        boolean z = f;
        if (z) {
            if (i == 0) {
                Log.d(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
                return;
            }
            if (i == 1) {
                Log.i(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
                return;
            }
            if (i == 2) {
                Log.w(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
                return;
            }
            if (i == 3 && z) {
                Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
            }
        }
    }
}
