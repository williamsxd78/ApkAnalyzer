package io.reactivex.rxjava3.core;

@FunctionalInterface
/* loaded from: classes5.dex */
public interface MaybeSource<T> {
    void subscribe(MaybeObserver<? super T> maybeObserver);
}
