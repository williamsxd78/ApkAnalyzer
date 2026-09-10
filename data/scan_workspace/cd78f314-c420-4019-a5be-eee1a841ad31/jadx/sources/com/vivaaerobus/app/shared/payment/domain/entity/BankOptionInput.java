package com.vivaaerobus.app.shared.payment.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankOptionInput.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/domain/entity/BankOptionInput;", "", "name", "", "installments", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getInstallments", "()I", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BankOptionInput {
    private final int installments;
    private final String name;

    public BankOptionInput(String str, int i) {
        this.name = str;
        this.installments = i;
    }

    public static /* synthetic */ BankOptionInput copy$default(BankOptionInput bankOptionInput, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bankOptionInput.name;
        }
        if ((i2 & 2) != 0) {
            i = bankOptionInput.installments;
        }
        return bankOptionInput.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getInstallments() {
        return this.installments;
    }

    public final BankOptionInput copy(String name, int installments) {
        return new BankOptionInput(name, installments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankOptionInput)) {
            return false;
        }
        BankOptionInput bankOptionInput = (BankOptionInput) other;
        return Intrinsics.areEqual(this.name, bankOptionInput.name) && this.installments == bankOptionInput.installments;
    }

    public final int getInstallments() {
        return this.installments;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.installments);
    }

    public String toString() {
        return "BankOptionInput(name=" + this.name + ", installments=" + this.installments + ")";
    }
}
