package com.inmobile.sse.ext;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asBytes", "", "Ljava/util/UUID;", "sse_fullNormalRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class UUIDExtKt {

    /* renamed from: х04450445хх0445х, reason: contains not printable characters */
    public static int f2413044504450445 = 1;

    /* renamed from: х0445х0445х0445х, reason: contains not printable characters */
    public static int f2414044504450445 = 0;

    /* renamed from: хх0445хх0445х, reason: contains not printable characters */
    public static int f241504450445 = 49;

    /* renamed from: ххх0445х0445х, reason: contains not printable characters */
    public static int f241604450445 = 2;

    public static final byte[] asBytes(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        int i = f241504450445;
        if ((i * (f2413044504450445 + i)) % f241604450445 != 0) {
            f241504450445 = 48;
            f2413044504450445 = 65;
        }
        byte mostSignificantBits = (byte) ((uuid.getMostSignificantBits() >> 56) & 255);
        byte mostSignificantBits2 = (byte) ((uuid.getMostSignificantBits() >> 48) & 255);
        byte mostSignificantBits3 = (byte) ((uuid.getMostSignificantBits() >> 40) & 255);
        byte mostSignificantBits4 = (byte) ((uuid.getMostSignificantBits() >> 32) & 255);
        byte mostSignificantBits5 = (byte) ((uuid.getMostSignificantBits() >> 24) & 255);
        byte mostSignificantBits6 = (byte) ((uuid.getMostSignificantBits() >> 16) & 255);
        long mostSignificantBits7 = uuid.getMostSignificantBits();
        int i2 = f241504450445;
        if (((i2 + f2413044504450445) * i2) % f241604450445 != f2414044504450445) {
            f241504450445 = m13260044504450445();
            f2414044504450445 = m13260044504450445();
        }
        return new byte[]{mostSignificantBits, mostSignificantBits2, mostSignificantBits3, mostSignificantBits4, mostSignificantBits5, mostSignificantBits6, (byte) ((mostSignificantBits7 >> 8) & 255), (byte) (uuid.getMostSignificantBits() & 255), (byte) ((uuid.getLeastSignificantBits() >> 56) & 255), (byte) ((uuid.getLeastSignificantBits() >> 48) & 255), (byte) ((uuid.getLeastSignificantBits() >> 40) & 255), (byte) ((uuid.getLeastSignificantBits() >> 32) & 255), (byte) ((uuid.getLeastSignificantBits() >> 24) & 255), (byte) ((uuid.getLeastSignificantBits() >> 16) & 255), (byte) ((uuid.getLeastSignificantBits() >> 8) & 255), (byte) (uuid.getLeastSignificantBits() & 255)};
    }

    /* renamed from: хх04450445х0445х, reason: contains not printable characters */
    public static int m13260044504450445() {
        return 97;
    }
}
