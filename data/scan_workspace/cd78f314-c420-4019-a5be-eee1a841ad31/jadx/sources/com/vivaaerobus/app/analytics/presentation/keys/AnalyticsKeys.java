package com.vivaaerobus.app.analytics.presentation.keys;

import com.google.firebase.perf.FirebasePerformance;
import com.vivaaerobus.app.base.presentation.eventBus.AppEvent;
import kotlin.Metadata;

/* compiled from: AnalyticsKeys.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/keys/AnalyticsKeys;", "", "<init>", "()V", AppEvent.FLOW, "", AppEvent.SCREEN_NAME, AppEvent.ACTION, "ITEM_RUTE", "RESERVE_PNR", "SECTION", "ALERT_NAME", "FLIGHT_INFO_NAME", "LOGIN_TYPE", "ERROR_MESSAGE", "ERROR_TYPE", FirebasePerformance.HttpMethod.OPTIONS, "BALANCE", "AIRPORT_SEARCH_TERM", "TRIP_TYPE", "ORIGIN", "DESTINATION", "DEPARTURE_DATE", "SEAT_TYPE", "PROMO_CODE", "PAYMENT_METHOD", "VIVA_CASH", "PROMO_CODE_MONEY", "DOTERS_LEVEL", "DOTERS_BALANCE", "CURRENCY", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnalyticsKeys {
    public static final String ACTION = "action";
    public static final String AIRPORT_SEARCH_TERM = "airportSearchTerm";
    public static final String ALERT_NAME = "alert_name";
    public static final String BALANCE = "saldo";
    public static final String CURRENCY = "currency";
    public static final String DEPARTURE_DATE = "departure_date";
    public static final String DESTINATION = "destination";
    public static final String DOTERS_BALANCE = "doters_balance";
    public static final String DOTERS_LEVEL = "doters_level";
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String FLIGHT_INFO_NAME = "flight_info_name";
    public static final String FLOW = "flow";
    public static final AnalyticsKeys INSTANCE = new AnalyticsKeys();
    public static final String ITEM_RUTE = "item_rute";
    public static final String LOGIN_TYPE = "login_type";
    public static final String OPTIONS = "options";
    public static final String ORIGIN = "origin";
    public static final String PAYMENT_METHOD = "payment_method";
    public static final String PROMO_CODE = "promo_code";
    public static final String PROMO_CODE_MONEY = "promo_code_money";
    public static final String RESERVE_PNR = "reserve_pnr";
    public static final String SCREEN_NAME = "screenName";
    public static final String SEAT_TYPE = "seat_type";
    public static final String SECTION = "section";
    public static final String TRIP_TYPE = "trip_type";
    public static final String VIVA_CASH = "viva_cash";

    private AnalyticsKeys() {
    }
}
