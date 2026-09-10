package com.inmobile.sse.utilities;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tealium.core.persistence.i0;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0001\u0017J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0011\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0010H&R$\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/inmobile/sse/utilities/MultiMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "Lcom/inmobile/sse/utilities/MultiMap$Entry;", "getEntries", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "getKeys", "size", "", "getSize", "()I", "containsKey", "", i0.a.b, "(Ljava/lang/Object;)Z", "get", "", "(Ljava/lang/Object;)Ljava/util/List;", "isEmpty", "Entry", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface MultiMap<K, V> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0006\b\u0003\u0010\u0002 \u00012\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/inmobile/sse/utilities/MultiMap$Entry;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", i0.a.b, "getKey", "()Ljava/lang/Object;", "values", "", "getValues", "()Ljava/util/List;", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Entry<K, V> {
        K getKey();

        List<V> getValues();
    }

    boolean containsKey(K key);

    List<V> get(K key);

    Set<Entry<K, V>> getEntries();

    Set<K> getKeys();

    int getSize();

    boolean isEmpty();
}
