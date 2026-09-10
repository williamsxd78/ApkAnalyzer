package com.vivaaerobus.app.checkIn.presentation.boardingPass.passengerSelector.model;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassengerOptionData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/checkIn/presentation/boardingPass/passengerSelector/model/PassengerOptionData;", "", "fullName", "", i0.a.COLUMN_KEY, "enable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getFullName", "()Ljava/lang/String;", "getKey", "getEnable", "()Z", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "checkIn_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PassengerOptionData {
    public static final int $stable = 0;
    private final boolean enable;
    private final String fullName;
    private final String key;

    public PassengerOptionData(String fullName, String str, boolean z) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.fullName = fullName;
        this.key = str;
        this.enable = z;
    }

    public static /* synthetic */ PassengerOptionData copy$default(PassengerOptionData passengerOptionData, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passengerOptionData.fullName;
        }
        if ((i & 2) != 0) {
            str2 = passengerOptionData.key;
        }
        if ((i & 4) != 0) {
            z = passengerOptionData.enable;
        }
        return passengerOptionData.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    public final PassengerOptionData copy(String fullName, String key, boolean enable) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        return new PassengerOptionData(fullName, key, enable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengerOptionData)) {
            return false;
        }
        PassengerOptionData passengerOptionData = (PassengerOptionData) other;
        return Intrinsics.areEqual(this.fullName, passengerOptionData.fullName) && Intrinsics.areEqual(this.key, passengerOptionData.key) && this.enable == passengerOptionData.enable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int hashCode = this.fullName.hashCode() * 31;
        String str = this.key;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enable);
    }

    public String toString() {
        return "PassengerOptionData(fullName=" + this.fullName + ", key=" + this.key + ", enable=" + this.enable + ")";
    }
}
