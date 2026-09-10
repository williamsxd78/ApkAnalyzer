package com.vivaaerobus.app.shared.payment.domain.useCase.checkPaymentStatus;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckPaymentStatusParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/useCase/checkPaymentStatus/CheckPaymentStatusParams;", "", "retryAttemptsLimit", "", "sleepDurationInMs", "basketId", "", "<init>", "(IILjava/lang/String;)V", "getRetryAttemptsLimit", "()I", "getSleepDurationInMs", "getBasketId", "()Ljava/lang/String;", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CheckPaymentStatusParams {
    private final String basketId;
    private final int retryAttemptsLimit;
    private final int sleepDurationInMs;

    public CheckPaymentStatusParams(int i, int i2, String basketId) {
        Intrinsics.checkNotNullParameter(basketId, "basketId");
        this.retryAttemptsLimit = i;
        this.sleepDurationInMs = i2;
        this.basketId = basketId;
    }

    public static /* synthetic */ CheckPaymentStatusParams copy$default(CheckPaymentStatusParams checkPaymentStatusParams, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = checkPaymentStatusParams.retryAttemptsLimit;
        }
        if ((i3 & 2) != 0) {
            i2 = checkPaymentStatusParams.sleepDurationInMs;
        }
        if ((i3 & 4) != 0) {
            str = checkPaymentStatusParams.basketId;
        }
        return checkPaymentStatusParams.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRetryAttemptsLimit() {
        return this.retryAttemptsLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSleepDurationInMs() {
        return this.sleepDurationInMs;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBasketId() {
        return this.basketId;
    }

    public final CheckPaymentStatusParams copy(int retryAttemptsLimit, int sleepDurationInMs, String basketId) {
        Intrinsics.checkNotNullParameter(basketId, "basketId");
        return new CheckPaymentStatusParams(retryAttemptsLimit, sleepDurationInMs, basketId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentStatusParams)) {
            return false;
        }
        CheckPaymentStatusParams checkPaymentStatusParams = (CheckPaymentStatusParams) other;
        return this.retryAttemptsLimit == checkPaymentStatusParams.retryAttemptsLimit && this.sleepDurationInMs == checkPaymentStatusParams.sleepDurationInMs && Intrinsics.areEqual(this.basketId, checkPaymentStatusParams.basketId);
    }

    public final String getBasketId() {
        return this.basketId;
    }

    public final int getRetryAttemptsLimit() {
        return this.retryAttemptsLimit;
    }

    public final int getSleepDurationInMs() {
        return this.sleepDurationInMs;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.retryAttemptsLimit) * 31) + Integer.hashCode(this.sleepDurationInMs)) * 31) + this.basketId.hashCode();
    }

    public String toString() {
        return "CheckPaymentStatusParams(retryAttemptsLimit=" + this.retryAttemptsLimit + ", sleepDurationInMs=" + this.sleepDurationInMs + ", basketId=" + this.basketId + ")";
    }
}
