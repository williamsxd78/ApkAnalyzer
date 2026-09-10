package com.vivaaerobus.app.extension;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Locale+Extension.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isSpanish", "", "Ljava/util/Locale;", "extension"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Locale_ExtensionKt {
    public static final boolean isSpanish(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        return Intrinsics.areEqual(locale.getLanguage(), "es");
    }
}
