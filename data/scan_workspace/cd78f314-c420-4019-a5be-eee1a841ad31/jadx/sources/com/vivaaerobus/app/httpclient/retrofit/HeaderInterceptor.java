package com.vivaaerobus.app.httpclient.retrofit;

import kotlin.Metadata;

/* compiled from: HeaderInterceptor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/httpclient/retrofit/HeaderInterceptor;", "", "getAuthorizationType", "", "authorizationValue", "isForOtp", "", "userAgentCustom", "httpClient_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface HeaderInterceptor {

    /* compiled from: HeaderInterceptor.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ String authorizationValue$default(HeaderInterceptor headerInterceptor, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: authorizationValue");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return headerInterceptor.authorizationValue(z);
    }

    String authorizationValue(boolean isForOtp);

    String getAuthorizationType();

    String userAgentCustom();
}
