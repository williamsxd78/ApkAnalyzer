package com.yuno.payments.features.payment.models;

import com.yuno.payments.features.payment.ui.screens.ActionCodeScreenKt;
import com.yuno.payments.network.services.payments.models.PaymentMethodsDTOKt;
import kotlin.Metadata;

/* compiled from: PaymentCategory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yuno/payments/features/payment/models/PaymentCategory;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", ActionCodeScreenKt.CATEGORY_BANK_TRANSFER, PaymentMethodsDTOKt.CATEGORY_PAYMENT_BNPL, PaymentMethodsDTOKt.CATEGORY_PAYMENT_WALLET, "CARD", "TICKET", PaymentMethodsDTOKt.CATEGORY_PAYMENT_PAYMENT_LINK, "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum PaymentCategory {
    BANK_TRANSFER(ActionCodeScreenKt.CATEGORY_BANK_TRANSFER),
    BUY_NOW_PAY_LATER(PaymentMethodsDTOKt.CATEGORY_PAYMENT_BNPL),
    WALLET(PaymentMethodsDTOKt.CATEGORY_PAYMENT_WALLET),
    CARD("CARD"),
    TICKET("TICKET"),
    PAYMENT_LINK(PaymentMethodsDTOKt.CATEGORY_PAYMENT_PAYMENT_LINK);

    PaymentCategory(String str) {
    }
}
