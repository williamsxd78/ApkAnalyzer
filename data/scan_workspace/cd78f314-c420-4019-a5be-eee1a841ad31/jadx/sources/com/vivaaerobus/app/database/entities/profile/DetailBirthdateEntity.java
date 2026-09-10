package com.vivaaerobus.app.database.entities.profile;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailBirthdateEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/database/entities/profile/DetailBirthdateEntity;", "", "date", "", "isEditable", "", "<init>", "(Ljava/lang/String;Z)V", "getDate", "()Ljava/lang/String;", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetailBirthdateEntity {
    private final String date;
    private final boolean isEditable;

    public DetailBirthdateEntity(String str, boolean z) {
        this.date = str;
        this.isEditable = z;
    }

    public static /* synthetic */ DetailBirthdateEntity copy$default(DetailBirthdateEntity detailBirthdateEntity, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailBirthdateEntity.date;
        }
        if ((i & 2) != 0) {
            z = detailBirthdateEntity.isEditable;
        }
        return detailBirthdateEntity.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    public final DetailBirthdateEntity copy(String date, boolean isEditable) {
        return new DetailBirthdateEntity(date, isEditable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailBirthdateEntity)) {
            return false;
        }
        DetailBirthdateEntity detailBirthdateEntity = (DetailBirthdateEntity) other;
        return Intrinsics.areEqual(this.date, detailBirthdateEntity.date) && this.isEditable == detailBirthdateEntity.isEditable;
    }

    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        String str = this.date;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isEditable);
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public String toString() {
        return "DetailBirthdateEntity(date=" + this.date + ", isEditable=" + this.isEditable + ")";
    }
}
