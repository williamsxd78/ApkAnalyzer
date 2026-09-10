package com.vivaaerobus.app.httpclient.constans;

import kotlin.Metadata;

/* compiled from: ServerErrorCodes.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vivaaerobus/app/httpclient/constans/ServerErrorCodes;", "", "<init>", "()V", "BASKET_PASSIVE_CODE", "", "CHECK_IN_SEATS_ASSIGNMENT_FAILED", ServerErrorCodes.GENERIC_VALIDATION_ERROR, ServerErrorCodes.INVALID_REQUEST, ServerErrorCodes.ACCOUNT_TRAVEL_DOCUMENT_ALREADY_ADDED, "httpClient_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServerErrorCodes {
    public static final String ACCOUNT_TRAVEL_DOCUMENT_ALREADY_ADDED = "ACCOUNT_TRAVEL_DOCUMENT_ALREADY_ADDED";
    public static final String BASKET_PASSIVE_CODE = "BASKET_PASSIVE";
    public static final String CHECK_IN_SEATS_ASSIGNMENT_FAILED = "CHECKIN_SEATS_ASSIGNMENT_FAILED";
    public static final String GENERIC_VALIDATION_ERROR = "GENERIC_VALIDATION_ERROR";
    public static final ServerErrorCodes INSTANCE = new ServerErrorCodes();
    public static final String INVALID_REQUEST = "INVALID_REQUEST";

    private ServerErrorCodes() {
    }
}
