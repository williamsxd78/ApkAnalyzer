package com.vivaaerobus.app.profile.presentation.vivaCash.recharge;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.profile.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VivaCashRechargeFragmentDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vivaaerobus/app/profile/presentation/vivaCash/recharge/VivaCashRechargeFragmentDirections;", "", "<init>", "()V", "ActionVivaCashRechargeFragmentToVivaCashSummaryFragment", "Companion", "profile_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VivaCashRechargeFragmentDirections {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VivaCashRechargeFragmentDirections.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/profile/presentation/vivaCash/recharge/VivaCashRechargeFragmentDirections$ActionVivaCashRechargeFragmentToVivaCashSummaryFragment;", "Landroidx/navigation/NavDirections;", "amount", "", "<init>", "(I)V", "getAmount", "()I", "actionId", "getActionId", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "", "hashCode", "toString", "", "profile_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class ActionVivaCashRechargeFragmentToVivaCashSummaryFragment implements NavDirections {
        private final int actionId;
        private final int amount;

        public ActionVivaCashRechargeFragmentToVivaCashSummaryFragment() {
            this(0, 1, null);
        }

        public ActionVivaCashRechargeFragmentToVivaCashSummaryFragment(int i) {
            this.amount = i;
            this.actionId = R.id.action_vivaCashRechargeFragment_to_vivaCashSummaryFragment;
        }

        public /* synthetic */ ActionVivaCashRechargeFragmentToVivaCashSummaryFragment(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public static /* synthetic */ ActionVivaCashRechargeFragmentToVivaCashSummaryFragment copy$default(ActionVivaCashRechargeFragmentToVivaCashSummaryFragment actionVivaCashRechargeFragmentToVivaCashSummaryFragment, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = actionVivaCashRechargeFragmentToVivaCashSummaryFragment.amount;
            }
            return actionVivaCashRechargeFragmentToVivaCashSummaryFragment.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAmount() {
            return this.amount;
        }

        public final ActionVivaCashRechargeFragmentToVivaCashSummaryFragment copy(int amount) {
            return new ActionVivaCashRechargeFragmentToVivaCashSummaryFragment(amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionVivaCashRechargeFragmentToVivaCashSummaryFragment) && this.amount == ((ActionVivaCashRechargeFragmentToVivaCashSummaryFragment) other).amount;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        public final int getAmount() {
            return this.amount;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("amount", this.amount);
            return bundle;
        }

        public int hashCode() {
            return Integer.hashCode(this.amount);
        }

        public String toString() {
            return "ActionVivaCashRechargeFragmentToVivaCashSummaryFragment(amount=" + this.amount + ")";
        }
    }

    /* compiled from: VivaCashRechargeFragmentDirections.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/vivaaerobus/app/profile/presentation/vivaCash/recharge/VivaCashRechargeFragmentDirections$Companion;", "", "<init>", "()V", "actionVivaCashRechargeFragmentToVivaCashSummaryFragment", "Landroidx/navigation/NavDirections;", "amount", "", "profile_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NavDirections actionVivaCashRechargeFragmentToVivaCashSummaryFragment$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return companion.actionVivaCashRechargeFragmentToVivaCashSummaryFragment(i);
        }

        public final NavDirections actionVivaCashRechargeFragmentToVivaCashSummaryFragment(int amount) {
            return new ActionVivaCashRechargeFragmentToVivaCashSummaryFragment(amount);
        }
    }

    private VivaCashRechargeFragmentDirections() {
    }
}
