package com.yuno.payments.network.services.core.models;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKInformationDTO.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/yuno/payments/network/services/core/models/CardThreeDSecureDTO;", "", "number", "", "expirationMonth", "", "expirationYear", "securityCode", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getExpirationMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpirationYear", "getNumber", "()Ljava/lang/String;", "getSecurityCode", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/yuno/payments/network/services/core/models/CardThreeDSecureDTO;", "equals", "", "other", "hashCode", "toString", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardThreeDSecureDTO {

    @SerializedName("expiration_month")
    private final Integer expirationMonth;

    @SerializedName("expiration_year")
    private final Integer expirationYear;

    @SerializedName("number")
    private final String number;

    @SerializedName("security_code")
    private final String securityCode;

    public CardThreeDSecureDTO(String str, Integer num, Integer num2, String str2) {
        this.number = str;
        this.expirationMonth = num;
        this.expirationYear = num2;
        this.securityCode = str2;
    }

    public static /* synthetic */ CardThreeDSecureDTO copy$default(CardThreeDSecureDTO cardThreeDSecureDTO, String str, Integer num, Integer num2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardThreeDSecureDTO.number;
        }
        if ((i & 2) != 0) {
            num = cardThreeDSecureDTO.expirationMonth;
        }
        if ((i & 4) != 0) {
            num2 = cardThreeDSecureDTO.expirationYear;
        }
        if ((i & 8) != 0) {
            str2 = cardThreeDSecureDTO.securityCode;
        }
        return cardThreeDSecureDTO.copy(str, num, num2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getExpirationMonth() {
        return this.expirationMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getExpirationYear() {
        return this.expirationYear;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecurityCode() {
        return this.securityCode;
    }

    public final CardThreeDSecureDTO copy(String number, Integer expirationMonth, Integer expirationYear, String securityCode) {
        return new CardThreeDSecureDTO(number, expirationMonth, expirationYear, securityCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardThreeDSecureDTO)) {
            return false;
        }
        CardThreeDSecureDTO cardThreeDSecureDTO = (CardThreeDSecureDTO) other;
        return Intrinsics.areEqual(this.number, cardThreeDSecureDTO.number) && Intrinsics.areEqual(this.expirationMonth, cardThreeDSecureDTO.expirationMonth) && Intrinsics.areEqual(this.expirationYear, cardThreeDSecureDTO.expirationYear) && Intrinsics.areEqual(this.securityCode, cardThreeDSecureDTO.securityCode);
    }

    public final Integer getExpirationMonth() {
        return this.expirationMonth;
    }

    public final Integer getExpirationYear() {
        return this.expirationYear;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getSecurityCode() {
        return this.securityCode;
    }

    public int hashCode() {
        String str = this.number;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.expirationMonth;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expirationYear;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.securityCode;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CardThreeDSecureDTO(number=" + this.number + ", expirationMonth=" + this.expirationMonth + ", expirationYear=" + this.expirationYear + ", securityCode=" + this.securityCode + ")";
    }
}
