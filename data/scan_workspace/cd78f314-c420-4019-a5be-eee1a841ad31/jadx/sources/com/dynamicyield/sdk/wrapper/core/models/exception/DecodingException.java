package com.dynamicyield.sdk.wrapper.core.models.exception;

import kotlin.Metadata;

/* compiled from: DecodingException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/models/exception/DecodingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sourceException", "<init>", "(Ljava/lang/Exception;)V", "getSourceException", "()Ljava/lang/Exception;", "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public class DecodingException extends Exception {
    public static final int $stable = 8;
    private final Exception sourceException;

    public DecodingException(Exception exc) {
        super((exc == null || (r0 = exc.getLocalizedMessage()) == null) ? "DY SDK has encountered an error during body decoding" : r0);
        String localizedMessage;
        this.sourceException = exc;
    }

    public final Exception getSourceException() {
        return this.sourceException;
    }
}
