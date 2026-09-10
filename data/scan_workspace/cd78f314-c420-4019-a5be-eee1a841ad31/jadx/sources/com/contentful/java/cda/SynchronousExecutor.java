package com.contentful.java.cda;

import java.util.concurrent.Executor;

/* loaded from: classes13.dex */
final class SynchronousExecutor implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
