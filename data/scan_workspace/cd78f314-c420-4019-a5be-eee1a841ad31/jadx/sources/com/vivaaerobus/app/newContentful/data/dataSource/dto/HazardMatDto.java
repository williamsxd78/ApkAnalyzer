package com.vivaaerobus.app.newContentful.data.dataSource.dto;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.newContentful.data.dataSource.remote.apollo.utils.RestrictedItemsJsonMappersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HazardMatDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/newContentful/data/dataSource/dto/HazardMatDto;", "", "icon", "", "description", RestrictedItemsJsonMappersKt.KEY_NATIONAL, "", RestrictedItemsJsonMappersKt.KEY_INTERNATIONAL, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getIcon", "()Ljava/lang/String;", "getDescription", "getNational", "()Z", "getInternational", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HazardMatDto {
    private final String description;
    private final String icon;
    private final boolean international;
    private final boolean national;

    public HazardMatDto(String icon, String description, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        this.icon = icon;
        this.description = description;
        this.national = z;
        this.international = z2;
    }

    public static /* synthetic */ HazardMatDto copy$default(HazardMatDto hazardMatDto, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hazardMatDto.icon;
        }
        if ((i & 2) != 0) {
            str2 = hazardMatDto.description;
        }
        if ((i & 4) != 0) {
            z = hazardMatDto.national;
        }
        if ((i & 8) != 0) {
            z2 = hazardMatDto.international;
        }
        return hazardMatDto.copy(str, str2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNational() {
        return this.national;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInternational() {
        return this.international;
    }

    public final HazardMatDto copy(String icon, String description, boolean national, boolean international) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        return new HazardMatDto(icon, description, national, international);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HazardMatDto)) {
            return false;
        }
        HazardMatDto hazardMatDto = (HazardMatDto) other;
        return Intrinsics.areEqual(this.icon, hazardMatDto.icon) && Intrinsics.areEqual(this.description, hazardMatDto.description) && this.national == hazardMatDto.national && this.international == hazardMatDto.international;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final boolean getInternational() {
        return this.international;
    }

    public final boolean getNational() {
        return this.national;
    }

    public int hashCode() {
        return (((((this.icon.hashCode() * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.national)) * 31) + Boolean.hashCode(this.international);
    }

    public String toString() {
        return "HazardMatDto(icon=" + this.icon + ", description=" + this.description + ", national=" + this.national + ", international=" + this.international + ")";
    }
}
