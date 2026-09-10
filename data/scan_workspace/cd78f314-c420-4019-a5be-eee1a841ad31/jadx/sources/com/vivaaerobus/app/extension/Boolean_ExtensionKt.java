package com.vivaaerobus.app.extension;

import kotlin.Metadata;

/* compiled from: Boolean+Extension.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"orFalse", "", "(Ljava/lang/Boolean;)Z", "orTrue", "extension"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Boolean_ExtensionKt {
    public static final boolean orFalse(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean orTrue(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
