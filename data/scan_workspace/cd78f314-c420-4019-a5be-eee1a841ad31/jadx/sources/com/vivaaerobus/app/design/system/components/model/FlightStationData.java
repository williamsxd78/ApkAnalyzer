package com.vivaaerobus.app.design.system.components.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlightStationData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/design/system/components/model/FlightStationData;", "", "hour", "", "dayIndicator", "airportCode", "airportSupportText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHour", "()Ljava/lang/String;", "getDayIndicator", "getAirportCode", "getAirportSupportText", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "designSystem_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlightStationData {
    public static final int $stable = 0;
    private final String airportCode;
    private final String airportSupportText;
    private final String dayIndicator;
    private final String hour;

    public FlightStationData(String hour, String dayIndicator, String airportCode, String str) {
        Intrinsics.checkNotNullParameter(hour, "hour");
        Intrinsics.checkNotNullParameter(dayIndicator, "dayIndicator");
        Intrinsics.checkNotNullParameter(airportCode, "airportCode");
        this.hour = hour;
        this.dayIndicator = dayIndicator;
        this.airportCode = airportCode;
        this.airportSupportText = str;
    }

    public static /* synthetic */ FlightStationData copy$default(FlightStationData flightStationData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightStationData.hour;
        }
        if ((i & 2) != 0) {
            str2 = flightStationData.dayIndicator;
        }
        if ((i & 4) != 0) {
            str3 = flightStationData.airportCode;
        }
        if ((i & 8) != 0) {
            str4 = flightStationData.airportSupportText;
        }
        return flightStationData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHour() {
        return this.hour;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDayIndicator() {
        return this.dayIndicator;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAirportCode() {
        return this.airportCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAirportSupportText() {
        return this.airportSupportText;
    }

    public final FlightStationData copy(String hour, String dayIndicator, String airportCode, String airportSupportText) {
        Intrinsics.checkNotNullParameter(hour, "hour");
        Intrinsics.checkNotNullParameter(dayIndicator, "dayIndicator");
        Intrinsics.checkNotNullParameter(airportCode, "airportCode");
        return new FlightStationData(hour, dayIndicator, airportCode, airportSupportText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightStationData)) {
            return false;
        }
        FlightStationData flightStationData = (FlightStationData) other;
        return Intrinsics.areEqual(this.hour, flightStationData.hour) && Intrinsics.areEqual(this.dayIndicator, flightStationData.dayIndicator) && Intrinsics.areEqual(this.airportCode, flightStationData.airportCode) && Intrinsics.areEqual(this.airportSupportText, flightStationData.airportSupportText);
    }

    public final String getAirportCode() {
        return this.airportCode;
    }

    public final String getAirportSupportText() {
        return this.airportSupportText;
    }

    public final String getDayIndicator() {
        return this.dayIndicator;
    }

    public final String getHour() {
        return this.hour;
    }

    public int hashCode() {
        int hashCode = ((((this.hour.hashCode() * 31) + this.dayIndicator.hashCode()) * 31) + this.airportCode.hashCode()) * 31;
        String str = this.airportSupportText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FlightStationData(hour=" + this.hour + ", dayIndicator=" + this.dayIndicator + ", airportCode=" + this.airportCode + ", airportSupportText=" + this.airportSupportText + ")";
    }
}
