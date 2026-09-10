package com.vivaaerobus.app.database.entities;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: CoordinatesEntity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/database/entities/CoordinatesEntity;", "", "lat", "", "lng", "<init>", "(DD)V", "getLat", "()D", "getLng", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoordinatesEntity {
    private final double lat;
    private final double lng;

    public CoordinatesEntity(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public static /* synthetic */ CoordinatesEntity copy$default(CoordinatesEntity coordinatesEntity, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = coordinatesEntity.lat;
        }
        if ((i & 2) != 0) {
            d2 = coordinatesEntity.lng;
        }
        return coordinatesEntity.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLng() {
        return this.lng;
    }

    public final CoordinatesEntity copy(double lat, double lng) {
        return new CoordinatesEntity(lat, lng);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoordinatesEntity)) {
            return false;
        }
        CoordinatesEntity coordinatesEntity = (CoordinatesEntity) other;
        return Double.compare(this.lat, coordinatesEntity.lat) == 0 && Double.compare(this.lng, coordinatesEntity.lng) == 0;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public int hashCode() {
        return (Double.hashCode(this.lat) * 31) + Double.hashCode(this.lng);
    }

    public String toString() {
        return "CoordinatesEntity(lat=" + this.lat + ", lng=" + this.lng + ")";
    }
}
