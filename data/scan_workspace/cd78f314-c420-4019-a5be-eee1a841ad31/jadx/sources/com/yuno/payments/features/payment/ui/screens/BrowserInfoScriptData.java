package com.yuno.payments.features.payment.ui.screens;

import kotlin.Metadata;

/* compiled from: BrowserInfoWebView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yuno/payments/features/payment/ui/screens/BrowserInfoScriptData;", "", "()V", "browserInfoScript", "", "getBrowserInfoScript", "()Ljava/lang/String;", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrowserInfoScriptData {
    public static final int $stable = 0;
    private final String browserInfoScript = "\n        <!DOCTYPE html>\n        <html>\n        <body>\n            <script>\n                window.onload = function () {\n                    function getBrowserInfo() {\n                        var colorDepth = null;\n                        if (window.screen && window.screen.colorDepth) {\n                            colorDepth = window.screen.colorDepth.toString();\n                        }\n                        var javaEnabled = null;\n                        if (window.navigator && typeof window.navigator.javaEnabled === 'function') {\n                            javaEnabled = window.navigator.javaEnabled();\n                        }\n                        var timeDifference = new Date().getTimezoneOffset().toString();\n                        return {\n                            browser_time_difference: timeDifference,\n                            color_depth: colorDepth,\n                            java_enabled: javaEnabled,\n                            accept_browser: '*/*',\n                            accept_content: '*/*',\n                            accept_header: '*/*'\n                        };\n                    }\n\n                    var browserInfo = JSON.stringify(getBrowserInfo());\n                    AndroidHandler.onReceiveBrowserInfo(browserInfo);\n                }\n            </script>\n        </body>\n        </html>\n    ";

    public final String getBrowserInfoScript() {
        return this.browserInfoScript;
    }
}
