package com.vivaaerobus.app.contentful.presentation.constants;

import kotlin.Metadata;

/* compiled from: GenderCopyTags.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/vivaaerobus/app/contentful/presentation/constants/GenderCopyTags;", "", "<init>", "()V", "GLOBAL_LABEL_GENDER_FEMALE", "", "GLOBAL_LABEL_GENDER_MALE", "GLOBAL_LABEL_GENDER_XX", "copyTags", "", "getCopyTags", "()[Ljava/lang/String;", "[Ljava/lang/String;", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GenderCopyTags {
    public static final String GLOBAL_LABEL_GENDER_FEMALE = "GLOBAL_LABEL_GENDER_FEMALE";
    public static final String GLOBAL_LABEL_GENDER_MALE = "GLOBAL_LABEL_GENDER_MALE";
    public static final String GLOBAL_LABEL_GENDER_XX = "GLOBAL_LABEL_GENDER_XX";
    public static final GenderCopyTags INSTANCE = new GenderCopyTags();
    private static final String[] copyTags = {"GLOBAL_LABEL_GENDER_FEMALE", "GLOBAL_LABEL_GENDER_MALE", "GLOBAL_LABEL_GENDER_XX"};

    private GenderCopyTags() {
    }

    public final String[] getCopyTags() {
        return copyTags;
    }
}
