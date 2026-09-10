package com.vivaaerobus.app.shared.booking.domain.useCase.getBookingFull;

import dev.jaque.libs.core.domain.Failure;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GetBookingFullFailure.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/useCase/getBookingFull/GetBookingFullFailure;", "Ldev/jaque/libs/core/domain/Failure;", "<init>", "()V", "NullParamsFailure", "Lcom/vivaaerobus/app/shared/booking/domain/useCase/getBookingFull/GetBookingFullFailure$NullParamsFailure;", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class GetBookingFullFailure extends Failure {

    /* compiled from: GetBookingFullFailure.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/useCase/getBookingFull/GetBookingFullFailure$NullParamsFailure;", "Lcom/vivaaerobus/app/shared/booking/domain/useCase/getBookingFull/GetBookingFullFailure;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class NullParamsFailure extends GetBookingFullFailure {
        public static final NullParamsFailure INSTANCE = new NullParamsFailure();

        private NullParamsFailure() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NullParamsFailure)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1110062805;
        }

        public String toString() {
            return "NullParamsFailure";
        }
    }

    private GetBookingFullFailure() {
    }

    public /* synthetic */ GetBookingFullFailure(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
