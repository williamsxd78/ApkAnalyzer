package com.tealium.core.persistence;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003J\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H&¢\u0006\u0002\u0010\fJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH&¨\u0006\u0010"}, d2 = {"Lcom/tealium/core/persistence/QueueingDao;", "K", "T", "Lcom/tealium/core/persistence/KeyValueDao;", "dequeue", "()Ljava/lang/Object;", "", "count", "", "enqueue", "", "item", "(Ljava/lang/Object;)V", "items", "resize", "size", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface QueueingDao<K, T> extends KeyValueDao<K, T> {
    T dequeue();

    List<T> dequeue(int count);

    void enqueue(T item);

    void enqueue(List<? extends T> items);

    void resize(int size);
}
