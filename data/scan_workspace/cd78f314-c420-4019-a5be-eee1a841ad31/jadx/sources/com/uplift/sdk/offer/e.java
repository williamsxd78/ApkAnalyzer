package com.uplift.sdk.offer;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;

/* compiled from: ULPMMessageTitleType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/uplift/sdk/offer/e;", "", "", "typeFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Ljava/lang/String;", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public enum e {
    ULPMButtonTitleTypeShort("From $%.2f/month"),
    ULPMButtonTitleTypeLong("Pay Monthly from $%.2f/month");


    /* renamed from: a, reason: from kotlin metadata */
    private final String typeFormat;

    e(String str) {
        this.typeFormat = str;
    }

    /* renamed from: b, reason: from getter */
    public final String getTypeFormat() {
        return this.typeFormat;
    }
}
