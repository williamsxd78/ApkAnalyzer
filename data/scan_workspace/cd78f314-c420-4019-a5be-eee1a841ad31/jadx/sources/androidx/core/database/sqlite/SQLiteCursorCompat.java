package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;

/* loaded from: classes11.dex */
public final class SQLiteCursorCompat {

    /* loaded from: classes11.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static void setFillWindowForwardOnly(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    private SQLiteCursorCompat() {
    }

    public static void setFillWindowForwardOnly(SQLiteCursor sQLiteCursor, boolean z) {
        Api28Impl.setFillWindowForwardOnly(sQLiteCursor, z);
    }
}
