package com.yuno.payments.features.enrollment.models;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/yuno/payments/features/enrollment/models/EnrollmentCustomerPhone;", "", "number", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getNumber", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EnrollmentCustomerPhone {
    private final String countryCode;
    private final String number;

    public EnrollmentCustomerPhone(String str, String str2) {
        this.number = str;
        this.countryCode = str2;
    }

    public static /* synthetic */ EnrollmentCustomerPhone copy$default(EnrollmentCustomerPhone enrollmentCustomerPhone, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enrollmentCustomerPhone.number;
        }
        if ((i & 2) != 0) {
            str2 = enrollmentCustomerPhone.countryCode;
        }
        return enrollmentCustomerPhone.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final EnrollmentCustomerPhone copy(String number, String countryCode) {
        return new EnrollmentCustomerPhone(number, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollmentCustomerPhone)) {
            return false;
        }
        EnrollmentCustomerPhone enrollmentCustomerPhone = (EnrollmentCustomerPhone) other;
        return Intrinsics.areEqual(this.number, enrollmentCustomerPhone.number) && Intrinsics.areEqual(this.countryCode, enrollmentCustomerPhone.countryCode);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        String str = this.number;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EnrollmentCustomerPhone(number=" + this.number + ", countryCode=" + this.countryCode + ")";
    }
}
