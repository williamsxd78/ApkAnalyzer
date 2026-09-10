package com.yuno.payments.network.services.payments.models;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsDTO.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/ThreeDSecureDTO;", "", "threeDSecureSetupId", "", "(Ljava/lang/String;)V", "getThreeDSecureSetupId", "()Ljava/lang/String;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ThreeDSecureDTO {

    @SerializedName("three_d_secure_setup_id")
    private final String threeDSecureSetupId;

    public ThreeDSecureDTO(String str) {
        this.threeDSecureSetupId = str;
    }

    public static /* synthetic */ ThreeDSecureDTO copy$default(ThreeDSecureDTO threeDSecureDTO, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threeDSecureDTO.threeDSecureSetupId;
        }
        return threeDSecureDTO.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getThreeDSecureSetupId() {
        return this.threeDSecureSetupId;
    }

    public final ThreeDSecureDTO copy(String threeDSecureSetupId) {
        return new ThreeDSecureDTO(threeDSecureSetupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThreeDSecureDTO) && Intrinsics.areEqual(this.threeDSecureSetupId, ((ThreeDSecureDTO) other).threeDSecureSetupId);
    }

    public final String getThreeDSecureSetupId() {
        return this.threeDSecureSetupId;
    }

    public int hashCode() {
        String str = this.threeDSecureSetupId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ThreeDSecureDTO(threeDSecureSetupId=" + this.threeDSecureSetupId + ")";
    }
}
