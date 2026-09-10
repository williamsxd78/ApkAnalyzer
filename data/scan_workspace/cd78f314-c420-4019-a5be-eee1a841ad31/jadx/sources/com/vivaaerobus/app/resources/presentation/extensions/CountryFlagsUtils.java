package com.vivaaerobus.app.resources.presentation.extensions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryFlagsUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/vivaaerobus/app/resources/presentation/extensions/CountryFlagsUtils;", "", "<init>", "()V", "getFlagEmoji", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CountryFlagsUtils {
    public static final int $stable = 0;
    public static final CountryFlagsUtils INSTANCE = new CountryFlagsUtils();

    private CountryFlagsUtils() {
    }

    public final String getFlagEmoji(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() != 2) {
            return "";
        }
        String str = upperCase;
        int codePointAt = Character.codePointAt(str, 0) - (-127397);
        int codePointAt2 = Character.codePointAt(str, 1) - (-127397);
        char[] chars = Character.toChars(codePointAt);
        Intrinsics.checkNotNullExpressionValue(chars, "toChars(...)");
        String str2 = new String(chars);
        char[] chars2 = Character.toChars(codePointAt2);
        Intrinsics.checkNotNullExpressionValue(chars2, "toChars(...)");
        return str2.concat(new String(chars2));
    }
}
