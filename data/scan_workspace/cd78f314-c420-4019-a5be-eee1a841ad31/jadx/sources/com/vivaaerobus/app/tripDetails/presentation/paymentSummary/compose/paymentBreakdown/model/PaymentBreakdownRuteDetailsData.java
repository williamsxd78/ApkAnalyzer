package com.vivaaerobus.app.tripDetails.presentation.paymentSummary.compose.paymentBreakdown.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentBreakdownData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/tripDetails/presentation/paymentSummary/compose/paymentBreakdown/model/PaymentBreakdownRuteDetailsData;", "", "rute", "", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRute", "()Ljava/lang/String;", "getDate", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "tripDetails_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentBreakdownRuteDetailsData {
    public static final int $stable = 0;
    private final String date;
    private final String rute;

    public PaymentBreakdownRuteDetailsData(String rute, String date) {
        Intrinsics.checkNotNullParameter(rute, "rute");
        Intrinsics.checkNotNullParameter(date, "date");
        this.rute = rute;
        this.date = date;
    }

    public static /* synthetic */ PaymentBreakdownRuteDetailsData copy$default(PaymentBreakdownRuteDetailsData paymentBreakdownRuteDetailsData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentBreakdownRuteDetailsData.rute;
        }
        if ((i & 2) != 0) {
            str2 = paymentBreakdownRuteDetailsData.date;
        }
        return paymentBreakdownRuteDetailsData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRute() {
        return this.rute;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final PaymentBreakdownRuteDetailsData copy(String rute, String date) {
        Intrinsics.checkNotNullParameter(rute, "rute");
        Intrinsics.checkNotNullParameter(date, "date");
        return new PaymentBreakdownRuteDetailsData(rute, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentBreakdownRuteDetailsData)) {
            return false;
        }
        PaymentBreakdownRuteDetailsData paymentBreakdownRuteDetailsData = (PaymentBreakdownRuteDetailsData) other;
        return Intrinsics.areEqual(this.rute, paymentBreakdownRuteDetailsData.rute) && Intrinsics.areEqual(this.date, paymentBreakdownRuteDetailsData.date);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getRute() {
        return this.rute;
    }

    public int hashCode() {
        return (this.rute.hashCode() * 31) + this.date.hashCode();
    }

    public String toString() {
        return "PaymentBreakdownRuteDetailsData(rute=" + this.rute + ", date=" + this.date + ")";
    }
}
