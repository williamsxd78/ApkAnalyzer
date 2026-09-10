package com.vivaaerobus.app.myTrips.presentation.common;

import kotlin.Metadata;

/* compiled from: MyTripsMessageTags.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/vivaaerobus/app/myTrips/presentation/common/MyTripsMessageTags;", "", "<init>", "()V", MyTripsMessageTags.INVALID_BOOKING_PARAMS, "", "APP_ERROR_MINIMUM_LASTNAME", "APP_ERROR_MAXIMUM_LASTNAME", "APP_ERROR_FORMAT_NAME", "APP_ERROR_PNR_INCORRECT", "APP_ALERT_SR_DELAY_MYTRIPS", "APP_ALERT_SR_CANCELLED_MYTRIPS", "nextTripsMessageTags", "", "getNextTripsMessageTags", "()[Ljava/lang/String;", "[Ljava/lang/String;", "myTrips_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MyTripsMessageTags {
    public static final String APP_ALERT_SR_DELAY_MYTRIPS = "APP_ALERT_SR_DELAY-MYTRIPS";
    public static final String APP_ERROR_FORMAT_NAME = "APP_ERROR_FORMAT-NAME";
    public static final String APP_ERROR_MAXIMUM_LASTNAME = "APP_ERROR_MAXIMUM-LASTNAME";
    public static final String APP_ERROR_MINIMUM_LASTNAME = "APP_ERROR_MINIMUM-LASTNAME";
    public static final String INVALID_BOOKING_PARAMS = "INVALID_BOOKING_PARAMS";
    public static final MyTripsMessageTags INSTANCE = new MyTripsMessageTags();
    public static final String APP_ERROR_PNR_INCORRECT = "APP_ERROR_PNR-INCORRECT";
    public static final String APP_ALERT_SR_CANCELLED_MYTRIPS = "APP_ALERT_SR_CANCELLED-MYTRIPS";
    private static final String[] nextTripsMessageTags = {"APP_ERROR_MINIMUM-LASTNAME", "APP_ERROR_MAXIMUM-LASTNAME", "APP_ERROR_FORMAT-NAME", APP_ERROR_PNR_INCORRECT, "APP_ALERT_SR_DELAY-MYTRIPS", APP_ALERT_SR_CANCELLED_MYTRIPS};
    public static final int $stable = 8;

    private MyTripsMessageTags() {
    }

    public final String[] getNextTripsMessageTags() {
        return nextTripsMessageTags;
    }
}
