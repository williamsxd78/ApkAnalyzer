package androidx.core.app;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes11.dex */
public class DialogCompat {

    /* loaded from: classes11.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(Dialog dialog, int i) {
            return (T) dialog.requireViewById(i);
        }
    }

    private DialogCompat() {
    }

    public static View requireViewById(Dialog dialog, int i) {
        return (View) Api28Impl.requireViewById(dialog, i);
    }
}
