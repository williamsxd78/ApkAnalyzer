package io.reactivex.rxjava3.core;

@FunctionalInterface
/* loaded from: classes5.dex */
public interface MaybeOnSubscribe<T> {
    void subscribe(MaybeEmitter<T> maybeEmitter) throws Throwable;
}
