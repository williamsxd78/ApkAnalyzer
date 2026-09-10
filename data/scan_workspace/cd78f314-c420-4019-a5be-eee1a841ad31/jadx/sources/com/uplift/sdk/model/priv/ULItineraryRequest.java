package com.uplift.sdk.model.priv;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULItineraryRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0087\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000eHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/uplift/sdk/model/priv/ULItineraryRequest;", "", "arrivalCity", "", "arrivalApc", "arrivalTime", "departureCity", "departureApc", "departureTime", "ticketType", "fareClass", "carrierCode", "travelers", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getArrivalApc", "()Ljava/lang/String;", "getArrivalCity", "getArrivalTime", "getCarrierCode", "getDepartureApc", "getDepartureCity", "getDepartureTime", "getFareClass", "getTicketType", "getTravelers", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULItineraryRequest {

    @SerializedName("arrival_apc")
    private final String arrivalApc;

    @SerializedName("arrival_city")
    private final String arrivalCity;

    @SerializedName("arrival_time")
    private final String arrivalTime;

    @SerializedName("carrier_code")
    private final String carrierCode;

    @SerializedName("departure_apc")
    private final String departureApc;

    @SerializedName("departure_city")
    private final String departureCity;

    @SerializedName("departure_time")
    private final String departureTime;

    @SerializedName("fare_class")
    private final String fareClass;

    @SerializedName("ticket_type")
    private final String ticketType;

    @SerializedName("traveler_ids")
    private final List<Integer> travelers;

    public ULItineraryRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Integer> list) {
        this.arrivalCity = str;
        this.arrivalApc = str2;
        this.arrivalTime = str3;
        this.departureCity = str4;
        this.departureApc = str5;
        this.departureTime = str6;
        this.ticketType = str7;
        this.fareClass = str8;
        this.carrierCode = str9;
        this.travelers = list;
    }

    public static /* synthetic */ ULItineraryRequest copy$default(ULItineraryRequest uLItineraryRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLItineraryRequest.arrivalCity;
        }
        if ((i & 2) != 0) {
            str2 = uLItineraryRequest.arrivalApc;
        }
        if ((i & 4) != 0) {
            str3 = uLItineraryRequest.arrivalTime;
        }
        if ((i & 8) != 0) {
            str4 = uLItineraryRequest.departureCity;
        }
        if ((i & 16) != 0) {
            str5 = uLItineraryRequest.departureApc;
        }
        if ((i & 32) != 0) {
            str6 = uLItineraryRequest.departureTime;
        }
        if ((i & 64) != 0) {
            str7 = uLItineraryRequest.ticketType;
        }
        if ((i & 128) != 0) {
            str8 = uLItineraryRequest.fareClass;
        }
        if ((i & 256) != 0) {
            str9 = uLItineraryRequest.carrierCode;
        }
        if ((i & 512) != 0) {
            list = uLItineraryRequest.travelers;
        }
        String str10 = str9;
        List list2 = list;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return uLItineraryRequest.copy(str, str2, str3, str4, str13, str14, str11, str12, str10, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getArrivalCity() {
        return this.arrivalCity;
    }

    public final List<Integer> component10() {
        return this.travelers;
    }

    /* renamed from: component2, reason: from getter */
    public final String getArrivalApc() {
        return this.arrivalApc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getArrivalTime() {
        return this.arrivalTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDepartureCity() {
        return this.departureCity;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDepartureApc() {
        return this.departureApc;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDepartureTime() {
        return this.departureTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTicketType() {
        return this.ticketType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFareClass() {
        return this.fareClass;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCarrierCode() {
        return this.carrierCode;
    }

    public final ULItineraryRequest copy(String arrivalCity, String arrivalApc, String arrivalTime, String departureCity, String departureApc, String departureTime, String ticketType, String fareClass, String carrierCode, List<Integer> travelers) {
        return new ULItineraryRequest(arrivalCity, arrivalApc, arrivalTime, departureCity, departureApc, departureTime, ticketType, fareClass, carrierCode, travelers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULItineraryRequest)) {
            return false;
        }
        ULItineraryRequest uLItineraryRequest = (ULItineraryRequest) other;
        return Intrinsics.areEqual(this.arrivalCity, uLItineraryRequest.arrivalCity) && Intrinsics.areEqual(this.arrivalApc, uLItineraryRequest.arrivalApc) && Intrinsics.areEqual(this.arrivalTime, uLItineraryRequest.arrivalTime) && Intrinsics.areEqual(this.departureCity, uLItineraryRequest.departureCity) && Intrinsics.areEqual(this.departureApc, uLItineraryRequest.departureApc) && Intrinsics.areEqual(this.departureTime, uLItineraryRequest.departureTime) && Intrinsics.areEqual(this.ticketType, uLItineraryRequest.ticketType) && Intrinsics.areEqual(this.fareClass, uLItineraryRequest.fareClass) && Intrinsics.areEqual(this.carrierCode, uLItineraryRequest.carrierCode) && Intrinsics.areEqual(this.travelers, uLItineraryRequest.travelers);
    }

    public final String getArrivalApc() {
        return this.arrivalApc;
    }

    public final String getArrivalCity() {
        return this.arrivalCity;
    }

    public final String getArrivalTime() {
        return this.arrivalTime;
    }

    public final String getCarrierCode() {
        return this.carrierCode;
    }

    public final String getDepartureApc() {
        return this.departureApc;
    }

    public final String getDepartureCity() {
        return this.departureCity;
    }

    public final String getDepartureTime() {
        return this.departureTime;
    }

    public final String getFareClass() {
        return this.fareClass;
    }

    public final String getTicketType() {
        return this.ticketType;
    }

    public final List<Integer> getTravelers() {
        return this.travelers;
    }

    public int hashCode() {
        String str = this.arrivalCity;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.arrivalApc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.arrivalTime;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.departureCity;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.departureApc;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.departureTime;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ticketType;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fareClass;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.carrierCode;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<Integer> list = this.travelers;
        return hashCode9 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ULItineraryRequest(arrivalCity=" + this.arrivalCity + ", arrivalApc=" + this.arrivalApc + ", arrivalTime=" + this.arrivalTime + ", departureCity=" + this.departureCity + ", departureApc=" + this.departureApc + ", departureTime=" + this.departureTime + ", ticketType=" + this.ticketType + ", fareClass=" + this.fareClass + ", carrierCode=" + this.carrierCode + ", travelers=" + this.travelers + ')';
    }
}
