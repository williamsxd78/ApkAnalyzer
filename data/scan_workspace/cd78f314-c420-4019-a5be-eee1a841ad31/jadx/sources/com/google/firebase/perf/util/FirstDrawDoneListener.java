package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes14.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> viewReference;

    /* renamed from: com.google.firebase.perf.util.FirstDrawDoneListener$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    class AnonymousClass1 implements View.OnAttachStateChangeListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(FirstDrawDoneListener.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private FirstDrawDoneListener(View view, Runnable runnable) {
        this.viewReference = new AtomicReference<>(view);
        this.callback = runnable;
    }

    private static boolean isAliveAndAttached(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void registerForNextDraw(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new FirstDrawDoneListener(view, runnable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onDraw$0$com-google-firebase-perf-util-FirstDrawDoneListener, reason: not valid java name */
    public /* synthetic */ void m11003xe13ffe6d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.viewReference.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.FirstDrawDoneListener$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FirstDrawDoneListener.this.m11003xe13ffe6d(andSet);
            }
        });
        this.mainThreadHandler.postAtFrontOfQueue(this.callback);
    }
}
