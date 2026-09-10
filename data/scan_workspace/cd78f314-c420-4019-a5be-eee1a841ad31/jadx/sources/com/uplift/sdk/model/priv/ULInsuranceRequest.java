package com.uplift.sdk.model.priv;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULInsuranceRequest.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/uplift/sdk/model/priv/ULInsuranceRequest;", "", "types", "", "", FirebaseAnalytics.Param.PRICE, "", "(Ljava/util/List;Ljava/lang/Integer;)V", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTypes", "()Ljava/util/List;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/util/List;Ljava/lang/Integer;)Lcom/uplift/sdk/model/priv/ULInsuranceRequest;", "equals", "", "other", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULInsuranceRequest {

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final Integer price;

    @SerializedName("types")
    private final List<String> types;

    public ULInsuranceRequest(List<String> list, Integer num) {
        this.types = list;
        this.price = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ULInsuranceRequest copy$default(ULInsuranceRequest uLInsuranceRequest, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = uLInsuranceRequest.types;
        }
        if ((i & 2) != 0) {
            num = uLInsuranceRequest.price;
        }
        return uLInsuranceRequest.copy(list, num);
    }

    public final List<String> component1() {
        return this.types;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    public final ULInsuranceRequest copy(List<String> types, Integer price) {
        return new ULInsuranceRequest(types, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULInsuranceRequest)) {
            return false;
        }
        ULInsuranceRequest uLInsuranceRequest = (ULInsuranceRequest) other;
        return Intrinsics.areEqual(this.types, uLInsuranceRequest.types) && Intrinsics.areEqual(this.price, uLInsuranceRequest.price);
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        List<String> list = this.types;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.price;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ULInsuranceRequest(types=" + this.types + ", price=" + this.price + ')';
    }
}
