package MCOFeQ;

import android.hardware.SensorManager;
import com.lexisnexisrisk.threatmetrix.rl.SensorTracker;
import java.util.Map;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
public class BLVJma extends SensorTracker {
    public static char[] RRY = null;
    public static int dVC = 8969;
    public static int dwn = 4146;
    static String jtQQjW = RvP("xOL\u0010I[hxqtr[");

    /* JADX INFO: Access modifiers changed from: package-private */
    public BLVJma(@Nonnull SensorManager sensorManager) {
        super(sensorManager, 6, RvP("xOL\u0010I[hxqtr["));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x008b, code lost:
    
        MCOFeQ.BLVJma.dVC = (MCOFeQ.BLVJma.dVC % 72) >> 106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005a, code lost:
    
        if ((MCOFeQ.BLVJma.dVC ^ 8969) != 0) goto L93;
     */
    /* JADX WARN: Incorrect return type in method signature: ()V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String RvP(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MCOFeQ.BLVJma.RvP(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.lexisnexisrisk.threatmetrix.rl.SensorTracker
    public void MDHmjX(@Nonnull Map<String, String> map) {
        int i;
        String RvP = RvP("XGNQ");
        String RvP2 = RvP("XGNF");
        if (dwn > 4145) {
            addStandardStatistics(RvP, RvP2, RvP("XGNC"), RvP("XGN["), map);
            return;
        }
        do {
            i = dwn;
        } while (i + 13 != 73);
        do {
            dwn = ((dwn * 43) + i) ^ 3759;
        } while (dVC > 8968);
        while (true) {
            int i2 = dVC;
            int i3 = i2 + 39;
            if (i3 == 20) {
                dVC = (i2 ^ 2074) * 122;
            } else if (i3 == 76) {
                break;
            }
        }
        while (true) {
            dVC *= 3920;
        }
    }
}
