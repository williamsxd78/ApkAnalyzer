package com.vivaaerobus.app.database.typeConverters;

import java.util.Date;
import kotlin.Metadata;

/* compiled from: DateConverter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vivaaerobus/app/database/typeConverters/DateConverter;", "", "<init>", "()V", "toDateType", "Ljava/util/Date;", "value", "", "(Ljava/lang/Long;)Ljava/util/Date;", "toPrimitiveType", "(Ljava/util/Date;)Ljava/lang/Long;", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DateConverter {
    public final Date toDateType(Long value) {
        if (value != null) {
            return new Date(value.longValue());
        }
        return null;
    }

    public final Long toPrimitiveType(Date value) {
        if (value != null) {
            return Long.valueOf(value.getTime());
        }
        return null;
    }
}
