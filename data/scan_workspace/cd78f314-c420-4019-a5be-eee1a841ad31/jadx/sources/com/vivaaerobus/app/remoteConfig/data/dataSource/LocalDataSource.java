package com.vivaaerobus.app.remoteConfig.data.dataSource;

import com.vivaaerobus.app.remoteConfig.domain.usecase.fetchMaintenanceCatalog.FetchMaintenanceCatalogFailure;
import com.vivaaerobus.app.remoteConfig.domain.usecase.fetchMaintenanceCatalog.FetchMaintenanceCatalogResponse;
import com.vivaaerobus.app.remoteConfig.domain.usecase.restoreConfig.RestoreConfigFailure;
import com.vivaaerobus.app.remoteConfig.domain.usecase.restoreConfig.RestoreConfigResponse;
import dev.jaque.libs.core.domain.Either;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: LocalDataSource.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H¦@¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003H¦@¢\u0006\u0002\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/remoteConfig/data/dataSource/LocalDataSource;", "", "restoreConfig", "Ldev/jaque/libs/core/domain/Either;", "Lcom/vivaaerobus/app/remoteConfig/domain/usecase/restoreConfig/RestoreConfigFailure;", "Lcom/vivaaerobus/app/remoteConfig/domain/usecase/restoreConfig/RestoreConfigResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMaintenanceCatalog", "Lcom/vivaaerobus/app/remoteConfig/domain/usecase/fetchMaintenanceCatalog/FetchMaintenanceCatalogFailure;", "Lcom/vivaaerobus/app/remoteConfig/domain/usecase/fetchMaintenanceCatalog/FetchMaintenanceCatalogResponse;", "remoteConfig_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LocalDataSource {
    Object fetchMaintenanceCatalog(Continuation<? super Either<? extends FetchMaintenanceCatalogFailure, FetchMaintenanceCatalogResponse>> continuation);

    Object restoreConfig(Continuation<? super Either<? extends RestoreConfigFailure, RestoreConfigResponse>> continuation);
}
