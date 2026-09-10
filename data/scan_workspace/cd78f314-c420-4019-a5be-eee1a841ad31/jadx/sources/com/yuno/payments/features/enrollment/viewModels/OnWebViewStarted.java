package com.yuno.payments.features.enrollment.viewModels;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: EnrollmentViewIntent.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yuno/payments/features/enrollment/viewModels/OnWebViewStarted;", "Lcom/yuno/payments/features/enrollment/viewModels/EnrollmentViewIntent;", "retryable", "", "(Z)V", "getRetryable", "()Z", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "", "hashCode", "", "toString", "", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OnWebViewStarted implements EnrollmentViewIntent {
    private final boolean retryable;

    public OnWebViewStarted() {
        this(false, 1, null);
    }

    public OnWebViewStarted(boolean z) {
        this.retryable = z;
    }

    public /* synthetic */ OnWebViewStarted(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ OnWebViewStarted copy$default(OnWebViewStarted onWebViewStarted, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onWebViewStarted.retryable;
        }
        return onWebViewStarted.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRetryable() {
        return this.retryable;
    }

    public final OnWebViewStarted copy(boolean retryable) {
        return new OnWebViewStarted(retryable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnWebViewStarted) && this.retryable == ((OnWebViewStarted) other).retryable;
    }

    public final boolean getRetryable() {
        return this.retryable;
    }

    public int hashCode() {
        boolean z = this.retryable;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "OnWebViewStarted(retryable=" + this.retryable + ")";
    }
}
