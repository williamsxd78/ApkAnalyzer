package com.vivaaerobus.app.shared.booking.domain.entity.bookingFull;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneNumber.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bookingFull/PhoneNumber;", "", "other", "", "home", "work", "mobile", "fax", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOther", "()Ljava/lang/String;", "getHome", "getWork", "getMobile", "getFax", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PhoneNumber {
    private final String fax;
    private final String home;
    private final String mobile;
    private final String other;
    private final String work;

    public PhoneNumber(String str, String str2, String str3, String str4, String str5) {
        this.other = str;
        this.home = str2;
        this.work = str3;
        this.mobile = str4;
        this.fax = str5;
    }

    public static /* synthetic */ PhoneNumber copy$default(PhoneNumber phoneNumber, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneNumber.other;
        }
        if ((i & 2) != 0) {
            str2 = phoneNumber.home;
        }
        if ((i & 4) != 0) {
            str3 = phoneNumber.work;
        }
        if ((i & 8) != 0) {
            str4 = phoneNumber.mobile;
        }
        if ((i & 16) != 0) {
            str5 = phoneNumber.fax;
        }
        String str6 = str5;
        String str7 = str3;
        return phoneNumber.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOther() {
        return this.other;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHome() {
        return this.home;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWork() {
        return this.work;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFax() {
        return this.fax;
    }

    public final PhoneNumber copy(String other, String home, String work, String mobile, String fax) {
        return new PhoneNumber(other, home, work, mobile, fax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) other;
        return Intrinsics.areEqual(this.other, phoneNumber.other) && Intrinsics.areEqual(this.home, phoneNumber.home) && Intrinsics.areEqual(this.work, phoneNumber.work) && Intrinsics.areEqual(this.mobile, phoneNumber.mobile) && Intrinsics.areEqual(this.fax, phoneNumber.fax);
    }

    public final String getFax() {
        return this.fax;
    }

    public final String getHome() {
        return this.home;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getOther() {
        return this.other;
    }

    public final String getWork() {
        return this.work;
    }

    public int hashCode() {
        String str = this.other;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.home;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.work;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mobile;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fax;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "PhoneNumber(other=" + this.other + ", home=" + this.home + ", work=" + this.work + ", mobile=" + this.mobile + ", fax=" + this.fax + ")";
    }
}
