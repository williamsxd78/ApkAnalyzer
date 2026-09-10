package com.vivaaerobus.app.tripDetails.presentation.mainFragment.adapter.alerts;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertsData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/tripDetails/presentation/mainFragment/adapter/alerts/AlertsData;", "", "tag", "", "title", "message", "url", "arrowColor", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTag", "()Ljava/lang/String;", "getTitle", "getMessage", "getUrl", "getArrowColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/vivaaerobus/app/tripDetails/presentation/mainFragment/adapter/alerts/AlertsData;", "equals", "", "other", "hashCode", "toString", "tripDetails_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AlertsData {
    public static final int $stable = 0;
    private final Integer arrowColor;
    private final String message;
    private final String tag;
    private final String title;
    private final String url;

    public AlertsData(String str, String str2, String str3, String str4, Integer num) {
        this.tag = str;
        this.title = str2;
        this.message = str3;
        this.url = str4;
        this.arrowColor = num;
    }

    public static /* synthetic */ AlertsData copy$default(AlertsData alertsData, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertsData.tag;
        }
        if ((i & 2) != 0) {
            str2 = alertsData.title;
        }
        if ((i & 4) != 0) {
            str3 = alertsData.message;
        }
        if ((i & 8) != 0) {
            str4 = alertsData.url;
        }
        if ((i & 16) != 0) {
            num = alertsData.arrowColor;
        }
        Integer num2 = num;
        String str5 = str3;
        return alertsData.copy(str, str2, str5, str4, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getArrowColor() {
        return this.arrowColor;
    }

    public final AlertsData copy(String tag, String title, String message, String url, Integer arrowColor) {
        return new AlertsData(tag, title, message, url, arrowColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertsData)) {
            return false;
        }
        AlertsData alertsData = (AlertsData) other;
        return Intrinsics.areEqual(this.tag, alertsData.tag) && Intrinsics.areEqual(this.title, alertsData.title) && Intrinsics.areEqual(this.message, alertsData.message) && Intrinsics.areEqual(this.url, alertsData.url) && Intrinsics.areEqual(this.arrowColor, alertsData.arrowColor);
    }

    public final Integer getArrowColor() {
        return this.arrowColor;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.tag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.arrowColor;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AlertsData(tag=" + this.tag + ", title=" + this.title + ", message=" + this.message + ", url=" + this.url + ", arrowColor=" + this.arrowColor + ")";
    }
}
