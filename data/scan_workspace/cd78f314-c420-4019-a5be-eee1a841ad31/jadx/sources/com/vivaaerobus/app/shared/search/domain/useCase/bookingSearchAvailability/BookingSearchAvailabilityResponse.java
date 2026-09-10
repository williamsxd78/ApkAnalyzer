package com.vivaaerobus.app.shared.search.domain.useCase.bookingSearchAvailability;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: BookingSearchAvailabilityResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/shared/search/domain/useCase/bookingSearchAvailability/BookingSearchAvailabilityResponse;", "", "isSearchAvailable", "", "numberOfAvailableJourneys", "", "<init>", "(ZI)V", "()Z", "getNumberOfAvailableJourneys", "()I", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "toString", "", "search_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BookingSearchAvailabilityResponse {
    private final boolean isSearchAvailable;
    private final int numberOfAvailableJourneys;

    public BookingSearchAvailabilityResponse(boolean z, int i) {
        this.isSearchAvailable = z;
        this.numberOfAvailableJourneys = i;
    }

    public static /* synthetic */ BookingSearchAvailabilityResponse copy$default(BookingSearchAvailabilityResponse bookingSearchAvailabilityResponse, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = bookingSearchAvailabilityResponse.isSearchAvailable;
        }
        if ((i2 & 2) != 0) {
            i = bookingSearchAvailabilityResponse.numberOfAvailableJourneys;
        }
        return bookingSearchAvailabilityResponse.copy(z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSearchAvailable() {
        return this.isSearchAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOfAvailableJourneys() {
        return this.numberOfAvailableJourneys;
    }

    public final BookingSearchAvailabilityResponse copy(boolean isSearchAvailable, int numberOfAvailableJourneys) {
        return new BookingSearchAvailabilityResponse(isSearchAvailable, numberOfAvailableJourneys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookingSearchAvailabilityResponse)) {
            return false;
        }
        BookingSearchAvailabilityResponse bookingSearchAvailabilityResponse = (BookingSearchAvailabilityResponse) other;
        return this.isSearchAvailable == bookingSearchAvailabilityResponse.isSearchAvailable && this.numberOfAvailableJourneys == bookingSearchAvailabilityResponse.numberOfAvailableJourneys;
    }

    public final int getNumberOfAvailableJourneys() {
        return this.numberOfAvailableJourneys;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSearchAvailable) * 31) + Integer.hashCode(this.numberOfAvailableJourneys);
    }

    public final boolean isSearchAvailable() {
        return this.isSearchAvailable;
    }

    public String toString() {
        return "BookingSearchAvailabilityResponse(isSearchAvailable=" + this.isSearchAvailable + ", numberOfAvailableJourneys=" + this.numberOfAvailableJourneys + ")";
    }
}
