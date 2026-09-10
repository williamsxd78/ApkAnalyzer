package com.inmobile.sse.utilities;

import androidx.exifinterface.media.ExifInterface;
import com.tealium.core.persistence.i0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH&¢\u0006\u0002\u0010\fJ\u001c\u0010\t\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H&J\b\u0010\u000e\u001a\u00020\u0005H&J\u001d\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0011J\u001d\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/inmobile/sse/utilities/MutableMultiMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/inmobile/sse/utilities/MultiMap;", "add", "", i0.a.b, "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "addAll", "values", "", "(Ljava/lang/Object;Ljava/util/Collection;)V", "other", "clear", "remove", "", "(Ljava/lang/Object;)Ljava/util/List;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface MutableMultiMap<K, V> extends MultiMap<K, V> {
    void add(K key, V value);

    void addAll(MultiMap<K, ? extends V> other);

    void addAll(K key, Collection<? extends V> values);

    void clear();

    List<V> remove(K key);

    boolean remove(K key, V value);
}
