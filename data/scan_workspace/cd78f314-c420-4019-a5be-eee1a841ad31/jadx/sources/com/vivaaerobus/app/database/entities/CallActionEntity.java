package com.vivaaerobus.app.database.entities;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CallActionEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/database/entities/CallActionEntity;", "", "url", "", TypedValues.AttributesType.S_TARGET, "actionText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getTarget", "getActionText", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CallActionEntity {
    private final String actionText;
    private final String target;
    private final String url;

    public CallActionEntity(String url, String str, String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.target = str;
        this.actionText = str2;
    }

    public static /* synthetic */ CallActionEntity copy$default(CallActionEntity callActionEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callActionEntity.url;
        }
        if ((i & 2) != 0) {
            str2 = callActionEntity.target;
        }
        if ((i & 4) != 0) {
            str3 = callActionEntity.actionText;
        }
        return callActionEntity.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActionText() {
        return this.actionText;
    }

    public final CallActionEntity copy(String url, String target, String actionText) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new CallActionEntity(url, target, actionText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallActionEntity)) {
            return false;
        }
        CallActionEntity callActionEntity = (CallActionEntity) other;
        return Intrinsics.areEqual(this.url, callActionEntity.url) && Intrinsics.areEqual(this.target, callActionEntity.target) && Intrinsics.areEqual(this.actionText, callActionEntity.actionText);
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.target;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actionText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CallActionEntity(url=" + this.url + ", target=" + this.target + ", actionText=" + this.actionText + ")";
    }
}
