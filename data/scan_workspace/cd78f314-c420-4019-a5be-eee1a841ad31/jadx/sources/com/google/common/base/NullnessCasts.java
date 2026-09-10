package com.google.common.base;

import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes14.dex */
final class NullnessCasts {
    private NullnessCasts() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(@CheckForNull T t) {
        return t;
    }
}
