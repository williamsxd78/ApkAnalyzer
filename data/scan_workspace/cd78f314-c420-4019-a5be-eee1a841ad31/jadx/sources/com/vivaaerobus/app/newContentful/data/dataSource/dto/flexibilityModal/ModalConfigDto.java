package com.vivaaerobus.app.newContentful.data.dataSource.dto.flexibilityModal;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlexibilityModalConfigDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/newContentful/data/dataSource/dto/flexibilityModal/ModalConfigDto;", "", "title", "", "subtitle", "description", "footerLegal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDescription", "getFooterLegal", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ModalConfigDto {

    @SerializedName("description")
    private final String description;

    @SerializedName("footerLegal")
    private final String footerLegal;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    public ModalConfigDto(String title, String subtitle, String description, String footerLegal) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(footerLegal, "footerLegal");
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.footerLegal = footerLegal;
    }

    public static /* synthetic */ ModalConfigDto copy$default(ModalConfigDto modalConfigDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modalConfigDto.title;
        }
        if ((i & 2) != 0) {
            str2 = modalConfigDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = modalConfigDto.description;
        }
        if ((i & 8) != 0) {
            str4 = modalConfigDto.footerLegal;
        }
        return modalConfigDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFooterLegal() {
        return this.footerLegal;
    }

    public final ModalConfigDto copy(String title, String subtitle, String description, String footerLegal) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(footerLegal, "footerLegal");
        return new ModalConfigDto(title, subtitle, description, footerLegal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalConfigDto)) {
            return false;
        }
        ModalConfigDto modalConfigDto = (ModalConfigDto) other;
        return Intrinsics.areEqual(this.title, modalConfigDto.title) && Intrinsics.areEqual(this.subtitle, modalConfigDto.subtitle) && Intrinsics.areEqual(this.description, modalConfigDto.description) && Intrinsics.areEqual(this.footerLegal, modalConfigDto.footerLegal);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFooterLegal() {
        return this.footerLegal;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.footerLegal.hashCode();
    }

    public String toString() {
        return "ModalConfigDto(title=" + this.title + ", subtitle=" + this.subtitle + ", description=" + this.description + ", footerLegal=" + this.footerLegal + ")";
    }
}
