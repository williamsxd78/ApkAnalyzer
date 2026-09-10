package com.braze.requests.util;

import android.net.Uri;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class c {
    public final String a;
    public final Uri b;
    public final URL c;
    public final boolean d;

    public c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.b = uri;
        String uri2 = uri.toString();
        this.a = uri2;
        this.c = new URL(uri2);
        this.d = false;
    }

    public /* synthetic */ c(String str) {
        this(str, false);
    }

    public c(String urlString, boolean z) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.b = Uri.parse(urlString);
        this.a = urlString;
        this.c = new URL(urlString);
        this.d = z;
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }
}
