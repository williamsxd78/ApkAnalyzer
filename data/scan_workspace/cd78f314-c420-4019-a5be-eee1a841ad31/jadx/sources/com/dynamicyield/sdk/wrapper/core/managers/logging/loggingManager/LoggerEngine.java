package com.dynamicyield.sdk.wrapper.core.managers.logging.loggingManager;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* compiled from: LoggerEngine.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/managers/logging/loggingManager/LoggerEngine;", "", "logLevel", "Lcom/dynamicyield/sdk/wrapper/core/managers/logging/loggingManager/LogLevel;", "getLogLevel", "()Lcom/dynamicyield/sdk/wrapper/core/managers/logging/loggingManager/LogLevel;", "setLogLevel", "(Lcom/dynamicyield/sdk/wrapper/core/managers/logging/loggingManager/LogLevel;)V", "dispatchLog", "", "tag", "", "string", FirebaseAnalytics.Param.LEVEL, "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface LoggerEngine {
    void dispatchLog(String tag, String string, LogLevel level);

    LogLevel getLogLevel();

    void setLogLevel(LogLevel logLevel);
}
