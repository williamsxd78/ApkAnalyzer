package app.cash.sqldelight.db;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OptimisticLockException.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/cash/sqldelight/db/OptimisticLockException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OptimisticLockException extends IllegalStateException {
    public OptimisticLockException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ OptimisticLockException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
