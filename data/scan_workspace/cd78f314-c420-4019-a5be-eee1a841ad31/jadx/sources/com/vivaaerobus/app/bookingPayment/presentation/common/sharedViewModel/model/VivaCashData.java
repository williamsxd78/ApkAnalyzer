package com.vivaaerobus.app.bookingPayment.presentation.common.sharedViewModel.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VivaCashData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0014\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001b\"\u0004\b\u001e\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006."}, d2 = {"Lcom/vivaaerobus/app/bookingPayment/presentation/common/sharedViewModel/model/VivaCashData;", "", "availableAmount", "", "amountToBeRedeemed", "increaseOrDecreaseAmount", "", "minAmount", "removeVivaCash", "", "isVivaCashAvailable", "savedVivaCashData", "<init>", "(DDIIZZZ)V", "getAvailableAmount", "()D", "setAvailableAmount", "(D)V", "getAmountToBeRedeemed", "setAmountToBeRedeemed", "getIncreaseOrDecreaseAmount", "()I", "setIncreaseOrDecreaseAmount", "(I)V", "getMinAmount", "setMinAmount", "getRemoveVivaCash", "()Z", "setRemoveVivaCash", "(Z)V", "setVivaCashAvailable", "getSavedVivaCashData", "setSavedVivaCashData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "toString", "", "bookingPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VivaCashData {
    public static final int $stable = 8;
    private double amountToBeRedeemed;
    private double availableAmount;
    private int increaseOrDecreaseAmount;
    private boolean isVivaCashAvailable;
    private int minAmount;
    private boolean removeVivaCash;
    private boolean savedVivaCashData;

    public VivaCashData() {
        this(0.0d, 0.0d, 0, 0, false, false, false, 127, null);
    }

    public VivaCashData(double d, double d2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.availableAmount = d;
        this.amountToBeRedeemed = d2;
        this.increaseOrDecreaseAmount = i;
        this.minAmount = i2;
        this.removeVivaCash = z;
        this.isVivaCashAvailable = z2;
        this.savedVivaCashData = z3;
    }

    public /* synthetic */ VivaCashData(double d, double d2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0d : d, (i3 & 2) != 0 ? 0.0d : d2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3);
    }

    public static /* synthetic */ VivaCashData copy$default(VivaCashData vivaCashData, double d, double d2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d = vivaCashData.availableAmount;
        }
        double d3 = d;
        if ((i3 & 2) != 0) {
            d2 = vivaCashData.amountToBeRedeemed;
        }
        double d4 = d2;
        if ((i3 & 4) != 0) {
            i = vivaCashData.increaseOrDecreaseAmount;
        }
        return vivaCashData.copy(d3, d4, i, (i3 & 8) != 0 ? vivaCashData.minAmount : i2, (i3 & 16) != 0 ? vivaCashData.removeVivaCash : z, (i3 & 32) != 0 ? vivaCashData.isVivaCashAvailable : z2, (i3 & 64) != 0 ? vivaCashData.savedVivaCashData : z3);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAvailableAmount() {
        return this.availableAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmountToBeRedeemed() {
        return this.amountToBeRedeemed;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIncreaseOrDecreaseAmount() {
        return this.increaseOrDecreaseAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinAmount() {
        return this.minAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRemoveVivaCash() {
        return this.removeVivaCash;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsVivaCashAvailable() {
        return this.isVivaCashAvailable;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSavedVivaCashData() {
        return this.savedVivaCashData;
    }

    public final VivaCashData copy(double availableAmount, double amountToBeRedeemed, int increaseOrDecreaseAmount, int minAmount, boolean removeVivaCash, boolean isVivaCashAvailable, boolean savedVivaCashData) {
        return new VivaCashData(availableAmount, amountToBeRedeemed, increaseOrDecreaseAmount, minAmount, removeVivaCash, isVivaCashAvailable, savedVivaCashData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VivaCashData)) {
            return false;
        }
        VivaCashData vivaCashData = (VivaCashData) other;
        return Double.compare(this.availableAmount, vivaCashData.availableAmount) == 0 && Double.compare(this.amountToBeRedeemed, vivaCashData.amountToBeRedeemed) == 0 && this.increaseOrDecreaseAmount == vivaCashData.increaseOrDecreaseAmount && this.minAmount == vivaCashData.minAmount && this.removeVivaCash == vivaCashData.removeVivaCash && this.isVivaCashAvailable == vivaCashData.isVivaCashAvailable && this.savedVivaCashData == vivaCashData.savedVivaCashData;
    }

    public final double getAmountToBeRedeemed() {
        return this.amountToBeRedeemed;
    }

    public final double getAvailableAmount() {
        return this.availableAmount;
    }

    public final int getIncreaseOrDecreaseAmount() {
        return this.increaseOrDecreaseAmount;
    }

    public final int getMinAmount() {
        return this.minAmount;
    }

    public final boolean getRemoveVivaCash() {
        return this.removeVivaCash;
    }

    public final boolean getSavedVivaCashData() {
        return this.savedVivaCashData;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.availableAmount) * 31) + Double.hashCode(this.amountToBeRedeemed)) * 31) + Integer.hashCode(this.increaseOrDecreaseAmount)) * 31) + Integer.hashCode(this.minAmount)) * 31) + Boolean.hashCode(this.removeVivaCash)) * 31) + Boolean.hashCode(this.isVivaCashAvailable)) * 31) + Boolean.hashCode(this.savedVivaCashData);
    }

    public final boolean isVivaCashAvailable() {
        return this.isVivaCashAvailable;
    }

    public final void setAmountToBeRedeemed(double d) {
        this.amountToBeRedeemed = d;
    }

    public final void setAvailableAmount(double d) {
        this.availableAmount = d;
    }

    public final void setIncreaseOrDecreaseAmount(int i) {
        this.increaseOrDecreaseAmount = i;
    }

    public final void setMinAmount(int i) {
        this.minAmount = i;
    }

    public final void setRemoveVivaCash(boolean z) {
        this.removeVivaCash = z;
    }

    public final void setSavedVivaCashData(boolean z) {
        this.savedVivaCashData = z;
    }

    public final void setVivaCashAvailable(boolean z) {
        this.isVivaCashAvailable = z;
    }

    public String toString() {
        return "VivaCashData(availableAmount=" + this.availableAmount + ", amountToBeRedeemed=" + this.amountToBeRedeemed + ", increaseOrDecreaseAmount=" + this.increaseOrDecreaseAmount + ", minAmount=" + this.minAmount + ", removeVivaCash=" + this.removeVivaCash + ", isVivaCashAvailable=" + this.isVivaCashAvailable + ", savedVivaCashData=" + this.savedVivaCashData + ")";
    }
}
