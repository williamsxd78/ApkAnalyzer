package com.vivaaerobus.app.bookingPayment.presentation.tua.adapter.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.extras.extraDetail.activity.ExtraDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TuaPaymentItemData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/vivaaerobus/app/bookingPayment/presentation/tua/adapter/model/TuaPaymentItemData;", "", "airportText", "", "city", FirebaseAnalytics.Param.PRICE, "currency", "currencySymbol", ExtraDetailActivity.ARG_SSR_CODE, "journeyKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAirportText", "()Ljava/lang/String;", "getCity", "getPrice", "getCurrency", "getCurrencySymbol", "getSsrCode", "getJourneyKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "bookingPayment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TuaPaymentItemData {
    public static final int $stable = 0;
    private final String airportText;
    private final String city;
    private final String currency;
    private final String currencySymbol;
    private final String journeyKey;
    private final String price;
    private final String ssrCode;

    public TuaPaymentItemData(String airportText, String city, String price, String currency, String currencySymbol, String ssrCode, String journeyKey) {
        Intrinsics.checkNotNullParameter(airportText, "airportText");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        Intrinsics.checkNotNullParameter(ssrCode, "ssrCode");
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        this.airportText = airportText;
        this.city = city;
        this.price = price;
        this.currency = currency;
        this.currencySymbol = currencySymbol;
        this.ssrCode = ssrCode;
        this.journeyKey = journeyKey;
    }

    public static /* synthetic */ TuaPaymentItemData copy$default(TuaPaymentItemData tuaPaymentItemData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tuaPaymentItemData.airportText;
        }
        if ((i & 2) != 0) {
            str2 = tuaPaymentItemData.city;
        }
        if ((i & 4) != 0) {
            str3 = tuaPaymentItemData.price;
        }
        if ((i & 8) != 0) {
            str4 = tuaPaymentItemData.currency;
        }
        if ((i & 16) != 0) {
            str5 = tuaPaymentItemData.currencySymbol;
        }
        if ((i & 32) != 0) {
            str6 = tuaPaymentItemData.ssrCode;
        }
        if ((i & 64) != 0) {
            str7 = tuaPaymentItemData.journeyKey;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return tuaPaymentItemData.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAirportText() {
        return this.airportText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSsrCode() {
        return this.ssrCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public final TuaPaymentItemData copy(String airportText, String city, String price, String currency, String currencySymbol, String ssrCode, String journeyKey) {
        Intrinsics.checkNotNullParameter(airportText, "airportText");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        Intrinsics.checkNotNullParameter(ssrCode, "ssrCode");
        Intrinsics.checkNotNullParameter(journeyKey, "journeyKey");
        return new TuaPaymentItemData(airportText, city, price, currency, currencySymbol, ssrCode, journeyKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TuaPaymentItemData)) {
            return false;
        }
        TuaPaymentItemData tuaPaymentItemData = (TuaPaymentItemData) other;
        return Intrinsics.areEqual(this.airportText, tuaPaymentItemData.airportText) && Intrinsics.areEqual(this.city, tuaPaymentItemData.city) && Intrinsics.areEqual(this.price, tuaPaymentItemData.price) && Intrinsics.areEqual(this.currency, tuaPaymentItemData.currency) && Intrinsics.areEqual(this.currencySymbol, tuaPaymentItemData.currencySymbol) && Intrinsics.areEqual(this.ssrCode, tuaPaymentItemData.ssrCode) && Intrinsics.areEqual(this.journeyKey, tuaPaymentItemData.journeyKey);
    }

    public final String getAirportText() {
        return this.airportText;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getJourneyKey() {
        return this.journeyKey;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getSsrCode() {
        return this.ssrCode;
    }

    public int hashCode() {
        return (((((((((((this.airportText.hashCode() * 31) + this.city.hashCode()) * 31) + this.price.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31) + this.ssrCode.hashCode()) * 31) + this.journeyKey.hashCode();
    }

    public String toString() {
        return "TuaPaymentItemData(airportText=" + this.airportText + ", city=" + this.city + ", price=" + this.price + ", currency=" + this.currency + ", currencySymbol=" + this.currencySymbol + ", ssrCode=" + this.ssrCode + ", journeyKey=" + this.journeyKey + ")";
    }
}
