package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.oer.OERDefinition;

/* compiled from: com.google.android.gms:play-services-base@@18.9.0 */
/* loaded from: classes13.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        OERDefinition.ExtensionList extensionList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            extensionList.add(arrayList.get(i).freeze());
        }
        return extensionList;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        OERDefinition.ExtensionList extensionList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            extensionList.add(e.freeze());
        }
        return extensionList;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        OERDefinition.ExtensionList extensionList = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            extensionList.add(it.next().freeze());
        }
        return extensionList;
    }
}
