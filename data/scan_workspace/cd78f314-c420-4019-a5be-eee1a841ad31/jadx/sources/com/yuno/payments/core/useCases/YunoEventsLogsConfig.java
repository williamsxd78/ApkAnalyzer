package com.yuno.payments.core.useCases;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: YunoPublishEventsLogs.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006$"}, d2 = {"Lcom/yuno/payments/core/useCases/YunoEventsLogsConfig;", "Landroid/os/Parcelable;", "isLogsEnabled", "", "isEventsEnabled", "maxBatchQueued", "", "loaderTimeOut", "serviceTimeOut", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLoaderTimeOut", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxBatchQueued", "getServiceTimeOut", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/yuno/payments/core/useCases/YunoEventsLogsConfig;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class YunoEventsLogsConfig implements Parcelable {
    public static final Parcelable.Creator<YunoEventsLogsConfig> CREATOR = new Creator();
    private final Boolean isEventsEnabled;
    private final Boolean isLogsEnabled;
    private final Integer loaderTimeOut;
    private final Integer maxBatchQueued;
    private final Integer serviceTimeOut;

    /* compiled from: YunoPublishEventsLogs.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<YunoEventsLogsConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YunoEventsLogsConfig createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new YunoEventsLogsConfig(valueOf, valueOf2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YunoEventsLogsConfig[] newArray(int i) {
            return new YunoEventsLogsConfig[i];
        }
    }

    public YunoEventsLogsConfig(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3) {
        this.isLogsEnabled = bool;
        this.isEventsEnabled = bool2;
        this.maxBatchQueued = num;
        this.loaderTimeOut = num2;
        this.serviceTimeOut = num3;
    }

    public static /* synthetic */ YunoEventsLogsConfig copy$default(YunoEventsLogsConfig yunoEventsLogsConfig, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = yunoEventsLogsConfig.isLogsEnabled;
        }
        if ((i & 2) != 0) {
            bool2 = yunoEventsLogsConfig.isEventsEnabled;
        }
        if ((i & 4) != 0) {
            num = yunoEventsLogsConfig.maxBatchQueued;
        }
        if ((i & 8) != 0) {
            num2 = yunoEventsLogsConfig.loaderTimeOut;
        }
        if ((i & 16) != 0) {
            num3 = yunoEventsLogsConfig.serviceTimeOut;
        }
        Integer num4 = num3;
        Integer num5 = num;
        return yunoEventsLogsConfig.copy(bool, bool2, num5, num2, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsLogsEnabled() {
        return this.isLogsEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsEventsEnabled() {
        return this.isEventsEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMaxBatchQueued() {
        return this.maxBatchQueued;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getLoaderTimeOut() {
        return this.loaderTimeOut;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getServiceTimeOut() {
        return this.serviceTimeOut;
    }

    public final YunoEventsLogsConfig copy(Boolean isLogsEnabled, Boolean isEventsEnabled, Integer maxBatchQueued, Integer loaderTimeOut, Integer serviceTimeOut) {
        return new YunoEventsLogsConfig(isLogsEnabled, isEventsEnabled, maxBatchQueued, loaderTimeOut, serviceTimeOut);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YunoEventsLogsConfig)) {
            return false;
        }
        YunoEventsLogsConfig yunoEventsLogsConfig = (YunoEventsLogsConfig) other;
        return Intrinsics.areEqual(this.isLogsEnabled, yunoEventsLogsConfig.isLogsEnabled) && Intrinsics.areEqual(this.isEventsEnabled, yunoEventsLogsConfig.isEventsEnabled) && Intrinsics.areEqual(this.maxBatchQueued, yunoEventsLogsConfig.maxBatchQueued) && Intrinsics.areEqual(this.loaderTimeOut, yunoEventsLogsConfig.loaderTimeOut) && Intrinsics.areEqual(this.serviceTimeOut, yunoEventsLogsConfig.serviceTimeOut);
    }

    public final Integer getLoaderTimeOut() {
        return this.loaderTimeOut;
    }

    public final Integer getMaxBatchQueued() {
        return this.maxBatchQueued;
    }

    public final Integer getServiceTimeOut() {
        return this.serviceTimeOut;
    }

    public int hashCode() {
        Boolean bool = this.isLogsEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isEventsEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.maxBatchQueued;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.loaderTimeOut;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.serviceTimeOut;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final Boolean isEventsEnabled() {
        return this.isEventsEnabled;
    }

    public final Boolean isLogsEnabled() {
        return this.isLogsEnabled;
    }

    public String toString() {
        return "YunoEventsLogsConfig(isLogsEnabled=" + this.isLogsEnabled + ", isEventsEnabled=" + this.isEventsEnabled + ", maxBatchQueued=" + this.maxBatchQueued + ", loaderTimeOut=" + this.loaderTimeOut + ", serviceTimeOut=" + this.serviceTimeOut + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Boolean bool = this.isLogsEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isEventsEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.maxBatchQueued;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.loaderTimeOut;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.serviceTimeOut;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }
}
