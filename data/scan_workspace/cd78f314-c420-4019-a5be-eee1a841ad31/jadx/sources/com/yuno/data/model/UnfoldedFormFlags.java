package com.yuno.data.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKInformationBO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/yuno/data/model/UnfoldedFormFlags;", "", "isCardEnabled", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Boolean;)Lcom/yuno/data/model/UnfoldedFormFlags;", "equals", "other", "hashCode", "", "toString", "", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UnfoldedFormFlags {
    private final Boolean isCardEnabled;

    public UnfoldedFormFlags(Boolean bool) {
        this.isCardEnabled = bool;
    }

    public static /* synthetic */ UnfoldedFormFlags copy$default(UnfoldedFormFlags unfoldedFormFlags, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = unfoldedFormFlags.isCardEnabled;
        }
        return unfoldedFormFlags.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsCardEnabled() {
        return this.isCardEnabled;
    }

    public final UnfoldedFormFlags copy(Boolean isCardEnabled) {
        return new UnfoldedFormFlags(isCardEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnfoldedFormFlags) && Intrinsics.areEqual(this.isCardEnabled, ((UnfoldedFormFlags) other).isCardEnabled);
    }

    public int hashCode() {
        Boolean bool = this.isCardEnabled;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isCardEnabled() {
        return this.isCardEnabled;
    }

    public String toString() {
        return "UnfoldedFormFlags(isCardEnabled=" + this.isCardEnabled + ")";
    }
}
