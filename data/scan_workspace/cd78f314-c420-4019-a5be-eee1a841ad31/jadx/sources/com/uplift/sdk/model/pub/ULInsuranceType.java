package com.uplift.sdk.model.pub;

import com.tealium.core.persistence.i0;
import com.vivaaerobus.app.navigation.links.LinksConstants;
import kotlin.Metadata;

/* compiled from: ULInsuranceType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/uplift/sdk/model/pub/ULInsuranceType;", "", i0.a.b, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey$upliftsdk_plainRelease", "()Ljava/lang/String;", "Cancellation", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public enum ULInsuranceType {
    Cancellation(LinksConstants.CANCELLATION_PATH);

    private final String key;

    ULInsuranceType(String str) {
        this.key = str;
    }

    /* renamed from: getKey$upliftsdk_plainRelease, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
