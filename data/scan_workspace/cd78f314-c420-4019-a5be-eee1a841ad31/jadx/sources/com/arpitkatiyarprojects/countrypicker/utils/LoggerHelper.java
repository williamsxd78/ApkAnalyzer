package com.arpitkatiyarprojects.countrypicker.utils;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggerHelper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/arpitkatiyarprojects/countrypicker/utils/LoggerHelper;", "", "<init>", "()V", "LOG_TAG", "", "logError", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "CountryPicker_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoggerHelper {
    public static final int $stable = 0;
    public static final LoggerHelper INSTANCE = new LoggerHelper();
    private static final String LOG_TAG = "CountryPicker";

    private LoggerHelper() {
    }

    public final void logError(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Log.e(LOG_TAG, exception.getMessage(), exception);
    }
}
