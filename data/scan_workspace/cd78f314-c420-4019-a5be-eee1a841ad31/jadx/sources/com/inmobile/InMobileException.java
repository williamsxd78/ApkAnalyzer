package com.inmobile;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0004J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/inmobile/InMobileException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "errorCode", "cause", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "getDeviceDescription", "getJsonString", "prependCode", "prependCode$sse_fullNormalRelease", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class InMobileException extends Exception {

    /* renamed from: ДДД0414ДД0414, reason: contains not printable characters */
    private String f19504140414;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobileException(String message, String errorCode, String cause) {
        super(message, new Throwable(cause));
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f19504140414 = errorCode;
    }

    /* renamed from: О041E041E041EОО041E, reason: contains not printable characters */
    public static int m11070041E041E041E041E() {
        return 0;
    }

    /* renamed from: О041EО041EОО041E, reason: contains not printable characters */
    public static int m11071041E041E041E() {
        return 1;
    }

    /* renamed from: ОО041E041EОО041E, reason: contains not printable characters */
    public static int m11072041E041E041E() {
        return 2;
    }

    /* renamed from: ООО041EОО041E, reason: contains not printable characters */
    public static int m11073041E041E() {
        return 70;
    }

    public final String getDeviceDescription() {
        StringBuilder sb = new StringBuilder();
        int m11073041E041E = m11073041E041E();
        int m11071041E041E041E = (m11073041E041E * (m11071041E041E041E() + m11073041E041E)) % m11072041E041E041E();
        sb.append("\"InMobileSDK\": \"10.7.1\", \"manufacturer\": \"");
        sb.append(Build.MANUFACTURER);
        sb.append("\", \"model\": \"");
        String str = Build.MODEL;
        int m11073041E041E2 = ((m11073041E041E() + m11071041E041E041E()) * m11073041E041E()) % m11072041E041E041E();
        m11070041E041E041E041E();
        sb.append(str);
        sb.append("\", \"androidOS\": \"");
        sb.append(Build.VERSION.SDK_INT);
        sb.append('\"');
        return sb.toString();
    }

    public final String getErrorCode() {
        int m11073041E041E = m11073041E041E();
        int m11071041E041E041E = (m11073041E041E * (m11071041E041E041E() + m11073041E041E)) % m11072041E041E041E();
        return this.f19504140414;
    }

    public final String getJsonString() {
        Throwable cause;
        if (((m11073041E041E() + m11071041E041E041E()) * m11073041E041E()) % m11072041E041E041E() != m11070041E041E041E041E()) {
            int m11073041E041E = m11073041E041E();
            int m11071041E041E041E = (m11073041E041E * (m11071041E041E041E() + m11073041E041E)) % m11072041E041E041E();
        }
        String str = null;
        if (getCause() != null && (cause = getCause()) != null) {
            str = cause.getMessage();
        }
        return "{\"InMobileException\": {\"message\": \"" + getMessage() + "\", \"errorCode\": \"" + this.f19504140414 + "\", \"cause\": \"" + str + "\", \"deviceInfo\": {" + getDeviceDescription() + "}}}";
    }

    public final InMobileException prependCode$sse_fullNormalRelease(String errorCode) {
        int m11073041E041E = m11073041E041E();
        if ((m11073041E041E * (m11071041E041E041E() + m11073041E041E)) % m11072041E041E041E() != 0) {
            int m11073041E041E2 = m11073041E041E();
            int m11071041E041E041E = (m11073041E041E2 * (m11071041E041E041E() + m11073041E041E2)) % m11072041E041E041E();
        }
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f19504140414.length() <= 0) {
            this.f19504140414 = errorCode;
            return this;
        }
        this.f19504140414 = errorCode + ' ' + this.f19504140414;
        return this;
    }

    public final void setErrorCode(String str) {
        int m11073041E041E = m11073041E041E();
        int m11071041E041E041E = (m11073041E041E * (m11071041E041E041E() + m11073041E041E)) % m11072041E041E041E();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f19504140414 = str;
        int m11073041E041E2 = ((m11073041E041E() + m11071041E041E041E()) * m11073041E041E()) % m11072041E041E041E();
        m11070041E041E041E041E();
    }
}
