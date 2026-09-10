package com.uplift.sdk.model.pub;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ULError.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/uplift/sdk/model/pub/ULError;", "", "type", "Lcom/uplift/sdk/model/pub/ULErrorType;", "message", "", "(Lcom/uplift/sdk/model/pub/ULErrorType;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getType", "()Lcom/uplift/sdk/model/pub/ULErrorType;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "", "hashCode", "", "toString", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ULError extends Throwable {
    private final String message;
    private final ULErrorType type;

    public ULError(ULErrorType type, String message) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.type = type;
        this.message = message;
    }

    public static /* synthetic */ ULError copy$default(ULError uLError, ULErrorType uLErrorType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uLErrorType = uLError.type;
        }
        if ((i & 2) != 0) {
            str = uLError.getMessage();
        }
        return uLError.copy(uLErrorType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ULErrorType getType() {
        return this.type;
    }

    public final String component2() {
        return getMessage();
    }

    public final ULError copy(ULErrorType type, String message) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ULError(type, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ULError)) {
            return false;
        }
        ULError uLError = (ULError) other;
        return this.type == uLError.type && Intrinsics.areEqual(getMessage(), uLError.getMessage());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final ULErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + getMessage().hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ULError(type=" + this.type + ", message=" + getMessage() + ')';
    }
}
