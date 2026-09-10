package com.vivaaerobus.app.shared.resources.domain.useCase.getNearbyStations;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: GetNearbyStationsParams.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/shared/resources/domain/useCase/getNearbyStations/GetNearbyStationsParams;", "", "lat", "", "lng", "<init>", "(FF)V", "getLat", "()F", "getLng", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetNearbyStationsParams {
    private final float lat;
    private final float lng;

    public GetNearbyStationsParams(float f, float f2) {
        this.lat = f;
        this.lng = f2;
    }

    public static /* synthetic */ GetNearbyStationsParams copy$default(GetNearbyStationsParams getNearbyStationsParams, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = getNearbyStationsParams.lat;
        }
        if ((i & 2) != 0) {
            f2 = getNearbyStationsParams.lng;
        }
        return getNearbyStationsParams.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLng() {
        return this.lng;
    }

    public final GetNearbyStationsParams copy(float lat, float lng) {
        return new GetNearbyStationsParams(lat, lng);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetNearbyStationsParams)) {
            return false;
        }
        GetNearbyStationsParams getNearbyStationsParams = (GetNearbyStationsParams) other;
        return Float.compare(this.lat, getNearbyStationsParams.lat) == 0 && Float.compare(this.lng, getNearbyStationsParams.lng) == 0;
    }

    public final float getLat() {
        return this.lat;
    }

    public final float getLng() {
        return this.lng;
    }

    public int hashCode() {
        return (Float.hashCode(this.lat) * 31) + Float.hashCode(this.lng);
    }

    public String toString() {
        return "GetNearbyStationsParams(lat=" + this.lat + ", lng=" + this.lng + ")";
    }
}
