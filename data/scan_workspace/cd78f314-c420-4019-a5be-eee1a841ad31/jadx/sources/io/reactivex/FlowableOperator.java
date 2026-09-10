package io.reactivex;

import org.reactivestreams.Subscriber;

/* loaded from: classes6.dex */
public interface FlowableOperator<Downstream, Upstream> {
    Subscriber<? super Upstream> apply(Subscriber<? super Downstream> subscriber) throws Exception;
}
