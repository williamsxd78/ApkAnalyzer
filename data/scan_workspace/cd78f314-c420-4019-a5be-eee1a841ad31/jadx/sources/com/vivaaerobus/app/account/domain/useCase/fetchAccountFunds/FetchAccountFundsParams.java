package com.vivaaerobus.app.account.domain.useCase.fetchAccountFunds;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FetchAccountFundsParams.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/account/domain/useCase/fetchAccountFunds/FetchAccountFundsParams;", "", "retrieveAmounts", "", "<init>", "(Z)V", "getRetrieveAmounts", "()Z", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "account_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FetchAccountFundsParams {
    private final boolean retrieveAmounts;

    public FetchAccountFundsParams() {
        this(false, 1, null);
    }

    public FetchAccountFundsParams(boolean z) {
        this.retrieveAmounts = z;
    }

    public /* synthetic */ FetchAccountFundsParams(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public static /* synthetic */ FetchAccountFundsParams copy$default(FetchAccountFundsParams fetchAccountFundsParams, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fetchAccountFundsParams.retrieveAmounts;
        }
        return fetchAccountFundsParams.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRetrieveAmounts() {
        return this.retrieveAmounts;
    }

    public final FetchAccountFundsParams copy(boolean retrieveAmounts) {
        return new FetchAccountFundsParams(retrieveAmounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FetchAccountFundsParams) && this.retrieveAmounts == ((FetchAccountFundsParams) other).retrieveAmounts;
    }

    public final boolean getRetrieveAmounts() {
        return this.retrieveAmounts;
    }

    public int hashCode() {
        return Boolean.hashCode(this.retrieveAmounts);
    }

    public String toString() {
        return "FetchAccountFundsParams(retrieveAmounts=" + this.retrieveAmounts + ")";
    }
}
