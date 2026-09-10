package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: StatusPolling.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/StatusPolling;", "", "retryCount", "", "sleepDurationInMs", "<init>", "(II)V", "getRetryCount", "()I", "getSleepDurationInMs", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StatusPolling {
    private final int retryCount;
    private final int sleepDurationInMs;

    public StatusPolling(int i, int i2) {
        this.retryCount = i;
        this.sleepDurationInMs = i2;
    }

    public static /* synthetic */ StatusPolling copy$default(StatusPolling statusPolling, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = statusPolling.retryCount;
        }
        if ((i3 & 2) != 0) {
            i2 = statusPolling.sleepDurationInMs;
        }
        return statusPolling.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSleepDurationInMs() {
        return this.sleepDurationInMs;
    }

    public final StatusPolling copy(int retryCount, int sleepDurationInMs) {
        return new StatusPolling(retryCount, sleepDurationInMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusPolling)) {
            return false;
        }
        StatusPolling statusPolling = (StatusPolling) other;
        return this.retryCount == statusPolling.retryCount && this.sleepDurationInMs == statusPolling.sleepDurationInMs;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final int getSleepDurationInMs() {
        return this.sleepDurationInMs;
    }

    public int hashCode() {
        return (Integer.hashCode(this.retryCount) * 31) + Integer.hashCode(this.sleepDurationInMs);
    }

    public String toString() {
        return "StatusPolling(retryCount=" + this.retryCount + ", sleepDurationInMs=" + this.sleepDurationInMs + ")";
    }
}
