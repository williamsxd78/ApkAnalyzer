package j$.util.concurrent;

/* loaded from: classes8.dex */
public interface Flow$Subscriber<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(Flow$Subscription flow$Subscription);
}
