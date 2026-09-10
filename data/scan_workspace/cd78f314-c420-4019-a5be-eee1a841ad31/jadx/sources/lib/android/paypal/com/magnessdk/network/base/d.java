package lib.android.paypal.com.magnessdk.network.base;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class d {
    private static final Object b = new Object();
    private static d c;
    private ThreadPoolExecutor a;

    private d() {
        try {
            this.a = new ThreadPoolExecutor(10, 10, 60000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256), new ThreadPoolExecutor.DiscardPolicy());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a() {
        d dVar;
        synchronized (b) {
            if (c == null) {
                c = new d();
            }
            dVar = c;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        this.a.execute(cVar);
    }
}
