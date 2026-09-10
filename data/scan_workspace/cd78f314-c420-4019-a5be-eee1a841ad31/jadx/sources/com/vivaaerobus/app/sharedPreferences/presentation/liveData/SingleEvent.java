package com.vivaaerobus.app.sharedPreferences.presentation.liveData;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/vivaaerobus/app/sharedPreferences/presentation/liveData/SingleEvent;", "T", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Ljava/lang/Object;)V", "getContent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "hasBeenHandled", "", "getContentIfNotHandled", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "(Ljava/lang/Object;)Lcom/vivaaerobus/app/sharedPreferences/presentation/liveData/SingleEvent;", "equals", "other", "hashCode", "", "toString", "", "sharedPreferences_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SingleEvent<T> {
    private final T content;
    private boolean hasBeenHandled;

    public SingleEvent(T t) {
        this.content = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleEvent copy$default(SingleEvent singleEvent, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = singleEvent.content;
        }
        return singleEvent.copy(obj);
    }

    public final T component1() {
        return this.content;
    }

    public final SingleEvent<T> copy(T content) {
        return new SingleEvent<>(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SingleEvent) && Intrinsics.areEqual(this.content, ((SingleEvent) other).content);
    }

    public final T getContent() {
        return this.content;
    }

    public final T getContentIfNotHandled() {
        if (this.hasBeenHandled) {
            return null;
        }
        this.hasBeenHandled = true;
        return this.content;
    }

    public int hashCode() {
        T t = this.content;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "SingleEvent(content=" + this.content + ")";
    }
}
