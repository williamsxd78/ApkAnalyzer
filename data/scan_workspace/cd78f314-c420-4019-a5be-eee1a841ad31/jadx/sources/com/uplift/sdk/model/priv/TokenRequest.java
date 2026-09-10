package com.uplift.sdk.model.priv;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TokenRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/uplift/sdk/model/priv/TokenRequest;", "", "customerId", "", "upCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerId", "()Ljava/lang/String;", "getUpCode", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TokenRequest {

    @SerializedName("customer_id")
    private final String customerId;

    @SerializedName("up_code")
    private final String upCode;

    public TokenRequest(String customerId, String upCode) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(upCode, "upCode");
        this.customerId = customerId;
        this.upCode = upCode;
    }

    public static /* synthetic */ TokenRequest copy$default(TokenRequest tokenRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenRequest.customerId;
        }
        if ((i & 2) != 0) {
            str2 = tokenRequest.upCode;
        }
        return tokenRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUpCode() {
        return this.upCode;
    }

    public final TokenRequest copy(String customerId, String upCode) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(upCode, "upCode");
        return new TokenRequest(customerId, upCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenRequest)) {
            return false;
        }
        TokenRequest tokenRequest = (TokenRequest) other;
        return Intrinsics.areEqual(this.customerId, tokenRequest.customerId) && Intrinsics.areEqual(this.upCode, tokenRequest.upCode);
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getUpCode() {
        return this.upCode;
    }

    public int hashCode() {
        return (this.customerId.hashCode() * 31) + this.upCode.hashCode();
    }

    public String toString() {
        return "TokenRequest(customerId=" + this.customerId + ", upCode=" + this.upCode + ')';
    }
}
