package com.vivaaerobus.app.vivacash.data;

import com.vivaaerobus.app.selectBundles.presentation.chooseBundle.ChooseBundleModal;
import com.vivaaerobus.app.vivacash.domain.usecase.fetch_active_references.FetchActiveReferencesFailure;
import com.vivaaerobus.app.vivacash.domain.usecase.fetch_active_references.FetchActiveReferencesResponse;
import com.vivaaerobus.app.vivacash.domain.usecase.fetch_transactions.FetchTransactionsFailure;
import com.vivaaerobus.app.vivacash.domain.usecase.fetch_transactions.FetchTransactionsResponse;
import com.vivaaerobus.app.vivacash.domain.usecase.generate_reference.GenerateReferenceFailure;
import com.vivaaerobus.app.vivacash.domain.usecase.generate_reference.GenerateReferenceParams;
import com.vivaaerobus.app.vivacash.domain.usecase.generate_reference.GenerateReferenceResponse;
import com.vivaaerobus.app.vivacash.domain.usecase.get_detail.GetVivaCashDetailFailure;
import com.vivaaerobus.app.vivacash.domain.usecase.get_detail.GetVivaCashDetailResponse;
import dev.jaque.libs.core.domain.Either;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VivaCashRemoteDataSource.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0003H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/vivacash/data/VivaCashRemoteDataSource;", "", "getVivaCashDetail", "Ldev/jaque/libs/core/domain/Either;", "Lcom/vivaaerobus/app/vivacash/domain/usecase/get_detail/GetVivaCashDetailFailure;", "Lcom/vivaaerobus/app/vivacash/domain/usecase/get_detail/GetVivaCashDetailResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTransactions", "Lcom/vivaaerobus/app/vivacash/domain/usecase/fetch_transactions/FetchTransactionsFailure;", "Lcom/vivaaerobus/app/vivacash/domain/usecase/fetch_transactions/FetchTransactionsResponse;", "currencyCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchActiveReferences", "Lcom/vivaaerobus/app/vivacash/domain/usecase/fetch_active_references/FetchActiveReferencesFailure;", "Lcom/vivaaerobus/app/vivacash/domain/usecase/fetch_active_references/FetchActiveReferencesResponse;", "generateReference", "Lcom/vivaaerobus/app/vivacash/domain/usecase/generate_reference/GenerateReferenceFailure;", "Lcom/vivaaerobus/app/vivacash/domain/usecase/generate_reference/GenerateReferenceResponse;", ChooseBundleModal.ARG_PARAMS, "Lcom/vivaaerobus/app/vivacash/domain/usecase/generate_reference/GenerateReferenceParams;", "(Lcom/vivaaerobus/app/vivacash/domain/usecase/generate_reference/GenerateReferenceParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vivacash_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface VivaCashRemoteDataSource {
    Object fetchActiveReferences(Continuation<? super Either<? extends FetchActiveReferencesFailure, FetchActiveReferencesResponse>> continuation);

    Object fetchTransactions(String str, Continuation<? super Either<? extends FetchTransactionsFailure, FetchTransactionsResponse>> continuation);

    Object generateReference(GenerateReferenceParams generateReferenceParams, Continuation<? super Either<? extends GenerateReferenceFailure, GenerateReferenceResponse>> continuation);

    Object getVivaCashDetail(Continuation<? super Either<? extends GetVivaCashDetailFailure, GetVivaCashDetailResponse>> continuation);
}
