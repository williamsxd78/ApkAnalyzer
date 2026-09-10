package com.vivaaerobus.app.database.dao;

import com.vivaaerobus.app.database.entities.MediaEntity;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MediaEntityDao.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH'¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/database/dao/MediaEntityDao;", "", "insert", "", "entity", "Lcom/vivaaerobus/app/database/entities/MediaEntity;", "getByTags", "", "listOfTags", "", "", "([Ljava/lang/String;)Ljava/util/List;", "database_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MediaEntityDao {
    List<MediaEntity> getByTags(String... listOfTags);

    void insert(MediaEntity entity);
}
