package com.inmobile.sse.utilities;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"containsAny", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "sse_fullNormalRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class CollectionsKt {

    /* renamed from: Ѻ047A047A047AѺѺ047A, reason: contains not printable characters */
    public static int f2810047A047A047A047A = 0;

    /* renamed from: Ѻ047AѺѺ047AѺ047A, reason: contains not printable characters */
    public static int f2811047A047A047A = 2;

    /* renamed from: ѺѺ047A047AѺѺ047A, reason: contains not printable characters */
    public static int f2812047A047A047A = 31;

    /* renamed from: ѺѺ047AѺ047AѺ047A, reason: contains not printable characters */
    public static int f2813047A047A047A = 1;

    public static final <T> boolean containsAny(Collection<? extends T> collection, T... elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (T t : elements) {
            if (collection.contains(t)) {
                if (((f2812047A047A047A + m13590047A047A()) * f2812047A047A047A) % f2811047A047A047A != f2810047A047A047A047A) {
                    f2812047A047A047A = 6;
                    f2810047A047A047A047A = 36;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ѻ047A047AѺ047AѺ047A, reason: contains not printable characters */
    public static int m13589047A047A047A047A() {
        return 29;
    }

    /* renamed from: ѺѺѺѺ047AѺ047A, reason: contains not printable characters */
    public static int m13590047A047A() {
        return 1;
    }
}
