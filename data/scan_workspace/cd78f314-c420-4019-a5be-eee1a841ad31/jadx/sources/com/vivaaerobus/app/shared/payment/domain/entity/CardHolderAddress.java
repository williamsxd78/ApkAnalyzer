package com.vivaaerobus.app.shared.payment.domain.entity;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardHolderAddress.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/CardHolderAddress;", "", "street", "", "city", "postal", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "stateCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStreet", "()Ljava/lang/String;", "getCity", "getPostal", "getCountryCode", "getStateCode", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardHolderAddress {
    private final String city;
    private final String countryCode;
    private final String postal;
    private final String stateCode;
    private final String street;

    public CardHolderAddress(String str, String str2, String str3, String str4, String str5) {
        this.street = str;
        this.city = str2;
        this.postal = str3;
        this.countryCode = str4;
        this.stateCode = str5;
    }

    public static /* synthetic */ CardHolderAddress copy$default(CardHolderAddress cardHolderAddress, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardHolderAddress.street;
        }
        if ((i & 2) != 0) {
            str2 = cardHolderAddress.city;
        }
        if ((i & 4) != 0) {
            str3 = cardHolderAddress.postal;
        }
        if ((i & 8) != 0) {
            str4 = cardHolderAddress.countryCode;
        }
        if ((i & 16) != 0) {
            str5 = cardHolderAddress.stateCode;
        }
        String str6 = str5;
        String str7 = str3;
        return cardHolderAddress.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPostal() {
        return this.postal;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final CardHolderAddress copy(String street, String city, String postal, String countryCode, String stateCode) {
        return new CardHolderAddress(street, city, postal, countryCode, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardHolderAddress)) {
            return false;
        }
        CardHolderAddress cardHolderAddress = (CardHolderAddress) other;
        return Intrinsics.areEqual(this.street, cardHolderAddress.street) && Intrinsics.areEqual(this.city, cardHolderAddress.city) && Intrinsics.areEqual(this.postal, cardHolderAddress.postal) && Intrinsics.areEqual(this.countryCode, cardHolderAddress.countryCode) && Intrinsics.areEqual(this.stateCode, cardHolderAddress.stateCode);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getPostal() {
        return this.postal;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.street;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postal;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateCode;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "CardHolderAddress(street=" + this.street + ", city=" + this.city + ", postal=" + this.postal + ", countryCode=" + this.countryCode + ", stateCode=" + this.stateCode + ")";
    }
}
