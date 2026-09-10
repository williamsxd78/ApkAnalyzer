package com.vivaaerobus.app.newContentful.domain.models.terminalMaps;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Geometry.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0003\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0003\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003JW\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0003\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR.\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/terminalMaps/Geometry;", "", "coordinates", "", "coordinatesPolygon", "", "coordinatesPoint", "type", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getCoordinates", "()Ljava/util/List;", "getCoordinatesPolygon", "setCoordinatesPolygon", "(Ljava/util/List;)V", "getCoordinatesPoint", "setCoordinatesPoint", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Geometry {
    private final List<Object> coordinates;
    private List<Double> coordinatesPoint;
    private List<? extends List<? extends List<Double>>> coordinatesPolygon;
    private final String type;

    public Geometry(List<? extends Object> list, List<? extends List<? extends List<Double>>> list2, List<Double> list3, String str) {
        this.coordinates = list;
        this.coordinatesPolygon = list2;
        this.coordinatesPoint = list3;
        this.type = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Geometry copy$default(Geometry geometry, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = geometry.coordinates;
        }
        if ((i & 2) != 0) {
            list2 = geometry.coordinatesPolygon;
        }
        if ((i & 4) != 0) {
            list3 = geometry.coordinatesPoint;
        }
        if ((i & 8) != 0) {
            str = geometry.type;
        }
        return geometry.copy(list, list2, list3, str);
    }

    public final List<Object> component1() {
        return this.coordinates;
    }

    public final List<List<List<Double>>> component2() {
        return this.coordinatesPolygon;
    }

    public final List<Double> component3() {
        return this.coordinatesPoint;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Geometry copy(List<? extends Object> coordinates, List<? extends List<? extends List<Double>>> coordinatesPolygon, List<Double> coordinatesPoint, String type) {
        return new Geometry(coordinates, coordinatesPolygon, coordinatesPoint, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geometry)) {
            return false;
        }
        Geometry geometry = (Geometry) other;
        return Intrinsics.areEqual(this.coordinates, geometry.coordinates) && Intrinsics.areEqual(this.coordinatesPolygon, geometry.coordinatesPolygon) && Intrinsics.areEqual(this.coordinatesPoint, geometry.coordinatesPoint) && Intrinsics.areEqual(this.type, geometry.type);
    }

    public final List<Object> getCoordinates() {
        return this.coordinates;
    }

    public final List<Double> getCoordinatesPoint() {
        return this.coordinatesPoint;
    }

    public final List<List<List<Double>>> getCoordinatesPolygon() {
        return this.coordinatesPolygon;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        List<Object> list = this.coordinates;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<? extends List<? extends List<Double>>> list2 = this.coordinatesPolygon;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Double> list3 = this.coordinatesPoint;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.type;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setCoordinatesPoint(List<Double> list) {
        this.coordinatesPoint = list;
    }

    public final void setCoordinatesPolygon(List<? extends List<? extends List<Double>>> list) {
        this.coordinatesPolygon = list;
    }

    public String toString() {
        return "Geometry(coordinates=" + this.coordinates + ", coordinatesPolygon=" + this.coordinatesPolygon + ", coordinatesPoint=" + this.coordinatesPoint + ", type=" + this.type + ")";
    }
}
