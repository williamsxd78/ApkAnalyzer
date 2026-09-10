package com.uplift.sdk.model.pub;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ULCheckoutConfiguration.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/uplift/sdk/model/pub/ULCheckoutConfiguration;", "Ljava/io/Serializable;", "showCloseButton", "", "screenTimeOut", "", "(ZJ)V", "getScreenTimeOut", "()J", "setScreenTimeOut", "(J)V", "getShowCloseButton", "()Z", "setShowCloseButton", "(Z)V", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "", "hashCode", "", "toString", "", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULCheckoutConfiguration implements Serializable {
    private long screenTimeOut;
    private boolean showCloseButton;

    public ULCheckoutConfiguration() {
        this(false, 0L, 3, null);
    }

    public ULCheckoutConfiguration(boolean z, long j) {
        this.showCloseButton = z;
        this.screenTimeOut = j;
    }

    public /* synthetic */ ULCheckoutConfiguration(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 30L : j);
    }

    public static /* synthetic */ ULCheckoutConfiguration copy$default(ULCheckoutConfiguration uLCheckoutConfiguration, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uLCheckoutConfiguration.showCloseButton;
        }
        if ((i & 2) != 0) {
            j = uLCheckoutConfiguration.screenTimeOut;
        }
        return uLCheckoutConfiguration.copy(z, j);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* renamed from: component2, reason: from getter */
    public final long getScreenTimeOut() {
        return this.screenTimeOut;
    }

    public final ULCheckoutConfiguration copy(boolean showCloseButton, long screenTimeOut) {
        return new ULCheckoutConfiguration(showCloseButton, screenTimeOut);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULCheckoutConfiguration)) {
            return false;
        }
        ULCheckoutConfiguration uLCheckoutConfiguration = (ULCheckoutConfiguration) other;
        return this.showCloseButton == uLCheckoutConfiguration.showCloseButton && this.screenTimeOut == uLCheckoutConfiguration.screenTimeOut;
    }

    public final long getScreenTimeOut() {
        return this.screenTimeOut;
    }

    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.showCloseButton;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Long.hashCode(this.screenTimeOut);
    }

    public final void setScreenTimeOut(long j) {
        this.screenTimeOut = j;
    }

    public final void setShowCloseButton(boolean z) {
        this.showCloseButton = z;
    }

    public String toString() {
        return "ULCheckoutConfiguration(showCloseButton=" + this.showCloseButton + ", screenTimeOut=" + this.screenTimeOut + ')';
    }
}
