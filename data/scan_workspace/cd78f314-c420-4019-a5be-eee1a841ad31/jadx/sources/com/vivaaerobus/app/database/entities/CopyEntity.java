package com.vivaaerobus.app.database.entities;

import com.braze.models.Banner;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CopyEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006'"}, d2 = {"Lcom/vivaaerobus/app/database/entities/CopyEntity;", "", "id", "", "collection", "text", Banner.HTML, "type", "parentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getCollection", "setCollection", "getText", "setText", "getHtml", "setHtml", "getType", "setType", "getParentId", "setParentId", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "Companion", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CopyEntity {
    public static final String TABLE_NAME = "copy_entity";
    private String collection;
    private String html;
    private String id;
    private String parentId;
    private String text;
    private String type;

    public CopyEntity(String id, String str, String str2, String str3, String str4, String parentId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        this.id = id;
        this.collection = str;
        this.text = str2;
        this.html = str3;
        this.type = str4;
        this.parentId = parentId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CopyEntity(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.vivaaerobus.app.database.entities.CopyEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ CopyEntity copy$default(CopyEntity copyEntity, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copyEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = copyEntity.collection;
        }
        if ((i & 4) != 0) {
            str3 = copyEntity.text;
        }
        if ((i & 8) != 0) {
            str4 = copyEntity.html;
        }
        if ((i & 16) != 0) {
            str5 = copyEntity.type;
        }
        if ((i & 32) != 0) {
            str6 = copyEntity.parentId;
        }
        String str7 = str5;
        String str8 = str6;
        return copyEntity.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCollection() {
        return this.collection;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public final CopyEntity copy(String id, String collection, String text, String html, String type, String parentId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        return new CopyEntity(id, collection, text, html, type, parentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyEntity)) {
            return false;
        }
        CopyEntity copyEntity = (CopyEntity) other;
        return Intrinsics.areEqual(this.id, copyEntity.id) && Intrinsics.areEqual(this.collection, copyEntity.collection) && Intrinsics.areEqual(this.text, copyEntity.text) && Intrinsics.areEqual(this.html, copyEntity.html) && Intrinsics.areEqual(this.type, copyEntity.type) && Intrinsics.areEqual(this.parentId, copyEntity.parentId);
    }

    public final String getCollection() {
        return this.collection;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getId() {
        return this.id;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.collection;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.html;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.parentId.hashCode();
    }

    public final void setCollection(String str) {
        this.collection = str;
    }

    public final void setHtml(String str) {
        this.html = str;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setParentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.parentId = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "CopyEntity(id=" + this.id + ", collection=" + this.collection + ", text=" + this.text + ", html=" + this.html + ", type=" + this.type + ", parentId=" + this.parentId + ")";
    }
}
