package com.vivaaerobus.app.sharedFlightStatus.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetInformationSegment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0014\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00101\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00062"}, d2 = {"Lcom/vivaaerobus/app/sharedFlightStatus/domain/entity/GetInformationSegment;", "", "lineSequence", "", "operatingCarrier", "", "operatingCode", "operatingStatus", "actualDepartureTime", "estimatedDepartureTime", "scheduledDepartureTime", "actualArrivalTime", "estimatedArrivalTime", "scheduledArrivalTime", "origin", "destination", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLineSequence", "()I", "getOperatingCarrier", "()Ljava/lang/String;", "getOperatingCode", "getOperatingStatus", "getActualDepartureTime", "getEstimatedDepartureTime", "getScheduledDepartureTime", "getActualArrivalTime", "getEstimatedArrivalTime", "getScheduledArrivalTime", "getOrigin", "getDestination", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "sharedFlightStatus_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetInformationSegment {
    private final String actualArrivalTime;
    private final String actualDepartureTime;
    private final String destination;
    private final String estimatedArrivalTime;
    private final String estimatedDepartureTime;
    private final int lineSequence;
    private final String operatingCarrier;
    private final String operatingCode;
    private final String operatingStatus;
    private final String origin;
    private final String scheduledArrivalTime;
    private final String scheduledDepartureTime;

    public GetInformationSegment(int i, String operatingCarrier, String operatingCode, String operatingStatus, String actualDepartureTime, String estimatedDepartureTime, String scheduledDepartureTime, String actualArrivalTime, String estimatedArrivalTime, String scheduledArrivalTime, String origin, String destination) {
        Intrinsics.checkNotNullParameter(operatingCarrier, "operatingCarrier");
        Intrinsics.checkNotNullParameter(operatingCode, "operatingCode");
        Intrinsics.checkNotNullParameter(operatingStatus, "operatingStatus");
        Intrinsics.checkNotNullParameter(actualDepartureTime, "actualDepartureTime");
        Intrinsics.checkNotNullParameter(estimatedDepartureTime, "estimatedDepartureTime");
        Intrinsics.checkNotNullParameter(scheduledDepartureTime, "scheduledDepartureTime");
        Intrinsics.checkNotNullParameter(actualArrivalTime, "actualArrivalTime");
        Intrinsics.checkNotNullParameter(estimatedArrivalTime, "estimatedArrivalTime");
        Intrinsics.checkNotNullParameter(scheduledArrivalTime, "scheduledArrivalTime");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.lineSequence = i;
        this.operatingCarrier = operatingCarrier;
        this.operatingCode = operatingCode;
        this.operatingStatus = operatingStatus;
        this.actualDepartureTime = actualDepartureTime;
        this.estimatedDepartureTime = estimatedDepartureTime;
        this.scheduledDepartureTime = scheduledDepartureTime;
        this.actualArrivalTime = actualArrivalTime;
        this.estimatedArrivalTime = estimatedArrivalTime;
        this.scheduledArrivalTime = scheduledArrivalTime;
        this.origin = origin;
        this.destination = destination;
    }

    public static /* synthetic */ GetInformationSegment copy$default(GetInformationSegment getInformationSegment, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getInformationSegment.lineSequence;
        }
        if ((i2 & 2) != 0) {
            str = getInformationSegment.operatingCarrier;
        }
        if ((i2 & 4) != 0) {
            str2 = getInformationSegment.operatingCode;
        }
        if ((i2 & 8) != 0) {
            str3 = getInformationSegment.operatingStatus;
        }
        if ((i2 & 16) != 0) {
            str4 = getInformationSegment.actualDepartureTime;
        }
        if ((i2 & 32) != 0) {
            str5 = getInformationSegment.estimatedDepartureTime;
        }
        if ((i2 & 64) != 0) {
            str6 = getInformationSegment.scheduledDepartureTime;
        }
        if ((i2 & 128) != 0) {
            str7 = getInformationSegment.actualArrivalTime;
        }
        if ((i2 & 256) != 0) {
            str8 = getInformationSegment.estimatedArrivalTime;
        }
        if ((i2 & 512) != 0) {
            str9 = getInformationSegment.scheduledArrivalTime;
        }
        if ((i2 & 1024) != 0) {
            str10 = getInformationSegment.origin;
        }
        if ((i2 & 2048) != 0) {
            str11 = getInformationSegment.destination;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str4;
        String str19 = str5;
        return getInformationSegment.copy(i, str, str2, str3, str18, str19, str16, str17, str14, str15, str12, str13);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLineSequence() {
        return this.lineSequence;
    }

    /* renamed from: component10, reason: from getter */
    public final String getScheduledArrivalTime() {
        return this.scheduledArrivalTime;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOperatingCarrier() {
        return this.operatingCarrier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOperatingCode() {
        return this.operatingCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOperatingStatus() {
        return this.operatingStatus;
    }

    /* renamed from: component5, reason: from getter */
    public final String getActualDepartureTime() {
        return this.actualDepartureTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEstimatedDepartureTime() {
        return this.estimatedDepartureTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getScheduledDepartureTime() {
        return this.scheduledDepartureTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getActualArrivalTime() {
        return this.actualArrivalTime;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }

    public final GetInformationSegment copy(int lineSequence, String operatingCarrier, String operatingCode, String operatingStatus, String actualDepartureTime, String estimatedDepartureTime, String scheduledDepartureTime, String actualArrivalTime, String estimatedArrivalTime, String scheduledArrivalTime, String origin, String destination) {
        Intrinsics.checkNotNullParameter(operatingCarrier, "operatingCarrier");
        Intrinsics.checkNotNullParameter(operatingCode, "operatingCode");
        Intrinsics.checkNotNullParameter(operatingStatus, "operatingStatus");
        Intrinsics.checkNotNullParameter(actualDepartureTime, "actualDepartureTime");
        Intrinsics.checkNotNullParameter(estimatedDepartureTime, "estimatedDepartureTime");
        Intrinsics.checkNotNullParameter(scheduledDepartureTime, "scheduledDepartureTime");
        Intrinsics.checkNotNullParameter(actualArrivalTime, "actualArrivalTime");
        Intrinsics.checkNotNullParameter(estimatedArrivalTime, "estimatedArrivalTime");
        Intrinsics.checkNotNullParameter(scheduledArrivalTime, "scheduledArrivalTime");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new GetInformationSegment(lineSequence, operatingCarrier, operatingCode, operatingStatus, actualDepartureTime, estimatedDepartureTime, scheduledDepartureTime, actualArrivalTime, estimatedArrivalTime, scheduledArrivalTime, origin, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetInformationSegment)) {
            return false;
        }
        GetInformationSegment getInformationSegment = (GetInformationSegment) other;
        return this.lineSequence == getInformationSegment.lineSequence && Intrinsics.areEqual(this.operatingCarrier, getInformationSegment.operatingCarrier) && Intrinsics.areEqual(this.operatingCode, getInformationSegment.operatingCode) && Intrinsics.areEqual(this.operatingStatus, getInformationSegment.operatingStatus) && Intrinsics.areEqual(this.actualDepartureTime, getInformationSegment.actualDepartureTime) && Intrinsics.areEqual(this.estimatedDepartureTime, getInformationSegment.estimatedDepartureTime) && Intrinsics.areEqual(this.scheduledDepartureTime, getInformationSegment.scheduledDepartureTime) && Intrinsics.areEqual(this.actualArrivalTime, getInformationSegment.actualArrivalTime) && Intrinsics.areEqual(this.estimatedArrivalTime, getInformationSegment.estimatedArrivalTime) && Intrinsics.areEqual(this.scheduledArrivalTime, getInformationSegment.scheduledArrivalTime) && Intrinsics.areEqual(this.origin, getInformationSegment.origin) && Intrinsics.areEqual(this.destination, getInformationSegment.destination);
    }

    public final String getActualArrivalTime() {
        return this.actualArrivalTime;
    }

    public final String getActualDepartureTime() {
        return this.actualDepartureTime;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }

    public final String getEstimatedDepartureTime() {
        return this.estimatedDepartureTime;
    }

    public final int getLineSequence() {
        return this.lineSequence;
    }

    public final String getOperatingCarrier() {
        return this.operatingCarrier;
    }

    public final String getOperatingCode() {
        return this.operatingCode;
    }

    public final String getOperatingStatus() {
        return this.operatingStatus;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getScheduledArrivalTime() {
        return this.scheduledArrivalTime;
    }

    public final String getScheduledDepartureTime() {
        return this.scheduledDepartureTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.lineSequence) * 31) + this.operatingCarrier.hashCode()) * 31) + this.operatingCode.hashCode()) * 31) + this.operatingStatus.hashCode()) * 31) + this.actualDepartureTime.hashCode()) * 31) + this.estimatedDepartureTime.hashCode()) * 31) + this.scheduledDepartureTime.hashCode()) * 31) + this.actualArrivalTime.hashCode()) * 31) + this.estimatedArrivalTime.hashCode()) * 31) + this.scheduledArrivalTime.hashCode()) * 31) + this.origin.hashCode()) * 31) + this.destination.hashCode();
    }

    public String toString() {
        return "GetInformationSegment(lineSequence=" + this.lineSequence + ", operatingCarrier=" + this.operatingCarrier + ", operatingCode=" + this.operatingCode + ", operatingStatus=" + this.operatingStatus + ", actualDepartureTime=" + this.actualDepartureTime + ", estimatedDepartureTime=" + this.estimatedDepartureTime + ", scheduledDepartureTime=" + this.scheduledDepartureTime + ", actualArrivalTime=" + this.actualArrivalTime + ", estimatedArrivalTime=" + this.estimatedArrivalTime + ", scheduledArrivalTime=" + this.scheduledArrivalTime + ", origin=" + this.origin + ", destination=" + this.destination + ")";
    }
}
