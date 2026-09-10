package com.vivaaerobus.app.components.popup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TooltipPopup.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/components/popup/TooltipPopupContent;", "", "contentView", "Landroid/widget/LinearLayout;", "arrowView", "Landroid/widget/ImageView;", "<init>", "(Landroid/widget/LinearLayout;Landroid/widget/ImageView;)V", "getContentView", "()Landroid/widget/LinearLayout;", "getArrowView", "()Landroid/widget/ImageView;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class TooltipPopupContent {
    private final ImageView arrowView;
    private final LinearLayout contentView;

    public TooltipPopupContent(LinearLayout contentView, ImageView arrowView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(arrowView, "arrowView");
        this.contentView = contentView;
        this.arrowView = arrowView;
    }

    public static /* synthetic */ TooltipPopupContent copy$default(TooltipPopupContent tooltipPopupContent, LinearLayout linearLayout, ImageView imageView, int i, Object obj) {
        if ((i & 1) != 0) {
            linearLayout = tooltipPopupContent.contentView;
        }
        if ((i & 2) != 0) {
            imageView = tooltipPopupContent.arrowView;
        }
        return tooltipPopupContent.copy(linearLayout, imageView);
    }

    /* renamed from: component1, reason: from getter */
    public final LinearLayout getContentView() {
        return this.contentView;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageView getArrowView() {
        return this.arrowView;
    }

    public final TooltipPopupContent copy(LinearLayout contentView, ImageView arrowView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(arrowView, "arrowView");
        return new TooltipPopupContent(contentView, arrowView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipPopupContent)) {
            return false;
        }
        TooltipPopupContent tooltipPopupContent = (TooltipPopupContent) other;
        return Intrinsics.areEqual(this.contentView, tooltipPopupContent.contentView) && Intrinsics.areEqual(this.arrowView, tooltipPopupContent.arrowView);
    }

    public final ImageView getArrowView() {
        return this.arrowView;
    }

    public final LinearLayout getContentView() {
        return this.contentView;
    }

    public int hashCode() {
        return (this.contentView.hashCode() * 31) + this.arrowView.hashCode();
    }

    public String toString() {
        return "TooltipPopupContent(contentView=" + this.contentView + ", arrowView=" + this.arrowView + ")";
    }
}
