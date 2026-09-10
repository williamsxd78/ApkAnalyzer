package com.vivaaerobus.app.home.presentation.smartHome.model;

import kotlin.Metadata;

/* compiled from: FlightStatusCopyTags.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/home/presentation/smartHome/model/FlightStatusCopyTags;", "", "<init>", "()V", "GLOBAL_TAG_ON_TIME", "", "GLOBAL_TAG_ON_ROUTE", "GLOBAL_TAG_CANCELLED", "APP_LABEL_DELAYED", "APP_LABEL_LANDED", "APP_LABEL_FLIGHT_DIVERTED", "tags", "", "getTags", "()[Ljava/lang/String;", "[Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "home_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlightStatusCopyTags {
    public static final String APP_LABEL_DELAYED = "APP_LABEL_DELAYED";
    public static final String APP_LABEL_FLIGHT_DIVERTED = "APP_LABEL_FLIGHT-DIVERTED";
    public static final String APP_LABEL_LANDED = "APP_LABEL_LANDED";
    public static final String GLOBAL_TAG_CANCELLED = "GLOBAL_TAG_CANCELLED";
    public static final String GLOBAL_TAG_ON_ROUTE = "GLOBAL_TAG_ON-ROUTE";
    public static final String GLOBAL_TAG_ON_TIME = "GLOBAL_TAG_ON-TIME";
    public static final FlightStatusCopyTags INSTANCE = new FlightStatusCopyTags();
    private static final String[] tags = {"GLOBAL_TAG_ON-TIME", "GLOBAL_TAG_ON-ROUTE", "GLOBAL_TAG_CANCELLED", "APP_LABEL_DELAYED", "APP_LABEL_LANDED", "APP_LABEL_FLIGHT-DIVERTED"};
    public static final int $stable = 8;

    private FlightStatusCopyTags() {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightStatusCopyTags)) {
            return false;
        }
        return true;
    }

    public final String[] getTags() {
        return tags;
    }

    public int hashCode() {
        return -516335001;
    }

    public String toString() {
        return "FlightStatusCopyTags";
    }
}
