package com.apollographql.apollo3.cache.normalized.api;

import kotlin.Metadata;

/* compiled from: ApolloCacheHeaders.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/apollographql/apollo3/cache/normalized/api/ApolloCacheHeaders;", "", "()V", "DATE", "", "getDATE$annotations", "DO_NOT_STORE", "EVICT_AFTER_READ", "MAX_STALE", "getMAX_STALE$annotations", "apollo-normalized-cache-api-incubating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApolloCacheHeaders {
    public static final String DATE = "apollo-date";
    public static final String DO_NOT_STORE = "do-not-store";
    public static final String EVICT_AFTER_READ = "evict-after-read";
    public static final ApolloCacheHeaders INSTANCE = new ApolloCacheHeaders();
    public static final String MAX_STALE = "apollo-max-stale";

    private ApolloCacheHeaders() {
    }

    public static /* synthetic */ void getDATE$annotations() {
    }

    public static /* synthetic */ void getMAX_STALE$annotations() {
    }
}
