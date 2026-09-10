package com.uplift.sdk.model.priv;

import com.google.gson.annotations.SerializedName;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULANPayMonthlyDeselectedNotEmptyMessageEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/uplift/sdk/model/priv/ULANPayMonthlyDeselectedNotEmptyMessageEvent;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULANPayMonthlyDeselectedNotEmptyMessageEvent {

    @SerializedName("value")
    private final String value;

    public ULANPayMonthlyDeselectedNotEmptyMessageEvent(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static /* synthetic */ ULANPayMonthlyDeselectedNotEmptyMessageEvent copy$default(ULANPayMonthlyDeselectedNotEmptyMessageEvent uLANPayMonthlyDeselectedNotEmptyMessageEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uLANPayMonthlyDeselectedNotEmptyMessageEvent.value;
        }
        return uLANPayMonthlyDeselectedNotEmptyMessageEvent.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final ULANPayMonthlyDeselectedNotEmptyMessageEvent copy(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new ULANPayMonthlyDeselectedNotEmptyMessageEvent(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ULANPayMonthlyDeselectedNotEmptyMessageEvent) && Intrinsics.areEqual(this.value, ((ULANPayMonthlyDeselectedNotEmptyMessageEvent) other).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ULANPayMonthlyDeselectedNotEmptyMessageEvent(value=" + this.value + ')';
    }
}
