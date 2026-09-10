package com.inmobile.sse.logging;

import com.braze.Constants;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J/\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J/\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J7\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u0010JA\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\u0012J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u0013\u001a\u00020\u0003H&J/\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J/\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J/\u0010\u0016\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&¢\u0006\u0002\u0010\bJ\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u0017"}, d2 = {"Lcom/inmobile/sse/logging/IJournal;", "", "d", "", "message", "", StepData.ARGS, "", "(Ljava/lang/String;[Ljava/lang/Object;)V", Constants.BRAZE_PUSH_TITLE_KEY, "", "e", "i", "log", "priority", "", "(ILjava/lang/String;[Ljava/lang/Object;)V", "tag", "(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "trace", "v", OperatorName.SET_LINE_WIDTH, "wtf", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface IJournal {
    void d(String message, Object... args);

    void d(Throwable t);

    void e(String message, Object... args);

    void e(Throwable t);

    void i(String message, Object... args);

    void i(Throwable t);

    void log(int priority, String tag, String message, Object... args);

    void log(int priority, String message, Object... args);

    void log(int priority, Throwable t);

    void trace();

    void v(String message, Object... args);

    void v(Throwable t);

    void w(String message, Object... args);

    void w(Throwable t);

    void wtf(String message, Object... args);

    void wtf(Throwable t);
}
