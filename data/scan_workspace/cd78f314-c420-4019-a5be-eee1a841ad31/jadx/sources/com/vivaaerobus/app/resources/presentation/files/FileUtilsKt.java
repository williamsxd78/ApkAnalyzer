package com.vivaaerobus.app.resources.presentation.files;

import java.io.File;
import kotlin.Metadata;

/* compiled from: FileUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"deleteFileFromInternalPath", "", "", "resources_productionRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FileUtilsKt {
    public static final void deleteFileFromInternalPath(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
