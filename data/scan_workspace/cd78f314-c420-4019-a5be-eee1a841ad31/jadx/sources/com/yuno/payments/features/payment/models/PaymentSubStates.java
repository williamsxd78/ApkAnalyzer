package com.yuno.payments.features.payment.models;

import kotlin.Metadata;

/* compiled from: PaymentStates.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yuno/payments/features/payment/models/PaymentSubStates;", "", "(Ljava/lang/String;I)V", "WAITING_ADDITIONAL_STEP", "DELAYED_PROVIDER_RESPONSE", "WAITING_FOR_ENROLLMENT", "AUTHORIZED", "NONE", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum PaymentSubStates {
    WAITING_ADDITIONAL_STEP,
    DELAYED_PROVIDER_RESPONSE,
    WAITING_FOR_ENROLLMENT,
    AUTHORIZED,
    NONE
}
