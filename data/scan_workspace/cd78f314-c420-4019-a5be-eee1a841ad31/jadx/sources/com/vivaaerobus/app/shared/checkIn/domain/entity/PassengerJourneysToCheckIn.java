package com.vivaaerobus.app.shared.checkIn.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassengerJourneysToCheckIn.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/shared/checkIn/domain/entity/PassengerJourneysToCheckIn;", "", "journeyKey", "", "passengerKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getJourneyKey", "()Ljava/lang/String;", "getPassengerKey", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "checkIn_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PassengerJourneysToCheckIn {
    private final String journeyKey;
    private final String passengerKey;

    public PassengerJourneysToCheckIn(String journeyKey, String passengerKey) {
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        Intrinsics.checkNotNullParameter(passengerKey, "passengerKey");
        this.journeyKey = journeyKey;
        this.passengerKey = passengerKey;
    }

    public static /* synthetic */ PassengerJourneysToCheckIn copy$default(PassengerJourneysToCheckIn passengerJourneysToCheckIn, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passengerJourneysToCheckIn.journeyKey;
        }
        if ((i & 2) != 0) {
            str2 = passengerJourneysToCheckIn.passengerKey;
        }
        return passengerJourneysToCheckIn.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getJourneyKey() {
        return this.journeyKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassengerKey() {
        return this.passengerKey;
    }

    public final PassengerJourneysToCheckIn copy(String journeyKey, String passengerKey) {
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        Intrinsics.checkNotNullParameter(passengerKey, "passengerKey");
        return new PassengerJourneysToCheckIn(journeyKey, passengerKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengerJourneysToCheckIn)) {
            return false;
        }
        PassengerJourneysToCheckIn passengerJourneysToCheckIn = (PassengerJourneysToCheckIn) other;
        return Intrinsics.areEqual(this.journeyKey, passengerJourneysToCheckIn.journeyKey) && Intrinsics.areEqual(this.passengerKey, passengerJourneysToCheckIn.passengerKey);
    }

    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public final String getPassengerKey() {
        return this.passengerKey;
    }

    public int hashCode() {
        return (this.journeyKey.hashCode() * 31) + this.passengerKey.hashCode();
    }

    public String toString() {
        return "PassengerJourneysToCheckIn(journeyKey=" + this.journeyKey + ", passengerKey=" + this.passengerKey + ")";
    }
}
