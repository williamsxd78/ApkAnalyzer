package com.yuno.payments.features.payment.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015JÎ\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010>J\t\u0010?\u001a\u00020@HÖ\u0001J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020@HÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020@HÖ\u0001R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b#\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b$\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b%\u0010\u0015R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b(\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b)\u0010\u0015R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b*\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b+\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b,\u0010\u0015¨\u0006L"}, d2 = {"Lcom/yuno/payments/features/payment/models/FieldsRequired;", "Landroid/os/Parcelable;", "document", "", "email", "firstName", "lastName", "securityCode", "phone", "installments", "billingAddress", "neighborhood", "issuers", "walletCardType", "benefitType", "bannerInfo", "accountNumber", "routingId", "beneficiaryName", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAccountNumber", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBannerInfo", "getBeneficiaryName", "getBenefitType", "getBillingAddress", "getDocument", "getEmail", "getFirstName", "hasOnlyInstallments", "getHasOnlyInstallments", "()Z", "hasOnlySecurityCode", "getHasOnlySecurityCode", "getInstallments", "getIssuers", "getLastName", "needsExtraFirstCardStep", "getNeedsExtraFirstCardStep", "getNeighborhood", "getPhone", "getRoutingId", "getSecurityCode", "getWalletCardType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/yuno/payments/features/payment/models/FieldsRequired;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FieldsRequired implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FieldsRequired> CREATOR = new Creator();
    private final Boolean accountNumber;
    private final Boolean bannerInfo;
    private final Boolean beneficiaryName;
    private final Boolean benefitType;
    private final Boolean billingAddress;
    private final Boolean document;
    private final Boolean email;
    private final Boolean firstName;
    private final boolean hasOnlyInstallments;
    private final boolean hasOnlySecurityCode;
    private final Boolean installments;
    private final Boolean issuers;
    private final Boolean lastName;
    private final boolean needsExtraFirstCardStep;
    private final Boolean neighborhood;
    private final Boolean phone;
    private final Boolean routingId;
    private final Boolean securityCode;
    private final Boolean walletCardType;

    /* compiled from: PaymentModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<FieldsRequired> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldsRequired createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            Boolean valueOf12;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf15 = null;
            } else {
                valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FieldsRequired(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldsRequired[] newArray(int i) {
            return new FieldsRequired[i];
        }
    }

    public FieldsRequired(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16) {
        this.document = bool;
        this.email = bool2;
        this.firstName = bool3;
        this.lastName = bool4;
        this.securityCode = bool5;
        this.phone = bool6;
        this.installments = bool7;
        this.billingAddress = bool8;
        this.neighborhood = bool9;
        this.issuers = bool10;
        this.walletCardType = bool11;
        this.benefitType = bool12;
        this.bannerInfo = bool13;
        this.accountNumber = bool14;
        this.routingId = bool15;
        this.beneficiaryName = bool16;
        this.hasOnlyInstallments = Intrinsics.areEqual((Object) bool, (Object) false) && Intrinsics.areEqual((Object) bool2, (Object) false) && Intrinsics.areEqual((Object) bool3, (Object) false) && Intrinsics.areEqual((Object) bool4, (Object) false) && Intrinsics.areEqual((Object) bool5, (Object) false) && Intrinsics.areEqual((Object) bool6, (Object) false) && Intrinsics.areEqual((Object) bool7, (Object) true) && Intrinsics.areEqual((Object) bool8, (Object) false) && Intrinsics.areEqual((Object) bool9, (Object) false) && Intrinsics.areEqual((Object) bool10, (Object) false) && Intrinsics.areEqual((Object) bool11, (Object) false) && Intrinsics.areEqual((Object) bool12, (Object) false) && Intrinsics.areEqual((Object) bool13, (Object) false);
        this.hasOnlySecurityCode = Intrinsics.areEqual((Object) bool, (Object) false) && Intrinsics.areEqual((Object) bool2, (Object) false) && Intrinsics.areEqual((Object) bool3, (Object) false) && Intrinsics.areEqual((Object) bool4, (Object) false) && Intrinsics.areEqual((Object) bool5, (Object) true) && Intrinsics.areEqual((Object) bool6, (Object) false) && Intrinsics.areEqual((Object) bool7, (Object) false) && Intrinsics.areEqual((Object) bool8, (Object) false) && Intrinsics.areEqual((Object) bool9, (Object) false) && Intrinsics.areEqual((Object) bool10, (Object) false) && Intrinsics.areEqual((Object) bool11, (Object) false) && Intrinsics.areEqual((Object) bool12, (Object) false) && Intrinsics.areEqual((Object) bool13, (Object) false);
        this.needsExtraFirstCardStep = Intrinsics.areEqual((Object) bool3, (Object) true) || Intrinsics.areEqual((Object) bool4, (Object) true) || Intrinsics.areEqual((Object) bool8, (Object) true) || Intrinsics.areEqual((Object) bool9, (Object) true) || Intrinsics.areEqual((Object) bool6, (Object) true) || Intrinsics.areEqual((Object) bool2, (Object) true);
    }

    public static /* synthetic */ FieldsRequired copy$default(FieldsRequired fieldsRequired, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, int i, Object obj) {
        Boolean bool17 = (i & 1) != 0 ? fieldsRequired.document : bool;
        return fieldsRequired.copy(bool17, (i & 2) != 0 ? fieldsRequired.email : bool2, (i & 4) != 0 ? fieldsRequired.firstName : bool3, (i & 8) != 0 ? fieldsRequired.lastName : bool4, (i & 16) != 0 ? fieldsRequired.securityCode : bool5, (i & 32) != 0 ? fieldsRequired.phone : bool6, (i & 64) != 0 ? fieldsRequired.installments : bool7, (i & 128) != 0 ? fieldsRequired.billingAddress : bool8, (i & 256) != 0 ? fieldsRequired.neighborhood : bool9, (i & 512) != 0 ? fieldsRequired.issuers : bool10, (i & 1024) != 0 ? fieldsRequired.walletCardType : bool11, (i & 2048) != 0 ? fieldsRequired.benefitType : bool12, (i & 4096) != 0 ? fieldsRequired.bannerInfo : bool13, (i & 8192) != 0 ? fieldsRequired.accountNumber : bool14, (i & 16384) != 0 ? fieldsRequired.routingId : bool15, (i & 32768) != 0 ? fieldsRequired.beneficiaryName : bool16);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getDocument() {
        return this.document;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIssuers() {
        return this.issuers;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getWalletCardType() {
        return this.walletCardType;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getBenefitType() {
        return this.benefitType;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getBannerInfo() {
        return this.bannerInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getRoutingId() {
        return this.routingId;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getBeneficiaryName() {
        return this.beneficiaryName;
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
    public final Boolean getInstallments() {
        return this.installments;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getNeighborhood() {
        return this.neighborhood;
    }

    public final FieldsRequired copy(Boolean document, Boolean email, Boolean firstName, Boolean lastName, Boolean securityCode, Boolean phone, Boolean installments, Boolean billingAddress, Boolean neighborhood, Boolean issuers, Boolean walletCardType, Boolean benefitType, Boolean bannerInfo, Boolean accountNumber, Boolean routingId, Boolean beneficiaryName) {
        return new FieldsRequired(document, email, firstName, lastName, securityCode, phone, installments, billingAddress, neighborhood, issuers, walletCardType, benefitType, bannerInfo, accountNumber, routingId, beneficiaryName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldsRequired)) {
            return false;
        }
        FieldsRequired fieldsRequired = (FieldsRequired) other;
        return Intrinsics.areEqual(this.document, fieldsRequired.document) && Intrinsics.areEqual(this.email, fieldsRequired.email) && Intrinsics.areEqual(this.firstName, fieldsRequired.firstName) && Intrinsics.areEqual(this.lastName, fieldsRequired.lastName) && Intrinsics.areEqual(this.securityCode, fieldsRequired.securityCode) && Intrinsics.areEqual(this.phone, fieldsRequired.phone) && Intrinsics.areEqual(this.installments, fieldsRequired.installments) && Intrinsics.areEqual(this.billingAddress, fieldsRequired.billingAddress) && Intrinsics.areEqual(this.neighborhood, fieldsRequired.neighborhood) && Intrinsics.areEqual(this.issuers, fieldsRequired.issuers) && Intrinsics.areEqual(this.walletCardType, fieldsRequired.walletCardType) && Intrinsics.areEqual(this.benefitType, fieldsRequired.benefitType) && Intrinsics.areEqual(this.bannerInfo, fieldsRequired.bannerInfo) && Intrinsics.areEqual(this.accountNumber, fieldsRequired.accountNumber) && Intrinsics.areEqual(this.routingId, fieldsRequired.routingId) && Intrinsics.areEqual(this.beneficiaryName, fieldsRequired.beneficiaryName);
    }

    public final Boolean getAccountNumber() {
        return this.accountNumber;
    }

    public final Boolean getBannerInfo() {
        return this.bannerInfo;
    }

    public final Boolean getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public final Boolean getBenefitType() {
        return this.benefitType;
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

    public final boolean getHasOnlyInstallments() {
        return this.hasOnlyInstallments;
    }

    public final boolean getHasOnlySecurityCode() {
        return this.hasOnlySecurityCode;
    }

    public final Boolean getInstallments() {
        return this.installments;
    }

    public final Boolean getIssuers() {
        return this.issuers;
    }

    public final Boolean getLastName() {
        return this.lastName;
    }

    public final boolean getNeedsExtraFirstCardStep() {
        return this.needsExtraFirstCardStep;
    }

    public final Boolean getNeighborhood() {
        return this.neighborhood;
    }

    public final Boolean getPhone() {
        return this.phone;
    }

    public final Boolean getRoutingId() {
        return this.routingId;
    }

    public final Boolean getSecurityCode() {
        return this.securityCode;
    }

    public final Boolean getWalletCardType() {
        return this.walletCardType;
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
        Boolean bool7 = this.installments;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.billingAddress;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.neighborhood;
        int hashCode9 = (hashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.issuers;
        int hashCode10 = (hashCode9 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.walletCardType;
        int hashCode11 = (hashCode10 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.benefitType;
        int hashCode12 = (hashCode11 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.bannerInfo;
        int hashCode13 = (hashCode12 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.accountNumber;
        int hashCode14 = (hashCode13 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.routingId;
        int hashCode15 = (hashCode14 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.beneficiaryName;
        return hashCode15 + (bool16 != null ? bool16.hashCode() : 0);
    }

    public String toString() {
        return "FieldsRequired(document=" + this.document + ", email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", securityCode=" + this.securityCode + ", phone=" + this.phone + ", installments=" + this.installments + ", billingAddress=" + this.billingAddress + ", neighborhood=" + this.neighborhood + ", issuers=" + this.issuers + ", walletCardType=" + this.walletCardType + ", benefitType=" + this.benefitType + ", bannerInfo=" + this.bannerInfo + ", accountNumber=" + this.accountNumber + ", routingId=" + this.routingId + ", beneficiaryName=" + this.beneficiaryName + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Boolean bool = this.document;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.email;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.firstName;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.lastName;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.securityCode;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.phone;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.installments;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.billingAddress;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.neighborhood;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Boolean bool10 = this.issuers;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        Boolean bool11 = this.walletCardType;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        Boolean bool12 = this.benefitType;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        Boolean bool13 = this.bannerInfo;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool13.booleanValue() ? 1 : 0);
        }
        Boolean bool14 = this.accountNumber;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool14.booleanValue() ? 1 : 0);
        }
        Boolean bool15 = this.routingId;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool15.booleanValue() ? 1 : 0);
        }
        Boolean bool16 = this.beneficiaryName;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool16.booleanValue() ? 1 : 0);
        }
    }
}
