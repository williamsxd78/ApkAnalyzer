package com.vivaaerobus.app.contentful.data.assetCache;

import com.vivaaerobus.app.database.entities.contentfulAssetCache.ContentfulAssetCacheEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DownloadAssetResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/vivaaerobus/app/contentful/data/assetCache/DownloadAssetResult;", "", "<init>", "()V", ContentfulAssetCacheEntity.ETAG, "", "getEtag", "()Ljava/lang/String;", "lastModifiedMillis", "", "getLastModifiedMillis", "()Ljava/lang/Long;", "Lcom/vivaaerobus/app/contentful/data/assetCache/DownloadedAssetResult;", "Lcom/vivaaerobus/app/contentful/data/assetCache/NotModifiedAssetResult;", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DownloadAssetResult {
    private DownloadAssetResult() {
    }

    public /* synthetic */ DownloadAssetResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getEtag();

    public abstract Long getLastModifiedMillis();
}
