package com.yuno.data.api.countrydata;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.yuno.data.api.dto.CheckoutSessionConfigDTO;
import com.yuno.data.api.dto.SDKInformationDTO;
import com.yuno.payments.network.services.core.models.SdkSettingsDTO;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: SettingsServices.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/yuno/data/api/countrydata/SettingsServices;", "", "getCheckoutSessionConfig", "Lcom/yuno/data/api/dto/CheckoutSessionConfigDTO;", "checkoutSession", "", "paymentMethodType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountryData", "Lcom/yuno/data/api/dto/SDKInformationDTO;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSdkSettings", "Lcom/yuno/payments/network/services/core/models/SdkSettingsDTO;", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SettingsServices {
    @GET("v1/sdk/checkout/sessions/{checkout_session}/config")
    Object getCheckoutSessionConfig(@Path("checkout_session") String str, @Query("payment_method_type") String str2, Continuation<? super CheckoutSessionConfigDTO> continuation);

    @GET("v1/country-data")
    Object getCountryData(@Query("country") String str, Continuation<? super SDKInformationDTO> continuation);

    @GET("v1/sdk/checkout/sessions/{checkout_session}/settings")
    Object getSdkSettings(@Path("checkout_session") String str, Continuation<? super SdkSettingsDTO> continuation);
}
