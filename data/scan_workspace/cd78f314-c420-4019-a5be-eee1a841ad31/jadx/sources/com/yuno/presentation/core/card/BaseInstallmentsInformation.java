package com.yuno.presentation.core.card;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseOneStepCardForm.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/yuno/presentation/core/card/BaseInstallmentsInformation;", "", "value", "", "id", "", "(ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BaseInstallmentsInformation {
    private final String id;
    private final int value;

    public BaseInstallmentsInformation(int i, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.value = i;
        this.id = id;
    }

    public static /* synthetic */ BaseInstallmentsInformation copy$default(BaseInstallmentsInformation baseInstallmentsInformation, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = baseInstallmentsInformation.value;
        }
        if ((i2 & 2) != 0) {
            str = baseInstallmentsInformation.id;
        }
        return baseInstallmentsInformation.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final BaseInstallmentsInformation copy(int value, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new BaseInstallmentsInformation(value, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseInstallmentsInformation)) {
            return false;
        }
        BaseInstallmentsInformation baseInstallmentsInformation = (BaseInstallmentsInformation) other;
        return this.value == baseInstallmentsInformation.value && Intrinsics.areEqual(this.id, baseInstallmentsInformation.id);
    }

    public final String getId() {
        return this.id;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Integer.hashCode(this.value) * 31) + this.id.hashCode();
    }

    public String toString() {
        return "BaseInstallmentsInformation(value=" + this.value + ", id=" + this.id + ")";
    }
}
