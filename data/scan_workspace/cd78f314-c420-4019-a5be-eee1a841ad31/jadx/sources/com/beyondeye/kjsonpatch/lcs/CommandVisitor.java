package com.beyondeye.kjsonpatch.lcs;

/* loaded from: classes13.dex */
public interface CommandVisitor<T> {
    void visitDeleteCommand(T t);

    void visitInsertCommand(T t);

    void visitKeepCommand(T t);
}
