package com.uplift.sdk.model.priv;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULActivityRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/uplift/sdk/model/priv/ULActivityRequest;", "", "name", "", FirebaseAnalytics.Param.PRICE, "", "date", "provider", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getName", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProvider", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/uplift/sdk/model/priv/ULActivityRequest;", "equals", "", "other", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULActivityRequest {

    @SerializedName("date")
    private final String date;

    @SerializedName("name")
    private final String name;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final Integer price;

    @SerializedName("provider")
    private final String provider;

    public ULActivityRequest(String str, Integer num, String str2, String str3) {
        this.name = str;
        this.price = num;
        this.date = str2;
        this.provider = str3;
    }

    public static /* synthetic */ ULActivityRequest copy$default(ULActivityRequest uLActivityRequest, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLActivityRequest.name;
        }
        if ((i & 2) != 0) {
            num = uLActivityRequest.price;
        }
        if ((i & 4) != 0) {
            str2 = uLActivityRequest.date;
        }
        if ((i & 8) != 0) {
            str3 = uLActivityRequest.provider;
        }
        return uLActivityRequest.copy(str, num, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public final ULActivityRequest copy(String name, Integer price, String date, String provider) {
        return new ULActivityRequest(name, price, date, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULActivityRequest)) {
            return false;
        }
        ULActivityRequest uLActivityRequest = (ULActivityRequest) other;
        return Intrinsics.areEqual(this.name, uLActivityRequest.name) && Intrinsics.areEqual(this.price, uLActivityRequest.price) && Intrinsics.areEqual(this.date, uLActivityRequest.date) && Intrinsics.areEqual(this.provider, uLActivityRequest.provider);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.price;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.date;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.provider;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ULActivityRequest(name=" + this.name + ", price=" + this.price + ", date=" + this.date + ", provider=" + this.provider + ')';
    }
}
