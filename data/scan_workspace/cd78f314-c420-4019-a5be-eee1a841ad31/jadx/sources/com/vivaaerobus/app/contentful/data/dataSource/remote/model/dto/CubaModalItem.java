package com.vivaaerobus.app.contentful.data.dataSource.remote.model.dto;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CubaModalItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/contentful/data/dataSource/remote/model/dto/CubaModalItem;", "", "code", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getText", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CubaModalItem {
    private final String code;
    private final String text;

    public CubaModalItem(String code, String text) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(text, "text");
        this.code = code;
        this.text = text;
    }

    public static /* synthetic */ CubaModalItem copy$default(CubaModalItem cubaModalItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cubaModalItem.code;
        }
        if ((i & 2) != 0) {
            str2 = cubaModalItem.text;
        }
        return cubaModalItem.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final CubaModalItem copy(String code, String text) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(text, "text");
        return new CubaModalItem(code, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CubaModalItem)) {
            return false;
        }
        CubaModalItem cubaModalItem = (CubaModalItem) other;
        return Intrinsics.areEqual(this.code, cubaModalItem.code) && Intrinsics.areEqual(this.text, cubaModalItem.text);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        return "CubaModalItem(code=" + this.code + ", text=" + this.text + ")";
    }
}
