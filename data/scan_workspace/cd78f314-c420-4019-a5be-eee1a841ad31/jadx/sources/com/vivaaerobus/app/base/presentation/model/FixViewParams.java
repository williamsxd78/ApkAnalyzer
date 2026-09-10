package com.vivaaerobus.app.base.presentation.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FixViewParams.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/base/presentation/model/FixViewParams;", "", "required", "", "fixBottom", "<init>", "(ZZ)V", "getRequired", "()Z", "getFixBottom", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "", "base_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FixViewParams {
    public static final int $stable = 0;
    private final boolean fixBottom;
    private final boolean required;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FixViewParams() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivaaerobus.app.base.presentation.model.FixViewParams.<init>():void");
    }

    public FixViewParams(boolean z, boolean z2) {
        this.required = z;
        this.fixBottom = z2;
    }

    public /* synthetic */ FixViewParams(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public static /* synthetic */ FixViewParams copy$default(FixViewParams fixViewParams, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fixViewParams.required;
        }
        if ((i & 2) != 0) {
            z2 = fixViewParams.fixBottom;
        }
        return fixViewParams.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFixBottom() {
        return this.fixBottom;
    }

    public final FixViewParams copy(boolean required, boolean fixBottom) {
        return new FixViewParams(required, fixBottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FixViewParams)) {
            return false;
        }
        FixViewParams fixViewParams = (FixViewParams) other;
        return this.required == fixViewParams.required && this.fixBottom == fixViewParams.fixBottom;
    }

    public final boolean getFixBottom() {
        return this.fixBottom;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.required) * 31) + Boolean.hashCode(this.fixBottom);
    }

    public String toString() {
        return "FixViewParams(required=" + this.required + ", fixBottom=" + this.fixBottom + ")";
    }
}
