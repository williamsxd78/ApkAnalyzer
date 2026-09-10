package io.reactivex.rxjava3.core;

@FunctionalInterface
/* loaded from: classes5.dex */
public interface SingleSource<T> {
    void subscribe(SingleObserver<? super T> singleObserver);
}
