package com.vivaaerobus.app.sharedNotifications.domain.useCase.storeScheduleNotification;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreScheduleNotificationParams.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/sharedNotifications/domain/useCase/storeScheduleNotification/StoreScheduleNotificationParams;", "", "tag", "", "currentTimeStamp", "", "<init>", "(Ljava/lang/String;J)V", "getTag", "()Ljava/lang/String;", "getCurrentTimeStamp", "()J", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "sharedNotifications_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StoreScheduleNotificationParams {
    private final long currentTimeStamp;
    private final String tag;

    public StoreScheduleNotificationParams(String tag, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.currentTimeStamp = j;
    }

    public static /* synthetic */ StoreScheduleNotificationParams copy$default(StoreScheduleNotificationParams storeScheduleNotificationParams, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storeScheduleNotificationParams.tag;
        }
        if ((i & 2) != 0) {
            j = storeScheduleNotificationParams.currentTimeStamp;
        }
        return storeScheduleNotificationParams.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCurrentTimeStamp() {
        return this.currentTimeStamp;
    }

    public final StoreScheduleNotificationParams copy(String tag, long currentTimeStamp) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new StoreScheduleNotificationParams(tag, currentTimeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreScheduleNotificationParams)) {
            return false;
        }
        StoreScheduleNotificationParams storeScheduleNotificationParams = (StoreScheduleNotificationParams) other;
        return Intrinsics.areEqual(this.tag, storeScheduleNotificationParams.tag) && this.currentTimeStamp == storeScheduleNotificationParams.currentTimeStamp;
    }

    public final long getCurrentTimeStamp() {
        return this.currentTimeStamp;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + Long.hashCode(this.currentTimeStamp);
    }

    public String toString() {
        return "StoreScheduleNotificationParams(tag=" + this.tag + ", currentTimeStamp=" + this.currentTimeStamp + ")";
    }
}
