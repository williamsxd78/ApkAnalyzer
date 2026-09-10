package com.vivaaerobus.app.database.entities.booking;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FareEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Js\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/vivaaerobus/app/database/entities/booking/FareEntity;", "", i0.a.COLUMN_KEY, "", "fareType", "fareTypeName", "bundleType", "bundleTypeName", "fareCode", "classOfService", "upsellTo", "bundleUpsellTo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getFareType", "getFareTypeName", "getBundleType", "getBundleTypeName", "getFareCode", "getClassOfService", "getUpsellTo", "getBundleUpsellTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FareEntity {
    private final String bundleType;
    private final String bundleTypeName;
    private final String bundleUpsellTo;
    private final String classOfService;
    private final String fareCode;
    private final String fareType;
    private final String fareTypeName;
    private final String key;
    private final String upsellTo;

    public FareEntity(String str, String fareType, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(fareType, "fareType");
        this.key = str;
        this.fareType = fareType;
        this.fareTypeName = str2;
        this.bundleType = str3;
        this.bundleTypeName = str4;
        this.fareCode = str5;
        this.classOfService = str6;
        this.upsellTo = str7;
        this.bundleUpsellTo = str8;
    }

    public static /* synthetic */ FareEntity copy$default(FareEntity fareEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fareEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = fareEntity.fareType;
        }
        if ((i & 4) != 0) {
            str3 = fareEntity.fareTypeName;
        }
        if ((i & 8) != 0) {
            str4 = fareEntity.bundleType;
        }
        if ((i & 16) != 0) {
            str5 = fareEntity.bundleTypeName;
        }
        if ((i & 32) != 0) {
            str6 = fareEntity.fareCode;
        }
        if ((i & 64) != 0) {
            str7 = fareEntity.classOfService;
        }
        if ((i & 128) != 0) {
            str8 = fareEntity.upsellTo;
        }
        if ((i & 256) != 0) {
            str9 = fareEntity.bundleUpsellTo;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return fareEntity.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFareType() {
        return this.fareType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFareTypeName() {
        return this.fareTypeName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBundleType() {
        return this.bundleType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBundleTypeName() {
        return this.bundleTypeName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFareCode() {
        return this.fareCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getClassOfService() {
        return this.classOfService;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUpsellTo() {
        return this.upsellTo;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBundleUpsellTo() {
        return this.bundleUpsellTo;
    }

    public final FareEntity copy(String key, String fareType, String fareTypeName, String bundleType, String bundleTypeName, String fareCode, String classOfService, String upsellTo, String bundleUpsellTo) {
        Intrinsics.checkNotNullParameter(fareType, "fareType");
        return new FareEntity(key, fareType, fareTypeName, bundleType, bundleTypeName, fareCode, classOfService, upsellTo, bundleUpsellTo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FareEntity)) {
            return false;
        }
        FareEntity fareEntity = (FareEntity) other;
        return Intrinsics.areEqual(this.key, fareEntity.key) && Intrinsics.areEqual(this.fareType, fareEntity.fareType) && Intrinsics.areEqual(this.fareTypeName, fareEntity.fareTypeName) && Intrinsics.areEqual(this.bundleType, fareEntity.bundleType) && Intrinsics.areEqual(this.bundleTypeName, fareEntity.bundleTypeName) && Intrinsics.areEqual(this.fareCode, fareEntity.fareCode) && Intrinsics.areEqual(this.classOfService, fareEntity.classOfService) && Intrinsics.areEqual(this.upsellTo, fareEntity.upsellTo) && Intrinsics.areEqual(this.bundleUpsellTo, fareEntity.bundleUpsellTo);
    }

    public final String getBundleType() {
        return this.bundleType;
    }

    public final String getBundleTypeName() {
        return this.bundleTypeName;
    }

    public final String getBundleUpsellTo() {
        return this.bundleUpsellTo;
    }

    public final String getClassOfService() {
        return this.classOfService;
    }

    public final String getFareCode() {
        return this.fareCode;
    }

    public final String getFareType() {
        return this.fareType;
    }

    public final String getFareTypeName() {
        return this.fareTypeName;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getUpsellTo() {
        return this.upsellTo;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.fareType.hashCode()) * 31;
        String str2 = this.fareTypeName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bundleType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bundleTypeName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fareCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.classOfService;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.upsellTo;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bundleUpsellTo;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "FareEntity(key=" + this.key + ", fareType=" + this.fareType + ", fareTypeName=" + this.fareTypeName + ", bundleType=" + this.bundleType + ", bundleTypeName=" + this.bundleTypeName + ", fareCode=" + this.fareCode + ", classOfService=" + this.classOfService + ", upsellTo=" + this.upsellTo + ", bundleUpsellTo=" + this.bundleUpsellTo + ")";
    }
}
