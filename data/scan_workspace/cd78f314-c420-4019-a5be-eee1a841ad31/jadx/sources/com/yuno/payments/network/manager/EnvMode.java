package com.yuno.payments.network.manager;

import kotlin.Metadata;

/* compiled from: EnvMode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yuno/payments/network/manager/EnvMode;", "", "name", "", "(Ljava/lang/String;ILjava/lang/String;)V", "none", "develop", "sandbox", "production", "staging", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum EnvMode {
    none(""),
    develop("develop"),
    sandbox("sandbox"),
    production("production"),
    staging("staging");

    EnvMode(String str) {
    }
}
