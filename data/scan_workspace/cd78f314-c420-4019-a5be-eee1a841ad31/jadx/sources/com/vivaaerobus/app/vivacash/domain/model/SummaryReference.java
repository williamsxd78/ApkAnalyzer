package com.vivaaerobus.app.vivacash.domain.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SummaryReference.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/vivaaerobus/app/vivacash/domain/model/SummaryReference;", "", "reference", "", "barCodeImageUrl", "referenceExpirationDate", "Ljava/util/Date;", "referenceExpirationDepositDate", "pdfUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "getReference", "()Ljava/lang/String;", "getBarCodeImageUrl", "getReferenceExpirationDate", "()Ljava/util/Date;", "getReferenceExpirationDepositDate", "getPdfUrl", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "vivacash_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SummaryReference {
    private final String barCodeImageUrl;
    private final String pdfUrl;
    private final String reference;
    private final Date referenceExpirationDate;
    private final Date referenceExpirationDepositDate;

    public SummaryReference(String str, String str2, Date referenceExpirationDate, Date referenceExpirationDepositDate, String str3) {
        Intrinsics.checkNotNullParameter(referenceExpirationDate, "referenceExpirationDate");
        Intrinsics.checkNotNullParameter(referenceExpirationDepositDate, "referenceExpirationDepositDate");
        this.reference = str;
        this.barCodeImageUrl = str2;
        this.referenceExpirationDate = referenceExpirationDate;
        this.referenceExpirationDepositDate = referenceExpirationDepositDate;
        this.pdfUrl = str3;
    }

    public static /* synthetic */ SummaryReference copy$default(SummaryReference summaryReference, String str, String str2, Date date, Date date2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summaryReference.reference;
        }
        if ((i & 2) != 0) {
            str2 = summaryReference.barCodeImageUrl;
        }
        if ((i & 4) != 0) {
            date = summaryReference.referenceExpirationDate;
        }
        if ((i & 8) != 0) {
            date2 = summaryReference.referenceExpirationDepositDate;
        }
        if ((i & 16) != 0) {
            str3 = summaryReference.pdfUrl;
        }
        String str4 = str3;
        Date date3 = date;
        return summaryReference.copy(str, str2, date3, date2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBarCodeImageUrl() {
        return this.barCodeImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getReferenceExpirationDate() {
        return this.referenceExpirationDate;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getReferenceExpirationDepositDate() {
        return this.referenceExpirationDepositDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public final SummaryReference copy(String reference, String barCodeImageUrl, Date referenceExpirationDate, Date referenceExpirationDepositDate, String pdfUrl) {
        Intrinsics.checkNotNullParameter(referenceExpirationDate, "referenceExpirationDate");
        Intrinsics.checkNotNullParameter(referenceExpirationDepositDate, "referenceExpirationDepositDate");
        return new SummaryReference(reference, barCodeImageUrl, referenceExpirationDate, referenceExpirationDepositDate, pdfUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryReference)) {
            return false;
        }
        SummaryReference summaryReference = (SummaryReference) other;
        return Intrinsics.areEqual(this.reference, summaryReference.reference) && Intrinsics.areEqual(this.barCodeImageUrl, summaryReference.barCodeImageUrl) && Intrinsics.areEqual(this.referenceExpirationDate, summaryReference.referenceExpirationDate) && Intrinsics.areEqual(this.referenceExpirationDepositDate, summaryReference.referenceExpirationDepositDate) && Intrinsics.areEqual(this.pdfUrl, summaryReference.pdfUrl);
    }

    public final String getBarCodeImageUrl() {
        return this.barCodeImageUrl;
    }

    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public final String getReference() {
        return this.reference;
    }

    public final Date getReferenceExpirationDate() {
        return this.referenceExpirationDate;
    }

    public final Date getReferenceExpirationDepositDate() {
        return this.referenceExpirationDepositDate;
    }

    public int hashCode() {
        String str = this.reference;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.barCodeImageUrl;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.referenceExpirationDate.hashCode()) * 31) + this.referenceExpirationDepositDate.hashCode()) * 31;
        String str3 = this.pdfUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SummaryReference(reference=" + this.reference + ", barCodeImageUrl=" + this.barCodeImageUrl + ", referenceExpirationDate=" + this.referenceExpirationDate + ", referenceExpirationDepositDate=" + this.referenceExpirationDepositDate + ", pdfUrl=" + this.pdfUrl + ")";
    }
}
