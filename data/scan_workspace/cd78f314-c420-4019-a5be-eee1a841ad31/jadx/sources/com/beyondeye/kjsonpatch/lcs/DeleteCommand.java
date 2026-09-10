package com.beyondeye.kjsonpatch.lcs;

/* loaded from: classes13.dex */
public class DeleteCommand<T> extends EditCommand<T> {
    public DeleteCommand(T t) {
        super(t);
    }

    @Override // com.beyondeye.kjsonpatch.lcs.EditCommand
    public void accept(CommandVisitor<T> commandVisitor) {
        commandVisitor.visitDeleteCommand(getObject());
    }
}
