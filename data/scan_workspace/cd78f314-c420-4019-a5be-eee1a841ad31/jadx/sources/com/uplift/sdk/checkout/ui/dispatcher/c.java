package com.uplift.sdk.checkout.ui.dispatcher;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckoutWebDispatcher.kt */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/uplift/sdk/checkout/ui/dispatcher/c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Ljava/lang/String;", "script", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final /* data */ class c {

    /* renamed from: a, reason: from kotlin metadata */
    private final String script;

    /* renamed from: b, reason: from kotlin metadata */
    private final String result;

    public c(String script, String str) {
        Intrinsics.checkNotNullParameter(script, "script");
        this.script = script;
        this.result = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: b, reason: from getter */
    public final String getScript() {
        return this.script;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Intrinsics.areEqual(this.script, cVar.script) && Intrinsics.areEqual(this.result, cVar.result);
    }

    public int hashCode() {
        int hashCode = this.script.hashCode() * 31;
        String str = this.result;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ScriptResult(script=" + this.script + ", result=" + this.result + ')';
    }
}
