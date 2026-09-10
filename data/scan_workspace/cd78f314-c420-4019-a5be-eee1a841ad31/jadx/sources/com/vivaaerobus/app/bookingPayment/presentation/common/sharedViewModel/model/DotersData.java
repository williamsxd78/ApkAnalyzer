package com.vivaaerobus.app.bookingPayment.presentation.common.sharedViewModel.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DotersData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\u0081\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\u0014\u0010<\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010>\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010?\u001a\u00020@HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010&\"\u0004\b-\u0010(R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010&\"\u0004\b.\u0010(¨\u0006A"}, d2 = {"Lcom/vivaaerobus/app/bookingPayment/presentation/common/sharedViewModel/model/DotersData;", "", "availableAmount", "", "amountToBeRedeemed", "amountToBeRedeemedInCurrency", "", "increaseOrDecreaseAmount", "minAmount", "exchangeRate", "maxAmount", "savedDotersData", "", "wentThroughOtpFlow", "removeDoters", "isOtpRequired", "isDotersAvailable", "<init>", "(IIDIIDIZZZZZ)V", "getAvailableAmount", "()I", "setAvailableAmount", "(I)V", "getAmountToBeRedeemed", "setAmountToBeRedeemed", "getAmountToBeRedeemedInCurrency", "()D", "setAmountToBeRedeemedInCurrency", "(D)V", "getIncreaseOrDecreaseAmount", "setIncreaseOrDecreaseAmount", "getMinAmount", "setMinAmount", "getExchangeRate", "setExchangeRate", "getMaxAmount", "setMaxAmount", "getSavedDotersData", "()Z", "setSavedDotersData", "(Z)V", "getWentThroughOtpFlow", "setWentThroughOtpFlow", "getRemoveDoters", "setRemoveDoters", "setOtpRequired", "setDotersAvailable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "toString", "", "bookingPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DotersData {
    public static final int $stable = 8;
    private int amountToBeRedeemed;
    private double amountToBeRedeemedInCurrency;
    private int availableAmount;
    private double exchangeRate;
    private int increaseOrDecreaseAmount;
    private boolean isDotersAvailable;
    private boolean isOtpRequired;
    private int maxAmount;
    private int minAmount;
    private boolean removeDoters;
    private boolean savedDotersData;
    private boolean wentThroughOtpFlow;

    public DotersData() {
        this(0, 0, 0.0d, 0, 0, 0.0d, 0, false, false, false, false, false, 4095, null);
    }

    public DotersData(int i, int i2, double d, int i3, int i4, double d2, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.availableAmount = i;
        this.amountToBeRedeemed = i2;
        this.amountToBeRedeemedInCurrency = d;
        this.increaseOrDecreaseAmount = i3;
        this.minAmount = i4;
        this.exchangeRate = d2;
        this.maxAmount = i5;
        this.savedDotersData = z;
        this.wentThroughOtpFlow = z2;
        this.removeDoters = z3;
        this.isOtpRequired = z4;
        this.isDotersAvailable = z5;
    }

    public /* synthetic */ DotersData(int i, int i2, double d, int i3, int i4, double d2, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0.0d : d, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) == 0 ? d2 : 0.0d, (i6 & 64) != 0 ? 0 : i5, (i6 & 128) != 0 ? false : z, (i6 & 256) != 0 ? false : z2, (i6 & 512) != 0 ? false : z3, (i6 & 1024) != 0 ? false : z4, (i6 & 2048) != 0 ? false : z5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAvailableAmount() {
        return this.availableAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getRemoveDoters() {
        return this.removeDoters;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsOtpRequired() {
        return this.isOtpRequired;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsDotersAvailable() {
        return this.isDotersAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAmountToBeRedeemed() {
        return this.amountToBeRedeemed;
    }

    /* renamed from: component3, reason: from getter */
    public final double getAmountToBeRedeemedInCurrency() {
        return this.amountToBeRedeemedInCurrency;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIncreaseOrDecreaseAmount() {
        return this.increaseOrDecreaseAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMinAmount() {
        return this.minAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final double getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSavedDotersData() {
        return this.savedDotersData;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getWentThroughOtpFlow() {
        return this.wentThroughOtpFlow;
    }

    public final DotersData copy(int availableAmount, int amountToBeRedeemed, double amountToBeRedeemedInCurrency, int increaseOrDecreaseAmount, int minAmount, double exchangeRate, int maxAmount, boolean savedDotersData, boolean wentThroughOtpFlow, boolean removeDoters, boolean isOtpRequired, boolean isDotersAvailable) {
        return new DotersData(availableAmount, amountToBeRedeemed, amountToBeRedeemedInCurrency, increaseOrDecreaseAmount, minAmount, exchangeRate, maxAmount, savedDotersData, wentThroughOtpFlow, removeDoters, isOtpRequired, isDotersAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DotersData)) {
            return false;
        }
        DotersData dotersData = (DotersData) other;
        return this.availableAmount == dotersData.availableAmount && this.amountToBeRedeemed == dotersData.amountToBeRedeemed && Double.compare(this.amountToBeRedeemedInCurrency, dotersData.amountToBeRedeemedInCurrency) == 0 && this.increaseOrDecreaseAmount == dotersData.increaseOrDecreaseAmount && this.minAmount == dotersData.minAmount && Double.compare(this.exchangeRate, dotersData.exchangeRate) == 0 && this.maxAmount == dotersData.maxAmount && this.savedDotersData == dotersData.savedDotersData && this.wentThroughOtpFlow == dotersData.wentThroughOtpFlow && this.removeDoters == dotersData.removeDoters && this.isOtpRequired == dotersData.isOtpRequired && this.isDotersAvailable == dotersData.isDotersAvailable;
    }

    public final int getAmountToBeRedeemed() {
        return this.amountToBeRedeemed;
    }

    public final double getAmountToBeRedeemedInCurrency() {
        return this.amountToBeRedeemedInCurrency;
    }

    public final int getAvailableAmount() {
        return this.availableAmount;
    }

    public final double getExchangeRate() {
        return this.exchangeRate;
    }

    public final int getIncreaseOrDecreaseAmount() {
        return this.increaseOrDecreaseAmount;
    }

    public final int getMaxAmount() {
        return this.maxAmount;
    }

    public final int getMinAmount() {
        return this.minAmount;
    }

    public final boolean getRemoveDoters() {
        return this.removeDoters;
    }

    public final boolean getSavedDotersData() {
        return this.savedDotersData;
    }

    public final boolean getWentThroughOtpFlow() {
        return this.wentThroughOtpFlow;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.availableAmount) * 31) + Integer.hashCode(this.amountToBeRedeemed)) * 31) + Double.hashCode(this.amountToBeRedeemedInCurrency)) * 31) + Integer.hashCode(this.increaseOrDecreaseAmount)) * 31) + Integer.hashCode(this.minAmount)) * 31) + Double.hashCode(this.exchangeRate)) * 31) + Integer.hashCode(this.maxAmount)) * 31) + Boolean.hashCode(this.savedDotersData)) * 31) + Boolean.hashCode(this.wentThroughOtpFlow)) * 31) + Boolean.hashCode(this.removeDoters)) * 31) + Boolean.hashCode(this.isOtpRequired)) * 31) + Boolean.hashCode(this.isDotersAvailable);
    }

    public final boolean isDotersAvailable() {
        return this.isDotersAvailable;
    }

    public final boolean isOtpRequired() {
        return this.isOtpRequired;
    }

    public final void setAmountToBeRedeemed(int i) {
        this.amountToBeRedeemed = i;
    }

    public final void setAmountToBeRedeemedInCurrency(double d) {
        this.amountToBeRedeemedInCurrency = d;
    }

    public final void setAvailableAmount(int i) {
        this.availableAmount = i;
    }

    public final void setDotersAvailable(boolean z) {
        this.isDotersAvailable = z;
    }

    public final void setExchangeRate(double d) {
        this.exchangeRate = d;
    }

    public final void setIncreaseOrDecreaseAmount(int i) {
        this.increaseOrDecreaseAmount = i;
    }

    public final void setMaxAmount(int i) {
        this.maxAmount = i;
    }

    public final void setMinAmount(int i) {
        this.minAmount = i;
    }

    public final void setOtpRequired(boolean z) {
        this.isOtpRequired = z;
    }

    public final void setRemoveDoters(boolean z) {
        this.removeDoters = z;
    }

    public final void setSavedDotersData(boolean z) {
        this.savedDotersData = z;
    }

    public final void setWentThroughOtpFlow(boolean z) {
        this.wentThroughOtpFlow = z;
    }

    public String toString() {
        return "DotersData(availableAmount=" + this.availableAmount + ", amountToBeRedeemed=" + this.amountToBeRedeemed + ", amountToBeRedeemedInCurrency=" + this.amountToBeRedeemedInCurrency + ", increaseOrDecreaseAmount=" + this.increaseOrDecreaseAmount + ", minAmount=" + this.minAmount + ", exchangeRate=" + this.exchangeRate + ", maxAmount=" + this.maxAmount + ", savedDotersData=" + this.savedDotersData + ", wentThroughOtpFlow=" + this.wentThroughOtpFlow + ", removeDoters=" + this.removeDoters + ", isOtpRequired=" + this.isOtpRequired + ", isDotersAvailable=" + this.isDotersAvailable + ")";
    }
}
