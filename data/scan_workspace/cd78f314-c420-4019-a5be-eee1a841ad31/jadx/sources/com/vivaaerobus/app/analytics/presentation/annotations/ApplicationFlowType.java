package com.vivaaerobus.app.analytics.presentation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: ApplicationFlowType.kt */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/ApplicationFlowType;", "", "Companion", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes3.dex */
public @interface ApplicationFlowType {
    public static final String BAGGAGE = "baggage";
    public static final String BOOKER = "booker";
    public static final String BOOKING = "booking";
    public static final String CHECK_IN = "checkin";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String DOTERS = "doters";
    public static final String FLIGHT_STATUS = "flight_status";
    public static final String HOME = "home";
    public static final String MY_TRIPS = "my_trips";
    public static final String PAYMENT = "payment";
    public static final String PROFILE = "profile";
    public static final String RESERVATION = "reservacion";
    public static final String SEATS = "seats";
    public static final String TERMINAL_MAPS = "terminal_maps";

    /* compiled from: ApplicationFlowType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/ApplicationFlowType$Companion;", "", "<init>", "()V", "PROFILE", "", "MY_TRIPS", "CHECK_IN", "HOME", "FLIGHT_STATUS", "PAYMENT", "SEATS", "BOOKER", "BAGGAGE", "RESERVATION", "DOTERS", "BOOKING", "TERMINAL_MAPS", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String BAGGAGE = "baggage";
        public static final String BOOKER = "booker";
        public static final String BOOKING = "booking";
        public static final String CHECK_IN = "checkin";
        public static final String DOTERS = "doters";
        public static final String FLIGHT_STATUS = "flight_status";
        public static final String HOME = "home";
        public static final String MY_TRIPS = "my_trips";
        public static final String PAYMENT = "payment";
        public static final String PROFILE = "profile";
        public static final String RESERVATION = "reservacion";
        public static final String SEATS = "seats";
        public static final String TERMINAL_MAPS = "terminal_maps";

        private Companion() {
        }
    }
}
