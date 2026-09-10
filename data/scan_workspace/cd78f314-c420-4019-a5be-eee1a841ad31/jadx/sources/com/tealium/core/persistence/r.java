package com.tealium.core.persistence;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tealium/core/persistence/r;", "T", "Lcom/tealium/core/persistence/Serializer;", "value", "", "serialize", "(Ljava/lang/Object;)Ljava/lang/String;", "<init>", "()V", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class r<T> implements Serializer<T> {
    @Override // com.tealium.core.persistence.Serializer
    public String serialize(T value) {
        return String.valueOf(value);
    }
}
