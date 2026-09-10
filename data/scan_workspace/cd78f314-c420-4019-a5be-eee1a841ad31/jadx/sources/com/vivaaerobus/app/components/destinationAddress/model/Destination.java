package com.vivaaerobus.app.components.destinationAddress.model;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Destination.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vivaaerobus/app/components/destinationAddress/model/Destination;", "", "address", "", "city", RemoteConfigConstants.ResponseFieldKey.STATE, "zip", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getState", "getZip", "getCountry", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Destination {
    public static final int $stable = 0;
    private final String address;
    private final String city;
    private final String country;
    private final String state;
    private final String zip;

    public Destination(String address, String city, String state, String zip, String country) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(zip, "zip");
        Intrinsics.checkNotNullParameter(country, "country");
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public static /* synthetic */ Destination copy$default(Destination destination, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = destination.address;
        }
        if ((i & 2) != 0) {
            str2 = destination.city;
        }
        if ((i & 4) != 0) {
            str3 = destination.state;
        }
        if ((i & 8) != 0) {
            str4 = destination.zip;
        }
        if ((i & 16) != 0) {
            str5 = destination.country;
        }
        String str6 = str5;
        String str7 = str3;
        return destination.copy(str, str2, str7, str4, str6);
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
    public final String getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final Destination copy(String address, String city, String state, String zip, String country) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(zip, "zip");
        Intrinsics.checkNotNullParameter(country, "country");
        return new Destination(address, city, state, zip, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) other;
        return Intrinsics.areEqual(this.address, destination.address) && Intrinsics.areEqual(this.city, destination.city) && Intrinsics.areEqual(this.state, destination.state) && Intrinsics.areEqual(this.zip, destination.zip) && Intrinsics.areEqual(this.country, destination.country);
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

    public final String getState() {
        return this.state;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        return (((((((this.address.hashCode() * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + this.country.hashCode();
    }

    public String toString() {
        return "Destination(address=" + this.address + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", country=" + this.country + ")";
    }
}
