package com.vivaaerobus.app.contentful.domain.usecase.fetchCheckInAlerts;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchCheckInAlertsParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/contentful/domain/usecase/fetchCheckInAlerts/FetchCheckInAlertsParams;", "", "originCode", "", "destinationCode", "originCountryCode", "destinationCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginCode", "()Ljava/lang/String;", "getDestinationCode", "getOriginCountryCode", "getDestinationCountryCode", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FetchCheckInAlertsParams {
    private final String destinationCode;
    private final String destinationCountryCode;
    private final String originCode;
    private final String originCountryCode;

    public FetchCheckInAlertsParams(String str, String str2, String str3, String str4) {
        this.originCode = str;
        this.destinationCode = str2;
        this.originCountryCode = str3;
        this.destinationCountryCode = str4;
    }

    public static /* synthetic */ FetchCheckInAlertsParams copy$default(FetchCheckInAlertsParams fetchCheckInAlertsParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchCheckInAlertsParams.originCode;
        }
        if ((i & 2) != 0) {
            str2 = fetchCheckInAlertsParams.destinationCode;
        }
        if ((i & 4) != 0) {
            str3 = fetchCheckInAlertsParams.originCountryCode;
        }
        if ((i & 8) != 0) {
            str4 = fetchCheckInAlertsParams.destinationCountryCode;
        }
        return fetchCheckInAlertsParams.copy(str, str2, str3, str4);
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
    public final String getOriginCountryCode() {
        return this.originCountryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDestinationCountryCode() {
        return this.destinationCountryCode;
    }

    public final FetchCheckInAlertsParams copy(String originCode, String destinationCode, String originCountryCode, String destinationCountryCode) {
        return new FetchCheckInAlertsParams(originCode, destinationCode, originCountryCode, destinationCountryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchCheckInAlertsParams)) {
            return false;
        }
        FetchCheckInAlertsParams fetchCheckInAlertsParams = (FetchCheckInAlertsParams) other;
        return Intrinsics.areEqual(this.originCode, fetchCheckInAlertsParams.originCode) && Intrinsics.areEqual(this.destinationCode, fetchCheckInAlertsParams.destinationCode) && Intrinsics.areEqual(this.originCountryCode, fetchCheckInAlertsParams.originCountryCode) && Intrinsics.areEqual(this.destinationCountryCode, fetchCheckInAlertsParams.destinationCountryCode);
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getDestinationCountryCode() {
        return this.destinationCountryCode;
    }

    public final String getOriginCode() {
        return this.originCode;
    }

    public final String getOriginCountryCode() {
        return this.originCountryCode;
    }

    public int hashCode() {
        String str = this.originCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.destinationCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originCountryCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.destinationCountryCode;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "FetchCheckInAlertsParams(originCode=" + this.originCode + ", destinationCode=" + this.destinationCode + ", originCountryCode=" + this.originCountryCode + ", destinationCountryCode=" + this.destinationCountryCode + ")";
    }
}
