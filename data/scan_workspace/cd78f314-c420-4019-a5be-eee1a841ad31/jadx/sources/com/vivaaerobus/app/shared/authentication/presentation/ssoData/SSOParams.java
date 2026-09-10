package com.vivaaerobus.app.shared.authentication.presentation.ssoData;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SSOParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/shared/authentication/presentation/ssoData/SSOParams;", "", "sourceScreen", "", "otaName", "fromBooking", "", "basketId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getSourceScreen", "()Ljava/lang/String;", "getOtaName", "getFromBooking", "()Z", "getBasketId", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "authentication_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SSOParams {
    private final String basketId;
    private final boolean fromBooking;
    private final String otaName;
    private final String sourceScreen;

    public SSOParams(String str, String str2, boolean z, String str3) {
        this.sourceScreen = str;
        this.otaName = str2;
        this.fromBooking = z;
        this.basketId = str3;
    }

    public static /* synthetic */ SSOParams copy$default(SSOParams sSOParams, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sSOParams.sourceScreen;
        }
        if ((i & 2) != 0) {
            str2 = sSOParams.otaName;
        }
        if ((i & 4) != 0) {
            z = sSOParams.fromBooking;
        }
        if ((i & 8) != 0) {
            str3 = sSOParams.basketId;
        }
        return sSOParams.copy(str, str2, z, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOtaName() {
        return this.otaName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFromBooking() {
        return this.fromBooking;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBasketId() {
        return this.basketId;
    }

    public final SSOParams copy(String sourceScreen, String otaName, boolean fromBooking, String basketId) {
        return new SSOParams(sourceScreen, otaName, fromBooking, basketId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SSOParams)) {
            return false;
        }
        SSOParams sSOParams = (SSOParams) other;
        return Intrinsics.areEqual(this.sourceScreen, sSOParams.sourceScreen) && Intrinsics.areEqual(this.otaName, sSOParams.otaName) && this.fromBooking == sSOParams.fromBooking && Intrinsics.areEqual(this.basketId, sSOParams.basketId);
    }

    public final String getBasketId() {
        return this.basketId;
    }

    public final boolean getFromBooking() {
        return this.fromBooking;
    }

    public final String getOtaName() {
        return this.otaName;
    }

    public final String getSourceScreen() {
        return this.sourceScreen;
    }

    public int hashCode() {
        String str = this.sourceScreen;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.otaName;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.fromBooking)) * 31;
        String str3 = this.basketId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SSOParams(sourceScreen=" + this.sourceScreen + ", otaName=" + this.otaName + ", fromBooking=" + this.fromBooking + ", basketId=" + this.basketId + ")";
    }
}
