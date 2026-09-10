package com.apollographql.apollo3.cache.normalized;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClientCacheExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo3/cache/normalized/FetchPolicy;", "", "(Ljava/lang/String;I)V", "CacheFirst", "CacheOnly", "NetworkFirst", "NetworkOnly", "CacheAndNetwork", "apollo-normalized-cache-incubating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FetchPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FetchPolicy[] $VALUES;
    public static final FetchPolicy CacheFirst = new FetchPolicy("CacheFirst", 0);
    public static final FetchPolicy CacheOnly = new FetchPolicy("CacheOnly", 1);
    public static final FetchPolicy NetworkFirst = new FetchPolicy("NetworkFirst", 2);
    public static final FetchPolicy NetworkOnly = new FetchPolicy("NetworkOnly", 3);
    public static final FetchPolicy CacheAndNetwork = new FetchPolicy("CacheAndNetwork", 4);

    private static final /* synthetic */ FetchPolicy[] $values() {
        return new FetchPolicy[]{CacheFirst, CacheOnly, NetworkFirst, NetworkOnly, CacheAndNetwork};
    }

    static {
        FetchPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FetchPolicy(String str, int i) {
    }

    public static EnumEntries<FetchPolicy> getEntries() {
        return $ENTRIES;
    }

    public static FetchPolicy valueOf(String str) {
        return (FetchPolicy) Enum.valueOf(FetchPolicy.class, str);
    }

    public static FetchPolicy[] values() {
        return (FetchPolicy[]) $VALUES.clone();
    }
}
