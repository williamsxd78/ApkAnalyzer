package com.vivaaerobus.app.database.entities;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PriceEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/database/entities/PriceEntity;", "", "amount", "", "currencyCode", "", "<init>", "(DLjava/lang/String;)V", "getAmount", "()D", "getCurrencyCode", "()Ljava/lang/String;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PriceEntity {
    private final double amount;
    private final String currencyCode;

    public PriceEntity(double d, String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.amount = d;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ PriceEntity copy$default(PriceEntity priceEntity, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = priceEntity.amount;
        }
        if ((i & 2) != 0) {
            str = priceEntity.currencyCode;
        }
        return priceEntity.copy(d, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final PriceEntity copy(double amount, String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new PriceEntity(amount, currencyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceEntity)) {
            return false;
        }
        PriceEntity priceEntity = (PriceEntity) other;
        return Double.compare(this.amount, priceEntity.amount) == 0 && Intrinsics.areEqual(this.currencyCode, priceEntity.currencyCode);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public int hashCode() {
        return (Double.hashCode(this.amount) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "PriceEntity(amount=" + this.amount + ", currencyCode=" + this.currencyCode + ")";
    }
}
