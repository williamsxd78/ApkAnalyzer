package com.vivaaerobus.app.analytics.presentation.events.params;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BookingSearchEventParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/events/params/BookingSearchEventParams;", "", "eventType", "", "searchInfoPath", "originIata", "finalDestinationIata", "originFriendly", "finalDestinationFriendly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getSearchInfoPath", "getOriginIata", "getFinalDestinationIata", "getOriginFriendly", "getFinalDestinationFriendly", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BookingSearchEventParams {
    private final String eventType;
    private final String finalDestinationFriendly;
    private final String finalDestinationIata;
    private final String originFriendly;
    private final String originIata;
    private final String searchInfoPath;

    public BookingSearchEventParams(String eventType, String searchInfoPath, String originIata, String finalDestinationIata, String originFriendly, String finalDestinationFriendly) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(searchInfoPath, "searchInfoPath");
        Intrinsics.checkNotNullParameter(originIata, "originIata");
        Intrinsics.checkNotNullParameter(finalDestinationIata, "finalDestinationIata");
        Intrinsics.checkNotNullParameter(originFriendly, "originFriendly");
        Intrinsics.checkNotNullParameter(finalDestinationFriendly, "finalDestinationFriendly");
        this.eventType = eventType;
        this.searchInfoPath = searchInfoPath;
        this.originIata = originIata;
        this.finalDestinationIata = finalDestinationIata;
        this.originFriendly = originFriendly;
        this.finalDestinationFriendly = finalDestinationFriendly;
    }

    public static /* synthetic */ BookingSearchEventParams copy$default(BookingSearchEventParams bookingSearchEventParams, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bookingSearchEventParams.eventType;
        }
        if ((i & 2) != 0) {
            str2 = bookingSearchEventParams.searchInfoPath;
        }
        if ((i & 4) != 0) {
            str3 = bookingSearchEventParams.originIata;
        }
        if ((i & 8) != 0) {
            str4 = bookingSearchEventParams.finalDestinationIata;
        }
        if ((i & 16) != 0) {
            str5 = bookingSearchEventParams.originFriendly;
        }
        if ((i & 32) != 0) {
            str6 = bookingSearchEventParams.finalDestinationFriendly;
        }
        String str7 = str5;
        String str8 = str6;
        return bookingSearchEventParams.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSearchInfoPath() {
        return this.searchInfoPath;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginIata() {
        return this.originIata;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFinalDestinationIata() {
        return this.finalDestinationIata;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOriginFriendly() {
        return this.originFriendly;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFinalDestinationFriendly() {
        return this.finalDestinationFriendly;
    }

    public final BookingSearchEventParams copy(String eventType, String searchInfoPath, String originIata, String finalDestinationIata, String originFriendly, String finalDestinationFriendly) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(searchInfoPath, "searchInfoPath");
        Intrinsics.checkNotNullParameter(originIata, "originIata");
        Intrinsics.checkNotNullParameter(finalDestinationIata, "finalDestinationIata");
        Intrinsics.checkNotNullParameter(originFriendly, "originFriendly");
        Intrinsics.checkNotNullParameter(finalDestinationFriendly, "finalDestinationFriendly");
        return new BookingSearchEventParams(eventType, searchInfoPath, originIata, finalDestinationIata, originFriendly, finalDestinationFriendly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookingSearchEventParams)) {
            return false;
        }
        BookingSearchEventParams bookingSearchEventParams = (BookingSearchEventParams) other;
        return Intrinsics.areEqual(this.eventType, bookingSearchEventParams.eventType) && Intrinsics.areEqual(this.searchInfoPath, bookingSearchEventParams.searchInfoPath) && Intrinsics.areEqual(this.originIata, bookingSearchEventParams.originIata) && Intrinsics.areEqual(this.finalDestinationIata, bookingSearchEventParams.finalDestinationIata) && Intrinsics.areEqual(this.originFriendly, bookingSearchEventParams.originFriendly) && Intrinsics.areEqual(this.finalDestinationFriendly, bookingSearchEventParams.finalDestinationFriendly);
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getFinalDestinationFriendly() {
        return this.finalDestinationFriendly;
    }

    public final String getFinalDestinationIata() {
        return this.finalDestinationIata;
    }

    public final String getOriginFriendly() {
        return this.originFriendly;
    }

    public final String getOriginIata() {
        return this.originIata;
    }

    public final String getSearchInfoPath() {
        return this.searchInfoPath;
    }

    public int hashCode() {
        return (((((((((this.eventType.hashCode() * 31) + this.searchInfoPath.hashCode()) * 31) + this.originIata.hashCode()) * 31) + this.finalDestinationIata.hashCode()) * 31) + this.originFriendly.hashCode()) * 31) + this.finalDestinationFriendly.hashCode();
    }

    public String toString() {
        return "BookingSearchEventParams(eventType=" + this.eventType + ", searchInfoPath=" + this.searchInfoPath + ", originIata=" + this.originIata + ", finalDestinationIata=" + this.finalDestinationIata + ", originFriendly=" + this.originFriendly + ", finalDestinationFriendly=" + this.finalDestinationFriendly + ")";
    }
}
