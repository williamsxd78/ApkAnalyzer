package com.tealium.core.consent;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tealium/core/consent/ConsentManagerConstants;", "", "()V", "CONSENT_CATEGORIES", "", "getCONSENT_CATEGORIES$annotations", "CONSENT_DO_NOT_SELL", "getCONSENT_DO_NOT_SELL$annotations", "CONSENT_POLICY", "getCONSENT_POLICY$annotations", "CONSENT_STATUS", "getCONSENT_STATUS$annotations", "DECLINE_CONSENT", "GRANT_FULL_CONSENT", "GRANT_PARTIAL_CONSENT", "KEY_CATEGORIES", "KEY_LAST_STATUS_UPDATE", "KEY_STATUS", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsentManagerConstants {
    public static final String CONSENT_CATEGORIES = "consent_categories";
    public static final String CONSENT_DO_NOT_SELL = "do_not_sell";
    public static final String CONSENT_POLICY = "policy";
    public static final String CONSENT_STATUS = "consent_status";
    public static final String DECLINE_CONSENT = "decline_consent";
    public static final String GRANT_FULL_CONSENT = "grant_full_consent";
    public static final String GRANT_PARTIAL_CONSENT = "grant_partial_consent";
    public static final ConsentManagerConstants INSTANCE = new ConsentManagerConstants();
    public static final String KEY_CATEGORIES = "categories";
    public static final String KEY_LAST_STATUS_UPDATE = "last_updated";
    public static final String KEY_STATUS = "status";

    private ConsentManagerConstants() {
    }

    @Deprecated(message = "Constant has been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CONSENT_CATEGORIES", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCONSENT_CATEGORIES$annotations() {
    }

    @Deprecated(message = "Constant has been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CONSENT_DO_NOT_SELL", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCONSENT_DO_NOT_SELL$annotations() {
    }

    @Deprecated(message = "Constant has been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CONSENT_POLICY", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCONSENT_POLICY$annotations() {
    }

    @Deprecated(message = "Constant has been moved.", replaceWith = @ReplaceWith(expression = "Dispatch.Keys.CONSENT_STATUS", imports = {"com.tealium.dispatcher.Dispatch"}))
    public static /* synthetic */ void getCONSENT_STATUS$annotations() {
    }
}
