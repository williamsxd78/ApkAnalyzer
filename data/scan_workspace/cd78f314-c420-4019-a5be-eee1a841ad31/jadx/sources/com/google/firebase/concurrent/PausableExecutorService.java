package com.google.firebase.concurrent;

import androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticBackport0;
import java.util.concurrent.ExecutorService;

/* loaded from: classes14.dex */
public interface PausableExecutorService extends ExecutorService, PausableExecutor, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        CustomTabsService$1$$ExternalSyntheticBackport0.m((ExecutorService) this);
    }
}
