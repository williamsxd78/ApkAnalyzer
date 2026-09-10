package com.vivaaerobus.app.components.payment;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectBuyerState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/components/payment/SelectBuyerState;", "", "other", "", "name", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOther", "()Ljava/lang/String;", "getName", "getLastName", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "hashCode", "", "toString", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectBuyerState {
    public static final int $stable = 0;
    private final String lastName;
    private final String name;
    private final String other;

    public SelectBuyerState(String other, String name, String lastName) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.other = other;
        this.name = name;
        this.lastName = lastName;
    }

    public static /* synthetic */ SelectBuyerState copy$default(SelectBuyerState selectBuyerState, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectBuyerState.other;
        }
        if ((i & 2) != 0) {
            str2 = selectBuyerState.name;
        }
        if ((i & 4) != 0) {
            str3 = selectBuyerState.lastName;
        }
        return selectBuyerState.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOther() {
        return this.other;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final SelectBuyerState copy(String other, String name, String lastName) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new SelectBuyerState(other, name, lastName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectBuyerState)) {
            return false;
        }
        SelectBuyerState selectBuyerState = (SelectBuyerState) other;
        return Intrinsics.areEqual(this.other, selectBuyerState.other) && Intrinsics.areEqual(this.name, selectBuyerState.name) && Intrinsics.areEqual(this.lastName, selectBuyerState.lastName);
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOther() {
        return this.other;
    }

    public int hashCode() {
        return (((this.other.hashCode() * 31) + this.name.hashCode()) * 31) + this.lastName.hashCode();
    }

    public String toString() {
        return "SelectBuyerState(other=" + this.other + ", name=" + this.name + ", lastName=" + this.lastName + ")";
    }
}
