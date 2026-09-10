package com.vivaaerobus.app.shared.booking.domain.entity.bookingFull;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BookingFullEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bookingFull/BookingFullEvent;", "", "eventCode", "", "zoneCode", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventCode", "()Ljava/lang/String;", "getZoneCode", "getStartTime", "getEndTime", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BookingFullEvent {
    private final String endTime;
    private final String eventCode;
    private final String startTime;
    private final String zoneCode;

    public BookingFullEvent(String eventCode, String zoneCode, String startTime, String endTime) {
        Intrinsics.checkNotNullParameter(eventCode, "eventCode");
        Intrinsics.checkNotNullParameter(zoneCode, "zoneCode");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        this.eventCode = eventCode;
        this.zoneCode = zoneCode;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static /* synthetic */ BookingFullEvent copy$default(BookingFullEvent bookingFullEvent, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bookingFullEvent.eventCode;
        }
        if ((i & 2) != 0) {
            str2 = bookingFullEvent.zoneCode;
        }
        if ((i & 4) != 0) {
            str3 = bookingFullEvent.startTime;
        }
        if ((i & 8) != 0) {
            str4 = bookingFullEvent.endTime;
        }
        return bookingFullEvent.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventCode() {
        return this.eventCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getZoneCode() {
        return this.zoneCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    public final BookingFullEvent copy(String eventCode, String zoneCode, String startTime, String endTime) {
        Intrinsics.checkNotNullParameter(eventCode, "eventCode");
        Intrinsics.checkNotNullParameter(zoneCode, "zoneCode");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        return new BookingFullEvent(eventCode, zoneCode, startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookingFullEvent)) {
            return false;
        }
        BookingFullEvent bookingFullEvent = (BookingFullEvent) other;
        return Intrinsics.areEqual(this.eventCode, bookingFullEvent.eventCode) && Intrinsics.areEqual(this.zoneCode, bookingFullEvent.zoneCode) && Intrinsics.areEqual(this.startTime, bookingFullEvent.startTime) && Intrinsics.areEqual(this.endTime, bookingFullEvent.endTime);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getEventCode() {
        return this.eventCode;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getZoneCode() {
        return this.zoneCode;
    }

    public int hashCode() {
        return (((((this.eventCode.hashCode() * 31) + this.zoneCode.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
    }

    public String toString() {
        return "BookingFullEvent(eventCode=" + this.eventCode + ", zoneCode=" + this.zoneCode + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
