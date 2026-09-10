package com.vivaaerobus.app.contentful.domain.assetCache;

import kotlin.Metadata;

/* compiled from: ContentfulAssetImageConfig.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vivaaerobus/app/contentful/domain/assetCache/ContentfulAssetImageConfig;", "", "<init>", "()V", "DEFAULT_FORMAT", "", "DEFAULT_QUALITY", "", "THUMBNAIL_WIDTH", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentfulAssetImageConfig {
    public static final String DEFAULT_FORMAT = "webp";
    public static final int DEFAULT_QUALITY = 75;
    public static final ContentfulAssetImageConfig INSTANCE = new ContentfulAssetImageConfig();
    public static final int THUMBNAIL_WIDTH = 400;

    private ContentfulAssetImageConfig() {
    }
}
