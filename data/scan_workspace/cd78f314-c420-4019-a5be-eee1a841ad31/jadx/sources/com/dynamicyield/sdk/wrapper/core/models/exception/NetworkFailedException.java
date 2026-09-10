package com.dynamicyield.sdk.wrapper.core.models.exception;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* compiled from: NetworkFailedException.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/models/exception/NetworkFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "url", "", "code", "", "networkMessage", TtmlNode.TAG_BODY, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNetworkMessage", "getBody", "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NetworkFailedException extends Exception {
    public static final int $stable = 8;
    private final String body;
    private final Integer code;
    private final String networkMessage;
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NetworkFailedException(java.lang.String r4, java.lang.Integer r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request for url: "
            r0.<init>(r1)
            java.lang.String r1 = "unknown"
            if (r4 != 0) goto Ld
            r2 = r1
            goto Le
        Ld:
            r2 = r4
        Le:
            r0.append(r2)
            java.lang.String r2 = " failed with code "
            r0.append(r2)
            if (r5 == 0) goto L1e
            java.lang.String r2 = r5.toString()
            if (r2 != 0) goto L1f
        L1e:
            r2 = r1
        L1f:
            r0.append(r2)
            java.lang.String r2 = ". Response data: "
            r0.append(r2)
            r2 = r7
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L34
            int r2 = r2.length()
            if (r2 != 0) goto L33
            goto L34
        L33:
            r1 = r7
        L34:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r3.url = r4
            r3.code = r5
            r3.networkMessage = r6
            r3.body = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamicyield.sdk.wrapper.core.models.exception.NetworkFailedException.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    public final String getBody() {
        return this.body;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getNetworkMessage() {
        return this.networkMessage;
    }

    public final String getUrl() {
        return this.url;
    }
}
