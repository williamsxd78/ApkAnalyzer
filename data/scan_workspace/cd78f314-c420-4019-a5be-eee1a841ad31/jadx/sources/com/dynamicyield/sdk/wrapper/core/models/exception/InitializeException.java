package com.dynamicyield.sdk.wrapper.core.models.exception;

import kotlin.Metadata;

/* compiled from: InitializeException.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/models/exception/InitializeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isInitialize", "", "<init>", "(Z)V", "message", "", "getMessage", "()Ljava/lang/String;", "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InitializeException extends Exception {
    public static final int $stable = 8;
    private final String message;

    public InitializeException(boolean z) {
        super(z ? "DYSdk is already initialized" : "DYSdk is not initialized");
        this.message = z ? "DYSdk is already initialized" : "DYSdk is not initialized";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
