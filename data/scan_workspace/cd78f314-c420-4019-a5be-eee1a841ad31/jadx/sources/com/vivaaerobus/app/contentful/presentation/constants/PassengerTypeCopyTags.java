package com.vivaaerobus.app.contentful.presentation.constants;

import kotlin.Metadata;

/* compiled from: PassengerTypeCopyTags.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vivaaerobus/app/contentful/presentation/constants/PassengerTypeCopyTags;", "", "<init>", "()V", "GLOBAL_LABEL_ADULT", "", "GLOBAL_LABEL_PASSENGER_CHILD", "GLOBAL_LABEL_PASSENGER_BABY", "VAR_PASSENGER_NUMBER", "VAR_CHILD_NUMBER", "VAR_BABY_NUMBER", "tags", "", "getTags", "()[Ljava/lang/String;", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PassengerTypeCopyTags {
    public static final String GLOBAL_LABEL_ADULT = "GLOBAL_LABEL_ADULT";
    public static final String GLOBAL_LABEL_PASSENGER_BABY = "GLOBAL_LABEL_PASSENGER-BABY";
    public static final String GLOBAL_LABEL_PASSENGER_CHILD = "GLOBAL_LABEL_PASSENGER-CHILD";
    public static final PassengerTypeCopyTags INSTANCE = new PassengerTypeCopyTags();
    public static final String VAR_BABY_NUMBER = "%%baby number%%";
    public static final String VAR_CHILD_NUMBER = "%%child number%%";
    public static final String VAR_PASSENGER_NUMBER = "%%passenger number%%";

    private PassengerTypeCopyTags() {
    }

    public final String[] getTags() {
        return new String[]{"GLOBAL_LABEL_ADULT", "GLOBAL_LABEL_PASSENGER-CHILD", "GLOBAL_LABEL_PASSENGER-BABY"};
    }
}
