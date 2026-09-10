package com.uplift.sdk.model.priv;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULOrderLineRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJH\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/uplift/sdk/model/priv/ULOrderLineRequest;", "", "productUrl", "", "name", "sku", FirebaseAnalytics.Param.QUANTITY, "", "unitPrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getProductUrl", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSku", "getUnitPrice", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/uplift/sdk/model/priv/ULOrderLineRequest;", "equals", "", "other", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULOrderLineRequest {

    @SerializedName("name")
    private final String name;

    @SerializedName("product_url")
    private final String productUrl;

    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private final Integer quantity;

    @SerializedName("sku")
    private final String sku;

    @SerializedName("unit_price")
    private final Integer unitPrice;

    public ULOrderLineRequest(String str, String name, String str2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.productUrl = str;
        this.name = name;
        this.sku = str2;
        this.quantity = num;
        this.unitPrice = num2;
    }

    public static /* synthetic */ ULOrderLineRequest copy$default(ULOrderLineRequest uLOrderLineRequest, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLOrderLineRequest.productUrl;
        }
        if ((i & 2) != 0) {
            str2 = uLOrderLineRequest.name;
        }
        if ((i & 4) != 0) {
            str3 = uLOrderLineRequest.sku;
        }
        if ((i & 8) != 0) {
            num = uLOrderLineRequest.quantity;
        }
        if ((i & 16) != 0) {
            num2 = uLOrderLineRequest.unitPrice;
        }
        Integer num3 = num2;
        String str4 = str3;
        return uLOrderLineRequest.copy(str, str2, str4, num, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductUrl() {
        return this.productUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getUnitPrice() {
        return this.unitPrice;
    }

    public final ULOrderLineRequest copy(String productUrl, String name, String sku, Integer quantity, Integer unitPrice) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ULOrderLineRequest(productUrl, name, sku, quantity, unitPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULOrderLineRequest)) {
            return false;
        }
        ULOrderLineRequest uLOrderLineRequest = (ULOrderLineRequest) other;
        return Intrinsics.areEqual(this.productUrl, uLOrderLineRequest.productUrl) && Intrinsics.areEqual(this.name, uLOrderLineRequest.name) && Intrinsics.areEqual(this.sku, uLOrderLineRequest.sku) && Intrinsics.areEqual(this.quantity, uLOrderLineRequest.quantity) && Intrinsics.areEqual(this.unitPrice, uLOrderLineRequest.unitPrice);
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductUrl() {
        return this.productUrl;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public final Integer getUnitPrice() {
        return this.unitPrice;
    }

    public int hashCode() {
        String str = this.productUrl;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str2 = this.sku;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unitPrice;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ULOrderLineRequest(productUrl=" + this.productUrl + ", name=" + this.name + ", sku=" + this.sku + ", quantity=" + this.quantity + ", unitPrice=" + this.unitPrice + ')';
    }
}
