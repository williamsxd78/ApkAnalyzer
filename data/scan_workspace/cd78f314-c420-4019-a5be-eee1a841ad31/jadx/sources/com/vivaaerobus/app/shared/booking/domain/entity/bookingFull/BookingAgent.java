package com.vivaaerobus.app.shared.booking.domain.entity.bookingFull;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BookingAgent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bookingFull/BookingAgent;", "", "agentCode", "", "agentName", "domainCode", "locationCode", "organizationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentCode", "()Ljava/lang/String;", "getAgentName", "getDomainCode", "getLocationCode", "getOrganizationCode", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BookingAgent {
    private final String agentCode;
    private final String agentName;
    private final String domainCode;
    private final String locationCode;
    private final String organizationCode;

    public BookingAgent(String str, String str2, String str3, String str4, String str5) {
        this.agentCode = str;
        this.agentName = str2;
        this.domainCode = str3;
        this.locationCode = str4;
        this.organizationCode = str5;
    }

    public static /* synthetic */ BookingAgent copy$default(BookingAgent bookingAgent, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bookingAgent.agentCode;
        }
        if ((i & 2) != 0) {
            str2 = bookingAgent.agentName;
        }
        if ((i & 4) != 0) {
            str3 = bookingAgent.domainCode;
        }
        if ((i & 8) != 0) {
            str4 = bookingAgent.locationCode;
        }
        if ((i & 16) != 0) {
            str5 = bookingAgent.organizationCode;
        }
        String str6 = str5;
        String str7 = str3;
        return bookingAgent.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgentCode() {
        return this.agentCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgentName() {
        return this.agentName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDomainCode() {
        return this.domainCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocationCode() {
        return this.locationCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOrganizationCode() {
        return this.organizationCode;
    }

    public final BookingAgent copy(String agentCode, String agentName, String domainCode, String locationCode, String organizationCode) {
        return new BookingAgent(agentCode, agentName, domainCode, locationCode, organizationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookingAgent)) {
            return false;
        }
        BookingAgent bookingAgent = (BookingAgent) other;
        return Intrinsics.areEqual(this.agentCode, bookingAgent.agentCode) && Intrinsics.areEqual(this.agentName, bookingAgent.agentName) && Intrinsics.areEqual(this.domainCode, bookingAgent.domainCode) && Intrinsics.areEqual(this.locationCode, bookingAgent.locationCode) && Intrinsics.areEqual(this.organizationCode, bookingAgent.organizationCode);
    }

    public final String getAgentCode() {
        return this.agentCode;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final String getDomainCode() {
        return this.domainCode;
    }

    public final String getLocationCode() {
        return this.locationCode;
    }

    public final String getOrganizationCode() {
        return this.organizationCode;
    }

    public int hashCode() {
        String str = this.agentCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.domainCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locationCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.organizationCode;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "BookingAgent(agentCode=" + this.agentCode + ", agentName=" + this.agentName + ", domainCode=" + this.domainCode + ", locationCode=" + this.locationCode + ", organizationCode=" + this.organizationCode + ")";
    }
}
