package com.vivaaerobus.app.paymentMethods.domain.use_case.deletePaymentMethods;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeletePaymentMethodsParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/paymentMethods/domain/use_case/deletePaymentMethods/DeletePaymentMethodsParams;", "", i0.a.COLUMN_KEY, "", "<init>", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "payment_methods_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeletePaymentMethodsParams {
    private final String key;

    public DeletePaymentMethodsParams(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    public static /* synthetic */ DeletePaymentMethodsParams copy$default(DeletePaymentMethodsParams deletePaymentMethodsParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deletePaymentMethodsParams.key;
        }
        return deletePaymentMethodsParams.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final DeletePaymentMethodsParams copy(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new DeletePaymentMethodsParams(key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeletePaymentMethodsParams) && Intrinsics.areEqual(this.key, ((DeletePaymentMethodsParams) other).key);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "DeletePaymentMethodsParams(key=" + this.key + ")";
    }
}
