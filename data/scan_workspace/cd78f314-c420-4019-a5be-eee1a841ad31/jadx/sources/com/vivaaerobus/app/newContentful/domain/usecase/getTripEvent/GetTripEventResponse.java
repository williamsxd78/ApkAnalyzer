package com.vivaaerobus.app.newContentful.domain.usecase.getTripEvent;

import com.vivaaerobus.app.newContentful.domain.models.TripEvent;
import kotlin.Metadata;

/* compiled from: GetTripEventResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/usecase/getTripEvent/GetTripEventResponse;", "", "event", "Lcom/vivaaerobus/app/newContentful/domain/models/TripEvent;", "<init>", "(Lcom/vivaaerobus/app/newContentful/domain/models/TripEvent;)V", "getEvent", "()Lcom/vivaaerobus/app/newContentful/domain/models/TripEvent;", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetTripEventResponse {
    private final TripEvent event;

    public GetTripEventResponse(TripEvent tripEvent) {
        this.event = tripEvent;
    }

    public final TripEvent getEvent() {
        return this.event;
    }
}
