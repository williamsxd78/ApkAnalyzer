package com.vivaaerobus.app.components.autocomplete.model;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteAddress.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/vivaaerobus/app/components/autocomplete/model/AutocompleteAddress;", "", "address", "", "city", RemoteConfigConstants.ResponseFieldKey.STATE, "zip", "country", "displayName", "formattedAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getState", "getZip", "getCountry", "getDisplayName", "getFormattedAddress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AutocompleteAddress {
    public static final int $stable = 0;
    private final String address;
    private final String city;
    private final String country;
    private final String displayName;
    private final String formattedAddress;
    private final String state;
    private final String zip;

    public AutocompleteAddress(String address, String city, String state, String zip, String country, String displayName, String formattedAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(zip, "zip");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(formattedAddress, "formattedAddress");
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.displayName = displayName;
        this.formattedAddress = formattedAddress;
    }

    public static /* synthetic */ AutocompleteAddress copy$default(AutocompleteAddress autocompleteAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autocompleteAddress.address;
        }
        if ((i & 2) != 0) {
            str2 = autocompleteAddress.city;
        }
        if ((i & 4) != 0) {
            str3 = autocompleteAddress.state;
        }
        if ((i & 8) != 0) {
            str4 = autocompleteAddress.zip;
        }
        if ((i & 16) != 0) {
            str5 = autocompleteAddress.country;
        }
        if ((i & 32) != 0) {
            str6 = autocompleteAddress.displayName;
        }
        if ((i & 64) != 0) {
            str7 = autocompleteAddress.formattedAddress;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return autocompleteAddress.copy(str, str2, str11, str4, str10, str8, str9);
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

    /* renamed from: component6, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final AutocompleteAddress copy(String address, String city, String state, String zip, String country, String displayName, String formattedAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(zip, "zip");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(formattedAddress, "formattedAddress");
        return new AutocompleteAddress(address, city, state, zip, country, displayName, formattedAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteAddress)) {
            return false;
        }
        AutocompleteAddress autocompleteAddress = (AutocompleteAddress) other;
        return Intrinsics.areEqual(this.address, autocompleteAddress.address) && Intrinsics.areEqual(this.city, autocompleteAddress.city) && Intrinsics.areEqual(this.state, autocompleteAddress.state) && Intrinsics.areEqual(this.zip, autocompleteAddress.zip) && Intrinsics.areEqual(this.country, autocompleteAddress.country) && Intrinsics.areEqual(this.displayName, autocompleteAddress.displayName) && Intrinsics.areEqual(this.formattedAddress, autocompleteAddress.formattedAddress);
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

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        return (((((((((((this.address.hashCode() * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + this.country.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.formattedAddress.hashCode();
    }

    public String toString() {
        return "AutocompleteAddress(address=" + this.address + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", country=" + this.country + ", displayName=" + this.displayName + ", formattedAddress=" + this.formattedAddress + ")";
    }
}
