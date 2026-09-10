package com.yuno.payments.network.services.core.models;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKInformationDTO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJz\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000e¨\u0006)"}, d2 = {"Lcom/yuno/payments/network/services/core/models/RequiredFieldsEventsDTO;", "", "document", "", "email", "firstName", "lastName", "securityCode", "phone", "installment", "billingAddress", "issuers", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getBillingAddress", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDocument", "getEmail", "getFirstName", "getInstallment", "getIssuers", "getLastName", "getPhone", "getSecurityCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/yuno/payments/network/services/core/models/RequiredFieldsEventsDTO;", "equals", "other", "hashCode", "", "toString", "", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RequiredFieldsEventsDTO {

    @SerializedName("billing_address")
    private final Boolean billingAddress;

    @SerializedName("document")
    private final Boolean document;

    @SerializedName("email")
    private final Boolean email;

    @SerializedName("first_name")
    private final Boolean firstName;

    @SerializedName("installment")
    private final Boolean installment;

    @SerializedName("issuers")
    private final Boolean issuers;

    @SerializedName("last_name")
    private final Boolean lastName;

    @SerializedName("phone")
    private final Boolean phone;

    @SerializedName("security_code")
    private final Boolean securityCode;

    public RequiredFieldsEventsDTO(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9) {
        this.document = bool;
        this.email = bool2;
        this.firstName = bool3;
        this.lastName = bool4;
        this.securityCode = bool5;
        this.phone = bool6;
        this.installment = bool7;
        this.billingAddress = bool8;
        this.issuers = bool9;
    }

    public static /* synthetic */ RequiredFieldsEventsDTO copy$default(RequiredFieldsEventsDTO requiredFieldsEventsDTO, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = requiredFieldsEventsDTO.document;
        }
        if ((i & 2) != 0) {
            bool2 = requiredFieldsEventsDTO.email;
        }
        if ((i & 4) != 0) {
            bool3 = requiredFieldsEventsDTO.firstName;
        }
        if ((i & 8) != 0) {
            bool4 = requiredFieldsEventsDTO.lastName;
        }
        if ((i & 16) != 0) {
            bool5 = requiredFieldsEventsDTO.securityCode;
        }
        if ((i & 32) != 0) {
            bool6 = requiredFieldsEventsDTO.phone;
        }
        if ((i & 64) != 0) {
            bool7 = requiredFieldsEventsDTO.installment;
        }
        if ((i & 128) != 0) {
            bool8 = requiredFieldsEventsDTO.billingAddress;
        }
        if ((i & 256) != 0) {
            bool9 = requiredFieldsEventsDTO.issuers;
        }
        Boolean bool10 = bool8;
        Boolean bool11 = bool9;
        Boolean bool12 = bool6;
        Boolean bool13 = bool7;
        Boolean bool14 = bool5;
        Boolean bool15 = bool3;
        return requiredFieldsEventsDTO.copy(bool, bool2, bool15, bool4, bool14, bool12, bool13, bool10, bool11);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getDocument() {
        return this.document;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getFirstName() {
        return this.firstName;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getLastName() {
        return this.lastName;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getSecurityCode() {
        return this.securityCode;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getPhone() {
        return this.phone;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getInstallment() {
        return this.installment;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIssuers() {
        return this.issuers;
    }

    public final RequiredFieldsEventsDTO copy(Boolean document, Boolean email, Boolean firstName, Boolean lastName, Boolean securityCode, Boolean phone, Boolean installment, Boolean billingAddress, Boolean issuers) {
        return new RequiredFieldsEventsDTO(document, email, firstName, lastName, securityCode, phone, installment, billingAddress, issuers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequiredFieldsEventsDTO)) {
            return false;
        }
        RequiredFieldsEventsDTO requiredFieldsEventsDTO = (RequiredFieldsEventsDTO) other;
        return Intrinsics.areEqual(this.document, requiredFieldsEventsDTO.document) && Intrinsics.areEqual(this.email, requiredFieldsEventsDTO.email) && Intrinsics.areEqual(this.firstName, requiredFieldsEventsDTO.firstName) && Intrinsics.areEqual(this.lastName, requiredFieldsEventsDTO.lastName) && Intrinsics.areEqual(this.securityCode, requiredFieldsEventsDTO.securityCode) && Intrinsics.areEqual(this.phone, requiredFieldsEventsDTO.phone) && Intrinsics.areEqual(this.installment, requiredFieldsEventsDTO.installment) && Intrinsics.areEqual(this.billingAddress, requiredFieldsEventsDTO.billingAddress) && Intrinsics.areEqual(this.issuers, requiredFieldsEventsDTO.issuers);
    }

    public final Boolean getBillingAddress() {
        return this.billingAddress;
    }

    public final Boolean getDocument() {
        return this.document;
    }

    public final Boolean getEmail() {
        return this.email;
    }

    public final Boolean getFirstName() {
        return this.firstName;
    }

    public final Boolean getInstallment() {
        return this.installment;
    }

    public final Boolean getIssuers() {
        return this.issuers;
    }

    public final Boolean getLastName() {
        return this.lastName;
    }

    public final Boolean getPhone() {
        return this.phone;
    }

    public final Boolean getSecurityCode() {
        return this.securityCode;
    }

    public int hashCode() {
        Boolean bool = this.document;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.email;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.firstName;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.lastName;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.securityCode;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.phone;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.installment;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.billingAddress;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.issuers;
        return hashCode8 + (bool9 != null ? bool9.hashCode() : 0);
    }

    public String toString() {
        return "RequiredFieldsEventsDTO(document=" + this.document + ", email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", securityCode=" + this.securityCode + ", phone=" + this.phone + ", installment=" + this.installment + ", billingAddress=" + this.billingAddress + ", issuers=" + this.issuers + ")";
    }
}
