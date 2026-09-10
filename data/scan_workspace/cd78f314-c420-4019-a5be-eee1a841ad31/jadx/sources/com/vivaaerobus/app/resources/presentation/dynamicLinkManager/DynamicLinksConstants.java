package com.vivaaerobus.app.resources.presentation.dynamicLinkManager;

import com.vivaaerobus.app.base.presentation.eventBus.AppEvent;
import kotlin.Metadata;

/* compiled from: DynamicLinksConstants.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vivaaerobus/app/resources/presentation/dynamicLinkManager/DynamicLinksConstants;", "", "<init>", "()V", AppEvent.NAVIGATE_TO_PROFILE, "", "NAVIGATE_TO_FLIGHT_RESULTS", AppEvent.NAVIGATE_TO_MY_TRIPS, DynamicLinksConstants.PARAM_FROM_FLIGHT_STATUS, DynamicLinksConstants.PARAM_FROM_STATUS_DETAIL, DynamicLinksConstants.PARAM_FROM_ADD_TRIP, DynamicLinksConstants.APPLY_PROMO_CODE, "EMAIL_PARAM", "PNR_PARAM", "PROMO_CODE", DynamicLinksConstants.HOST_TYPE, "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DynamicLinksConstants {
    public static final int $stable = 0;
    public static final String APPLY_PROMO_CODE = "APPLY_PROMO_CODE";
    public static final String EMAIL_PARAM = "email";
    public static final String HOST_TYPE = "HOST_TYPE";
    public static final DynamicLinksConstants INSTANCE = new DynamicLinksConstants();
    public static final String NAVIGATE_TO_FLIGHT_RESULTS = "NavigateToFlightResults";
    public static final String NAVIGATE_TO_MY_TRIPS = "NAVIGATE_TO_TRIP_DETAILS";
    public static final String NAVIGATE_TO_PROFILE = "NavigateToProfile";
    public static final String PARAM_FROM_ADD_TRIP = "PARAM_FROM_ADD_TRIP";
    public static final String PARAM_FROM_FLIGHT_STATUS = "PARAM_FROM_FLIGHT_STATUS";
    public static final String PARAM_FROM_STATUS_DETAIL = "PARAM_FROM_STATUS_DETAIL";
    public static final String PNR_PARAM = "pnr";
    public static final String PROMO_CODE = "promoCode";

    private DynamicLinksConstants() {
    }
}
