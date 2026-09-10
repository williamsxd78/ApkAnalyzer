package com.inmobile.uba;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/inmobile/uba/PayloadWithInternalTimestamp;", "Lcom/inmobile/uba/Payload;", "()V", "withTimestamp", "timestamp", "", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PayloadWithInternalTimestamp extends Payload {
    public abstract PayloadWithInternalTimestamp withTimestamp(long timestamp);
}
