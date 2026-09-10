package com.vivaaerobus.app.components.booking.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchFlight.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/vivaaerobus/app/components/booking/model/SearchFlight;", "", "originCode", "", "destinationCode", "date", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getOriginCode", "()Ljava/lang/String;", "getDestinationCode", "getDate", "()Ljava/util/Date;", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchFlight {
    public static final int $stable = 8;
    private final Date date;
    private final String destinationCode;
    private final String originCode;

    public SearchFlight(String originCode, String destinationCode, Date date) {
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(date, "date");
        this.originCode = originCode;
        this.destinationCode = destinationCode;
        this.date = date;
    }

    public static /* synthetic */ SearchFlight copy$default(SearchFlight searchFlight, String str, String str2, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchFlight.originCode;
        }
        if ((i & 2) != 0) {
            str2 = searchFlight.destinationCode;
        }
        if ((i & 4) != 0) {
            date = searchFlight.date;
        }
        return searchFlight.copy(str, str2, date);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginCode() {
        return this.originCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDestinationCode() {
        return this.destinationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    public final SearchFlight copy(String originCode, String destinationCode, Date date) {
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(date, "date");
        return new SearchFlight(originCode, destinationCode, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchFlight)) {
            return false;
        }
        SearchFlight searchFlight = (SearchFlight) other;
        return Intrinsics.areEqual(this.originCode, searchFlight.originCode) && Intrinsics.areEqual(this.destinationCode, searchFlight.destinationCode) && Intrinsics.areEqual(this.date, searchFlight.date);
    }

    public final Date getDate() {
        return this.date;
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getOriginCode() {
        return this.originCode;
    }

    public int hashCode() {
        return (((this.originCode.hashCode() * 31) + this.destinationCode.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "SearchFlight(originCode=" + this.originCode + ", destinationCode=" + this.destinationCode + ", date=" + this.date + ")";
    }
}
