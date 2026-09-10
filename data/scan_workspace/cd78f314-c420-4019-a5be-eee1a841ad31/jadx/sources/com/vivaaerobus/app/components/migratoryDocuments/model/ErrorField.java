package com.vivaaerobus.app.components.migratoryDocuments.model;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorField.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/components/migratoryDocuments/model/ErrorField;", "", i0.a.COLUMN_KEY, "", "hasError", "", "originalError", "<init>", "(Ljava/lang/String;ZZ)V", "getKey", "()Ljava/lang/String;", "getHasError", "()Z", "setHasError", "(Z)V", "getOriginalError", "setOriginalError", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ErrorField {
    public static final int $stable = 8;
    private boolean hasError;
    private final String key;
    private boolean originalError;

    public ErrorField(String key, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.hasError = z;
        this.originalError = z2;
    }

    public static /* synthetic */ ErrorField copy$default(ErrorField errorField, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorField.key;
        }
        if ((i & 2) != 0) {
            z = errorField.hasError;
        }
        if ((i & 4) != 0) {
            z2 = errorField.originalError;
        }
        return errorField.copy(str, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasError() {
        return this.hasError;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOriginalError() {
        return this.originalError;
    }

    public final ErrorField copy(String key, boolean hasError, boolean originalError) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ErrorField(key, hasError, originalError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorField)) {
            return false;
        }
        ErrorField errorField = (ErrorField) other;
        return Intrinsics.areEqual(this.key, errorField.key) && this.hasError == errorField.hasError && this.originalError == errorField.originalError;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getOriginalError() {
        return this.originalError;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + Boolean.hashCode(this.hasError)) * 31) + Boolean.hashCode(this.originalError);
    }

    public final void setHasError(boolean z) {
        this.hasError = z;
    }

    public final void setOriginalError(boolean z) {
        this.originalError = z;
    }

    public String toString() {
        return "ErrorField(key=" + this.key + ", hasError=" + this.hasError + ", originalError=" + this.originalError + ")";
    }
}
