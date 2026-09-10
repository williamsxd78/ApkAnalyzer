package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: YunoPayload.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/YunoPayload;", "", "oneTimeToken", "", "<init>", "(Ljava/lang/String;)V", "getOneTimeToken", "()Ljava/lang/String;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class YunoPayload {
    private final String oneTimeToken;

    public YunoPayload(String oneTimeToken) {
        Intrinsics.checkNotNullParameter(oneTimeToken, "oneTimeToken");
        this.oneTimeToken = oneTimeToken;
    }

    public static /* synthetic */ YunoPayload copy$default(YunoPayload yunoPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yunoPayload.oneTimeToken;
        }
        return yunoPayload.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOneTimeToken() {
        return this.oneTimeToken;
    }

    public final YunoPayload copy(String oneTimeToken) {
        Intrinsics.checkNotNullParameter(oneTimeToken, "oneTimeToken");
        return new YunoPayload(oneTimeToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YunoPayload) && Intrinsics.areEqual(this.oneTimeToken, ((YunoPayload) other).oneTimeToken);
    }

    public final String getOneTimeToken() {
        return this.oneTimeToken;
    }

    public int hashCode() {
        return this.oneTimeToken.hashCode();
    }

    public String toString() {
        return "YunoPayload(oneTimeToken=" + this.oneTimeToken + ")";
    }
}
