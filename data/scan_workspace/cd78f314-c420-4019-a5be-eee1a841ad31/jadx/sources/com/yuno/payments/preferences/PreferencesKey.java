package com.yuno.payments.preferences;

import com.tealium.core.persistence.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PreferencesKey.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey;", "", i0.a.b, "", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "getDefaultValue", "()Ljava/lang/Object;", "getKey", "()Ljava/lang/String;", "toString", "ApiPreferencesKey", "CheckoutSessionPreferencesKey", "ConfigPreferencesKey", "CountryPreferencesKey", "CustomerSessionPreferencesKey", "EnvPreferencesKey", "MerchantSessionIdPreferencesKey", "PaymentSelectedTypePreferenceKey", "RecognitionToken", "VaultedTokenPreferenceKey", "Lcom/yuno/payments/preferences/PreferencesKey$ApiPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey$CheckoutSessionPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey$ConfigPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey$CountryPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey$CustomerSessionPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey$EnvPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey$MerchantSessionIdPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey$PaymentSelectedTypePreferenceKey;", "Lcom/yuno/payments/preferences/PreferencesKey$RecognitionToken;", "Lcom/yuno/payments/preferences/PreferencesKey$VaultedTokenPreferenceKey;", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PreferencesKey {
    private final Object defaultValue;
    private final String key;

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$ApiPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ApiPreferencesKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final ApiPreferencesKey INSTANCE = new ApiPreferencesKey();

        private ApiPreferencesKey() {
            super("API_KEY_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$CheckoutSessionPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class CheckoutSessionPreferencesKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final CheckoutSessionPreferencesKey INSTANCE = new CheckoutSessionPreferencesKey();

        private CheckoutSessionPreferencesKey() {
            super("CHECKOUT_SESSION_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$ConfigPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ConfigPreferencesKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final ConfigPreferencesKey INSTANCE = new ConfigPreferencesKey();

        private ConfigPreferencesKey() {
            super("CONFIG_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$CountryPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class CountryPreferencesKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final CountryPreferencesKey INSTANCE = new CountryPreferencesKey();

        private CountryPreferencesKey() {
            super("COUNTRY_CODE_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$CustomerSessionPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class CustomerSessionPreferencesKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final CustomerSessionPreferencesKey INSTANCE = new CustomerSessionPreferencesKey();

        private CustomerSessionPreferencesKey() {
            super("CUSTOMER_SESSION_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$EnvPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class EnvPreferencesKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final EnvPreferencesKey INSTANCE = new EnvPreferencesKey();

        private EnvPreferencesKey() {
            super("ENV_MODE_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$MerchantSessionIdPreferencesKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class MerchantSessionIdPreferencesKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final MerchantSessionIdPreferencesKey INSTANCE = new MerchantSessionIdPreferencesKey();

        private MerchantSessionIdPreferencesKey() {
            super("MERCHANT_SESSION_ID_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$PaymentSelectedTypePreferenceKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PaymentSelectedTypePreferenceKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final PaymentSelectedTypePreferenceKey INSTANCE = new PaymentSelectedTypePreferenceKey();

        private PaymentSelectedTypePreferenceKey() {
            super("PAYMENT_SELECTED_TYPE_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$RecognitionToken;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RecognitionToken extends PreferencesKey {
        public static final int $stable = 0;
        public static final RecognitionToken INSTANCE = new RecognitionToken();

        private RecognitionToken() {
            super("RECOGNITION_TOKEN_PREFERENCE_KEY", "", null);
        }
    }

    /* compiled from: PreferencesKey.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/payments/preferences/PreferencesKey$VaultedTokenPreferenceKey;", "Lcom/yuno/payments/preferences/PreferencesKey;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class VaultedTokenPreferenceKey extends PreferencesKey {
        public static final int $stable = 0;
        public static final VaultedTokenPreferenceKey INSTANCE = new VaultedTokenPreferenceKey();

        private VaultedTokenPreferenceKey() {
            super("PAYMENT_SELECTED_TOKEN_PREFERENCE_KEY", "", null);
        }
    }

    private PreferencesKey(String str, Object obj) {
        this.key = str;
        this.defaultValue = obj;
    }

    public /* synthetic */ PreferencesKey(String str, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj);
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final String getKey() {
        return this.key;
    }

    public String toString() {
        return this.key;
    }
}
