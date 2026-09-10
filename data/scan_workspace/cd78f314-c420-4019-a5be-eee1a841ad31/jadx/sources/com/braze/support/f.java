package com.braze.support;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
public final class f implements Function0 {
    public final /* synthetic */ String a;

    public f(String str) {
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to parse JSON list: '" + this.a + OperatorName.SHOW_TEXT_LINE;
    }
}
