package com.uplift.sdk.model.priv;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULAddOnRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/uplift/sdk/model/priv/ULAddOnRequest;", "", "name", "", FirebaseAnalytics.Param.PRICE, "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/uplift/sdk/model/priv/ULAddOnRequest;", "equals", "", "other", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULAddOnRequest {

    @SerializedName("name")
    private final String name;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final Integer price;

    public ULAddOnRequest(String str, Integer num) {
        this.name = str;
        this.price = num;
    }

    public static /* synthetic */ ULAddOnRequest copy$default(ULAddOnRequest uLAddOnRequest, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLAddOnRequest.name;
        }
        if ((i & 2) != 0) {
            num = uLAddOnRequest.price;
        }
        return uLAddOnRequest.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    public final ULAddOnRequest copy(String name, Integer price) {
        return new ULAddOnRequest(name, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULAddOnRequest)) {
            return false;
        }
        ULAddOnRequest uLAddOnRequest = (ULAddOnRequest) other;
        return Intrinsics.areEqual(this.name, uLAddOnRequest.name) && Intrinsics.areEqual(this.price, uLAddOnRequest.price);
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.price;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ULAddOnRequest(name=" + this.name + ", price=" + this.price + ')';
    }
}
