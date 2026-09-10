package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Transaction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0007HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/Transaction;", "", "cash", "", "credits", "total", "token", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getCash", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCredits", "getTotal", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/vivaaerobus/app/shared/payment/domain/entity/Transaction;", "equals", "", "other", "hashCode", "", "toString", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Transaction {
    private final Double cash;
    private final Double credits;
    private final String token;
    private final Double total;

    public Transaction(Double d, Double d2, Double d3, String str) {
        this.cash = d;
        this.credits = d2;
        this.total = d3;
        this.token = str;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, Double d, Double d2, Double d3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = transaction.cash;
        }
        if ((i & 2) != 0) {
            d2 = transaction.credits;
        }
        if ((i & 4) != 0) {
            d3 = transaction.total;
        }
        if ((i & 8) != 0) {
            str = transaction.token;
        }
        return transaction.copy(d, d2, d3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getCash() {
        return this.cash;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getCredits() {
        return this.credits;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getTotal() {
        return this.total;
    }

    /* renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final Transaction copy(Double cash, Double credits, Double total, String token) {
        return new Transaction(cash, credits, total, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) other;
        return Intrinsics.areEqual((Object) this.cash, (Object) transaction.cash) && Intrinsics.areEqual((Object) this.credits, (Object) transaction.credits) && Intrinsics.areEqual((Object) this.total, (Object) transaction.total) && Intrinsics.areEqual(this.token, transaction.token);
    }

    public final Double getCash() {
        return this.cash;
    }

    public final Double getCredits() {
        return this.credits;
    }

    public final String getToken() {
        return this.token;
    }

    public final Double getTotal() {
        return this.total;
    }

    public int hashCode() {
        Double d = this.cash;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.credits;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.total;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.token;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Transaction(cash=" + this.cash + ", credits=" + this.credits + ", total=" + this.total + ", token=" + this.token + ")";
    }
}
