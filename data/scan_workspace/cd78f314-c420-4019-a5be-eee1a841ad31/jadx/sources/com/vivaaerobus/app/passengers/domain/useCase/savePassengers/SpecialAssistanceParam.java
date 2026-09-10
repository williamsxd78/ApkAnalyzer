package com.vivaaerobus.app.passengers.domain.useCase.savePassengers;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.extras.extraDetail.activity.ExtraDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavePassengersParams.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/passengers/domain/useCase/savePassengers/SpecialAssistanceParam;", "", "isCheckedSpecialAssistance", "", ExtraDetailActivity.ARG_SSR_CODE, "", "<init>", "(ZLjava/lang/String;)V", "()Z", "setCheckedSpecialAssistance", "(Z)V", "getSsrCode", "()Ljava/lang/String;", "setSsrCode", "(Ljava/lang/String;)V", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "passengers_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SpecialAssistanceParam {
    private boolean isCheckedSpecialAssistance;
    private String ssrCode;

    public SpecialAssistanceParam(boolean z, String str) {
        this.isCheckedSpecialAssistance = z;
        this.ssrCode = str;
    }

    public static /* synthetic */ SpecialAssistanceParam copy$default(SpecialAssistanceParam specialAssistanceParam, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = specialAssistanceParam.isCheckedSpecialAssistance;
        }
        if ((i & 2) != 0) {
            str = specialAssistanceParam.ssrCode;
        }
        return specialAssistanceParam.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCheckedSpecialAssistance() {
        return this.isCheckedSpecialAssistance;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSsrCode() {
        return this.ssrCode;
    }

    public final SpecialAssistanceParam copy(boolean isCheckedSpecialAssistance, String ssrCode) {
        return new SpecialAssistanceParam(isCheckedSpecialAssistance, ssrCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialAssistanceParam)) {
            return false;
        }
        SpecialAssistanceParam specialAssistanceParam = (SpecialAssistanceParam) other;
        return this.isCheckedSpecialAssistance == specialAssistanceParam.isCheckedSpecialAssistance && Intrinsics.areEqual(this.ssrCode, specialAssistanceParam.ssrCode);
    }

    public final String getSsrCode() {
        return this.ssrCode;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isCheckedSpecialAssistance) * 31;
        String str = this.ssrCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isCheckedSpecialAssistance() {
        return this.isCheckedSpecialAssistance;
    }

    public final void setCheckedSpecialAssistance(boolean z) {
        this.isCheckedSpecialAssistance = z;
    }

    public final void setSsrCode(String str) {
        this.ssrCode = str;
    }

    public String toString() {
        return "SpecialAssistanceParam(isCheckedSpecialAssistance=" + this.isCheckedSpecialAssistance + ", ssrCode=" + this.ssrCode + ")";
    }
}
