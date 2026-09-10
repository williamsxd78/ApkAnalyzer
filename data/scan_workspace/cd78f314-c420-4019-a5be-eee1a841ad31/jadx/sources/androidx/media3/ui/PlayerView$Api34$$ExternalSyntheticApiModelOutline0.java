package androidx.media3.ui;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.GetAdSelectionDataOutcome;
import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.adselection.PersistAdSelectionResultRequest;
import android.adservices.adselection.ReportEventRequest;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.adselection.UpdateAdCounterHistogramRequest;
import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import android.adservices.common.AdData;
import android.adservices.common.AdFilters;
import android.adservices.common.AdTechIdentifier;
import android.adservices.common.FrequencyCapFilters;
import android.adservices.common.KeyedFrequencyCap;
import android.adservices.customaudience.CustomAudienceManager;
import android.window.SurfaceSyncGroup;
import java.time.Duration;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class PlayerView$Api34$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ AdId m(Object obj) {
        return (AdId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdIdManager m9616m(Object obj) {
        return (AdIdManager) obj;
    }

    public static /* synthetic */ AdSelectionConfig.Builder m() {
        return new AdSelectionConfig.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ AdSelectionFromOutcomesConfig.Builder m9617m() {
        return new AdSelectionFromOutcomesConfig.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdSelectionManager m9619m(Object obj) {
        return (AdSelectionManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdSelectionOutcome m9620m(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ GetAdSelectionDataOutcome m9621m(Object obj) {
        return (GetAdSelectionDataOutcome) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetAdSelectionDataRequest.Builder m9622m() {
        return new GetAdSelectionDataRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ PersistAdSelectionResultRequest.Builder m9623m() {
        return new PersistAdSelectionResultRequest.Builder();
    }

    public static /* synthetic */ ReportEventRequest.Builder m(long j, String str, String str2, int i) {
        return new ReportEventRequest.Builder(j, str, str2, i);
    }

    public static /* synthetic */ ReportImpressionRequest m(long j) {
        return new ReportImpressionRequest(j);
    }

    public static /* synthetic */ ReportImpressionRequest m(long j, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j, adSelectionConfig);
    }

    public static /* synthetic */ UpdateAdCounterHistogramRequest.Builder m(long j, int i, AdTechIdentifier adTechIdentifier) {
        return new UpdateAdCounterHistogramRequest.Builder(j, i, adTechIdentifier);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AppSetId m9624m(Object obj) {
        return (AppSetId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AppSetIdManager m9626m(Object obj) {
        return (AppSetIdManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ AdData.Builder m9627m() {
        return new AdData.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ AdFilters.Builder m9628m() {
        return new AdFilters.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ FrequencyCapFilters.Builder m9630m() {
        return new FrequencyCapFilters.Builder();
    }

    public static /* synthetic */ KeyedFrequencyCap.Builder m(int i, int i2, Duration duration) {
        return new KeyedFrequencyCap.Builder(i, i2, duration);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CustomAudienceManager m9632m(Object obj) {
        return (CustomAudienceManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ SurfaceSyncGroup m9634m(String str) {
        return new SurfaceSyncGroup(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m9635m() {
        return AdIdManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m9637m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return AdSelectionManager.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m9640m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return AppSetIdManager.class;
    }

    /* renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m9641m$2() {
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return CustomAudienceManager.class;
    }

    /* renamed from: m$3, reason: collision with other method in class */
    public static /* synthetic */ void m9642m$3() {
    }
}
