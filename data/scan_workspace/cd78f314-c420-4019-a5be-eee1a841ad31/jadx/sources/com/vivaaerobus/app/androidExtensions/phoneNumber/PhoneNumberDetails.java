package com.vivaaerobus.app.androidExtensions.phoneNumber;

import androidx.autofill.HintConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneNumberDetails.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/androidExtensions/phoneNumber/PhoneNumberDetails;", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "countryPhoneNumberCode", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "getCountryPhoneNumberCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCountryCode", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/vivaaerobus/app/androidExtensions/phoneNumber/PhoneNumberDetails;", "equals", "", "other", "hashCode", "toString", "androidExtensions_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PhoneNumberDetails {
    public static final int $stable = 0;
    private final String countryCode;
    private final Integer countryPhoneNumberCode;
    private final String phoneNumber;

    public PhoneNumberDetails(String phoneNumber, Integer num, String str) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        this.countryPhoneNumberCode = num;
        this.countryCode = str;
    }

    public static /* synthetic */ PhoneNumberDetails copy$default(PhoneNumberDetails phoneNumberDetails, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneNumberDetails.phoneNumber;
        }
        if ((i & 2) != 0) {
            num = phoneNumberDetails.countryPhoneNumberCode;
        }
        if ((i & 4) != 0) {
            str2 = phoneNumberDetails.countryCode;
        }
        return phoneNumberDetails.copy(str, num, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getCountryPhoneNumberCode() {
        return this.countryPhoneNumberCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final PhoneNumberDetails copy(String phoneNumber, Integer countryPhoneNumberCode, String countryCode) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new PhoneNumberDetails(phoneNumber, countryPhoneNumberCode, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneNumberDetails)) {
            return false;
        }
        PhoneNumberDetails phoneNumberDetails = (PhoneNumberDetails) other;
        return Intrinsics.areEqual(this.phoneNumber, phoneNumberDetails.phoneNumber) && Intrinsics.areEqual(this.countryPhoneNumberCode, phoneNumberDetails.countryPhoneNumberCode) && Intrinsics.areEqual(this.countryCode, phoneNumberDetails.countryCode);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final Integer getCountryPhoneNumberCode() {
        return this.countryPhoneNumberCode;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int hashCode = this.phoneNumber.hashCode() * 31;
        Integer num = this.countryPhoneNumberCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.countryCode;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PhoneNumberDetails(phoneNumber=" + this.phoneNumber + ", countryPhoneNumberCode=" + this.countryPhoneNumberCode + ", countryCode=" + this.countryCode + ")";
    }
}
