package com.arpitkatiyarprojects.countrypicker.models;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryDetails.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/arpitkatiyarprojects/countrypicker/models/CountryDetails;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "countryPhoneNumberCode", "countryName", "countryFlag", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCountryCode", "()Ljava/lang/String;", "getCountryPhoneNumberCode", "getCountryName", "getCountryFlag", "()I", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "CountryPicker_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CountryDetails {
    public static final int $stable = 0;
    private final String countryCode;
    private final int countryFlag;
    private final String countryName;
    private final String countryPhoneNumberCode;

    public CountryDetails(String countryCode, String countryPhoneNumberCode, String countryName, int i) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryPhoneNumberCode, "countryPhoneNumberCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        this.countryCode = countryCode;
        this.countryPhoneNumberCode = countryPhoneNumberCode;
        this.countryName = countryName;
        this.countryFlag = i;
    }

    public static /* synthetic */ CountryDetails copy$default(CountryDetails countryDetails, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = countryDetails.countryCode;
        }
        if ((i2 & 2) != 0) {
            str2 = countryDetails.countryPhoneNumberCode;
        }
        if ((i2 & 4) != 0) {
            str3 = countryDetails.countryName;
        }
        if ((i2 & 8) != 0) {
            i = countryDetails.countryFlag;
        }
        return countryDetails.copy(str, str2, str3, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountryPhoneNumberCode() {
        return this.countryPhoneNumberCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCountryFlag() {
        return this.countryFlag;
    }

    public final CountryDetails copy(String countryCode, String countryPhoneNumberCode, String countryName, int countryFlag) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryPhoneNumberCode, "countryPhoneNumberCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        return new CountryDetails(countryCode, countryPhoneNumberCode, countryName, countryFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryDetails)) {
            return false;
        }
        CountryDetails countryDetails = (CountryDetails) other;
        return Intrinsics.areEqual(this.countryCode, countryDetails.countryCode) && Intrinsics.areEqual(this.countryPhoneNumberCode, countryDetails.countryPhoneNumberCode) && Intrinsics.areEqual(this.countryName, countryDetails.countryName) && this.countryFlag == countryDetails.countryFlag;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final int getCountryFlag() {
        return this.countryFlag;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final String getCountryPhoneNumberCode() {
        return this.countryPhoneNumberCode;
    }

    public int hashCode() {
        return (((((this.countryCode.hashCode() * 31) + this.countryPhoneNumberCode.hashCode()) * 31) + this.countryName.hashCode()) * 31) + Integer.hashCode(this.countryFlag);
    }

    public String toString() {
        return "CountryDetails(countryCode=" + this.countryCode + ", countryPhoneNumberCode=" + this.countryPhoneNumberCode + ", countryName=" + this.countryName + ", countryFlag=" + this.countryFlag + ')';
    }
}
