package com.inmobile.uba;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/inmobile/uba/UbaErrorConstants;", "", "()V", "E60001", "", "E60001_CAUSE", "E60001_MESSAGE", "E60002", "E60002_CAUSE", "E60002_MESSAGE", "E60003", "E60003_CAUSE", "E60003_MESSAGE", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class UbaErrorConstants {
    public static final String E60001 = "60001";
    public static final String E60001_CAUSE = "Device is not registered. Please ensure InMobile is registered before using Uba.";
    public static final String E60001_MESSAGE = "INMOBILE_SDK_NOT_REGISTERED";
    public static final String E60002 = "60002";
    public static final String E60002_CAUSE = "Uba is not provisioned for the SDK";
    public static final String E60002_MESSAGE = "SDK_LICENSE: UBA_NOT_PROVISIONED";
    public static final String E60003 = "60003";
    public static final String E60003_CAUSE = "Uba URL not set. Please add Uba URL to the manifest.";
    public static final String E60003_MESSAGE = "UBA_URL_NOT_SET";
    public static final UbaErrorConstants INSTANCE;

    /* renamed from: Э042DЭЭ042DЭЭ, reason: contains not printable characters */
    public static int f3165042D042D = 2;

    /* renamed from: ЭЭ042D042DЭЭЭ, reason: contains not printable characters */
    public static int f3166042D042D = 88;

    static {
        UbaErrorConstants ubaErrorConstants = new UbaErrorConstants();
        if (((f3166042D042D + m13901042D()) * f3166042D042D) % f3165042D042D != m13899042D042D042D()) {
            f3166042D042D = m13900042D042D();
            f3165042D042D = 44;
        }
        INSTANCE = ubaErrorConstants;
    }

    private UbaErrorConstants() {
    }

    /* renamed from: Э042D042D042DЭЭЭ, reason: contains not printable characters */
    public static int m13899042D042D042D() {
        return 0;
    }

    /* renamed from: ЭЭ042DЭ042DЭЭ, reason: contains not printable characters */
    public static int m13900042D042D() {
        return 51;
    }

    /* renamed from: ЭЭЭЭ042DЭЭ, reason: contains not printable characters */
    public static int m13901042D() {
        return 1;
    }
}
