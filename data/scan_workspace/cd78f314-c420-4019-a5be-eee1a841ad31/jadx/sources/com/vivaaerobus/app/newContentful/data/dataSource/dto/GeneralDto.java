package com.vivaaerobus.app.newContentful.data.dataSource.dto;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeneralDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/newContentful/data/dataSource/dto/GeneralDto;", "", "logo", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLogo", "()Ljava/lang/String;", "getName", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GeneralDto {
    private final String logo;
    private final String name;

    public GeneralDto(String logo, String name) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(name, "name");
        this.logo = logo;
        this.name = name;
    }

    public static /* synthetic */ GeneralDto copy$default(GeneralDto generalDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generalDto.logo;
        }
        if ((i & 2) != 0) {
            str2 = generalDto.name;
        }
        return generalDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final GeneralDto copy(String logo, String name) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(name, "name");
        return new GeneralDto(logo, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneralDto)) {
            return false;
        }
        GeneralDto generalDto = (GeneralDto) other;
        return Intrinsics.areEqual(this.logo, generalDto.logo) && Intrinsics.areEqual(this.name, generalDto.name);
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.logo.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "GeneralDto(logo=" + this.logo + ", name=" + this.name + ")";
    }
}
