package com.google.common.collect;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes14.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    @CheckForNull
    private T nextOrNull;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractSequentialIterator(@CheckForNull T t) {
        this.nextOrNull = t;
    }

    @CheckForNull
    protected abstract T computeNext(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.nextOrNull;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.nextOrNull = computeNext(t);
        return t;
    }
}
