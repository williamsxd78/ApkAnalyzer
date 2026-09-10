package com.vivaaerobus.app.database.entities.profile;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FundEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/vivaaerobus/app/database/entities/profile/FundEntity;", "", "id", "", "type", "totalAmount", "", "code", "customerNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getTotalAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCode", "getCustomerNumber", "component1", "component2", "component3", "component4", "component5", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/vivaaerobus/app/database/entities/profile/FundEntity;", "equals", "", "other", "hashCode", "", "toString", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FundEntity {
    private final String code;
    private final String customerNumber;
    private final String id;
    private final Double totalAmount;
    private final String type;

    public FundEntity(String id, String str, Double d, String str2, String customerNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        this.id = id;
        this.type = str;
        this.totalAmount = d;
        this.code = str2;
        this.customerNumber = customerNumber;
    }

    public static /* synthetic */ FundEntity copy$default(FundEntity fundEntity, String str, String str2, Double d, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = fundEntity.type;
        }
        if ((i & 4) != 0) {
            d = fundEntity.totalAmount;
        }
        if ((i & 8) != 0) {
            str3 = fundEntity.code;
        }
        if ((i & 16) != 0) {
            str4 = fundEntity.customerNumber;
        }
        String str5 = str4;
        Double d2 = d;
        return fundEntity.copy(str, str2, d2, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    public final FundEntity copy(String id, String type, Double totalAmount, String code, String customerNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        return new FundEntity(id, type, totalAmount, code, customerNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundEntity)) {
            return false;
        }
        FundEntity fundEntity = (FundEntity) other;
        return Intrinsics.areEqual(this.id, fundEntity.id) && Intrinsics.areEqual(this.type, fundEntity.type) && Intrinsics.areEqual((Object) this.totalAmount, (Object) fundEntity.totalAmount) && Intrinsics.areEqual(this.code, fundEntity.code) && Intrinsics.areEqual(this.customerNumber, fundEntity.customerNumber);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    public final String getId() {
        return this.id;
    }

    public final Double getTotalAmount() {
        return this.totalAmount;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.totalAmount;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.code;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.customerNumber.hashCode();
    }

    public String toString() {
        return "FundEntity(id=" + this.id + ", type=" + this.type + ", totalAmount=" + this.totalAmount + ", code=" + this.code + ", customerNumber=" + this.customerNumber + ")";
    }
}
