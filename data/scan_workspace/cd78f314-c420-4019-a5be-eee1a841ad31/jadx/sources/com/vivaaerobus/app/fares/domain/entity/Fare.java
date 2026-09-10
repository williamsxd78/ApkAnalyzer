package com.vivaaerobus.app.fares.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fare.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006#"}, d2 = {"Lcom/vivaaerobus/app/fares/domain/entity/Fare;", "", "date", "Ljava/util/Date;", "amount", "", "vivaFanAmount", "originCode", "", "destinationCode", "fareSource", "<init>", "(Ljava/util/Date;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "getAmount", "()D", "getVivaFanAmount", "getOriginCode", "()Ljava/lang/String;", "getDestinationCode", "getFareSource", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "low_fares_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Fare {
    private final double amount;
    private final Date date;
    private final String destinationCode;
    private final String fareSource;
    private final String originCode;
    private final double vivaFanAmount;

    public Fare(Date date, double d, double d2, String originCode, String destinationCode, String fareSource) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(fareSource, "fareSource");
        this.date = date;
        this.amount = d;
        this.vivaFanAmount = d2;
        this.originCode = originCode;
        this.destinationCode = destinationCode;
        this.fareSource = fareSource;
    }

    public static /* synthetic */ Fare copy$default(Fare fare, Date date, double d, double d2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            date = fare.date;
        }
        if ((i & 2) != 0) {
            d = fare.amount;
        }
        if ((i & 4) != 0) {
            d2 = fare.vivaFanAmount;
        }
        if ((i & 8) != 0) {
            str = fare.originCode;
        }
        if ((i & 16) != 0) {
            str2 = fare.destinationCode;
        }
        if ((i & 32) != 0) {
            str3 = fare.fareSource;
        }
        String str4 = str3;
        String str5 = str;
        double d3 = d2;
        return fare.copy(date, d, d3, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final double getVivaFanAmount() {
        return this.vivaFanAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOriginCode() {
        return this.originCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDestinationCode() {
        return this.destinationCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFareSource() {
        return this.fareSource;
    }

    public final Fare copy(Date date, double amount, double vivaFanAmount, String originCode, String destinationCode, String fareSource) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(originCode, "originCode");
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(fareSource, "fareSource");
        return new Fare(date, amount, vivaFanAmount, originCode, destinationCode, fareSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fare)) {
            return false;
        }
        Fare fare = (Fare) other;
        return Intrinsics.areEqual(this.date, fare.date) && Double.compare(this.amount, fare.amount) == 0 && Double.compare(this.vivaFanAmount, fare.vivaFanAmount) == 0 && Intrinsics.areEqual(this.originCode, fare.originCode) && Intrinsics.areEqual(this.destinationCode, fare.destinationCode) && Intrinsics.areEqual(this.fareSource, fare.fareSource);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Date getDate() {
        return this.date;
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getFareSource() {
        return this.fareSource;
    }

    public final String getOriginCode() {
        return this.originCode;
    }

    public final double getVivaFanAmount() {
        return this.vivaFanAmount;
    }

    public int hashCode() {
        return (((((((((this.date.hashCode() * 31) + Double.hashCode(this.amount)) * 31) + Double.hashCode(this.vivaFanAmount)) * 31) + this.originCode.hashCode()) * 31) + this.destinationCode.hashCode()) * 31) + this.fareSource.hashCode();
    }

    public String toString() {
        return "Fare(date=" + this.date + ", amount=" + this.amount + ", vivaFanAmount=" + this.vivaFanAmount + ", originCode=" + this.originCode + ", destinationCode=" + this.destinationCode + ", fareSource=" + this.fareSource + ")";
    }
}
