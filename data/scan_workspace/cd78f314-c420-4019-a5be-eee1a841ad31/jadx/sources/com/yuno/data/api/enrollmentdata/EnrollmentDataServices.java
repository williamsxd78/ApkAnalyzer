package com.yuno.data.api.enrollmentdata;

import com.yuno.payments.base.usesCases.ObjectNotifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: EnrollmentDataServices.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/yuno/data/api/enrollmentdata/EnrollmentDataServices;", "", "unEnrollPaymentMethod", "Lcom/yuno/payments/base/usesCases/ObjectNotifier;", "", "paymentMethodId", "", "checkoutSession", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EnrollmentDataServices {
    @POST("v1/sdk/customers/payment-methods/{payment_method_id}/unenroll")
    Object unEnrollPaymentMethod(@Path("payment_method_id") String str, @Header("checkout-session") String str2, Continuation<? super ObjectNotifier<Unit>> continuation);
}
