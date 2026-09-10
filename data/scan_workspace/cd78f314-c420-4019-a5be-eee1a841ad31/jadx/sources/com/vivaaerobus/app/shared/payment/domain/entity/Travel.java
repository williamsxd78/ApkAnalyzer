package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Travel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/Travel;", "", "holdTime", "", "holdTimeMinutes", "", "lastName", "pnr", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getHoldTime", "()Ljava/lang/String;", "getHoldTimeMinutes", "()I", "getLastName", "getPnr", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Travel {
    private final String holdTime;
    private final int holdTimeMinutes;
    private final String lastName;
    private final String pnr;

    public Travel(String str, int i, String str2, String str3) {
        this.holdTime = str;
        this.holdTimeMinutes = i;
        this.lastName = str2;
        this.pnr = str3;
    }

    public static /* synthetic */ Travel copy$default(Travel travel, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = travel.holdTime;
        }
        if ((i2 & 2) != 0) {
            i = travel.holdTimeMinutes;
        }
        if ((i2 & 4) != 0) {
            str2 = travel.lastName;
        }
        if ((i2 & 8) != 0) {
            str3 = travel.pnr;
        }
        return travel.copy(str, i, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHoldTime() {
        return this.holdTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHoldTimeMinutes() {
        return this.holdTimeMinutes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPnr() {
        return this.pnr;
    }

    public final Travel copy(String holdTime, int holdTimeMinutes, String lastName, String pnr) {
        return new Travel(holdTime, holdTimeMinutes, lastName, pnr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Travel)) {
            return false;
        }
        Travel travel = (Travel) other;
        return Intrinsics.areEqual(this.holdTime, travel.holdTime) && this.holdTimeMinutes == travel.holdTimeMinutes && Intrinsics.areEqual(this.lastName, travel.lastName) && Intrinsics.areEqual(this.pnr, travel.pnr);
    }

    public final String getHoldTime() {
        return this.holdTime;
    }

    public final int getHoldTimeMinutes() {
        return this.holdTimeMinutes;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPnr() {
        return this.pnr;
    }

    public int hashCode() {
        String str = this.holdTime;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.holdTimeMinutes)) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pnr;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Travel(holdTime=" + this.holdTime + ", holdTimeMinutes=" + this.holdTimeMinutes + ", lastName=" + this.lastName + ", pnr=" + this.pnr + ")";
    }
}
