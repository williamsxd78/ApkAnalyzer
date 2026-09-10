package com.vivaaerobus.app.newContentful.data.dataSource.dto;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchFlightStatusAcmiBlacklistDto.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/newContentful/data/dataSource/dto/FetchFlightStatusAcmiBlacklistDto;", "", "isFeatureEnabled", "", "plates", "", "", "<init>", "(ZLjava/util/List;)V", "()Z", "getPlates", "()Ljava/util/List;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FetchFlightStatusAcmiBlacklistDto {
    private final boolean isFeatureEnabled;
    private final List<String> plates;

    public FetchFlightStatusAcmiBlacklistDto(boolean z, List<String> plates) {
        Intrinsics.checkNotNullParameter(plates, "plates");
        this.isFeatureEnabled = z;
        this.plates = plates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchFlightStatusAcmiBlacklistDto copy$default(FetchFlightStatusAcmiBlacklistDto fetchFlightStatusAcmiBlacklistDto, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fetchFlightStatusAcmiBlacklistDto.isFeatureEnabled;
        }
        if ((i & 2) != 0) {
            list = fetchFlightStatusAcmiBlacklistDto.plates;
        }
        return fetchFlightStatusAcmiBlacklistDto.copy(z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFeatureEnabled() {
        return this.isFeatureEnabled;
    }

    public final List<String> component2() {
        return this.plates;
    }

    public final FetchFlightStatusAcmiBlacklistDto copy(boolean isFeatureEnabled, List<String> plates) {
        Intrinsics.checkNotNullParameter(plates, "plates");
        return new FetchFlightStatusAcmiBlacklistDto(isFeatureEnabled, plates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchFlightStatusAcmiBlacklistDto)) {
            return false;
        }
        FetchFlightStatusAcmiBlacklistDto fetchFlightStatusAcmiBlacklistDto = (FetchFlightStatusAcmiBlacklistDto) other;
        return this.isFeatureEnabled == fetchFlightStatusAcmiBlacklistDto.isFeatureEnabled && Intrinsics.areEqual(this.plates, fetchFlightStatusAcmiBlacklistDto.plates);
    }

    public final List<String> getPlates() {
        return this.plates;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isFeatureEnabled) * 31) + this.plates.hashCode();
    }

    public final boolean isFeatureEnabled() {
        return this.isFeatureEnabled;
    }

    public String toString() {
        return "FetchFlightStatusAcmiBlacklistDto(isFeatureEnabled=" + this.isFeatureEnabled + ", plates=" + this.plates + ")";
    }
}
