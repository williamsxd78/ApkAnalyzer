package com.vivaaerobus.app.newContentful.domain.models.service;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VivaBusCopyConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/service/VivaBusCopyConfig;", "", "alert", "", "match", "times", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlert", "()Ljava/lang/String;", "getMatch", "getTimes", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VivaBusCopyConfig {
    private final String alert;
    private final String match;
    private final String times;

    public VivaBusCopyConfig(String alert, String match, String times) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(times, "times");
        this.alert = alert;
        this.match = match;
        this.times = times;
    }

    public static /* synthetic */ VivaBusCopyConfig copy$default(VivaBusCopyConfig vivaBusCopyConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vivaBusCopyConfig.alert;
        }
        if ((i & 2) != 0) {
            str2 = vivaBusCopyConfig.match;
        }
        if ((i & 4) != 0) {
            str3 = vivaBusCopyConfig.times;
        }
        return vivaBusCopyConfig.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAlert() {
        return this.alert;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMatch() {
        return this.match;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTimes() {
        return this.times;
    }

    public final VivaBusCopyConfig copy(String alert, String match, String times) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(times, "times");
        return new VivaBusCopyConfig(alert, match, times);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VivaBusCopyConfig)) {
            return false;
        }
        VivaBusCopyConfig vivaBusCopyConfig = (VivaBusCopyConfig) other;
        return Intrinsics.areEqual(this.alert, vivaBusCopyConfig.alert) && Intrinsics.areEqual(this.match, vivaBusCopyConfig.match) && Intrinsics.areEqual(this.times, vivaBusCopyConfig.times);
    }

    public final String getAlert() {
        return this.alert;
    }

    public final String getMatch() {
        return this.match;
    }

    public final String getTimes() {
        return this.times;
    }

    public int hashCode() {
        return (((this.alert.hashCode() * 31) + this.match.hashCode()) * 31) + this.times.hashCode();
    }

    public String toString() {
        return "VivaBusCopyConfig(alert=" + this.alert + ", match=" + this.match + ", times=" + this.times + ")";
    }
}
