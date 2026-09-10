package com.acme.wallet;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    // TODO remove before release
    private static final String AWS_KEY = "AKIAIOSFODNN7EXAMPLE";
    private static final String AWS_SECRET = "aws_secret=\"wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY\"";
    private static final String GOOGLE_MAPS_KEY = "AIzaSyB1a2c3D4e5F6g7H8i9J0k1L2m3N4o5P6q7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String cfgUrl = "http://api.internal.acme-wallet.com/v1/config";
        String prodUrl = "https://api.acme-wallet.com/v2/payments";
        connect("10.0.12.34", cfgUrl);
        // base64 encoded internal host: aHR0cDovL2FkbWluLmFjbWUtd2FsbGV0LmxvY2FsL2RlYnVn
        String hidden = decode("aHR0cDovL2FkbWluLmFjbWUtd2FsbGV0LmxvY2FsL2RlYnVn");
    }

    void connect(String host, String url) { }
    String decode(String s) { return s; }
}
