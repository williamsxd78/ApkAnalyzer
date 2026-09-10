package com.vivaaerobus.app.components.shoppingCart.adapter.chargeDetails;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChargeDetailsData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/vivaaerobus/app/components/shoppingCart/adapter/chargeDetails/ChargeDetailsData;", "", "title", "", "amount", "multiplier", "isDiscount", "", "isGuestFeeNotification", "isGuestFeeCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getTitle", "()Ljava/lang/String;", "getAmount", "getMultiplier", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChargeDetailsData {
    public static final int $stable = 0;
    private final String amount;
    private final boolean isDiscount;
    private final boolean isGuestFeeCode;
    private final boolean isGuestFeeNotification;
    private final String multiplier;
    private final String title;

    public ChargeDetailsData(String title, String amount, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.title = title;
        this.amount = amount;
        this.multiplier = str;
        this.isDiscount = z;
        this.isGuestFeeNotification = z2;
        this.isGuestFeeCode = z3;
    }

    public static /* synthetic */ ChargeDetailsData copy$default(ChargeDetailsData chargeDetailsData, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chargeDetailsData.title;
        }
        if ((i & 2) != 0) {
            str2 = chargeDetailsData.amount;
        }
        if ((i & 4) != 0) {
            str3 = chargeDetailsData.multiplier;
        }
        if ((i & 8) != 0) {
            z = chargeDetailsData.isDiscount;
        }
        if ((i & 16) != 0) {
            z2 = chargeDetailsData.isGuestFeeNotification;
        }
        if ((i & 32) != 0) {
            z3 = chargeDetailsData.isGuestFeeCode;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return chargeDetailsData.copy(str, str2, str3, z, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMultiplier() {
        return this.multiplier;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDiscount() {
        return this.isDiscount;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsGuestFeeNotification() {
        return this.isGuestFeeNotification;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsGuestFeeCode() {
        return this.isGuestFeeCode;
    }

    public final ChargeDetailsData copy(String title, String amount, String multiplier, boolean isDiscount, boolean isGuestFeeNotification, boolean isGuestFeeCode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new ChargeDetailsData(title, amount, multiplier, isDiscount, isGuestFeeNotification, isGuestFeeCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChargeDetailsData)) {
            return false;
        }
        ChargeDetailsData chargeDetailsData = (ChargeDetailsData) other;
        return Intrinsics.areEqual(this.title, chargeDetailsData.title) && Intrinsics.areEqual(this.amount, chargeDetailsData.amount) && Intrinsics.areEqual(this.multiplier, chargeDetailsData.multiplier) && this.isDiscount == chargeDetailsData.isDiscount && this.isGuestFeeNotification == chargeDetailsData.isGuestFeeNotification && this.isGuestFeeCode == chargeDetailsData.isGuestFeeCode;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getMultiplier() {
        return this.multiplier;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.amount.hashCode()) * 31;
        String str = this.multiplier;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isDiscount)) * 31) + Boolean.hashCode(this.isGuestFeeNotification)) * 31) + Boolean.hashCode(this.isGuestFeeCode);
    }

    public final boolean isDiscount() {
        return this.isDiscount;
    }

    public final boolean isGuestFeeCode() {
        return this.isGuestFeeCode;
    }

    public final boolean isGuestFeeNotification() {
        return this.isGuestFeeNotification;
    }

    public String toString() {
        return "ChargeDetailsData(title=" + this.title + ", amount=" + this.amount + ", multiplier=" + this.multiplier + ", isDiscount=" + this.isDiscount + ", isGuestFeeNotification=" + this.isGuestFeeNotification + ", isGuestFeeCode=" + this.isGuestFeeCode + ")";
    }
}
