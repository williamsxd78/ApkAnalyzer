package com.inmobile.uba;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.inmobile.uba.KeypressPayload;
import java.util.EnumSet;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H&J.\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&¨\u0006\u0014"}, d2 = {"Lcom/inmobile/uba/KeyboardEvents;", "", "autofillEvent", "", "pageId", "", "inputId", "", "keyboardTypes", "keyboards", "", "defaultKeyboard", "keypressEvent", FirebaseAnalytics.Param.CHARACTER, "flags", "Ljava/util/EnumSet;", "Lcom/inmobile/uba/KeypressPayload$KeyFlag;", "pasteEvent", "prefilledInputs", "prefilledInputIds", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface KeyboardEvents {
    void autofillEvent(long pageId, String inputId);

    void keyboardTypes(long pageId, List<String> keyboards, String defaultKeyboard);

    void keypressEvent(long pageId, String inputId, String character, EnumSet<KeypressPayload.KeyFlag> flags);

    void pasteEvent(long pageId, String inputId);

    void prefilledInputs(long pageId, List<String> prefilledInputIds);
}
