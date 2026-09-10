package com.yuno.payments.base.extensions;

import kotlin.Metadata;

/* compiled from: NullableExtension.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"orZero", "", "(Ljava/lang/Long;)J", "Yuno_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NullableExtensionKt {
    public static final long orZero(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
