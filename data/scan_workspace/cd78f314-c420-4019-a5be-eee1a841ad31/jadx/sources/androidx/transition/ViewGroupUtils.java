package androidx.transition;

import android.view.ViewGroup;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
class ViewGroupUtils {
    private static Method sGetChildDrawingOrderMethod = null;
    private static boolean sGetChildDrawingOrderMethodFetched = false;
    private static boolean sTryHiddenSuppressLayout = true;

    /* loaded from: classes12.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static int getChildDrawingOrder(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        static void suppressLayout(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    private ViewGroupUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getChildDrawingOrder(ViewGroup viewGroup, int i) {
        return Api29Impl.getChildDrawingOrder(viewGroup, i);
    }

    private static void hiddenSuppressLayout(ViewGroup viewGroup, boolean z) {
        if (sTryHiddenSuppressLayout) {
            try {
                Api29Impl.suppressLayout(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSuppressLayout = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void suppressLayout(ViewGroup viewGroup, boolean z) {
        Api29Impl.suppressLayout(viewGroup, z);
    }
}
