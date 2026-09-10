package com.uplift.sdk.checkout;

import com.uplift.sdk.model.priv.Offer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CheckoutDelegate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/uplift/sdk/checkout/OfferState;", "", "()V", "Empty", "OfferPrepared", "OfferUnavailable", "ServiceUnavailable", "Lcom/uplift/sdk/checkout/OfferState$Empty;", "Lcom/uplift/sdk/checkout/OfferState$OfferPrepared;", "Lcom/uplift/sdk/checkout/OfferState$OfferUnavailable;", "Lcom/uplift/sdk/checkout/OfferState$ServiceUnavailable;", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OfferState {

    /* compiled from: CheckoutDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/uplift/sdk/checkout/OfferState$Empty;", "Lcom/uplift/sdk/checkout/OfferState;", "()V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Empty extends OfferState {
        public static final Empty a = new Empty();

        private Empty() {
            super(null);
        }
    }

    /* compiled from: CheckoutDelegate.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/uplift/sdk/checkout/OfferState$OfferPrepared;", "Lcom/uplift/sdk/checkout/OfferState;", "", "", "Lcom/uplift/sdk/model/priv/Offer;", "a", "Ljava/util/Map;", "getOffers", "()Ljava/util/Map;", "offers", "<init>", "(Ljava/util/Map;)V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class OfferPrepared extends OfferState {

        /* renamed from: a, reason: from kotlin metadata */
        private final Map<String, Offer> offers;

        public OfferPrepared(Map<String, Offer> map) {
            super(null);
            this.offers = map;
        }

        public final Map<String, Offer> getOffers() {
            return this.offers;
        }
    }

    /* compiled from: CheckoutDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/uplift/sdk/checkout/OfferState$OfferUnavailable;", "Lcom/uplift/sdk/checkout/OfferState;", "()V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OfferUnavailable extends OfferState {
        public static final OfferUnavailable a = new OfferUnavailable();

        private OfferUnavailable() {
            super(null);
        }
    }

    /* compiled from: CheckoutDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/uplift/sdk/checkout/OfferState$ServiceUnavailable;", "Lcom/uplift/sdk/checkout/OfferState;", "()V", "upliftsdk_plainRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ServiceUnavailable extends OfferState {
        public static final ServiceUnavailable a = new ServiceUnavailable();

        private ServiceUnavailable() {
            super(null);
        }
    }

    private OfferState() {
    }

    public /* synthetic */ OfferState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
