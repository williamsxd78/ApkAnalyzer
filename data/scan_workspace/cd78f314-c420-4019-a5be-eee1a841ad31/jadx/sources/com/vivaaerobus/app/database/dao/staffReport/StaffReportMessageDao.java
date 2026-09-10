package com.vivaaerobus.app.database.dao.staffReport;

import com.vivaaerobus.app.database.entities.staffReport.StaffReportMessageEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: StaffReportMessageDao.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/database/dao/staffReport/StaffReportMessageDao;", "", "insert", "", "messages", "", "Lcom/vivaaerobus/app/database/entities/staffReport/StaffReportMessageEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAll", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StaffReportMessageDao {
    Object clearAll(Continuation<? super Unit> continuation);

    Object getAll(Continuation<? super List<StaffReportMessageEntity>> continuation);

    Object insert(List<StaffReportMessageEntity> list, Continuation<? super Unit> continuation);
}
