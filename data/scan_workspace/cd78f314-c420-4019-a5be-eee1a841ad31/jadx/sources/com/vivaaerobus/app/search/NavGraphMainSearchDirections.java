package com.vivaaerobus.app.search;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.navigation.links.DeepLinksConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NavGraphMainSearchDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/vivaaerobus/app/search/NavGraphMainSearchDirections;", "", "<init>", "()V", "ActionGlobalNavGraphBaggage", "ActionGlobalNavGraphSeats", "Companion", "search_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NavGraphMainSearchDirections {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavGraphMainSearchDirections.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\fHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/vivaaerobus/app/search/NavGraphMainSearchDirections$ActionGlobalNavGraphBaggage;", "Landroidx/navigation/NavDirections;", "fromBooking", "", DeepLinksConstants.IS_VIVA_FAN_FARE_PARAM, "fromBookingPayment", "<init>", "(ZZZ)V", "getFromBooking", "()Z", "getFromBookingPayment", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "", "hashCode", "toString", "", "search_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class ActionGlobalNavGraphBaggage implements NavDirections {
        private final int actionId;
        private final boolean fromBooking;
        private final boolean fromBookingPayment;
        private final boolean isVivaFanFare;

        public ActionGlobalNavGraphBaggage() {
            this(false, false, false, 7, null);
        }

        public ActionGlobalNavGraphBaggage(boolean z, boolean z2, boolean z3) {
            this.fromBooking = z;
            this.isVivaFanFare = z2;
            this.fromBookingPayment = z3;
            this.actionId = R.id.action_global_nav_graph_baggage;
        }

        public /* synthetic */ ActionGlobalNavGraphBaggage(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }

        public static /* synthetic */ ActionGlobalNavGraphBaggage copy$default(ActionGlobalNavGraphBaggage actionGlobalNavGraphBaggage, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = actionGlobalNavGraphBaggage.fromBooking;
            }
            if ((i & 2) != 0) {
                z2 = actionGlobalNavGraphBaggage.isVivaFanFare;
            }
            if ((i & 4) != 0) {
                z3 = actionGlobalNavGraphBaggage.fromBookingPayment;
            }
            return actionGlobalNavGraphBaggage.copy(z, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getFromBooking() {
            return this.fromBooking;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsVivaFanFare() {
            return this.isVivaFanFare;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getFromBookingPayment() {
            return this.fromBookingPayment;
        }

        public final ActionGlobalNavGraphBaggage copy(boolean fromBooking, boolean isVivaFanFare, boolean fromBookingPayment) {
            return new ActionGlobalNavGraphBaggage(fromBooking, isVivaFanFare, fromBookingPayment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionGlobalNavGraphBaggage)) {
                return false;
            }
            ActionGlobalNavGraphBaggage actionGlobalNavGraphBaggage = (ActionGlobalNavGraphBaggage) other;
            return this.fromBooking == actionGlobalNavGraphBaggage.fromBooking && this.isVivaFanFare == actionGlobalNavGraphBaggage.isVivaFanFare && this.fromBookingPayment == actionGlobalNavGraphBaggage.fromBookingPayment;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromBooking", this.fromBooking);
            bundle.putBoolean(DeepLinksConstants.IS_VIVA_FAN_FARE_PARAM, this.isVivaFanFare);
            bundle.putBoolean("fromBookingPayment", this.fromBookingPayment);
            return bundle;
        }

        public final boolean getFromBooking() {
            return this.fromBooking;
        }

        public final boolean getFromBookingPayment() {
            return this.fromBookingPayment;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.fromBooking) * 31) + Boolean.hashCode(this.isVivaFanFare)) * 31) + Boolean.hashCode(this.fromBookingPayment);
        }

        public final boolean isVivaFanFare() {
            return this.isVivaFanFare;
        }

        public String toString() {
            return "ActionGlobalNavGraphBaggage(fromBooking=" + this.fromBooking + ", isVivaFanFare=" + this.isVivaFanFare + ", fromBookingPayment=" + this.fromBookingPayment + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavGraphMainSearchDirections.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/vivaaerobus/app/search/NavGraphMainSearchDirections$ActionGlobalNavGraphSeats;", "Landroidx/navigation/NavDirections;", "fromBooking", "", "<init>", "(Z)V", "getFromBooking", "()Z", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "", "hashCode", "toString", "", "search_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class ActionGlobalNavGraphSeats implements NavDirections {
        private final int actionId;
        private final boolean fromBooking;

        public ActionGlobalNavGraphSeats() {
            this(false, 1, null);
        }

        public ActionGlobalNavGraphSeats(boolean z) {
            this.fromBooking = z;
            this.actionId = R.id.action_global_nav_graph_seats;
        }

        public /* synthetic */ ActionGlobalNavGraphSeats(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public static /* synthetic */ ActionGlobalNavGraphSeats copy$default(ActionGlobalNavGraphSeats actionGlobalNavGraphSeats, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = actionGlobalNavGraphSeats.fromBooking;
            }
            return actionGlobalNavGraphSeats.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getFromBooking() {
            return this.fromBooking;
        }

        public final ActionGlobalNavGraphSeats copy(boolean fromBooking) {
            return new ActionGlobalNavGraphSeats(fromBooking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionGlobalNavGraphSeats) && this.fromBooking == ((ActionGlobalNavGraphSeats) other).fromBooking;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromBooking", this.fromBooking);
            return bundle;
        }

        public final boolean getFromBooking() {
            return this.fromBooking;
        }

        public int hashCode() {
            return Boolean.hashCode(this.fromBooking);
        }

        public String toString() {
            return "ActionGlobalNavGraphSeats(fromBooking=" + this.fromBooking + ")";
        }
    }

    /* compiled from: NavGraphMainSearchDirections.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/vivaaerobus/app/search/NavGraphMainSearchDirections$Companion;", "", "<init>", "()V", "actionGlobalNavGraphBaggage", "Landroidx/navigation/NavDirections;", "fromBooking", "", DeepLinksConstants.IS_VIVA_FAN_FARE_PARAM, "fromBookingPayment", "actionGlobalNavGraphSeats", "search_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NavDirections actionGlobalNavGraphBaggage$default(Companion companion, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                z3 = false;
            }
            return companion.actionGlobalNavGraphBaggage(z, z2, z3);
        }

        public static /* synthetic */ NavDirections actionGlobalNavGraphSeats$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.actionGlobalNavGraphSeats(z);
        }

        public final NavDirections actionGlobalNavGraphBaggage(boolean fromBooking, boolean isVivaFanFare, boolean fromBookingPayment) {
            return new ActionGlobalNavGraphBaggage(fromBooking, isVivaFanFare, fromBookingPayment);
        }

        public final NavDirections actionGlobalNavGraphSeats(boolean fromBooking) {
            return new ActionGlobalNavGraphSeats(fromBooking);
        }
    }

    private NavGraphMainSearchDirections() {
    }
}
