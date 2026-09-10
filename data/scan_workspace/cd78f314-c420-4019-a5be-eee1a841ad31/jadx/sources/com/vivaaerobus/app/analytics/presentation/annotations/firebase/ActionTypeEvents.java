package com.vivaaerobus.app.analytics.presentation.annotations.firebase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: ActionTypeEvents.kt */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/firebase/ActionTypeEvents;", "", "Companion", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes3.dex */
public @interface ActionTypeEvents {
    public static final String ACCEPT_TYC = "accept_tyc";
    public static final String BOOKING_BAGGAGE = "booking_baggage";
    public static final String BOOKING_CALENDAR = "booking_calendar";
    public static final String BOOKING_CHECKOUT = "booking_checkout";
    public static final String BOOKING_COMPLETE_PAYMENT_INFO = "booking_complete_payment_info";
    public static final String BOOKING_EXTRAS = "booking_extras";
    public static final String BOOKING_FLIGHT_OPTIONS = "booking_flight_options";
    public static final String BOOKING_HAND_BAGGAGE = "booking_hand_baggage";
    public static final String BOOKING_ITINERARY = "booking_itinerary";
    public static final String BOOKING_MODALITY_OPTIONS = "booking_modality_options";
    public static final String BOOKING_NO_AVAILABILITY = "booking_no_availability";
    public static final String BOOKING_PAYMENT_INFO = "booking_payment_info";
    public static final String BOOKING_SEATMAP = "booking_seatmap";
    public static final String BOOKING_SEAT_SELECTION = "booking_seat_selection";
    public static final String BOOKING_UNACCOMPANIED_MINOR = "booking_unaccompanied_minor";
    public static final String CLICK_CANCEL_EXIT = "click_cancel_exit";
    public static final String CLICK_FILTER_DIRECT_FLIGHTS = "click_filter_direct_flights";
    public static final String CLICK_FILTER_EVENING_FLIGHTS = "click_filter_evening_flights";
    public static final String CLICK_SORT_DEPARTURE_TIME = "click_sort_departure_time";
    public static final String CLICK_SORT_FLIGHT_TIME = "click_sort_flight_time";
    public static final String CLICK_SORT_PRICE = "click_sort_price";
    public static final String CLICK_SORT_RECOMMENDED_FLIGHTS = "click_sort_recommended_flights";
    public static final String CLICK_TOGGLE_BOTH_FLIGHTS = "click_toggle_both_flights";
    public static final String CLOSE = "close";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String MMB_FLIGHT_CHANGE_FLIGHT_OPTIONS = "mmb_flight_change_flight_options";
    public static final String NO_AVAILABILITY = "no_availability";

    /* compiled from: ActionTypeEvents.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/firebase/ActionTypeEvents$Companion;", "", "<init>", "()V", "NO_AVAILABILITY", "", "BOOKING_UNACCOMPANIED_MINOR", "BOOKING_CALENDAR", "BOOKING_NO_AVAILABILITY", "BOOKING_FLIGHT_OPTIONS", "MMB_FLIGHT_CHANGE_FLIGHT_OPTIONS", "BOOKING_MODALITY_OPTIONS", "BOOKING_ITINERARY", "BOOKING_CHECKOUT", "BOOKING_BAGGAGE", "BOOKING_HAND_BAGGAGE", "BOOKING_EXTRAS", "BOOKING_SEATMAP", "BOOKING_SEAT_SELECTION", "BOOKING_PAYMENT_INFO", "BOOKING_COMPLETE_PAYMENT_INFO", "CLICK_FILTER_DIRECT_FLIGHTS", "CLICK_FILTER_EVENING_FLIGHTS", "CLICK_SORT_RECOMMENDED_FLIGHTS", "CLICK_SORT_DEPARTURE_TIME", "CLICK_SORT_PRICE", "CLICK_SORT_FLIGHT_TIME", "CLICK_CANCEL_EXIT", "CLICK_TOGGLE_BOTH_FLIGHTS", "ACCEPT_TYC", "CLOSE", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ACCEPT_TYC = "accept_tyc";
        public static final String BOOKING_BAGGAGE = "booking_baggage";
        public static final String BOOKING_CALENDAR = "booking_calendar";
        public static final String BOOKING_CHECKOUT = "booking_checkout";
        public static final String BOOKING_COMPLETE_PAYMENT_INFO = "booking_complete_payment_info";
        public static final String BOOKING_EXTRAS = "booking_extras";
        public static final String BOOKING_FLIGHT_OPTIONS = "booking_flight_options";
        public static final String BOOKING_HAND_BAGGAGE = "booking_hand_baggage";
        public static final String BOOKING_ITINERARY = "booking_itinerary";
        public static final String BOOKING_MODALITY_OPTIONS = "booking_modality_options";
        public static final String BOOKING_NO_AVAILABILITY = "booking_no_availability";
        public static final String BOOKING_PAYMENT_INFO = "booking_payment_info";
        public static final String BOOKING_SEATMAP = "booking_seatmap";
        public static final String BOOKING_SEAT_SELECTION = "booking_seat_selection";
        public static final String BOOKING_UNACCOMPANIED_MINOR = "booking_unaccompanied_minor";
        public static final String CLICK_CANCEL_EXIT = "click_cancel_exit";
        public static final String CLICK_FILTER_DIRECT_FLIGHTS = "click_filter_direct_flights";
        public static final String CLICK_FILTER_EVENING_FLIGHTS = "click_filter_evening_flights";
        public static final String CLICK_SORT_DEPARTURE_TIME = "click_sort_departure_time";
        public static final String CLICK_SORT_FLIGHT_TIME = "click_sort_flight_time";
        public static final String CLICK_SORT_PRICE = "click_sort_price";
        public static final String CLICK_SORT_RECOMMENDED_FLIGHTS = "click_sort_recommended_flights";
        public static final String CLICK_TOGGLE_BOTH_FLIGHTS = "click_toggle_both_flights";
        public static final String CLOSE = "close";
        public static final String MMB_FLIGHT_CHANGE_FLIGHT_OPTIONS = "mmb_flight_change_flight_options";
        public static final String NO_AVAILABILITY = "no_availability";

        private Companion() {
        }
    }
}
