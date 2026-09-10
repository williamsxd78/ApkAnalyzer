package com.tealium.core;

import com.vivaaerobus.app.BuildConfig;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/tealium/core/Environment;", "", "", "a", "Ljava/lang/String;", "getEnvironment", "()Ljava/lang/String;", "environment", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "DEV", "QA", BuildConfig.QUANTUM_METRIC_ENVIRONMENT, "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public enum Environment {
    DEV("dev"),
    QA("qa"),
    PROD(com.vivaaerobus.app.httpclient.BuildConfig.VIVA_CASH_ENVIRONMENT);


    /* renamed from: a, reason: from kotlin metadata */
    private final String environment;

    Environment(String str) {
        this.environment = str;
    }

    public final String getEnvironment() {
        return this.environment;
    }
}
