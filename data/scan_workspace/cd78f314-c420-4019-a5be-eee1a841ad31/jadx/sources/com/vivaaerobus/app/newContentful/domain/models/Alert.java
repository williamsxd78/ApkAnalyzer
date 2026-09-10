package com.vivaaerobus.app.newContentful.domain.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Alert.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/Alert;", "", "title", "", "code", "displayType", "urgency", "timeInDays", "message", "linkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getCode", "getDisplayType", "getUrgency", "getTimeInDays", "getMessage", "getLinkUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Alert {
    private final String code;
    private final String displayType;
    private final String linkUrl;
    private final String message;
    private final String timeInDays;
    private final String title;
    private final String urgency;

    public Alert(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.title = str;
        this.code = str2;
        this.displayType = str3;
        this.urgency = str4;
        this.timeInDays = str5;
        this.message = str6;
        this.linkUrl = str7;
    }

    public static /* synthetic */ Alert copy$default(Alert alert, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alert.title;
        }
        if ((i & 2) != 0) {
            str2 = alert.code;
        }
        if ((i & 4) != 0) {
            str3 = alert.displayType;
        }
        if ((i & 8) != 0) {
            str4 = alert.urgency;
        }
        if ((i & 16) != 0) {
            str5 = alert.timeInDays;
        }
        if ((i & 32) != 0) {
            str6 = alert.message;
        }
        if ((i & 64) != 0) {
            str7 = alert.linkUrl;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return alert.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrgency() {
        return this.urgency;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTimeInDays() {
        return this.timeInDays;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final Alert copy(String title, String code, String displayType, String urgency, String timeInDays, String message, String linkUrl) {
        return new Alert(title, code, displayType, urgency, timeInDays, message, linkUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Alert)) {
            return false;
        }
        Alert alert = (Alert) other;
        return Intrinsics.areEqual(this.title, alert.title) && Intrinsics.areEqual(this.code, alert.code) && Intrinsics.areEqual(this.displayType, alert.displayType) && Intrinsics.areEqual(this.urgency, alert.urgency) && Intrinsics.areEqual(this.timeInDays, alert.timeInDays) && Intrinsics.areEqual(this.message, alert.message) && Intrinsics.areEqual(this.linkUrl, alert.linkUrl);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDisplayType() {
        return this.displayType;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTimeInDays() {
        return this.timeInDays;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrgency() {
        return this.urgency;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.urgency;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.timeInDays;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.message;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.linkUrl;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "Alert(title=" + this.title + ", code=" + this.code + ", displayType=" + this.displayType + ", urgency=" + this.urgency + ", timeInDays=" + this.timeInDays + ", message=" + this.message + ", linkUrl=" + this.linkUrl + ")";
    }
}
