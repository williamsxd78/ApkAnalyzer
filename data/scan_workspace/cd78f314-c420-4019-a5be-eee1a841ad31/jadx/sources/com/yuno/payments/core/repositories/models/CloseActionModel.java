package com.yuno.payments.core.repositories.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: CloseActionModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yuno/payments/core/repositories/models/CloseActionModel;", "", "code", "", "(I)V", "getCode", "()I", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CloseActionModel {
    private final int code;

    public CloseActionModel(int i) {
        this.code = i;
    }

    public static /* synthetic */ CloseActionModel copy$default(CloseActionModel closeActionModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = closeActionModel.code;
        }
        return closeActionModel.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final CloseActionModel copy(int code) {
        return new CloseActionModel(code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CloseActionModel) && this.code == ((CloseActionModel) other).code;
    }

    public final int getCode() {
        return this.code;
    }

    public int hashCode() {
        return Integer.hashCode(this.code);
    }

    public String toString() {
        return "CloseActionModel(code=" + this.code + ")";
    }
}
