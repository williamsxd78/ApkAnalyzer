package com.vivaaerobus.app.recentSearch.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RouteMultiCity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/vivaaerobus/app/recentSearch/domain/entity/RouteMultiCity;", "", "departureDate", "Ljava/util/Date;", "originCode", "", "destinationCode", "multiAirportSearchCodeForOrigin", "multiAirportSearchCodeForDestination", "<init>", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDepartureDate", "()Ljava/util/Date;", "getOriginCode", "()Ljava/lang/String;", "getDestinationCode", "getMultiAirportSearchCodeForOrigin", "getMultiAirportSearchCodeForDestination", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "recentSearch_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RouteMultiCity {
    private final Date departureDate;
    private final String destinationCode;
    private final String multiAirportSearchCodeForDestination;
    private final String multiAirportSearchCodeForOrigin;
    private final String originCode;

    public RouteMultiCity(Date departureDate, String originCode, String destinationCode, String str, String str2) {
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        this.departureDate = departureDate;
        this.originCode = originCode;
        this.destinationCode = destinationCode;
        this.multiAirportSearchCodeForOrigin = str;
        this.multiAirportSearchCodeForDestination = str2;
    }

    public static /* synthetic */ RouteMultiCity copy$default(RouteMultiCity routeMultiCity, Date date, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            date = routeMultiCity.departureDate;
        }
        if ((i & 2) != 0) {
            str = routeMultiCity.originCode;
        }
        if ((i & 4) != 0) {
            str2 = routeMultiCity.destinationCode;
        }
        if ((i & 8) != 0) {
            str3 = routeMultiCity.multiAirportSearchCodeForOrigin;
        }
        if ((i & 16) != 0) {
            str4 = routeMultiCity.multiAirportSearchCodeForDestination;
        }
        String str5 = str4;
        String str6 = str2;
        return routeMultiCity.copy(date, str, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getDepartureDate() {
        return this.departureDate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginCode() {
        return this.originCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDestinationCode() {
        return this.destinationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMultiAirportSearchCodeForOrigin() {
        return this.multiAirportSearchCodeForOrigin;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMultiAirportSearchCodeForDestination() {
        return this.multiAirportSearchCodeForDestination;
    }

    public final RouteMultiCity copy(Date departureDate, String originCode, String destinationCode, String multiAirportSearchCodeForOrigin, String multiAirportSearchCodeForDestination) {
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        return new RouteMultiCity(departureDate, originCode, destinationCode, multiAirportSearchCodeForOrigin, multiAirportSearchCodeForDestination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteMultiCity)) {
            return false;
        }
        RouteMultiCity routeMultiCity = (RouteMultiCity) other;
        return Intrinsics.areEqual(this.departureDate, routeMultiCity.departureDate) && Intrinsics.areEqual(this.originCode, routeMultiCity.originCode) && Intrinsics.areEqual(this.destinationCode, routeMultiCity.destinationCode) && Intrinsics.areEqual(this.multiAirportSearchCodeForOrigin, routeMultiCity.multiAirportSearchCodeForOrigin) && Intrinsics.areEqual(this.multiAirportSearchCodeForDestination, routeMultiCity.multiAirportSearchCodeForDestination);
    }

    public final Date getDepartureDate() {
        return this.departureDate;
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getMultiAirportSearchCodeForDestination() {
        return this.multiAirportSearchCodeForDestination;
    }

    public final String getMultiAirportSearchCodeForOrigin() {
        return this.multiAirportSearchCodeForOrigin;
    }

    public final String getOriginCode() {
        return this.originCode;
    }

    public int hashCode() {
        int hashCode = ((((this.departureDate.hashCode() * 31) + this.originCode.hashCode()) * 31) + this.destinationCode.hashCode()) * 31;
        String str = this.multiAirportSearchCodeForOrigin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.multiAirportSearchCodeForDestination;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RouteMultiCity(departureDate=" + this.departureDate + ", originCode=" + this.originCode + ", destinationCode=" + this.destinationCode + ", multiAirportSearchCodeForOrigin=" + this.multiAirportSearchCodeForOrigin + ", multiAirportSearchCodeForDestination=" + this.multiAirportSearchCodeForDestination + ")";
    }
}
