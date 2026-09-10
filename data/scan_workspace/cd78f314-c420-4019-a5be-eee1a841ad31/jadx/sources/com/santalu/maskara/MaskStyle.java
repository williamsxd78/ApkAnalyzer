package com.santalu.maskara;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MaskStyle.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/santalu/maskara/MaskStyle;", "", "(Ljava/lang/String;I)V", "NORMAL", "COMPLETABLE", "PERSISTENT", "Companion", "library_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes3.dex */
public enum MaskStyle {
    NORMAL,
    COMPLETABLE,
    PERSISTENT;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: MaskStyle.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/santalu/maskara/MaskStyle$Companion;", "", "()V", "valueOf", "Lcom/santalu/maskara/MaskStyle;", "ordinal", "", "library_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MaskStyle valueOf(int ordinal) {
            MaskStyle maskStyle;
            MaskStyle[] values = MaskStyle.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    maskStyle = null;
                    break;
                }
                maskStyle = values[i];
                if (maskStyle.ordinal() == ordinal) {
                    break;
                }
                i++;
            }
            return maskStyle != null ? maskStyle : MaskStyle.NORMAL;
        }
    }
}
