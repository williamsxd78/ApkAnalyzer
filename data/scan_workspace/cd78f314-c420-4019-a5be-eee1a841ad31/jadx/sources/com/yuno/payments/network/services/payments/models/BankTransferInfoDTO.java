package com.yuno.payments.network.services.payments.models;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsDTO.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/BankTransferInfoDTO;", "", "beneficiaryName", "", "routingNumber", "bankAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAccount", "()Ljava/lang/String;", "getBeneficiaryName", "getRoutingNumber", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BankTransferInfoDTO {

    @SerializedName("bank_account")
    private final String bankAccount;

    @SerializedName("beneficiary_name")
    private final String beneficiaryName;

    @SerializedName("routing_number")
    private final String routingNumber;

    public BankTransferInfoDTO(String str, String str2, String str3) {
        this.beneficiaryName = str;
        this.routingNumber = str2;
        this.bankAccount = str3;
    }

    public static /* synthetic */ BankTransferInfoDTO copy$default(BankTransferInfoDTO bankTransferInfoDTO, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankTransferInfoDTO.beneficiaryName;
        }
        if ((i & 2) != 0) {
            str2 = bankTransferInfoDTO.routingNumber;
        }
        if ((i & 4) != 0) {
            str3 = bankTransferInfoDTO.bankAccount;
        }
        return bankTransferInfoDTO.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBankAccount() {
        return this.bankAccount;
    }

    public final BankTransferInfoDTO copy(String beneficiaryName, String routingNumber, String bankAccount) {
        return new BankTransferInfoDTO(beneficiaryName, routingNumber, bankAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankTransferInfoDTO)) {
            return false;
        }
        BankTransferInfoDTO bankTransferInfoDTO = (BankTransferInfoDTO) other;
        return Intrinsics.areEqual(this.beneficiaryName, bankTransferInfoDTO.beneficiaryName) && Intrinsics.areEqual(this.routingNumber, bankTransferInfoDTO.routingNumber) && Intrinsics.areEqual(this.bankAccount, bankTransferInfoDTO.bankAccount);
    }

    public final String getBankAccount() {
        return this.bankAccount;
    }

    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public int hashCode() {
        String str = this.beneficiaryName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.routingNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankAccount;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "BankTransferInfoDTO(beneficiaryName=" + this.beneficiaryName + ", routingNumber=" + this.routingNumber + ", bankAccount=" + this.bankAccount + ")";
    }
}
