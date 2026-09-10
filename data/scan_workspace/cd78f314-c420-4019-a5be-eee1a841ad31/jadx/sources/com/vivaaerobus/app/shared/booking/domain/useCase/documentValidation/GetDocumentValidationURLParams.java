package com.vivaaerobus.app.shared.booking.domain.useCase.documentValidation;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetDocumentValidationURLParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/useCase/documentValidation/GetDocumentValidationURLParams;", "", "pnr", "", "bookingId", "returnUrl", "passenger", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPnr", "()Ljava/lang/String;", "getBookingId", "getReturnUrl", "getPassenger", "getLocale", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetDocumentValidationURLParams {
    private final String bookingId;
    private final String locale;
    private final String passenger;
    private final String pnr;
    private final String returnUrl;

    public GetDocumentValidationURLParams(String pnr, String bookingId, String returnUrl, String passenger, String locale) {
        Intrinsics.checkNotNullParameter(pnr, "pnr");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
        Intrinsics.checkNotNullParameter(passenger, "passenger");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.pnr = pnr;
        this.bookingId = bookingId;
        this.returnUrl = returnUrl;
        this.passenger = passenger;
        this.locale = locale;
    }

    public static /* synthetic */ GetDocumentValidationURLParams copy$default(GetDocumentValidationURLParams getDocumentValidationURLParams, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getDocumentValidationURLParams.pnr;
        }
        if ((i & 2) != 0) {
            str2 = getDocumentValidationURLParams.bookingId;
        }
        if ((i & 4) != 0) {
            str3 = getDocumentValidationURLParams.returnUrl;
        }
        if ((i & 8) != 0) {
            str4 = getDocumentValidationURLParams.passenger;
        }
        if ((i & 16) != 0) {
            str5 = getDocumentValidationURLParams.locale;
        }
        String str6 = str5;
        String str7 = str3;
        return getDocumentValidationURLParams.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPnr() {
        return this.pnr;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPassenger() {
        return this.passenger;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final GetDocumentValidationURLParams copy(String pnr, String bookingId, String returnUrl, String passenger, String locale) {
        Intrinsics.checkNotNullParameter(pnr, "pnr");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
        Intrinsics.checkNotNullParameter(passenger, "passenger");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return new GetDocumentValidationURLParams(pnr, bookingId, returnUrl, passenger, locale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDocumentValidationURLParams)) {
            return false;
        }
        GetDocumentValidationURLParams getDocumentValidationURLParams = (GetDocumentValidationURLParams) other;
        return Intrinsics.areEqual(this.pnr, getDocumentValidationURLParams.pnr) && Intrinsics.areEqual(this.bookingId, getDocumentValidationURLParams.bookingId) && Intrinsics.areEqual(this.returnUrl, getDocumentValidationURLParams.returnUrl) && Intrinsics.areEqual(this.passenger, getDocumentValidationURLParams.passenger) && Intrinsics.areEqual(this.locale, getDocumentValidationURLParams.locale);
    }

    public final String getBookingId() {
        return this.bookingId;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getPassenger() {
        return this.passenger;
    }

    public final String getPnr() {
        return this.pnr;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public int hashCode() {
        return (((((((this.pnr.hashCode() * 31) + this.bookingId.hashCode()) * 31) + this.returnUrl.hashCode()) * 31) + this.passenger.hashCode()) * 31) + this.locale.hashCode();
    }

    public String toString() {
        return "GetDocumentValidationURLParams(pnr=" + this.pnr + ", bookingId=" + this.bookingId + ", returnUrl=" + this.returnUrl + ", passenger=" + this.passenger + ", locale=" + this.locale + ")";
    }
}
