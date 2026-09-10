package com.vivaaerobus.app.shared.booking.domain.entity.changeJourneys;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JourneyChange.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/changeJourneys/JourneyChange;", "", "fareAvailabilityKey", "", "journeyKeyToAdd", "journeyKeyToDelete", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFareAvailabilityKey", "()Ljava/lang/String;", "getJourneyKeyToAdd", "getJourneyKeyToDelete", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class JourneyChange {
    private final String fareAvailabilityKey;
    private final String journeyKeyToAdd;
    private final String journeyKeyToDelete;

    public JourneyChange(String fareAvailabilityKey, String journeyKeyToAdd, String journeyKeyToDelete) {
        Intrinsics.checkNotNullParameter(fareAvailabilityKey, "fareAvailabilityKey");
        Intrinsics.checkNotNullParameter(journeyKeyToAdd, "journeyKeyToAdd");
        Intrinsics.checkNotNullParameter(journeyKeyToDelete, "journeyKeyToDelete");
        this.fareAvailabilityKey = fareAvailabilityKey;
        this.journeyKeyToAdd = journeyKeyToAdd;
        this.journeyKeyToDelete = journeyKeyToDelete;
    }

    public static /* synthetic */ JourneyChange copy$default(JourneyChange journeyChange, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = journeyChange.fareAvailabilityKey;
        }
        if ((i & 2) != 0) {
            str2 = journeyChange.journeyKeyToAdd;
        }
        if ((i & 4) != 0) {
            str3 = journeyChange.journeyKeyToDelete;
        }
        return journeyChange.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFareAvailabilityKey() {
        return this.fareAvailabilityKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getJourneyKeyToAdd() {
        return this.journeyKeyToAdd;
    }

    /* renamed from: component3, reason: from getter */
    public final String getJourneyKeyToDelete() {
        return this.journeyKeyToDelete;
    }

    public final JourneyChange copy(String fareAvailabilityKey, String journeyKeyToAdd, String journeyKeyToDelete) {
        Intrinsics.checkNotNullParameter(fareAvailabilityKey, "fareAvailabilityKey");
        Intrinsics.checkNotNullParameter(journeyKeyToAdd, "journeyKeyToAdd");
        Intrinsics.checkNotNullParameter(journeyKeyToDelete, "journeyKeyToDelete");
        return new JourneyChange(fareAvailabilityKey, journeyKeyToAdd, journeyKeyToDelete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JourneyChange)) {
            return false;
        }
        JourneyChange journeyChange = (JourneyChange) other;
        return Intrinsics.areEqual(this.fareAvailabilityKey, journeyChange.fareAvailabilityKey) && Intrinsics.areEqual(this.journeyKeyToAdd, journeyChange.journeyKeyToAdd) && Intrinsics.areEqual(this.journeyKeyToDelete, journeyChange.journeyKeyToDelete);
    }

    public final String getFareAvailabilityKey() {
        return this.fareAvailabilityKey;
    }

    public final String getJourneyKeyToAdd() {
        return this.journeyKeyToAdd;
    }

    public final String getJourneyKeyToDelete() {
        return this.journeyKeyToDelete;
    }

    public int hashCode() {
        return (((this.fareAvailabilityKey.hashCode() * 31) + this.journeyKeyToAdd.hashCode()) * 31) + this.journeyKeyToDelete.hashCode();
    }

    public String toString() {
        return "JourneyChange(fareAvailabilityKey=" + this.fareAvailabilityKey + ", journeyKeyToAdd=" + this.journeyKeyToAdd + ", journeyKeyToDelete=" + this.journeyKeyToDelete + ")";
    }
}
