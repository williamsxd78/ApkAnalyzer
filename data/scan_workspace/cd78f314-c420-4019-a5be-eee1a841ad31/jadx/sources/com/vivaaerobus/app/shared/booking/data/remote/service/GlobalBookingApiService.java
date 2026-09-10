package com.vivaaerobus.app.shared.booking.data.remote.service;

import com.vivaaerobus.app.shared.booking.data.remote.model.GetBookingFullGlobalResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* compiled from: GlobalBookingApiService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u0000 \r2\u00020\u0001:\u0001\rJL\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/data/remote/service/GlobalBookingApiService;", "", "getBookingFull", "Lretrofit2/Response;", "Lcom/vivaaerobus/app/shared/booking/data/remote/model/GetBookingFullGlobalResponse;", "xAcfSensorData", "", "pnr", "lastName", "email", "retrieveAffiliations", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "URL", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GlobalBookingApiService {

    @Deprecated
    public static final String GET_BOOKING_FULL = "v1/booking/full";

    /* renamed from: URL, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: GlobalBookingApiService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vivaaerobus/app/shared/booking/data/remote/service/GlobalBookingApiService$URL;", "", "<init>", "()V", "GET_BOOKING_FULL", "", "booking_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.vivaaerobus.app.shared.booking.data.remote.service.GlobalBookingApiService$URL, reason: from kotlin metadata */
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String GET_BOOKING_FULL = "v1/booking/full";

        private Companion() {
        }
    }

    @GET("v1/booking/full")
    Object getBookingFull(@Header("X-acf-sensor-data") String str, @Query("Pnr") String str2, @Query("Lastname") String str3, @Query("EmailAddress") String str4, @Query("RetrieveAffiliations") boolean z, Continuation<? super Response<GetBookingFullGlobalResponse>> continuation);
}
