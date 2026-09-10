package com.contentful.java.cda;

import java.util.Locale;

/* loaded from: classes13.dex */
public class CDAContentTypeNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -5839900656195732862L;

    public CDAContentTypeNotFoundException(String str, Class<? extends CDAResource> cls, String str2, Throwable th) {
        super(String.format(Locale.getDefault(), "Could not find content type '%s' for resource with id '%s' of type '%s'.", str2, str, cls.getSimpleName()), th);
    }
}
