package com.inmobile.uba;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\bH\u0002J\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/inmobile/uba/CountingSemaphore;", "", "()V", "ММ041C041C041CМ041C", "Ljava/util/concurrent/atomic/AtomicLong;", "М041CМ041C041CМ041C", "Lcom/inmobile/uba/CountingSemaphore$πλπλπλπ;", "await", "", "decrement", "С0421ССС0421С", "increment", "com/inmobile/uba/CountingSemaphore$πλπλπλπ", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class CountingSemaphore {

    /* renamed from: ы044B044B044B044Bыы, reason: contains not printable characters */
    public static int f2988044B044B044B044B = 2;

    /* renamed from: ы044Bы044B044Bыы, reason: contains not printable characters */
    public static int f2989044B044B044B = 0;

    /* renamed from: ыы044B044B044Bыы, reason: contains not printable characters */
    public static int f2990044B044B044B = 1;

    /* renamed from: ыыы044B044Bыы, reason: contains not printable characters */
    public static int f2991044B044B = 71;
    private final C0323 М041CМ041C041CМ041C = new C0323();
    private final AtomicLong ММ041C041C041CМ041C = new AtomicLong(0);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\b"}, d2 = {"Lcom/inmobile/uba/CountingSemaphore$πλπλπλπ;", "Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;", "(Lcom/inmobile/uba/CountingSemaphore;)V", "tryAcquireShared", "", "arg", "tryReleaseShared", "", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: com.inmobile.uba.CountingSemaphore$πλπλπλπ, reason: contains not printable characters */
    /* loaded from: classes3.dex */
    private final class C0323 extends AbstractQueuedSynchronizer {
        public C0323() {
        }

        /* renamed from: ы044B044Bыы044Bы, reason: contains not printable characters */
        public static int m13779044B044B044B() {
            return 0;
        }

        /* renamed from: ы044Bы044Bы044Bы, reason: contains not printable characters */
        public static int m13780044B044B044B() {
            return 2;
        }

        /* renamed from: ыы044Bыы044Bы, reason: contains not printable characters */
        public static int m13781044B044B() {
            return 19;
        }

        /* renamed from: ыыы044Bы044Bы, reason: contains not printable characters */
        public static int m13782044B044B() {
            return 1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        protected int tryAcquireShared(int arg) {
            CountingSemaphore countingSemaphore = CountingSemaphore.this;
            if (((m13781044B044B() + m13782044B044B()) * m13781044B044B()) % m13780044B044B044B() != m13779044B044B044B()) {
                int m13781044B044B = ((m13781044B044B() + m13782044B044B()) * m13781044B044B()) % m13780044B044B044B();
                m13779044B044B044B();
            }
            return CountingSemaphore.access$getCount$p(countingSemaphore).get() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        protected boolean tryReleaseShared(int arg) {
            int m13781044B044B = ((m13781044B044B() + m13782044B044B()) * m13781044B044B()) % m13780044B044B044B();
            m13779044B044B044B();
            return true;
        }
    }

    public static final /* synthetic */ AtomicLong access$getCount$p(CountingSemaphore countingSemaphore) {
        int i = f2991044B044B;
        if ((i * (m13777044B044B() + i)) % f2988044B044B044B044B != 0) {
            f2991044B044B = 99;
            f2989044B044B044B = m13778044B();
        }
        return countingSemaphore.ММ041C041C041CМ041C;
    }

    /* renamed from: С0421ССС0421С, reason: contains not printable characters */
    private final void m1377604210421() {
        int i = f2991044B044B;
        if (((f2990044B044B044B + i) * i) % f2988044B044B044B044B != f2989044B044B044B) {
            f2991044B044B = m13778044B();
            f2989044B044B044B = 6;
        }
        while (true) {
            long j = this.ММ041C041C041CМ041C.get();
            if (j >= 0) {
                return;
            }
            this.ММ041C041C041CМ041C.compareAndSet(j, 0L);
            int i2 = f2991044B044B;
            if (((f2990044B044B044B + i2) * i2) % f2988044B044B044B044B != f2989044B044B044B) {
                f2991044B044B = m13778044B();
                f2989044B044B044B = m13778044B();
            }
        }
    }

    /* renamed from: ы044Bыыы044Bы, reason: contains not printable characters */
    public static int m13777044B044B() {
        return 1;
    }

    /* renamed from: ыыыыы044Bы, reason: contains not printable characters */
    public static int m13778044B() {
        return 70;
    }

    public final void await() throws InterruptedException {
        int i = f2991044B044B;
        if (((f2990044B044B044B + i) * i) % f2988044B044B044B044B != f2989044B044B044B) {
            f2991044B044B = 93;
            f2989044B044B044B = 5;
        }
        C0323 c0323 = this.М041CМ041C041CМ041C;
        int m13778044B = m13778044B();
        if ((m13778044B * (m13777044B044B() + m13778044B)) % f2988044B044B044B044B != 0) {
            f2991044B044B = 39;
            f2989044B044B044B = m13778044B();
        }
        c0323.acquireSharedInterruptibly(1);
    }

    public final void decrement() {
        long decrementAndGet = this.ММ041C041C041CМ041C.decrementAndGet();
        if (decrementAndGet == 0) {
            this.М041CМ041C041CМ041C.releaseShared(0);
            return;
        }
        int i = f2991044B044B;
        if ((i * (f2990044B044B044B + i)) % f2988044B044B044B044B != 0) {
            int m13778044B = m13778044B();
            f2991044B044B = m13778044B;
            if (((f2990044B044B044B + m13778044B) * m13778044B) % f2988044B044B044B044B != f2989044B044B044B) {
                f2991044B044B = m13778044B();
                f2989044B044B044B = 55;
            }
            f2989044B044B044B = 52;
        }
        if (decrementAndGet < 0) {
            m1377604210421();
        }
    }

    public final void increment() {
        int i = f2991044B044B;
        if (((f2990044B044B044B + i) * i) % f2988044B044B044B044B != f2989044B044B044B) {
            f2991044B044B = 24;
            f2989044B044B044B = m13778044B();
        }
        AtomicLong atomicLong = this.ММ041C041C041CМ041C;
        int i2 = f2991044B044B;
        if ((i2 * (f2990044B044B044B + i2)) % f2988044B044B044B044B != 0) {
            f2991044B044B = m13778044B();
            f2989044B044B044B = 20;
        }
        atomicLong.incrementAndGet();
    }
}
