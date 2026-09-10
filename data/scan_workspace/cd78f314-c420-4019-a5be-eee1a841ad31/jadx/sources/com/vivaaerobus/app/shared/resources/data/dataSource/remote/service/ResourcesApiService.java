package com.vivaaerobus.app.shared.resources.data.dataSource.remote.service;

import com.vivaaerobus.app.GetStationsQuery;
import com.vivaaerobus.app.shared.resources.data.dataSource.remote.model.GetCountriesResponse;
import com.vivaaerobus.app.shared.resources.data.dataSource.remote.model.GetCurrenciesResponse;
import com.vivaaerobus.app.shared.resources.data.dataSource.remote.model.GetProvincesHttpResponse;
import com.vivaaerobus.app.shared.resources.data.dataSource.remote.model.GetStationsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: ResourcesApiService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0013J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0012¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/shared/resources/data/dataSource/remote/service/ResourcesApiService;", "", "getCountries", "Lretrofit2/Response;", "Lcom/vivaaerobus/app/shared/resources/data/dataSource/remote/model/GetCountriesResponse;", "languageTag", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrencies", "Lcom/vivaaerobus/app/shared/resources/data/dataSource/remote/model/GetCurrenciesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", GetStationsQuery.OPERATION_NAME, "Lcom/vivaaerobus/app/shared/resources/data/dataSource/remote/model/GetStationsResponse;", "stationType", "getProvinces", "Lcom/vivaaerobus/app/shared/resources/data/dataSource/remote/model/GetProvincesHttpResponse;", "language", "code", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "URL", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ResourcesApiService {

    /* compiled from: ResourcesApiService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vivaaerobus/app/shared/resources/data/dataSource/remote/service/ResourcesApiService$URL;", "", "<init>", "()V", "GET_COUNTRIES", "", "GET_CURRENCIES", "GET_STATIONS", "GET_PROVINCES", "resources_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class URL {
        public static final String GET_COUNTRIES = "v1/resources/countries";
        public static final String GET_CURRENCIES = "v1/resources/currencies";
        public static final String GET_PROVINCES = "v1/resources/provinces";
        public static final String GET_STATIONS = "vb/v1/resources/stations";
        public static final URL INSTANCE = new URL();

        private URL() {
        }
    }

    @GET(URL.GET_COUNTRIES)
    Object getCountries(@Query("Language") String str, Continuation<? super Response<GetCountriesResponse>> continuation);

    @GET(URL.GET_CURRENCIES)
    Object getCurrencies(Continuation<? super Response<GetCurrenciesResponse>> continuation);

    @GET(URL.GET_PROVINCES)
    Object getProvinces(@Query("Language") String str, @Query("CountryCode") String str2, Continuation<? super Response<GetProvincesHttpResponse>> continuation);

    @GET(URL.GET_STATIONS)
    Object getStations(@Query("StationTypes") String str, Continuation<? super Response<GetStationsResponse>> continuation);
}
