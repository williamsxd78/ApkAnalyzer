package com.inmobile.sse.ext;

import com.inmobile.sse.logging.Bio;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000¨\u0006\u0004"}, d2 = {"bio", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sse_fullNormalRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ExceptionExtKt {

    /* renamed from: ж04360436ж0436ж0436, reason: contains not printable characters */
    public static int f23900436043604360436 = 2;

    /* renamed from: ж0436жж0436ж0436, reason: contains not printable characters */
    public static int f2391043604360436 = 55;

    /* renamed from: жж0436ж0436ж0436, reason: contains not printable characters */
    public static int f2392043604360436 = 1;

    public static final void bio(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Bio.Companion companion = Bio.INSTANCE;
        int i = f2391043604360436;
        int i2 = f2392043604360436 + i;
        if (((m132440436043604360436() + i) * i) % f23900436043604360436 != 0) {
            f2391043604360436 = m13245043604360436();
            f2392043604360436 = 6;
        }
        if ((i * i2) % f23900436043604360436 != 0) {
            f2391043604360436 = 53;
            f2392043604360436 = m13245043604360436();
        }
        companion.e(exc);
    }

    /* renamed from: ж0436ж04360436ж0436, reason: contains not printable characters */
    public static int m132440436043604360436() {
        return 1;
    }

    /* renamed from: жжж04360436ж0436, reason: contains not printable characters */
    public static int m13245043604360436() {
        return 15;
    }
}
