package com.uplift.sdk.checkout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CheckoutDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/uplift/sdk/checkout/OrderReset;", "", "()V", "Request", "Response", "Lcom/uplift/sdk/checkout/OrderReset$Request;", "Lcom/uplift/sdk/checkout/OrderReset$Response;", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrderReset {

    /* compiled from: CheckoutDelegate.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/uplift/sdk/checkout/OrderReset$Request;", "Lcom/uplift/sdk/checkout/OrderReset;", "", "a", "Z", "getRenewOrder", "()Z", "renewOrder", "<init>", "(Z)V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class Request extends OrderReset {

        /* renamed from: a, reason: from kotlin metadata */
        private final boolean renewOrder;

        public Request(boolean z) {
            super(null);
            this.renewOrder = z;
        }

        public final boolean getRenewOrder() {
            return this.renewOrder;
        }
    }

    /* compiled from: CheckoutDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/uplift/sdk/checkout/OrderReset$Response;", "Lcom/uplift/sdk/checkout/OrderReset;", "()V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Response extends OrderReset {
        public static final Response a = new Response();

        private Response() {
            super(null);
        }
    }

    private OrderReset() {
    }

    public /* synthetic */ OrderReset(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
