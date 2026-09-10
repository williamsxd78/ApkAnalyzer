package com.dynamicyield.sdk.wrapper.core.enums;

import com.google.firebase.perf.FirebasePerformance;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpMethod.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dynamicyield/sdk/wrapper/core/enums/HttpMethod;", "", "<init>", "(Ljava/lang/String;I)V", "GET", "POST", FirebasePerformance.HttpMethod.PUT, FirebasePerformance.HttpMethod.DELETE, "DY-Sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HttpMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpMethod[] $VALUES;
    public static final HttpMethod GET = new HttpMethod("GET", 0);
    public static final HttpMethod POST = new HttpMethod("POST", 1);
    public static final HttpMethod PUT = new HttpMethod(FirebasePerformance.HttpMethod.PUT, 2);
    public static final HttpMethod DELETE = new HttpMethod(FirebasePerformance.HttpMethod.DELETE, 3);

    private static final /* synthetic */ HttpMethod[] $values() {
        return new HttpMethod[]{GET, POST, PUT, DELETE};
    }

    static {
        HttpMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private HttpMethod(String str, int i) {
    }

    public static EnumEntries<HttpMethod> getEntries() {
        return $ENTRIES;
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) $VALUES.clone();
    }
}
