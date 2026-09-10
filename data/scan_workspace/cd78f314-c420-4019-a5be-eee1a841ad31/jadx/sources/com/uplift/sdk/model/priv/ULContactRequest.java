package com.uplift.sdk.model.priv;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULContactRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÂ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0012HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015¨\u0006<"}, d2 = {"Lcom/uplift/sdk/model/priv/ULContactRequest;", "", "email", "", "title", "firstName", "middleName", "lastName", "phone", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS, "streetAddress2", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "city", TtmlNode.TAG_REGION, "country", "dateOfBirth", "ssn", "statedIncome", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getDateOfBirth", "getEmail", "getFirstName", "getLastName", "getMiddleName", "getPhone", "getPostalCode", "getRegion", "getSsn", "getStatedIncome", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStreetAddress", "getStreetAddress2", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/uplift/sdk/model/priv/ULContactRequest;", "equals", "", "other", "hashCode", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULContactRequest {

    @SerializedName("city")
    private final String city;

    @SerializedName("country")
    private final String country;

    @SerializedName("date_of_birth")
    private final String dateOfBirth;

    @SerializedName("email")
    private final String email;

    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("last_name")
    private final String lastName;

    @SerializedName("middle_name")
    private final String middleName;

    @SerializedName("phone")
    private final String phone;

    @SerializedName("postal_code")
    private final String postalCode;

    @SerializedName(TtmlNode.TAG_REGION)
    private final String region;

    @SerializedName("ssn")
    private final String ssn;

    @SerializedName("stated_income")
    private final Integer statedIncome;

    @SerializedName("street_address")
    private final String streetAddress;

    @SerializedName("street_address2")
    private final String streetAddress2;

    @SerializedName("title")
    private final String title;

    public ULContactRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num) {
        this.email = str;
        this.title = str2;
        this.firstName = str3;
        this.middleName = str4;
        this.lastName = str5;
        this.phone = str6;
        this.streetAddress = str7;
        this.streetAddress2 = str8;
        this.postalCode = str9;
        this.city = str10;
        this.region = str11;
        this.country = str12;
        this.dateOfBirth = str13;
        this.ssn = str14;
        this.statedIncome = num;
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component11, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSsn() {
        return this.ssn;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getStatedIncome() {
        return this.statedIncome;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStreetAddress2() {
        return this.streetAddress2;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public final ULContactRequest copy(String email, String title, String firstName, String middleName, String lastName, String phone, String streetAddress, String streetAddress2, String postalCode, String city, String region, String country, String dateOfBirth, String ssn, Integer statedIncome) {
        return new ULContactRequest(email, title, firstName, middleName, lastName, phone, streetAddress, streetAddress2, postalCode, city, region, country, dateOfBirth, ssn, statedIncome);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULContactRequest)) {
            return false;
        }
        ULContactRequest uLContactRequest = (ULContactRequest) other;
        return Intrinsics.areEqual(this.email, uLContactRequest.email) && Intrinsics.areEqual(this.title, uLContactRequest.title) && Intrinsics.areEqual(this.firstName, uLContactRequest.firstName) && Intrinsics.areEqual(this.middleName, uLContactRequest.middleName) && Intrinsics.areEqual(this.lastName, uLContactRequest.lastName) && Intrinsics.areEqual(this.phone, uLContactRequest.phone) && Intrinsics.areEqual(this.streetAddress, uLContactRequest.streetAddress) && Intrinsics.areEqual(this.streetAddress2, uLContactRequest.streetAddress2) && Intrinsics.areEqual(this.postalCode, uLContactRequest.postalCode) && Intrinsics.areEqual(this.city, uLContactRequest.city) && Intrinsics.areEqual(this.region, uLContactRequest.region) && Intrinsics.areEqual(this.country, uLContactRequest.country) && Intrinsics.areEqual(this.dateOfBirth, uLContactRequest.dateOfBirth) && Intrinsics.areEqual(this.ssn, uLContactRequest.ssn) && Intrinsics.areEqual(this.statedIncome, uLContactRequest.statedIncome);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSsn() {
        return this.ssn;
    }

    public final Integer getStatedIncome() {
        return this.statedIncome;
    }

    public final String getStreetAddress() {
        return this.streetAddress;
    }

    public final String getStreetAddress2() {
        return this.streetAddress2;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.email;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.middleName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.streetAddress;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.streetAddress2;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postalCode;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.city;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.region;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.country;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.dateOfBirth;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.ssn;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.statedIncome;
        return hashCode14 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ULContactRequest(email=" + this.email + ", title=" + this.title + ", firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", phone=" + this.phone + ", streetAddress=" + this.streetAddress + ", streetAddress2=" + this.streetAddress2 + ", postalCode=" + this.postalCode + ", city=" + this.city + ", region=" + this.region + ", country=" + this.country + ", dateOfBirth=" + this.dateOfBirth + ", ssn=" + this.ssn + ", statedIncome=" + this.statedIncome + ')';
    }
}
