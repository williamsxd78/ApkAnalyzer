package com.uplift.sdk.model.priv;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULMerchantDataRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/uplift/sdk/model/priv/ULMerchantDataRequest;", "", "path", "", "merchantUrl", "shopId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantUrl", "()Ljava/lang/String;", "getPath", "getShopId", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULMerchantDataRequest {

    @SerializedName("merchant_url")
    private final String merchantUrl;

    @SerializedName("path")
    private final String path;

    @SerializedName("shop_id")
    private final String shopId;

    public ULMerchantDataRequest(String path, String str, String str2) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.merchantUrl = str;
        this.shopId = str2;
    }

    public static /* synthetic */ ULMerchantDataRequest copy$default(ULMerchantDataRequest uLMerchantDataRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLMerchantDataRequest.path;
        }
        if ((i & 2) != 0) {
            str2 = uLMerchantDataRequest.merchantUrl;
        }
        if ((i & 4) != 0) {
            str3 = uLMerchantDataRequest.shopId;
        }
        return uLMerchantDataRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMerchantUrl() {
        return this.merchantUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShopId() {
        return this.shopId;
    }

    public final ULMerchantDataRequest copy(String path, String merchantUrl, String shopId) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new ULMerchantDataRequest(path, merchantUrl, shopId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULMerchantDataRequest)) {
            return false;
        }
        ULMerchantDataRequest uLMerchantDataRequest = (ULMerchantDataRequest) other;
        return Intrinsics.areEqual(this.path, uLMerchantDataRequest.path) && Intrinsics.areEqual(this.merchantUrl, uLMerchantDataRequest.merchantUrl) && Intrinsics.areEqual(this.shopId, uLMerchantDataRequest.shopId);
    }

    public final String getMerchantUrl() {
        return this.merchantUrl;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getShopId() {
        return this.shopId;
    }

    public int hashCode() {
        int hashCode = this.path.hashCode() * 31;
        String str = this.merchantUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shopId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ULMerchantDataRequest(path=" + this.path + ", merchantUrl=" + this.merchantUrl + ", shopId=" + this.shopId + ')';
    }
}
