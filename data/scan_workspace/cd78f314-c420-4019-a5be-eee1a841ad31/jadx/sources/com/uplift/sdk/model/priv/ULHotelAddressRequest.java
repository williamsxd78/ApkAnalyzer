package com.uplift.sdk.model.priv;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULHotelAddressRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/uplift/sdk/model/priv/ULHotelAddressRequest;", "", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS, "", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "city", TtmlNode.TAG_REGION, "country", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getPostalCode", "getRegion", "getStreetAddress", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULHotelAddressRequest {

    @SerializedName("city")
    private final String city;

    @SerializedName("country")
    private final String country;

    @SerializedName("postal_code")
    private final String postalCode;

    @SerializedName(TtmlNode.TAG_REGION)
    private final String region;

    @SerializedName("street_address")
    private final String streetAddress;

    public ULHotelAddressRequest(String str, String str2, String str3, String str4, String str5) {
        this.streetAddress = str;
        this.postalCode = str2;
        this.city = str3;
        this.region = str4;
        this.country = str5;
    }

    public static /* synthetic */ ULHotelAddressRequest copy$default(ULHotelAddressRequest uLHotelAddressRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLHotelAddressRequest.streetAddress;
        }
        if ((i & 2) != 0) {
            str2 = uLHotelAddressRequest.postalCode;
        }
        if ((i & 4) != 0) {
            str3 = uLHotelAddressRequest.city;
        }
        if ((i & 8) != 0) {
            str4 = uLHotelAddressRequest.region;
        }
        if ((i & 16) != 0) {
            str5 = uLHotelAddressRequest.country;
        }
        String str6 = str5;
        String str7 = str3;
        return uLHotelAddressRequest.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final ULHotelAddressRequest copy(String streetAddress, String postalCode, String city, String region, String country) {
        return new ULHotelAddressRequest(streetAddress, postalCode, city, region, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULHotelAddressRequest)) {
            return false;
        }
        ULHotelAddressRequest uLHotelAddressRequest = (ULHotelAddressRequest) other;
        return Intrinsics.areEqual(this.streetAddress, uLHotelAddressRequest.streetAddress) && Intrinsics.areEqual(this.postalCode, uLHotelAddressRequest.postalCode) && Intrinsics.areEqual(this.city, uLHotelAddressRequest.city) && Intrinsics.areEqual(this.region, uLHotelAddressRequest.region) && Intrinsics.areEqual(this.country, uLHotelAddressRequest.country);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStreetAddress() {
        return this.streetAddress;
    }

    public int hashCode() {
        String str = this.streetAddress;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.postalCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.region;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.country;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ULHotelAddressRequest(streetAddress=" + this.streetAddress + ", postalCode=" + this.postalCode + ", city=" + this.city + ", region=" + this.region + ", country=" + this.country + ')';
    }
}
