package com.uplift.sdk.model.pub;

import kotlin.Metadata;

/* compiled from: ULErrorType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/uplift/sdk/model/pub/ULErrorType;", "", "status", "", "(Ljava/lang/String;II)V", "getStatus", "()I", "ULErrorTypeUnknown", "ULErrorTypeApiService", "ULErrorTypeSDKNotInitialized", "ULErrorTypeUnsupportedCurrency", "ULErrorTypeInvalidConfiguration", "ULErrorTypeSDKMissingLocale", "ULErrorTypeUnsupportedLocale", "ULErrorTypeMissingOffer", "ULErrorTypeOfferPageTimeOut", "ULErrorTypeRefreshCardMissingOrder", "ULErrorTypeCannotFetchOrderId", "ULErrorTypeServiceUnavailable", "ULErrorTypeWebContent", "ULErrorTypeQualification", "ULErrorTypeCheckoutPageTimeOut", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public enum ULErrorType {
    ULErrorTypeUnknown(-1),
    ULErrorTypeApiService(1),
    ULErrorTypeSDKNotInitialized(-1000),
    ULErrorTypeUnsupportedCurrency(-1005),
    ULErrorTypeInvalidConfiguration(-1006),
    ULErrorTypeSDKMissingLocale(-1008),
    ULErrorTypeUnsupportedLocale(-1009),
    ULErrorTypeMissingOffer(-2001),
    ULErrorTypeOfferPageTimeOut(-2002),
    ULErrorTypeRefreshCardMissingOrder(-2002),
    ULErrorTypeCannotFetchOrderId(-2003),
    ULErrorTypeServiceUnavailable(-4000),
    ULErrorTypeWebContent(-5000),
    ULErrorTypeQualification(-6000),
    ULErrorTypeCheckoutPageTimeOut(-7000);

    private final int status;

    ULErrorType(int i) {
        this.status = i;
    }

    public final int getStatus() {
        return this.status;
    }
}
