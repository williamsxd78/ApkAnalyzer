package com.acme.wallet;

public class ApiClient {

    private static final String BASE_URL = "https://api.acme-wallet.com/v2/";
    private static final String INTERNAL_API = "http://192.168.1.50:8080/admin/api";
    private static final String STAGING = "http://staging.acme-wallet.com/api/users";

    // Long-lived service token committed by mistake
    private static final String API_TOKEN = "api_key=\"sk_live_4eC39HqLyjWDarjtT1zdp7dc\"";
    private static final String JWT = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkFkbWluIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    private static final String GITHUB = "ghp_16C7e42F292c6912E7710c838347Ae178B4a";

    public String buildAuthHeader() {
        return "Bearer " + API_TOKEN;
    }

    public String[] endpoints() {
        return new String[]{
            "https://api.acme-wallet.com/v2/login",
            "https://api.acme-wallet.com/v2/transfer",
            "http://169.254.169.254/latest/meta-data/",
            "https://firebase-acme-wallet.firebaseio.com"
        };
    }
}
