package com.vivaaerobus.app.analytics.presentation.annotations.firebase;

import com.vivaaerobus.app.sharedPreferences.presentation.Keys;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: AnalyticsNameType.kt */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/firebase/AnalyticsNameType;", "", "Companion", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes3.dex */
public @interface AnalyticsNameType {
    public static final String CHANNEL_CLOSEST_AIRPORT = "channel_closest_airport";
    public static final String CHANNEL_COORDINATES = "channel_coordinates";
    public static final String CHANNEL_COUNTRY = "channel_country";
    public static final String CHANNEL_ID = "channel_id";
    public static final String CHANNEL_REGION = "channel_region";
    public static final String CLOSEST_BUS_STATION = "closest_bus_station";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String DEVICE_ID = "device_id";
    public static final String SESSION_ID = "session_id";
    public static final String USER_CUSTOMER_ID = "user_customer_id";
    public static final String USER_PROGRAMS = "user_programs";
    public static final String VIVA_ID = "viva_id";

    /* compiled from: AnalyticsNameType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/firebase/AnalyticsNameType$Companion;", "", "<init>", "()V", "USER_PROGRAMS", "", "USER_CUSTOMER_ID", "CHANNEL_ID", "CHANNEL_CLOSEST_AIRPORT", "CLOSEST_BUS_STATION", "CHANNEL_COUNTRY", "CHANNEL_REGION", "CHANNEL_COORDINATES", "DEVICE_ID", "VIVA_ID", Keys.SESSION_ID, "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String CHANNEL_CLOSEST_AIRPORT = "channel_closest_airport";
        public static final String CHANNEL_COORDINATES = "channel_coordinates";
        public static final String CHANNEL_COUNTRY = "channel_country";
        public static final String CHANNEL_ID = "channel_id";
        public static final String CHANNEL_REGION = "channel_region";
        public static final String CLOSEST_BUS_STATION = "closest_bus_station";
        public static final String DEVICE_ID = "device_id";
        public static final String SESSION_ID = "session_id";
        public static final String USER_CUSTOMER_ID = "user_customer_id";
        public static final String USER_PROGRAMS = "user_programs";
        public static final String VIVA_ID = "viva_id";

        private Companion() {
        }
    }
}
