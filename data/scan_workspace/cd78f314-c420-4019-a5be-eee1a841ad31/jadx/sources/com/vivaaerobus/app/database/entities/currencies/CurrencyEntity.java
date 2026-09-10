package com.vivaaerobus.app.database.entities.currencies;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/database/entities/currencies/CurrencyEntity;", "", "code", "", "cultureCode", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCultureCode", "getSymbol", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CurrencyEntity {
    private final String code;
    private final String cultureCode;
    private final String symbol;

    public CurrencyEntity(String code, String cultureCode, String symbol) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(cultureCode, "cultureCode");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.code = code;
        this.cultureCode = cultureCode;
        this.symbol = symbol;
    }

    public static /* synthetic */ CurrencyEntity copy$default(CurrencyEntity currencyEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyEntity.code;
        }
        if ((i & 2) != 0) {
            str2 = currencyEntity.cultureCode;
        }
        if ((i & 4) != 0) {
            str3 = currencyEntity.symbol;
        }
        return currencyEntity.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCultureCode() {
        return this.cultureCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final CurrencyEntity copy(String code, String cultureCode, String symbol) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(cultureCode, "cultureCode");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new CurrencyEntity(code, cultureCode, symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyEntity)) {
            return false;
        }
        CurrencyEntity currencyEntity = (CurrencyEntity) other;
        return Intrinsics.areEqual(this.code, currencyEntity.code) && Intrinsics.areEqual(this.cultureCode, currencyEntity.cultureCode) && Intrinsics.areEqual(this.symbol, currencyEntity.symbol);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCultureCode() {
        return this.cultureCode;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.cultureCode.hashCode()) * 31) + this.symbol.hashCode();
    }

    public String toString() {
        return "CurrencyEntity(code=" + this.code + ", cultureCode=" + this.cultureCode + ", symbol=" + this.symbol + ")";
    }
}
