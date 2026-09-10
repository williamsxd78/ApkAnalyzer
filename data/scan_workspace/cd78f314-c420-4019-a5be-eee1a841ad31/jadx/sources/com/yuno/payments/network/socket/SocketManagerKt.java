package com.yuno.payments.network.socket;

import kotlin.Metadata;

/* compiled from: SocketManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"CONN_MAX_NUM", "", "CREATE_SOCKET_REASON", "", "ENROLLMENT_SOCKET_ENDPOINT", "ON_PAUSE_REASON", "PAYMENT_SOCKET_ENDPOINT", "PING_INTERVAL", "", "SOCKET_URL_DEV_ENV", "SOCKET_URL_PROD_ENV", "SOCKET_URL_SANDBOX_ENV", "SOCKET_URL_STAGE_ENV", "Yuno_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SocketManagerKt {
    public static final int CONN_MAX_NUM = 2;
    private static final String CREATE_SOCKET_REASON = "Creating new socket";
    private static final String ENROLLMENT_SOCKET_ENDPOINT = "/enrollment";
    public static final String ON_PAUSE_REASON = "On pause activity";
    private static final String PAYMENT_SOCKET_ENDPOINT = "/payment";
    private static final long PING_INTERVAL = 25;
    private static final String SOCKET_URL_DEV_ENV = "wss://dev.y.uno/checkout-websocket-notification-ms/ws";
    private static final String SOCKET_URL_PROD_ENV = "wss://prod.y.uno/checkout-websocket-notification-ms/ws";
    private static final String SOCKET_URL_SANDBOX_ENV = "wss://sandbox.y.uno/checkout-websocket-notification-ms/ws";
    private static final String SOCKET_URL_STAGE_ENV = "wss://staging.y.uno/checkout-websocket-notification-ms/ws";
}
