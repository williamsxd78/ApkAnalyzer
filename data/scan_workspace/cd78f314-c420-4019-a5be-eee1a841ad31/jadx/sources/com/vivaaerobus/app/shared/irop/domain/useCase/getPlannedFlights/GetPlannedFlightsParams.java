package com.vivaaerobus.app.shared.irop.domain.useCase.getPlannedFlights;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetPlannedFlightsParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/shared/irop/domain/useCase/getPlannedFlights/GetPlannedFlightsParams;", "", "flightNumber", "", "flightDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFlightNumber", "()Ljava/lang/String;", "getFlightDate", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "irop_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetPlannedFlightsParams {
    private final String flightDate;
    private final String flightNumber;

    public GetPlannedFlightsParams(String flightNumber, String flightDate) {
        Intrinsics.checkNotNullParameter(flightNumber, "flightNumber");
        Intrinsics.checkNotNullParameter(flightDate, "flightDate");
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
    }

    public static /* synthetic */ GetPlannedFlightsParams copy$default(GetPlannedFlightsParams getPlannedFlightsParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPlannedFlightsParams.flightNumber;
        }
        if ((i & 2) != 0) {
            str2 = getPlannedFlightsParams.flightDate;
        }
        return getPlannedFlightsParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFlightNumber() {
        return this.flightNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFlightDate() {
        return this.flightDate;
    }

    public final GetPlannedFlightsParams copy(String flightNumber, String flightDate) {
        Intrinsics.checkNotNullParameter(flightNumber, "flightNumber");
        Intrinsics.checkNotNullParameter(flightDate, "flightDate");
        return new GetPlannedFlightsParams(flightNumber, flightDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPlannedFlightsParams)) {
            return false;
        }
        GetPlannedFlightsParams getPlannedFlightsParams = (GetPlannedFlightsParams) other;
        return Intrinsics.areEqual(this.flightNumber, getPlannedFlightsParams.flightNumber) && Intrinsics.areEqual(this.flightDate, getPlannedFlightsParams.flightDate);
    }

    public final String getFlightDate() {
        return this.flightDate;
    }

    public final String getFlightNumber() {
        return this.flightNumber;
    }

    public int hashCode() {
        return (this.flightNumber.hashCode() * 31) + this.flightDate.hashCode();
    }

    public String toString() {
        return "GetPlannedFlightsParams(flightNumber=" + this.flightNumber + ", flightDate=" + this.flightDate + ")";
    }
}
