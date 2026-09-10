package com.vivaaerobus.app.newContentful.domain.usecase.fetchDeferredPaymentBankConfig;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankOptionMapping.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/usecase/fetchDeferredPaymentBankConfig/BankOptionMapping;", "", "bankOption", "", "emisorValues", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBankOption", "()Ljava/lang/String;", "getEmisorValues", "()Ljava/util/List;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BankOptionMapping {
    private final String bankOption;
    private final List<String> emisorValues;

    public BankOptionMapping(String bankOption, List<String> emisorValues) {
        Intrinsics.checkNotNullParameter(bankOption, "bankOption");
        Intrinsics.checkNotNullParameter(emisorValues, "emisorValues");
        this.bankOption = bankOption;
        this.emisorValues = emisorValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankOptionMapping copy$default(BankOptionMapping bankOptionMapping, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankOptionMapping.bankOption;
        }
        if ((i & 2) != 0) {
            list = bankOptionMapping.emisorValues;
        }
        return bankOptionMapping.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBankOption() {
        return this.bankOption;
    }

    public final List<String> component2() {
        return this.emisorValues;
    }

    public final BankOptionMapping copy(String bankOption, List<String> emisorValues) {
        Intrinsics.checkNotNullParameter(bankOption, "bankOption");
        Intrinsics.checkNotNullParameter(emisorValues, "emisorValues");
        return new BankOptionMapping(bankOption, emisorValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankOptionMapping)) {
            return false;
        }
        BankOptionMapping bankOptionMapping = (BankOptionMapping) other;
        return Intrinsics.areEqual(this.bankOption, bankOptionMapping.bankOption) && Intrinsics.areEqual(this.emisorValues, bankOptionMapping.emisorValues);
    }

    public final String getBankOption() {
        return this.bankOption;
    }

    public final List<String> getEmisorValues() {
        return this.emisorValues;
    }

    public int hashCode() {
        return (this.bankOption.hashCode() * 31) + this.emisorValues.hashCode();
    }

    public String toString() {
        return "BankOptionMapping(bankOption=" + this.bankOption + ", emisorValues=" + this.emisorValues + ")";
    }
}
