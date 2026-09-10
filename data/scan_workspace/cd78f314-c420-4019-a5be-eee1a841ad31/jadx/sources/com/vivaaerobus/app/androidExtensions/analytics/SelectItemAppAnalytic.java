package com.vivaaerobus.app.androidExtensions.analytics;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectItemAppAnalytic.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/vivaaerobus/app/androidExtensions/analytics/SelectItemAppAnalytic;", "", "itemId", "", "itemName", "itemCategory", "itemPrice", "", "flow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getItemId", "()Ljava/lang/String;", "getItemName", "getItemCategory", "getItemPrice", "()D", "getFlow", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "androidExtensions_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectItemAppAnalytic {
    public static final int $stable = 0;
    private final String flow;
    private final String itemCategory;
    private final String itemId;
    private final String itemName;
    private final double itemPrice;

    public SelectItemAppAnalytic(String itemId, String itemName, String itemCategory, double d, String flow) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(itemCategory, "itemCategory");
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemPrice = d;
        this.flow = flow;
    }

    public static /* synthetic */ SelectItemAppAnalytic copy$default(SelectItemAppAnalytic selectItemAppAnalytic, String str, String str2, String str3, double d, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectItemAppAnalytic.itemId;
        }
        if ((i & 2) != 0) {
            str2 = selectItemAppAnalytic.itemName;
        }
        if ((i & 4) != 0) {
            str3 = selectItemAppAnalytic.itemCategory;
        }
        if ((i & 8) != 0) {
            d = selectItemAppAnalytic.itemPrice;
        }
        if ((i & 16) != 0) {
            str4 = selectItemAppAnalytic.flow;
        }
        String str5 = str4;
        String str6 = str3;
        return selectItemAppAnalytic.copy(str, str2, str6, d, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getItemCategory() {
        return this.itemCategory;
    }

    /* renamed from: component4, reason: from getter */
    public final double getItemPrice() {
        return this.itemPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    public final SelectItemAppAnalytic copy(String itemId, String itemName, String itemCategory, double itemPrice, String flow) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(itemCategory, "itemCategory");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return new SelectItemAppAnalytic(itemId, itemName, itemCategory, itemPrice, flow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectItemAppAnalytic)) {
            return false;
        }
        SelectItemAppAnalytic selectItemAppAnalytic = (SelectItemAppAnalytic) other;
        return Intrinsics.areEqual(this.itemId, selectItemAppAnalytic.itemId) && Intrinsics.areEqual(this.itemName, selectItemAppAnalytic.itemName) && Intrinsics.areEqual(this.itemCategory, selectItemAppAnalytic.itemCategory) && Double.compare(this.itemPrice, selectItemAppAnalytic.itemPrice) == 0 && Intrinsics.areEqual(this.flow, selectItemAppAnalytic.flow);
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getItemCategory() {
        return this.itemCategory;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final double getItemPrice() {
        return this.itemPrice;
    }

    public int hashCode() {
        return (((((((this.itemId.hashCode() * 31) + this.itemName.hashCode()) * 31) + this.itemCategory.hashCode()) * 31) + Double.hashCode(this.itemPrice)) * 31) + this.flow.hashCode();
    }

    public String toString() {
        return "SelectItemAppAnalytic(itemId=" + this.itemId + ", itemName=" + this.itemName + ", itemCategory=" + this.itemCategory + ", itemPrice=" + this.itemPrice + ", flow=" + this.flow + ")";
    }
}
