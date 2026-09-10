package io.reactivex.rxjava3.disposables;

import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
final class SubscriptionDisposable extends ReferenceDisposable<Subscription> {
    private static final long serialVersionUID = -707001650852963139L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriptionDisposable(Subscription subscription) {
        super(subscription);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void onDisposed(Subscription subscription) {
        subscription.cancel();
    }
}
