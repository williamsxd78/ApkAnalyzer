package androidx.core.database;

import android.database.CursorWindow;

/* loaded from: classes11.dex */
public final class CursorWindowCompat {

    /* loaded from: classes11.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static CursorWindow createCursorWindow(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j) {
        return Api28Impl.createCursorWindow(str, j);
    }
}
