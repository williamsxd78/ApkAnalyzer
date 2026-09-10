package com.vivaaerobus.app.newContentful.domain.models;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.extras.extraDetail.activity.ExtraDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InsuranceOrder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/InsuranceOrder;", "", ExtraDetailActivity.ARG_SSR_CODE, "", "position", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getSsrCode", "()Ljava/lang/String;", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/vivaaerobus/app/newContentful/domain/models/InsuranceOrder;", "equals", "", "other", "hashCode", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InsuranceOrder {
    private final Integer position;
    private final String ssrCode;

    public InsuranceOrder(String str, Integer num) {
        this.ssrCode = str;
        this.position = num;
    }

    public static /* synthetic */ InsuranceOrder copy$default(InsuranceOrder insuranceOrder, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insuranceOrder.ssrCode;
        }
        if ((i & 2) != 0) {
            num = insuranceOrder.position;
        }
        return insuranceOrder.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSsrCode() {
        return this.ssrCode;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    public final InsuranceOrder copy(String ssrCode, Integer position) {
        return new InsuranceOrder(ssrCode, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceOrder)) {
            return false;
        }
        InsuranceOrder insuranceOrder = (InsuranceOrder) other;
        return Intrinsics.areEqual(this.ssrCode, insuranceOrder.ssrCode) && Intrinsics.areEqual(this.position, insuranceOrder.position);
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final String getSsrCode() {
        return this.ssrCode;
    }

    public int hashCode() {
        String str = this.ssrCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.position;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "InsuranceOrder(ssrCode=" + this.ssrCode + ", position=" + this.position + ")";
    }
}
