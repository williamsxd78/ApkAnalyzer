package com.vivaaerobus.app.fares.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvailableDates.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/fares/domain/entity/AvailableDates;", "", "date", "Ljava/util/Date;", "hasDirectFlights", "", "<init>", "(Ljava/util/Date;Z)V", "getDate", "()Ljava/util/Date;", "getHasDirectFlights", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "low_fares_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AvailableDates {
    private final Date date;
    private final boolean hasDirectFlights;

    public AvailableDates(Date date, boolean z) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.date = date;
        this.hasDirectFlights = z;
    }

    public static /* synthetic */ AvailableDates copy$default(AvailableDates availableDates, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            date = availableDates.date;
        }
        if ((i & 2) != 0) {
            z = availableDates.hasDirectFlights;
        }
        return availableDates.copy(date, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasDirectFlights() {
        return this.hasDirectFlights;
    }

    public final AvailableDates copy(Date date, boolean hasDirectFlights) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new AvailableDates(date, hasDirectFlights);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableDates)) {
            return false;
        }
        AvailableDates availableDates = (AvailableDates) other;
        return Intrinsics.areEqual(this.date, availableDates.date) && this.hasDirectFlights == availableDates.hasDirectFlights;
    }

    public final Date getDate() {
        return this.date;
    }

    public final boolean getHasDirectFlights() {
        return this.hasDirectFlights;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + Boolean.hashCode(this.hasDirectFlights);
    }

    public String toString() {
        return "AvailableDates(date=" + this.date + ", hasDirectFlights=" + this.hasDirectFlights + ")";
    }
}
