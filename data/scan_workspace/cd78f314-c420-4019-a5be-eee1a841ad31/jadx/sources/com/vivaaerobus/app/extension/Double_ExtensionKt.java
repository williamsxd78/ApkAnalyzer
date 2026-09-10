package com.vivaaerobus.app.extension;

import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: Double+Extension.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\r\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0001\u001a\u001a\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0003\u001a\n\u0010\f\u001a\u00020\u0004*\u00020\u0004\u001a\u0011\u0010\r\u001a\u00020\u0004*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000e\u001a\n\u0010\u000f\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010\u0010\u001a\u00020\u0004*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"ONE_HOUR_IN_MINUTES", "", "toFormatWithCommaDecimal", "", "", "language", "minimumFractionDigits", "roundTo", "numFractionDigits", "toCustomDecimalsWithComma", "decimals", "languageLocale", "positive", "orZero", "(Ljava/lang/Double;)D", "zeroIfNegative", "minutesToHours", "extension"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Double_ExtensionKt {
    private static final int ONE_HOUR_IN_MINUTES = 60;

    public static final double minutesToHours(double d) {
        return d / 60;
    }

    public static final double orZero(Double d) {
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public static final double positive(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        return d;
    }

    public static final double roundTo(double d, int i) {
        try {
            return MathKt.roundToInt(d * r0) / Math.pow(10.0d, i);
        } catch (IllegalArgumentException unused) {
            return 0.0d;
        }
    }

    public static final String toCustomDecimalsWithComma(double d, int i, String languageLocale) {
        Intrinsics.checkNotNullParameter(languageLocale, "languageLocale");
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.forLanguageTag(languageLocale));
        numberFormat.setMinimumFractionDigits(i);
        numberFormat.setMaximumFractionDigits(i);
        String format = numberFormat.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String toFormatWithCommaDecimal(double d, String language, int i) {
        Intrinsics.checkNotNullParameter(language, "language");
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.forLanguageTag(language));
        numberFormat.setMinimumFractionDigits(i);
        numberFormat.setMaximumFractionDigits(2);
        String format = numberFormat.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ String toFormatWithCommaDecimal$default(double d, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return toFormatWithCommaDecimal(d, str, i);
    }

    public static final double zeroIfNegative(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        return d;
    }
}
