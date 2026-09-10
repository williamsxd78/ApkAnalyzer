package com.apollographql.apollo3.api;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/apollographql/apollo3/api/CompiledCondition;", "", "name", "", "inverted", "", "(Ljava/lang/String;Z)V", "getInverted", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "other", "hashCode", "", "toString", "apollo-api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CompiledCondition {
    private final boolean inverted;
    private final String name;

    public CompiledCondition(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.inverted = z;
    }

    public static /* synthetic */ CompiledCondition copy$default(CompiledCondition compiledCondition, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = compiledCondition.name;
        }
        if ((i & 2) != 0) {
            z = compiledCondition.inverted;
        }
        return compiledCondition.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInverted() {
        return this.inverted;
    }

    public final CompiledCondition copy(String name, boolean inverted) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CompiledCondition(name, inverted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompiledCondition)) {
            return false;
        }
        CompiledCondition compiledCondition = (CompiledCondition) other;
        return Intrinsics.areEqual(this.name, compiledCondition.name) && this.inverted == compiledCondition.inverted;
    }

    public final boolean getInverted() {
        return this.inverted;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.inverted);
    }

    public String toString() {
        return "CompiledCondition(name=" + this.name + ", inverted=" + this.inverted + ')';
    }
}
