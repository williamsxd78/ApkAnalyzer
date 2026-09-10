package com.vivaaerobus.app.basket.domain.entity;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Step.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/basket/domain/entity/Step;", "", "name", "", "isOptional", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "()Z", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "basket_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Step {
    private final boolean isOptional;
    private final String name;

    public Step(String str, boolean z) {
        this.name = str;
        this.isOptional = z;
    }

    public static /* synthetic */ Step copy$default(Step step, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = step.name;
        }
        if ((i & 2) != 0) {
            z = step.isOptional;
        }
        return step.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    public final Step copy(String name, boolean isOptional) {
        return new Step(name, isOptional);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Step)) {
            return false;
        }
        Step step = (Step) other;
        return Intrinsics.areEqual(this.name, step.name) && this.isOptional == step.isOptional;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isOptional);
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    public String toString() {
        return "Step(name=" + this.name + ", isOptional=" + this.isOptional + ")";
    }
}
