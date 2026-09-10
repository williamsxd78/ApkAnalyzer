package com.vivaaerobus.app.seats.domain.model;

import com.tealium.core.persistence.i0;
import kotlin.Metadata;

/* compiled from: Seat.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/seats/domain/model/Seat;", "", "number", "", "getNumber", "()Ljava/lang/String;", "column", "getColumn", "row", "", "getRow", "()I", i0.a.b, "getKey", "seats_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Seat {
    String getColumn();

    String getKey();

    String getNumber();

    int getRow();
}
