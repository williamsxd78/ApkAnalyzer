package com.uplift.sdk.logger;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.logging.Level;
import kotlin.Metadata;

/* compiled from: UpliftLogger.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/uplift/sdk/logger/UpliftLogger;", "", "log", "", FirebaseAnalytics.Param.LEVEL, "Ljava/util/logging/Level;", "message", "", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface UpliftLogger {
    void log(Level level, String message);
}
