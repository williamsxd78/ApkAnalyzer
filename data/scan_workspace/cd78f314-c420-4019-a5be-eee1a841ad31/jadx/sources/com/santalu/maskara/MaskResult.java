package com.santalu.maskara;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaskResult.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/santalu/maskara/MaskResult;", "", "selection", "", "masked", "", "unMasked", "isDone", "", "(ILjava/lang/String;Ljava/lang/String;Z)V", "()Z", "getMasked", "()Ljava/lang/String;", "getSelection", "()I", "getUnMasked", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes3.dex */
public final /* data */ class MaskResult {
    private final boolean isDone;
    private final String masked;
    private final int selection;
    private final String unMasked;

    public MaskResult(int i, String masked, String unMasked, boolean z) {
        Intrinsics.checkParameterIsNotNull(masked, "masked");
        Intrinsics.checkParameterIsNotNull(unMasked, "unMasked");
        this.selection = i;
        this.masked = masked;
        this.unMasked = unMasked;
        this.isDone = z;
    }

    public static /* synthetic */ MaskResult copy$default(MaskResult maskResult, int i, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = maskResult.selection;
        }
        if ((i2 & 2) != 0) {
            str = maskResult.masked;
        }
        if ((i2 & 4) != 0) {
            str2 = maskResult.unMasked;
        }
        if ((i2 & 8) != 0) {
            z = maskResult.isDone;
        }
        return maskResult.copy(i, str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSelection() {
        return this.selection;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMasked() {
        return this.masked;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUnMasked() {
        return this.unMasked;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDone() {
        return this.isDone;
    }

    public final MaskResult copy(int selection, String masked, String unMasked, boolean isDone) {
        Intrinsics.checkParameterIsNotNull(masked, "masked");
        Intrinsics.checkParameterIsNotNull(unMasked, "unMasked");
        return new MaskResult(selection, masked, unMasked, isDone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaskResult)) {
            return false;
        }
        MaskResult maskResult = (MaskResult) other;
        return this.selection == maskResult.selection && Intrinsics.areEqual(this.masked, maskResult.masked) && Intrinsics.areEqual(this.unMasked, maskResult.unMasked) && this.isDone == maskResult.isDone;
    }

    public final String getMasked() {
        return this.masked;
    }

    public final int getSelection() {
        return this.selection;
    }

    public final String getUnMasked() {
        return this.unMasked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.selection) * 31;
        String str = this.masked;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.unMasked;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isDone;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final boolean isDone() {
        return this.isDone;
    }

    public String toString() {
        return "MaskResult(selection=" + this.selection + ", masked=" + this.masked + ", unMasked=" + this.unMasked + ", isDone=" + this.isDone + ")";
    }
}
