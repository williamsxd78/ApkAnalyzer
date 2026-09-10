package com.tealium.core.persistence;

import android.provider.BaseColumns;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tealium/core/persistence/i0;", "", "<init>", "()V", "a", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class i0 {
    public static final i0 a = new i0();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/tealium/core/persistence/i0$a;", "Landroid/provider/BaseColumns;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "COLUMN_KEY", OperatorName.CURVE_TO, "COLUMN_VALUE", "d", "COLUMN_EXPIRY", "e", "COLUMN_TIMESTAMP", "f", "COLUMN_TYPE", "<init>", "()V", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a implements BaseColumns {
        public static final a a = new a();

        /* renamed from: b, reason: from kotlin metadata */
        public static final String COLUMN_KEY = "key";

        /* renamed from: c, reason: from kotlin metadata */
        public static final String COLUMN_VALUE = "value";

        /* renamed from: d, reason: from kotlin metadata */
        public static final String COLUMN_EXPIRY = "expiry";

        /* renamed from: e, reason: from kotlin metadata */
        public static final String COLUMN_TIMESTAMP = "timestamp";

        /* renamed from: f, reason: from kotlin metadata */
        public static final String COLUMN_TYPE = "type";

        private a() {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/tealium/core/persistence/i0$b;", "", "", "tableName", "a", "<init>", "()V", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        public static final b a = new b();

        private b() {
        }

        public final String a(String tableName) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return "CREATE TABLE IF NOT EXISTS " + tableName + " (key TEXT PRIMARY KEY,value TEXT,expiry LONG, timestamp LONG, type SMALLINT)";
        }
    }

    private i0() {
    }
}
