package com.quantummetric.instrument.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class cd extends cf {

    /* loaded from: classes3.dex */
    private static class a {
        int a;
        int b = 1;

        a(int i) {
            this.a = i;
        }
    }

    @Override // com.quantummetric.instrument.internal.cf
    protected final List<StackTraceElement> a(List<StackTraceElement> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            StackTraceElement stackTraceElement = list.get(i);
            a aVar = (a) hashMap.get(stackTraceElement);
            if (aVar != null) {
                int i2 = i - aVar.a;
                aVar.a = i;
                int i3 = i + i2;
                if (list.size() > i3) {
                    while (i3 > i) {
                        if (list.get(i3).equals(list.get(i3 - i2))) {
                            i3--;
                        }
                    }
                    aVar.b++;
                    if (aVar.b > 12) {
                    }
                }
                aVar.b = 1;
                break;
            } else {
                hashMap.put(stackTraceElement, new a(i));
            }
            arrayList.add(stackTraceElement);
        }
        return arrayList;
    }
}
