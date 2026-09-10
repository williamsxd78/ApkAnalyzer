package com.google.i18n.phonenumbers.metadata.source;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes14.dex */
final class MapBackedMetadataContainer<T> implements MetadataContainer {
    private final KeyProvider<T> keyProvider;
    private final ConcurrentMap<T, Phonemetadata.PhoneMetadata> metadataMap = new ConcurrentHashMap();

    /* loaded from: classes14.dex */
    interface KeyProvider<T> {
        T getKeyOf(Phonemetadata.PhoneMetadata phoneMetadata);
    }

    private MapBackedMetadataContainer(KeyProvider<T> keyProvider) {
        this.keyProvider = keyProvider;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MapBackedMetadataContainer<Integer> byCountryCallingCode() {
        return new MapBackedMetadataContainer<>(new KeyProvider<Integer>() { // from class: com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider
            public Integer getKeyOf(Phonemetadata.PhoneMetadata phoneMetadata) {
                return Integer.valueOf(phoneMetadata.getCountryCode());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MapBackedMetadataContainer<String> byRegionCode() {
        return new MapBackedMetadataContainer<>(new KeyProvider<String>() { // from class: com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.1
            @Override // com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider
            public String getKeyOf(Phonemetadata.PhoneMetadata phoneMetadata) {
                return phoneMetadata.getId();
            }
        });
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MetadataContainer
    public void accept(Phonemetadata.PhoneMetadata phoneMetadata) {
        this.metadataMap.put(this.keyProvider.getKeyOf(phoneMetadata), phoneMetadata);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyProvider<T> getKeyProvider() {
        return this.keyProvider;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Phonemetadata.PhoneMetadata getMetadataBy(T t) {
        if (t != null) {
            return this.metadataMap.get(t);
        }
        return null;
    }
}
