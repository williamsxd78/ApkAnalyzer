package androidx.work.impl.utils;

import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.adservices.signals.UpdateSignalsRequest;
import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.app.ApplicationExitInfo;
import android.net.Uri;
import android.view.WindowMetrics;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class NetworkRequest30$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ CustomAudience.Builder m() {
        return new CustomAudience.Builder();
    }

    public static /* synthetic */ FetchAndJoinCustomAudienceRequest.Builder m(Uri uri) {
        return new FetchAndJoinCustomAudienceRequest.Builder(uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ JoinCustomAudienceRequest.Builder m9919m() {
        return new JoinCustomAudienceRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ LeaveCustomAudienceRequest.Builder m9920m() {
        return new LeaveCustomAudienceRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ TrustedBiddingData.Builder m9921m() {
        return new TrustedBiddingData.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ DeletionRequest.Builder m9922m() {
        return new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager m(Object obj) {
        return (MeasurementManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WebSourceParams.Builder m9923m(Uri uri) {
        return new WebSourceParams.Builder(uri);
    }

    public static /* synthetic */ WebSourceRegistrationRequest.Builder m(List list, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(list, uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WebTriggerParams.Builder m9924m(Uri uri) {
        return new WebTriggerParams.Builder(uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WebTriggerRegistrationRequest.Builder m9925m(List list, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(list, uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ UpdateSignalsRequest.Builder m9927m(Uri uri) {
        return new UpdateSignalsRequest.Builder(uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ EncryptedTopic m9928m(Object obj) {
        return (EncryptedTopic) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetTopicsRequest.Builder m9929m() {
        return new GetTopicsRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ GetTopicsResponse m9930m(Object obj) {
        return (GetTopicsResponse) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Topic m9931m(Object obj) {
        return (Topic) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TopicsManager m9933m(Object obj) {
        return (TopicsManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m9934m(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m9935m() {
        return MeasurementManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m9936m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return TopicsManager.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m9939m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return WindowMetrics.class;
    }

    /* renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m9940m$2() {
    }

    public static /* synthetic */ void m$3() {
    }

    public static /* synthetic */ void m$4() {
    }

    public static /* synthetic */ void m$5() {
    }
}
