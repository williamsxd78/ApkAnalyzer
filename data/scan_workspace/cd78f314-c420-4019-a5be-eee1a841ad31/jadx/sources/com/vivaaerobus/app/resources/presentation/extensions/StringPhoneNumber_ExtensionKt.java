package com.vivaaerobus.app.resources.presentation.extensions;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringPhoneNumber+Extension.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getSimCountryIso", "", "context", "Landroid/content/Context;", "resources_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StringPhoneNumber_ExtensionKt {
    public static final String getSimCountryIso(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
        Intrinsics.checkNotNullExpressionValue(simCountryIso, "getSimCountryIso(...)");
        return simCountryIso;
    }
}
