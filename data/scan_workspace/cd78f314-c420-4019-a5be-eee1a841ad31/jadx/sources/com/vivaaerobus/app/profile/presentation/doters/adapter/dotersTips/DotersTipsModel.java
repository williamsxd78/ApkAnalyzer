package com.vivaaerobus.app.profile.presentation.doters.adapter.dotersTips;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DotersTipsModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/profile/presentation/doters/adapter/dotersTips/DotersTipsModel;", "", "tipTitle", "", "tipBody", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTipTitle", "()Ljava/lang/String;", "getTipBody", "getImageUrl", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "profile_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DotersTipsModel {
    public static final int $stable = 0;
    private final String imageUrl;
    private final String tipBody;
    private final String tipTitle;

    public DotersTipsModel(String tipTitle, String tipBody, String imageUrl) {
        Intrinsics.checkNotNullParameter(tipTitle, "tipTitle");
        Intrinsics.checkNotNullParameter(tipBody, "tipBody");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.tipTitle = tipTitle;
        this.tipBody = tipBody;
        this.imageUrl = imageUrl;
    }

    public static /* synthetic */ DotersTipsModel copy$default(DotersTipsModel dotersTipsModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dotersTipsModel.tipTitle;
        }
        if ((i & 2) != 0) {
            str2 = dotersTipsModel.tipBody;
        }
        if ((i & 4) != 0) {
            str3 = dotersTipsModel.imageUrl;
        }
        return dotersTipsModel.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTipTitle() {
        return this.tipTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTipBody() {
        return this.tipBody;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final DotersTipsModel copy(String tipTitle, String tipBody, String imageUrl) {
        Intrinsics.checkNotNullParameter(tipTitle, "tipTitle");
        Intrinsics.checkNotNullParameter(tipBody, "tipBody");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new DotersTipsModel(tipTitle, tipBody, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DotersTipsModel)) {
            return false;
        }
        DotersTipsModel dotersTipsModel = (DotersTipsModel) other;
        return Intrinsics.areEqual(this.tipTitle, dotersTipsModel.tipTitle) && Intrinsics.areEqual(this.tipBody, dotersTipsModel.tipBody) && Intrinsics.areEqual(this.imageUrl, dotersTipsModel.imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTipBody() {
        return this.tipBody;
    }

    public final String getTipTitle() {
        return this.tipTitle;
    }

    public int hashCode() {
        return (((this.tipTitle.hashCode() * 31) + this.tipBody.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "DotersTipsModel(tipTitle=" + this.tipTitle + ", tipBody=" + this.tipBody + ", imageUrl=" + this.imageUrl + ")";
    }
}
