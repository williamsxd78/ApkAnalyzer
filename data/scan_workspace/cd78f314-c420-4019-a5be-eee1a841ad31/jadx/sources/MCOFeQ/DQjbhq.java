package MCOFeQ;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
public class DQjbhq {

    @Nonnull
    final Context wHuNdZ;

    public DQjbhq(@Nonnull Context context) {
        this.wHuNdZ = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String lWOTZN() {
        return this.wHuNdZ.getPackageName();
    }

    FileOutputStream openFileOutput(@Nonnull String str) throws FileNotFoundException {
        return this.wHuNdZ.openFileOutput(str, 0);
    }
}
