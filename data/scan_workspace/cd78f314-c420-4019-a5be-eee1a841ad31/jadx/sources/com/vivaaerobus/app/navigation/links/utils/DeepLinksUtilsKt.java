package com.vivaaerobus.app.navigation.links.utils;

import com.vivaaerobus.app.enumerations.presentation.CountryLocaleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepLinksUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"getLanguage", "", "selectedLanguage", "getPrivacyPath", "navigation_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeepLinksUtilsKt {
    public static final String getLanguage(String selectedLanguage) {
        Intrinsics.checkNotNullParameter(selectedLanguage, "selectedLanguage");
        int hashCode = selectedLanguage.hashCode();
        if (hashCode != 96746987) {
            if (hashCode != 96747306) {
                if (hashCode != 96747549 || !selectedLanguage.equals(CountryLocaleKt.SPANISH_UNITED_STATES_LANGUAGE_TAG)) {
                    return CountryLocaleKt.ENGLISH_UNITED_STATES_LANGUAGE_TAG;
                }
            } else if (!selectedLanguage.equals("es-MX")) {
                return CountryLocaleKt.ENGLISH_UNITED_STATES_LANGUAGE_TAG;
            }
        } else if (!selectedLanguage.equals(CountryLocaleKt.SPANISH_COLOMBIA_LANGUAGE_TAG)) {
            return CountryLocaleKt.ENGLISH_UNITED_STATES_LANGUAGE_TAG;
        }
        return "es-MX";
    }

    public static final String getPrivacyPath(String selectedLanguage) {
        Intrinsics.checkNotNullParameter(selectedLanguage, "selectedLanguage");
        int hashCode = selectedLanguage.hashCode();
        return hashCode != 96746987 ? hashCode != 96747306 ? (hashCode == 96747549 && selectedLanguage.equals(CountryLocaleKt.SPANISH_UNITED_STATES_LANGUAGE_TAG)) ? "aviso-de-privacidad" : "privacy-notice" : !selectedLanguage.equals("es-MX") ? "privacy-notice" : "aviso-de-privacidad" : selectedLanguage.equals(CountryLocaleKt.SPANISH_COLOMBIA_LANGUAGE_TAG) ? "aviso-de-privacidad" : "privacy-notice";
    }
}
