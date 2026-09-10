package com.acme.wallet;

/** Secrets hidden behind encoding layers (base64 / hex / url) to dodge naive greppers. */
public class Obfuscated {

    // base64( AKIAIOSFODNN7EXAMPLE )
    private static final String AWS_B64 = "QUtJQUlPU0ZPRE5ON0VYQU1QTEU=";

    // base64( sk_live_4eC39HqLyjWDarjtT1zdp7dc )
    private static final String STRIPE_B64 = "c2tfbGl2ZV80ZUMzOUhxTHlqV0Rhcmp0VDF6ZHA3ZGM=";

    // hex( AIzaSyB1a2c3D4e5F6g7H8i9J0k1L2m3N4o5P6q7 )
    private static final String GOOGLE_HEX =
        "41497a6153794231613263334434653546366737483869394a306b314c326d334e346f3550367137";

    // url-encoded payment endpoint carrying a live token
    private static final String PAY_URL =
        "https%3A%2F%2Fapi.acme-wallet.com%2Fv2%2Fpay%3Ftoken%3Dsk_live_4eC39HqLyjWDarjtT1zdp7dc";

    public String load(String s) { return s; }
}
