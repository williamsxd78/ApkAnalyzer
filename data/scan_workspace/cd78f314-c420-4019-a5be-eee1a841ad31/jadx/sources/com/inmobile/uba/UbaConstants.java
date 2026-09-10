package com.inmobile.uba;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/inmobile/uba/UbaConstants;", "", "()V", "UBA_CLEAR_EVENTS_AFTER_METADATA_TAG", "", "UBA_SEND_INTERVAL_METADATA_TAG", "UBA_URL_METADATA_TAG", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class UbaConstants {
    public static final UbaConstants INSTANCE;
    public static final String UBA_CLEAR_EVENTS_AFTER_METADATA_TAG = "com.inmobile.uba.clear_events_after";
    public static final String UBA_SEND_INTERVAL_METADATA_TAG = "com.inmobile.uba.send_interval";
    public static final String UBA_URL_METADATA_TAG = "com.inmobile.uba.server_url";

    /* renamed from: ЭЭ042DЭЭЭЭ, reason: contains not printable characters */
    public static int f3162042D = 2;

    /* renamed from: ЭЭЭ042DЭЭЭ, reason: contains not printable characters */
    public static int f3163042D = 1;

    /* renamed from: ѪѪ046A046A046A046A046A, reason: contains not printable characters */
    public static int f3164046A046A046A046A046A = 8;

    static {
        int i = f3164046A046A046A046A046A;
        if (((f3163042D + i) * i) % m13897042D042D() != 0) {
            f3164046A046A046A046A046A = m13896042D042D();
            f3163042D = 14;
        }
        if ((i * (m13898042D() + i)) % f3162042D != 0) {
            f3164046A046A046A046A046A = m13896042D042D();
            f3162042D = m13896042D042D();
        }
        INSTANCE = new UbaConstants();
    }

    private UbaConstants() {
    }

    /* renamed from: Э042D042DЭЭЭЭ, reason: contains not printable characters */
    public static int m13896042D042D() {
        return 31;
    }

    /* renamed from: Э042DЭ042DЭЭЭ, reason: contains not printable characters */
    public static int m13897042D042D() {
        return 2;
    }

    /* renamed from: Э042DЭЭЭЭЭ, reason: contains not printable characters */
    public static int m13898042D() {
        return 1;
    }
}
