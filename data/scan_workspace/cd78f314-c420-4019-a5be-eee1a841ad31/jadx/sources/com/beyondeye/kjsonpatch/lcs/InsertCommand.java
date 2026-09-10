package com.beyondeye.kjsonpatch.lcs;

/* loaded from: classes13.dex */
public class InsertCommand<T> extends EditCommand<T> {
    public InsertCommand(T t) {
        super(t);
    }

    @Override // com.beyondeye.kjsonpatch.lcs.EditCommand
    public void accept(CommandVisitor<T> commandVisitor) {
        commandVisitor.visitInsertCommand(getObject());
    }
}
