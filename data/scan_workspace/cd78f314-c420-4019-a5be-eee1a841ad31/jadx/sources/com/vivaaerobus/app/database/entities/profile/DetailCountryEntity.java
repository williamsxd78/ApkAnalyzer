package com.vivaaerobus.app.database.entities.profile;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailCountryEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/database/entities/profile/DetailCountryEntity;", "", "country", "", "isEditable", "", "<init>", "(Ljava/lang/String;Z)V", "getCountry", "()Ljava/lang/String;", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetailCountryEntity {
    private final String country;
    private final boolean isEditable;

    public DetailCountryEntity(String str, boolean z) {
        this.country = str;
        this.isEditable = z;
    }

    public static /* synthetic */ DetailCountryEntity copy$default(DetailCountryEntity detailCountryEntity, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailCountryEntity.country;
        }
        if ((i & 2) != 0) {
            z = detailCountryEntity.isEditable;
        }
        return detailCountryEntity.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    public final DetailCountryEntity copy(String country, boolean isEditable) {
        return new DetailCountryEntity(country, isEditable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailCountryEntity)) {
            return false;
        }
        DetailCountryEntity detailCountryEntity = (DetailCountryEntity) other;
        return Intrinsics.areEqual(this.country, detailCountryEntity.country) && this.isEditable == detailCountryEntity.isEditable;
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        String str = this.country;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isEditable);
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public String toString() {
        return "DetailCountryEntity(country=" + this.country + ", isEditable=" + this.isEditable + ")";
    }
}
