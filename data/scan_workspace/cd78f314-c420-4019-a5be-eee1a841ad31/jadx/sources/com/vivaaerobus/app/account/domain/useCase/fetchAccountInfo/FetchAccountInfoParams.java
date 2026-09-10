package com.vivaaerobus.app.account.domain.useCase.fetchAccountInfo;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FetchAccountInfoParams.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/vivaaerobus/app/account/domain/useCase/fetchAccountInfo/FetchAccountInfoParams;", "", "retrieveAmounts", "", "updateOnLine", "storeAccountInfo", "storeBrazeId", "<init>", "(ZZZZ)V", "getRetrieveAmounts", "()Z", "getUpdateOnLine", "setUpdateOnLine", "(Z)V", "getStoreAccountInfo", "getStoreBrazeId", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "account_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FetchAccountInfoParams {
    private final boolean retrieveAmounts;
    private final boolean storeAccountInfo;
    private final boolean storeBrazeId;
    private boolean updateOnLine;

    public FetchAccountInfoParams() {
        this(false, false, false, false, 15, null);
    }

    public FetchAccountInfoParams(boolean z, boolean z2, boolean z3, boolean z4) {
        this.retrieveAmounts = z;
        this.updateOnLine = z2;
        this.storeAccountInfo = z3;
        this.storeBrazeId = z4;
    }

    public /* synthetic */ FetchAccountInfoParams(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    public static /* synthetic */ FetchAccountInfoParams copy$default(FetchAccountInfoParams fetchAccountInfoParams, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fetchAccountInfoParams.retrieveAmounts;
        }
        if ((i & 2) != 0) {
            z2 = fetchAccountInfoParams.updateOnLine;
        }
        if ((i & 4) != 0) {
            z3 = fetchAccountInfoParams.storeAccountInfo;
        }
        if ((i & 8) != 0) {
            z4 = fetchAccountInfoParams.storeBrazeId;
        }
        return fetchAccountInfoParams.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRetrieveAmounts() {
        return this.retrieveAmounts;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUpdateOnLine() {
        return this.updateOnLine;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getStoreAccountInfo() {
        return this.storeAccountInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getStoreBrazeId() {
        return this.storeBrazeId;
    }

    public final FetchAccountInfoParams copy(boolean retrieveAmounts, boolean updateOnLine, boolean storeAccountInfo, boolean storeBrazeId) {
        return new FetchAccountInfoParams(retrieveAmounts, updateOnLine, storeAccountInfo, storeBrazeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchAccountInfoParams)) {
            return false;
        }
        FetchAccountInfoParams fetchAccountInfoParams = (FetchAccountInfoParams) other;
        return this.retrieveAmounts == fetchAccountInfoParams.retrieveAmounts && this.updateOnLine == fetchAccountInfoParams.updateOnLine && this.storeAccountInfo == fetchAccountInfoParams.storeAccountInfo && this.storeBrazeId == fetchAccountInfoParams.storeBrazeId;
    }

    public final boolean getRetrieveAmounts() {
        return this.retrieveAmounts;
    }

    public final boolean getStoreAccountInfo() {
        return this.storeAccountInfo;
    }

    public final boolean getStoreBrazeId() {
        return this.storeBrazeId;
    }

    public final boolean getUpdateOnLine() {
        return this.updateOnLine;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.retrieveAmounts) * 31) + Boolean.hashCode(this.updateOnLine)) * 31) + Boolean.hashCode(this.storeAccountInfo)) * 31) + Boolean.hashCode(this.storeBrazeId);
    }

    public final void setUpdateOnLine(boolean z) {
        this.updateOnLine = z;
    }

    public String toString() {
        return "FetchAccountInfoParams(retrieveAmounts=" + this.retrieveAmounts + ", updateOnLine=" + this.updateOnLine + ", storeAccountInfo=" + this.storeAccountInfo + ", storeBrazeId=" + this.storeBrazeId + ")";
    }
}
