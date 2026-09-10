package com.vivaaerobus.app.bookingPayment.presentation.passengersSummary.adapter.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassengerSummaryData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/vivaaerobus/app/bookingPayment/presentation/passengersSummary/adapter/model/PassengerSummaryData;", "", "passengerName", "", "passengerType", "isVivaFan", "", "hasDisability", "isSmileAndFly", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getPassengerName", "()Ljava/lang/String;", "getPassengerType", "()Z", "getHasDisability", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "bookingPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PassengerSummaryData {
    public static final int $stable = 0;
    private final boolean hasDisability;
    private final boolean isSmileAndFly;
    private final boolean isVivaFan;
    private final String passengerName;
    private final String passengerType;

    public PassengerSummaryData(String passengerName, String passengerType, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(passengerName, "passengerName");
        Intrinsics.checkNotNullParameter(passengerType, "passengerType");
        this.passengerName = passengerName;
        this.passengerType = passengerType;
        this.isVivaFan = z;
        this.hasDisability = z2;
        this.isSmileAndFly = z3;
    }

    public static /* synthetic */ PassengerSummaryData copy$default(PassengerSummaryData passengerSummaryData, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passengerSummaryData.passengerName;
        }
        if ((i & 2) != 0) {
            str2 = passengerSummaryData.passengerType;
        }
        if ((i & 4) != 0) {
            z = passengerSummaryData.isVivaFan;
        }
        if ((i & 8) != 0) {
            z2 = passengerSummaryData.hasDisability;
        }
        if ((i & 16) != 0) {
            z3 = passengerSummaryData.isSmileAndFly;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return passengerSummaryData.copy(str, str2, z5, z2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPassengerName() {
        return this.passengerName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassengerType() {
        return this.passengerType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVivaFan() {
        return this.isVivaFan;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasDisability() {
        return this.hasDisability;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSmileAndFly() {
        return this.isSmileAndFly;
    }

    public final PassengerSummaryData copy(String passengerName, String passengerType, boolean isVivaFan, boolean hasDisability, boolean isSmileAndFly) {
        Intrinsics.checkNotNullParameter(passengerName, "passengerName");
        Intrinsics.checkNotNullParameter(passengerType, "passengerType");
        return new PassengerSummaryData(passengerName, passengerType, isVivaFan, hasDisability, isSmileAndFly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengerSummaryData)) {
            return false;
        }
        PassengerSummaryData passengerSummaryData = (PassengerSummaryData) other;
        return Intrinsics.areEqual(this.passengerName, passengerSummaryData.passengerName) && Intrinsics.areEqual(this.passengerType, passengerSummaryData.passengerType) && this.isVivaFan == passengerSummaryData.isVivaFan && this.hasDisability == passengerSummaryData.hasDisability && this.isSmileAndFly == passengerSummaryData.isSmileAndFly;
    }

    public final boolean getHasDisability() {
        return this.hasDisability;
    }

    public final String getPassengerName() {
        return this.passengerName;
    }

    public final String getPassengerType() {
        return this.passengerType;
    }

    public int hashCode() {
        return (((((((this.passengerName.hashCode() * 31) + this.passengerType.hashCode()) * 31) + Boolean.hashCode(this.isVivaFan)) * 31) + Boolean.hashCode(this.hasDisability)) * 31) + Boolean.hashCode(this.isSmileAndFly);
    }

    public final boolean isSmileAndFly() {
        return this.isSmileAndFly;
    }

    public final boolean isVivaFan() {
        return this.isVivaFan;
    }

    public String toString() {
        return "PassengerSummaryData(passengerName=" + this.passengerName + ", passengerType=" + this.passengerType + ", isVivaFan=" + this.isVivaFan + ", hasDisability=" + this.hasDisability + ", isSmileAndFly=" + this.isSmileAndFly + ")";
    }
}
