package com.vivaaerobus.app.database.entities.boardingPass;

import androidx.autofill.HintConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardingPassengerEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/database/entities/boardingPass/BoardingPassengerEntity;", "", "customerNumber", "", "type", "fullName", "isoFullName", HintConstants.AUTOFILL_HINT_GENDER, "passengerKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getType", "getFullName", "getIsoFullName", "getGender", "getPassengerKey", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoardingPassengerEntity {
    private final String customerNumber;
    private final String fullName;
    private final String gender;
    private final String isoFullName;
    private final String passengerKey;
    private final String type;

    public BoardingPassengerEntity(String str, String str2, String fullName, String isoFullName, String str3, String str4) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(isoFullName, "isoFullName");
        this.customerNumber = str;
        this.type = str2;
        this.fullName = fullName;
        this.isoFullName = isoFullName;
        this.gender = str3;
        this.passengerKey = str4;
    }

    public static /* synthetic */ BoardingPassengerEntity copy$default(BoardingPassengerEntity boardingPassengerEntity, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boardingPassengerEntity.customerNumber;
        }
        if ((i & 2) != 0) {
            str2 = boardingPassengerEntity.type;
        }
        if ((i & 4) != 0) {
            str3 = boardingPassengerEntity.fullName;
        }
        if ((i & 8) != 0) {
            str4 = boardingPassengerEntity.isoFullName;
        }
        if ((i & 16) != 0) {
            str5 = boardingPassengerEntity.gender;
        }
        if ((i & 32) != 0) {
            str6 = boardingPassengerEntity.passengerKey;
        }
        String str7 = str5;
        String str8 = str6;
        return boardingPassengerEntity.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIsoFullName() {
        return this.isoFullName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPassengerKey() {
        return this.passengerKey;
    }

    public final BoardingPassengerEntity copy(String customerNumber, String type, String fullName, String isoFullName, String gender, String passengerKey) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(isoFullName, "isoFullName");
        return new BoardingPassengerEntity(customerNumber, type, fullName, isoFullName, gender, passengerKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardingPassengerEntity)) {
            return false;
        }
        BoardingPassengerEntity boardingPassengerEntity = (BoardingPassengerEntity) other;
        return Intrinsics.areEqual(this.customerNumber, boardingPassengerEntity.customerNumber) && Intrinsics.areEqual(this.type, boardingPassengerEntity.type) && Intrinsics.areEqual(this.fullName, boardingPassengerEntity.fullName) && Intrinsics.areEqual(this.isoFullName, boardingPassengerEntity.isoFullName) && Intrinsics.areEqual(this.gender, boardingPassengerEntity.gender) && Intrinsics.areEqual(this.passengerKey, boardingPassengerEntity.passengerKey);
    }

    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getIsoFullName() {
        return this.isoFullName;
    }

    public final String getPassengerKey() {
        return this.passengerKey;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.customerNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fullName.hashCode()) * 31) + this.isoFullName.hashCode()) * 31;
        String str3 = this.gender;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.passengerKey;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "BoardingPassengerEntity(customerNumber=" + this.customerNumber + ", type=" + this.type + ", fullName=" + this.fullName + ", isoFullName=" + this.isoFullName + ", gender=" + this.gender + ", passengerKey=" + this.passengerKey + ")";
    }
}
