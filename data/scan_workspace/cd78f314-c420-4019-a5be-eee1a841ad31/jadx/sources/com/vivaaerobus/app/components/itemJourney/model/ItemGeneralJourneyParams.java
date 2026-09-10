package com.vivaaerobus.app.components.itemJourney.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ItemGeneralJourneyParams.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003Jy\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/vivaaerobus/app/components/itemJourney/model/ItemGeneralJourneyParams;", "", "destinationShortName", "", "departureDate", "Ljava/util/Date;", "arrivalDate", "originCode", "arrivalCode", "arrivalSupportText", "copyCurrentFlight", "copyPreviousFlight", "flightNumbers", "", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDestinationShortName", "()Ljava/lang/String;", "getDepartureDate", "()Ljava/util/Date;", "getArrivalDate", "getOriginCode", "getArrivalCode", "getArrivalSupportText", "getCopyCurrentFlight", "getCopyPreviousFlight", "getFlightNumbers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ItemGeneralJourneyParams {
    public static final int $stable = 8;
    private final String arrivalCode;
    private final Date arrivalDate;
    private final String arrivalSupportText;
    private final String copyCurrentFlight;
    private final String copyPreviousFlight;
    private final Date departureDate;
    private final String destinationShortName;
    private final List<String> flightNumbers;
    private final String originCode;

    public ItemGeneralJourneyParams(String str, Date date, Date date2, String str2, String str3, String str4, String str5, String str6, List<String> flightNumbers) {
        Intrinsics.checkNotNullParameter(flightNumbers, "flightNumbers");
        this.destinationShortName = str;
        this.departureDate = date;
        this.arrivalDate = date2;
        this.originCode = str2;
        this.arrivalCode = str3;
        this.arrivalSupportText = str4;
        this.copyCurrentFlight = str5;
        this.copyPreviousFlight = str6;
        this.flightNumbers = flightNumbers;
    }

    public static /* synthetic */ ItemGeneralJourneyParams copy$default(ItemGeneralJourneyParams itemGeneralJourneyParams, String str, Date date, Date date2, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemGeneralJourneyParams.destinationShortName;
        }
        if ((i & 2) != 0) {
            date = itemGeneralJourneyParams.departureDate;
        }
        if ((i & 4) != 0) {
            date2 = itemGeneralJourneyParams.arrivalDate;
        }
        if ((i & 8) != 0) {
            str2 = itemGeneralJourneyParams.originCode;
        }
        if ((i & 16) != 0) {
            str3 = itemGeneralJourneyParams.arrivalCode;
        }
        if ((i & 32) != 0) {
            str4 = itemGeneralJourneyParams.arrivalSupportText;
        }
        if ((i & 64) != 0) {
            str5 = itemGeneralJourneyParams.copyCurrentFlight;
        }
        if ((i & 128) != 0) {
            str6 = itemGeneralJourneyParams.copyPreviousFlight;
        }
        if ((i & 256) != 0) {
            list = itemGeneralJourneyParams.flightNumbers;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        Date date3 = date2;
        return itemGeneralJourneyParams.copy(str, date, date3, str2, str10, str8, str9, str7, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDestinationShortName() {
        return this.destinationShortName;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getDepartureDate() {
        return this.departureDate;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getArrivalDate() {
        return this.arrivalDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOriginCode() {
        return this.originCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getArrivalCode() {
        return this.arrivalCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getArrivalSupportText() {
        return this.arrivalSupportText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCopyCurrentFlight() {
        return this.copyCurrentFlight;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCopyPreviousFlight() {
        return this.copyPreviousFlight;
    }

    public final List<String> component9() {
        return this.flightNumbers;
    }

    public final ItemGeneralJourneyParams copy(String destinationShortName, Date departureDate, Date arrivalDate, String originCode, String arrivalCode, String arrivalSupportText, String copyCurrentFlight, String copyPreviousFlight, List<String> flightNumbers) {
        Intrinsics.checkNotNullParameter(flightNumbers, "flightNumbers");
        return new ItemGeneralJourneyParams(destinationShortName, departureDate, arrivalDate, originCode, arrivalCode, arrivalSupportText, copyCurrentFlight, copyPreviousFlight, flightNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemGeneralJourneyParams)) {
            return false;
        }
        ItemGeneralJourneyParams itemGeneralJourneyParams = (ItemGeneralJourneyParams) other;
        return Intrinsics.areEqual(this.destinationShortName, itemGeneralJourneyParams.destinationShortName) && Intrinsics.areEqual(this.departureDate, itemGeneralJourneyParams.departureDate) && Intrinsics.areEqual(this.arrivalDate, itemGeneralJourneyParams.arrivalDate) && Intrinsics.areEqual(this.originCode, itemGeneralJourneyParams.originCode) && Intrinsics.areEqual(this.arrivalCode, itemGeneralJourneyParams.arrivalCode) && Intrinsics.areEqual(this.arrivalSupportText, itemGeneralJourneyParams.arrivalSupportText) && Intrinsics.areEqual(this.copyCurrentFlight, itemGeneralJourneyParams.copyCurrentFlight) && Intrinsics.areEqual(this.copyPreviousFlight, itemGeneralJourneyParams.copyPreviousFlight) && Intrinsics.areEqual(this.flightNumbers, itemGeneralJourneyParams.flightNumbers);
    }

    public final String getArrivalCode() {
        return this.arrivalCode;
    }

    public final Date getArrivalDate() {
        return this.arrivalDate;
    }

    public final String getArrivalSupportText() {
        return this.arrivalSupportText;
    }

    public final String getCopyCurrentFlight() {
        return this.copyCurrentFlight;
    }

    public final String getCopyPreviousFlight() {
        return this.copyPreviousFlight;
    }

    public final Date getDepartureDate() {
        return this.departureDate;
    }

    public final String getDestinationShortName() {
        return this.destinationShortName;
    }

    public final List<String> getFlightNumbers() {
        return this.flightNumbers;
    }

    public final String getOriginCode() {
        return this.originCode;
    }

    public int hashCode() {
        String str = this.destinationShortName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.departureDate;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.arrivalDate;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str2 = this.originCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.arrivalCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.arrivalSupportText;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.copyCurrentFlight;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.copyPreviousFlight;
        return ((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.flightNumbers.hashCode();
    }

    public String toString() {
        return "ItemGeneralJourneyParams(destinationShortName=" + this.destinationShortName + ", departureDate=" + this.departureDate + ", arrivalDate=" + this.arrivalDate + ", originCode=" + this.originCode + ", arrivalCode=" + this.arrivalCode + ", arrivalSupportText=" + this.arrivalSupportText + ", copyCurrentFlight=" + this.copyCurrentFlight + ", copyPreviousFlight=" + this.copyPreviousFlight + ", flightNumbers=" + this.flightNumbers + ")";
    }
}
