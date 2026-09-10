package com.uplift.sdk.checkout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CheckoutDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/uplift/sdk/checkout/VirtualCardAction;", "", "()V", "RefreshVirtualCard", "Lcom/uplift/sdk/checkout/VirtualCardAction$RefreshVirtualCard;", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class VirtualCardAction {

    /* compiled from: CheckoutDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/uplift/sdk/checkout/VirtualCardAction$RefreshVirtualCard;", "Lcom/uplift/sdk/checkout/VirtualCardAction;", "()V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RefreshVirtualCard extends VirtualCardAction {
        public static final RefreshVirtualCard a = new RefreshVirtualCard();

        private RefreshVirtualCard() {
            super(null);
        }
    }

    private VirtualCardAction() {
    }

    public /* synthetic */ VirtualCardAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
