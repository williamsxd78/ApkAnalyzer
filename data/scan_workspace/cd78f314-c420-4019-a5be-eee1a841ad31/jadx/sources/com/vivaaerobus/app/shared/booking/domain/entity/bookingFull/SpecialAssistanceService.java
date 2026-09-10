package com.vivaaerobus.app.shared.booking.domain.entity.bookingFull;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.extras.extraDetail.activity.ExtraDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpecialAssistanceService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/domain/entity/bookingFull/SpecialAssistanceService;", "", ExtraDetailActivity.ARG_SSR_CODE, "", "name", "passengerKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSsrCode", "()Ljava/lang/String;", "getName", "getPassengerKey", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SpecialAssistanceService {
    private final String name;
    private final String passengerKey;
    private final String ssrCode;

    public SpecialAssistanceService(String str, String str2, String str3) {
        this.ssrCode = str;
        this.name = str2;
        this.passengerKey = str3;
    }

    public static /* synthetic */ SpecialAssistanceService copy$default(SpecialAssistanceService specialAssistanceService, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = specialAssistanceService.ssrCode;
        }
        if ((i & 2) != 0) {
            str2 = specialAssistanceService.name;
        }
        if ((i & 4) != 0) {
            str3 = specialAssistanceService.passengerKey;
        }
        return specialAssistanceService.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSsrCode() {
        return this.ssrCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPassengerKey() {
        return this.passengerKey;
    }

    public final SpecialAssistanceService copy(String ssrCode, String name, String passengerKey) {
        return new SpecialAssistanceService(ssrCode, name, passengerKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialAssistanceService)) {
            return false;
        }
        SpecialAssistanceService specialAssistanceService = (SpecialAssistanceService) other;
        return Intrinsics.areEqual(this.ssrCode, specialAssistanceService.ssrCode) && Intrinsics.areEqual(this.name, specialAssistanceService.name) && Intrinsics.areEqual(this.passengerKey, specialAssistanceService.passengerKey);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPassengerKey() {
        return this.passengerKey;
    }

    public final String getSsrCode() {
        return this.ssrCode;
    }

    public int hashCode() {
        String str = this.ssrCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.passengerKey;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SpecialAssistanceService(ssrCode=" + this.ssrCode + ", name=" + this.name + ", passengerKey=" + this.passengerKey + ")";
    }
}
