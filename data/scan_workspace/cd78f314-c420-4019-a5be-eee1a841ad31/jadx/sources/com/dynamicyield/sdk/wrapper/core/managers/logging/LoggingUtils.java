package com.dynamicyield.sdk.wrapper.core.managers.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggingUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/managers/logging/LoggingUtils;", "", "<init>", "()V", "initLogMessage", "", "type", "sdkNotInitializedLogMessage", "functionName", "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoggingUtils {
    public static final int $stable = 0;
    public static final LoggingUtils INSTANCE = new LoggingUtils();

    private LoggingUtils() {
    }

    public final String initLogMessage(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type + " initialized";
    }

    public final String sdkNotInitializedLogMessage(String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return functionName + " Failed. SDK is not initialized";
    }
}
