package com.acme.wallet;

public class PaymentService {

    private static final String STRIPE_SECRET = "sk_live_51H8xYzABcDeFgHiJkLmNoPqR";
    private static final String WEBHOOK = "https://hooks.acme-wallet.com/stripe/callback";
    private static final String DEBUG_HOST = "http://172.16.4.8:9000/debug";

    public String process(String card) {
        String url = "http://payments-internal.acme.local/charge";
        return url + "?token=" + STRIPE_SECRET;
    }
}
