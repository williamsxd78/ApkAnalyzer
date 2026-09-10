package com.vivaaerobus.app.androidExtensions.model.crmAttributionManager;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseItem.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/vivaaerobus/app/androidExtensions/model/crmAttributionManager/PurchaseItem;", "", "itemName", "", "itemCategory", "itemPrice", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "getItemName", "()Ljava/lang/String;", "getItemCategory", "getItemPrice", "()D", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "androidExtensions_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PurchaseItem {
    public static final int $stable = 0;
    private final String itemCategory;
    private final String itemName;
    private final double itemPrice;

    public PurchaseItem(String itemName, String itemCategory, double d) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(itemCategory, "itemCategory");
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemPrice = d;
    }

    public static /* synthetic */ PurchaseItem copy$default(PurchaseItem purchaseItem, String str, String str2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseItem.itemName;
        }
        if ((i & 2) != 0) {
            str2 = purchaseItem.itemCategory;
        }
        if ((i & 4) != 0) {
            d = purchaseItem.itemPrice;
        }
        return purchaseItem.copy(str, str2, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getItemCategory() {
        return this.itemCategory;
    }

    /* renamed from: component3, reason: from getter */
    public final double getItemPrice() {
        return this.itemPrice;
    }

    public final PurchaseItem copy(String itemName, String itemCategory, double itemPrice) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(itemCategory, "itemCategory");
        return new PurchaseItem(itemName, itemCategory, itemPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseItem)) {
            return false;
        }
        PurchaseItem purchaseItem = (PurchaseItem) other;
        return Intrinsics.areEqual(this.itemName, purchaseItem.itemName) && Intrinsics.areEqual(this.itemCategory, purchaseItem.itemCategory) && Double.compare(this.itemPrice, purchaseItem.itemPrice) == 0;
    }

    public final String getItemCategory() {
        return this.itemCategory;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final double getItemPrice() {
        return this.itemPrice;
    }

    public int hashCode() {
        return (((this.itemName.hashCode() * 31) + this.itemCategory.hashCode()) * 31) + Double.hashCode(this.itemPrice);
    }

    public String toString() {
        return "PurchaseItem(itemName=" + this.itemName + ", itemCategory=" + this.itemCategory + ", itemPrice=" + this.itemPrice + ")";
    }
}
