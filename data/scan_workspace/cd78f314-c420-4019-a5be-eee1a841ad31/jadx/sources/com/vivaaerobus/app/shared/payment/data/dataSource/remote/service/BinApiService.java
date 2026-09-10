package com.vivaaerobus.app.shared.payment.data.dataSource.remote.service;

import com.vivaaerobus.app.shared.payment.data.dataSource.remote.model.FetchBinHttpResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: BinApiService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\bJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/data/dataSource/remote/service/BinApiService;", "", "fetchBinRequest", "Lretrofit2/Response;", "Lcom/vivaaerobus/app/shared/payment/data/dataSource/remote/model/FetchBinHttpResponse;", "bin", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "URL", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BinApiService {

    /* compiled from: BinApiService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vivaaerobus/app/shared/payment/data/dataSource/remote/service/BinApiService$URL;", "", "<init>", "()V", "FETCH_BIN", "", "payment_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class URL {
        public static final String FETCH_BIN = "vb/v1/bin";
        public static final URL INSTANCE = new URL();

        private URL() {
        }
    }

    @GET(URL.FETCH_BIN)
    Object fetchBinRequest(@Query("bin") String str, Continuation<? super Response<FetchBinHttpResponse>> continuation);
}
