package com.vivaaerobus.app.shared.irop.domain.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetPlannedFlightsResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/shared/irop/domain/model/GetPlannedFlightsDesignator;", "", "origin", "", "destination", "departure", "arrival", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrigin", "()Ljava/lang/String;", "getDestination", "getDeparture", "getArrival", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "irop_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetPlannedFlightsDesignator {
    private final String arrival;
    private final String departure;
    private final String destination;
    private final String origin;

    public GetPlannedFlightsDesignator(String origin, String destination, String departure, String arrival) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
    }

    public static /* synthetic */ GetPlannedFlightsDesignator copy$default(GetPlannedFlightsDesignator getPlannedFlightsDesignator, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPlannedFlightsDesignator.origin;
        }
        if ((i & 2) != 0) {
            str2 = getPlannedFlightsDesignator.destination;
        }
        if ((i & 4) != 0) {
            str3 = getPlannedFlightsDesignator.departure;
        }
        if ((i & 8) != 0) {
            str4 = getPlannedFlightsDesignator.arrival;
        }
        return getPlannedFlightsDesignator.copy(str, str2, str3, str4);
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
    public final String getDeparture() {
        return this.departure;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArrival() {
        return this.arrival;
    }

    public final GetPlannedFlightsDesignator copy(String origin, String destination, String departure, String arrival) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        return new GetPlannedFlightsDesignator(origin, destination, departure, arrival);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPlannedFlightsDesignator)) {
            return false;
        }
        GetPlannedFlightsDesignator getPlannedFlightsDesignator = (GetPlannedFlightsDesignator) other;
        return Intrinsics.areEqual(this.origin, getPlannedFlightsDesignator.origin) && Intrinsics.areEqual(this.destination, getPlannedFlightsDesignator.destination) && Intrinsics.areEqual(this.departure, getPlannedFlightsDesignator.departure) && Intrinsics.areEqual(this.arrival, getPlannedFlightsDesignator.arrival);
    }

    public final String getArrival() {
        return this.arrival;
    }

    public final String getDeparture() {
        return this.departure;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return (((((this.origin.hashCode() * 31) + this.destination.hashCode()) * 31) + this.departure.hashCode()) * 31) + this.arrival.hashCode();
    }

    public String toString() {
        return "GetPlannedFlightsDesignator(origin=" + this.origin + ", destination=" + this.destination + ", departure=" + this.departure + ", arrival=" + this.arrival + ")";
    }
}
