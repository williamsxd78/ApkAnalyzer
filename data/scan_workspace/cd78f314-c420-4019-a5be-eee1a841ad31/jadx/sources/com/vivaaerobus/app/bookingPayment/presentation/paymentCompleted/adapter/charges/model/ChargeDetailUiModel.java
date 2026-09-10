package com.vivaaerobus.app.bookingPayment.presentation.paymentCompleted.adapter.charges.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChargeDetailUiModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/vivaaerobus/app/bookingPayment/presentation/paymentCompleted/adapter/charges/model/ChargeDetailUiModel;", "", "title", "", "amount", "", "isGroup", "", "<init>", "(Ljava/lang/String;DZ)V", "getTitle", "()Ljava/lang/String;", "getAmount", "()D", "()Z", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "bookingPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChargeDetailUiModel {
    public static final int $stable = 0;
    private final double amount;
    private final boolean isGroup;
    private final String title;

    public ChargeDetailUiModel(String title, double d, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.amount = d;
        this.isGroup = z;
    }

    public static /* synthetic */ ChargeDetailUiModel copy$default(ChargeDetailUiModel chargeDetailUiModel, String str, double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chargeDetailUiModel.title;
        }
        if ((i & 2) != 0) {
            d = chargeDetailUiModel.amount;
        }
        if ((i & 4) != 0) {
            z = chargeDetailUiModel.isGroup;
        }
        return chargeDetailUiModel.copy(str, d, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsGroup() {
        return this.isGroup;
    }

    public final ChargeDetailUiModel copy(String title, double amount, boolean isGroup) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ChargeDetailUiModel(title, amount, isGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChargeDetailUiModel)) {
            return false;
        }
        ChargeDetailUiModel chargeDetailUiModel = (ChargeDetailUiModel) other;
        return Intrinsics.areEqual(this.title, chargeDetailUiModel.title) && Double.compare(this.amount, chargeDetailUiModel.amount) == 0 && this.isGroup == chargeDetailUiModel.isGroup;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Double.hashCode(this.amount)) * 31) + Boolean.hashCode(this.isGroup);
    }

    public final boolean isGroup() {
        return this.isGroup;
    }

    public String toString() {
        return "ChargeDetailUiModel(title=" + this.title + ", amount=" + this.amount + ", isGroup=" + this.isGroup + ")";
    }
}
