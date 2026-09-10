package com.inmobile.uba;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH&J1\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#H&¢\u0006\u0002\u0010$J'\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#H&¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H&J\b\u0010)\u001a\u00020\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t¨\u0006*"}, d2 = {"Lcom/inmobile/uba/Uba;", "", "pageId", "", "getPageId", "()J", "sessionId", "", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "suspended", "", "getSuspended", "()Z", "setSuspended", "(Z)V", "ubaId", "getUbaId", "ubaSessionId", "getUbaSessionId", "logEvent", "", "payload", "Lcom/inmobile/uba/Payload;", "randomLargeLong", "screenEnd", "activity", "Landroid/app/Activity;", "screenStart", "rootView", "Landroid/view/View;", "screenTitle", "viewTag", "", "(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;)V", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Integer;)V", "syncWebView", "webView", "Landroid/webkit/WebView;", "upload", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface Uba {
    long getPageId();

    String getSessionId();

    boolean getSuspended();

    String getUbaId();

    String getUbaSessionId();

    void logEvent(Payload payload);

    long randomLargeLong();

    void screenEnd(Activity activity);

    void screenStart(Activity activity, View rootView, String screenTitle, Integer viewTag);

    void screenStart(Activity activity, String screenTitle, Integer viewTag);

    void setSessionId(String str);

    void setSuspended(boolean z);

    void syncWebView(WebView webView);

    void upload();
}
