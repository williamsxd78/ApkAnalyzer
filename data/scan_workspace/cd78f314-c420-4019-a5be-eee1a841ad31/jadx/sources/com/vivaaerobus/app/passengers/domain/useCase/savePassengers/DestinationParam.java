package com.vivaaerobus.app.passengers.domain.useCase.savePassengers;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavePassengersParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/vivaaerobus/app/passengers/domain/useCase/savePassengers/DestinationParam;", "", "address", "", "city", "country", RemoteConfigConstants.ResponseFieldKey.STATE, "zip", "inTransit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAddress", "()Ljava/lang/String;", "getCity", "getCountry", "getState", "getZip", "getInTransit", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "passengers_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DestinationParam {
    private final String address;
    private final String city;
    private final String country;
    private final boolean inTransit;
    private final String state;
    private final String zip;

    public DestinationParam(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.address = str;
        this.city = str2;
        this.country = str3;
        this.state = str4;
        this.zip = str5;
        this.inTransit = z;
    }

    public static /* synthetic */ DestinationParam copy$default(DestinationParam destinationParam, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = destinationParam.address;
        }
        if ((i & 2) != 0) {
            str2 = destinationParam.city;
        }
        if ((i & 4) != 0) {
            str3 = destinationParam.country;
        }
        if ((i & 8) != 0) {
            str4 = destinationParam.state;
        }
        if ((i & 16) != 0) {
            str5 = destinationParam.zip;
        }
        if ((i & 32) != 0) {
            z = destinationParam.inTransit;
        }
        String str6 = str5;
        boolean z2 = z;
        return destinationParam.copy(str, str2, str3, str4, str6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getInTransit() {
        return this.inTransit;
    }

    public final DestinationParam copy(String address, String city, String country, String state, String zip, boolean inTransit) {
        return new DestinationParam(address, city, country, state, zip, inTransit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DestinationParam)) {
            return false;
        }
        DestinationParam destinationParam = (DestinationParam) other;
        return Intrinsics.areEqual(this.address, destinationParam.address) && Intrinsics.areEqual(this.city, destinationParam.city) && Intrinsics.areEqual(this.country, destinationParam.country) && Intrinsics.areEqual(this.state, destinationParam.state) && Intrinsics.areEqual(this.zip, destinationParam.zip) && this.inTransit == destinationParam.inTransit;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final boolean getInTransit() {
        return this.inTransit;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        String str = this.address;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zip;
        return ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.inTransit);
    }

    public String toString() {
        return "DestinationParam(address=" + this.address + ", city=" + this.city + ", country=" + this.country + ", state=" + this.state + ", zip=" + this.zip + ", inTransit=" + this.inTransit + ")";
    }
}
