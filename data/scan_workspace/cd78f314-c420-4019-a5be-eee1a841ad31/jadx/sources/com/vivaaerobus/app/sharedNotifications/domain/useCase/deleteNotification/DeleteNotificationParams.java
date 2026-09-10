package com.vivaaerobus.app.sharedNotifications.domain.useCase.deleteNotification;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteNotificationParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vivaaerobus/app/sharedNotifications/domain/useCase/deleteNotification/DeleteNotificationParams;", "", "originCode", "", "destinationCode", "operatingCarrier", "operatingCode", "departureDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginCode", "()Ljava/lang/String;", "getDestinationCode", "getOperatingCarrier", "getOperatingCode", "getDepartureDate", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sharedNotifications_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DeleteNotificationParams {
    private final String departureDate;
    private final String destinationCode;
    private final String operatingCarrier;
    private final String operatingCode;
    private final String originCode;

    public DeleteNotificationParams(String originCode, String destinationCode, String operatingCarrier, String operatingCode, String departureDate) {
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(operatingCarrier, "operatingCarrier");
        Intrinsics.checkNotNullParameter(operatingCode, "operatingCode");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        this.originCode = originCode;
        this.destinationCode = destinationCode;
        this.operatingCarrier = operatingCarrier;
        this.operatingCode = operatingCode;
        this.departureDate = departureDate;
    }

    public static /* synthetic */ DeleteNotificationParams copy$default(DeleteNotificationParams deleteNotificationParams, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteNotificationParams.originCode;
        }
        if ((i & 2) != 0) {
            str2 = deleteNotificationParams.destinationCode;
        }
        if ((i & 4) != 0) {
            str3 = deleteNotificationParams.operatingCarrier;
        }
        if ((i & 8) != 0) {
            str4 = deleteNotificationParams.operatingCode;
        }
        if ((i & 16) != 0) {
            str5 = deleteNotificationParams.departureDate;
        }
        String str6 = str5;
        String str7 = str3;
        return deleteNotificationParams.copy(str, str2, str7, str4, str6);
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
    public final String getOperatingCarrier() {
        return this.operatingCarrier;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOperatingCode() {
        return this.operatingCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDepartureDate() {
        return this.departureDate;
    }

    public final DeleteNotificationParams copy(String originCode, String destinationCode, String operatingCarrier, String operatingCode, String departureDate) {
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(operatingCarrier, "operatingCarrier");
        Intrinsics.checkNotNullParameter(operatingCode, "operatingCode");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        return new DeleteNotificationParams(originCode, destinationCode, operatingCarrier, operatingCode, departureDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteNotificationParams)) {
            return false;
        }
        DeleteNotificationParams deleteNotificationParams = (DeleteNotificationParams) other;
        return Intrinsics.areEqual(this.originCode, deleteNotificationParams.originCode) && Intrinsics.areEqual(this.destinationCode, deleteNotificationParams.destinationCode) && Intrinsics.areEqual(this.operatingCarrier, deleteNotificationParams.operatingCarrier) && Intrinsics.areEqual(this.operatingCode, deleteNotificationParams.operatingCode) && Intrinsics.areEqual(this.departureDate, deleteNotificationParams.departureDate);
    }

    public final String getDepartureDate() {
        return this.departureDate;
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getOperatingCarrier() {
        return this.operatingCarrier;
    }

    public final String getOperatingCode() {
        return this.operatingCode;
    }

    public final String getOriginCode() {
        return this.originCode;
    }

    public int hashCode() {
        return (((((((this.originCode.hashCode() * 31) + this.destinationCode.hashCode()) * 31) + this.operatingCarrier.hashCode()) * 31) + this.operatingCode.hashCode()) * 31) + this.departureDate.hashCode();
    }

    public String toString() {
        return "DeleteNotificationParams(originCode=" + this.originCode + ", destinationCode=" + this.destinationCode + ", operatingCarrier=" + this.operatingCarrier + ", operatingCode=" + this.operatingCode + ", departureDate=" + this.departureDate + ")";
    }
}
