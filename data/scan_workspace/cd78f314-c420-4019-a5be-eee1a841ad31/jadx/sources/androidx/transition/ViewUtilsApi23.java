package androidx.transition;

import android.view.View;

/* loaded from: classes12.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    /* loaded from: classes12.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static void setTransitionVisibility(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setTransitionVisibility(View view, int i) {
        if (sTryHiddenSetTransitionVisibility) {
            try {
                Api29Impl.setTransitionVisibility(view, i);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }
}
