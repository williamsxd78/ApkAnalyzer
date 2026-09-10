package androidx.work;

/* loaded from: classes12.dex */
public interface RunnableScheduler {
    void cancel(Runnable runnable);

    void scheduleWithDelay(long j, Runnable runnable);
}
