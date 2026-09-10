package com.vivaaerobus.app.shared.booking.domain.entity.bagEnquiry;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlightInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bagEnquiry/FlightInfo;", "", "airlineCode", "", "flightNumber", "flightDate", "arrDepFlag", "scheduleTime", "estimatedTime", "actualTime", "route", "flightStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAirlineCode", "()Ljava/lang/String;", "getFlightNumber", "getFlightDate", "getArrDepFlag", "getScheduleTime", "getEstimatedTime", "getActualTime", "getRoute", "getFlightStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FlightInfo {
    private final String actualTime;
    private final String airlineCode;
    private final String arrDepFlag;
    private final String estimatedTime;
    private final String flightDate;
    private final String flightNumber;
    private final String flightStatus;
    private final String route;
    private final String scheduleTime;

    public FlightInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.airlineCode = str;
        this.flightNumber = str2;
        this.flightDate = str3;
        this.arrDepFlag = str4;
        this.scheduleTime = str5;
        this.estimatedTime = str6;
        this.actualTime = str7;
        this.route = str8;
        this.flightStatus = str9;
    }

    public static /* synthetic */ FlightInfo copy$default(FlightInfo flightInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightInfo.airlineCode;
        }
        if ((i & 2) != 0) {
            str2 = flightInfo.flightNumber;
        }
        if ((i & 4) != 0) {
            str3 = flightInfo.flightDate;
        }
        if ((i & 8) != 0) {
            str4 = flightInfo.arrDepFlag;
        }
        if ((i & 16) != 0) {
            str5 = flightInfo.scheduleTime;
        }
        if ((i & 32) != 0) {
            str6 = flightInfo.estimatedTime;
        }
        if ((i & 64) != 0) {
            str7 = flightInfo.actualTime;
        }
        if ((i & 128) != 0) {
            str8 = flightInfo.route;
        }
        if ((i & 256) != 0) {
            str9 = flightInfo.flightStatus;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return flightInfo.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAirlineCode() {
        return this.airlineCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFlightNumber() {
        return this.flightNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFlightDate() {
        return this.flightDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArrDepFlag() {
        return this.arrDepFlag;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScheduleTime() {
        return this.scheduleTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getActualTime() {
        return this.actualTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    /* renamed from: component9, reason: from getter */
    public final String getFlightStatus() {
        return this.flightStatus;
    }

    public final FlightInfo copy(String airlineCode, String flightNumber, String flightDate, String arrDepFlag, String scheduleTime, String estimatedTime, String actualTime, String route, String flightStatus) {
        return new FlightInfo(airlineCode, flightNumber, flightDate, arrDepFlag, scheduleTime, estimatedTime, actualTime, route, flightStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightInfo)) {
            return false;
        }
        FlightInfo flightInfo = (FlightInfo) other;
        return Intrinsics.areEqual(this.airlineCode, flightInfo.airlineCode) && Intrinsics.areEqual(this.flightNumber, flightInfo.flightNumber) && Intrinsics.areEqual(this.flightDate, flightInfo.flightDate) && Intrinsics.areEqual(this.arrDepFlag, flightInfo.arrDepFlag) && Intrinsics.areEqual(this.scheduleTime, flightInfo.scheduleTime) && Intrinsics.areEqual(this.estimatedTime, flightInfo.estimatedTime) && Intrinsics.areEqual(this.actualTime, flightInfo.actualTime) && Intrinsics.areEqual(this.route, flightInfo.route) && Intrinsics.areEqual(this.flightStatus, flightInfo.flightStatus);
    }

    public final String getActualTime() {
        return this.actualTime;
    }

    public final String getAirlineCode() {
        return this.airlineCode;
    }

    public final String getArrDepFlag() {
        return this.arrDepFlag;
    }

    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    public final String getFlightDate() {
        return this.flightDate;
    }

    public final String getFlightNumber() {
        return this.flightNumber;
    }

    public final String getFlightStatus() {
        return this.flightStatus;
    }

    public final String getRoute() {
        return this.route;
    }

    public final String getScheduleTime() {
        return this.scheduleTime;
    }

    public int hashCode() {
        String str = this.airlineCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flightNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flightDate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.arrDepFlag;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scheduleTime;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.estimatedTime;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.actualTime;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.route;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.flightStatus;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "FlightInfo(airlineCode=" + this.airlineCode + ", flightNumber=" + this.flightNumber + ", flightDate=" + this.flightDate + ", arrDepFlag=" + this.arrDepFlag + ", scheduleTime=" + this.scheduleTime + ", estimatedTime=" + this.estimatedTime + ", actualTime=" + this.actualTime + ", route=" + this.route + ", flightStatus=" + this.flightStatus + ")";
    }
}
