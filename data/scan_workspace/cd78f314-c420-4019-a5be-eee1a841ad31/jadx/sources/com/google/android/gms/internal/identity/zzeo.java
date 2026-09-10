package com.google.android.gms.internal.identity;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.yuno.payments.network.manager.AvailableLanguages;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* loaded from: classes13.dex */
public final class zzeo {
    private static final SimpleDateFormat zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ROOT);
    private static final SimpleDateFormat zzb = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.ROOT);
    private static final StringBuilder zzc = new StringBuilder(33);

    public static String zza(long j) {
        return j >= 0 ? zza.format(new Date(j)) : Long.toString(j);
    }

    public static String zzb(long j) {
        String sb;
        StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzc(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public static StringBuilder zzc(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return sb;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append("d");
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= DurationKt.MILLIS_IN_HOUR) {
            sb.append(j / DurationKt.MILLIS_IN_HOUR);
            sb.append("h");
            j %= DurationKt.MILLIS_IN_HOUR;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append(OperatorName.MOVE_TO);
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append("s");
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append(AvailableLanguages.MALAYSIAN_HEADER);
        }
        return sb;
    }
}
