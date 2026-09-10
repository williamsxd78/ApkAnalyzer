package com.vivaaerobus.app.booking.presentation.mainFragment.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BookerDynamicLinkParams.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0014\u0010*\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001e¨\u0006."}, d2 = {"Lcom/vivaaerobus/app/booking/presentation/mainFragment/model/BookerDynamicLinkParams;", "", "firstOrigin", "", "firstDestination", "firstDate", "Ljava/util/Date;", "lastOrigin", "lastDestination", "lastDate", "adultsCount", "", "childrenCount", "infantsCount", "isGlobal", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;IIIZ)V", "getFirstOrigin", "()Ljava/lang/String;", "getFirstDestination", "getFirstDate", "()Ljava/util/Date;", "getLastOrigin", "getLastDestination", "getLastDate", "getAdultsCount", "()I", "getChildrenCount", "getInfantsCount", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BookerDynamicLinkParams {
    public static final int $stable = 8;
    private final int adultsCount;
    private final int childrenCount;
    private final Date firstDate;
    private final String firstDestination;
    private final String firstOrigin;
    private final int infantsCount;
    private final boolean isGlobal;
    private final Date lastDate;
    private final String lastDestination;
    private final String lastOrigin;

    public BookerDynamicLinkParams(String firstOrigin, String firstDestination, Date firstDate, String str, String str2, Date date, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(firstOrigin, "firstOrigin");
        Intrinsics.checkNotNullParameter(firstDestination, "firstDestination");
        Intrinsics.checkNotNullParameter(firstDate, "firstDate");
        this.firstOrigin = firstOrigin;
        this.firstDestination = firstDestination;
        this.firstDate = firstDate;
        this.lastOrigin = str;
        this.lastDestination = str2;
        this.lastDate = date;
        this.adultsCount = i;
        this.childrenCount = i2;
        this.infantsCount = i3;
        this.isGlobal = z;
    }

    public static /* synthetic */ BookerDynamicLinkParams copy$default(BookerDynamicLinkParams bookerDynamicLinkParams, String str, String str2, Date date, String str3, String str4, Date date2, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bookerDynamicLinkParams.firstOrigin;
        }
        if ((i4 & 2) != 0) {
            str2 = bookerDynamicLinkParams.firstDestination;
        }
        if ((i4 & 4) != 0) {
            date = bookerDynamicLinkParams.firstDate;
        }
        if ((i4 & 8) != 0) {
            str3 = bookerDynamicLinkParams.lastOrigin;
        }
        if ((i4 & 16) != 0) {
            str4 = bookerDynamicLinkParams.lastDestination;
        }
        if ((i4 & 32) != 0) {
            date2 = bookerDynamicLinkParams.lastDate;
        }
        if ((i4 & 64) != 0) {
            i = bookerDynamicLinkParams.adultsCount;
        }
        if ((i4 & 128) != 0) {
            i2 = bookerDynamicLinkParams.childrenCount;
        }
        if ((i4 & 256) != 0) {
            i3 = bookerDynamicLinkParams.infantsCount;
        }
        if ((i4 & 512) != 0) {
            z = bookerDynamicLinkParams.isGlobal;
        }
        int i5 = i3;
        boolean z2 = z;
        int i6 = i;
        int i7 = i2;
        String str5 = str4;
        Date date3 = date2;
        return bookerDynamicLinkParams.copy(str, str2, date, str3, str5, date3, i6, i7, i5, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstOrigin() {
        return this.firstOrigin;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsGlobal() {
        return this.isGlobal;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFirstDestination() {
        return this.firstDestination;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getFirstDate() {
        return this.firstDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastOrigin() {
        return this.lastOrigin;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLastDestination() {
        return this.lastDestination;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getLastDate() {
        return this.lastDate;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAdultsCount() {
        return this.adultsCount;
    }

    /* renamed from: component8, reason: from getter */
    public final int getChildrenCount() {
        return this.childrenCount;
    }

    /* renamed from: component9, reason: from getter */
    public final int getInfantsCount() {
        return this.infantsCount;
    }

    public final BookerDynamicLinkParams copy(String firstOrigin, String firstDestination, Date firstDate, String lastOrigin, String lastDestination, Date lastDate, int adultsCount, int childrenCount, int infantsCount, boolean isGlobal) {
        Intrinsics.checkNotNullParameter(firstOrigin, "firstOrigin");
        Intrinsics.checkNotNullParameter(firstDestination, "firstDestination");
        Intrinsics.checkNotNullParameter(firstDate, "firstDate");
        return new BookerDynamicLinkParams(firstOrigin, firstDestination, firstDate, lastOrigin, lastDestination, lastDate, adultsCount, childrenCount, infantsCount, isGlobal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookerDynamicLinkParams)) {
            return false;
        }
        BookerDynamicLinkParams bookerDynamicLinkParams = (BookerDynamicLinkParams) other;
        return Intrinsics.areEqual(this.firstOrigin, bookerDynamicLinkParams.firstOrigin) && Intrinsics.areEqual(this.firstDestination, bookerDynamicLinkParams.firstDestination) && Intrinsics.areEqual(this.firstDate, bookerDynamicLinkParams.firstDate) && Intrinsics.areEqual(this.lastOrigin, bookerDynamicLinkParams.lastOrigin) && Intrinsics.areEqual(this.lastDestination, bookerDynamicLinkParams.lastDestination) && Intrinsics.areEqual(this.lastDate, bookerDynamicLinkParams.lastDate) && this.adultsCount == bookerDynamicLinkParams.adultsCount && this.childrenCount == bookerDynamicLinkParams.childrenCount && this.infantsCount == bookerDynamicLinkParams.infantsCount && this.isGlobal == bookerDynamicLinkParams.isGlobal;
    }

    public final int getAdultsCount() {
        return this.adultsCount;
    }

    public final int getChildrenCount() {
        return this.childrenCount;
    }

    public final Date getFirstDate() {
        return this.firstDate;
    }

    public final String getFirstDestination() {
        return this.firstDestination;
    }

    public final String getFirstOrigin() {
        return this.firstOrigin;
    }

    public final int getInfantsCount() {
        return this.infantsCount;
    }

    public final Date getLastDate() {
        return this.lastDate;
    }

    public final String getLastDestination() {
        return this.lastDestination;
    }

    public final String getLastOrigin() {
        return this.lastOrigin;
    }

    public int hashCode() {
        int hashCode = ((((this.firstOrigin.hashCode() * 31) + this.firstDestination.hashCode()) * 31) + this.firstDate.hashCode()) * 31;
        String str = this.lastOrigin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastDestination;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.lastDate;
        return ((((((((hashCode3 + (date != null ? date.hashCode() : 0)) * 31) + Integer.hashCode(this.adultsCount)) * 31) + Integer.hashCode(this.childrenCount)) * 31) + Integer.hashCode(this.infantsCount)) * 31) + Boolean.hashCode(this.isGlobal);
    }

    public final boolean isGlobal() {
        return this.isGlobal;
    }

    public String toString() {
        return "BookerDynamicLinkParams(firstOrigin=" + this.firstOrigin + ", firstDestination=" + this.firstDestination + ", firstDate=" + this.firstDate + ", lastOrigin=" + this.lastOrigin + ", lastDestination=" + this.lastDestination + ", lastDate=" + this.lastDate + ", adultsCount=" + this.adultsCount + ", childrenCount=" + this.childrenCount + ", infantsCount=" + this.infantsCount + ", isGlobal=" + this.isGlobal + ")";
    }
}
