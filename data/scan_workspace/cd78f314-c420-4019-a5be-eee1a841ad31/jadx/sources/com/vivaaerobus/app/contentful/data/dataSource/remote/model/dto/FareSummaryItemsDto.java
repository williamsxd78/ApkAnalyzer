package com.vivaaerobus.app.contentful.data.dataSource.remote.model.dto;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FareSummaryItemsDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/contentful/data/dataSource/remote/model/dto/FareSummaryItemsDto;", "", "icon", "", "text", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getText", "getType", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FareSummaryItemsDto {
    private final String icon;
    private final String text;
    private final String type;

    public FareSummaryItemsDto(String icon, String text, String type) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        this.icon = icon;
        this.text = text;
        this.type = type;
    }

    public static /* synthetic */ FareSummaryItemsDto copy$default(FareSummaryItemsDto fareSummaryItemsDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fareSummaryItemsDto.icon;
        }
        if ((i & 2) != 0) {
            str2 = fareSummaryItemsDto.text;
        }
        if ((i & 4) != 0) {
            str3 = fareSummaryItemsDto.type;
        }
        return fareSummaryItemsDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final FareSummaryItemsDto copy(String icon, String text, String type) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FareSummaryItemsDto(icon, text, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FareSummaryItemsDto)) {
            return false;
        }
        FareSummaryItemsDto fareSummaryItemsDto = (FareSummaryItemsDto) other;
        return Intrinsics.areEqual(this.icon, fareSummaryItemsDto.icon) && Intrinsics.areEqual(this.text, fareSummaryItemsDto.text) && Intrinsics.areEqual(this.type, fareSummaryItemsDto.type);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.text.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "FareSummaryItemsDto(icon=" + this.icon + ", text=" + this.text + ", type=" + this.type + ")";
    }
}
