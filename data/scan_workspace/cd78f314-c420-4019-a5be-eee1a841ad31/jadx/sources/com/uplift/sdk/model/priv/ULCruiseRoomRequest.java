package com.uplift.sdk.model.priv;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULCruiseRoomRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/uplift/sdk/model/priv/ULCruiseRoomRequest;", "", "cabinType", "", "stateRoomType", "stateRoomNumber", "deckNumber", "berthedType", "diningService", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBerthedType", "()Ljava/lang/String;", "getCabinType", "getDeckNumber", "getDiningService", "getStateRoomNumber", "getStateRoomType", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULCruiseRoomRequest {

    @SerializedName("berthed_type")
    private final String berthedType;

    @SerializedName("cabin_type")
    private final String cabinType;

    @SerializedName("deck_number")
    private final String deckNumber;

    @SerializedName("dining_service")
    private final String diningService;

    @SerializedName("state_room_number")
    private final String stateRoomNumber;

    @SerializedName("state_room_type")
    private final String stateRoomType;

    public ULCruiseRoomRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        this.cabinType = str;
        this.stateRoomType = str2;
        this.stateRoomNumber = str3;
        this.deckNumber = str4;
        this.berthedType = str5;
        this.diningService = str6;
    }

    public static /* synthetic */ ULCruiseRoomRequest copy$default(ULCruiseRoomRequest uLCruiseRoomRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLCruiseRoomRequest.cabinType;
        }
        if ((i & 2) != 0) {
            str2 = uLCruiseRoomRequest.stateRoomType;
        }
        if ((i & 4) != 0) {
            str3 = uLCruiseRoomRequest.stateRoomNumber;
        }
        if ((i & 8) != 0) {
            str4 = uLCruiseRoomRequest.deckNumber;
        }
        if ((i & 16) != 0) {
            str5 = uLCruiseRoomRequest.berthedType;
        }
        if ((i & 32) != 0) {
            str6 = uLCruiseRoomRequest.diningService;
        }
        String str7 = str5;
        String str8 = str6;
        return uLCruiseRoomRequest.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCabinType() {
        return this.cabinType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStateRoomType() {
        return this.stateRoomType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStateRoomNumber() {
        return this.stateRoomNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeckNumber() {
        return this.deckNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBerthedType() {
        return this.berthedType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDiningService() {
        return this.diningService;
    }

    public final ULCruiseRoomRequest copy(String cabinType, String stateRoomType, String stateRoomNumber, String deckNumber, String berthedType, String diningService) {
        return new ULCruiseRoomRequest(cabinType, stateRoomType, stateRoomNumber, deckNumber, berthedType, diningService);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULCruiseRoomRequest)) {
            return false;
        }
        ULCruiseRoomRequest uLCruiseRoomRequest = (ULCruiseRoomRequest) other;
        return Intrinsics.areEqual(this.cabinType, uLCruiseRoomRequest.cabinType) && Intrinsics.areEqual(this.stateRoomType, uLCruiseRoomRequest.stateRoomType) && Intrinsics.areEqual(this.stateRoomNumber, uLCruiseRoomRequest.stateRoomNumber) && Intrinsics.areEqual(this.deckNumber, uLCruiseRoomRequest.deckNumber) && Intrinsics.areEqual(this.berthedType, uLCruiseRoomRequest.berthedType) && Intrinsics.areEqual(this.diningService, uLCruiseRoomRequest.diningService);
    }

    public final String getBerthedType() {
        return this.berthedType;
    }

    public final String getCabinType() {
        return this.cabinType;
    }

    public final String getDeckNumber() {
        return this.deckNumber;
    }

    public final String getDiningService() {
        return this.diningService;
    }

    public final String getStateRoomNumber() {
        return this.stateRoomNumber;
    }

    public final String getStateRoomType() {
        return this.stateRoomType;
    }

    public int hashCode() {
        String str = this.cabinType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateRoomType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateRoomNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deckNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.berthedType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.diningService;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "ULCruiseRoomRequest(cabinType=" + this.cabinType + ", stateRoomType=" + this.stateRoomType + ", stateRoomNumber=" + this.stateRoomNumber + ", deckNumber=" + this.deckNumber + ", berthedType=" + this.berthedType + ", diningService=" + this.diningService + ')';
    }
}
