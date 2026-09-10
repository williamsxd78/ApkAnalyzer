package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes14.dex */
public final class SingleFileModeFileNameProvider implements PhoneMetadataFileNameProvider {
    private final String phoneMetadataFileName;

    public SingleFileModeFileNameProvider(String str) {
        this.phoneMetadataFileName = str;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider
    public String getFor(Object obj) {
        return this.phoneMetadataFileName;
    }
}
