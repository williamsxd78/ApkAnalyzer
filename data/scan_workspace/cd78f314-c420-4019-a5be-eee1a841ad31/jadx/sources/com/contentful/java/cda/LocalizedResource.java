package com.contentful.java.cda;

import java.util.Map;

/* loaded from: classes13.dex */
public abstract class LocalizedResource extends CDAResource {
    private static final long serialVersionUID = 5713028146014748949L;
    String defaultLocale;
    Map<String, String> fallbackLocaleMap;
    Map<String, Object> fields;
    Map<String, Object> rawFields;

    /* loaded from: classes13.dex */
    public class Localizer {
        private final String locale;

        Localizer(String str) {
            this.locale = str;
        }

        public <T> T getField(String str) {
            Map<String, T> map = (Map) LocalizedResource.this.fields.get(str);
            if (map == null) {
                return null;
            }
            return (T) getFieldForFallbackLocale(map, this.locale);
        }

        <T> T getFieldForFallbackLocale(Map<String, T> map, String str) {
            if (str == null) {
                return null;
            }
            T t = map.get(str);
            return t != null ? t : (T) getFieldForFallbackLocale(map, LocalizedResource.this.fallbackLocaleMap.get(str));
        }
    }

    public <T> T getField(String str) {
        return (T) localize(this.defaultLocale).getField(str);
    }

    public <T> T getField(String str, String str2) {
        return (T) localize(str).getField(str2);
    }

    public Localizer localize(String str) {
        return new Localizer(str);
    }

    public Map<String, Object> rawFields() {
        return this.rawFields;
    }

    public void setField(String str, String str2, Object obj) {
        ((Map) this.fields.get(str2)).put(str, obj);
    }
}
