package androidx.core.view;

import android.view.ViewTreeObserver;

/* loaded from: classes12.dex */
public final class ViewTreeObserverCompat {
    static final ViewTreeObserverCompatBaseImpl IMPL = new ViewTreeObserverCompatApi16Impl();

    /* loaded from: classes12.dex */
    static class ViewTreeObserverCompatApi16Impl extends ViewTreeObserverCompatBaseImpl {
        ViewTreeObserverCompatApi16Impl() {
        }

        @Override // androidx.core.view.ViewTreeObserverCompat.ViewTreeObserverCompatBaseImpl
        public void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* loaded from: classes12.dex */
    static class ViewTreeObserverCompatBaseImpl {
        ViewTreeObserverCompatBaseImpl() {
        }

        public void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    private ViewTreeObserverCompat() {
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        IMPL.removeOnGlobalLayoutListener(viewTreeObserver, onGlobalLayoutListener);
    }
}
