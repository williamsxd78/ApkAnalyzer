package com.vivaaerobus.app.database.entities;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/vivaaerobus/app/database/entities/MediaEntity;", "", "id", "", "url", "title", "parentGroupId", "serviceId", "carouselId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getUrl", "getTitle", "getParentGroupId", "getServiceId", "getCarouselId", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MediaEntity {
    private final String carouselId;
    private String id;
    private final String parentGroupId;
    private final String serviceId;
    private final String title;
    private final String url;

    public MediaEntity(String id, String url, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = id;
        this.url = url;
        this.title = str;
        this.parentGroupId = str2;
        this.serviceId = str3;
        this.carouselId = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MediaEntity(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r14 = r14 & 1
            if (r14 == 0) goto L11
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            java.lang.String r14 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r14)
        L11:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivaaerobus.app.database.entities.MediaEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ MediaEntity copy$default(MediaEntity mediaEntity, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = mediaEntity.url;
        }
        if ((i & 4) != 0) {
            str3 = mediaEntity.title;
        }
        if ((i & 8) != 0) {
            str4 = mediaEntity.parentGroupId;
        }
        if ((i & 16) != 0) {
            str5 = mediaEntity.serviceId;
        }
        if ((i & 32) != 0) {
            str6 = mediaEntity.carouselId;
        }
        String str7 = str5;
        String str8 = str6;
        return mediaEntity.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParentGroupId() {
        return this.parentGroupId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCarouselId() {
        return this.carouselId;
    }

    public final MediaEntity copy(String id, String url, String title, String parentGroupId, String serviceId, String carouselId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        return new MediaEntity(id, url, title, parentGroupId, serviceId, carouselId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaEntity)) {
            return false;
        }
        MediaEntity mediaEntity = (MediaEntity) other;
        return Intrinsics.areEqual(this.id, mediaEntity.id) && Intrinsics.areEqual(this.url, mediaEntity.url) && Intrinsics.areEqual(this.title, mediaEntity.title) && Intrinsics.areEqual(this.parentGroupId, mediaEntity.parentGroupId) && Intrinsics.areEqual(this.serviceId, mediaEntity.serviceId) && Intrinsics.areEqual(this.carouselId, mediaEntity.carouselId);
    }

    public final String getCarouselId() {
        return this.carouselId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getParentGroupId() {
        return this.parentGroupId;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.url.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parentGroupId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serviceId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.carouselId;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public String toString() {
        return "MediaEntity(id=" + this.id + ", url=" + this.url + ", title=" + this.title + ", parentGroupId=" + this.parentGroupId + ", serviceId=" + this.serviceId + ", carouselId=" + this.carouselId + ")";
    }
}
