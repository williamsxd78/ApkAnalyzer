package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;

/* loaded from: classes12.dex */
public interface ExecutionListener {
    void onExecuted(WorkGenerationalId workGenerationalId, boolean z);
}
