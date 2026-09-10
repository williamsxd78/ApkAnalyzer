package wHQzUD;

import java.net.InetAddress;
import java.net.UnknownHostException;
import wHQzUD.LcDBfR;

/* loaded from: classes10.dex */
public class FuiXQ implements Runnable {
    private static String KmzNXU;
    private String GRbXEx;

    static {
        LcDBfR.dIf = 6784;
        LcDBfR.dwn = 4146;
        KmzNXU = LcDBfR.MGbMwZ(FuiXQ.class);
    }

    public FuiXQ(String str) {
        this.GRbXEx = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            LcDBfR.GVinle.TjAjed(KmzNXU, LcDBfR.RvP("jR_Bm@cl\"ENm\u0005nmlalh"));
            InetAddress byName = InetAddress.getByName(this.GRbXEx);
            LcDBfR.GVinle.RzQaKl(KmzNXU, LcDBfR.RvP("}hm\u0010xMiygrs\u001e") + byName + LcDBfR.RvP("\u0019JQ_r\\}+anmNIgvfn"));
        } catch (UnknownHostException unused) {
            LcDBfR.GVinle.TjAjed(KmzNXU, LcDBfR.RvP("\u007fGW\\|M-OLR RJmivz"));
        }
    }
}
