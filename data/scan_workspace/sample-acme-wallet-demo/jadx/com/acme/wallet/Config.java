package com.acme.wallet;

import android.content.Context;
import android.content.SharedPreferences;

public class Config {

    private static final String ADMIN_EMAIL = "devops@acme-wallet.com";
    private static final String DB_PASSWORD = "password=\"Sup3rS3cretDbPass!\"";
    private static final String FIREBASE_URL = "https://acme-wallet-prod.firebaseio.com";

    private static final String PRIVATE_KEY =
        "-----BEGIN RSA PRIVATE KEY-----\n" +
        "MIIEpAIBAAKCAQEA1c3RnDpT+aQ2yhVccuABv0example\n" +
        "-----END RSA PRIVATE KEY-----";

    public void save(Context ctx, String token) {
        SharedPreferences prefs = ctx.getSharedPreferences("secure", Context.MODE_WORLD_READABLE);
        prefs.edit().putString("auth_token", token).apply();
        ctx.openFileOutput("session.dat", Context.MODE_WORLD_WRITEABLE);
    }
}
