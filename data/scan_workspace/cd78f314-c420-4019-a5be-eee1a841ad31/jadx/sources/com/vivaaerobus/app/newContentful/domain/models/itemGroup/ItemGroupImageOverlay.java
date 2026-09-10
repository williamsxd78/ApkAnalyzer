package com.vivaaerobus.app.newContentful.domain.models.itemGroup;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ItemGroupImageOverlay.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/itemGroup/ItemGroupImageOverlay;", "", "color", "", "alpha", "", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "getColor", "()Ljava/lang/String;", "getAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Float;)Lcom/vivaaerobus/app/newContentful/domain/models/itemGroup/ItemGroupImageOverlay;", "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ItemGroupImageOverlay {
    private final Float alpha;
    private final String color;

    public ItemGroupImageOverlay(String str, Float f) {
        this.color = str;
        this.alpha = f;
    }

    public static /* synthetic */ ItemGroupImageOverlay copy$default(ItemGroupImageOverlay itemGroupImageOverlay, String str, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemGroupImageOverlay.color;
        }
        if ((i & 2) != 0) {
            f = itemGroupImageOverlay.alpha;
        }
        return itemGroupImageOverlay.copy(str, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getAlpha() {
        return this.alpha;
    }

    public final ItemGroupImageOverlay copy(String color, Float alpha) {
        return new ItemGroupImageOverlay(color, alpha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemGroupImageOverlay)) {
            return false;
        }
        ItemGroupImageOverlay itemGroupImageOverlay = (ItemGroupImageOverlay) other;
        return Intrinsics.areEqual(this.color, itemGroupImageOverlay.color) && Intrinsics.areEqual((Object) this.alpha, (Object) itemGroupImageOverlay.alpha);
    }

    public final Float getAlpha() {
        return this.alpha;
    }

    public final String getColor() {
        return this.color;
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.alpha;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        return "ItemGroupImageOverlay(color=" + this.color + ", alpha=" + this.alpha + ")";
    }
}
