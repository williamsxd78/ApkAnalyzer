package com.vivaaerobus.app.shared.resources.domain.useCase.getLocation;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetLocationInfoResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/shared/resources/domain/useCase/getLocation/GetLocationInfoResponse;", "", "lat", "", "lng", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLat", "()Ljava/lang/String;", "getLng", "getCountryCode", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetLocationInfoResponse {
    private final String countryCode;
    private final String lat;
    private final String lng;

    public GetLocationInfoResponse(String lat, String lng, String countryCode) {
        Intrinsics.checkNotNullParameter(lat, "lat");
        Intrinsics.checkNotNullParameter(lng, "lng");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.lat = lat;
        this.lng = lng;
        this.countryCode = countryCode;
    }

    public static /* synthetic */ GetLocationInfoResponse copy$default(GetLocationInfoResponse getLocationInfoResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLocationInfoResponse.lat;
        }
        if ((i & 2) != 0) {
            str2 = getLocationInfoResponse.lng;
        }
        if ((i & 4) != 0) {
            str3 = getLocationInfoResponse.countryCode;
        }
        return getLocationInfoResponse.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLng() {
        return this.lng;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final GetLocationInfoResponse copy(String lat, String lng, String countryCode) {
        Intrinsics.checkNotNullParameter(lat, "lat");
        Intrinsics.checkNotNullParameter(lng, "lng");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GetLocationInfoResponse(lat, lng, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetLocationInfoResponse)) {
            return false;
        }
        GetLocationInfoResponse getLocationInfoResponse = (GetLocationInfoResponse) other;
        return Intrinsics.areEqual(this.lat, getLocationInfoResponse.lat) && Intrinsics.areEqual(this.lng, getLocationInfoResponse.lng) && Intrinsics.areEqual(this.countryCode, getLocationInfoResponse.countryCode);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getLat() {
        return this.lat;
    }

    public final String getLng() {
        return this.lng;
    }

    public int hashCode() {
        return (((this.lat.hashCode() * 31) + this.lng.hashCode()) * 31) + this.countryCode.hashCode();
    }

    public String toString() {
        return "GetLocationInfoResponse(lat=" + this.lat + ", lng=" + this.lng + ", countryCode=" + this.countryCode + ")";
    }
}
