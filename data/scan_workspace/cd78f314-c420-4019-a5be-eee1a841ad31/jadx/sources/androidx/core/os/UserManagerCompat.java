package androidx.core.os;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes11.dex */
public class UserManagerCompat {

    /* loaded from: classes11.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isUserUnlocked(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(Context context) {
        return Api24Impl.isUserUnlocked(context);
    }
}
