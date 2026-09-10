package com.vivaaerobus.app.failureHandler;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Exception+Extension.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0006\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003\"\u0019\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"tag", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getTag", "(Ljava/lang/Exception;)Ljava/lang/String;", "message", "failureHandler"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Exception_ExtensionKt {
    public static final String getTag(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        String simpleName = exc.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public static final String message(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        String message = exc.getMessage();
        return message == null ? getTag(exc) : message;
    }
}
