package mu.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorMessageProducer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¨\u0006\b"}, d2 = {"Lmu/internal/ErrorMessageProducer;", "", "()V", "getErrorLog", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlin-logging"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class ErrorMessageProducer {
    public static final ErrorMessageProducer INSTANCE = new ErrorMessageProducer();

    private ErrorMessageProducer() {
    }

    public final String getErrorLog(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (System.getProperties().containsKey("kotlin-logging.throwOnMessageError")) {
            throw e;
        }
        return "Log message invocation failed: " + e;
    }
}
