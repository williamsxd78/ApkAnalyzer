package com.vivaaerobus.app.newContentful.data.dataSource.remote.apollo.utils;

import com.apollographql.apollo3.cache.normalized.FetchPolicy;
import kotlin.Metadata;

/* compiled from: PolicyUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"setPolicy", "Lcom/apollographql/apollo3/cache/normalized/FetchPolicy;", "withNetworkConnection", "", "newContentful_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PolicyUtilsKt {
    public static final FetchPolicy setPolicy(boolean z) {
        return z ? FetchPolicy.NetworkFirst : FetchPolicy.CacheFirst;
    }
}
