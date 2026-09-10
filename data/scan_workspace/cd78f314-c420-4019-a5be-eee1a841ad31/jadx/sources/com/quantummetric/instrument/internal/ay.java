package com.quantummetric.instrument.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.quantummetric.instrument.internal.hm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class ay {
    private static Handler c;
    private static final ExecutorService a = Executors.newFixedThreadPool(6);
    private static final ExecutorService b = Executors.newSingleThreadExecutor();
    private static final Handler d = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        private final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.a.run();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(a aVar) {
        d.removeCallbacks(aVar);
    }

    public static void a(hm.a aVar) {
        b.execute(aVar);
    }

    public static void a(Runnable runnable) {
        a.execute(new a(runnable));
    }

    public static void a(Runnable runnable, int i) {
        if (c == null) {
            HandlerThread handlerThread = new HandlerThread("HandlerThread");
            handlerThread.start();
            c = new Handler(handlerThread.getLooper());
        }
        c.postDelayed(new a(runnable), i);
    }

    public static boolean a() {
        return Thread.currentThread().getName().equals("main");
    }

    public static a b(Runnable runnable, int i) {
        a aVar = new a(runnable);
        d.postDelayed(aVar, i);
        return aVar;
    }

    public static void b(Runnable runnable) {
        if (c == null) {
            HandlerThread handlerThread = new HandlerThread("HandlerThread");
            handlerThread.start();
            c = new Handler(handlerThread.getLooper());
        }
        c.post(new a(runnable));
    }

    public static void c(Runnable runnable) {
        d.post(new a(runnable));
    }
}
