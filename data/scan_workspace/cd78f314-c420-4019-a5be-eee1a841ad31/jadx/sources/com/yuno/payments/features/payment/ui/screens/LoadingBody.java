package com.yuno.payments.features.payment.ui.screens;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: ClickToPayWebView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/yuno/payments/features/payment/ui/screens/LoadingBody;", "", "isLoading", "", "(Z)V", "()Z", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class LoadingBody {
    private final boolean isLoading;

    public LoadingBody(boolean z) {
        this.isLoading = z;
    }

    public static /* synthetic */ LoadingBody copy$default(LoadingBody loadingBody, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loadingBody.isLoading;
        }
        return loadingBody.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final LoadingBody copy(boolean isLoading) {
        return new LoadingBody(isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoadingBody) && this.isLoading == ((LoadingBody) other).isLoading;
    }

    public int hashCode() {
        boolean z = this.isLoading;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "LoadingBody(isLoading=" + this.isLoading + ")";
    }
}
