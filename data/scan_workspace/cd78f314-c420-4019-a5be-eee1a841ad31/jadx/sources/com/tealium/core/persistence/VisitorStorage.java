package com.tealium.core.persistence;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tealium/core/persistence/VisitorStorage;", "", "currentIdentity", "", "getCurrentIdentity", "()Ljava/lang/String;", "setCurrentIdentity", "(Ljava/lang/String;)V", "currentVisitorId", "getCurrentVisitorId", "setCurrentVisitorId", "clear", "", "getVisitorId", "identity", "saveVisitorId", "visitorId", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface VisitorStorage {
    void clear();

    String getCurrentIdentity();

    String getCurrentVisitorId();

    String getVisitorId(String identity);

    void saveVisitorId(String identity, String visitorId);

    void setCurrentIdentity(String str);

    void setCurrentVisitorId(String str);
}
