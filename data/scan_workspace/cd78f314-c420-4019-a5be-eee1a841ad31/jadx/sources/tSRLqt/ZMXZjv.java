package tSRLqt;

import com.airbnb.paris.R2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jslYAf.XIEBFS$$ExternalSyntheticThrowIAE2;

/* loaded from: classes10.dex */
public final class ZMXZjv {
    public static int AmG = 2889;
    public static int dRc = 9513;
    private volatile ThreadPoolExecutor OdqhgP = UUhaSn();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public class IYqlrp implements ThreadFactory {
        static String Unlawg;
        final /* synthetic */ IYq tgljfX;

        static {
            rBZ(false);
        }

        IYqlrp(ZMXZjv zMXZjv) {
            this.tgljfX = zMXZjv;
        }

        public static /* synthetic */ void rBZ(boolean z) {
            if (z) {
                rBZ(false);
            }
            Unlawg = WnFOdL.rva("bD^\"fgOPE[");
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, Unlawg);
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tSRLqt.ZMXZjv$ZMXZjv, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public class RunnableC0469ZMXZjv implements Runnable {
        final /* synthetic */ Runnable WuzTiI;

        RunnableC0469ZMXZjv(Runnable runnable) {
            this.WuzTiI = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.WuzTiI.run();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public class ZVzHCj extends ThreadPoolExecutor implements AutoCloseable {
        ZVzHCj(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th != null) {
                th.printStackTrace();
            }
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            XIEBFS$$ExternalSyntheticThrowIAE2.m((ExecutorService) this);
        }
    }

    private ThreadPoolExecutor UUhaSn() {
        return new ZVzHCj(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new IYqlrp(this));
    }

    private synchronized ThreadPoolExecutor UdNfxE() {
        int i;
        int i2;
        if (this.OdqhgP != null && !this.OdqhgP.isShutdown()) {
            boolean isTerminating = this.OdqhgP.isTerminating();
            if (dRc <= 9512) {
                while (true) {
                    int i3 = dRc;
                    if (i3 + 65 == 83) {
                        dRc = (i3 * 75) ^ R2.id.action_bar_activity_content;
                    }
                }
            } else if (!isTerminating && !this.OdqhgP.isTerminated()) {
                if (this.OdqhgP.getPoolSize() == 0) {
                    this.OdqhgP.shutdownNow();
                    if (dRc <= 9512) {
                        do {
                            i = dRc;
                            i2 = i + 52;
                            if (i2 == 57) {
                                while (true) {
                                    dRc = (dRc % 75) % 84;
                                }
                            }
                        } while (i2 != 163);
                        while (true) {
                            dRc = (dRc + i) ^ R2.style.TextAppearance_AppCompat_Widget_PopupMenu_Small;
                        }
                    }
                }
            }
        }
        this.OdqhgP = UUhaSn();
        return this.OdqhgP;
    }

    private Runnable WjFaRW(Runnable runnable) {
        return new RunnableC0469ZMXZjv(runnable);
    }

    public synchronized void dispose() {
        if (this.OdqhgP != null) {
            this.OdqhgP.shutdownNow();
            this.OdqhgP = null;
        }
    }

    public void execute(Runnable runnable) {
        UdNfxE().execute(WjFaRW(runnable));
    }
}
