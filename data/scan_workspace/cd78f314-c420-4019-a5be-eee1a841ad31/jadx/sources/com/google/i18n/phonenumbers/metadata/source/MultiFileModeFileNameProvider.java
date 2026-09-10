package com.google.i18n.phonenumbers.metadata.source;

import com.vivaaerobus.app.search.presentation.addPassenger.AddPassengerFragment;

/* loaded from: classes14.dex */
public final class MultiFileModeFileNameProvider implements PhoneMetadataFileNameProvider {
    private final String phoneMetadataFileNamePrefix;

    public MultiFileModeFileNameProvider(String str) {
        this.phoneMetadataFileNamePrefix = str + AddPassengerFragment.BLANK_SPACE;
    }

    private boolean isAlphanumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isLetterOrDigit(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider
    public String getFor(Object obj) {
        String obj2 = obj.toString();
        if (!isAlphanumeric(obj2)) {
            throw new IllegalArgumentException("Invalid key: " + obj2);
        }
        return this.phoneMetadataFileNamePrefix + obj;
    }
}
