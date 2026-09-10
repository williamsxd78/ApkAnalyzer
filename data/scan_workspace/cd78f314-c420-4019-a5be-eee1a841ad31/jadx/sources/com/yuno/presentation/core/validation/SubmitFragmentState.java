package com.yuno.presentation.core.validation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SubmitFragmentViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yuno/presentation/core/validation/SubmitFragmentState;", "", "()V", "Idle", "OnSubmitForm", "Lcom/yuno/presentation/core/validation/SubmitFragmentState$Idle;", "Lcom/yuno/presentation/core/validation/SubmitFragmentState$OnSubmitForm;", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SubmitFragmentState {

    /* compiled from: SubmitFragmentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/presentation/core/validation/SubmitFragmentState$Idle;", "Lcom/yuno/presentation/core/validation/SubmitFragmentState;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Idle extends SubmitFragmentState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    /* compiled from: SubmitFragmentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yuno/presentation/core/validation/SubmitFragmentState$OnSubmitForm;", "Lcom/yuno/presentation/core/validation/SubmitFragmentState;", "()V", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OnSubmitForm extends SubmitFragmentState {
        public static final int $stable = 0;
        public static final OnSubmitForm INSTANCE = new OnSubmitForm();

        private OnSubmitForm() {
            super(null);
        }
    }

    private SubmitFragmentState() {
    }

    public /* synthetic */ SubmitFragmentState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
