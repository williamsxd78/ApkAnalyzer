package com.vivaaerobus.app.analytics.presentation.annotations.braze;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: BrazeEventType.kt */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/braze/BrazeEventType;", "", "Companion", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes3.dex */
public @interface BrazeEventType {
    public static final String ADD_TRIP = "add_trip";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String FLIGHT_STATUS_DETAIL = "flight_status_detail";
    public static final String FORGOT_PASSWORD = "forgot_password";
    public static final String GET_BOARDING_PASS = "get_boardingpass";
    public static final String LOGIN_ACCOUNT = "login_account";
    public static final String PAYMENT_SUCCESSFUL = "payment_successful";
    public static final String PAY_TUA = "pay_TUA";
    public static final String SCREEN_VIEW_BOOKING_SEARCH = "screen_view_booking_search";
    public static final String SCREEN_VIEW_CHECK_IN_CONFIRMATION = "screen_view_checkin_confirmation";
    public static final String SCREEN_VIEW_FLIGHT_STATUS = "screen_view_flight_status";
    public static final String SCREEN_VIEW_FLIGHT_STATUS_RESULTS = "screen_view_flight_status_results";
    public static final String SCREEN_VIEW_HOME = "screen_view_home";
    public static final String SCREEN_VIEW_LOGIN = "screen_view_login";
    public static final String SCREEN_VIEW_MY_TRIPS = "screen_view_my_trips";
    public static final String SCREEN_VIEW_PAYMENT_CONFIRMATION = "screen_view_payment_confirmation";
    public static final String SCREEN_VIEW_TRIP_DETAILS = "screen_view_my_trip_details";
    public static final String SCREEN_VIEW_USER_PROFILE = "screen_view_user_profile";
    public static final String TOGGLE_APP_NOTIFICATION = "toggle_app_notification";

    /* compiled from: BrazeEventType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/braze/BrazeEventType$Companion;", "", "<init>", "()V", "LOGIN_ACCOUNT", "", "FORGOT_PASSWORD", "GET_BOARDING_PASS", "ADD_TRIP", "PAY_TUA", "SCREEN_VIEW_FLIGHT_STATUS", "SCREEN_VIEW_FLIGHT_STATUS_RESULTS", "SCREEN_VIEW_BOOKING_SEARCH", "SCREEN_VIEW_TRIP_DETAILS", "SCREEN_VIEW_HOME", "SCREEN_VIEW_MY_TRIPS", "SCREEN_VIEW_LOGIN", "SCREEN_VIEW_USER_PROFILE", "SCREEN_VIEW_PAYMENT_CONFIRMATION", "SCREEN_VIEW_CHECK_IN_CONFIRMATION", "PAYMENT_SUCCESSFUL", "FLIGHT_STATUS_DETAIL", "TOGGLE_APP_NOTIFICATION", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ADD_TRIP = "add_trip";
        public static final String FLIGHT_STATUS_DETAIL = "flight_status_detail";
        public static final String FORGOT_PASSWORD = "forgot_password";
        public static final String GET_BOARDING_PASS = "get_boardingpass";
        public static final String LOGIN_ACCOUNT = "login_account";
        public static final String PAYMENT_SUCCESSFUL = "payment_successful";
        public static final String PAY_TUA = "pay_TUA";
        public static final String SCREEN_VIEW_BOOKING_SEARCH = "screen_view_booking_search";
        public static final String SCREEN_VIEW_CHECK_IN_CONFIRMATION = "screen_view_checkin_confirmation";
        public static final String SCREEN_VIEW_FLIGHT_STATUS = "screen_view_flight_status";
        public static final String SCREEN_VIEW_FLIGHT_STATUS_RESULTS = "screen_view_flight_status_results";
        public static final String SCREEN_VIEW_HOME = "screen_view_home";
        public static final String SCREEN_VIEW_LOGIN = "screen_view_login";
        public static final String SCREEN_VIEW_MY_TRIPS = "screen_view_my_trips";
        public static final String SCREEN_VIEW_PAYMENT_CONFIRMATION = "screen_view_payment_confirmation";
        public static final String SCREEN_VIEW_TRIP_DETAILS = "screen_view_my_trip_details";
        public static final String SCREEN_VIEW_USER_PROFILE = "screen_view_user_profile";
        public static final String TOGGLE_APP_NOTIFICATION = "toggle_app_notification";

        private Companion() {
        }
    }
}
