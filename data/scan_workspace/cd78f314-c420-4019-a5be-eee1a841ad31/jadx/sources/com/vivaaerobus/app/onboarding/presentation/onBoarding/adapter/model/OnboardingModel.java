package com.vivaaerobus.app.onboarding.presentation.onBoarding.adapter.model;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/onboarding/presentation/onBoarding/adapter/model/OnboardingModel;", "", "rawResource", "", "title", "", "subtitle", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getRawResource", "()I", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "toString", "onBoarding_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OnboardingModel {
    public static final int $stable = 0;
    private final int rawResource;
    private final String subtitle;
    private final String title;

    public OnboardingModel(int i, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.rawResource = i;
        this.title = title;
        this.subtitle = subtitle;
    }

    public static /* synthetic */ OnboardingModel copy$default(OnboardingModel onboardingModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = onboardingModel.rawResource;
        }
        if ((i2 & 2) != 0) {
            str = onboardingModel.title;
        }
        if ((i2 & 4) != 0) {
            str2 = onboardingModel.subtitle;
        }
        return onboardingModel.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRawResource() {
        return this.rawResource;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final OnboardingModel copy(int rawResource, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new OnboardingModel(rawResource, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingModel)) {
            return false;
        }
        OnboardingModel onboardingModel = (OnboardingModel) other;
        return this.rawResource == onboardingModel.rawResource && Intrinsics.areEqual(this.title, onboardingModel.title) && Intrinsics.areEqual(this.subtitle, onboardingModel.subtitle);
    }

    public final int getRawResource() {
        return this.rawResource;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.rawResource) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode();
    }

    public String toString() {
        return "OnboardingModel(rawResource=" + this.rawResource + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }
}
