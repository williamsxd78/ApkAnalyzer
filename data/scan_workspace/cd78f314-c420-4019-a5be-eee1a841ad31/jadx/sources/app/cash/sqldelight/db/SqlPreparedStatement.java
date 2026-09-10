package app.cash.sqldelight.db;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* compiled from: SqlPreparedStatement.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&¨\u0006\u0017"}, d2 = {"Lapp/cash/sqldelight/db/SqlPreparedStatement;", "", "bindBoolean", "", FirebaseAnalytics.Param.INDEX, "", "boolean", "", "(ILjava/lang/Boolean;)V", "bindBytes", "bytes", "", "bindDouble", "double", "", "(ILjava/lang/Double;)V", "bindLong", "long", "", "(ILjava/lang/Long;)V", "bindString", "string", "", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SqlPreparedStatement {
    void bindBoolean(int index, Boolean r2);

    void bindBytes(int index, byte[] bytes);

    void bindDouble(int index, Double r2);

    void bindLong(int index, Long r2);

    void bindString(int index, String string);
}
