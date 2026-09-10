package com.inmobile.sse.utilities;

import com.inmobile.sse.ext.ExceptionExtKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/inmobile/sse/utilities/MemoryInfo;", "", "()V", "Ы042BЫ042B042B042B042B", "", "<set-?>", "ЫЫ042B042B042B042B042B", "getHeapSizeMb$sse_fullNormalRelease", "()J", "getRemainingHeapMb", "getRemainingHeapMb$sse_fullNormalRelease", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MemoryInfo {
    public static final MemoryInfo INSTANCE = new MemoryInfo();
    private static final long Ы042BЫ042B042B042B042B = 1048576;
    private static long ЫЫ042B042B042B042B042B = 0;

    /* renamed from: Ѻ047A047AѺ047A047A047A, reason: contains not printable characters */
    public static int f2823047A047A047A047A047A = 2;

    /* renamed from: Ѻ047AѺѺ047A047A047A, reason: contains not printable characters */
    public static int f2824047A047A047A047A = 0;

    /* renamed from: ѺѺ047AѺ047A047A047A, reason: contains not printable characters */
    public static int f2825047A047A047A047A = 1;

    /* renamed from: ѺѺѺѺ047A047A047A, reason: contains not printable characters */
    public static int f2826047A047A047A = 96;

    static {
        try {
            Runtime runtime = Runtime.getRuntime();
            int i = f2826047A047A047A;
            if (((f2825047A047A047A047A + i) * i) % f2823047A047A047A047A047A != f2824047A047A047A047A) {
                f2826047A047A047A = 8;
                f2824047A047A047A047A = 15;
            }
            ЫЫ042B042B042B042B042B = runtime.maxMemory() / 1048576;
            int i2 = f2826047A047A047A;
            if ((i2 * (m13617047A047A047A047A() + i2)) % f2823047A047A047A047A047A != 0) {
                f2826047A047A047A = 69;
                f2824047A047A047A047A = m13616047A047A047A047A047A();
            }
        } catch (Exception e) {
            ExceptionExtKt.bio(e);
            ЫЫ042B042B042B042B042B = 0L;
        }
    }

    private MemoryInfo() {
    }

    /* renamed from: Ѻ047AѺ047A047A047A047A, reason: contains not printable characters */
    public static int m13616047A047A047A047A047A() {
        return 29;
    }

    /* renamed from: ѺѺѺ047A047A047A047A, reason: contains not printable characters */
    public static int m13617047A047A047A047A() {
        return 1;
    }

    public final long getHeapSizeMb$sse_fullNormalRelease() {
        int i = f2826047A047A047A;
        int i2 = f2825047A047A047A047A;
        int i3 = f2823047A047A047A047A047A;
        int i4 = ((i + i2) * i) % i3;
        int i5 = f2824047A047A047A047A;
        if (i4 != i5) {
            if (((i2 + i) * i) % i3 != i5) {
                f2826047A047A047A = 32;
                f2824047A047A047A047A = 16;
            }
            f2826047A047A047A = 28;
            f2824047A047A047A047A = 35;
        }
        return ЫЫ042B042B042B042B042B;
    }

    public final long getRemainingHeapMb$sse_fullNormalRelease() {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) / 1048576;
        int i = f2826047A047A047A;
        if (((f2825047A047A047A047A + i) * i) % f2823047A047A047A047A047A != f2824047A047A047A047A) {
            f2826047A047A047A = 67;
            f2824047A047A047A047A = m13616047A047A047A047A047A();
        }
        return ЫЫ042B042B042B042B042B - freeMemory;
    }
}
