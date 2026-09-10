package com.vivaaerobus.app.database.entities;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.database.entities.insuranceDetails.InsuranceBenefitsEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TravelChargesEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006&"}, d2 = {"Lcom/vivaaerobus/app/database/entities/TravelChargesEntity;", "", "id", "", "journeyKey", "bookingId", "segmentKey", "passengerKey", "code", "name", InsuranceBenefitsEntity.IS_INCLUDED, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getJourneyKey", "getBookingId", "getSegmentKey", "getPassengerKey", "getCode", "getName", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "Companion", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelChargesEntity {
    public static final String TABLE_NAME = "travelChargers";
    private final String bookingId;
    private final String code;
    private final String id;
    private final boolean isIncluded;
    private final String journeyKey;
    private final String name;
    private final String passengerKey;
    private final String segmentKey;

    public TravelChargesEntity(String id, String journeyKey, String bookingId, String segmentKey, String passengerKey, String code, String name, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(segmentKey, "segmentKey");
        Intrinsics.checkNotNullParameter(passengerKey, "passengerKey");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.journeyKey = journeyKey;
        this.bookingId = bookingId;
        this.segmentKey = segmentKey;
        this.passengerKey = passengerKey;
        this.code = code;
        this.name = name;
        this.isIncluded = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TravelChargesEntity(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19 & 1
            if (r0 == 0) goto L11
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
        L11:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivaaerobus.app.database.entities.TravelChargesEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ TravelChargesEntity copy$default(TravelChargesEntity travelChargesEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = travelChargesEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = travelChargesEntity.journeyKey;
        }
        if ((i & 4) != 0) {
            str3 = travelChargesEntity.bookingId;
        }
        if ((i & 8) != 0) {
            str4 = travelChargesEntity.segmentKey;
        }
        if ((i & 16) != 0) {
            str5 = travelChargesEntity.passengerKey;
        }
        if ((i & 32) != 0) {
            str6 = travelChargesEntity.code;
        }
        if ((i & 64) != 0) {
            str7 = travelChargesEntity.name;
        }
        if ((i & 128) != 0) {
            z = travelChargesEntity.isIncluded;
        }
        String str8 = str7;
        boolean z2 = z;
        String str9 = str5;
        String str10 = str6;
        return travelChargesEntity.copy(str, str2, str3, str4, str9, str10, str8, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getJourneyKey() {
        return this.journeyKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSegmentKey() {
        return this.segmentKey;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPassengerKey() {
        return this.passengerKey;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsIncluded() {
        return this.isIncluded;
    }

    public final TravelChargesEntity copy(String id, String journeyKey, String bookingId, String segmentKey, String passengerKey, String code, String name, boolean isIncluded) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(segmentKey, "segmentKey");
        Intrinsics.checkNotNullParameter(passengerKey, "passengerKey");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        return new TravelChargesEntity(id, journeyKey, bookingId, segmentKey, passengerKey, code, name, isIncluded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelChargesEntity)) {
            return false;
        }
        TravelChargesEntity travelChargesEntity = (TravelChargesEntity) other;
        return Intrinsics.areEqual(this.id, travelChargesEntity.id) && Intrinsics.areEqual(this.journeyKey, travelChargesEntity.journeyKey) && Intrinsics.areEqual(this.bookingId, travelChargesEntity.bookingId) && Intrinsics.areEqual(this.segmentKey, travelChargesEntity.segmentKey) && Intrinsics.areEqual(this.passengerKey, travelChargesEntity.passengerKey) && Intrinsics.areEqual(this.code, travelChargesEntity.code) && Intrinsics.areEqual(this.name, travelChargesEntity.name) && this.isIncluded == travelChargesEntity.isIncluded;
    }

    public final String getBookingId() {
        return this.bookingId;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.id;
    }

    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPassengerKey() {
        return this.passengerKey;
    }

    public final String getSegmentKey() {
        return this.segmentKey;
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.journeyKey.hashCode()) * 31) + this.bookingId.hashCode()) * 31) + this.segmentKey.hashCode()) * 31) + this.passengerKey.hashCode()) * 31) + this.code.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isIncluded);
    }

    public final boolean isIncluded() {
        return this.isIncluded;
    }

    public String toString() {
        return "TravelChargesEntity(id=" + this.id + ", journeyKey=" + this.journeyKey + ", bookingId=" + this.bookingId + ", segmentKey=" + this.segmentKey + ", passengerKey=" + this.passengerKey + ", code=" + this.code + ", name=" + this.name + ", isIncluded=" + this.isIncluded + ")";
    }
}
