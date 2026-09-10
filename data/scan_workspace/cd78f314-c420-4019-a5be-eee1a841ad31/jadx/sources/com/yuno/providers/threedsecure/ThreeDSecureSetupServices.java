package com.yuno.providers.threedsecure;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: ThreeDSecureSetupServices.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/yuno/providers/threedsecure/ThreeDSecureSetupServices;", "", "completeThreeDSecureSetup", "", "checkoutSession", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ThreeDSecureSetupServices {
    @POST("v1/sdk/checkout/sessions/{checkout_session}/payment/complete/3ds")
    Object completeThreeDSecureSetup(@Path("checkout_session") String str, Continuation<? super Unit> continuation);
}
