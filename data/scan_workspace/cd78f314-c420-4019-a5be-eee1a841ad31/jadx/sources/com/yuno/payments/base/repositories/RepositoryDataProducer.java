package com.yuno.payments.base.repositories;

import kotlin.Metadata;

/* compiled from: BaseRepository.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yuno/payments/base/repositories/RepositoryDataProducer;", "T", "", "clear", "", "set", "data", "(Ljava/lang/Object;)V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RepositoryDataProducer<T> {
    void clear();

    void set(T data);
}
