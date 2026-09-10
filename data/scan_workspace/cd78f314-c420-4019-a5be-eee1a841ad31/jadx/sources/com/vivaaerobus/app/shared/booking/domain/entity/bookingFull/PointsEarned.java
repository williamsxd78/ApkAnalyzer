package com.vivaaerobus.app.shared.booking.domain.entity.bookingFull;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: PointsEarned.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bookingFull/PointsEarned;", "", "airfare", "", "ancillaries", "comboBonus", "totalPointsEarned", "<init>", "(JJJJ)V", "getAirfare", "()J", "getAncillaries", "getComboBonus", "getTotalPointsEarned", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PointsEarned {
    private final long airfare;
    private final long ancillaries;
    private final long comboBonus;
    private final long totalPointsEarned;

    public PointsEarned(long j, long j2, long j3, long j4) {
        this.airfare = j;
        this.ancillaries = j2;
        this.comboBonus = j3;
        this.totalPointsEarned = j4;
    }

    public static /* synthetic */ PointsEarned copy$default(PointsEarned pointsEarned, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pointsEarned.airfare;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = pointsEarned.ancillaries;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = pointsEarned.comboBonus;
        }
        return pointsEarned.copy(j5, j6, j3, (i & 8) != 0 ? pointsEarned.totalPointsEarned : j4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAirfare() {
        return this.airfare;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAncillaries() {
        return this.ancillaries;
    }

    /* renamed from: component3, reason: from getter */
    public final long getComboBonus() {
        return this.comboBonus;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTotalPointsEarned() {
        return this.totalPointsEarned;
    }

    public final PointsEarned copy(long airfare, long ancillaries, long comboBonus, long totalPointsEarned) {
        return new PointsEarned(airfare, ancillaries, comboBonus, totalPointsEarned);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointsEarned)) {
            return false;
        }
        PointsEarned pointsEarned = (PointsEarned) other;
        return this.airfare == pointsEarned.airfare && this.ancillaries == pointsEarned.ancillaries && this.comboBonus == pointsEarned.comboBonus && this.totalPointsEarned == pointsEarned.totalPointsEarned;
    }

    public final long getAirfare() {
        return this.airfare;
    }

    public final long getAncillaries() {
        return this.ancillaries;
    }

    public final long getComboBonus() {
        return this.comboBonus;
    }

    public final long getTotalPointsEarned() {
        return this.totalPointsEarned;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.airfare) * 31) + Long.hashCode(this.ancillaries)) * 31) + Long.hashCode(this.comboBonus)) * 31) + Long.hashCode(this.totalPointsEarned);
    }

    public String toString() {
        return "PointsEarned(airfare=" + this.airfare + ", ancillaries=" + this.ancillaries + ", comboBonus=" + this.comboBonus + ", totalPointsEarned=" + this.totalPointsEarned + ")";
    }
}
