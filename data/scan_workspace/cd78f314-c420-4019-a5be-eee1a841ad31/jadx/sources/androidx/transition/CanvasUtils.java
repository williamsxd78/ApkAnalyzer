package androidx.transition;

import android.graphics.Canvas;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
class CanvasUtils {
    private static Method sInorderBarrierMethod;
    private static boolean sOrderMethodsFetched;
    private static Method sReorderBarrierMethod;

    /* loaded from: classes12.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static void disableZ(Canvas canvas) {
            canvas.disableZ();
        }

        static void enableZ(Canvas canvas) {
            canvas.enableZ();
        }
    }

    private CanvasUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void enableZ(Canvas canvas, boolean z) {
        if (z) {
            Api29Impl.enableZ(canvas);
        } else {
            Api29Impl.disableZ(canvas);
        }
    }
}
