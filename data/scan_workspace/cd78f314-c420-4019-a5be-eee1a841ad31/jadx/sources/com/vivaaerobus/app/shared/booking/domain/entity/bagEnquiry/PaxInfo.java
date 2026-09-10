package com.vivaaerobus.app.shared.booking.domain.entity.bagEnquiry;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaxInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bagEnquiry/PaxInfo;", "", "paxSeqNo", "", "surname", "pnr", "totalBags", "psn", "firstName", "seatNo", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaxSeqNo", "()Ljava/lang/String;", "getSurname", "getPnr", "getTotalBags", "getPsn", "getFirstName", "getSeatNo", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaxInfo {
    private final String firstName;
    private final String paxSeqNo;
    private final String pnr;
    private final String psn;
    private final String seatNo;
    private final String status;
    private final String surname;
    private final String totalBags;

    public PaxInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.paxSeqNo = str;
        this.surname = str2;
        this.pnr = str3;
        this.totalBags = str4;
        this.psn = str5;
        this.firstName = str6;
        this.seatNo = str7;
        this.status = str8;
    }

    public static /* synthetic */ PaxInfo copy$default(PaxInfo paxInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paxInfo.paxSeqNo;
        }
        if ((i & 2) != 0) {
            str2 = paxInfo.surname;
        }
        if ((i & 4) != 0) {
            str3 = paxInfo.pnr;
        }
        if ((i & 8) != 0) {
            str4 = paxInfo.totalBags;
        }
        if ((i & 16) != 0) {
            str5 = paxInfo.psn;
        }
        if ((i & 32) != 0) {
            str6 = paxInfo.firstName;
        }
        if ((i & 64) != 0) {
            str7 = paxInfo.seatNo;
        }
        if ((i & 128) != 0) {
            str8 = paxInfo.status;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return paxInfo.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaxSeqNo() {
        return this.paxSeqNo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPnr() {
        return this.pnr;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTotalBags() {
        return this.totalBags;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPsn() {
        return this.psn;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSeatNo() {
        return this.seatNo;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final PaxInfo copy(String paxSeqNo, String surname, String pnr, String totalBags, String psn, String firstName, String seatNo, String status) {
        return new PaxInfo(paxSeqNo, surname, pnr, totalBags, psn, firstName, seatNo, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaxInfo)) {
            return false;
        }
        PaxInfo paxInfo = (PaxInfo) other;
        return Intrinsics.areEqual(this.paxSeqNo, paxInfo.paxSeqNo) && Intrinsics.areEqual(this.surname, paxInfo.surname) && Intrinsics.areEqual(this.pnr, paxInfo.pnr) && Intrinsics.areEqual(this.totalBags, paxInfo.totalBags) && Intrinsics.areEqual(this.psn, paxInfo.psn) && Intrinsics.areEqual(this.firstName, paxInfo.firstName) && Intrinsics.areEqual(this.seatNo, paxInfo.seatNo) && Intrinsics.areEqual(this.status, paxInfo.status);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getPaxSeqNo() {
        return this.paxSeqNo;
    }

    public final String getPnr() {
        return this.pnr;
    }

    public final String getPsn() {
        return this.psn;
    }

    public final String getSeatNo() {
        return this.seatNo;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final String getTotalBags() {
        return this.totalBags;
    }

    public int hashCode() {
        String str = this.paxSeqNo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.surname;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pnr;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalBags;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.psn;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.seatNo;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "PaxInfo(paxSeqNo=" + this.paxSeqNo + ", surname=" + this.surname + ", pnr=" + this.pnr + ", totalBags=" + this.totalBags + ", psn=" + this.psn + ", firstName=" + this.firstName + ", seatNo=" + this.seatNo + ", status=" + this.status + ")";
    }
}
