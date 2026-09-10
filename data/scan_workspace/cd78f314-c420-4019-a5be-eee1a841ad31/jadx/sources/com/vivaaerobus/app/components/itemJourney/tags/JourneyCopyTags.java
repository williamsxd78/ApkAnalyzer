package com.vivaaerobus.app.components.itemJourney.tags;

import kotlin.Metadata;

/* compiled from: JourneyCopyTags.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/vivaaerobus/app/components/itemJourney/tags/JourneyCopyTags;", "", "<init>", "()V", "GLOBAL_TAG_NEW_FLIGHT", "", "GLOBAL_LABEL_DISRUPTED", "APP_LABEL_DELAYED", "copyTags", "", "getCopyTags", "()[Ljava/lang/String;", "[Ljava/lang/String;", "components_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JourneyCopyTags {
    public static final String APP_LABEL_DELAYED = "APP_LABEL_DELAYED";
    public static final String GLOBAL_LABEL_DISRUPTED = "GLOBAL_LABEL_DISRUPTED";
    public static final String GLOBAL_TAG_NEW_FLIGHT = "GLOBAL_TAG_NEW-FLIGHT";
    public static final JourneyCopyTags INSTANCE = new JourneyCopyTags();
    private static final String[] copyTags = {"GLOBAL_TAG_NEW-FLIGHT", "GLOBAL_LABEL_DISRUPTED", "APP_LABEL_DELAYED"};
    public static final int $stable = 8;

    private JourneyCopyTags() {
    }

    public final String[] getCopyTags() {
        return copyTags;
    }
}
