package com.vivaaerobus.app.components.common.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: ImageViewBoundsModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/components/common/model/ImageViewBoundsModel;", "", "iconWidth", "", "iconHeight", "<init>", "(II)V", "getIconWidth", "()I", "getIconHeight", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ImageViewBoundsModel {
    public static final int $stable = 0;
    private final int iconHeight;
    private final int iconWidth;

    public ImageViewBoundsModel(int i, int i2) {
        this.iconWidth = i;
        this.iconHeight = i2;
    }

    public static /* synthetic */ ImageViewBoundsModel copy$default(ImageViewBoundsModel imageViewBoundsModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = imageViewBoundsModel.iconWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = imageViewBoundsModel.iconHeight;
        }
        return imageViewBoundsModel.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIconWidth() {
        return this.iconWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIconHeight() {
        return this.iconHeight;
    }

    public final ImageViewBoundsModel copy(int iconWidth, int iconHeight) {
        return new ImageViewBoundsModel(iconWidth, iconHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageViewBoundsModel)) {
            return false;
        }
        ImageViewBoundsModel imageViewBoundsModel = (ImageViewBoundsModel) other;
        return this.iconWidth == imageViewBoundsModel.iconWidth && this.iconHeight == imageViewBoundsModel.iconHeight;
    }

    public final int getIconHeight() {
        return this.iconHeight;
    }

    public final int getIconWidth() {
        return this.iconWidth;
    }

    public int hashCode() {
        return (Integer.hashCode(this.iconWidth) * 31) + Integer.hashCode(this.iconHeight);
    }

    public String toString() {
        return "ImageViewBoundsModel(iconWidth=" + this.iconWidth + ", iconHeight=" + this.iconHeight + ")";
    }
}
