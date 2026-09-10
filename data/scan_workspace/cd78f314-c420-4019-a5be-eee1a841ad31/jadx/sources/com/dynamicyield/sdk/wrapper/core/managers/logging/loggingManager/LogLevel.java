package com.dynamicyield.sdk.wrapper.core.managers.logging.loggingManager;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/managers/logging/loggingManager/LogLevel;", "", "", FirebaseAnalytics.Param.LEVEL, "", "<init>", "(Ljava/lang/String;II)V", "getLevel", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT", "OFF", "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LogLevel implements Comparable<LogLevel> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    private final int level;
    public static final LogLevel VERBOSE = new LogLevel("VERBOSE", 0, 2);
    public static final LogLevel DEBUG = new LogLevel("DEBUG", 1, 3);
    public static final LogLevel INFO = new LogLevel("INFO", 2, 4);
    public static final LogLevel WARN = new LogLevel("WARN", 3, 5);
    public static final LogLevel ERROR = new LogLevel("ERROR", 4, 6);
    public static final LogLevel ASSERT = new LogLevel("ASSERT", 5, 7);
    public static final LogLevel OFF = new LogLevel("OFF", 6, 8);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT, OFF};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LogLevel(String str, int i, int i2) {
        this.level = i2;
    }

    public static EnumEntries<LogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    public final int getLevel() {
        return this.level;
    }
}
