package com.beyondeye.kjsonpatch.lcs;

/* loaded from: classes13.dex */
public class KeepCommand<T> extends EditCommand<T> {
    public KeepCommand(T t) {
        super(t);
    }

    @Override // com.beyondeye.kjsonpatch.lcs.EditCommand
    public void accept(CommandVisitor<T> commandVisitor) {
        commandVisitor.visitKeepCommand(getObject());
    }
}
