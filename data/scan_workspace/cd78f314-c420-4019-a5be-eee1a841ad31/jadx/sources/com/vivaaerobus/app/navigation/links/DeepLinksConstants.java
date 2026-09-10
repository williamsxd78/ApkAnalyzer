package com.vivaaerobus.app.navigation.links;

import com.vivaaerobus.app.base.presentation.eventBus.AppEvent;
import kotlin.Metadata;

/* compiled from: DeepLinksConstants.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vivaaerobus/app/navigation/links/DeepLinksConstants;", "", "<init>", "()V", "SCHEMA_APP_LINK", "", "FRAGMENTS_DEEP_LINK_BASE", "APP_DEEP_LINK_BASE", "IS_VIVA_FAN_FARE_PARAM", "IS_FROM_ICR_DYNAMIC_LINK_PARAM", "FLOW_TYPE", AppEvent.SCREEN_NAME, "navigation_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeepLinksConstants {
    public static final String APP_DEEP_LINK_BASE = "com.vivaaerobus.app";
    public static final String FLOW_TYPE = "flowType";
    public static final String FRAGMENTS_DEEP_LINK_BASE = "com.vivaaerobus.app";
    public static final DeepLinksConstants INSTANCE = new DeepLinksConstants();
    public static final String IS_FROM_ICR_DYNAMIC_LINK_PARAM = "fromIcrDynamicLink";
    public static final String IS_VIVA_FAN_FARE_PARAM = "isVivaFanFare";
    public static final String SCHEMA_APP_LINK = "android-app";
    public static final String SCREEN_NAME = "screenName";

    private DeepLinksConstants() {
    }
}
