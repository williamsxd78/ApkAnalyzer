package com.vivaaerobus.app.bookingPayment.presentation.paymentProcessLoader.adapter;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;

/* compiled from: ReservationSummaryAdapterData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vivaaerobus/app/bookingPayment/presentation/paymentProcessLoader/adapter/ReservationSummaryAdapterData;", "", "spaceBetweenItems", "", "iconWidth", "iconHeight", "textColor", "textStyle", "<init>", "(IIIII)V", "getSpaceBetweenItems", "()I", "getIconWidth", "getIconHeight", "getTextColor", "getTextStyle", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "", "bookingPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReservationSummaryAdapterData {
    public static final int $stable = 0;
    private final int iconHeight;
    private final int iconWidth;
    private final int spaceBetweenItems;
    private final int textColor;
    private final int textStyle;

    public ReservationSummaryAdapterData(int i, int i2, int i3, int i4, int i5) {
        this.spaceBetweenItems = i;
        this.iconWidth = i2;
        this.iconHeight = i3;
        this.textColor = i4;
        this.textStyle = i5;
    }

    public static /* synthetic */ ReservationSummaryAdapterData copy$default(ReservationSummaryAdapterData reservationSummaryAdapterData, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = reservationSummaryAdapterData.spaceBetweenItems;
        }
        if ((i6 & 2) != 0) {
            i2 = reservationSummaryAdapterData.iconWidth;
        }
        if ((i6 & 4) != 0) {
            i3 = reservationSummaryAdapterData.iconHeight;
        }
        if ((i6 & 8) != 0) {
            i4 = reservationSummaryAdapterData.textColor;
        }
        if ((i6 & 16) != 0) {
            i5 = reservationSummaryAdapterData.textStyle;
        }
        int i7 = i5;
        int i8 = i3;
        return reservationSummaryAdapterData.copy(i, i2, i8, i4, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSpaceBetweenItems() {
        return this.spaceBetweenItems;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIconWidth() {
        return this.iconWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIconHeight() {
        return this.iconHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTextStyle() {
        return this.textStyle;
    }

    public final ReservationSummaryAdapterData copy(int spaceBetweenItems, int iconWidth, int iconHeight, int textColor, int textStyle) {
        return new ReservationSummaryAdapterData(spaceBetweenItems, iconWidth, iconHeight, textColor, textStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReservationSummaryAdapterData)) {
            return false;
        }
        ReservationSummaryAdapterData reservationSummaryAdapterData = (ReservationSummaryAdapterData) other;
        return this.spaceBetweenItems == reservationSummaryAdapterData.spaceBetweenItems && this.iconWidth == reservationSummaryAdapterData.iconWidth && this.iconHeight == reservationSummaryAdapterData.iconHeight && this.textColor == reservationSummaryAdapterData.textColor && this.textStyle == reservationSummaryAdapterData.textStyle;
    }

    public final int getIconHeight() {
        return this.iconHeight;
    }

    public final int getIconWidth() {
        return this.iconWidth;
    }

    public final int getSpaceBetweenItems() {
        return this.spaceBetweenItems;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.spaceBetweenItems) * 31) + Integer.hashCode(this.iconWidth)) * 31) + Integer.hashCode(this.iconHeight)) * 31) + Integer.hashCode(this.textColor)) * 31) + Integer.hashCode(this.textStyle);
    }

    public String toString() {
        return "ReservationSummaryAdapterData(spaceBetweenItems=" + this.spaceBetweenItems + ", iconWidth=" + this.iconWidth + ", iconHeight=" + this.iconHeight + ", textColor=" + this.textColor + ", textStyle=" + this.textStyle + ")";
    }
}
