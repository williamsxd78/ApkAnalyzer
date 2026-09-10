package com.vivaaerobus.app.shared.authentication.domain.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActiveFeature.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/shared/authentication/domain/model/ActiveFeature;", "", "code", "", "isEditable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/vivaaerobus/app/shared/authentication/domain/model/ActiveFeature;", "equals", "other", "hashCode", "", "toString", "authentication_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ActiveFeature {
    private final String code;
    private final Boolean isEditable;

    public ActiveFeature(String str, Boolean bool) {
        this.code = str;
        this.isEditable = bool;
    }

    public static /* synthetic */ ActiveFeature copy$default(ActiveFeature activeFeature, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeFeature.code;
        }
        if ((i & 2) != 0) {
            bool = activeFeature.isEditable;
        }
        return activeFeature.copy(str, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsEditable() {
        return this.isEditable;
    }

    public final ActiveFeature copy(String code, Boolean isEditable) {
        return new ActiveFeature(code, isEditable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveFeature)) {
            return false;
        }
        ActiveFeature activeFeature = (ActiveFeature) other;
        return Intrinsics.areEqual(this.code, activeFeature.code) && Intrinsics.areEqual(this.isEditable, activeFeature.isEditable);
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isEditable;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isEditable() {
        return this.isEditable;
    }

    public String toString() {
        return "ActiveFeature(code=" + this.code + ", isEditable=" + this.isEditable + ")";
    }
}
