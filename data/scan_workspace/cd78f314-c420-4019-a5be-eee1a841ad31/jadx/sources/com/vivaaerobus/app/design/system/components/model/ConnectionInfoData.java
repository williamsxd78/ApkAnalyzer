package com.vivaaerobus.app.design.system.components.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionInfoData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/design/system/components/model/ConnectionInfoData;", "", "type", "", "duration", "urlIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getDuration", "getUrlIcon", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "designSystem_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConnectionInfoData {
    public static final int $stable = 0;
    private final String duration;
    private final String type;
    private final String urlIcon;

    public ConnectionInfoData(String type, String duration, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.type = type;
        this.duration = duration;
        this.urlIcon = str;
    }

    public static /* synthetic */ ConnectionInfoData copy$default(ConnectionInfoData connectionInfoData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionInfoData.type;
        }
        if ((i & 2) != 0) {
            str2 = connectionInfoData.duration;
        }
        if ((i & 4) != 0) {
            str3 = connectionInfoData.urlIcon;
        }
        return connectionInfoData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrlIcon() {
        return this.urlIcon;
    }

    public final ConnectionInfoData copy(String type, String duration, String urlIcon) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new ConnectionInfoData(type, duration, urlIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionInfoData)) {
            return false;
        }
        ConnectionInfoData connectionInfoData = (ConnectionInfoData) other;
        return Intrinsics.areEqual(this.type, connectionInfoData.type) && Intrinsics.areEqual(this.duration, connectionInfoData.duration) && Intrinsics.areEqual(this.urlIcon, connectionInfoData.urlIcon);
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrlIcon() {
        return this.urlIcon;
    }

    public int hashCode() {
        int hashCode = ((this.type.hashCode() * 31) + this.duration.hashCode()) * 31;
        String str = this.urlIcon;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConnectionInfoData(type=" + this.type + ", duration=" + this.duration + ", urlIcon=" + this.urlIcon + ")";
    }
}
