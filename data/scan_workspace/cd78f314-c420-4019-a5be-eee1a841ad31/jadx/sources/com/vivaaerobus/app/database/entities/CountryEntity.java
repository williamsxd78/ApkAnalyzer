package com.vivaaerobus.app.database.entities;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/database/entities/CountryEntity;", "", "code", "", "name", "phoneCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getName", "setName", "getPhoneCode", "setPhoneCode", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CountryEntity {
    private String code;
    private String name;
    private String phoneCode;

    public CountryEntity(String code, String name, String phoneCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        this.code = code;
        this.name = name;
        this.phoneCode = phoneCode;
    }

    public static /* synthetic */ CountryEntity copy$default(CountryEntity countryEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryEntity.code;
        }
        if ((i & 2) != 0) {
            str2 = countryEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = countryEntity.phoneCode;
        }
        return countryEntity.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhoneCode() {
        return this.phoneCode;
    }

    public final CountryEntity copy(String code, String name, String phoneCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        return new CountryEntity(code, name, phoneCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryEntity)) {
            return false;
        }
        CountryEntity countryEntity = (CountryEntity) other;
        return Intrinsics.areEqual(this.code, countryEntity.code) && Intrinsics.areEqual(this.name, countryEntity.name) && Intrinsics.areEqual(this.phoneCode, countryEntity.phoneCode);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneCode() {
        return this.phoneCode;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.phoneCode.hashCode();
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPhoneCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneCode = str;
    }

    public String toString() {
        return "CountryEntity(code=" + this.code + ", name=" + this.name + ", phoneCode=" + this.phoneCode + ")";
    }
}
