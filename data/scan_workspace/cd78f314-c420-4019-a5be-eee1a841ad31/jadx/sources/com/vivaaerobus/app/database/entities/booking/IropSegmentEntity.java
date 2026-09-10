package com.vivaaerobus.app.database.entities.booking;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IropSegmentEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006&"}, d2 = {"Lcom/vivaaerobus/app/database/entities/booking/IropSegmentEntity;", "", "id", "", "journeyId", "flightNumber", "scheduledArrival", "scheduledArrivalUtc", "scheduledDeparture", "scheduledDepartureUtc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getJourneyId", "setJourneyId", "getFlightNumber", "getScheduledArrival", "getScheduledArrivalUtc", "getScheduledDeparture", "getScheduledDepartureUtc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "Companion", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IropSegmentEntity {
    public static final String TABLE_NAME = "irop_segment_entity";
    private final String flightNumber;
    private String id;
    private String journeyId;
    private final String scheduledArrival;
    private final String scheduledArrivalUtc;
    private final String scheduledDeparture;
    private final String scheduledDepartureUtc;

    public IropSegmentEntity(String id, String journeyId, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(journeyId, "journeyId");
        this.id = id;
        this.journeyId = journeyId;
        this.flightNumber = str;
        this.scheduledArrival = str2;
        this.scheduledArrivalUtc = str3;
        this.scheduledDeparture = str4;
        this.scheduledDepartureUtc = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IropSegmentEntity(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 1
            if (r0 == 0) goto L11
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
        L11:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivaaerobus.app.database.entities.booking.IropSegmentEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ IropSegmentEntity copy$default(IropSegmentEntity iropSegmentEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iropSegmentEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = iropSegmentEntity.journeyId;
        }
        if ((i & 4) != 0) {
            str3 = iropSegmentEntity.flightNumber;
        }
        if ((i & 8) != 0) {
            str4 = iropSegmentEntity.scheduledArrival;
        }
        if ((i & 16) != 0) {
            str5 = iropSegmentEntity.scheduledArrivalUtc;
        }
        if ((i & 32) != 0) {
            str6 = iropSegmentEntity.scheduledDeparture;
        }
        if ((i & 64) != 0) {
            str7 = iropSegmentEntity.scheduledDepartureUtc;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return iropSegmentEntity.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getJourneyId() {
        return this.journeyId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFlightNumber() {
        return this.flightNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScheduledArrival() {
        return this.scheduledArrival;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScheduledArrivalUtc() {
        return this.scheduledArrivalUtc;
    }

    /* renamed from: component6, reason: from getter */
    public final String getScheduledDeparture() {
        return this.scheduledDeparture;
    }

    /* renamed from: component7, reason: from getter */
    public final String getScheduledDepartureUtc() {
        return this.scheduledDepartureUtc;
    }

    public final IropSegmentEntity copy(String id, String journeyId, String flightNumber, String scheduledArrival, String scheduledArrivalUtc, String scheduledDeparture, String scheduledDepartureUtc) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(journeyId, "journeyId");
        return new IropSegmentEntity(id, journeyId, flightNumber, scheduledArrival, scheduledArrivalUtc, scheduledDeparture, scheduledDepartureUtc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IropSegmentEntity)) {
            return false;
        }
        IropSegmentEntity iropSegmentEntity = (IropSegmentEntity) other;
        return Intrinsics.areEqual(this.id, iropSegmentEntity.id) && Intrinsics.areEqual(this.journeyId, iropSegmentEntity.journeyId) && Intrinsics.areEqual(this.flightNumber, iropSegmentEntity.flightNumber) && Intrinsics.areEqual(this.scheduledArrival, iropSegmentEntity.scheduledArrival) && Intrinsics.areEqual(this.scheduledArrivalUtc, iropSegmentEntity.scheduledArrivalUtc) && Intrinsics.areEqual(this.scheduledDeparture, iropSegmentEntity.scheduledDeparture) && Intrinsics.areEqual(this.scheduledDepartureUtc, iropSegmentEntity.scheduledDepartureUtc);
    }

    public final String getFlightNumber() {
        return this.flightNumber;
    }

    public final String getId() {
        return this.id;
    }

    public final String getJourneyId() {
        return this.journeyId;
    }

    public final String getScheduledArrival() {
        return this.scheduledArrival;
    }

    public final String getScheduledArrivalUtc() {
        return this.scheduledArrivalUtc;
    }

    public final String getScheduledDeparture() {
        return this.scheduledDeparture;
    }

    public final String getScheduledDepartureUtc() {
        return this.scheduledDepartureUtc;
    }

    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.journeyId.hashCode()) * 31;
        String str = this.flightNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scheduledArrival;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scheduledArrivalUtc;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scheduledDeparture;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scheduledDepartureUtc;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setJourneyId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.journeyId = str;
    }

    public String toString() {
        return "IropSegmentEntity(id=" + this.id + ", journeyId=" + this.journeyId + ", flightNumber=" + this.flightNumber + ", scheduledArrival=" + this.scheduledArrival + ", scheduledArrivalUtc=" + this.scheduledArrivalUtc + ", scheduledDeparture=" + this.scheduledDeparture + ", scheduledDepartureUtc=" + this.scheduledDepartureUtc + ")";
    }
}
