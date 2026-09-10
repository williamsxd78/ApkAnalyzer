package com.tealium.core.persistence;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tealium.core.persistence.i0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H&J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0002\u0010\rJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H&J\b\u0010\u0016\u001a\u00020\u0005H&J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0002\u0010\rJ\u0015\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0002\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/tealium/core/persistence/KeyValueDao;", "K", "T", "", "clear", "", "contains", "", i0.a.b, "(Ljava/lang/Object;)Z", "count", "", "delete", "(Ljava/lang/Object;)V", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getAll", "", "insert", "item", UserMetadata.KEYDATA_FILENAME, "", "purgeExpired", "update", "upsert", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface KeyValueDao<K, T> {
    void clear();

    boolean contains(K key);

    int count();

    void delete(K key);

    T get(K key);

    Map<K, T> getAll();

    void insert(T item);

    List<K> keys();

    void purgeExpired();

    void update(T item);

    void upsert(T item);
}
