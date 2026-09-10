package com.vivaaerobus.app.selectSeats.presentation.seatsSummary.adapter.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CancelSeatsMode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/vivaaerobus/app/selectSeats/presentation/seatsSummary/adapter/model/CancelSeatsMode;", "", "<init>", "()V", "CancelSeatsAll", "CancelSeatsFew", "Lcom/vivaaerobus/app/selectSeats/presentation/seatsSummary/adapter/model/CancelSeatsMode$CancelSeatsAll;", "Lcom/vivaaerobus/app/selectSeats/presentation/seatsSummary/adapter/model/CancelSeatsMode$CancelSeatsFew;", "seats_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CancelSeatsMode {
    public static final int $stable = 0;

    /* compiled from: CancelSeatsMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vivaaerobus/app/selectSeats/presentation/seatsSummary/adapter/model/CancelSeatsMode$CancelSeatsAll;", "Lcom/vivaaerobus/app/selectSeats/presentation/seatsSummary/adapter/model/CancelSeatsMode;", "<init>", "()V", "seats_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class CancelSeatsAll extends CancelSeatsMode {
        public static final int $stable = 0;
        public static final CancelSeatsAll INSTANCE = new CancelSeatsAll();

        private CancelSeatsAll() {
            super(null);
        }
    }

    /* compiled from: CancelSeatsMode.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/vivaaerobus/app/selectSeats/presentation/seatsSummary/adapter/model/CancelSeatsMode$CancelSeatsFew;", "Lcom/vivaaerobus/app/selectSeats/presentation/seatsSummary/adapter/model/CancelSeatsMode;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "", "hashCode", "toString", "", "seats_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CancelSeatsFew extends CancelSeatsMode {
        public static final int $stable = 0;
        private final int count;

        public CancelSeatsFew(int i) {
            super(null);
            this.count = i;
        }

        public static /* synthetic */ CancelSeatsFew copy$default(CancelSeatsFew cancelSeatsFew, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = cancelSeatsFew.count;
            }
            return cancelSeatsFew.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final CancelSeatsFew copy(int count) {
            return new CancelSeatsFew(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelSeatsFew) && this.count == ((CancelSeatsFew) other).count;
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        public String toString() {
            return "CancelSeatsFew(count=" + this.count + ")";
        }
    }

    private CancelSeatsMode() {
    }

    public /* synthetic */ CancelSeatsMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
