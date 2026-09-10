package com.vivaaerobus.app.shared.booking.domain.entity.bookingSimple;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.terminalMap.presentation.terminalMap.TerminalMapFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StationSimple.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001J\u0014\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bookingSimple/StationSimple;", "", "code", "", "shortName", "activeForBooking", "", TerminalMapFragment.AIRPORT_NAME, "name", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "galleryUrl", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getShortName", "getActiveForBooking", "()Z", "getAirportName", "getName", "getCountryCode", "getGalleryUrl", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StationSimple {
    private final boolean activeForBooking;
    private final String airportName;
    private final String code;
    private final String countryCode;
    private final List<String> galleryUrl;
    private final String name;
    private final String shortName;

    public StationSimple(String code, String shortName, boolean z, String airportName, String name, String countryCode, List<String> galleryUrl) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(airportName, "airportName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(galleryUrl, "galleryUrl");
        this.code = code;
        this.shortName = shortName;
        this.activeForBooking = z;
        this.airportName = airportName;
        this.name = name;
        this.countryCode = countryCode;
        this.galleryUrl = galleryUrl;
    }

    public static /* synthetic */ StationSimple copy$default(StationSimple stationSimple, String str, String str2, boolean z, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationSimple.code;
        }
        if ((i & 2) != 0) {
            str2 = stationSimple.shortName;
        }
        if ((i & 4) != 0) {
            z = stationSimple.activeForBooking;
        }
        if ((i & 8) != 0) {
            str3 = stationSimple.airportName;
        }
        if ((i & 16) != 0) {
            str4 = stationSimple.name;
        }
        if ((i & 32) != 0) {
            str5 = stationSimple.countryCode;
        }
        if ((i & 64) != 0) {
            list = stationSimple.galleryUrl;
        }
        String str6 = str5;
        List list2 = list;
        String str7 = str4;
        boolean z2 = z;
        return stationSimple.copy(str, str2, z2, str3, str7, str6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getActiveForBooking() {
        return this.activeForBooking;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAirportName() {
        return this.airportName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<String> component7() {
        return this.galleryUrl;
    }

    public final StationSimple copy(String code, String shortName, boolean activeForBooking, String airportName, String name, String countryCode, List<String> galleryUrl) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(airportName, "airportName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(galleryUrl, "galleryUrl");
        return new StationSimple(code, shortName, activeForBooking, airportName, name, countryCode, galleryUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationSimple)) {
            return false;
        }
        StationSimple stationSimple = (StationSimple) other;
        return Intrinsics.areEqual(this.code, stationSimple.code) && Intrinsics.areEqual(this.shortName, stationSimple.shortName) && this.activeForBooking == stationSimple.activeForBooking && Intrinsics.areEqual(this.airportName, stationSimple.airportName) && Intrinsics.areEqual(this.name, stationSimple.name) && Intrinsics.areEqual(this.countryCode, stationSimple.countryCode) && Intrinsics.areEqual(this.galleryUrl, stationSimple.galleryUrl);
    }

    public final boolean getActiveForBooking() {
        return this.activeForBooking;
    }

    public final String getAirportName() {
        return this.airportName;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<String> getGalleryUrl() {
        return this.galleryUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        return (((((((((((this.code.hashCode() * 31) + this.shortName.hashCode()) * 31) + Boolean.hashCode(this.activeForBooking)) * 31) + this.airportName.hashCode()) * 31) + this.name.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.galleryUrl.hashCode();
    }

    public String toString() {
        return "StationSimple(code=" + this.code + ", shortName=" + this.shortName + ", activeForBooking=" + this.activeForBooking + ", airportName=" + this.airportName + ", name=" + this.name + ", countryCode=" + this.countryCode + ", galleryUrl=" + this.galleryUrl + ")";
    }
}
