package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class LimitedConcurrencyExecutor implements Executor {
    private final Executor delegate;
    private final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
    private final Semaphore semaphore;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LimitedConcurrencyExecutor(Executor executor, int i) {
        Preconditions.checkArgument(i > 0, "concurrency must be positive.");
        this.delegate = executor;
        this.semaphore = new Semaphore(i, true);
    }

    private Runnable decorate(final Runnable runnable) {
        return new Runnable() { // from class: com.google.firebase.concurrent.LimitedConcurrencyExecutor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LimitedConcurrencyExecutor.this.m10929x96c64136(runnable);
            }
        };
    }

    private void maybeEnqueueNext() {
        while (this.semaphore.tryAcquire()) {
            Runnable poll = this.queue.poll();
            if (poll == null) {
                this.semaphore.release();
                return;
            }
            this.delegate.execute(decorate(poll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$decorate$0$com-google-firebase-concurrent-LimitedConcurrencyExecutor, reason: not valid java name */
    public /* synthetic */ void m10929x96c64136(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.semaphore.release();
            maybeEnqueueNext();
        }
    }
}
