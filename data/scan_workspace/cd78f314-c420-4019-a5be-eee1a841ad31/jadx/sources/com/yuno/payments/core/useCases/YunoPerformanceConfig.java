package com.yuno.payments.core.useCases;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: YunoPublishEventsLogs.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/yuno/payments/core/useCases/YunoPerformanceConfig;", "Landroid/os/Parcelable;", "isPerformanceMetricsEnabled", "", "isPerformanceNetworkEnabled", "(ZZ)V", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class YunoPerformanceConfig implements Parcelable {
    public static final Parcelable.Creator<YunoPerformanceConfig> CREATOR = new Creator();
    private final boolean isPerformanceMetricsEnabled;
    private final boolean isPerformanceNetworkEnabled;

    /* compiled from: YunoPublishEventsLogs.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<YunoPerformanceConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YunoPerformanceConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new YunoPerformanceConfig(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YunoPerformanceConfig[] newArray(int i) {
            return new YunoPerformanceConfig[i];
        }
    }

    public YunoPerformanceConfig(boolean z, boolean z2) {
        this.isPerformanceMetricsEnabled = z;
        this.isPerformanceNetworkEnabled = z2;
    }

    public static /* synthetic */ YunoPerformanceConfig copy$default(YunoPerformanceConfig yunoPerformanceConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = yunoPerformanceConfig.isPerformanceMetricsEnabled;
        }
        if ((i & 2) != 0) {
            z2 = yunoPerformanceConfig.isPerformanceNetworkEnabled;
        }
        return yunoPerformanceConfig.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPerformanceMetricsEnabled() {
        return this.isPerformanceMetricsEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPerformanceNetworkEnabled() {
        return this.isPerformanceNetworkEnabled;
    }

    public final YunoPerformanceConfig copy(boolean isPerformanceMetricsEnabled, boolean isPerformanceNetworkEnabled) {
        return new YunoPerformanceConfig(isPerformanceMetricsEnabled, isPerformanceNetworkEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YunoPerformanceConfig)) {
            return false;
        }
        YunoPerformanceConfig yunoPerformanceConfig = (YunoPerformanceConfig) other;
        return this.isPerformanceMetricsEnabled == yunoPerformanceConfig.isPerformanceMetricsEnabled && this.isPerformanceNetworkEnabled == yunoPerformanceConfig.isPerformanceNetworkEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isPerformanceMetricsEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isPerformanceNetworkEnabled;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isPerformanceMetricsEnabled() {
        return this.isPerformanceMetricsEnabled;
    }

    public final boolean isPerformanceNetworkEnabled() {
        return this.isPerformanceNetworkEnabled;
    }

    public String toString() {
        return "YunoPerformanceConfig(isPerformanceMetricsEnabled=" + this.isPerformanceMetricsEnabled + ", isPerformanceNetworkEnabled=" + this.isPerformanceNetworkEnabled + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isPerformanceMetricsEnabled ? 1 : 0);
        parcel.writeInt(this.isPerformanceNetworkEnabled ? 1 : 0);
    }
}
