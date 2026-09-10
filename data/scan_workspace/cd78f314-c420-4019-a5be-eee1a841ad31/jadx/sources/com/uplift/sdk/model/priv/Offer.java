package com.uplift.sdk.model.priv;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Offer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/uplift/sdk/model/priv/Offer;", "", "id", "", FirebaseAnalytics.Param.PRICE, "", "monthlyPaymentAmount", "(Ljava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getMonthlyPaymentAmount", "()I", "getPrice", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Offer {

    @SerializedName("offer_id")
    private final String id;

    @SerializedName("monthly_payment_amount")
    private final int monthlyPaymentAmount;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final int price;

    public Offer(String id, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.price = i;
        this.monthlyPaymentAmount = i2;
    }

    public static /* synthetic */ Offer copy$default(Offer offer, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = offer.id;
        }
        if ((i3 & 2) != 0) {
            i = offer.price;
        }
        if ((i3 & 4) != 0) {
            i2 = offer.monthlyPaymentAmount;
        }
        return offer.copy(str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMonthlyPaymentAmount() {
        return this.monthlyPaymentAmount;
    }

    public final Offer copy(String id, int price, int monthlyPaymentAmount) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new Offer(id, price, monthlyPaymentAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) other;
        return Intrinsics.areEqual(this.id, offer.id) && this.price == offer.price && this.monthlyPaymentAmount == offer.monthlyPaymentAmount;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMonthlyPaymentAmount() {
        return this.monthlyPaymentAmount;
    }

    public final int getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.monthlyPaymentAmount);
    }

    public String toString() {
        return "Offer(id=" + this.id + ", price=" + this.price + ", monthlyPaymentAmount=" + this.monthlyPaymentAmount + ')';
    }
}
