package com.yuno.data.datasource;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.yuno.data.model.CheckoutSessionConfigBO;
import com.yuno.data.model.SDKInformationBO;
import com.yuno.data.model.SdkSettingsBO;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SettingsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/yuno/data/datasource/SettingsRemoteDataSource;", "", "getCheckoutSessionConfig", "Lcom/yuno/data/model/CheckoutSessionConfigBO;", "checkoutSession", "", "paymentMethodType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSdkConfig", "Lcom/yuno/data/model/SDKInformationBO;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSdkSettings", "Lcom/yuno/data/model/SdkSettingsBO;", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SettingsRemoteDataSource {
    Object getCheckoutSessionConfig(String str, String str2, Continuation<? super CheckoutSessionConfigBO> continuation);

    Object getSdkConfig(String str, Continuation<? super SDKInformationBO> continuation);

    Object getSdkSettings(String str, Continuation<? super SdkSettingsBO> continuation);
}
