package dev.jaque.libs.core.domain;

import com.vivaaerobus.app.selectBundles.presentation.chooseBundle.ChooseBundleModal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UseCase.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0000*\u0006\b\u0002\u0010\u0003 \u00012\u00020\u0004:\u0001\nB\u0005¢\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0001H¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Ldev/jaque/libs/core/domain/UseCase;", "Type", "Params", "Failure", "", "()V", "run", "Ldev/jaque/libs/core/domain/Either;", ChooseBundleModal.ARG_PARAMS, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "None", "core_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes6.dex */
public abstract class UseCase<Type, Params, Failure> {

    /* compiled from: UseCase.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Ldev/jaque/libs/core/domain/UseCase$None;", "", "()V", "core_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes6.dex */
    public static final class None {
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    public abstract Object run(Params params, Continuation<? super Either<? extends Failure, ? extends Type>> continuation);
}
