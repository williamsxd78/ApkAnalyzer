package com.vivaaerobus.app.checkIn.presentation.upsellPopUp.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpsellExtrasResources.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/checkIn/presentation/upsellPopUp/model/UpsellExtrasResources;", "", "headerImageTag", "", "titleTag", "subtitleTag", "continueButonTextTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeaderImageTag", "()Ljava/lang/String;", "getTitleTag", "getSubtitleTag", "getContinueButonTextTag", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "checkIn_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpsellExtrasResources {
    public static final int $stable = 0;
    private final String continueButonTextTag;
    private final String headerImageTag;
    private final String subtitleTag;
    private final String titleTag;

    public UpsellExtrasResources(String headerImageTag, String titleTag, String subtitleTag, String continueButonTextTag) {
        Intrinsics.checkNotNullParameter(headerImageTag, "headerImageTag");
        Intrinsics.checkNotNullParameter(titleTag, "titleTag");
        Intrinsics.checkNotNullParameter(subtitleTag, "subtitleTag");
        Intrinsics.checkNotNullParameter(continueButonTextTag, "continueButonTextTag");
        this.headerImageTag = headerImageTag;
        this.titleTag = titleTag;
        this.subtitleTag = subtitleTag;
        this.continueButonTextTag = continueButonTextTag;
    }

    public static /* synthetic */ UpsellExtrasResources copy$default(UpsellExtrasResources upsellExtrasResources, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upsellExtrasResources.headerImageTag;
        }
        if ((i & 2) != 0) {
            str2 = upsellExtrasResources.titleTag;
        }
        if ((i & 4) != 0) {
            str3 = upsellExtrasResources.subtitleTag;
        }
        if ((i & 8) != 0) {
            str4 = upsellExtrasResources.continueButonTextTag;
        }
        return upsellExtrasResources.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeaderImageTag() {
        return this.headerImageTag;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleTag() {
        return this.titleTag;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitleTag() {
        return this.subtitleTag;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContinueButonTextTag() {
        return this.continueButonTextTag;
    }

    public final UpsellExtrasResources copy(String headerImageTag, String titleTag, String subtitleTag, String continueButonTextTag) {
        Intrinsics.checkNotNullParameter(headerImageTag, "headerImageTag");
        Intrinsics.checkNotNullParameter(titleTag, "titleTag");
        Intrinsics.checkNotNullParameter(subtitleTag, "subtitleTag");
        Intrinsics.checkNotNullParameter(continueButonTextTag, "continueButonTextTag");
        return new UpsellExtrasResources(headerImageTag, titleTag, subtitleTag, continueButonTextTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpsellExtrasResources)) {
            return false;
        }
        UpsellExtrasResources upsellExtrasResources = (UpsellExtrasResources) other;
        return Intrinsics.areEqual(this.headerImageTag, upsellExtrasResources.headerImageTag) && Intrinsics.areEqual(this.titleTag, upsellExtrasResources.titleTag) && Intrinsics.areEqual(this.subtitleTag, upsellExtrasResources.subtitleTag) && Intrinsics.areEqual(this.continueButonTextTag, upsellExtrasResources.continueButonTextTag);
    }

    public final String getContinueButonTextTag() {
        return this.continueButonTextTag;
    }

    public final String getHeaderImageTag() {
        return this.headerImageTag;
    }

    public final String getSubtitleTag() {
        return this.subtitleTag;
    }

    public final String getTitleTag() {
        return this.titleTag;
    }

    public int hashCode() {
        return (((((this.headerImageTag.hashCode() * 31) + this.titleTag.hashCode()) * 31) + this.subtitleTag.hashCode()) * 31) + this.continueButonTextTag.hashCode();
    }

    public String toString() {
        return "UpsellExtrasResources(headerImageTag=" + this.headerImageTag + ", titleTag=" + this.titleTag + ", subtitleTag=" + this.subtitleTag + ", continueButonTextTag=" + this.continueButonTextTag + ")";
    }
}
