package com.vivaaerobus.app.sharedFlightStatus.data.remote.service;

import com.vivaaerobus.app.sharedFlightStatus.data.remote.model.FetchFlightStatusResponse;
import com.vivaaerobus.app.sharedFlightStatus.data.remote.model.GetInformationPlaneResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: FlightStatusApiService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0010JN\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000f¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/sharedFlightStatus/data/remote/service/FlightStatusApiService;", "", "fetchFlightStatus", "Lretrofit2/Response;", "Lcom/vivaaerobus/app/sharedFlightStatus/data/remote/model/FetchFlightStatusResponse;", "date", "", "flight", "origin", "destination", "language", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInformationPlane", "Lcom/vivaaerobus/app/sharedFlightStatus/data/remote/model/GetInformationPlaneResponse;", "tail", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "URL", "sharedFlightStatus_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FlightStatusApiService {

    /* compiled from: FlightStatusApiService.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
    }

    /* compiled from: FlightStatusApiService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vivaaerobus/app/sharedFlightStatus/data/remote/service/FlightStatusApiService$URL;", "", "<init>", "()V", "FETCH_FLIGHT_STATUS", "", "FETCH_FLIGHT_STATUS_V2", "GET_INFORMATION_PLANE", "sharedFlightStatus_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class URL {
        public static final String FETCH_FLIGHT_STATUS = "vb/v1/flightstatuscenter";
        public static final String FETCH_FLIGHT_STATUS_V2 = "vb/v1/flightstatus";
        public static final String GET_INFORMATION_PLANE = "vb/v1/GetInformationPlane";
        public static final URL INSTANCE = new URL();

        private URL() {
        }
    }

    static /* synthetic */ Object fetchFlightStatus$default(FlightStatusApiService flightStatusApiService, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFlightStatus");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return flightStatusApiService.fetchFlightStatus(str, str2, str3, str4, str5, continuation);
    }

    @GET(URL.FETCH_FLIGHT_STATUS_V2)
    Object fetchFlightStatus(@Query("date") String str, @Query("flight") String str2, @Query("origin") String str3, @Query("destination") String str4, @Query("lang") String str5, Continuation<? super Response<FetchFlightStatusResponse>> continuation);

    @GET(URL.GET_INFORMATION_PLANE)
    Object getInformationPlane(@Query("date") String str, @Query("tail") String str2, Continuation<? super Response<GetInformationPlaneResponse>> continuation);
}
