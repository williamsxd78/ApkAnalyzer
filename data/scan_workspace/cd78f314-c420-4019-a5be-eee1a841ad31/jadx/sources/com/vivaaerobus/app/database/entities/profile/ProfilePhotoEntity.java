package com.vivaaerobus.app.database.entities.profile;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfilePhotoEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/database/entities/profile/ProfilePhotoEntity;", "", "large", "", "medium", "small", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "getMedium", "getSmall", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProfilePhotoEntity {
    private final String large;
    private final String medium;
    private final String small;

    public ProfilePhotoEntity(String str, String str2, String str3) {
        this.large = str;
        this.medium = str2;
        this.small = str3;
    }

    public static /* synthetic */ ProfilePhotoEntity copy$default(ProfilePhotoEntity profilePhotoEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profilePhotoEntity.large;
        }
        if ((i & 2) != 0) {
            str2 = profilePhotoEntity.medium;
        }
        if ((i & 4) != 0) {
            str3 = profilePhotoEntity.small;
        }
        return profilePhotoEntity.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLarge() {
        return this.large;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMedium() {
        return this.medium;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSmall() {
        return this.small;
    }

    public final ProfilePhotoEntity copy(String large, String medium, String small) {
        return new ProfilePhotoEntity(large, medium, small);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfilePhotoEntity)) {
            return false;
        }
        ProfilePhotoEntity profilePhotoEntity = (ProfilePhotoEntity) other;
        return Intrinsics.areEqual(this.large, profilePhotoEntity.large) && Intrinsics.areEqual(this.medium, profilePhotoEntity.medium) && Intrinsics.areEqual(this.small, profilePhotoEntity.small);
    }

    public final String getLarge() {
        return this.large;
    }

    public final String getMedium() {
        return this.medium;
    }

    public final String getSmall() {
        return this.small;
    }

    public int hashCode() {
        String str = this.large;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.medium;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.small;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ProfilePhotoEntity(large=" + this.large + ", medium=" + this.medium + ", small=" + this.small + ")";
    }
}
