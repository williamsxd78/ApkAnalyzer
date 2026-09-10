package com.yuno.payments.network.services.payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.yuno.presentation.core.components.WalletCardTypeComponentKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsDTO.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J©\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\t\u00106\u001a\u000207HÖ\u0001J\u0013\u00108\u001a\u00020\u00032\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000207HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000207HÖ\u0001R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006C"}, d2 = {"Lcom/yuno/payments/network/services/payments/models/FieldsRequiredDTO;", "Landroid/os/Parcelable;", "document", "", "email", "firstName", "lastName", "securityCode", "phone", "installment", "billingAddress", "neighborhood", "issuers", "walletCardType", "benefitType", "bannerInfo", "accountNumber", "routingId", "beneficiaryName", "(ZZZZZZZZZZZZZZZZ)V", "getAccountNumber", "()Z", "getBannerInfo", "getBeneficiaryName", "getBenefitType", "getBillingAddress", "getDocument", "getEmail", "getFirstName", "getInstallment", "getIssuers", "getLastName", "getNeighborhood", "getPhone", "getRoutingId", "getSecurityCode", "getWalletCardType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FieldsRequiredDTO implements Parcelable {
    public static final Parcelable.Creator<FieldsRequiredDTO> CREATOR = new Creator();

    @SerializedName("account_number")
    private final boolean accountNumber;

    @SerializedName("banner_info")
    private final boolean bannerInfo;

    @SerializedName("beneficiary_name")
    private final boolean beneficiaryName;

    @SerializedName("benefit_type")
    private final boolean benefitType;

    @SerializedName("billing_address")
    private final boolean billingAddress;

    @SerializedName("document")
    private final boolean document;

    @SerializedName("email")
    private final boolean email;

    @SerializedName("first_name")
    private final boolean firstName;

    @SerializedName("installment")
    private final boolean installment;

    @SerializedName("issuers")
    private final boolean issuers;

    @SerializedName("last_name")
    private final boolean lastName;

    @SerializedName("neighborhood")
    private final boolean neighborhood;

    @SerializedName("phone")
    private final boolean phone;

    @SerializedName("routing_id")
    private final boolean routingId;

    @SerializedName("security_code")
    private final boolean securityCode;

    @SerializedName(WalletCardTypeComponentKt.WALLET_COMPONENT_ID)
    private final boolean walletCardType;

    /* compiled from: PaymentMethodsDTO.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<FieldsRequiredDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldsRequiredDTO createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z16 = true;
            boolean z17 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z16 = false;
            }
            if (parcel.readInt() != 0) {
                z2 = false;
                z17 = z;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
                z2 = z;
            } else {
                z3 = z2;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
                z3 = z;
            } else {
                z4 = z3;
            }
            if (parcel.readInt() != 0) {
                z5 = z4;
                z4 = z;
            } else {
                z5 = z4;
            }
            if (parcel.readInt() != 0) {
                z6 = z5;
                z5 = z;
            } else {
                z6 = z5;
            }
            if (parcel.readInt() != 0) {
                z7 = z6;
                z6 = z;
            } else {
                z7 = z6;
            }
            if (parcel.readInt() != 0) {
                z8 = z7;
                z7 = z;
            } else {
                z8 = z7;
            }
            if (parcel.readInt() != 0) {
                z9 = z8;
                z8 = z;
            } else {
                z9 = z8;
            }
            if (parcel.readInt() != 0) {
                z10 = z9;
                z9 = z;
            } else {
                z10 = z9;
            }
            if (parcel.readInt() != 0) {
                z11 = z10;
                z10 = z;
            } else {
                z11 = z10;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
                z11 = z;
            } else {
                z12 = z11;
            }
            if (parcel.readInt() != 0) {
                z13 = z12;
                z12 = z;
            } else {
                z13 = z12;
            }
            if (parcel.readInt() != 0) {
                z14 = z13;
                z13 = z;
            } else {
                z14 = z13;
            }
            if (parcel.readInt() != 0) {
                z15 = z14;
                z14 = z;
            } else {
                z15 = z14;
            }
            if (parcel.readInt() != 0) {
                z15 = z;
            }
            return new FieldsRequiredDTO(z16, z17, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldsRequiredDTO[] newArray(int i) {
            return new FieldsRequiredDTO[i];
        }
    }

    public FieldsRequiredDTO(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.document = z;
        this.email = z2;
        this.firstName = z3;
        this.lastName = z4;
        this.securityCode = z5;
        this.phone = z6;
        this.installment = z7;
        this.billingAddress = z8;
        this.neighborhood = z9;
        this.issuers = z10;
        this.walletCardType = z11;
        this.benefitType = z12;
        this.bannerInfo = z13;
        this.accountNumber = z14;
        this.routingId = z15;
        this.beneficiaryName = z16;
    }

    public static /* synthetic */ FieldsRequiredDTO copy$default(FieldsRequiredDTO fieldsRequiredDTO, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i, Object obj) {
        boolean z17 = (i & 1) != 0 ? fieldsRequiredDTO.document : z;
        return fieldsRequiredDTO.copy(z17, (i & 2) != 0 ? fieldsRequiredDTO.email : z2, (i & 4) != 0 ? fieldsRequiredDTO.firstName : z3, (i & 8) != 0 ? fieldsRequiredDTO.lastName : z4, (i & 16) != 0 ? fieldsRequiredDTO.securityCode : z5, (i & 32) != 0 ? fieldsRequiredDTO.phone : z6, (i & 64) != 0 ? fieldsRequiredDTO.installment : z7, (i & 128) != 0 ? fieldsRequiredDTO.billingAddress : z8, (i & 256) != 0 ? fieldsRequiredDTO.neighborhood : z9, (i & 512) != 0 ? fieldsRequiredDTO.issuers : z10, (i & 1024) != 0 ? fieldsRequiredDTO.walletCardType : z11, (i & 2048) != 0 ? fieldsRequiredDTO.benefitType : z12, (i & 4096) != 0 ? fieldsRequiredDTO.bannerInfo : z13, (i & 8192) != 0 ? fieldsRequiredDTO.accountNumber : z14, (i & 16384) != 0 ? fieldsRequiredDTO.routingId : z15, (i & 32768) != 0 ? fieldsRequiredDTO.beneficiaryName : z16);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDocument() {
        return this.document;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIssuers() {
        return this.issuers;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getWalletCardType() {
        return this.walletCardType;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getBenefitType() {
        return this.benefitType;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getBannerInfo() {
        return this.bannerInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getRoutingId() {
        return this.routingId;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getBeneficiaryName() {
        return this.beneficiaryName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFirstName() {
        return this.firstName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLastName() {
        return this.lastName;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSecurityCode() {
        return this.securityCode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPhone() {
        return this.phone;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getInstallment() {
        return this.installment;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getNeighborhood() {
        return this.neighborhood;
    }

    public final FieldsRequiredDTO copy(boolean document, boolean email, boolean firstName, boolean lastName, boolean securityCode, boolean phone, boolean installment, boolean billingAddress, boolean neighborhood, boolean issuers, boolean walletCardType, boolean benefitType, boolean bannerInfo, boolean accountNumber, boolean routingId, boolean beneficiaryName) {
        return new FieldsRequiredDTO(document, email, firstName, lastName, securityCode, phone, installment, billingAddress, neighborhood, issuers, walletCardType, benefitType, bannerInfo, accountNumber, routingId, beneficiaryName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldsRequiredDTO)) {
            return false;
        }
        FieldsRequiredDTO fieldsRequiredDTO = (FieldsRequiredDTO) other;
        return this.document == fieldsRequiredDTO.document && this.email == fieldsRequiredDTO.email && this.firstName == fieldsRequiredDTO.firstName && this.lastName == fieldsRequiredDTO.lastName && this.securityCode == fieldsRequiredDTO.securityCode && this.phone == fieldsRequiredDTO.phone && this.installment == fieldsRequiredDTO.installment && this.billingAddress == fieldsRequiredDTO.billingAddress && this.neighborhood == fieldsRequiredDTO.neighborhood && this.issuers == fieldsRequiredDTO.issuers && this.walletCardType == fieldsRequiredDTO.walletCardType && this.benefitType == fieldsRequiredDTO.benefitType && this.bannerInfo == fieldsRequiredDTO.bannerInfo && this.accountNumber == fieldsRequiredDTO.accountNumber && this.routingId == fieldsRequiredDTO.routingId && this.beneficiaryName == fieldsRequiredDTO.beneficiaryName;
    }

    public final boolean getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getBannerInfo() {
        return this.bannerInfo;
    }

    public final boolean getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public final boolean getBenefitType() {
        return this.benefitType;
    }

    public final boolean getBillingAddress() {
        return this.billingAddress;
    }

    public final boolean getDocument() {
        return this.document;
    }

    public final boolean getEmail() {
        return this.email;
    }

    public final boolean getFirstName() {
        return this.firstName;
    }

    public final boolean getInstallment() {
        return this.installment;
    }

    public final boolean getIssuers() {
        return this.issuers;
    }

    public final boolean getLastName() {
        return this.lastName;
    }

    public final boolean getNeighborhood() {
        return this.neighborhood;
    }

    public final boolean getPhone() {
        return this.phone;
    }

    public final boolean getRoutingId() {
        return this.routingId;
    }

    public final boolean getSecurityCode() {
        return this.securityCode;
    }

    public final boolean getWalletCardType() {
        return this.walletCardType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.document;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.email;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.firstName;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.lastName;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.securityCode;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.phone;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r26 = this.installment;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r27 = this.billingAddress;
        int i14 = r27;
        if (r27 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        ?? r28 = this.neighborhood;
        int i16 = r28;
        if (r28 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        ?? r29 = this.issuers;
        int i18 = r29;
        if (r29 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        ?? r210 = this.walletCardType;
        int i20 = r210;
        if (r210 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        ?? r211 = this.benefitType;
        int i22 = r211;
        if (r211 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        ?? r212 = this.bannerInfo;
        int i24 = r212;
        if (r212 != 0) {
            i24 = 1;
        }
        int i25 = (i23 + i24) * 31;
        ?? r213 = this.accountNumber;
        int i26 = r213;
        if (r213 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        ?? r214 = this.routingId;
        int i28 = r214;
        if (r214 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        boolean z2 = this.beneficiaryName;
        return i29 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "FieldsRequiredDTO(document=" + this.document + ", email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", securityCode=" + this.securityCode + ", phone=" + this.phone + ", installment=" + this.installment + ", billingAddress=" + this.billingAddress + ", neighborhood=" + this.neighborhood + ", issuers=" + this.issuers + ", walletCardType=" + this.walletCardType + ", benefitType=" + this.benefitType + ", bannerInfo=" + this.bannerInfo + ", accountNumber=" + this.accountNumber + ", routingId=" + this.routingId + ", beneficiaryName=" + this.beneficiaryName + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.document ? 1 : 0);
        parcel.writeInt(this.email ? 1 : 0);
        parcel.writeInt(this.firstName ? 1 : 0);
        parcel.writeInt(this.lastName ? 1 : 0);
        parcel.writeInt(this.securityCode ? 1 : 0);
        parcel.writeInt(this.phone ? 1 : 0);
        parcel.writeInt(this.installment ? 1 : 0);
        parcel.writeInt(this.billingAddress ? 1 : 0);
        parcel.writeInt(this.neighborhood ? 1 : 0);
        parcel.writeInt(this.issuers ? 1 : 0);
        parcel.writeInt(this.walletCardType ? 1 : 0);
        parcel.writeInt(this.benefitType ? 1 : 0);
        parcel.writeInt(this.bannerInfo ? 1 : 0);
        parcel.writeInt(this.accountNumber ? 1 : 0);
        parcel.writeInt(this.routingId ? 1 : 0);
        parcel.writeInt(this.beneficiaryName ? 1 : 0);
    }
}
