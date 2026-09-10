package com.vivaaerobus.app.bookingPayment.presentation.carbonOffset.adapter;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.extras.extraDetail.activity.ExtraDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CarbonOffsetOptionData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/vivaaerobus/app/bookingPayment/presentation/carbonOffset/adapter/CarbonOffsetOptionData;", "", "isSelected", "", "priceWithCurrencyAndSymbol", "", ExtraDetailActivity.ARG_SSR_CODE, "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "setSelected", "(Z)V", "getPriceWithCurrencyAndSymbol", "()Ljava/lang/String;", "getSsrCode", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "bookingPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CarbonOffsetOptionData {
    public static final int $stable = 8;
    private boolean isSelected;
    private final String priceWithCurrencyAndSymbol;
    private final String ssrCode;

    public CarbonOffsetOptionData(boolean z, String priceWithCurrencyAndSymbol, String ssrCode) {
        Intrinsics.checkNotNullParameter(priceWithCurrencyAndSymbol, "priceWithCurrencyAndSymbol");
        Intrinsics.checkNotNullParameter(ssrCode, "ssrCode");
        this.isSelected = z;
        this.priceWithCurrencyAndSymbol = priceWithCurrencyAndSymbol;
        this.ssrCode = ssrCode;
    }

    public static /* synthetic */ CarbonOffsetOptionData copy$default(CarbonOffsetOptionData carbonOffsetOptionData, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = carbonOffsetOptionData.isSelected;
        }
        if ((i & 2) != 0) {
            str = carbonOffsetOptionData.priceWithCurrencyAndSymbol;
        }
        if ((i & 4) != 0) {
            str2 = carbonOffsetOptionData.ssrCode;
        }
        return carbonOffsetOptionData.copy(z, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPriceWithCurrencyAndSymbol() {
        return this.priceWithCurrencyAndSymbol;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSsrCode() {
        return this.ssrCode;
    }

    public final CarbonOffsetOptionData copy(boolean isSelected, String priceWithCurrencyAndSymbol, String ssrCode) {
        Intrinsics.checkNotNullParameter(priceWithCurrencyAndSymbol, "priceWithCurrencyAndSymbol");
        Intrinsics.checkNotNullParameter(ssrCode, "ssrCode");
        return new CarbonOffsetOptionData(isSelected, priceWithCurrencyAndSymbol, ssrCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarbonOffsetOptionData)) {
            return false;
        }
        CarbonOffsetOptionData carbonOffsetOptionData = (CarbonOffsetOptionData) other;
        return this.isSelected == carbonOffsetOptionData.isSelected && Intrinsics.areEqual(this.priceWithCurrencyAndSymbol, carbonOffsetOptionData.priceWithCurrencyAndSymbol) && Intrinsics.areEqual(this.ssrCode, carbonOffsetOptionData.ssrCode);
    }

    public final String getPriceWithCurrencyAndSymbol() {
        return this.priceWithCurrencyAndSymbol;
    }

    public final String getSsrCode() {
        return this.ssrCode;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isSelected) * 31) + this.priceWithCurrencyAndSymbol.hashCode()) * 31) + this.ssrCode.hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return "CarbonOffsetOptionData(isSelected=" + this.isSelected + ", priceWithCurrencyAndSymbol=" + this.priceWithCurrencyAndSymbol + ", ssrCode=" + this.ssrCode + ")";
    }
}
