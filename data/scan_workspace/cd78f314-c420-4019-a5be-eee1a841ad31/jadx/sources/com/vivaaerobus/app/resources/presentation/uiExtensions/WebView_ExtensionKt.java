package com.vivaaerobus.app.resources.presentation.uiExtensions;

import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebView+Extension.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GLOBAL_STYLE", "", "setCustomHtml", "", "Landroid/webkit/WebView;", "htmlCopy", "resources_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebView_ExtensionKt {
    public static final String GLOBAL_STYLE = "<style> body{text-align:center; font-size: 10pt;}</style>";

    public static final void setCustomHtml(WebView webView, String htmlCopy) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(htmlCopy, "htmlCopy");
        webView.loadDataWithBaseURL(null, GLOBAL_STYLE + htmlCopy, "text/html; charset=utf-8", "UTF-8", null);
    }
}
