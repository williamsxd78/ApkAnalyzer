package com.vivaaerobus.app.flightStatus.presentation.common;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlightStatusQuantumDataParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/vivaaerobus/app/flightStatus/presentation/common/FlightStatusQuantumDataParams;", "", "origin", "", "destination", "flightNumber", "selectedDate", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "wifiAvailable", "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getOrigin", "()Ljava/lang/String;", "getDestination", "getFlightNumber", "getSelectedDate", "getTimeZone", "getWifiAvailable", "()Z", "getAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "flightStatus_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlightStatusQuantumDataParams {
    public static final int $stable = 0;
    private final String action;
    private final String destination;
    private final String flightNumber;
    private final String origin;
    private final String selectedDate;
    private final String timeZone;
    private final boolean wifiAvailable;

    public FlightStatusQuantumDataParams(String str, String str2, String str3, String selectedDate, String timeZone, boolean z, String action) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(action, "action");
        this.origin = str;
        this.destination = str2;
        this.flightNumber = str3;
        this.selectedDate = selectedDate;
        this.timeZone = timeZone;
        this.wifiAvailable = z;
        this.action = action;
    }

    public static /* synthetic */ FlightStatusQuantumDataParams copy$default(FlightStatusQuantumDataParams flightStatusQuantumDataParams, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightStatusQuantumDataParams.origin;
        }
        if ((i & 2) != 0) {
            str2 = flightStatusQuantumDataParams.destination;
        }
        if ((i & 4) != 0) {
            str3 = flightStatusQuantumDataParams.flightNumber;
        }
        if ((i & 8) != 0) {
            str4 = flightStatusQuantumDataParams.selectedDate;
        }
        if ((i & 16) != 0) {
            str5 = flightStatusQuantumDataParams.timeZone;
        }
        if ((i & 32) != 0) {
            z = flightStatusQuantumDataParams.wifiAvailable;
        }
        if ((i & 64) != 0) {
            str6 = flightStatusQuantumDataParams.action;
        }
        boolean z2 = z;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return flightStatusQuantumDataParams.copy(str, str2, str9, str4, str8, z2, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFlightNumber() {
        return this.flightNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getWifiAvailable() {
        return this.wifiAvailable;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final FlightStatusQuantumDataParams copy(String origin, String destination, String flightNumber, String selectedDate, String timeZone, boolean wifiAvailable, String action) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(action, "action");
        return new FlightStatusQuantumDataParams(origin, destination, flightNumber, selectedDate, timeZone, wifiAvailable, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightStatusQuantumDataParams)) {
            return false;
        }
        FlightStatusQuantumDataParams flightStatusQuantumDataParams = (FlightStatusQuantumDataParams) other;
        return Intrinsics.areEqual(this.origin, flightStatusQuantumDataParams.origin) && Intrinsics.areEqual(this.destination, flightStatusQuantumDataParams.destination) && Intrinsics.areEqual(this.flightNumber, flightStatusQuantumDataParams.flightNumber) && Intrinsics.areEqual(this.selectedDate, flightStatusQuantumDataParams.selectedDate) && Intrinsics.areEqual(this.timeZone, flightStatusQuantumDataParams.timeZone) && this.wifiAvailable == flightStatusQuantumDataParams.wifiAvailable && Intrinsics.areEqual(this.action, flightStatusQuantumDataParams.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getFlightNumber() {
        return this.flightNumber;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getSelectedDate() {
        return this.selectedDate;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final boolean getWifiAvailable() {
        return this.wifiAvailable;
    }

    public int hashCode() {
        String str = this.origin;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.destination;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flightNumber;
        return ((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.selectedDate.hashCode()) * 31) + this.timeZone.hashCode()) * 31) + Boolean.hashCode(this.wifiAvailable)) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "FlightStatusQuantumDataParams(origin=" + this.origin + ", destination=" + this.destination + ", flightNumber=" + this.flightNumber + ", selectedDate=" + this.selectedDate + ", timeZone=" + this.timeZone + ", wifiAvailable=" + this.wifiAvailable + ", action=" + this.action + ")";
    }
}
