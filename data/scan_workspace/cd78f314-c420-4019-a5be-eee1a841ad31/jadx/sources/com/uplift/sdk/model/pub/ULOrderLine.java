package com.uplift.sdk.model.pub;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULOrderLine.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/uplift/sdk/model/pub/ULOrderLine;", "Ljava/io/Serializable;", "name", "", "sku", "productUrl", FirebaseAnalytics.Param.QUANTITY, "", "unitPrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getProductUrl", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSku", "getUnitPrice", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/uplift/sdk/model/pub/ULOrderLine;", "equals", "", "other", "", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULOrderLine implements Serializable {
    private final String name;
    private final String productUrl;
    private final Integer quantity;
    private final String sku;
    private final Integer unitPrice;

    public ULOrderLine(String name, String str, String str2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.sku = str;
        this.productUrl = str2;
        this.quantity = num;
        this.unitPrice = num2;
    }

    public static /* synthetic */ ULOrderLine copy$default(ULOrderLine uLOrderLine, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLOrderLine.name;
        }
        if ((i & 2) != 0) {
            str2 = uLOrderLine.sku;
        }
        if ((i & 4) != 0) {
            str3 = uLOrderLine.productUrl;
        }
        if ((i & 8) != 0) {
            num = uLOrderLine.quantity;
        }
        if ((i & 16) != 0) {
            num2 = uLOrderLine.unitPrice;
        }
        Integer num3 = num2;
        String str4 = str3;
        return uLOrderLine.copy(str, str2, str4, num, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProductUrl() {
        return this.productUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getUnitPrice() {
        return this.unitPrice;
    }

    public final ULOrderLine copy(String name, String sku, String productUrl, Integer quantity, Integer unitPrice) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ULOrderLine(name, sku, productUrl, quantity, unitPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULOrderLine)) {
            return false;
        }
        ULOrderLine uLOrderLine = (ULOrderLine) other;
        return Intrinsics.areEqual(this.name, uLOrderLine.name) && Intrinsics.areEqual(this.sku, uLOrderLine.sku) && Intrinsics.areEqual(this.productUrl, uLOrderLine.productUrl) && Intrinsics.areEqual(this.quantity, uLOrderLine.quantity) && Intrinsics.areEqual(this.unitPrice, uLOrderLine.unitPrice);
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
        int hashCode = this.name.hashCode() * 31;
        String str = this.sku;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unitPrice;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ULOrderLine(name=" + this.name + ", sku=" + this.sku + ", productUrl=" + this.productUrl + ", quantity=" + this.quantity + ", unitPrice=" + this.unitPrice + ')';
    }
}
